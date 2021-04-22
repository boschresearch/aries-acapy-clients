package org.hyperledger.aries.api.connection;

import lombok.Builder;
import lombok.Data;
import org.hyperledger.aries.api.AcaPyRequestFilter;

@Data @Builder
public class ConnectionReceiveInvitationFilter implements AcaPyRequestFilter {
    private String alias;
    private Boolean autoAccept;
    private String mediationId;
}
