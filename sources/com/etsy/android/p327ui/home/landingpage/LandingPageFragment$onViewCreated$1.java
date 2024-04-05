package com.etsy.android.p327ui.home.landingpage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageFragment$onViewCreated$1 */
public final class LandingPageFragment$onViewCreated$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener $performanceTracker;

    public LandingPageFragment$onViewCreated$1(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.$performanceTracker = onGlobalLayoutListener;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.$performanceTracker);
    }
}
