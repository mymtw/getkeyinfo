package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.UserAndCheckoutApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$4 extends Lambda implements C19857l<String, UserAndCheckoutApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$4 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$4();

    public AuthenticatedApiFactory$Companion$initializeFactories$4() {
        super(1);
    }

    public final UserAndCheckoutApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new UserAndCheckoutApi(str);
    }
}
