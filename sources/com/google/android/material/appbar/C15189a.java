package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.a */
public final class C15189a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f34078a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f34079b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f34080c;

    public C15189a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f34080c = baseBehavior;
        this.f34078a = coordinatorLayout;
        this.f34079b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34080c.mo69846i(this.f34078a, this.f34079b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
