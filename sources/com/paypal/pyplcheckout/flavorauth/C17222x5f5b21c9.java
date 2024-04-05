package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.C17140i;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.flavorauth.WebBasedAuthAccessTokenUseCase$createAuthenticator$riskDelegate$1 */
public final class C17222x5f5b21c9 implements C17140i {
    public final /* synthetic */ WebBasedAuthAccessTokenUseCase this$0;

    public C17222x5f5b21c9(WebBasedAuthAccessTokenUseCase webBasedAuthAccessTokenUseCase) {
        this.this$0 = webBasedAuthAccessTokenUseCase;
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
