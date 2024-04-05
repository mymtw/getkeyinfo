package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.h0 */
public final class C2765h0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f6303a;

    public C2765h0(C2770k kVar) {
        this.f6303a = kVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f6303a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
