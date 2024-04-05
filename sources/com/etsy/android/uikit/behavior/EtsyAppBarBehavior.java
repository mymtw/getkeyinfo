package com.etsy.android.uikit.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class EtsyAppBarBehavior extends AppBarLayout.Behavior {
    public EtsyAppBarBehavior() {
    }

    /* renamed from: m */
    public final boolean mo38331m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2) {
        boolean z;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                z = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof EtsySlidingBottomSheetBehavior;
                return !z;
            }
        }
        z = false;
        return !z;
    }

    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return mo38331m(coordinatorLayout, (AppBarLayout) view, view2, i, i2);
    }

    public EtsyAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
