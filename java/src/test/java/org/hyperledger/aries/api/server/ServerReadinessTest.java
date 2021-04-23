/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.server;

import org.hyperledger.aries.AriesClient;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Optional;

class ServerReadinessTest extends IntegrationTestBase {

    @Test
    void testReadinessOk() throws Exception {
        ac.statusWaitUntilReady(Duration.ofSeconds(10));

        final Optional<AdminStatusReadiness> statusReady = ac.statusReady();
        Assertions.assertTrue(statusReady.isPresent());
        Assertions.assertTrue(statusReady.get().isReady());
    }

    @Test
    void testReadinessFailure() {
        AriesClient broken = AriesClient.builder().url("http://localhost:12344").build();
        Assertions.assertThrows(AriesException.class, () -> broken.statusWaitUntilReady(Duration.ofMillis(300)));
    }

}
