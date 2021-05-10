/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.gson.JsonObject;

import java.io.IOException;

public class JsonObjectSerializer extends JsonSerializer<JsonObject> {

    @Override
    public void serialize(JsonObject jo, JsonGenerator gen,
                          SerializerProvider serializerProvider) throws IOException {
        gen.writeRawValue(jo.toString());
    }
}
