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
import java.util.Map;
import org.hyperledger.acy_py.generated.model.IndyProofReqNonRevoked;

/**
* IndyProofReqAttrSpec
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class IndyProofReqAttrSpec {
        public static final String SERIALIZED_NAME_NAME = "name";
        @SerializedName(SERIALIZED_NAME_NAME)
        private String name;
        public static final String SERIALIZED_NAME_NAMES = "names";
        @SerializedName(SERIALIZED_NAME_NAMES)
        private List<String> names = null;
        public static final String SERIALIZED_NAME_NON_REVOKED = "non_revoked";
        @SerializedName(SERIALIZED_NAME_NON_REVOKED)
        private IndyProofReqNonRevoked nonRevoked;
        public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
        @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
        private List<Map<String, String>> restrictions = null;
}