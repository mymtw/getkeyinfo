package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class AnimatorKt$doOnStart$$inlined$addListener$default$1 implements Animator.AnimatorListener {
    public final /* synthetic */ C19857l $onStart;

    public AnimatorKt$doOnStart$$inlined$addListener$default$1(C19857l lVar) {
        this.$onStart = lVar;
    }

    public void onAnimationCancel(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationEnd(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationRepeat(Animator animator) {
        C19383o.m32797g(animator, "animator");
    }

    public void onAnimationStart(Animator animator) {
        C19383o.m32797g(animator, "animator");
        this.$onStart.invoke(animator);
    }
}
