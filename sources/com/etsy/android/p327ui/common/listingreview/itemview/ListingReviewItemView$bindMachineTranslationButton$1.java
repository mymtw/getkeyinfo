package com.etsy.android.p327ui.common.listingreview.itemview;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.TranslateButton;

/* renamed from: com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$bindMachineTranslationButton$1 */
public final class ListingReviewItemView$bindMachineTranslationButton$1 extends TrackingOnClickListener {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ ListingReviewItemView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView$bindMachineTranslationButton$1(ReviewUiModel reviewUiModel, ListingReviewItemView listingReviewItemView, C8698l[] lVarArr) {
        super(false, lVarArr);
        this.$review = reviewUiModel;
        this.this$0 = listingReviewItemView;
    }

    public void onViewClick(View view) {
        if (this.$review.getTranslationState().isTranslated()) {
            this.$review.getTranslationState().toggleShouldShowTranslation();
            this.this$0.bindTranslatedReview(this.$review.getReview(), this.$review.getTranslatedReview(), this.$review.getTranslationState());
            return;
        }
        this.$review.getTranslationState().setTranslating();
        ((TranslateButton) this.this$0._$_findCachedViewById(R.id.review_translation_view)).configureForState(this.$review.getTranslationState());
        C9444a listener = this.this$0.getListener();
        if (listener != null) {
            listener.onTranslateReviewClicked(this.$review);
        }
    }
}
