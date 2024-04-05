package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.EligibilityApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$2 extends Lambda implements C19857l<String, EligibilityApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$2 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$2();

    public AuthenticatedApiFactory$Companion$initializeFactories$2() {
        super(1);
    }

    public final EligibilityApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new EligibilityApi(str);
    }
}
