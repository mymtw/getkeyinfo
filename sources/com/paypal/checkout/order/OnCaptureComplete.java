package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public interface OnCaptureComplete {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final OnCaptureComplete invoke(C19857l<? super CaptureOrderResult, C19394m> lVar) {
            C19383o.m32797g(lVar, "captureComplete");
            return new OnCaptureComplete$Companion$invoke$1(lVar);
        }
    }

    void onCaptureComplete(CaptureOrderResult captureOrderResult);
}
