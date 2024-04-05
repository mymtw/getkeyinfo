package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.LsatUpgradeApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$1 extends Lambda implements C19857l<String, LsatUpgradeApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$1 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$1();

    public AuthenticatedApiFactory$Companion$initializeFactories$1() {
        super(1);
    }

    public final LsatUpgradeApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new LsatUpgradeApi(str);
    }
}
