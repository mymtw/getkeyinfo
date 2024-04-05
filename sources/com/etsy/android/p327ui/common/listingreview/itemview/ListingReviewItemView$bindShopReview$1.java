package com.etsy.android.p327ui.common.listingreview.itemview;

import android.view.View;
import com.etsy.android.feedback.ReviewUiModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$bindShopReview$1 */
public final class ListingReviewItemView$bindShopReview$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ ListingReviewItemView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView$bindShopReview$1(ListingReviewItemView listingReviewItemView, ReviewUiModel reviewUiModel) {
        super(1);
        this.this$0 = listingReviewItemView;
        this.$review = reviewUiModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9444a listener = this.this$0.getListener();
        if (listener != null) {
            listener.onListingClicked(this.$review.getListingId());
        }
    }
}
