package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.C17140i;
import kotlin.jvm.internal.C19383o;

public final class ThirdPartyAuth$getAuthenticator$riskDelegate$1 implements C17140i {
    public final /* synthetic */ ThirdPartyAuth this$0;

    public ThirdPartyAuth$getAuthenticator$riskDelegate$1(ThirdPartyAuth thirdPartyAuth) {
        this.this$0 = thirdPartyAuth;
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
