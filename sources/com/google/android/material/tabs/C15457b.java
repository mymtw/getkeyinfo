package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.b */
public final class C15457b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f34713a;

    /* renamed from: b */
    public final /* synthetic */ View f34714b;

    /* renamed from: c */
    public final /* synthetic */ TabLayout.C15452f f34715c;

    public C15457b(TabLayout.C15452f fVar, View view, View view2) {
        this.f34715c = fVar;
        this.f34713a = view;
        this.f34714b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34715c.mo54876c(this.f34713a, this.f34714b, valueAnimator.getAnimatedFraction());
    }
}
