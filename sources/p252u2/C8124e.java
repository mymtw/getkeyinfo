package p252u2;

import androidx.work.C3373b;
import androidx.work.C3422l;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p034c3.C4391o;
import p034c3.C4393p;
import p034c3.C4394q;

/* renamed from: u2.e */
public final class C8124e {

    /* renamed from: a */
    public static final String f17744a = C3422l.m8214e("Schedulers");

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m16338a(C3373b bVar, WorkDatabase workDatabase, List<C8123d> list) {
        if (list != null && list.size() != 0) {
            C4393p t = workDatabase.mo12857t();
            workDatabase.mo11974c();
            try {
                C4394q qVar = (C4394q) t;
                ArrayList c = qVar.mo14327c(bVar.f7880h);
                ArrayList b = qVar.mo14326b();
                if (c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        qVar.mo14336l(currentTimeMillis, ((C4391o) it.next()).f9644a);
                    }
                }
                workDatabase.mo11984m();
                workDatabase.mo11980i();
                if (c.size() > 0) {
                    C4391o[] oVarArr = (C4391o[]) c.toArray(new C4391o[c.size()]);
                    for (C8123d next : list) {
                        if (next.mo20724d()) {
                            next.mo20723c(oVarArr);
                        }
                    }
                }
                if (b.size() > 0) {
                    C4391o[] oVarArr2 = (C4391o[]) b.toArray(new C4391o[b.size()]);
                    for (C8123d next2 : list) {
                        if (!next2.mo20724d()) {
                            next2.mo20723c(oVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo11980i();
                throw th;
            }
        }
    }
}
