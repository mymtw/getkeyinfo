package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.C17133c;
import com.paypal.openid.AuthorizationException;
import com.paypal.openid.C17156f;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListener;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

public final class ThirdPartyAuth$getFullAuthenticatedAccessToken$1 implements C17133c {
    public final /* synthetic */ UpgradeAccessTokenListener $listener;
    public final /* synthetic */ ThirdPartyAuth this$0;

    public ThirdPartyAuth$getFullAuthenticatedAccessToken$1(ThirdPartyAuth thirdPartyAuth, UpgradeAccessTokenListener upgradeAccessTokenListener) {
        this.this$0 = thirdPartyAuth;
        this.$listener = upgradeAccessTokenListener;
    }

    public void completeWithFailure(AuthorizationException authorizationException) {
        this.$listener.onFailure(new Exception(), String.valueOf(authorizationException == null ? null : authorizationException.errorDescription));
    }

    public void completeWithSuccess(C17156f fVar) {
        String str;
        C19394m mVar = null;
        if (!(fVar == null || (str = fVar.f37614c) == null)) {
            this.$listener.onSuccess(str, (Map<String, ? extends Object>) null);
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            this.$listener.onFailure(new IllegalArgumentException(), "Token was empty");
        }
    }

    public String getTrackingID() {
        String buttonSessionId = this.this$0.debugConfigManager.getButtonSessionId();
        C19383o.m32796f(buttonSessionId, "debugConfigManager.buttonSessionId");
        return buttonSessionId;
    }
}
