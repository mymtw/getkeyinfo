package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.AddShippingApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$19 extends Lambda implements C19857l<String, AddShippingApi> {
    public final /* synthetic */ String $accessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedApiFactory$Companion$initializeFactories$19(String str) {
        super(1);
        this.$accessToken = str;
    }

    public final AddShippingApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new AddShippingApi(this.$accessToken, (C20011u.C20012a) null, (CoroutineDispatcher) null, (C20009t) null, (DebugConfigManager) null, 30, (DefaultConstructorMarker) null);
    }
}
