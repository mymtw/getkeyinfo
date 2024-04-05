package androidx.room;

import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import p112g2.C6837d;
import retrofit2.C20092d;
import retrofit2.C20102h;

/* renamed from: androidx.room.p */
public final /* synthetic */ class C3250p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7565b;

    /* renamed from: c */
    public final /* synthetic */ Object f7566c;

    /* renamed from: d */
    public final /* synthetic */ Object f7567d;

    /* renamed from: e */
    public final /* synthetic */ Object f7568e;

    public /* synthetic */ C3250p(Object obj, int i, Object obj2, Object obj3) {
        this.f7565b = i;
        this.f7566c = obj;
        this.f7567d = obj2;
        this.f7568e = obj3;
    }

    public final void run() {
        switch (this.f7565b) {
            case 0:
                ((C3255u) this.f7566c).getClass();
                ((C6837d) this.f7567d).mo6592a();
                ((C3256v) this.f7568e).getClass();
                throw null;
            case 1:
                ((GaugeManager) this.f7566c).lambda$stopCollectingGauges$4((String) this.f7567d, (ApplicationProcessState) this.f7568e);
                return;
            default:
                ((C20092d) this.f7567d).mo1135j(C20102h.C20103a.this, (Throwable) this.f7568e);
                return;
        }
    }
}
