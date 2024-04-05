package p114g4;

import android.view.animation.Animation;

/* renamed from: g4.m */
public final class C6875m implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C6869i f15216a;

    public C6875m(C6869i iVar) {
        this.f15216a = iVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f15216a.f15196a.clearAnimation();
        this.f15216a.f15196a.setVisibility(8);
        this.f15216a.mo18997c();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
