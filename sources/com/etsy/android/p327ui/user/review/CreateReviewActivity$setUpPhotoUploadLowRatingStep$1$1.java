package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.p327ui.user.review.C11719r;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadLowRatingStep$1$1 */
public final class CreateReviewActivity$setUpPhotoUploadLowRatingStep$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11719r.C11742w $state;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$setUpPhotoUploadLowRatingStep$1$1(C11719r.C11742w wVar, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$state = wVar;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        String g0;
        ITrackedObject iTrackedObject = this.$state.f26164i;
        if (!(iTrackedObject == null || (g0 = C19388s.m32863g0(iTrackedObject)) == null)) {
            this.this$0.getAnalyticsContext().mo21333d(g0, (Map<? extends AnalyticsProperty, Object>) null);
        }
        this.this$0.getViewModel().mo37852k();
    }
}
