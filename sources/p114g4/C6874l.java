package p114g4;

import android.view.animation.Animation;
import com.braze.enums.inappmessage.DismissType;
import com.braze.support.BrazeLogger;

/* renamed from: g4.l */
public final class C6874l implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ C6869i f15215a;

    public C6874l(C6869i iVar) {
        this.f15215a = iVar;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f15215a.f15197b.mo15952E() == DismissType.AUTO_DISMISS) {
            this.f15215a.mo18995a();
        }
        BrazeLogger.m11285g(C6869i.f15195o, "In-app message animated into view.");
        C6869i iVar = this.f15215a;
        iVar.mo18998d(iVar.f15197b, iVar.f15196a, iVar.f15198c);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
