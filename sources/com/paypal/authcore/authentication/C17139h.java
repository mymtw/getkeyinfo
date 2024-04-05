package com.paypal.authcore.authentication;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.authcore.authentication.h */
public final class C17139h implements C17140i {

    /* renamed from: a */
    public final /* synthetic */ PartnerAuthenticationProvider f37510a;

    public C17139h(PartnerAuthenticationProvider partnerAuthenticationProvider) {
        this.f37510a = partnerAuthenticationProvider;
    }

    public final void generatePairingIdAndNotifyDyson(String str) {
        C19383o.m32797g(str, "customID");
        this.f37510a.f37459c.getRiskDelegate().generatePairingIdAndNotifyDyson(str);
    }

    public final String getRiskPayload() {
        return this.f37510a.f37459c.getRiskDelegate().getRiskPayload();
    }
}
