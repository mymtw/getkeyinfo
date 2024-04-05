package androidx.core.animation;

import android.animation.Animator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C19857l<Animator, C19394m> $onCancel;
    public final /* synthetic */ C19857l<Animator, C19394m> $onEnd;
    public final /* synthetic */ C19857l<Animator, C19394m> $onRepeat;
    public final /* synthetic */ C19857l<Animator, C19394m> $onStart;

    public AnimatorKt$addListener$listener$1(C19857l<? super Animator, C19394m> lVar, C19857l<? super Animator, C19394m> lVar2, C19857l<? super Animator, C19394m> lVar3, C19857l<? super Animator, C19394m> lVar4) {
        this.$onRepeat = lVar;
        this.$onEnd = lVar2;
        this.$onCancel = lVar3;
        this.$onStart = lVar4;
    }

    public void onAnimationCancel(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onCancel.invoke(animator);
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onEnd.invoke(animator);
    }

    public void onAnimationRepeat(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    public void onAnimationStart(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
