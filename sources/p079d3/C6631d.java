package p079d3;

import androidx.work.C3422l;
import androidx.work.C3429n;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import p034c3.C4371b;
import p034c3.C4372c;
import p034c3.C4393p;
import p034c3.C4394q;
import p252u2.C8120b;
import p252u2.C8121c;
import p252u2.C8123d;
import p252u2.C8129j;
import p252u2.C8132m;

/* renamed from: d3.d */
public abstract class C6631d implements Runnable {

    /* renamed from: b */
    public final C8120b f14634b = new C8120b();

    /* renamed from: a */
    public static void m13014a(C8129j jVar, String str) {
        boolean z;
        WorkDatabase workDatabase = jVar.f17763c;
        C4393p t = workDatabase.mo12857t();
        C4371b o = workDatabase.mo12852o();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C4394q qVar = (C4394q) t;
            WorkInfo$State f = qVar.mo14330f(str2);
            if (!(f == WorkInfo$State.SUCCEEDED || f == WorkInfo$State.FAILED)) {
                qVar.mo14340p(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((C4372c) o).mo14304a(str2));
        }
        C8121c cVar = jVar.f17766f;
        synchronized (cVar.f17740l) {
            C3422l.m8213c().mo12926a(C8121c.f17729m, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            cVar.f17738j.add(str);
            C8132m mVar = (C8132m) cVar.f17735g.remove(str);
            if (mVar != null) {
                z = true;
            }
            if (mVar == null) {
                mVar = (C8132m) cVar.f17736h.remove(str);
            }
            C8121c.m16327b(str, mVar);
            if (z) {
                cVar.mo20718f();
            }
        }
        for (C8123d a : jVar.f17765e) {
            a.mo20722a(str);
        }
    }

    /* renamed from: b */
    public abstract void mo18814b();

    public final void run() {
        try {
            mo18814b();
            this.f14634b.mo20713a(C3429n.f8035a);
        } catch (Throwable th) {
            this.f14634b.mo20713a(new C3429n.C3430a.C3431a(th));
        }
    }
}
