package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnAuthorizeComplete {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnAuthorizeComplete invoke(C19857l<? super AuthorizeOrderResult, C19394m> lVar) {
            C19383o.m32797g(lVar, "captureComplete");
            return new OnAuthorizeComplete$Companion$invoke$1(lVar);
        }
    }

    void onAuthorizeComplete(AuthorizeOrderResult authorizeOrderResult);
}
