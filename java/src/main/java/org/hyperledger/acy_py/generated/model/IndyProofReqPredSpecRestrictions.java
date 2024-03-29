/*
 * aca-py api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hyperledger.acy_py.generated.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
* IndyProofReqPredSpecRestrictions
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class IndyProofReqPredSpecRestrictions {
        public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
        @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
        private String credDefId;
        public static final String SERIALIZED_NAME_ISSUER_DID = "issuer_did";
        @SerializedName(SERIALIZED_NAME_ISSUER_DID)
        private String issuerDid;
        public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
        @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
        private String schemaId;
        public static final String SERIALIZED_NAME_SCHEMA_ISSUER_DID = "schema_issuer_did";
        @SerializedName(SERIALIZED_NAME_SCHEMA_ISSUER_DID)
        private String schemaIssuerDid;
        public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
        @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
        private String schemaName;
        public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
        @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
        private String schemaVersion;
}
