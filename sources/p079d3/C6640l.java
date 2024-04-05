package p079d3;

import androidx.work.C3422l;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import p034c3.C4393p;
import p034c3.C4394q;
import p252u2.C8121c;
import p252u2.C8129j;

/* renamed from: d3.l */
public final class C6640l implements Runnable {

    /* renamed from: e */
    public static final String f14650e = C3422l.m8214e("StopWorkRunnable");

    /* renamed from: b */
    public final C8129j f14651b;

    /* renamed from: c */
    public final String f14652c;

    /* renamed from: d */
    public final boolean f14653d;

    public C6640l(C8129j jVar, String str, boolean z) {
        this.f14651b = jVar;
        this.f14652c = str;
        this.f14653d = z;
    }

    public final void run() {
        boolean containsKey;
        boolean z;
        C8129j jVar = this.f14651b;
        WorkDatabase workDatabase = jVar.f17763c;
        C8121c cVar = jVar.f17766f;
        C4393p t = workDatabase.mo12857t();
        workDatabase.mo11974c();
        try {
            String str = this.f14652c;
            synchronized (cVar.f17740l) {
                containsKey = cVar.f17735g.containsKey(str);
            }
            if (this.f14653d) {
                z = this.f14651b.f17766f.mo20719g(this.f14652c);
            } else {
                if (!containsKey) {
                    C4394q qVar = (C4394q) t;
                    if (qVar.mo14330f(this.f14652c) == WorkInfo$State.RUNNING) {
                        qVar.mo14340p(WorkInfo$State.ENQUEUED, this.f14652c);
                    }
                }
                z = this.f14651b.f17766f.mo20720h(this.f14652c);
            }
            C3422l.m8213c().mo12926a(f14650e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f14652c, Boolean.valueOf(z)}), new Throwable[0]);
            workDatabase.mo11984m();
            workDatabase.mo11980i();
        } catch (Throwable th) {
            workDatabase.mo11980i();
            throw th;
        }
    }
}
