package com.paypal.pyplcheckout.flavorauth;

import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.authcore.authentication.AuthenticationState;
import com.paypal.authcore.authentication.C17132b;
import com.paypal.pyplcheckout.auth.AuthListener;
import kotlin.jvm.internal.C19383o;

public final class NativeAuthAccessTokenUseCase {
    private final PartnerAuthenticationProviderFactory providePartnerAuthenticationProvider;
    /* access modifiers changed from: private */
    public final ThirdPartyAuthPresenter thirdPartyAuthPresenter;

    public NativeAuthAccessTokenUseCase(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory, ThirdPartyAuthPresenter thirdPartyAuthPresenter2) {
        C19383o.m32797g(partnerAuthenticationProviderFactory, "providePartnerAuthenticationProvider");
        C19383o.m32797g(thirdPartyAuthPresenter2, "thirdPartyAuthPresenter");
        this.providePartnerAuthenticationProvider = partnerAuthenticationProviderFactory;
        this.thirdPartyAuthPresenter = thirdPartyAuthPresenter2;
    }

    private final Authentication.Listener handleAccessToken(AuthListener authListener) {
        return new NativeAuthAccessTokenUseCase$handleAccessToken$1(authListener, this);
    }

    public final void invoke(AuthListener authListener) {
        this.providePartnerAuthenticationProvider.invoke().mo61645d(new C17132b(AuthenticationState.Remembered, (String) null), handleAccessToken(authListener));
    }
}
