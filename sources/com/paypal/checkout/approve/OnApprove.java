package com.paypal.checkout.approve;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnApprove {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnApprove invoke(C19857l<? super Approval, C19394m> lVar) {
            C19383o.m32797g(lVar, "onApprove");
            return new OnApprove$Companion$invoke$1(lVar);
        }
    }

    void onApprove(Approval approval);
}
