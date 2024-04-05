package com.etsy.android.p327ui.user.review;

import android.os.Bundle;
import com.etsy.android.lib.deeplinks.EtsyAction;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p370ie.C12948h;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$onCreate$6 */
public final class CreateReviewActivity$onCreate$6 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$onCreate$6(CreateReviewActivity createReviewActivity) {
        super(1);
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "transactionId");
        this.this$0.signInForReviewResult.mo1157b(new C12948h(C19421p.m32935c0(this.this$0), EtsyAction.PURCHASE_REVIEW, (Bundle) null, str, (String) null, (String) null, 52));
    }
}
