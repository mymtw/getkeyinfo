package com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingmethod;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10369b;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingMethod;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.shippingmethod.ChangeShippingMethodViewHolder$bind$1 */
final class ChangeShippingMethodViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ShippingMethod $shippingMethod;
    public final /* synthetic */ C10400b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeShippingMethodViewHolder$bind$1(C10400b bVar, ShippingMethod shippingMethod) {
        super(1);
        this.this$0 = bVar;
        this.$shippingMethod = shippingMethod;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f22767b.mo38043a(new C10369b.C10380k(this.$shippingMethod));
    }
}
