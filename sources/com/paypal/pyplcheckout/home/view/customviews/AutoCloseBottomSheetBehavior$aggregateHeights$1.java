package com.paypal.pyplcheckout.home.view.customviews;

import android.view.View;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AutoCloseBottomSheetBehavior$aggregateHeights$1 extends Lambda implements C19857l<View, Integer> {
    public static final AutoCloseBottomSheetBehavior$aggregateHeights$1 INSTANCE = new AutoCloseBottomSheetBehavior$aggregateHeights$1();

    public AutoCloseBottomSheetBehavior$aggregateHeights$1() {
        super(1);
    }

    public final Integer invoke(View view) {
        C19383o.m32797g(view, "it");
        return Integer.valueOf(view.getHeight());
    }
}
