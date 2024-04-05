package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
public final class C3163j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C3084b0 f7285a;

    /* renamed from: b */
    public final /* synthetic */ View f7286b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f7287c;

    /* renamed from: d */
    public final /* synthetic */ C3150h f7288d;

    public C3163j(View view, ViewPropertyAnimator viewPropertyAnimator, C3150h hVar, RecyclerView.C3084b0 b0Var) {
        this.f7288d = hVar;
        this.f7285a = b0Var;
        this.f7286b = view;
        this.f7287c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f7286b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7287c.setListener((Animator.AnimatorListener) null);
        this.f7288d.mo11631h(this.f7285a);
        this.f7288d.f7247o.remove(this.f7285a);
        this.f7288d.mo11870s();
    }

    public final void onAnimationStart(Animator animator) {
        this.f7288d.getClass();
    }
}
