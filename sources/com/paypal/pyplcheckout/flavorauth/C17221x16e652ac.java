package com.paypal.pyplcheckout.flavorauth;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.pyplcheckout.addcard.UpgradeAccessToken;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListener;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth$setupUpgradeAccessTokenDelegate$upgradeAccessToken$1 */
public final class C17221x16e652ac implements UpgradeAccessToken {
    public final /* synthetic */ ThirdPartyAuth this$0;

    public C17221x16e652ac(ThirdPartyAuth thirdPartyAuth) {
        this.this$0 = thirdPartyAuth;
    }

    public void getUserAccessToken(UpgradeAccessTokenListener upgradeAccessTokenListener) {
        C19383o.m32797g(upgradeAccessTokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.this$0.getNativeOtpEnabled()) {
            this.this$0.upgradeAuthAccessTokenUseCase.invoke(upgradeAccessTokenListener);
        } else {
            this.this$0.getFullAuthenticatedAccessToken(upgradeAccessTokenListener);
        }
    }
}
