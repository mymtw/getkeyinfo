package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class TransitionKt$doOnCancel$$inlined$addListener$default$1 implements Transition.TransitionListener {
    public final /* synthetic */ C19857l $onCancel;

    public TransitionKt$doOnCancel$$inlined$addListener$default$1(C19857l lVar) {
        this.$onCancel = lVar;
    }

    public void onTransitionCancel(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionPause(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionResume(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }

    public void onTransitionStart(Transition transition) {
        C19383o.m32797g(transition, "transition");
    }
}
