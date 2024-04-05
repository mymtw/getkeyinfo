package com.paypal.pyplcheckout.flavorauth;

import com.paypal.android.platform.authsdk.authinterface.AuthenticationState;
import com.paypal.authcore.authentication.PartnerAuthenticationProvider;
import kotlin.jvm.internal.C19383o;
import p716xo.C18830c;
import p716xo.C18834f;

public final class ClearAccessTokenUseCase {
    private final PartnerAuthenticationProviderFactory getPartnerAuthenticationProvider;

    public ClearAccessTokenUseCase(PartnerAuthenticationProviderFactory partnerAuthenticationProviderFactory) {
        C19383o.m32797g(partnerAuthenticationProviderFactory, "getPartnerAuthenticationProvider");
        this.getPartnerAuthenticationProvider = partnerAuthenticationProviderFactory;
    }

    public final void invoke() {
        PartnerAuthenticationProvider invoke = this.getPartnerAuthenticationProvider.invoke();
        invoke.getClass();
        invoke.mo61644a(PartnerAuthenticationProvider.m28571e("native_auth_partner_authentication_wipe_access_token", "initiated", (String) null));
        C18830c cVar = (C18830c) invoke.f37461e.getValue();
        cVar.f41702e.onTrackEvent(C18830c.m31822a("native_auth_authsdk_logout", "success", "hard"));
        C18834f fVar = cVar.f41701d;
        fVar.f41705a = null;
        fVar.f41706b = AuthenticationState.Anonymous;
    }
}
