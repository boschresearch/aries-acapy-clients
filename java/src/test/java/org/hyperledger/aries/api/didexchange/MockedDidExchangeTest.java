/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.didexchange;

import okhttp3.mockwebserver.MockResponse;
import org.hyperledger.aries.MockedTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class MockedDidExchangeTest extends MockedTestBase {

    @Test
    void testCreateRequest() throws Exception {
        String json = loader.load("files/didexchange/didexchange-create-request.json");
        server.enqueue(new MockResponse().setBody(json));

        final Optional<DIDXRequest> c = ac.didExchangeCreateRequest(DidExchangeCreateRequestFilter
                .builder()
                .theirPublicDid("did:iil:123")
                .build());
        Assertions.assertTrue(c.isPresent());
        Assertions.assertEquals("word up", c.get().getLabel());
    }
}
