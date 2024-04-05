package p590il;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: il.j */
public final class C17863j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f38787a;

    /* renamed from: b */
    public final /* synthetic */ float f38788b;

    public C17863j(float f, View view) {
        this.f38787a = view;
        this.f38788b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38787a.setTranslationY(this.f38788b);
    }
}
