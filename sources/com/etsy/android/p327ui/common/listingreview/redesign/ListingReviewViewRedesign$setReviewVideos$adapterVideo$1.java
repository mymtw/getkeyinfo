package com.etsy.android.p327ui.common.listingreview.redesign;

import com.etsy.android.lib.models.apiv3.listing.ReviewVideo;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviewVideos$adapterVideo$1 */
public final class ListingReviewViewRedesign$setReviewVideos$adapterVideo$1 extends Lambda implements C19857l<Integer, C19394m> {
    public final /* synthetic */ List<ReviewVideo> $reviewVideos;
    public final /* synthetic */ ListingReviewViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign$setReviewVideos$adapterVideo$1(ListingReviewViewRedesign listingReviewViewRedesign, List<ReviewVideo> list) {
        super(1);
        this.this$0 = listingReviewViewRedesign;
        this.$reviewVideos = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        ListingReviewViewRedesign listingReviewViewRedesign = this.this$0;
        listingReviewViewRedesign.onReviewCarouseVideoClicked(i, listingReviewViewRedesign.mapToUiModel(this.$reviewVideos));
    }
}
