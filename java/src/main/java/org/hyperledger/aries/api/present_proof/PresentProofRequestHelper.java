/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.present_proof;

import lombok.NonNull;
import org.hyperledger.aries.pojo.PojoProcessor;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Helper class that provides some convenience methods to build a {@link PresentProofRequest}
 * For more complex usecases use the builder methods directly in the class.
 */
public class PresentProofRequestHelper {

    /**
     * Appends the restrictions for each field in the attribute list
     *
     * <pre>{@code
     * "name":"proof_req_2",
     * "version":"0.1",
     * "requested_attributes": {
     *     "attr1_referent": {
     *         "name":"attr1",
     *         "restrictions": [
     *         {
     *             "schema_id": "123:2:mySchema:1.0"
     *         }, {}]
     *     },
     *     "attr2_referent": {
     *         "name":"attr2",
     *         "restrictions": [
     *         {
     *             "schema_id": "123:2:mySchema:1.0"
     *         }, {}]
     *     }
     * }
     * "requested_predicates": {}
     * }</pre>
     * @param connectionId The connection id
     * @param attributes List of schema attributes
     * @param restrictions list of {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @return {@link PresentProofRequest}
     */
    public static PresentProofRequest buildForEachAttribute(
            String connectionId,
            @NonNull List<String> attributes,
            @NonNull List<PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions> restrictions) {

        Map<String, PresentProofRequest.ProofRequest.ProofAttributes> attr = new LinkedHashMap<>();
        attributes.forEach(name -> attr.put(name + "_referent",
                PresentProofRequest.ProofRequest.ProofAttributes
                .builder()
                .name(name)
                .restrictions(restrictions.stream().map(PresentProofRequest.ProofRequest.ProofAttributes.
                        ProofRestrictions::toJsonObject).collect(Collectors.toList()))
                .build()));
        return PresentProofRequest
                .builder()
                .proofRequest(PresentProofRequest.ProofRequest
                        .builder()
                        .requestedAttributes(attr)
                        .build())
                .connectionId(connectionId)
                .build();
    }

    /**
     * Appends the restrictions for each attribute within the list
     * @param connectionId The connection id
     * @param attributes List of schema attributes
     * @param restrictions {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @return {@link PresentProofRequest}
     */
    public static PresentProofRequest buildForEachAttribute(
            String connectionId,
            @NonNull List<String> attributes,
            @Nullable PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions restrictions) {
        return buildForEachAttribute(connectionId, attributes, restrictions != null ?  List.of(restrictions) : List.of());
    }

    /**
     * Appends the restrictions for each field of the Pojo class
     * @param connectionId The connection id
     * @param attributes Pojo class that represents the schema and its attributes
     * @param restrictions {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @param <T> Class type
     * @return {@link PresentProofRequest}
     */
    public static <T> PresentProofRequest buildForEachAttribute(
            String connectionId,
            @NonNull Class<T> attributes,
            @Nullable List<PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions> restrictions) {
        return buildForEachAttribute(connectionId, PojoProcessor.fieldNames(attributes),
                restrictions != null ? restrictions : List.of());
    }

    /**
     * Appends the restrictions for each field of the Pojo class
     * @param connectionId The connection id
     * @param attributes Pojo class that represents the schema and its attributes
     * @param restrictions {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @param <T> Class type
     * @return {@link PresentProofRequest}
     */
    public static <T> PresentProofRequest buildForEachAttribute(
            String connectionId,
            @NonNull Class<T> attributes,
            @Nullable PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions restrictions) {
        return buildForEachAttribute(connectionId, PojoProcessor.fieldNames(attributes), restrictions);
    }

    /**
     * Appends the restrictions to the attribute list
     *
     * <pre>{@code
     * "name":"proof_req_2",
     * "version":"0.1",
     * "requested_attributes": {
     *     "attr1_referent": {
     *         "names":["attr1", "attr2"],
     *         "restrictions": [{
     *             "schema_id": "123:2:mySchema:1.0",
     *             "issuer_did": "issuer1"
     *         },
     *         {
     *             "schema_id": "123:2:otherSchema:1.0",
     *             "issuer_did": "issuer2"
     *         }]
     *     }]
     * }
     * "requested_predicates": {}
     * }</pre>
     * @param connectionId The connection id
     * @param attributes List of schema attributes
     * @param restrictions list of {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @return {@link PresentProofRequest}
     */
    public static PresentProofRequest buildForAllAttributes(
            String connectionId,
            @NonNull List<String> attributes,
            @NonNull List<PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions> restrictions) {
        PresentProofRequest.ProofRequest.ProofAttributes attr = PresentProofRequest.ProofRequest.ProofAttributes
                    .builder()
                    .names(attributes)
                    .restrictions(restrictions.size() > 0
                            ? restrictions.stream().map(PresentProofRequest.ProofRequest.ProofAttributes.
                            ProofRestrictions::toJsonObject).collect(Collectors.toList())
                            : List.of(PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions
                            .builder().build().toJsonObject()))
                    .build();
        return PresentProofRequest
                .builder()
                .proofRequest(PresentProofRequest.ProofRequest
                        .builder()
                        .requestedAttributes(Map.of("referent", attr))
                        .build())
                .connectionId(connectionId)
                .build();
    }

    /**
     * Appends the restrictions to the attribute list
     * @param connectionId The connection id
     * @param attributes List of schema attributes
     * @param restrictions list of {@link PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions}
     * @return {@link PresentProofRequest}
     */
    public static <T> PresentProofRequest buildForAllAttributes(
            String connectionId,
            @NonNull Class<T> attributes,
            @NonNull List<PresentProofRequest.ProofRequest.ProofAttributes.ProofRestrictions> restrictions) {
        return buildForAllAttributes(connectionId, PojoProcessor.fieldNames(attributes), restrictions);
    }
}
