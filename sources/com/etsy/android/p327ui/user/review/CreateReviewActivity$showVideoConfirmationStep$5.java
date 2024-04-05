package com.etsy.android.p327ui.user.review;

import android.net.Uri;
import android.view.View;
import com.etsy.android.p327ui.user.review.C11719r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showVideoConfirmationStep$5 */
public final class CreateReviewActivity$showVideoConfirmationStep$5 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11719r.C11743x $state;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showVideoConfirmationStep$5(CreateReviewActivity createReviewActivity, C11719r.C11743x xVar) {
        super(1);
        this.this$0 = createReviewActivity;
        this.$state = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        CreateReviewActivity createReviewActivity = this.this$0;
        Uri uri = this.$state.f26172g;
        C19383o.m32795e(uri, "null cannot be cast to non-null type android.net.Uri");
        createReviewActivity.showFullscreenVideoPreview(uri);
    }
}
