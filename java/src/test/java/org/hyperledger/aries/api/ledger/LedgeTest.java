/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LedgeTest extends IntegrationTestBase {

    @Test
    void testGetTaa() {
        Assertions.assertThrows(AriesException.class, ()-> ac.ledgerTaa());
    }

    @Test
    void testAcceptTaa() {
        Assertions.assertThrows(AriesException.class, ()-> ac.ledgerTaaAccept(new TAAAccept()));
    }

    @Test
    void testDidVerkey() {
        Assertions.assertThrows(AriesException.class, ()-> ac.ledgerDidVerkey("5mwQSWnRePrZ3oF67C4Kqe"));
    }

}
