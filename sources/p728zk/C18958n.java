package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zk.n */
public final class C18958n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18960p f42270a;

    public C18958n(C18960p pVar) {
        this.f42270a = pVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18960p pVar = this.f42270a;
        pVar.f42279h = (pVar.f42279h + 1) % pVar.f42278g.f42226c.length;
        pVar.f42280i = true;
    }
}
