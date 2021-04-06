/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import com.google.gson.annotations.SerializedName;

public enum CredentialExchangeRole {
    @SerializedName("issuer")
    ISSUER,
    @SerializedName("holder")
    HOLDER
}
