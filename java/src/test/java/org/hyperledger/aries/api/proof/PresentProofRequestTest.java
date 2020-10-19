/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions;
import org.hyperledger.aries.config.GsonConfig;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class PresentProofRequestTest extends IntegrationTestBase {

    @Test
    void testProofCreateRequest() throws Exception {
        PresentProofRequestConfig config = PresentProofRequestConfig.builder()
                .connectionId("dummy")
                .appendAttribute(List.of("name", "email"), ProofRestrictions.builder().build())
                .build();
        Optional<PresentationExchangeRecord> resp = ac.presentProofCreateRequest(PresentProofRequest.build(config));
        assertTrue(resp.isPresent());
        assertNotNull(resp.get().getPresentationExchangeId());
        assertEquals(2, resp.get().getPresentationRequest().getRequestedAttributes().size());
    }

    @Test
    void testProofCreateRequestWithRestrictions() throws Exception {
        PresentProofRequestConfig config = PresentProofRequestConfig.builder()
                .appendAttribute("iban", "123", null)
                .appendAttribute("bic", "4321", ProofRestrictions
                        .builder()
                        .schemaId("dummy")
                        .credentialDefinitionId("something")
                        .build())
                .build();
        final PresentProofRequest proofRequest = PresentProofRequest.build(config);
        log.debug("{}", GsonConfig.prettyPrinter().toJson(proofRequest));

        Optional<PresentationExchangeRecord> resp = ac.presentProofCreateRequest(proofRequest);
        assertTrue(resp.isPresent());
        assertEquals(proofRequest.getProofRequest().getRequestedAttributes(),
                resp.get().getPresentationRequest().getRequestedAttributes());
        log.debug("{}", GsonConfig.prettyPrinter().toJson(resp.get()));
    }
}
