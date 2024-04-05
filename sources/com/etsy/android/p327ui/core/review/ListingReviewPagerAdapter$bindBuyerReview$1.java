package com.etsy.android.p327ui.core.review;

import android.view.View;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ReviewImage;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.review.ListingReviewPagerAdapter$bindBuyerReview$1 */
final class ListingReviewPagerAdapter$bindBuyerReview$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ReviewImage $review;
    public final /* synthetic */ View $view;
    public final /* synthetic */ ListingReviewPagerAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewPagerAdapter$bindBuyerReview$1(ListingReviewPagerAdapter listingReviewPagerAdapter, View view, ReviewImage reviewImage) {
        super(0);
        this.this$0 = listingReviewPagerAdapter;
        this.$view = view;
        this.$review = reviewImage;
    }

    public final void invoke() {
        this.this$0.f21481g = ((ImageView) this.$view.findViewById(R.id.buyer_review_image)).getMeasuredWidth();
        this.this$0.mo32460v(this.$view, this.$review.getImage());
    }
}
