package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnGetOrderDetailsComplete {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnGetOrderDetailsComplete invoke(C19857l<? super GetOrderResult, C19394m> lVar) {
            C19383o.m32797g(lVar, "getOrderComplete");
            return new OnGetOrderDetailsComplete$Companion$invoke$1(lVar);
        }
    }

    void onGetOrderDetailsComplete(GetOrderResult getOrderResult);
}
