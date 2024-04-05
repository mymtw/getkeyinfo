package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C3150h;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
public final class C3166m extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3150h.C3154d f7299a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7300b;

    /* renamed from: c */
    public final /* synthetic */ View f7301c;

    /* renamed from: d */
    public final /* synthetic */ C3150h f7302d;

    public C3166m(C3150h hVar, C3150h.C3154d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7302d = hVar;
        this.f7299a = dVar;
        this.f7300b = viewPropertyAnimator;
        this.f7301c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7300b.setListener((Animator.AnimatorListener) null);
        this.f7301c.setAlpha(1.0f);
        this.f7301c.setTranslationX(0.0f);
        this.f7301c.setTranslationY(0.0f);
        this.f7302d.mo11631h(this.f7299a.f7258b);
        this.f7302d.f7250r.remove(this.f7299a.f7258b);
        this.f7302d.mo11870s();
    }

    public final void onAnimationStart(Animator animator) {
        C3150h hVar = this.f7302d;
        RecyclerView.C3084b0 b0Var = this.f7299a.f7258b;
        hVar.getClass();
    }
}
