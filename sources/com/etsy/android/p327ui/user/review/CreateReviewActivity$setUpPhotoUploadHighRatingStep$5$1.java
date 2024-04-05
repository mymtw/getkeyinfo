package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.stylekit.views.CollageAlert;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$setUpPhotoUploadHighRatingStep$5$1 */
public final class CreateReviewActivity$setUpPhotoUploadHighRatingStep$5$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11719r.C11741v $state;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$setUpPhotoUploadHighRatingStep$5$1(C11719r.C11741v vVar, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$state = vVar;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        String g0;
        ITrackedObject iTrackedObject = this.$state.f26153i;
        if (!(iTrackedObject == null || (g0 = C19388s.m32863g0(iTrackedObject)) == null)) {
            this.this$0.getAnalyticsContext().mo21333d(g0, (Map<? extends AnalyticsProperty, Object>) null);
        }
        CreateReviewViewModel viewModel = this.this$0.getViewModel();
        if (C19382n.m32706E0()) {
            viewModel.f25930h.postValue(C11719r.C11733n.f26114b);
        } else {
            viewModel.f25930h.postValue(C11719r.C11735p.f26122b);
        }
        CollageAlert collageAlert = (CollageAlert) this.this$0._$_findCachedViewById(R.id.video_reviews_tooltip_high_rating);
        C19383o.m32796f(collageAlert, "video_reviews_tooltip_high_rating");
        if (collageAlert.getVisibility() == 0) {
            this.this$0.showTooltipForNewVideoReviews(Boolean.FALSE);
        }
    }
}
