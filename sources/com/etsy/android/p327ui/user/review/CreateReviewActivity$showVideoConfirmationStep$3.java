package com.etsy.android.p327ui.user.review;

import android.net.Uri;
import android.view.View;
import com.etsy.android.p327ui.user.review.C11719r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showVideoConfirmationStep$3 */
public final class CreateReviewActivity$showVideoConfirmationStep$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11719r.C11743x $state;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showVideoConfirmationStep$3(C11719r.C11743x xVar, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$state = xVar;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        String str = this.$state.f26173h;
        if (str != null) {
            Uri parse = Uri.parse(str);
            C19383o.m32796f(parse, "parse(this)");
            this.this$0.showFullscreenVideoPreview(parse);
        }
    }
}
