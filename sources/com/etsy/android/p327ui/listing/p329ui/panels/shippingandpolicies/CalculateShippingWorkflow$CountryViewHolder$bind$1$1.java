package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.view.View;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.CalculateShippingWorkflow$CountryViewHolder$bind$1$1 */
final class CalculateShippingWorkflow$CountryViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ Country $country;
    public final /* synthetic */ C10554d.C10556b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalculateShippingWorkflow$CountryViewHolder$bind$1$1(C10554d.C10556b bVar, Country country) {
        super(1);
        this.this$0 = bVar;
        this.$country = country;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f23146b.invoke(this.$country);
    }
}
