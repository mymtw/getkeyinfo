package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class TransitionKt$doOnResume$$inlined$addListener$default$1 implements Transition.TransitionListener {
    public final /* synthetic */ C19857l $onResume;

    public TransitionKt$doOnResume$$inlined$addListener$default$1(C19857l lVar) {
        this.$onResume = lVar;
    }

    public void onTransitionCancel(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionEnd(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionPause(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionResume(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }
}
