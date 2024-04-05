package com.etsy.android.p327ui.user.review;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showVideoConfirmationStep$7 */
public final class CreateReviewActivity$showVideoConfirmationStep$7 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showVideoConfirmationStep$7(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getViewModel().mo37851j(NavigationAction.SUBMIT);
    }
}
