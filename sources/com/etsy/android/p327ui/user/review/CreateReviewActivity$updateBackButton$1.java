package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ITrackedObject;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$updateBackButton$1 */
public final class CreateReviewActivity$updateBackButton$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11700a $option;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$updateBackButton$1(C11700a aVar, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$option = aVar;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getViewModel().mo37851j(this.$option.f26044c);
        C8703p analyticsContext = this.this$0.getAnalyticsContext();
        ITrackedObject iTrackedObject = this.$option.f26043b;
        analyticsContext.mo21333d(String.valueOf(iTrackedObject != null ? C19388s.m32863g0(iTrackedObject) : null), (Map<? extends AnalyticsProperty, Object>) null);
    }
}
