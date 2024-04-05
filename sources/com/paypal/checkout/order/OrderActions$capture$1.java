package com.paypal.checkout.order;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class OrderActions$capture$1 implements OnCaptureComplete {
    public final /* synthetic */ C19857l<CaptureOrderResult, C19394m> $onComplete;

    public OrderActions$capture$1(C19857l<? super CaptureOrderResult, C19394m> lVar) {
        this.$onComplete = lVar;
    }

    public void onCaptureComplete(CaptureOrderResult captureOrderResult) {
        C19383o.m32797g(captureOrderResult, "result");
        this.$onComplete.invoke(captureOrderResult);
    }
}
