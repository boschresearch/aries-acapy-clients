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
 * CreateWalletRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class CreateWalletRequest {
    public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
    @SerializedName(SERIALIZED_NAME_IMAGE_URL)
    private String imageUrl;

    /**
     * Key management method to use for this wallet.
     */
    @JsonAdapter(KeyManagementModeEnum.Adapter.class)
    public enum KeyManagementModeEnum {
        MANAGED("managed");

        private String value;

        KeyManagementModeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static KeyManagementModeEnum fromValue(String value) {
            for (KeyManagementModeEnum b : KeyManagementModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<KeyManagementModeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final KeyManagementModeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public KeyManagementModeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return KeyManagementModeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_KEY_MANAGEMENT_MODE = "key_management_mode";
    @SerializedName(SERIALIZED_NAME_KEY_MANAGEMENT_MODE)
    private KeyManagementModeEnum keyManagementMode;
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;

    /**
     * Webhook target dispatch type for this wallet. default - Dispatch only to webhooks associated with this wallet.
     * base - Dispatch only to webhooks associated with the base wallet. both - Dispatch to both webhook targets.
     */
    @JsonAdapter(WalletDispatchTypeEnum.Adapter.class)
    public enum WalletDispatchTypeEnum {
        DEFAULT("default"),

        BOTH("both"),

        BASE("base");

        private String value;

        WalletDispatchTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WalletDispatchTypeEnum fromValue(String value) {
            for (WalletDispatchTypeEnum b : WalletDispatchTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<WalletDispatchTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final WalletDispatchTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WalletDispatchTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WalletDispatchTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_WALLET_DISPATCH_TYPE = "wallet_dispatch_type";
    @SerializedName(SERIALIZED_NAME_WALLET_DISPATCH_TYPE)
    private WalletDispatchTypeEnum walletDispatchType;
    public static final String SERIALIZED_NAME_WALLET_KEY = "wallet_key";
    @SerializedName(SERIALIZED_NAME_WALLET_KEY)
    private String walletKey;
    public static final String SERIALIZED_NAME_WALLET_NAME = "wallet_name";
    @SerializedName(SERIALIZED_NAME_WALLET_NAME)
    private String walletName;

    /**
     * Type of the wallet to create
     */
    @JsonAdapter(WalletTypeEnum.Adapter.class)
    public enum WalletTypeEnum {
        ASKAR("askar"),

        IN_MEMORY("in_memory"),

        INDY("indy");

        private String value;

        WalletTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WalletTypeEnum fromValue(String value) {
            for (WalletTypeEnum b : WalletTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<WalletTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final WalletTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WalletTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WalletTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
    @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
    private WalletTypeEnum walletType;
    public static final String SERIALIZED_NAME_WALLET_WEBHOOK_URLS = "wallet_webhook_urls";
    @SerializedName(SERIALIZED_NAME_WALLET_WEBHOOK_URLS)
    private List<String> walletWebhookUrls = null;
}
