package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.a */
public final class C15545a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f34942a;

    public C15545a(View view) {
        this.f34942a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34942a.invalidate();
    }
}
