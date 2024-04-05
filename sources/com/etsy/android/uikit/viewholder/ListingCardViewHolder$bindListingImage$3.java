package com.etsy.android.uikit.viewholder;

import com.etsy.android.uikit.pageindicator.ScalingPageIndicator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ListingCardViewHolder$bindListingImage$3 extends Lambda implements C19857l<ScalingPageIndicator.C11872b, C19394m> {
    public final /* synthetic */ ListingCardUiModel $uiModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingCardViewHolder$bindListingImage$3(ListingCardUiModel listingCardUiModel) {
        super(1);
        this.$uiModel = listingCardUiModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ScalingPageIndicator.C11872b) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ScalingPageIndicator.C11872b bVar) {
        C19383o.m32797g(bVar, "state");
        this.$uiModel.setScalingPageIndicatorState(bVar);
    }
}
