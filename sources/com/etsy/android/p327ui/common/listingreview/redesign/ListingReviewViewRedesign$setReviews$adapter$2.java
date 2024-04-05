package com.etsy.android.p327ui.common.listingreview.redesign;

import com.etsy.android.feedback.ReviewUiModel;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviews$adapter$2 */
public final class ListingReviewViewRedesign$setReviews$adapter$2 extends Lambda implements C19861p<Integer, List<? extends ReviewUiModel>, C19394m> {
    public final /* synthetic */ List<ReviewUiModel> $reviews;
    public final /* synthetic */ ListingReviewViewRedesign this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingReviewViewRedesign$setReviews$adapter$2(ListingReviewViewRedesign listingReviewViewRedesign, List<ReviewUiModel> list) {
        super(2);
        this.this$0 = listingReviewViewRedesign;
        this.$reviews = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), (List<ReviewUiModel>) (List) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(int i, List<ReviewUiModel> list) {
        C19383o.m32797g(list, "<anonymous parameter 1>");
        this.this$0.onReviewCarouseVideoClicked(i, this.$reviews);
    }
}
