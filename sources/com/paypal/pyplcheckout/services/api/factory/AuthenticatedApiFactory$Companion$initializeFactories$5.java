package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.CryptoCurrencyApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$5 extends Lambda implements C19857l<String, CryptoCurrencyApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$5 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$5();

    public AuthenticatedApiFactory$Companion$initializeFactories$5() {
        super(1);
    }

    public final CryptoCurrencyApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new CryptoCurrencyApi(str);
    }
}
