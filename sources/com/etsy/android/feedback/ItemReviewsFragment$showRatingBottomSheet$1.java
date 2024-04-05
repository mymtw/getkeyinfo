package com.etsy.android.feedback;

import com.etsy.android.feedback.data.Rating;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

public /* synthetic */ class ItemReviewsFragment$showRatingBottomSheet$1 extends FunctionReferenceImpl implements C19857l<Rating, C19394m> {
    public ItemReviewsFragment$showRatingBottomSheet$1(Object obj) {
        super(1, obj, FeedbackViewModel.class, "updateRating", "updateRating(Lcom/etsy/android/feedback/data/Rating;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Rating) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Rating rating) {
        C19383o.m32797g(rating, "p0");
        ((FeedbackViewModel) this.receiver).mo18352l(rating);
    }
}
