package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.UpdateCurrencyConversionApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$6 extends Lambda implements C19857l<String, UpdateCurrencyConversionApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$6 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$6();

    public AuthenticatedApiFactory$Companion$initializeFactories$6() {
        super(1);
    }

    public final UpdateCurrencyConversionApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new UpdateCurrencyConversionApi(str);
    }
}
