/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

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
    Endpoint("endpoint"),
    Profile("profile"),
    LinkedDomains("linked_domains")
    ;

    /**
     * The name of the endpoint how its written to the ledger
     */
    private final String ledgerName;
}
