package com.etsy.android.p327ui.common.listingreview.redesign;

import android.view.View;
import com.etsy.android.feedback.ReviewUiModel;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.TranslateButton;
import kotlin.C19394m;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ReviewViewRedesign$setTranslationButton$1 */
public final class ReviewViewRedesign$setTranslationButton$1 extends TrackingOnClickListener {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ TranslateButton $translateButton;
    public final /* synthetic */ MachineTranslationViewState $translationViewState;
    public final /* synthetic */ ReviewViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewViewRedesign$setTranslationButton$1(MachineTranslationViewState machineTranslationViewState, TranslateButton translateButton, ReviewViewRedesign reviewViewRedesign, ReviewUiModel reviewUiModel, C8698l[] lVarArr) {
        super(false, lVarArr);
        this.$translationViewState = machineTranslationViewState;
        this.$translateButton = translateButton;
        this.this$0 = reviewViewRedesign;
        this.$review = reviewUiModel;
    }

    public void onViewClick(View view) {
        if (this.$translationViewState.isTranslated()) {
            this.$translationViewState.toggleShouldShowTranslation();
            this.$translateButton.configureForState(this.$translationViewState);
            this.this$0.setReviewText(this.$review.getReview(), this.$review.getTranslatedReview(), this.$review.getTranslationState(), this.$review.getShowAppreciationPhoto());
            return;
        }
        this.$translationViewState.setTranslating();
        this.$translateButton.configureForState(this.$translationViewState);
        C19857l<ReviewUiModel, C19394m> translationClickListener = this.this$0.getTranslationClickListener();
        if (translationClickListener != null) {
            translationClickListener.invoke(this.$review);
        }
    }
}
