/*
 * Copyright (c) 2021 Robert Bosch GmbH. All Rights Reserved.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.multitenancy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class CreateWalletRequest {

    /** Image url for this wallet. This image url is publicized (self-attested) to other agents as part of forming a connection.*/
    private String imageUrl;

    /** Key management method to use for this wallet.*/
    private KeyManagementMode keyManagementMode;

    /** Label for this wallet. This label is publicized (self-attested) to other agents as part of forming a connection.*/
    private String label;

    /** {@link org.hyperledger.aries.api.multitenancy.WalletDispatchType}*/
    private WalletDispatchType walletDispatchType;

    /** Master key used for key derivation.*/
    private String walletKey;

    /** Wallet name*/
    private String walletName;

    /** Type of wallet to create */
    private WalletType walletType;

    /** List of Webhook URLs associated with this sub wallet*/
    private List<String> walletWebhookUrls;
}
