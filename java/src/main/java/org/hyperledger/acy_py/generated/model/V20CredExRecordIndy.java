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
* V20CredExRecordIndy
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class V20CredExRecordIndy {
        public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
        @SerializedName(SERIALIZED_NAME_CREATED_AT)
        private String createdAt;
        public static final String SERIALIZED_NAME_CRED_EX_ID = "cred_ex_id";
        @SerializedName(SERIALIZED_NAME_CRED_EX_ID)
        private String credExId;
        public static final String SERIALIZED_NAME_CRED_EX_INDY_ID = "cred_ex_indy_id";
        @SerializedName(SERIALIZED_NAME_CRED_EX_INDY_ID)
        private String credExIndyId;
        public static final String SERIALIZED_NAME_CRED_ID_STORED = "cred_id_stored";
        @SerializedName(SERIALIZED_NAME_CRED_ID_STORED)
        private String credIdStored;
        public static final String SERIALIZED_NAME_CRED_REQUEST_METADATA = "cred_request_metadata";
        @SerializedName(SERIALIZED_NAME_CRED_REQUEST_METADATA)
        private Object credRequestMetadata;
        public static final String SERIALIZED_NAME_CRED_REV_ID = "cred_rev_id";
        @SerializedName(SERIALIZED_NAME_CRED_REV_ID)
        private String credRevId;
        public static final String SERIALIZED_NAME_REV_REG_ID = "rev_reg_id";
        @SerializedName(SERIALIZED_NAME_REV_REG_ID)
        private String revRegId;
        public static final String SERIALIZED_NAME_STATE = "state";
        @SerializedName(SERIALIZED_NAME_STATE)
        private String state;
        public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
        @SerializedName(SERIALIZED_NAME_UPDATED_AT)
        private String updatedAt;
}
