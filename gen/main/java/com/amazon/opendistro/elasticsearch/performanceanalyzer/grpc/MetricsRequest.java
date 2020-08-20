// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inter_node_rpc_service.proto

package com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc;

/**
 * <pre>
 *Request Parameters for GetMetrics API
 * </pre>
 *
 * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest}
 */
public  final class MetricsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)
    MetricsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricsRequest.newBuilder() to construct.
  private MetricsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricsRequest() {
    metricList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    aggList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    dimList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetricsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              metricList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            metricList_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              aggList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            aggList_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              dimList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            dimList_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        metricList_ = metricList_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        aggList_ = aggList_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        dimList_ = dimList_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_MetricsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_MetricsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.Builder.class);
  }

  public static final int METRIC_LIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList metricList_;
  /**
   * <code>repeated string metric_list = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getMetricListList() {
    return metricList_;
  }
  /**
   * <code>repeated string metric_list = 1;</code>
   */
  public int getMetricListCount() {
    return metricList_.size();
  }
  /**
   * <code>repeated string metric_list = 1;</code>
   */
  public java.lang.String getMetricList(int index) {
    return metricList_.get(index);
  }
  /**
   * <code>repeated string metric_list = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMetricListBytes(int index) {
    return metricList_.getByteString(index);
  }

  public static final int AGG_LIST_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList aggList_;
  /**
   * <code>repeated string agg_list = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAggListList() {
    return aggList_;
  }
  /**
   * <code>repeated string agg_list = 2;</code>
   */
  public int getAggListCount() {
    return aggList_.size();
  }
  /**
   * <code>repeated string agg_list = 2;</code>
   */
  public java.lang.String getAggList(int index) {
    return aggList_.get(index);
  }
  /**
   * <code>repeated string agg_list = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAggListBytes(int index) {
    return aggList_.getByteString(index);
  }

  public static final int DIM_LIST_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList dimList_;
  /**
   * <code>repeated string dim_list = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getDimListList() {
    return dimList_;
  }
  /**
   * <code>repeated string dim_list = 3;</code>
   */
  public int getDimListCount() {
    return dimList_.size();
  }
  /**
   * <code>repeated string dim_list = 3;</code>
   */
  public java.lang.String getDimList(int index) {
    return dimList_.get(index);
  }
  /**
   * <code>repeated string dim_list = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDimListBytes(int index) {
    return dimList_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < metricList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricList_.getRaw(i));
    }
    for (int i = 0; i < aggList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, aggList_.getRaw(i));
    }
    for (int i = 0; i < dimList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dimList_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < metricList_.size(); i++) {
        dataSize += computeStringSizeNoTag(metricList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMetricListList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < aggList_.size(); i++) {
        dataSize += computeStringSizeNoTag(aggList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAggListList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dimList_.size(); i++) {
        dataSize += computeStringSizeNoTag(dimList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDimListList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)) {
      return super.equals(obj);
    }
    com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest other = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest) obj;

    if (!getMetricListList()
        .equals(other.getMetricListList())) return false;
    if (!getAggListList()
        .equals(other.getAggListList())) return false;
    if (!getDimListList()
        .equals(other.getDimListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMetricListCount() > 0) {
      hash = (37 * hash) + METRIC_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getMetricListList().hashCode();
    }
    if (getAggListCount() > 0) {
      hash = (37 * hash) + AGG_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAggListList().hashCode();
    }
    if (getDimListCount() > 0) {
      hash = (37 * hash) + DIM_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getDimListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *Request Parameters for GetMetrics API
   * </pre>
   *
   * Protobuf type {@code com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_MetricsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_MetricsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.class, com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.Builder.class);
    }

    // Construct using com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      metricList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      aggList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      dimList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.PANetworking.internal_static_com_amazon_opendistro_elasticsearch_performanceanalyzer_grpc_MetricsRequest_descriptor;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest getDefaultInstanceForType() {
      return com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest build() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest buildPartial() {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest result = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        metricList_ = metricList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.metricList_ = metricList_;
      if (((bitField0_ & 0x00000002) != 0)) {
        aggList_ = aggList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.aggList_ = aggList_;
      if (((bitField0_ & 0x00000004) != 0)) {
        dimList_ = dimList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.dimList_ = dimList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest) {
        return mergeFrom((com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest other) {
      if (other == com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest.getDefaultInstance()) return this;
      if (!other.metricList_.isEmpty()) {
        if (metricList_.isEmpty()) {
          metricList_ = other.metricList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMetricListIsMutable();
          metricList_.addAll(other.metricList_);
        }
        onChanged();
      }
      if (!other.aggList_.isEmpty()) {
        if (aggList_.isEmpty()) {
          aggList_ = other.aggList_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureAggListIsMutable();
          aggList_.addAll(other.aggList_);
        }
        onChanged();
      }
      if (!other.dimList_.isEmpty()) {
        if (dimList_.isEmpty()) {
          dimList_ = other.dimList_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureDimListIsMutable();
          dimList_.addAll(other.dimList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList metricList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMetricListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metricList_ = new com.google.protobuf.LazyStringArrayList(metricList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMetricListList() {
      return metricList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public int getMetricListCount() {
      return metricList_.size();
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public java.lang.String getMetricList(int index) {
      return metricList_.get(index);
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMetricListBytes(int index) {
      return metricList_.getByteString(index);
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public Builder setMetricList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetricListIsMutable();
      metricList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public Builder addMetricList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMetricListIsMutable();
      metricList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public Builder addAllMetricList(
        java.lang.Iterable<java.lang.String> values) {
      ensureMetricListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, metricList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public Builder clearMetricList() {
      metricList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string metric_list = 1;</code>
     */
    public Builder addMetricListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMetricListIsMutable();
      metricList_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList aggList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAggListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        aggList_ = new com.google.protobuf.LazyStringArrayList(aggList_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAggListList() {
      return aggList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public int getAggListCount() {
      return aggList_.size();
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public java.lang.String getAggList(int index) {
      return aggList_.get(index);
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAggListBytes(int index) {
      return aggList_.getByteString(index);
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public Builder setAggList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAggListIsMutable();
      aggList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public Builder addAggList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAggListIsMutable();
      aggList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public Builder addAllAggList(
        java.lang.Iterable<java.lang.String> values) {
      ensureAggListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, aggList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public Builder clearAggList() {
      aggList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string agg_list = 2;</code>
     */
    public Builder addAggListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAggListIsMutable();
      aggList_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList dimList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDimListIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        dimList_ = new com.google.protobuf.LazyStringArrayList(dimList_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getDimListList() {
      return dimList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public int getDimListCount() {
      return dimList_.size();
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public java.lang.String getDimList(int index) {
      return dimList_.get(index);
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDimListBytes(int index) {
      return dimList_.getByteString(index);
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public Builder setDimList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDimListIsMutable();
      dimList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public Builder addDimList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDimListIsMutable();
      dimList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public Builder addAllDimList(
        java.lang.Iterable<java.lang.String> values) {
      ensureDimListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dimList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public Builder clearDimList() {
      dimList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string dim_list = 3;</code>
     */
    public Builder addDimListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDimListIsMutable();
      dimList_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest)
  private static final com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest();
  }

  public static com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricsRequest>
      PARSER = new com.google.protobuf.AbstractParser<MetricsRequest>() {
    @java.lang.Override
    public MetricsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetricsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetricsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.amazon.opendistro.elasticsearch.performanceanalyzer.grpc.MetricsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
