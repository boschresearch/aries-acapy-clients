/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import com.google.gson.annotations.SerializedName;

/**
 * Webhook target dispatch type for this wallet.
 * default - Dispatch only to webhooks associated with this wallet.
 * base - Dispatch only to webhooks associated with the base wallet.
 * both - Dispatch to both webhook targets.
 */
public enum WalletDispatchType {
    @SerializedName("default")
    DEFAULT,
    @SerializedName("both")
    BOTH,
    @SerializedName("base")
    BASE
}
