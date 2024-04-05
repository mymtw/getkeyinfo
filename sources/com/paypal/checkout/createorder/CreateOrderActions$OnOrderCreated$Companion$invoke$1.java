package com.paypal.checkout.createorder;

import com.paypal.checkout.createorder.CreateOrderActions;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class CreateOrderActions$OnOrderCreated$Companion$invoke$1 implements CreateOrderActions.OnOrderCreated {
    public final /* synthetic */ C19857l<String, C19394m> $orderCreated;

    public CreateOrderActions$OnOrderCreated$Companion$invoke$1(C19857l<? super String, C19394m> lVar) {
        this.$orderCreated = lVar;
    }

    public void onCreated(String str) {
        C19383o.m32797g(str, "orderId");
        this.$orderCreated.invoke(str);
    }
}
