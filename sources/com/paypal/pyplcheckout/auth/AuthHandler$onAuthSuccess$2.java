package com.paypal.pyplcheckout.auth;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AuthHandler$onAuthSuccess$2 extends Lambda implements C19857l<AuthenticationSuccess, C19394m> {
    public final /* synthetic */ AuthHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthHandler$onAuthSuccess$2(AuthHandler authHandler) {
        super(1);
        this.this$0 = authHandler;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AuthenticationSuccess) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AuthenticationSuccess authenticationSuccess) {
        C19383o.m32797g(authenticationSuccess, "authSuccess");
        this.this$0.handleAuthSuccess(authenticationSuccess);
    }
}
