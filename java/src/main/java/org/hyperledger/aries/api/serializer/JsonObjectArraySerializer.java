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
import java.util.List;

public class JsonObjectArraySerializer extends JsonSerializer<List<JsonObject>> {

    @Override
    public void serialize(List<JsonObject> jo, JsonGenerator gen,
                          SerializerProvider serializerProvider) throws IOException {
        gen.writeStartArray();
        if (jo != null && jo.size() > 0) {
            for(JsonObject o : jo) {
                gen.writeRawValue(o.toString());
            }
        }
        gen.writeEndArray();
    }
}
