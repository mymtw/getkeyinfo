package com.etsy.android.p327ui;

import android.content.res.Resources;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.SearchFABScrollBehavior */
public final class SearchFABScrollBehavior extends CoordinatorLayout.C2245c<ExtendedFloatingActionButton> {

    /* renamed from: a */
    public final C19285c f19981a;

    /* renamed from: b */
    public int f19982b;

    public SearchFABScrollBehavior(Resources resources) {
        C19383o.m32797g(resources, "resources");
        this.f19981a = C19350d.m32677b(new SearchFABScrollBehavior$shrinkDelay$2(resources));
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
        C19383o.m32797g(coordinatorLayout, "coordinatorLayout");
        C19383o.m32797g(extendedFloatingActionButton, "child");
        C19383o.m32797g(view2, "target");
        int[] iArr2 = iArr;
        C19383o.m32797g(iArr2, "consumed");
        super.onNestedScroll(coordinatorLayout, extendedFloatingActionButton, view2, i, i2, i3, i4, i5, iArr2);
        int i6 = this.f19982b + i2;
        this.f19982b = i6;
        if (i2 < 0) {
            extendedFloatingActionButton.extend();
            this.f19982b = 0;
        } else if (i6 >= ((Number) this.f19981a.getValue()).intValue()) {
            extendedFloatingActionButton.shrink();
        }
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
        C19383o.m32797g(coordinatorLayout, "coordinatorLayout");
        C19383o.m32797g(extendedFloatingActionButton, "child");
        C19383o.m32797g(view2, "directTargetChild");
        C19383o.m32797g(view3, "target");
        return i == 2 || super.onStartNestedScroll(coordinatorLayout, extendedFloatingActionButton, view2, view3, i, i2);
    }
}
