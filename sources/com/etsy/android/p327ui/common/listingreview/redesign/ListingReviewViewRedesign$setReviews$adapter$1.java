package com.etsy.android.p327ui.common.listingreview.redesign;

import com.etsy.android.feedback.ReviewUiModel;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviews$adapter$1 */
public /* synthetic */ class ListingReviewViewRedesign$setReviews$adapter$1 extends FunctionReferenceImpl implements C19857l<ReviewUiModel, C19394m> {
    public ListingReviewViewRedesign$setReviews$adapter$1(Object obj) {
        super(1, obj, ListingReviewViewRedesign.class, "onReviewClicked", "onReviewClicked(Lcom/etsy/android/feedback/ReviewUiModel;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReviewUiModel) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "p0");
        ((ListingReviewViewRedesign) this.receiver).onReviewClicked(reviewUiModel);
    }
}
