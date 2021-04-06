/*
  Copyright (c) 2020 Robert Bosch GmbH. All Rights Reserved.

  SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.api.proof;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import okhttp3.HttpUrl;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;
import java.util.Locale;

@Data @Builder
public class PresentProofRecordsFilter {

    @Nullable private String connectionId;
    @Nullable private PresentationExchangeRole role;
    @Nullable private PresentationExchangeState state;
    @Nullable private String threadId;

    public HttpUrl.Builder buildParams(@NonNull HttpUrl.Builder b) {
        if (StringUtils.isNotEmpty(connectionId)) {
            b.addQueryParameter("connection_id", connectionId);
        }
        if (role != null) {
            b.addQueryParameter("role", role.toString().toLowerCase(Locale.US));
        }
        if (state != null) {
            b.addQueryParameter("state", state.toString().toLowerCase(Locale.US));
        }
        if (StringUtils.isNotEmpty(threadId)) {
            b.addQueryParameter("thread_id", threadId);
        }
        return b;
    }

    public enum PresentationExchangeRole {
        prover,
        verifier
    }

    public enum PresentationExchangeState {
        proposal_sent,
        proposal_received,
        request_sent,
        request_received,
        presentation_sent,
        presentation_received,
        verified,
        presentation_acked
    }
}
