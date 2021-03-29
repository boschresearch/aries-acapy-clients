/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import lombok.extern.slf4j.Slf4j;
import okhttp3.mockwebserver.MockResponse;
import org.hyperledger.aries.MockedTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class MockedPresentProofTest extends MockedTestBase {

    @Test
    void testParsePresentationResponse() {
        String json = loader.load("files/present-proof-request-response.json");
        PresentationExchangeRecord response = gson.fromJson(json, PresentationExchangeRecord.class);
        assertEquals("23243302324860431744596330413752559589", response.getPresentationRequest().getNonce());
    }

    @Test
    void TestGetPresentationExchangeRecords() throws Exception {
        String json = loader.load("files/present-proof-records.json");
        server.enqueue(new MockResponse().setBody(json));

        final Optional<List<PresentationExchangeRecord>> res = ac.presentProofRecords();

        Assertions.assertTrue(res.isPresent());
        assertEquals(2, res.get().size());
        Assertions.assertTrue(res.get().get(1).getConnectionId().startsWith("d6cf95bd"));
    }

    @Test
    void TestGetPresentationExchangeRecord() throws Exception {
        String json = loader.load("files/present-proof-record.json");
        server.enqueue(new MockResponse().setBody(json));

        final Optional<PresentationExchangeRecord> res = ac.presentProofRecord("mock");

        Assertions.assertTrue(res.isPresent());
        Assertions.assertTrue(res.get().getConnectionId().startsWith("00598f57"));
        log.debug(pretty.toJson(res.get()));
    }
}
