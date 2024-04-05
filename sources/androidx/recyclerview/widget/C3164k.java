package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.k */
public final class C3164k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C3084b0 f7289a;

    /* renamed from: b */
    public final /* synthetic */ int f7290b;

    /* renamed from: c */
    public final /* synthetic */ View f7291c;

    /* renamed from: d */
    public final /* synthetic */ int f7292d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f7293e;

    /* renamed from: f */
    public final /* synthetic */ C3150h f7294f;

    public C3164k(C3150h hVar, RecyclerView.C3084b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7294f = hVar;
        this.f7289a = b0Var;
        this.f7290b = i;
        this.f7291c = view;
        this.f7292d = i2;
        this.f7293e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f7290b != 0) {
            this.f7291c.setTranslationX(0.0f);
        }
        if (this.f7292d != 0) {
            this.f7291c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7293e.setListener((Animator.AnimatorListener) null);
        this.f7294f.mo11631h(this.f7289a);
        this.f7294f.f7248p.remove(this.f7289a);
        this.f7294f.mo11870s();
    }

    public final void onAnimationStart(Animator animator) {
        this.f7294f.getClass();
    }
}
