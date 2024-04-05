package com.etsy.android.p327ui.core.review;

import android.view.View;
import com.etsy.android.lib.models.ReviewImage;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerAdapter$bindBuyerReview$4 */
final class ListingReviewPagerAdapter$bindBuyerReview$4 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ReviewImage $review;
    public final /* synthetic */ View $view;
    public final /* synthetic */ ListingReviewPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewPagerAdapter$bindBuyerReview$4(ListingReviewPagerAdapter listingReviewPagerAdapter, View view, ReviewImage reviewImage) {
        super(1);
        this.this$0 = listingReviewPagerAdapter;
        this.$view = view;
        this.$review = reviewImage;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        ListingReviewPagerAdapter.m18024u(this.this$0, this.$view, this.$review.getListingId());
    }
}
