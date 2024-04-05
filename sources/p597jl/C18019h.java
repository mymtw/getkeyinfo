package p597jl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jl.h */
public final class C18019h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f39426a;

    /* renamed from: b */
    public final /* synthetic */ float f39427b;

    public C18019h(float f, View view) {
        this.f39426a = view;
        this.f39427b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f39426a.setAlpha(this.f39427b);
    }
}
