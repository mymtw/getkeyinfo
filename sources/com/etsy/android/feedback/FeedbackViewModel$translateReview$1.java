package com.etsy.android.feedback;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class FeedbackViewModel$translateReview$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ ReviewUiModel $review;
    public final /* synthetic */ FeedbackViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel$translateReview$1(FeedbackViewModel feedbackViewModel, ReviewUiModel reviewUiModel) {
        super(1);
        this.this$0 = feedbackViewModel;
        this.$review = reviewUiModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        FeedbackViewModel.m12873b(this.this$0, this.$review);
    }
}
