package com.etsy.android.p327ui.core.review;

import com.etsy.android.feedback.ReviewUiModel;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$setReviewText$1$1$2 */
public final class ListingVideoReviewFragment$setReviewText$1$1$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ ListingVideoReviewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingVideoReviewFragment$setReviewText$1$1$2(ListingVideoReviewFragment listingVideoReviewFragment, ReviewUiModel reviewUiModel) {
        super(0);
        this.this$0 = listingVideoReviewFragment;
        this.$review = reviewUiModel;
    }

    public final void invoke() {
        this.this$0.showReviewBottomSheet(this.$review);
    }
}
