package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$doOnPause$$inlined$addPauseListener$default$1 implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C19857l $onPause;

    public AnimatorKt$doOnPause$$inlined$addPauseListener$default$1(C19857l lVar) {
        this.$onPause = lVar;
    }

    public void onAnimationPause(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onPause.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }
}
