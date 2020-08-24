/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.framework.core;

import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Config<T> {

  private static final Logger LOG = LogManager.getLogger(Config.class);

  private String key;
  private T value;

  public Config(String key, Map<String, Object> parentConfig, T defaultValue, Class<? extends T> clazz) {
    this.key = key;
    this.value = defaultValue;
    if (parentConfig != null) {
      try {
        value = clazz.cast(parentConfig.getOrDefault(key, defaultValue));
      } catch (ClassCastException e) {
        LOG.error("rca.conf contains value in invalid format, trace : {}", e.getMessage());
      }
    }
  }

  public String getKey() {
    return key;
  }

  public T getValue() {
    return value;
  }
}
