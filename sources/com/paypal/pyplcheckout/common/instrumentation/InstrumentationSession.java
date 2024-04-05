package com.paypal.pyplcheckout.common.instrumentation;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.util.UUID;

public final class InstrumentationSession {
    private String orderSessionId;
    private String sdkSessionId;

    public final String getOrderSessionId() {
        return this.orderSessionId;
    }

    public final String getSdkSessionId() {
        return this.sdkSessionId;
    }

    public final void resetOrderSessionId() {
        this.orderSessionId = UUID.randomUUID().toString();
        DebugConfigManager.getInstance().setButtonSessionId(this.orderSessionId);
    }

    public final void resetSdkSessionId() {
        this.sdkSessionId = UUID.randomUUID().toString();
    }
}
