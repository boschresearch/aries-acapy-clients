/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * V20Pres
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20Pres {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_FORMATS = "formats";
    @SerializedName(SERIALIZED_NAME_FORMATS)
    private List<V20PresFormat> formats = new ArrayList<>();
    public static final String SERIALIZED_NAME_PRESENTATIONS_TILDE_ATTACH = "presentations~attach";
    @SerializedName(SERIALIZED_NAME_PRESENTATIONS_TILDE_ATTACH)
    private List<AttachDecorator> presentationsTildeAttach = new ArrayList<>();
}
