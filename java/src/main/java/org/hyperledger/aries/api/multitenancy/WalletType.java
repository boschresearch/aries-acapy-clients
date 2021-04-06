/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import com.google.gson.annotations.SerializedName;

/**
 * Wallet type
 */
public enum WalletType {
    @SerializedName("askar")
    ASKAR,

    @SerializedName("in_memory")
    IN_MEMORY,

    @SerializedName("indy")
    INDY
}
