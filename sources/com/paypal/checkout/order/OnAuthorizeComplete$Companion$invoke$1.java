package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnAuthorizeComplete$Companion$invoke$1 implements OnAuthorizeComplete {
    public final /* synthetic */ C19857l<AuthorizeOrderResult, C19394m> $captureComplete;

    public OnAuthorizeComplete$Companion$invoke$1(C19857l<? super AuthorizeOrderResult, C19394m> lVar) {
        this.$captureComplete = lVar;
    }

    public void onAuthorizeComplete(AuthorizeOrderResult authorizeOrderResult) {
        C19383o.m32797g(authorizeOrderResult, "result");
        this.$captureComplete.invoke(authorizeOrderResult);
    }
}
