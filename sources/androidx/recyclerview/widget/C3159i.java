package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public final class C3159i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C3084b0 f7275a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f7276b;

    /* renamed from: c */
    public final /* synthetic */ View f7277c;

    /* renamed from: d */
    public final /* synthetic */ C3150h f7278d;

    public C3159i(View view, ViewPropertyAnimator viewPropertyAnimator, C3150h hVar, RecyclerView.C3084b0 b0Var) {
        this.f7278d = hVar;
        this.f7275a = b0Var;
        this.f7276b = viewPropertyAnimator;
        this.f7277c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7276b.setListener((Animator.AnimatorListener) null);
        this.f7277c.setAlpha(1.0f);
        this.f7278d.mo11631h(this.f7275a);
        this.f7278d.f7249q.remove(this.f7275a);
        this.f7278d.mo11870s();
    }

    public final void onAnimationStart(Animator animator) {
        this.f7278d.getClass();
    }
}
