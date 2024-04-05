package p402n9;

import com.braze.C5416d;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.session.SessionSettings;
import com.etsy.android.p327ui.user.ReceiptFragment;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p425q9.C13265p;

/* renamed from: n9.e */
public final /* synthetic */ class C13085e implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28768b;

    /* renamed from: c */
    public final /* synthetic */ Object f28769c;

    public /* synthetic */ C13085e(Object obj, int i) {
        this.f28768b = i;
        this.f28769c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f28768b) {
            case 0:
                C13092l lVar = (C13092l) this.f28769c;
                C5416d dVar = (C5416d) obj;
                C19383o.m32797g(lVar, "this$0");
                lVar.f28780a.unregisterActivityLifecycleCallbacks(lVar.f28781b);
                lVar.f28780a.registerActivityLifecycleCallbacks(lVar.f28781b);
                return;
            case 1:
                C13265p pVar = (C13265p) this.f28769c;
                SessionSettings sessionSettings = (SessionSettings) obj;
                pVar.f29152r.mo45910d(sessionSettings.f19542a);
                C8855a aVar = pVar.f29153s;
                boolean a = sessionSettings.mo30401a();
                aVar.f19546c = a;
                aVar.f19545b.mo46761a().edit().putBoolean("customerCentricMessagingEnrolled", a).apply();
                pVar.f29151q.onNext(sessionSettings);
                return;
            default:
                ((ReceiptFragment) this.f28769c).lambda$onBuyThisAgainClick$3((Throwable) obj);
                return;
        }
    }
}
