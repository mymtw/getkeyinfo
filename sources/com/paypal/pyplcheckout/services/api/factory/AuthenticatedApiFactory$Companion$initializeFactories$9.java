package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.ThreeDSJwtApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$9 extends Lambda implements C19857l<String, ThreeDSJwtApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$9 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$9();

    public AuthenticatedApiFactory$Companion$initializeFactories$9() {
        super(1);
    }

    public final ThreeDSJwtApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new ThreeDSJwtApi(str);
    }
}
