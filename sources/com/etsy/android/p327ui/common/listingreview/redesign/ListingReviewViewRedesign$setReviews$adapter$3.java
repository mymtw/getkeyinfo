package com.etsy.android.p327ui.common.listingreview.redesign;

import com.etsy.android.feedback.ReviewUiModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviews$adapter$3 */
public final class ListingReviewViewRedesign$setReviews$adapter$3 extends Lambda implements C19857l<ReviewUiModel, C19394m> {
    public final /* synthetic */ ListingReviewViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign$setReviews$adapter$3(ListingReviewViewRedesign listingReviewViewRedesign) {
        super(1);
        this.this$0 = listingReviewViewRedesign;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReviewUiModel) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "it");
        C9449c reviewsListener = this.this$0.getReviewsListener();
        if (reviewsListener != null) {
            reviewsListener.onTranslateReviewClicked(reviewUiModel);
        }
    }
}
