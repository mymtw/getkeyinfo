package androidx.core.transition;

import android.transition.Transition;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    public final /* synthetic */ C19857l<Transition, C19394m> $onCancel;
    public final /* synthetic */ C19857l<Transition, C19394m> $onEnd;
    public final /* synthetic */ C19857l<Transition, C19394m> $onPause;
    public final /* synthetic */ C19857l<Transition, C19394m> $onResume;
    public final /* synthetic */ C19857l<Transition, C19394m> $onStart;

    public TransitionKt$addListener$listener$1(C19857l<? super Transition, C19394m> lVar, C19857l<? super Transition, C19394m> lVar2, C19857l<? super Transition, C19394m> lVar3, C19857l<? super Transition, C19394m> lVar4, C19857l<? super Transition, C19394m> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    public void onTransitionCancel(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    public void onTransitionPause(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        C19383o.m32797g(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
