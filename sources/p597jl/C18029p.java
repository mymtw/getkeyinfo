package p597jl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jl.p */
public final class C18029p extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f39443a;

    /* renamed from: b */
    public final /* synthetic */ float f39444b;

    public C18029p(float f, View view) {
        this.f39443a = view;
        this.f39444b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f39443a.setTranslationX(this.f39444b);
    }
}
