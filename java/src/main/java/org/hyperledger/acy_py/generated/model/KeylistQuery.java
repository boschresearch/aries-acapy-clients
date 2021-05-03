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
import org.hyperledger.acy_py.generated.model.KeylistQueryPaginate;

/**
* KeylistQuery
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class KeylistQuery {
        public static final String SERIALIZED_NAME_AT_ID = "@id";
        @SerializedName(SERIALIZED_NAME_AT_ID)
        private String atId;
        public static final String SERIALIZED_NAME_AT_TYPE = "@type";
        @SerializedName(SERIALIZED_NAME_AT_TYPE)
        private String atType;
        public static final String SERIALIZED_NAME_FILTER = "filter";
        @SerializedName(SERIALIZED_NAME_FILTER)
        private Object filter;
        public static final String SERIALIZED_NAME_PAGINATE = "paginate";
        @SerializedName(SERIALIZED_NAME_PAGINATE)
        private KeylistQueryPaginate paginate;
}
