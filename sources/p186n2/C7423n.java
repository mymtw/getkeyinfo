package p186n2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p193o.C7494b;

/* renamed from: n2.n */
public final class C7423n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C7494b f16586a;

    /* renamed from: b */
    public final /* synthetic */ C7418m f16587b;

    public C7423n(C7418m mVar, C7494b bVar) {
        this.f16587b = mVar;
        this.f16586a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16586a.remove(animator);
        this.f16587b.f16572n.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f16587b.f16572n.add(animator);
    }
}
