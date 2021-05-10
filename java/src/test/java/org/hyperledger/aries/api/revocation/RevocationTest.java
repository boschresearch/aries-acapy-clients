/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RevocationTest extends IntegrationTestBase {

    @Test
    void testCreateRevRegFailure() {
        assertThrows(AriesException.class, () -> ac.revocationCreateRegistry(RevRegCreateRequest
                .builder()
                .credentialDefinitionId("VoSfM3eGaPxduty34ySygw:3:CL:571:sparta_bank")
                .build()));
    }

}
