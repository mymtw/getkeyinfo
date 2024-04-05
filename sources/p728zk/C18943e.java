package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* renamed from: zk.e */
public final class C18943e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18944f f42235a;

    public C18943e(C18944f fVar) {
        this.f42235a = fVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42235a.mo70384a();
        Animatable2Compat.C3306a aVar = this.f42235a.f42248k;
        if (aVar != null) {
            aVar.mo12418a();
        }
    }
}
