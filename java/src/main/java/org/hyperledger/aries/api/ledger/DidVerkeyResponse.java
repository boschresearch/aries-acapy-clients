/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class DidVerkeyResponse {
    private String verkey;
}
