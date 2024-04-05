package p590il;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: il.b */
public final class C17855b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f38774a;

    /* renamed from: b */
    public final /* synthetic */ float f38775b;

    public C17855b(float f, View view) {
        this.f38774a = view;
        this.f38775b = f;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38774a.setAlpha(this.f38775b);
    }
}
