package p647pk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: pk.a */
public final class C18391a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ HideBottomViewOnScrollBehavior f40449a;

    public C18391a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f40449a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f40449a.f34094d = null;
    }
}
