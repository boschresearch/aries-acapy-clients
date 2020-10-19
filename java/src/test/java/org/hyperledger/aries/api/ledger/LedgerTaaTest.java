/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.ledger;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Test;

class LedgerTaaTest extends IntegrationTestBase {

    @Test
    void testGetTaa() throws Exception {
        assertThrows(AriesException.class, ()-> ac.ledgerTaa());
    }

    @Test
    void testAcceptTaa() throws Exception {
        assertThrows(AriesException.class, ()-> ac.ledgerTaaAccept(new TAAAccept()));
    }

}
