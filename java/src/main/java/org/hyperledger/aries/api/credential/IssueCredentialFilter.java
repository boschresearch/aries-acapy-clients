/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.credential;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Locale;

@Data @Builder
public class IssueCredentialFilter {

    @Nullable private String connectionId;
    @Nullable private CredentialExchangeRole role;
    @Nullable private CredentialExchangeState state;
    @Nullable private String threadId;

    public HttpUrl.Builder buildParams(@NonNull HttpUrl.Builder b) {
        if (StringUtils.isNotEmpty(connectionId)) {
            b.addQueryParameter("connection_id", connectionId);
        }
        if (StringUtils.isNotEmpty(threadId)) {
            b.addQueryParameter("thread_id", threadId);
        }
        if (role != null) {
            b.addQueryParameter("role", role.toString().toLowerCase(Locale.US));
        }
        if (state != null) {
            b.addQueryParameter("state", state.toString().toLowerCase(Locale.US));
        }
        return b;
    }
}
