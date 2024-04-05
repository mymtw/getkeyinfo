package p520cj;

import android.view.Surface;
import p513bj.C14049b0;
import p520cj.C14164p;

/* renamed from: cj.l */
public final /* synthetic */ class C14160l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C14164p.C14165a f31252b;

    /* renamed from: c */
    public final /* synthetic */ Object f31253c;

    /* renamed from: d */
    public final /* synthetic */ long f31254d;

    public /* synthetic */ C14160l(C14164p.C14165a aVar, Surface surface, long j) {
        this.f31252b = aVar;
        this.f31253c = surface;
        this.f31254d = j;
    }

    public final void run() {
        C14164p.C14165a aVar = this.f31252b;
        Object obj = this.f31253c;
        long j = this.f31254d;
        C14164p pVar = aVar.f31267b;
        int i = C14049b0.f30913a;
        pVar.mo47103i(j, obj);
    }
}
