package p590il;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: il.i */
public final class C17862i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f38785a;

    /* renamed from: b */
    public final /* synthetic */ float f38786b;

    public C17862i(float f, View view) {
        this.f38785a = view;
        this.f38786b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38785a.setTranslationX(this.f38786b);
    }
}
