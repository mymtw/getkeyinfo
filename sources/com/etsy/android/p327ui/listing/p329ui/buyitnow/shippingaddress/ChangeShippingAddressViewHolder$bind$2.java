package com.etsy.android.p327ui.listing.p329ui.buyitnow.shippingaddress;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.C10369b;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingAddress;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.shippingaddress.ChangeShippingAddressViewHolder$bind$2 */
final class ChangeShippingAddressViewHolder$bind$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ShippingAddress $shippingAddress;
    public final /* synthetic */ C10398b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeShippingAddressViewHolder$bind$2(C10398b bVar, ShippingAddress shippingAddress) {
        super(1);
        this.this$0 = bVar;
        this.$shippingAddress = shippingAddress;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f22761b.mo38043a(new C10369b.C10379j(this.$shippingAddress));
    }
}
