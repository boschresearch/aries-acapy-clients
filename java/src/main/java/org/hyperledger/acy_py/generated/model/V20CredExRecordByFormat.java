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
 * V20CredExRecordByFormat
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredExRecordByFormat {
    public static final String SERIALIZED_NAME_CRED_ISSUE = "cred_issue";
    @SerializedName(SERIALIZED_NAME_CRED_ISSUE)
    private Object credIssue;
    public static final String SERIALIZED_NAME_CRED_OFFER = "cred_offer";
    @SerializedName(SERIALIZED_NAME_CRED_OFFER)
    private Object credOffer;
    public static final String SERIALIZED_NAME_CRED_PROPOSAL = "cred_proposal";
    @SerializedName(SERIALIZED_NAME_CRED_PROPOSAL)
    private Object credProposal;
    public static final String SERIALIZED_NAME_CRED_REQUEST = "cred_request";
    @SerializedName(SERIALIZED_NAME_CRED_REQUEST)
    private Object credRequest;
}
