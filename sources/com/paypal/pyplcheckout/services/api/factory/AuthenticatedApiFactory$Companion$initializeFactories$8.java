package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.sca.CompleteStrongCustomerAuthenticationApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$8 extends Lambda implements C19857l<String, CompleteStrongCustomerAuthenticationApi> {
    public final /* synthetic */ String $accessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedApiFactory$Companion$initializeFactories$8(String str) {
        super(1);
        this.$accessToken = str;
    }

    public final CompleteStrongCustomerAuthenticationApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new CompleteStrongCustomerAuthenticationApi(this.$accessToken);
    }
}
