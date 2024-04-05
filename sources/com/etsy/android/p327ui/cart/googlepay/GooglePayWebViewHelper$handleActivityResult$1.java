package com.etsy.android.p327ui.cart.googlepay;

import com.google.android.gms.wallet.PaymentData;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p480xb.C13869b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.googlepay.GooglePayWebViewHelper$handleActivityResult$1 */
final class GooglePayWebViewHelper$handleActivityResult$1 extends Lambda implements C19857l<PaymentData, C19394m> {
    public final /* synthetic */ C9308f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GooglePayWebViewHelper$handleActivityResult$1(C9308f fVar) {
        super(1);
        this.this$0 = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentData) obj);
        return C19394m.f43287a;
    }

    public final void invoke(PaymentData paymentData) {
        if (paymentData != null) {
            this.this$0.f20544b = C13869b.C13870a.m21399a(paymentData);
            return;
        }
        this.this$0.f20544b = null;
    }
}
