package com.paypal.pyplcheckout.services.api.factory;

import com.paypal.pyplcheckout.services.api.AddCardThreeDsApi;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthenticatedApiFactory$Companion$initializeFactories$17 extends Lambda implements C19857l<String, AddCardThreeDsApi> {
    public final /* synthetic */ String $accessToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticatedApiFactory$Companion$initializeFactories$17(String str) {
        super(1);
        this.$accessToken = str;
    }

    public final AddCardThreeDsApi invoke(String str) {
        C19383o.m32797g(str, "it");
        return new AddCardThreeDsApi(this.$accessToken);
    }
}
