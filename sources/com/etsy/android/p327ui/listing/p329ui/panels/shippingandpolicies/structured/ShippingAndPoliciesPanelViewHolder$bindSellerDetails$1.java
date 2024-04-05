package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.ShippingAndPoliciesPanelViewHolder$bindSellerDetails$1 */
final class ShippingAndPoliciesPanelViewHolder$bindSellerDetails$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ ShippingAndPoliciesPanelViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingAndPoliciesPanelViewHolder$bindSellerDetails$1(ShippingAndPoliciesPanelViewHolder shippingAndPoliciesPanelViewHolder) {
        super(1);
        this.this$0 = shippingAndPoliciesPanelViewHolder;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "url");
        this.this$0.f23197b.mo38043a(new C13597g.C13604a5(str));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }
}
