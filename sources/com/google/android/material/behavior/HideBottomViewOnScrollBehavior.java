package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p220r1.C7738a;
import p629nk.C18268a;
import p647pk.C18391a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C2245c<V> {

    /* renamed from: a */
    public int f34091a = 0;

    /* renamed from: b */
    public int f34092b = 2;

    /* renamed from: c */
    public int f34093c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f34094d;

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: a */
    public final void mo53105a(View view, int i, long j, C7738a aVar) {
        this.f34094d = view.animate().translationY((float) i).setInterpolator(aVar).setDuration(j).setListener(new C18391a(this));
    }

    /* renamed from: b */
    public final void mo53106b(V v, boolean z) {
        if (!(this.f34092b == 1)) {
            ViewPropertyAnimator viewPropertyAnimator = this.f34094d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f34092b = 1;
            int i = this.f34091a + this.f34093c;
            if (z) {
                mo53105a(v, i, 175, C18268a.f40093c);
            } else {
                v.setTranslationY((float) i);
            }
        }
    }

    /* renamed from: c */
    public final void mo53107c(V v, boolean z) {
        if (!(this.f34092b == 2)) {
            ViewPropertyAnimator viewPropertyAnimator = this.f34094d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f34092b = 2;
            if (z) {
                mo53105a(v, 0, 225, C18268a.f40094d);
            } else {
                v.setTranslationY((float) 0);
            }
        }
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f34091a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo53106b(v, true);
        } else if (i2 < 0) {
            mo53107c(v, true);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
