package androidx.core.animation;

import android.animation.Animator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$addPauseListener$listener$1 implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C19857l<Animator, C19394m> $onPause;
    public final /* synthetic */ C19857l<Animator, C19394m> $onResume;

    public AnimatorKt$addPauseListener$listener$1(C19857l<? super Animator, C19394m> lVar, C19857l<? super Animator, C19394m> lVar2) {
        this.$onPause = lVar;
        this.$onResume = lVar2;
    }

    public void onAnimationPause(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onPause.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
