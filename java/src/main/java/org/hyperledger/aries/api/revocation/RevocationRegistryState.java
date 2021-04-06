/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

import com.google.gson.annotations.SerializedName;

public enum RevocationRegistryState {
    @SerializedName("init")
    INIT,

    @SerializedName("generated")
    GENERATED,

    @SerializedName("published")
    PUBLISHED,

    @SerializedName("staged")
    STAGED,

    @SerializedName("active")
    ACTIVE,

    @SerializedName("full")
    FULL
}
