package p520cj;

import com.google.android.exoplayer2.Format;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import p513bj.C14049b0;
import p520cj.C14164p;
import p619mh.C18224e;

/* renamed from: cj.o */
public final /* synthetic */ class C14163o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f31262b;

    /* renamed from: c */
    public final /* synthetic */ Object f31263c;

    /* renamed from: d */
    public final /* synthetic */ Object f31264d;

    /* renamed from: e */
    public final /* synthetic */ Object f31265e;

    public /* synthetic */ C14163o(Object obj, int i, Object obj2, Object obj3) {
        this.f31262b = i;
        this.f31263c = obj;
        this.f31264d = obj2;
        this.f31265e = obj3;
    }

    public final void run() {
        switch (this.f31262b) {
            case 0:
                C14164p.C14165a aVar = (C14164p.C14165a) this.f31263c;
                C14164p pVar = aVar.f31267b;
                int i = C14049b0.f30913a;
                pVar.getClass();
                aVar.f31267b.mo47108s((Format) this.f31264d, (C18224e) this.f31265e);
                return;
            default:
                ((GaugeManager) this.f31263c).lambda$startCollectingGauges$3((String) this.f31264d, (ApplicationProcessState) this.f31265e);
                return;
        }
    }
}
