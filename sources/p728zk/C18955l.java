package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: zk.l */
public final class C18955l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18956m f42262a;

    public C18955l(C18956m mVar) {
        this.f42262a = mVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C18956m mVar = this.f42262a;
        mVar.f42267g = (mVar.f42267g + 1) % mVar.f42266f.f42226c.length;
        mVar.f42268h = true;
    }
}
