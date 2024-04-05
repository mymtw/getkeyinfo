package p590il;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: il.g */
public final class C17860g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ View f38779a;

    /* renamed from: b */
    public final /* synthetic */ float f38780b;

    /* renamed from: c */
    public final /* synthetic */ float f38781c;

    public C17860g(float f, float f2, View view) {
        this.f38779a = view;
        this.f38780b = f;
        this.f38781c = f2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38779a.setScaleX(this.f38780b);
        this.f38779a.setScaleY(this.f38781c);
    }
}
