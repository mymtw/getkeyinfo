package p079d3;

import androidx.work.WorkerParameters;
import p252u2.C8129j;

/* renamed from: d3.k */
public final class C6639k implements Runnable {

    /* renamed from: b */
    public C8129j f14647b;

    /* renamed from: c */
    public String f14648c;

    /* renamed from: d */
    public WorkerParameters.C3371a f14649d;

    public C6639k(C8129j jVar, String str, WorkerParameters.C3371a aVar) {
        this.f14647b = jVar;
        this.f14648c = str;
        this.f14649d = aVar;
    }

    public final void run() {
        this.f14647b.f17766f.mo20717e(this.f14648c, this.f14649d);
    }
}
