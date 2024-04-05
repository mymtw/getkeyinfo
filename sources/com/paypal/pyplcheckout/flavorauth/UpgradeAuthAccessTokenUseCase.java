package com.paypal.pyplcheckout.flavorauth;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.authcore.authentication.AuthenticationState;
import com.paypal.authcore.authentication.C17132b;
import com.paypal.pyplcheckout.addcard.UpgradeAccessTokenListener;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.Email;
import com.paypal.pyplcheckout.pojo.User;
import kotlin.jvm.internal.C19383o;

public final class UpgradeAuthAccessTokenUseCase {
    private final DebugConfigManager debugConfigManager;
    private final PartnerAuthenticationProviderFactory partnerAuthenticationProviderUseCase;

    public UpgradeAuthAccessTokenUseCase(DebugConfigManager debugConfigManager2, PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(partnerAuthenticationProviderFactory, "partnerAuthenticationProviderUseCase");
        this.debugConfigManager = debugConfigManager2;
        this.partnerAuthenticationProviderUseCase = partnerAuthenticationProviderFactory;
    }

    private final void authenticate(Authentication.Listener listener) {
        Email email;
        AuthenticationState authenticationState = AuthenticationState.LoggedIn;
        User user = this.debugConfigManager.getUser();
        String str = null;
        if (!(user == null || (email = user.getEmail()) == null)) {
            str = email.getStringValue();
        }
        this.partnerAuthenticationProviderUseCase.invoke().mo61645d(new C17132b(authenticationState, str), listener);
    }

    private final void upgradeAccessTokenNew(UpgradeAccessTokenListener upgradeAccessTokenListener) {
        authenticate(new UpgradeAuthAccessTokenUseCase$upgradeAccessTokenNew$1(upgradeAccessTokenListener));
    }

    public final void invoke(UpgradeAccessTokenListener upgradeAccessTokenListener) {
        C19383o.m32797g(upgradeAccessTokenListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        upgradeAccessTokenNew(upgradeAccessTokenListener);
    }
}
