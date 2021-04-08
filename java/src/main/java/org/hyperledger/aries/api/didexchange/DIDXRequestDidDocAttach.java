/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.didexchange;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @NoArgsConstructor
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

    @Data @NoArgsConstructor
    public static class AttachDecoratorData {
        private String base64;
        private JsonObject json;
        private AttachDecoratorDataJws jws;
        private List<String> links;
        /** SHA256 hash (binhex encoded) of content */
        private String sha256;
    }

    @Data @NoArgsConstructor
    public static class AttachDecoratorDataJws {

        private AttachDecoratorDataJwsHeader header;

        @SerializedName("protected")
        private String _protected;

        private String signature;

        private List<AttachDecoratorDataJwsSignature> signatures;
    }

    @Data @NoArgsConstructor
    public static class AttachDecoratorDataJwsSignature {

        private AttachDecoratorDataJwsHeader header;

        @SerializedName("protected")
        private String _protected;

        private String signature;
    }

    @Data @NoArgsConstructor
    public static class AttachDecoratorDataJwsHeader {
        private String kid;
    }
}
