package com.braze.p044ui.inappmessage.listeners;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: com.braze.ui.inappmessage.listeners.e */
public final /* synthetic */ class C5675e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissTouchListener f12082a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup.LayoutParams f12083b;

    public /* synthetic */ C5675e(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams) {
        this.f12082a = swipeDismissTouchListener;
        this.f12083b = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12082a.lambda$performDismiss$0(this.f12083b, valueAnimator);
    }
}
