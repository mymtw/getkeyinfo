package p079d3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p034c3.C4394q;
import p252u2.C8124e;
import p252u2.C8129j;

/* renamed from: d3.c */
public final class C6630c extends C6631d {

    /* renamed from: c */
    public final /* synthetic */ C8129j f14631c;

    /* renamed from: d */
    public final /* synthetic */ String f14632d;

    /* renamed from: e */
    public final /* synthetic */ boolean f14633e = false;

    public C6630c(C8129j jVar, String str) {
        this.f14631c = jVar;
        this.f14632d = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo18814b() {
        WorkDatabase workDatabase = this.f14631c.f17763c;
        workDatabase.mo11974c();
        try {
            Iterator it = ((C4394q) workDatabase.mo12857t()).mo14331g(this.f14632d).iterator();
            while (it.hasNext()) {
                C6631d.m13014a(this.f14631c, (String) it.next());
            }
            workDatabase.mo11984m();
            workDatabase.mo11980i();
            if (this.f14633e) {
                C8129j jVar = this.f14631c;
                C8124e.m16338a(jVar.f17762b, jVar.f17763c, jVar.f17765e);
            }
        } catch (Throwable th) {
            workDatabase.mo11980i();
            throw th;
        }
    }
}
