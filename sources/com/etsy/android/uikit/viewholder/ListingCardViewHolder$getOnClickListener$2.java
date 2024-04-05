package com.etsy.android.uikit.viewholder;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import kotlin.jvm.internal.C19383o;
import p407nf.C13113a;

public final class ListingCardViewHolder$getOnClickListener$2 extends TrackingOnClickListener {
    public final /* synthetic */ ListingCard $listing;
    public final /* synthetic */ Bundle $referralArg;
    public final /* synthetic */ ListingCardViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCardViewHolder$getOnClickListener$2(ListingCardViewHolder listingCardViewHolder, ListingCard listingCard, Bundle bundle, C8698l[] lVarArr) {
        super(lVarArr);
        this.this$0 = listingCardViewHolder;
        this.$listing = listingCard;
        this.$referralArg = bundle;
    }

    public void onViewClick(View view) {
        C19383o.m32797g(view, "v");
        this.this$0.getClass();
        C13113a aVar = this.this$0.f26724t;
        if (aVar != null) {
            aVar.mo31349e(this.$listing, true, this.$referralArg);
        }
    }
}
