package com.paypal.android.platform.authsdk.splitlogin.domain;

import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SplitLoginRequest {
    private final ClientConfig clientConfig;
    private String publicCredential;
    private String riskVisitorId;
    private final String thirdPartyClientID;

    public SplitLoginRequest(ClientConfig clientConfig2, String str, String str2, String str3) {
        C19383o.m32797g(clientConfig2, "clientConfig");
        C19383o.m32797g(str2, "thirdPartyClientID");
        this.clientConfig = clientConfig2;
        this.publicCredential = str;
        this.thirdPartyClientID = str2;
        this.riskVisitorId = str3;
    }

    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    public final String getPublicCredential() {
        return this.publicCredential;
    }

    public final String getRiskVisitorId() {
        return this.riskVisitorId;
    }

    public final String getThirdPartyClientID() {
        return this.thirdPartyClientID;
    }

    public final void setPublicCredential(String str) {
        this.publicCredential = str;
    }

    public final void setRiskVisitorId(String str) {
        this.riskVisitorId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitLoginRequest(ClientConfig clientConfig2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(clientConfig2, (i & 2) != 0 ? null : str, str2, str3);
    }
}
