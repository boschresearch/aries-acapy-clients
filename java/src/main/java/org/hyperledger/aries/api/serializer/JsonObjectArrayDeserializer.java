/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonObjectArrayDeserializer  extends JsonDeserializer<List<JsonObject>> {
    @Override
    public List<JsonObject> deserialize(JsonParser p, DeserializationContext context) throws IOException {
        List<JsonObject> result = new ArrayList<>();
        JsonNode node = p.getCodec().readTree(p);
        String json = node.toString();
        JsonArray array = com.google.gson.JsonParser.parseString(json).getAsJsonArray();
        array.forEach(je -> result.add(je.getAsJsonObject()));
        return result;
    }
}
