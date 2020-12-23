/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

public enum RevocationRegistryState {
    init,
    generated,
    published,
    staged,
    active,
    full
}
