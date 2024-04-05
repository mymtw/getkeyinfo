package p079d3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p034c3.C4394q;
import p252u2.C8124e;
import p252u2.C8129j;

/* renamed from: d3.b */
public final class C6629b extends C6631d {

    /* renamed from: c */
    public final /* synthetic */ C8129j f14629c;

    /* renamed from: d */
    public final /* synthetic */ String f14630d;

    public C6629b(C8129j jVar, String str) {
        this.f14629c = jVar;
        this.f14630d = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo18814b() {
        WorkDatabase workDatabase = this.f14629c.f17763c;
        workDatabase.mo11974c();
        try {
            Iterator it = ((C4394q) workDatabase.mo12857t()).mo14332h(this.f14630d).iterator();
            while (it.hasNext()) {
                C6631d.m13014a(this.f14629c, (String) it.next());
            }
            workDatabase.mo11984m();
            workDatabase.mo11980i();
            C8129j jVar = this.f14629c;
            C8124e.m16338a(jVar.f17762b, jVar.f17763c, jVar.f17765e);
        } catch (Throwable th) {
            workDatabase.mo11980i();
            throw th;
        }
    }
}
