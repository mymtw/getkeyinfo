package com.etsy.android.feedback;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class FeedbackFragment$buildEmptyView$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ FeedbackFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackFragment$buildEmptyView$2(FeedbackFragment feedbackFragment) {
        super(1);
        this.this$0 = feedbackFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19846a<C19394m> onSeeShopReviewsClicked = this.this$0.getOnSeeShopReviewsClicked();
        if (onSeeShopReviewsClicked != null) {
            onSeeShopReviewsClicked.invoke();
        }
    }
}
