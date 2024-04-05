package com.etsy.android.uikit.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.lib.util.C8914m;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

public class EtsySlidingBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: a */
    public int f26351a = -1;

    public EtsySlidingBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (!C2364y.C2371g.m5246c(v)) {
            setState(5);
        }
        if (getState() == 4) {
            setState(3);
        }
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int height = coordinatorLayout.getHeight() - v.getTop();
        Context context = v.getContext();
        if (this.f26351a == -1) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if (C8914m.f19669c == 0.0f) {
                C8914m.m17348f(context);
            }
            this.f26351a = (int) ((((float) displayMetrics.densityDpi) / 160.0f) * 200.0f);
        }
        setSkipCollapsed(height < this.f26351a);
        setPeekHeight(height);
        super.onStopNestedScroll(coordinatorLayout, v, view, i);
    }

    public EtsySlidingBottomSheetBehavior() {
    }
}
