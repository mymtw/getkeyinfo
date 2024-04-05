package com.etsy.android.p327ui.cardview.viewholders;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.models.apiv3.ListingCard;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cardview.viewholders.CardedHeaderWithArrowViewHolder$setClickHandler$4 */
final class CardedHeaderWithArrowViewHolder$setClickHandler$4 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ListingCard $listing;
    public final /* synthetic */ C9171e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardedHeaderWithArrowViewHolder$setClickHandler$4(C9171e eVar, ListingCard listingCard) {
        super(1);
        this.this$0 = eVar;
        this.$listing = listingCard;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.f20189c.f20044f.mo31349e(this.$listing, true, (Bundle) null);
    }
}
