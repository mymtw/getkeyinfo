package com.etsy.android.feedback;

import com.etsy.android.feedback.data.Rating;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ItemReviewsFragment$onCreateView$2 extends Lambda implements C19857l<Rating, C19394m> {
    public final /* synthetic */ ItemReviewsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemReviewsFragment$onCreateView$2(ItemReviewsFragment itemReviewsFragment) {
        super(1);
        this.this$0 = itemReviewsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Rating) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Rating rating) {
        C19383o.m32797g(rating, "it");
        FeedbackViewModel access$getViewModel$p = this.this$0.viewModel;
        if (access$getViewModel$p != null) {
            access$getViewModel$p.mo18352l(rating);
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }
}
