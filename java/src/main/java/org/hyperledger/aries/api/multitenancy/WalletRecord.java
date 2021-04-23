/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"token"})
public class WalletRecord {
    private String createdAt;
    private KeyManagementMode keyManagementMode;
    private WalletSettings settings;
    private String state;
    private String token;
    private String updatedAt;
    private String walletId;

    @Data @NoArgsConstructor
    public static final class WalletSettings {
        @SerializedName("wallet.type")
        private WalletType walletType;
        @SerializedName("wallet.name")
        private String walletName;
        @SerializedName("wallet.webhook_urls")
        private List<String> walletWebhookUrls;
        @SerializedName("wallet.dispatch_type")
        private WalletDispatchType walletDispatchType;
        private String defaultLabel;
        private String imageUrl;
        @SerializedName("wallet.id")
        private String walletId;
    }
}
