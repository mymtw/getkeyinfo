package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.C3185q;

/* renamed from: androidx.recyclerview.widget.s */
public final class C3196s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C3185q.C3193f f7430a;

    public C3196s(C3185q.C3193f fVar) {
        this.f7430a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7430a.f7425m = valueAnimator.getAnimatedFraction();
    }
}
