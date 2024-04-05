package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0174p;

/* renamed from: androidx.core.view.r0 */
public final class C2328r0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C2334u0 f5585a;

    public C2328r0(C0174p.C0177c cVar, View view) {
        this.f5585a = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) C0174p.this.f428d.getParent()).invalidate();
    }
}
