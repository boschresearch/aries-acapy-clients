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

import java.util.UUID;

/**
 * V10CredentialFreeOfferRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V10CredentialFreeOfferRequest {
    public static final String SERIALIZED_NAME_AUTO_ISSUE = "auto_issue";
    @SerializedName(SERIALIZED_NAME_AUTO_ISSUE)
    private Boolean autoIssue;
    public static final String SERIALIZED_NAME_AUTO_REMOVE = "auto_remove";
    @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
    private Boolean autoRemove;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private UUID connectionId;
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_CREDENTIAL_PREVIEW = "credential_preview";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_PREVIEW)
    private CredentialPreview credentialPreview;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
}
