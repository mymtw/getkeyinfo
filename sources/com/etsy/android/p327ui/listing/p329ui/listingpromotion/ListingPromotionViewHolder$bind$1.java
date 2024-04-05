package com.etsy.android.p327ui.listing.p329ui.listingpromotion;

import android.view.View;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p466vc.C13573c;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.listingpromotion.ListingPromotionViewHolder$bind$1 */
public final class ListingPromotionViewHolder$bind$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C10423j $uiModel;
    public final /* synthetic */ ListingPromotionViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingPromotionViewHolder$bind$1(ListingPromotionViewHolder listingPromotionViewHolder, C10423j jVar) {
        super(1);
        this.this$0 = listingPromotionViewHolder;
        this.$uiModel = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C13573c cVar = this.this$0.f22914b;
        C10423j jVar = this.$uiModel;
        cVar.mo38043a(new C13597g.C13692n2(((C10447a) jVar).f22917a, Long.valueOf(((C10447a) jVar).f22919c), ShopHomeConfig.ITEMS_SEARCH));
    }
}
