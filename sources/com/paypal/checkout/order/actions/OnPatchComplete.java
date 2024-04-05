package com.paypal.checkout.order.actions;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public interface OnPatchComplete {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnPatchComplete invoke(C19846a<C19394m> aVar) {
            C19383o.m32797g(aVar, "patchComplete");
            return new OnPatchComplete$Companion$invoke$1(aVar);
        }
    }

    void onPatchComplete();
}
