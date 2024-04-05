package com.etsy.android.p327ui.checkout;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutProxy$registerCallbacks$2 */
final class PayPalCheckoutProxy$registerCallbacks$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19846a<C19394m> $onCancel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutProxy$registerCallbacks$2(C19846a<C19394m> aVar) {
        super(0);
        this.$onCancel = aVar;
    }

    public final void invoke() {
        this.$onCancel.invoke();
    }
}
