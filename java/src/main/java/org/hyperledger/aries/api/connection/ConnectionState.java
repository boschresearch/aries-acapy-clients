/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import com.google.gson.annotations.SerializedName;

public enum ConnectionState {
    @SerializedName("init")
    INIT,

    @SerializedName("invitation")
    INVITATION,

    @SerializedName("request")
    REQUEST,

    @SerializedName("response")
    RESPONSE,

    @SerializedName("active")
    ACTIVE,

    @SerializedName("error")
    ERROR,

    @SerializedName("completed")
    COMPLETED,

    @SerializedName("abandoned")
    ABANDONED,

    @SerializedName("start")
    START
}
