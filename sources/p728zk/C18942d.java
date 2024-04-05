package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zk.d */
public final class C18942d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18944f f42234a;

    public C18942d(C18944f fVar) {
        this.f42234a = fVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18944f fVar = this.f42234a;
        fVar.f42245h = (fVar.f42245h + 4) % fVar.f42244g.f42226c.length;
    }
}
