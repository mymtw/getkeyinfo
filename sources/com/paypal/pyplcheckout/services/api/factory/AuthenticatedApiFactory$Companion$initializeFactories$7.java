package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.AddShippingAddressApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$7 extends Lambda implements C19857l<String, AddShippingAddressApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$7 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$7();

    public AuthenticatedApiFactory$Companion$initializeFactories$7() {
        super(1);
    }

    public final AddShippingAddressApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new AddShippingAddressApi(str);
    }
}
