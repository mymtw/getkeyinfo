package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showAddVideoPopup$1$2 */
public final class CreateReviewActivity$showAddVideoPopup$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11719r.C11721b $state;
    public final /* synthetic */ CollageBottomSheet $this_apply;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showAddVideoPopup$1$2(CollageBottomSheet collageBottomSheet, CreateReviewActivity createReviewActivity, C11719r.C11721b bVar) {
        super(1);
        this.$this_apply = collageBottomSheet;
        this.this$0 = createReviewActivity;
        this.$state = bVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        String g0;
        this.$this_apply.dismiss();
        this.this$0.selectVideoFromGalleryLauncher.mo1157b("video/*");
        ITrackedObject iTrackedObject = this.$state.f26075e;
        if (iTrackedObject != null && (g0 = C19388s.m32863g0(iTrackedObject)) != null) {
            this.this$0.getAnalyticsContext().mo21333d(g0, (Map<? extends AnalyticsProperty, Object>) null);
        }
    }
}
