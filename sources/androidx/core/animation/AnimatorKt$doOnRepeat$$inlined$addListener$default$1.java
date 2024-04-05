package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$doOnRepeat$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C19857l $onRepeat;

    public AnimatorKt$doOnRepeat$$inlined$addListener$default$1(C19857l lVar) {
        this.$onRepeat = lVar;
    }

    public void onAnimationCancel(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onRepeat.invoke(animator);
    }

    public void onAnimationStart(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }
}
