/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.IntegrationTestBase;
import org.hyperledger.aries.api.exception.AriesException;
import org.hyperledger.aries.config.GsonConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

@Slf4j
class PresentProofRequestHelperTest extends IntegrationTestBase {

    @Test
    void testBuildForEachAttributeNoRestrictions() throws Exception {
        PresentProofRequest presentProofRequest = PresentProofRequestHelper
                .buildForEachAttribute("dummy", List.of("name", "email"), List.of());

        log.debug("{}", GsonConfig.prettyPrinter().toJson(presentProofRequest));

        Optional<PresentationExchangeRecord> resp = ac.presentProofCreateRequest(presentProofRequest);

        Assertions.assertTrue(resp.isPresent());
        Assertions.assertNotNull(resp.get().getPresentationExchangeId());
        Assertions.assertEquals(2, resp.get().getPresentationRequest().getRequestedAttributes().size());
    }

    @Test
    void testBuildForEachAttributeWithRestrictions() throws Exception {
        PresentProofRequest presentProofRequest = PresentProofRequestHelper
                .buildForEachAttribute("dummy", DummyPojo.class, PresentProofRequest.
                        ProofRequest.ProofAttributes.ProofRestrictions
                        .builder()
                        .issuerDid("did:sov:123")
                        .build());

        log.debug("{}", GsonConfig.prettyPrinter().toJson(presentProofRequest));

        Optional<PresentationExchangeRecord> resp = ac.presentProofCreateRequest(presentProofRequest);
        Assertions.assertTrue(resp.isPresent());
        Assertions.assertEquals(presentProofRequest.getProofRequest().getRequestedAttributes(),
                resp.get().getPresentationRequest().getRequestedAttributes());
        log.debug("{}", GsonConfig.prettyPrinter().toJson(resp.get()));
    }

    @Test
    void testBuildForAllAttributesNoRestrictions() {
        PresentProofRequest presentProofRequest = PresentProofRequestHelper
                .buildForAllAttributes("dummy", List.of("name", "email"), List.of());
        log.debug("{}", GsonConfig.prettyPrinter().toJson(presentProofRequest));
        Assertions.assertThrows(AriesException.class, () -> ac.presentProofCreateRequest(presentProofRequest));
    }

    @Test
    void testBuildForAllAttributesWithRestrictions() throws Exception {
        PresentProofRequest presentProofRequest = PresentProofRequestHelper
                .buildForAllAttributes("dummy", DummyPojo.class, List.of(PresentProofRequest.
                        ProofRequest.ProofAttributes.ProofRestrictions
                        .builder()
                        .issuerDid("did:sov:123")
                        .build()));

        log.debug("{}", GsonConfig.prettyPrinter().toJson(presentProofRequest));

        Optional<PresentationExchangeRecord> resp = ac.presentProofCreateRequest(presentProofRequest);
        Assertions.assertTrue(resp.isPresent());
        Assertions.assertEquals(presentProofRequest.getProofRequest().getRequestedAttributes(),
                resp.get().getPresentationRequest().getRequestedAttributes());
        log.debug("{}", GsonConfig.prettyPrinter().toJson(resp.get()));
    }

    @Data @NoArgsConstructor
    private static final class DummyPojo {
        private String name;
        private String email;
    }
}
