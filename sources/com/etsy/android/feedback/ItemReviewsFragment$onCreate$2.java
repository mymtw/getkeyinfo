package com.etsy.android.feedback;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

public /* synthetic */ class ItemReviewsFragment$onCreate$2 extends FunctionReferenceImpl implements C19857l<ReviewUiModel, C19394m> {
    public ItemReviewsFragment$onCreate$2(Object obj) {
        super(1, obj, ItemReviewsFragment.class, "onReviewClicked", "onReviewClicked(Lcom/etsy/android/feedback/ReviewUiModel;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ReviewUiModel) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ReviewUiModel reviewUiModel) {
        C19383o.m32797g(reviewUiModel, "p0");
        ((ItemReviewsFragment) this.receiver).onReviewClicked(reviewUiModel);
    }
}
