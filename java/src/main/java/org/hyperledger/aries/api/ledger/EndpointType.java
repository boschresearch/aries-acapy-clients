/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Endpoint request types
 *
 * @since aca-py 0.5.4
 *
 */
@Getter
@AllArgsConstructor
public enum EndpointType {
    @SerializedName("Endpoint")
    ENDPOINT("endpoint", "Endpoint"),

    @SerializedName("Profile")
    PROFILE("profile", "Profile"),

    @SerializedName("LinkedDomains")
    LINKED_DOMAINS("linked_domains", "LinkedDomains")
    ;

    /**
     * The name of the endpoint how its written to the ledger
     */
    private final String ledgerName;

    /**
     * The name of the endpoint as it is used in aca-py, same as @SerializedName
     */
    private final String acaPyName;
}
