package com.etsy.android.p327ui.user.review;

import android.net.Uri;
import android.view.View;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showEditVideoPopup$1$1 */
public final class CreateReviewActivity$showEditVideoPopup$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CollageBottomSheet $this_apply;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showEditVideoPopup$1$1(CollageBottomSheet collageBottomSheet, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$this_apply = collageBottomSheet;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C19394m mVar;
        this.$this_apply.dismiss();
        this.this$0.updateVideoDurationIntentExtra();
        C11701a0 access$getReviewsFileManager$p = this.this$0.reviewsFileManager;
        Uri a = access$getReviewsFileManager$p != null ? access$getReviewsFileManager$p.mo37966a() : null;
        if (a != null) {
            this.this$0.recordVideoLauncher.mo1157b(a);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            this.this$0.getViewModel().f25930h.postValue(new C11719r.C11725f(ReviewScreen.VIDEO, R.string.add_video_error, R.string.please_try_again, false, 42));
        }
        this.this$0.getAnalyticsContext().mo21333d(ReviewEvent.RETAKES_VIDEO.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
    }
}
