package com.paypal.checkout.approve;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnApprove$Companion$invoke$1 implements OnApprove {
    public final /* synthetic */ C19857l<Approval, C19394m> $onApprove;

    public OnApprove$Companion$invoke$1(C19857l<? super Approval, C19394m> lVar) {
        this.$onApprove = lVar;
    }

    public void onApprove(Approval approval) {
        C19383o.m32797g(approval, "approval");
        this.$onApprove.invoke(approval);
    }
}
