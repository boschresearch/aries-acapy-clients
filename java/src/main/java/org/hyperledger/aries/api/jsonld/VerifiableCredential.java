/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.jsonld;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.hyperledger.aries.config.CredDefId;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @see <a href="https://www.w3.org/2018/credentials/v1#VerifiableCredential">VerifiableCredential</a>
 */
@Data @SuperBuilder @NoArgsConstructor
@JsonPropertyOrder({ "@context", "type" })
@JsonInclude(Include.NON_NULL)
public class VerifiableCredential {

    @Builder.Default
    @NonNull @Nonnull
    @SerializedName("@context")
    @JsonProperty("@context")
    private List<String> context = List.of("https://www.w3.org/2018/credentials/v1");

    @Nullable
    private String id;

    @Builder.Default
    @NonNull @Nonnull
    private List<String> type = List.of("VerifiableCredential");

    @Nullable
    private String issuer;

    @Nullable
    @SerializedName("issuanceDate")
    private String issuanceDate;

    @Nullable
    @SerializedName("credentialSubject")
    private Object credentialSubject;

    @Nullable
    private Proof proof;

    // Verifiable Indy Credential

    @SuperBuilder @NoArgsConstructor
    @Data @EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
    @JsonInclude(Include.NON_NULL)
    public static class LabeledVerifiableCredential extends VerifiableCredential {
        private String label;
    }

    /**
     * @see <a href="https://raw.githubusercontent.com/iil-network/contexts/master/indycredential.jsonld">VerifiableIndyCredential</a>
     */
    @SuperBuilder @NoArgsConstructor
    @Data @EqualsAndHashCode(callSuper = true) @ToString(callSuper = true)
    @JsonInclude(Include.NON_NULL)
    public static class VerifiableIndyCredential extends LabeledVerifiableCredential {
        @Nullable
        @SerializedName("indyIssuer")
        private String indyIssuer;

        @Nullable
        @SerializedName("schemaId")
        private String schemaId;

        @Nullable
        @SerializedName(CredDefId.CREDDEFID)
        private String credDefId;
    }
}
