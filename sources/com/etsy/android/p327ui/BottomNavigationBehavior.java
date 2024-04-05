package com.etsy.android.p327ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.BottomNavigationBehavior */
public final class BottomNavigationBehavior extends CoordinatorLayout.C2245c<BottomNavigationView> {

    /* renamed from: e */
    public static final LinearOutSlowInInterpolator f19968e = new LinearOutSlowInInterpolator();

    /* renamed from: a */
    public boolean f19969a;

    /* renamed from: b */
    public int f19970b;

    /* renamed from: c */
    public int f19971c;

    /* renamed from: d */
    public C2330s0 f19972d;

    /* renamed from: com.etsy.android.ui.BottomNavigationBehavior$ScrollDirection */
    public enum ScrollDirection {
        UP,
        DOWN
    }

    public BottomNavigationBehavior() {
    }

    /* renamed from: a */
    public final void mo31235a(BottomNavigationView bottomNavigationView, int i) {
        C2330s0 s0Var = this.f19972d;
        if (s0Var == null) {
            C2330s0 a = C2364y.m5186a(bottomNavigationView);
            this.f19972d = a;
            a.mo8920c(300);
            C2330s0 s0Var2 = this.f19972d;
            C19383o.m32794d(s0Var2);
            LinearOutSlowInInterpolator linearOutSlowInInterpolator = f19968e;
            View view = s0Var2.f5586a.get();
            if (view != null) {
                view.animate().setInterpolator(linearOutSlowInInterpolator);
            }
        } else {
            s0Var.mo8920c(300);
            C2330s0 s0Var3 = this.f19972d;
            C19383o.m32794d(s0Var3);
            s0Var3.mo8919b();
        }
        C2330s0 s0Var4 = this.f19972d;
        C19383o.m32794d(s0Var4);
        s0Var4.mo8923f((float) i);
        s0Var4.mo8922e();
    }

    /* renamed from: b */
    public final void mo31236b(BottomNavigationView bottomNavigationView, ScrollDirection scrollDirection) {
        boolean z = this.f19969a;
        if (scrollDirection == ScrollDirection.DOWN && z) {
            this.f19969a = false;
            mo31235a(bottomNavigationView, 0);
        } else if (scrollDirection == ScrollDirection.UP && !z) {
            this.f19969a = true;
            mo31235a(bottomNavigationView, bottomNavigationView.getHeight());
        }
    }

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view;
        C19383o.m32797g(coordinatorLayout, ResponseConstants.PARENT);
        C19383o.m32797g(bottomNavigationView, "child");
        C19383o.m32797g(view2, "dependency");
        if (view2 instanceof Snackbar.SnackbarLayout) {
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) view2;
            if (snackbarLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
                C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                layoutParams2.setAnchorId(bottomNavigationView.getId());
                layoutParams2.anchorGravity = 48;
                layoutParams2.gravity = 48;
                snackbarLayout.setLayoutParams(layoutParams2);
            }
        }
        return super.layoutDependsOn(coordinatorLayout, bottomNavigationView, view2);
    }

    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view;
        C19383o.m32797g(coordinatorLayout, "coordinatorLayout");
        C19383o.m32797g(bottomNavigationView, "child");
        C19383o.m32797g(view2, "target");
        C19383o.m32797g(iArr, "consumed");
        super.onNestedPreScroll(coordinatorLayout, bottomNavigationView, view2, i, i2, iArr, i3);
        if ((i2 > 0 && this.f19970b < 0) || (i2 < 0 && this.f19970b > 0)) {
            this.f19970b = 0;
        }
        this.f19970b += i2;
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view;
        C19383o.m32797g(coordinatorLayout, "coordinatorLayout");
        C19383o.m32797g(bottomNavigationView, "child");
        C19383o.m32797g(view2, "target");
        int[] iArr2 = iArr;
        C19383o.m32797g(iArr2, "consumed");
        super.onNestedScroll(coordinatorLayout, bottomNavigationView, view2, i, i2, i3, i4, i5, iArr2);
        if ((i4 > 0 && this.f19971c < 0) || (i4 < 0 && this.f19971c > 0)) {
            this.f19971c = 0;
        }
        this.f19971c += i4;
        if (i2 < 0) {
            mo31236b(bottomNavigationView, ScrollDirection.DOWN);
        } else if (i2 > 0) {
            mo31236b(bottomNavigationView, ScrollDirection.UP);
        }
    }

    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) view;
        C19383o.m32797g(coordinatorLayout, "coordinatorLayout");
        C19383o.m32797g(bottomNavigationView, "child");
        C19383o.m32797g(view2, "directTargetChild");
        C19383o.m32797g(view3, "target");
        return i == 2 || super.onStartNestedScroll(coordinatorLayout, bottomNavigationView, view2, view3, i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C19383o.m32797g(context, "ctx");
        C19383o.m32797g(attributeSet, "attrs");
    }
}
