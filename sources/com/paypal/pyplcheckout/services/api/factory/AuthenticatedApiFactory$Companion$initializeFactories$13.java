package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.AddCardApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$13 extends Lambda implements C19857l<String, AddCardApi> {
    public final /* synthetic */ String $accessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedApiFactory$Companion$initializeFactories$13(String str) {
        super(1);
        this.$accessToken = str;
    }

    public final AddCardApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new AddCardApi(this.$accessToken, (C20011u.C20012a) null, (CoroutineDispatcher) null, (C20009t) null, (DebugConfigManager) null, 30, (DefaultConstructorMarker) null);
    }
}
