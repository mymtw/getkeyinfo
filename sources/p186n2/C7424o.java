package p186n2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: n2.o */
public final class C7424o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C7418m f16588a;

    public C7424o(C7418m mVar) {
        this.f16588a = mVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f16588a.mo19786p();
        animator.removeListener(this);
    }
}
