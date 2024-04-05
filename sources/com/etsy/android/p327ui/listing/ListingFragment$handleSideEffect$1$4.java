package com.etsy.android.p327ui.listing;

import com.etsy.android.lib.models.Country;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.listing.ListingFragment$handleSideEffect$1$4 */
public final class ListingFragment$handleSideEffect$1$4 extends Lambda implements C19861p<Country, String, C19394m> {
    public final /* synthetic */ ListingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingFragment$handleSideEffect$1$4(ListingFragment listingFragment) {
        super(2);
        this.this$0 = listingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Country) obj, (String) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(Country country, String str) {
        C19383o.m32797g(country, "country");
        this.this$0.getViewModel().mo33464b(new C13597g.C13633f("shipping_costs_request"));
        this.this$0.getViewModel().mo33464b(new C13597g.C13650h2(country, str));
    }
}
