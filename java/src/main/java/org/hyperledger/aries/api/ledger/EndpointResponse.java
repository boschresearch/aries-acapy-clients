/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class EndpointResponse {
    public String endpoint;
}
