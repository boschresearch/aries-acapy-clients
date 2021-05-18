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

/**
 * MenuOption
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class MenuOption {
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    public static final String SERIALIZED_NAME_DISABLED = "disabled";
    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;
    public static final String SERIALIZED_NAME_FORM = "form";
    @SerializedName(SERIALIZED_NAME_FORM)
    private MenuForm form;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_TITLE = "title";
    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;
}
