package p597jl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jl.q */
public final class C18030q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f39445a;

    /* renamed from: b */
    public final /* synthetic */ float f39446b;

    public C18030q(float f, View view) {
        this.f39445a = view;
        this.f39446b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f39445a.setTranslationY(this.f39446b);
    }
}
