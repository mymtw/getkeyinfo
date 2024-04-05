package com.etsy.android.p327ui.checkout;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.etsy.android.ui.checkout.PayPalCheckoutRepo", mo70541f = "PayPalCheckoutRepo.kt", mo70542l = {17}, mo70543m = "confirmOrder")
/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutRepo$confirmOrder$1 */
final class PayPalCheckoutRepo$confirmOrder$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C9434a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCheckoutRepo$confirmOrder$1(C9434a aVar, C19340c<? super PayPalCheckoutRepo$confirmOrder$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo31879a((String) null, (Boolean) null, (String) null, this);
    }
}
