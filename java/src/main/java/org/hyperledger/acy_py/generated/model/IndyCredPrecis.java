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
import java.util.ArrayList;
import java.util.List;
import org.hyperledger.acy_py.generated.model.IndyCredInfo;
import org.hyperledger.acy_py.generated.model.IndyProofReqNonRevoked;

/**
* IndyCredPrecis
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class IndyCredPrecis {
        public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
        @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
        private String credDefId;
        public static final String SERIALIZED_NAME_CRED_INFO = "cred_info";
        @SerializedName(SERIALIZED_NAME_CRED_INFO)
        private IndyCredInfo credInfo;
        public static final String SERIALIZED_NAME_CRED_REV = "cred_rev";
        @SerializedName(SERIALIZED_NAME_CRED_REV)
        private String credRev;
        public static final String SERIALIZED_NAME_INTERVAL = "interval";
        @SerializedName(SERIALIZED_NAME_INTERVAL)
        private IndyProofReqNonRevoked interval;
        public static final String SERIALIZED_NAME_PRESENTATION_REFERENTS = "presentation_referents";
        @SerializedName(SERIALIZED_NAME_PRESENTATION_REFERENTS)
        private List<String> presentationReferents = null;
        public static final String SERIALIZED_NAME_REV_REG_ID = "rev_reg_id";
        @SerializedName(SERIALIZED_NAME_REV_REG_ID)
        private String revRegId;
        public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
        @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
        private String schemaId;
}
