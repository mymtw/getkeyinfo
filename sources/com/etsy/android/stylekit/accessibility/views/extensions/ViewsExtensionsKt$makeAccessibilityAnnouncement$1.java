package com.etsy.android.stylekit.accessibility.views.extensions;

import android.view.View;
import kotlin.jvm.internal.C19383o;

public final class ViewsExtensionsKt$makeAccessibilityAnnouncement$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Runnable $makeAnnouncement;
    public final /* synthetic */ View $this_makeAccessibilityAnnouncement;

    public ViewsExtensionsKt$makeAccessibilityAnnouncement$1(View view, Runnable runnable) {
        this.$this_makeAccessibilityAnnouncement = view;
        this.$makeAnnouncement = runnable;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        this.$this_makeAccessibilityAnnouncement.removeCallbacks(this.$makeAnnouncement);
    }
}
