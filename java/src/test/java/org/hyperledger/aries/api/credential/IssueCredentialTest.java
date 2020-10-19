/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Test;

class IssueCredentialTest extends IntegrationTestBase {

    @Test
    void testIssueCredential() throws Exception {
        CredentialProposalRequest ic = new CredentialProposalRequest();
        assertThrows(AriesException.class, () -> {
            ac.issueCredentialSend(ic);
        });
    }

    @Test
    void testIssueCredentialStore() throws Exception {
        String uuid = UUID.randomUUID().toString();
        try {
            ac.issueCredentialRecordsStore(uuid);
            fail("Expected AriesException to be thrown");
        } catch (AriesException e) {
            assertTrue(e.getMessage().startsWith("Record not found: " + uuid + "."));
        }
    }

}
