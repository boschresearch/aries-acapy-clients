/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.credential.Credential;
import org.hyperledger.aries.api.exception.AriesException;
import org.hyperledger.aries.config.GsonConfig;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class PresentProofProposalTest extends IntegrationTestBase {

    @Test
    void testBuildPresentationProposal() {
        Credential cred = new Credential();
        cred.setAttrs(Map.of("street", "teststreet"));
        cred.setCredentialDefinitionId("WgWxqztrNooG92RXvxSTWv:3:CL:20:tag");
        cred.setReferent("referent");

        final PresentProofProposal proposal = PresentProofProposalBuilder
                .fromCredential("d0fb05d0-b7bb-4b08-9c82-1199133458c4", cred);
        final String json = GsonConfig.prettyPrinter().toJson(proposal);
        log.debug(json);

        // no credential and no connection, but expecting no parsing errors to happen here.
        AriesException e = assertThrows(AriesException.class, () -> ac.presentProofSendProposal(proposal));
        assertTrue(e.getMessage().startsWith("Record not found: d0fb05d0-b7bb-4b08-9c82-1199133458c4."));
    }
}
