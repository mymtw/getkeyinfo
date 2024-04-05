package com.paypal.checkout.createorder;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface CreateOrder {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CreateOrder invoke(C19857l<? super CreateOrderActions, C19394m> lVar) {
            C19383o.m32797g(lVar, "orderCreate");
            return new CreateOrder$Companion$invoke$1(lVar);
        }
    }

    void create(CreateOrderActions createOrderActions);
}
