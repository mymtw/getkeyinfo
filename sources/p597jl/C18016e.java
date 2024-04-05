package p597jl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: jl.e */
public final class C18016e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f39418a;

    /* renamed from: b */
    public final /* synthetic */ float f39419b;

    public C18016e(float f, View view) {
        this.f39418a = view;
        this.f39419b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f39418a.setAlpha(this.f39419b);
    }
}
