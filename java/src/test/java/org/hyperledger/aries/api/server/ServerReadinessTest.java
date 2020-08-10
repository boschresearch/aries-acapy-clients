/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.server;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;
import java.util.Optional;

import org.hyperledger.aries.AriesClient;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Test;

class ServerReadinessTest extends IntegrationTestBase {

    @Test
    void testReadinessOk() throws Exception {
        ac.statusWaitUntilReady(Duration.ofSeconds(10));

        final Optional<AdminStatusReadiness> statusReady = ac.statusReady();
        assertTrue(statusReady.isPresent());
        assertTrue(statusReady.get().isReady());
    }

    @Test
    void testReadinessFailure() throws Exception {
        AriesClient broken = new AriesClient("http://localhost:12344");
        assertThrows(AriesException.class, () -> {
            broken.statusWaitUntilReady(Duration.ofMillis(300));
        });
    }

}
