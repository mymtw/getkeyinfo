package com.paypal.pyplcheckout.flavorauth;

import com.paypal.authcore.authentication.PartnerAuthenticationProvider;
import kotlin.jvm.internal.C19383o;
import p716xo.C18830c;

public final class LogoutUseCase {
    private final PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory;

    public LogoutUseCase(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory2) {
        C19383o.m32797g(partnerAuthenticationProviderFactory2, "partnerAuthenticationProviderFactory");
        this.partnerAuthenticationProviderFactory = partnerAuthenticationProviderFactory2;
    }

    public final void invoke() {
        PartnerAuthenticationProvider invoke = this.partnerAuthenticationProviderFactory.invoke();
        invoke.getClass();
        invoke.mo61644a(PartnerAuthenticationProvider.m28571e("native_auth_partner_authentication_logout_hard", "initiated", "soft logout"));
        ((C18830c) invoke.f37461e.getValue()).logout(false);
    }
}
