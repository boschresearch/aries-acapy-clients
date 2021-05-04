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
import org.hyperledger.acy_py.generated.model.AttachDecorator;
import org.hyperledger.acy_py.generated.model.Service;

/**
 * InvitationReceiveRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class InvitationReceiveRequest {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_HANDSHAKE_PROTOCOLS = "handshake_protocols";
    @SerializedName(SERIALIZED_NAME_HANDSHAKE_PROTOCOLS)
    private List<String> handshakeProtocols = null;
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
    public static final String SERIALIZED_NAME_REQUESTS_TILDE_ATTACH = "requests~attach";
    @SerializedName(SERIALIZED_NAME_REQUESTS_TILDE_ATTACH)
    private List<AttachDecorator> requestsTildeAttach = null;
    public static final String SERIALIZED_NAME_SERVICE_BLOCKS = "service_blocks";
    @SerializedName(SERIALIZED_NAME_SERVICE_BLOCKS)
    private List<Service> serviceBlocks = null;
    public static final String SERIALIZED_NAME_SERVICE_DIDS = "service_dids";
    @SerializedName(SERIALIZED_NAME_SERVICE_DIDS)
    private List<String> serviceDids = null;
    public static final String SERIALIZED_NAME_SERVICES = "services";
    @SerializedName(SERIALIZED_NAME_SERVICES)
    private Object services;
}
