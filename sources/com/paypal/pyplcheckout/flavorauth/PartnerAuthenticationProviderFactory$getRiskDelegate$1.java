package com.paypal.pyplcheckout.flavorauth;

import kotlin.jvm.internal.C19383o;
import p716xo.C18833e;

public final class PartnerAuthenticationProviderFactory$getRiskDelegate$1 implements C18833e {
    public final /* synthetic */ PartnerAuthenticationProviderFactory this$0;

    public PartnerAuthenticationProviderFactory$getRiskDelegate$1(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        this.this$0 = partnerAuthenticationProviderFactory;
    }

    public void generatePairingIdAndNotifyDyson(String str) {
        C19383o.m32797g(str, "customID");
        this.this$0.foundationRiskConfig.generatePairingIdAndNotifyDyson(str);
    }

    public String getRiskPayload() {
        String riskPayload = this.this$0.foundationRiskConfig.getRiskPayload();
        C19383o.m32796f(riskPayload, "foundationRiskConfig.riskPayload");
        return riskPayload;
    }
}
