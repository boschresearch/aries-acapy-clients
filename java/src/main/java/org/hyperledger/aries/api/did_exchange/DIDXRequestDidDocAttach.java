/*
 * Copyright (c) 2020-2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.did_exchange;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class DIDXRequestDidDocAttach {

    @SerializedName("@id")
    private String id;

    private Integer byteCount;

    private AttachDecoratorData data;

    private String description;

    private String filename;

    private String lastmodTime;

    @SerializedName("mime-type")
    private String mimeType;

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static class AttachDecoratorData {
        private String base64;
        private JsonObject json;
        private AttachDecoratorDataJws jws;
        private List<String> links;
        /** SHA256 hash (binhex encoded) of content */
        private String sha256;
    }

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static class AttachDecoratorDataJws {

        private AttachDecoratorDataJwsHeader header;

        @SerializedName("protected")
        private String _protected;

        private String signature;

        private List<AttachDecoratorDataJwsSignature> signatures;
    }

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static class AttachDecoratorDataJwsSignature {

        private AttachDecoratorDataJwsHeader header;

        @SerializedName("protected")
        private String _protected;

        private String signature;
    }

    @Data @Builder @NoArgsConstructor @AllArgsConstructor
    public static class AttachDecoratorDataJwsHeader {
        private String kid;
    }
}
