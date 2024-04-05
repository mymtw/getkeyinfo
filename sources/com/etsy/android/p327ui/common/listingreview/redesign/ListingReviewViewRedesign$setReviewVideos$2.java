package com.etsy.android.p327ui.common.listingreview.redesign;

import android.view.View;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviewVideos$2 */
public final class ListingReviewViewRedesign$setReviewVideos$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ListingReviewViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign$setReviewVideos$2(ListingReviewViewRedesign listingReviewViewRedesign) {
        super(1);
        this.this$0 = listingReviewViewRedesign;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C9449c reviewsListener = this.this$0.getReviewsListener();
        if (reviewsListener != null) {
            reviewsListener.mo31934f(Reviews.ReviewType.LISTING);
        }
    }
}
