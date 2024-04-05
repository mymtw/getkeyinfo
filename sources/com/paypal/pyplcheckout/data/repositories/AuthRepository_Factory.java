package com.paypal.pyplcheckout.data.repositories;

import com.paypal.pyplcheckout.flavorauth.ThirdPartyAuth;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AuthRepository_Factory implements C17555d<AuthRepository> {
    private final C19011a<Boolean> is1pProvider;
    private final C19011a<ThirdPartyAuth> thirdPartyAuthProvider;

    public AuthRepository_Factory(C19011a<ThirdPartyAuth> aVar, C19011a<Boolean> aVar2) {
        this.thirdPartyAuthProvider = aVar;
        this.is1pProvider = aVar2;
    }

    public static AuthRepository_Factory create(C19011a<ThirdPartyAuth> aVar, C19011a<Boolean> aVar2) {
        return new AuthRepository_Factory(aVar, aVar2);
    }

    public static AuthRepository newInstance(ThirdPartyAuth thirdPartyAuth, boolean z) {
        return new AuthRepository(thirdPartyAuth, z);
    }

    public AuthRepository get() {
        return newInstance(this.thirdPartyAuthProvider.get(), this.is1pProvider.get().booleanValue());
    }
}
