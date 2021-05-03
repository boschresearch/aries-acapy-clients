/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

/**
 * Webhook target dispatch type for this wallet.
 * default - Dispatch only to webhooks associated with this wallet.
 * base - Dispatch only to webhooks associated with the base wallet.
 * both - Dispatch to both webhook targets.
 */
public enum WalletDispatchType {
    @JsonProperty("default")
    @SerializedName("default")
    DEFAULT,

    @JsonProperty("both")
    @SerializedName("both")
    BOTH,

    @JsonProperty("base")
    @SerializedName("base")
    BASE
}
