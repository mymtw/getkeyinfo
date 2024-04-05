package p079d3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p252u2.C8124e;
import p252u2.C8129j;

/* renamed from: d3.a */
public final class C6628a extends C6631d {

    /* renamed from: c */
    public final /* synthetic */ C8129j f14627c;

    /* renamed from: d */
    public final /* synthetic */ UUID f14628d;

    public C6628a(C8129j jVar, UUID uuid) {
        this.f14627c = jVar;
        this.f14628d = uuid;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo18814b() {
        WorkDatabase workDatabase = this.f14627c.f17763c;
        workDatabase.mo11974c();
        try {
            C6631d.m13014a(this.f14627c, this.f14628d.toString());
            workDatabase.mo11984m();
            workDatabase.mo11980i();
            C8129j jVar = this.f14627c;
            C8124e.m16338a(jVar.f17762b, jVar.f17763c, jVar.f17765e);
        } catch (Throwable th) {
            workDatabase.mo11980i();
            throw th;
        }
    }
}
