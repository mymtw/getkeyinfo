package com.etsy.android.p327ui.home.landingpage;

import android.view.ViewTreeObserver;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageFragment$onViewCreated$performanceTracker$1 */
public final class LandingPageFragment$onViewCreated$performanceTracker$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ LandingPageFragment this$0;

    public LandingPageFragment$onViewCreated$performanceTracker$1(LandingPageFragment landingPageFragment) {
        this.this$0 = landingPageFragment;
    }

    public void onGlobalLayout() {
        if (this.this$0.recyclerView != null && this.this$0.getPerformanceTrackerAdapter().mo21373e()) {
            this.this$0.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
