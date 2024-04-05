package com.etsy.android.p327ui.core.review;

import android.view.View;
import android.widget.TextView;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.TranslateButton;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerAdapter$bindTranslationState$1 */
public final class ListingReviewPagerAdapter$bindTranslationState$1 extends TrackingOnClickListener {
    public final /* synthetic */ ReviewImage $review;
    public final /* synthetic */ TextView $reviewTextView;
    public final /* synthetic */ TranslateButton $translateButton;
    public final /* synthetic */ ListingReviewPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewPagerAdapter$bindTranslationState$1(ReviewImage reviewImage, ListingReviewPagerAdapter listingReviewPagerAdapter, TranslateButton translateButton, TextView textView, C8698l[] lVarArr) {
        super(false, lVarArr);
        this.$review = reviewImage;
        this.this$0 = listingReviewPagerAdapter;
        this.$translateButton = translateButton;
        this.$reviewTextView = textView;
    }

    public void onViewClick(View view) {
        this.$review.getTranslationState().toggleShouldShowTranslation();
        ListingReviewPagerAdapter listingReviewPagerAdapter = this.this$0;
        ReviewImage reviewImage = this.$review;
        TranslateButton translateButton = this.$translateButton;
        TextView textView = this.$reviewTextView;
        listingReviewPagerAdapter.getClass();
        ListingReviewPagerAdapter.m18025w(reviewImage, translateButton, textView);
    }
}
