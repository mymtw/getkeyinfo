package com.etsy.android.p327ui.search.filters.adapter;

import android.view.View;
import com.etsy.android.lib.models.Country;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.adapter.CountrySelectorAdapter$CountriesViewHolder$bind$1 */
final class CountrySelectorAdapter$CountriesViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ Country $country;
    public final /* synthetic */ C10757a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountrySelectorAdapter$CountriesViewHolder$bind$1(C10757a aVar, Country country) {
        super(1);
        this.this$0 = aVar;
        this.$country = country;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f23705c.invoke(this.$country);
    }
}
