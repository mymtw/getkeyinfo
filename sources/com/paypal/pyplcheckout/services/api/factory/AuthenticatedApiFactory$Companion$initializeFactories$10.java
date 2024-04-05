package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.ThreeDSLookUpApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$10 extends Lambda implements C19857l<String, ThreeDSLookUpApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$10 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$10();

    public AuthenticatedApiFactory$Companion$initializeFactories$10() {
        super(1);
    }

    public final ThreeDSLookUpApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new ThreeDSLookUpApi(str);
    }
}
