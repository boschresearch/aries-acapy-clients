/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.credential.Credential;
import org.hyperledger.aries.api.exception.AriesException;
import org.hyperledger.aries.config.GsonConfig;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PresentProofProposalTest extends IntegrationTestBase {

    @Test
    void testBuildPresentationProposal() throws Exception {
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
        assertEquals("Record not found: d0fb05d0-b7bb-4b08-9c82-1199133458c4.", e.getMessage());
    }
}
