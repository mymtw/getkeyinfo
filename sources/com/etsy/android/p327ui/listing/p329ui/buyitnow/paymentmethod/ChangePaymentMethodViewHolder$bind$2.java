package com.etsy.android.p327ui.listing.p329ui.buyitnow.paymentmethod;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10369b;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.PaymentMethod;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.paymentmethod.ChangePaymentMethodViewHolder$bind$2 */
final class ChangePaymentMethodViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ PaymentMethod $paymentMethod;
    public final /* synthetic */ C10396b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangePaymentMethodViewHolder$bind$2(C10396b bVar, PaymentMethod paymentMethod) {
        super(1);
        this.this$0 = bVar;
        this.$paymentMethod = paymentMethod;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f22754b.mo38043a(new C10369b.C10378i(this.$paymentMethod));
    }
}
