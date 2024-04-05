package com.etsy.android.p327ui.user.review;

import com.etsy.android.p327ui.view.AlertData;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$onCreate$10 */
public final class CreateReviewActivity$onCreate$10 extends Lambda implements C19857l<AlertData, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$onCreate$10(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AlertData) obj);
        return C19394m.f43287a;
    }

    public final void invoke(AlertData alertData) {
        C19383o.m32797g(alertData, "it");
        this.this$0.showFloatingAlert(alertData);
    }
}
