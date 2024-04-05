package com.etsy.android.p327ui.user.review;

import com.etsy.android.util.C12060q;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewViewModel$onSignInResult$1 */
final class CreateReviewViewModel$onSignInResult$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ String $transactionId;
    public final /* synthetic */ CreateReviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewViewModel$onSignInResult$1(CreateReviewViewModel createReviewViewModel, String str) {
        super(0);
        this.this$0 = createReviewViewModel;
        this.$transactionId = str;
    }

    public final void invoke() {
        C12060q.m19871b(this.this$0.f25944v, this.$transactionId);
    }
}
