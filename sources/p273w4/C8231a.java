package p273w4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p036c5.C4426l;

/* renamed from: w4.a */
public final class C8231a implements C8239h {

    /* renamed from: b */
    public final Set<C8240i> f18064b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public boolean f18065c;

    /* renamed from: d */
    public boolean f18066d;

    /* renamed from: a */
    public final void mo20841a(C8240i iVar) {
        this.f18064b.remove(iVar);
    }

    /* renamed from: b */
    public final void mo20842b() {
        this.f18066d = true;
        Iterator it = C4426l.m10131e(this.f18064b).iterator();
        while (it.hasNext()) {
            ((C8240i) it.next()).onDestroy();
        }
    }

    /* renamed from: c */
    public final void mo20843c(C8240i iVar) {
        this.f18064b.add(iVar);
        if (this.f18066d) {
            iVar.onDestroy();
        } else if (this.f18065c) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    /* renamed from: d */
    public final void mo20844d() {
        this.f18065c = true;
        Iterator it = C4426l.m10131e(this.f18064b).iterator();
        while (it.hasNext()) {
            ((C8240i) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public final void mo20845e() {
        this.f18065c = false;
        Iterator it = C4426l.m10131e(this.f18064b).iterator();
        while (it.hasNext()) {
            ((C8240i) it.next()).onStop();
        }
    }
}
