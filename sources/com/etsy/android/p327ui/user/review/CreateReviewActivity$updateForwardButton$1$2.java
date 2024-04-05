package com.etsy.android.p327ui.user.review;

import android.view.View;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.stylekit.views.CollageTextInput;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.review.CreateReviewActivity$updateForwardButton$1$2 */
public final class CreateReviewActivity$updateForwardButton$1$2 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C11744s $option;
    public final /* synthetic */ CreateReviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateReviewActivity$updateForwardButton$1$2(CreateReviewActivity createReviewActivity, C11744s sVar) {
        super(1);
        this.this$0 = createReviewActivity;
        this.$option = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        if (((CollageTextInput) this.this$0._$_findCachedViewById(R.id.review_input)) != null) {
            ViewExtensions.m12861e((CollageTextInput) this.this$0._$_findCachedViewById(R.id.review_input));
        }
        this.this$0.getViewModel().mo37851j(this.$option.f26177c);
        ITrackedObject iTrackedObject = this.$option.f26176b;
        String valueOf = String.valueOf(iTrackedObject != null ? C19388s.m32863g0(iTrackedObject) : null);
        if (C19383o.m32792b(valueOf, "listing_star_rating_card_did_rate")) {
            C8703p analyticsContext = this.this$0.getAnalyticsContext();
            PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.RATING_VALUE;
            ReviewFlow reviewFlow = this.this$0.getViewModel().f25946x;
            if (reviewFlow != null) {
                Integer num = reviewFlow.f25980a.f26037c;
                analyticsContext.mo21333d(valueOf, C19421p.m32931U(new Pair(predefinedAnalyticsProperty, Integer.valueOf(num != null ? num.intValue() : 0))));
                return;
            }
            C19383o.m32805o("reviewFlowModel");
            throw null;
        }
        this.this$0.getAnalyticsContext().mo21333d(valueOf, (Map<? extends AnalyticsProperty, Object>) null);
    }
}
