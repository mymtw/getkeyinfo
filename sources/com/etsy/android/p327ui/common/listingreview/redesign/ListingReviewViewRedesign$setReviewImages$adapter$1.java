package com.etsy.android.p327ui.common.listingreview.redesign;

import kotlin.C19394m;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.common.listingreview.redesign.ListingReviewViewRedesign$setReviewImages$adapter$1 */
public /* synthetic */ class ListingReviewViewRedesign$setReviewImages$adapter$1 extends FunctionReferenceImpl implements C19857l<Integer, C19394m> {
    public ListingReviewViewRedesign$setReviewImages$adapter$1(Object obj) {
        super(1, obj, ListingReviewViewRedesign.class, "onReviewCarouselImageClicked", "onReviewCarouselImageClicked(I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(int i) {
        ((ListingReviewViewRedesign) this.receiver).onReviewCarouselImageClicked(i);
    }
}
