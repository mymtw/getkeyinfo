package p597jl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jl.n */
public final class C18027n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f39436a;

    /* renamed from: b */
    public final /* synthetic */ float f39437b;

    /* renamed from: c */
    public final /* synthetic */ float f39438c;

    public C18027n(float f, float f2, View view) {
        this.f39436a = view;
        this.f39437b = f;
        this.f39438c = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f39436a.setScaleX(this.f39437b);
        this.f39436a.setScaleY(this.f39438c);
    }
}
