package com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions;

import static com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions.ImpactVector.Dimension.CPU;
import static com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions.ImpactVector.Dimension.HEAP;
import static com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions.ImpactVector.Dimension.NETWORK;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.ThreadPoolEnum;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.store.rca.cluster.NodeKey;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueueCapacity implements Action {

  public static final String NAME = "queue_capacity";
  public static final int COOL_OFF_PERIOD_IN_SECONDS = 300;

  private int currentCapacity;
  private int desiredCapacity;
  private ThreadPoolEnum threadPool;
  private NodeKey esNode;

  private Map<ThreadPoolEnum, Integer> lowerBound = new HashMap<>();
  private Map<ThreadPoolEnum, Integer> upperBound = new HashMap<>();

  public QueueCapacity(NodeKey esNode, ThreadPoolEnum threadPool, int currentCapacity, boolean increase) {
    setBounds();
    int STEP_SIZE = 50;
    this.esNode = esNode;
    this.threadPool = threadPool;
    this.currentCapacity = currentCapacity;
    int desiredCapacity = increase ? currentCapacity + STEP_SIZE : currentCapacity - STEP_SIZE;
    setDesiredCapacity(desiredCapacity);
  }

  @Override
  public String name() {
    return NAME;
  }

  @Override
  public boolean isActionable() {
    return desiredCapacity != currentCapacity;
  }

  @Override
  public int coolOffPeriodInSeconds() {
    return COOL_OFF_PERIOD_IN_SECONDS;
  }

  @Override
  public List<NodeKey> impactedNodes() {
    return Collections.singletonList(esNode);
  }

  @Override
  public Map<NodeKey, ImpactVector> impact() {
    ImpactVector impactVector = new ImpactVector();
    if (desiredCapacity > currentCapacity) {
      impactVector.increasesPressure(HEAP, CPU, NETWORK);
    } else if (desiredCapacity < currentCapacity) {
      impactVector.decreasesPressure(HEAP, CPU, NETWORK);
    }
    return Collections.singletonMap(esNode, impactVector);
  }

  @Override
  public void execute() {
    // Making this a no-op for now
    // TODO: Modify based on downstream agent API calls
    assert true;
  }

  @Override
  public String summary() {
    if (!isActionable()) {
      return "No action to take";
    }
    return String.format("Update [%s] queue capacity from [%d] to [%d] on node [%s]",
        threadPool.toString(), currentCapacity, desiredCapacity, esNode.getNodeId());
  }

  @Override
  public String toString() {
    return summary();
  }

  private void setBounds() {
    // This is intentionally not made static because different nodes can
    // have different bounds based on instance types
    // TODO: Move configuration values to rca.conf

    // Write thread pool for bulk write requests
    this.lowerBound.put(ThreadPoolEnum.WRITE_QUEUE, 100);
    this.upperBound.put(ThreadPoolEnum.WRITE_QUEUE, 1000);

    // Search thread pool
    this.lowerBound.put(ThreadPoolEnum.SEARCH_QUEUE, 1000);
    this.upperBound.put(ThreadPoolEnum.SEARCH_QUEUE, 3000);
  }

  private void setDesiredCapacity(int desiredCapacity) {
    this.desiredCapacity = Math.min(desiredCapacity, upperBound.get(threadPool));
    this.desiredCapacity = Math.max(this.desiredCapacity, lowerBound.get(threadPool));
  }

  public int getCurrentCapacity() {
    return currentCapacity;
  }

  public int getDesiredCapacity() {
    return desiredCapacity;
  }

  public ThreadPoolEnum getThreadPool() {
    return threadPool;
  }
}