/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public enum ConnectionAcceptance {
    @JsonProperty("auto")
    @SerializedName("auto")
    AUTO,

    @JsonProperty("manual")
    @SerializedName("manual")
    MANUAL
}
