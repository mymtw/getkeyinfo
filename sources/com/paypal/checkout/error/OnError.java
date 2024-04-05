package com.paypal.checkout.error;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnError {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnError invoke(C19857l<? super ErrorInfo, C19394m> lVar) {
            C19383o.m32797g(lVar, "onError");
            return new OnError$Companion$invoke$1(lVar);
        }
    }

    void onError(ErrorInfo errorInfo);
}
