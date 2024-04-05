package com.etsy.android.p327ui.checkout;

import com.paypal.checkout.error.ErrorInfo;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutProxy$registerCallbacks$3 */
final class PayPalCheckoutProxy$registerCallbacks$3 extends Lambda implements C19857l<ErrorInfo, C19394m> {
    public final /* synthetic */ C19857l<ErrorInfo, C19394m> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutProxy$registerCallbacks$3(C19857l<? super ErrorInfo, C19394m> lVar) {
        super(1);
        this.$onError = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ErrorInfo) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ErrorInfo errorInfo) {
        C19383o.m32797g(errorInfo, "error");
        this.$onError.invoke(errorInfo);
    }
}
