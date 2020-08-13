/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.schema;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.hyperledger.aries.MockedTestBase;
import org.hyperledger.aries.api.schema.SchemaSendResponse.Schema;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
import okhttp3.mockwebserver.MockResponse;

@Slf4j
class MockedSchemaTest extends MockedTestBase {

    @Test
    void testSendSchema() throws Exception {
        String json = loader.load("files/schemas/schemaSendResults.json");

        server.enqueue(new MockResponse().setBody(json));

        final Optional<SchemaSendResponse> res = ac.schemas(SchemaSendRequest
                .builder()
                .schemaName("prefs")
                .schemaVersion("1.0")
                .attributes(List.of("score"))
                .build());

        assertTrue(res.isPresent());
        assertTrue(res.get().getSchemaId().startsWith("M6Mbe3qx7vB4wpZF4sBRjt"));
        assertTrue(res.get().getSchema().getId().startsWith("M6Mbe3qx7vB4wpZF4sBRjt"));
        log.debug(pretty.toJson(res.get()));
    }

    @Test
    void testGetSchemaById() throws Exception {
        String json = loader.load("files/schemas/schemaGetResults.json");

        server.enqueue(new MockResponse().setBody(json));

        final Optional<Schema> res = ac.schemasGetById("571");

        assertTrue(res.isPresent());
        assertTrue(res.get().getId().startsWith("M6Mbe3qx7vB4wpZF4sBRjt"));
        assertEquals("bank_account", res.get().getName());
        assertEquals(571, res.get().getSeqNo());
        log.debug(pretty.toJson(res.get()));
    }

}
