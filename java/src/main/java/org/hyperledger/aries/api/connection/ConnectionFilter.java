/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.connection;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;

@Data @Builder
public class ConnectionFilter {

    @Nullable private String alias;
    @Nullable private ConnectionInitiator initiator;
    @Nullable private String invitationKey;
    @Nullable private String myDid;
    @Nullable private ConnectionState state;
    @Nullable private String theirDid;
    @Nullable private String theirRole;

    public HttpUrl.Builder buildParams(@NonNull HttpUrl.Builder b) {
        if (StringUtils.isNotEmpty(alias)) {
            b.addQueryParameter("alias", alias);
        }
        if (initiator != null) {
            b.addQueryParameter("initiator", initiator.toString());
        }
        if (StringUtils.isNotEmpty(invitationKey)) {
            b.addQueryParameter("invitation_key", invitationKey);
        }
        if (StringUtils.isNotEmpty(myDid)) {
            b.addQueryParameter("my_did", myDid);
        }
        if (state != null) {
            b.addQueryParameter("state", state.toString());
        }
        if (StringUtils.isNotEmpty(theirDid)) {
            b.addQueryParameter("their_did", theirDid);
        }
        if (StringUtils.isNotEmpty(theirRole)) {
            b.addQueryParameter("their_role", theirRole);
        }
        return b;
    }
}
