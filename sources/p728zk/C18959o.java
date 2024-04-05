package p728zk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* renamed from: zk.o */
public final class C18959o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C18960p f42271a;

    public C18959o(C18960p pVar) {
        this.f42271a = pVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42271a.mo70384a();
        Animatable2Compat.C3306a aVar = this.f42271a.f42282k;
        if (aVar != null) {
            aVar.mo12418a();
        }
    }
}
