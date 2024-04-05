package com.etsy.android.stylekit.adapters;

import android.view.View;
import com.etsy.android.stylekit.accessibility.navigation.extensions.NavigationExtensionsKt;
import kotlin.jvm.internal.C19383o;

public final class CollageArrayAdapter$a11yFocusOnAttachStateChangeListener$1 implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
        NavigationExtensionsKt.m17420a(view, 500);
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
    }
}
