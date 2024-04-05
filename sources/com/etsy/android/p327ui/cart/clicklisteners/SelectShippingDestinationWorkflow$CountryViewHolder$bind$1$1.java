package com.etsy.android.p327ui.cart.clicklisteners;

import android.view.View;
import com.etsy.android.lib.models.Country;
import com.etsy.android.p327ui.cart.clicklisteners.C9289n;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.clicklisteners.SelectShippingDestinationWorkflow$CountryViewHolder$bind$1$1 */
final class SelectShippingDestinationWorkflow$CountryViewHolder$bind$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ Country $country;
    public final /* synthetic */ C9289n.C9291b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectShippingDestinationWorkflow$CountryViewHolder$bind$1$1(C9289n.C9291b bVar, Country country) {
        super(1);
        this.this$0 = bVar;
        this.$country = country;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20507b.invoke(this.$country);
    }
}
