/**
 * Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.revocation;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class RevRegCreateResponse {
    private String state;
    private String tailsPublicUri;
    private RevocRegEntry revocRegEntry;
    private String createdAt;
    private RevocRegDef revocRegDef;
    private String issuerDid;
    @SerializedName(value = "cred_def_id", alternate = "credDefId")
    private String credDefId;
    private String tag;
    private String tailsHash;
    private Long maxCredNum;
    private String revocDefType;
    private String tailsLocalPath;
    private String recordId;
    private String updatedAt;
    private String revocRegId;
    private JsonArray pendingPub;

    @Data @NoArgsConstructor
    public static final class RevocRegEntry {
        private String ver;
        private RevocRegEntryValue value;

        @Data @NoArgsConstructor
        public static final class RevocRegEntryValue {
            private String accum;
        }
    }

    @Data @NoArgsConstructor
    public static final class RevocRegDef {
        private String ver;
        private String id;
        @SerializedName(value = "revocDefType", alternate = "revoc_def_type")
        private String revocDefType;
        private String tag;
        @SerializedName(value = "credDefId", alternate = "credential_definition_id")
        private String credDefId;
        private RevocRegDefValue value;

        @Data @NoArgsConstructor
        public static final class RevocRegDefValue {
            @SerializedName(value = "issuanceType", alternate = "issuance_type")
            private String issuanceType;
            @SerializedName(value = "maxCredNum", alternate = "max_cred_num")
            private Long maxCredNum;
            @SerializedName(value = "publicKeys", alternate = "public_keys")
            private JsonObject publicKeys;
            @SerializedName(value = "tailsHash", alternate = "tails_hash")
            private String tailsHash;
            @SerializedName(value = "tailsLocation", alternate = "tails_location")
            private String tailsLocation;
        }
    }

}
