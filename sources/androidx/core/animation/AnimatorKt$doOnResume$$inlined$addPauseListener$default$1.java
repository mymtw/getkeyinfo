package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$doOnResume$$inlined$addPauseListener$default$1 implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C19857l $onResume;

    public AnimatorKt$doOnResume$$inlined$addPauseListener$default$1(C19857l lVar) {
        this.$onResume = lVar;
    }

    public void onAnimationPause(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationResume(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
