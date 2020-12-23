/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.annotation.Nullable;
import java.util.List;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class ReceiveInvitationRequest {
    @Nullable
    @SerializedName("@id")
    private String id;

    @Nullable
    @SerializedName("routingKeys")
    private List<String> routingKeys;

    @Nullable
    @SerializedName("imageUrl")
    private String imageUrl;

    @Nullable
    @SerializedName("recipientKeys")
    private List<String> recipientKeys;

    @Nullable
    private String did;

    @Nullable
    @SerializedName("serviceEndpoint")
    private String serviceEndpoint;

    @Nullable
    private String label;
}
