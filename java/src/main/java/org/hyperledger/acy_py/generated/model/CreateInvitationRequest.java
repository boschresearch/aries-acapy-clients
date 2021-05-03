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

/**
* CreateInvitationRequest
*/

@lombok.Data @lombok.AllArgsConstructor @lombok.NoArgsConstructor @lombok.Builder
public class CreateInvitationRequest {
        public static final String SERIALIZED_NAME_MEDIATION_ID = "mediation_id";
        @SerializedName(SERIALIZED_NAME_MEDIATION_ID)
        private String mediationId;
        public static final String SERIALIZED_NAME_METADATA = "metadata";
        @SerializedName(SERIALIZED_NAME_METADATA)
        private Object metadata;
        public static final String SERIALIZED_NAME_RECIPIENT_KEYS = "recipient_keys";
        @SerializedName(SERIALIZED_NAME_RECIPIENT_KEYS)
        private List<String> recipientKeys = null;
        public static final String SERIALIZED_NAME_ROUTING_KEYS = "routing_keys";
        @SerializedName(SERIALIZED_NAME_ROUTING_KEYS)
        private List<String> routingKeys = null;
        public static final String SERIALIZED_NAME_SERVICE_ENDPOINT = "service_endpoint";
        @SerializedName(SERIALIZED_NAME_SERVICE_ENDPOINT)
        private String serviceEndpoint;
}
