package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: androidx.core.view.q0 */
public final class C2326q0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C2332t0 f5583a;

    /* renamed from: b */
    public final /* synthetic */ View f5584b;

    public C2326q0(C2332t0 t0Var, View view) {
        this.f5583a = t0Var;
        this.f5584b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f5583a.mo3011c(this.f5584b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5583a.onAnimationEnd();
    }

    public final void onAnimationStart(Animator animator) {
        this.f5583a.mo1391b();
    }
}
