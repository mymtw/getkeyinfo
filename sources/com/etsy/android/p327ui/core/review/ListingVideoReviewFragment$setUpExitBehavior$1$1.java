package com.etsy.android.p327ui.core.review;

import android.view.View;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p356ge.C12788a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.review.ListingVideoReviewFragment$setUpExitBehavior$1$1 */
public final class ListingVideoReviewFragment$setUpExitBehavior$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ListingVideoReviewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListingVideoReviewFragment$setUpExitBehavior$1$1(ListingVideoReviewFragment listingVideoReviewFragment) {
        super(1);
        this.this$0 = listingVideoReviewFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.getAnalyticsContext().mo21333d(DisplayVideoReviewsEvent.VIDEO_REVIEW_TAPPED_X.getEventName(), (Map<? extends AnalyticsProperty, Object>) null);
        if (!this.this$0.getConfigMap().mo21132b(C8592b.f18847y1) || this.this$0.getListener() == null) {
            C12788a.m20426e(this.this$0.getActivity());
        } else {
            this.this$0.getListener().handleDismiss();
        }
    }
}
