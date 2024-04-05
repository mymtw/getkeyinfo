package p664rk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget;

/* renamed from: rk.a */
public final class C18482a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ CircularRevealWidget f40712a;

    public C18482a(CircularRevealWidget circularRevealWidget) {
        this.f40712a = circularRevealWidget;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f40712a.destroyCircularRevealCache();
    }

    public final void onAnimationStart(Animator animator) {
        this.f40712a.buildCircularRevealCache();
    }
}
