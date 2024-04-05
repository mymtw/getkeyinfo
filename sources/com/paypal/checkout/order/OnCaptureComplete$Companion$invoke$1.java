package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OnCaptureComplete$Companion$invoke$1 implements OnCaptureComplete {
    public final /* synthetic */ C19857l<CaptureOrderResult, C19394m> $captureComplete;

    public OnCaptureComplete$Companion$invoke$1(C19857l<? super CaptureOrderResult, C19394m> lVar) {
        this.$captureComplete = lVar;
    }

    public void onCaptureComplete(CaptureOrderResult captureOrderResult) {
        C19383o.m32797g(captureOrderResult, "result");
        this.$captureComplete.invoke(captureOrderResult);
    }
}
