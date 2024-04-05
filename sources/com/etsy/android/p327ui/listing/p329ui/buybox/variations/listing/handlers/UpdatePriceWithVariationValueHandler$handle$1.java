package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.handlers;

import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.Money;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p375jd.C12971a;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.handlers.UpdatePriceWithVariationValueHandler$handle$1 */
final class UpdatePriceWithVariationValueHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13646g5 $event;
    public final /* synthetic */ ListingViewState.C10092d $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatePriceWithVariationValueHandler$handle$1(C13597g.C13646g5 g5Var, ListingViewState.C10092d dVar) {
        super(1);
        this.$event = g5Var;
        this.$state = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C13597g.C13646g5 g5Var = this.$event;
        final ListingViewState.C10092d dVar = this.$state;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C10195b bVar) {
                C10423j jVar;
                C19383o.m32797g(bVar, "$this$buyBox");
                Money price = g5Var.f30129a.getPrice();
                if (price != null) {
                    ListingFetch listingFetch = dVar.f22239g;
                    EtsyMoney asEtsyMoney = price.asEtsyMoney();
                    C19383o.m32797g(listingFetch, "listingFetch");
                    C19383o.m32797g(asEtsyMoney, ResponseConstants.PRICE);
                    String format = asEtsyMoney.format();
                    if (listingFetch.hasVariations() && listingFetch.hasPriceDiffVariation()) {
                        format = format + '+';
                    }
                    jVar = new C12971a(format, (C10563f) null, listingFetch.getDetailedFreeShipping() != null, 10);
                } else {
                    jVar = bVar.f22378d;
                }
                bVar.f22378d = jVar;
            }
        });
    }
}
