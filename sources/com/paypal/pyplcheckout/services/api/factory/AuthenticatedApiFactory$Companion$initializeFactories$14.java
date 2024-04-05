package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.ValidateAddressApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$14 extends Lambda implements C19857l<String, ValidateAddressApi> {
    public static final AuthenticatedApiFactory$Companion$initializeFactories$14 INSTANCE = new AuthenticatedApiFactory$Companion$initializeFactories$14();

    public AuthenticatedApiFactory$Companion$initializeFactories$14() {
        super(1);
    }

    public final ValidateAddressApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new ValidateAddressApi(str, (C20011u.C20012a) null, (CoroutineDispatcher) null, (C20009t) null, 14, (DefaultConstructorMarker) null);
    }
}
