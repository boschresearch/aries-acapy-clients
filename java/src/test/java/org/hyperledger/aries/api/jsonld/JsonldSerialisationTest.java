/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.jsonld;

import org.hyperledger.aries.api.jsonld.VerifiableCredential.VerifiableIndyCredential;
import org.hyperledger.aries.config.GsonConfig;
import org.hyperledger.aries.util.FileLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonldSerialisationTest {

    private final FileLoader loader = FileLoader.newLoader();

    @Test
    void testGsonSerialisation() {
        final String json = loader.load("json-ld/verifiableCredentialUnsigned.json");
        final VerifiableIndyCredential vc = GsonConfig.defaultConfig().fromJson(json, VerifiableIndyCredential.class);
        String vcString = GsonConfig.prettyPrinter().toJson(vc);
        assertEquals(json, vcString);
    }

}
