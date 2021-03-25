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

package com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.integTests.tests.jvmsizing.validator;

import static org.junit.Assert.assertNotEquals;

import com.amazon.opendistro.elasticsearch.performanceanalyzer.decisionmaker.actions.HeapSizeIncreaseAction;
import com.amazon.opendistro.elasticsearch.performanceanalyzer.rca.persistence.actions.PersistedAction;

public class HeapSizeIncreaseNonBreachingValidator extends HeapSizeIncreaseValidator {

  @Override
  public boolean checkDbObj(Object object) {
    // It could well be the case that no RCA has been triggered so far, and thus no table exists.
    // This is a valid outcome.
    if (object == null) {
      return true;
    }

    PersistedAction persistedAction = (PersistedAction) object;
    return checkPersistedAction(persistedAction);
  }

  @Override
  public boolean checkPersistedAction(PersistedAction persistedAction) {
    assertNotEquals(HeapSizeIncreaseAction.NAME, persistedAction.getActionName());

    return true;
  }
}
