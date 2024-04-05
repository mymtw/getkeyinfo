package p300z2;

import androidx.work.C3422l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p004a3.C0028d;
import p034c3.C4391o;
import p290y2.C8366a;
import p290y2.C8368c;
import p290y2.C8369d;

/* renamed from: z2.c */
public abstract class C8424c<T> implements C8366a<T> {

    /* renamed from: a */
    public final ArrayList f18440a = new ArrayList();

    /* renamed from: b */
    public T f18441b;

    /* renamed from: c */
    public C0028d<T> f18442c;

    /* renamed from: d */
    public C8425a f18443d;

    /* renamed from: z2.c$a */
    public interface C8425a {
    }

    public C8424c(C0028d<T> dVar) {
        this.f18442c = dVar;
    }

    /* renamed from: a */
    public final void mo20955a(T t) {
        this.f18441b = t;
        mo21010e(this.f18443d, t);
    }

    /* renamed from: b */
    public abstract boolean mo21007b(C4391o oVar);

    /* renamed from: c */
    public abstract boolean mo21008c(T t);

    /* renamed from: d */
    public final void mo21009d(Collection collection) {
        this.f18440a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C4391o oVar = (C4391o) it.next();
            if (mo21007b(oVar)) {
                this.f18440a.add(oVar.f9644a);
            }
        }
        if (this.f18440a.isEmpty()) {
            C0028d<T> dVar = this.f18442c;
            synchronized (dVar.f62c) {
                if (dVar.f63d.remove(this) && dVar.f63d.isEmpty()) {
                    dVar.mo61d();
                }
            }
        } else {
            C0028d<T> dVar2 = this.f18442c;
            synchronized (dVar2.f62c) {
                if (dVar2.f63d.add(this)) {
                    if (dVar2.f63d.size() == 1) {
                        dVar2.f64e = dVar2.mo57a();
                        C3422l.m8213c().mo12926a(C0028d.f59f, String.format("%s: initial state = %s", new Object[]{dVar2.getClass().getSimpleName(), dVar2.f64e}), new Throwable[0]);
                        dVar2.mo60c();
                    }
                    mo20955a(dVar2.f64e);
                }
            }
        }
        mo21010e(this.f18443d, this.f18441b);
    }

    /* renamed from: e */
    public final void mo21010e(C8425a aVar, T t) {
        if (!this.f18440a.isEmpty() && aVar != null) {
            if (t == null || mo21008c(t)) {
                ArrayList arrayList = this.f18440a;
                C8369d dVar = (C8369d) aVar;
                synchronized (dVar.f18349c) {
                    C8368c cVar = dVar.f18347a;
                    if (cVar != null) {
                        cVar.mo12868b(arrayList);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.f18440a;
            C8369d dVar2 = (C8369d) aVar;
            synchronized (dVar2.f18349c) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (dVar2.mo20959a(str)) {
                        C3422l.m8213c().mo12926a(C8369d.f18346d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                C8368c cVar2 = dVar2.f18347a;
                if (cVar2 != null) {
                    cVar2.mo12871e(arrayList3);
                }
            }
        }
    }
}
