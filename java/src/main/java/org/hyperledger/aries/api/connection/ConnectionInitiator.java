/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public enum ConnectionInitiator {
    @JsonProperty("self")
    @SerializedName("self")
    SELF,

    @JsonProperty("external")
    @SerializedName("external")
    EXTERNAL
}
