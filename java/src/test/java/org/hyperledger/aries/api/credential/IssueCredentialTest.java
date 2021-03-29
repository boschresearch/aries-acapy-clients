/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.Assert.*;

class IssueCredentialTest extends IntegrationTestBase {

    @Test
    void testIssueCredential() {
        CredentialProposalRequest ic = new CredentialProposalRequest();
        assertThrows(AriesException.class, () -> ac.issueCredentialSend(ic));
    }

    @Test
    void testIssueCredentialStore() throws Exception {
        String uuid = UUID.randomUUID().toString();
        try {
            ac.issueCredentialRecordsStore(uuid);
            Assertions.fail("Expected AriesException to be thrown");
        } catch (AriesException e) {
            Assertions.assertTrue(e.getMessage().startsWith("Record not found: " + uuid + "."));
        }
    }

}
