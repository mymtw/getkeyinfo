package com.paypal.checkout.createorder;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CreateOrderActions$create$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ C19857l<String, C19394m> $onOrderCreated;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateOrderActions$create$1(C19857l<? super String, C19394m> lVar) {
        super(1);
        this.$onOrderCreated = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "orderId");
        this.$onOrderCreated.invoke(str);
    }
}
