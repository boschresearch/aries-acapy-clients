/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;
import org.hyperledger.aries.api.proof.PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions;
import org.hyperledger.aries.config.GsonConfig;
import org.hyperledger.aries.pojo.PojoProcessor;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data @NoArgsConstructor @AllArgsConstructor @Accessors(chain = true)
public class PresentProofRequestConfig {

    private String connectionId;

    private Map<String, List<JsonObject>> attributes = new LinkedHashMap<>();

    @NoArgsConstructor
    public static final class PresentProofConfigBuilder {

        private String cId;

        private final Map<String, List<JsonObject>> attributes = new LinkedHashMap<>();

        public PresentProofConfigBuilder connectionId(String connectionId) {
            this.cId = connectionId;
            return this;
        }

        /**
         * Build requested attribute names and restrictions from class template.
         * @param <T> The class type
         * @param type Takes the attribute names from the types public field names
         * @param restriction same restriction is applied to all attribute names
         * @return {@link PresentProofConfigBuilder}
         */
        public @Nonnull <T> PresentProofConfigBuilder appendAttribute(
                @NonNull Class<T> type, @NonNull ProofRestrictions restriction) {

            PojoProcessor.fieldNames(type).forEach(name -> attributes.put(name, List.of(restriction.toJsonObject())));
            return this;
        }

        /**
         * Build requested attribute names and restrictions from a list of Strings
         * @param names List of requested attribute names
         * @param resriction same restriction is applied to all attribute names
         * @return {@link PresentProofConfigBuilder}
         */
        public PresentProofConfigBuilder appendAttribute(
                @NonNull List<String> names, @NonNull ProofRestrictions resriction) {

            names.forEach(name -> attributes.put(name, List.of(resriction.toJsonObject())));
            return this;
        }

        /**
         * More fine grained, allows to set multiple restrictions per requested attribute
         * @param name the requested attribute name
         * @param restrictions List of restrictions applied to the requested attribute
         * @return {@link PresentProofConfigBuilder}
         */
        public PresentProofConfigBuilder appendAttribute(
                @NonNull String name, @Nullable List<ProofRestrictions> restrictions) {
            List<JsonObject> ro = new ArrayList<>();
            if (restrictions != null) {
                restrictions.forEach(r -> ro.add(r.toJsonObject()));
            }
            attributes.put(name, ro);
            return this;
        }

        /**
         * Allows to add restrictions based on name:value pairs, adding the {@link ProofRestrictions} adds
         * more parameters like shemaId etc.
         * @param name attribute name
         * @param value attribute value
         * @param restriction {@link ProofRestrictions} additional restrictions
         * @return {@link PresentProofConfigBuilder}
         */
        public PresentProofConfigBuilder appendAttribute(
                @NonNull String name, @NonNull String value, @Nullable ProofRestrictions restriction) {
            ProofRestrictions res = restriction;
            if (res == null) {
                res = new ProofRestrictions();
            }
            final JsonObject jt = GsonConfig.defaultConfig().toJsonTree(res).getAsJsonObject();
            jt.getAsJsonObject().addProperty("attr::" + name + "::value", value);
            attributes.put(name, List.of(jt));
            return this;
        }


        public PresentProofRequestConfig build() {
            return new PresentProofRequestConfig(cId, attributes);
        }
    }

    public static PresentProofConfigBuilder builder() {
        return new PresentProofConfigBuilder();
    }
}
