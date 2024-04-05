package com.etsy.android.p327ui.user.review;

import android.view.View;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.p327ui.user.review.C11719r;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$showEditVideoPopup$1$3 */
public final class CreateReviewActivity$showEditVideoPopup$1$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ CollageBottomSheet $this_apply;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$showEditVideoPopup$1$3(CollageBottomSheet collageBottomSheet, CreateReviewActivity createReviewActivity) {
        super(1);
        this.$this_apply = collageBottomSheet;
        this.this$0 = createReviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.$this_apply.dismiss();
        CreateReviewViewModel viewModel = this.this$0.getViewModel();
        viewModel.f25913E = null;
        viewModel.f25914F = null;
        C2895z<C11719r> zVar = viewModel.f25930h;
        C11719r.C11743x xVar = viewModel.f25922N;
        if (xVar != null) {
            xVar.f26167b = "";
            xVar.f26168c = "";
            xVar.f26169d = null;
            xVar.f26170e = "";
            xVar.f26171f = null;
            xVar.f26172g = null;
            xVar.f26173h = null;
        } else {
            xVar = null;
        }
        zVar.postValue(xVar);
        viewModel.mo37860t();
        this.this$0.getAnalyticsContext().mo21333d(ReviewEvent.DELETES_VIDEO.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
    }
}
