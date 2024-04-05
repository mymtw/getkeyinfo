package com.etsy.android.stylekit.accessibility.navigation.extensions;

import android.view.View;
import kotlin.jvm.internal.C19383o;

public final class NavigationExtensionsKt$requestSystemAndAccessibilityFocus$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Runnable $requestFocus;
    public final /* synthetic */ View $this_requestSystemAndAccessibilityFocus;

    public NavigationExtensionsKt$requestSystemAndAccessibilityFocus$1(View view, Runnable runnable) {
        this.$this_requestSystemAndAccessibilityFocus = view;
        this.$requestFocus = runnable;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        this.$this_requestSystemAndAccessibilityFocus.removeCallbacks(this.$requestFocus);
    }
}
