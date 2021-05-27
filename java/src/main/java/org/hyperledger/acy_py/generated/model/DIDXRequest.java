/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0-pre2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * DIDXRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIDXRequest {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_DID = "did";
    @SerializedName(SERIALIZED_NAME_DID)
    private String did;
    public static final String SERIALIZED_NAME_DID_DOC_TILDE_ATTACH = "did_doc~attach";
    @SerializedName(SERIALIZED_NAME_DID_DOC_TILDE_ATTACH)
    private AttachDecorator didDocTildeAttach;
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;
}
