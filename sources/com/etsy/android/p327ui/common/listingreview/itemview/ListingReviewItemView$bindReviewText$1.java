package com.etsy.android.p327ui.common.listingreview.itemview;

import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.stylekit.views.ratings.CollageRatingView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.common.listingreview.itemview.ListingReviewItemView$bindReviewText$1 */
public final class ListingReviewItemView$bindReviewText$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $text;
    public final /* synthetic */ ListingReviewItemView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewItemView$bindReviewText$1(ListingReviewItemView listingReviewItemView, String str) {
        super(0);
        this.this$0 = listingReviewItemView;
        this.$text = str;
    }

    public final void invoke() {
        ListingReviewItemView listingReviewItemView = this.this$0;
        String str = this.$text;
        CollageRatingView access$getRatingView$p = listingReviewItemView.ratingView;
        C19383o.m32794d(access$getRatingView$p);
        ImageView access$getReviewAppreciationPhoto$p = this.this$0.reviewAppreciationPhoto;
        C19383o.m32794d(access$getReviewAppreciationPhoto$p);
        TextView access$getReviewTextTop$p = this.this$0.reviewTextTop;
        C19383o.m32794d(access$getReviewTextTop$p);
        TextView access$getReviewTextBottom$p = this.this$0.reviewTextBottom;
        C19383o.m32794d(access$getReviewTextBottom$p);
        listingReviewItemView.wrapText(str, access$getRatingView$p, access$getReviewAppreciationPhoto$p, access$getReviewTextTop$p, access$getReviewTextBottom$p);
    }
}
