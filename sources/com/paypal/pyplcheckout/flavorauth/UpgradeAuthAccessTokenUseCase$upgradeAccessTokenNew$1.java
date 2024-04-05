package com.paypal.pyplcheckout.flavorauth;

import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationError;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListener;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;

public final class UpgradeAuthAccessTokenUseCase$upgradeAccessTokenNew$1 implements Authentication.Listener {
    public final /* synthetic */ UpgradeAccessTokenListener $listener;

    public UpgradeAuthAccessTokenUseCase$upgradeAccessTokenNew$1(UpgradeAccessTokenListener upgradeAccessTokenListener) {
        this.$listener = upgradeAccessTokenListener;
    }

    public void onError(AuthenticationError authenticationError) {
        C19383o.m32797g(authenticationError, "error");
        this.$listener.onFailure(new Exception(), String.valueOf(authenticationError.getMessage()));
    }

    public void onSuccess(AuthenticationTokensProvider authenticationTokensProvider) {
        C19383o.m32797g(authenticationTokensProvider, "authTokensProvider");
        String accessToken = authenticationTokensProvider.getAccessToken();
        C19394m mVar = null;
        if (accessToken != null) {
            this.$listener.onSuccess(accessToken, (Map<String, ? extends Object>) null);
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            this.$listener.onFailure(new IllegalArgumentException(), "Token was empty");
        }
    }
}
