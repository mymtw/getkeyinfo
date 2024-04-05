package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C3150h;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
public final class C3165l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3150h.C3154d f7295a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7296b;

    /* renamed from: c */
    public final /* synthetic */ View f7297c;

    /* renamed from: d */
    public final /* synthetic */ C3150h f7298d;

    public C3165l(C3150h hVar, C3150h.C3154d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7298d = hVar;
        this.f7295a = dVar;
        this.f7296b = viewPropertyAnimator;
        this.f7297c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7296b.setListener((Animator.AnimatorListener) null);
        this.f7297c.setAlpha(1.0f);
        this.f7297c.setTranslationX(0.0f);
        this.f7297c.setTranslationY(0.0f);
        this.f7298d.mo11631h(this.f7295a.f7257a);
        this.f7298d.f7250r.remove(this.f7295a.f7257a);
        this.f7298d.mo11870s();
    }

    public final void onAnimationStart(Animator animator) {
        C3150h hVar = this.f7298d;
        RecyclerView.C3084b0 b0Var = this.f7295a.f7257a;
        hVar.getClass();
    }
}
