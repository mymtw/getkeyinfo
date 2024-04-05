package p290y2;

import android.content.Context;
import androidx.work.C3422l;
import java.util.Collection;
import p004a3.C0028d;
import p090e3.C6712a;
import p300z2.C8422a;
import p300z2.C8423b;
import p300z2.C8424c;
import p300z2.C8426d;
import p300z2.C8427e;
import p300z2.C8428f;
import p300z2.C8429g;
import p300z2.C8430h;

/* renamed from: y2.d */
public final class C8369d implements C8424c.C8425a {

    /* renamed from: d */
    public static final String f18346d = C3422l.m8214e("WorkConstraintsTracker");

    /* renamed from: a */
    public final C8368c f18347a;

    /* renamed from: b */
    public final C8424c<?>[] f18348b;

    /* renamed from: c */
    public final Object f18349c = new Object();

    public C8369d(Context context, C6712a aVar, C8368c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f18347a = cVar;
        this.f18348b = new C8424c[]{new C8422a(applicationContext, aVar), new C8423b(applicationContext, aVar), new C8430h(applicationContext, aVar), new C8426d(applicationContext, aVar), new C8429g(applicationContext, aVar), new C8428f(applicationContext, aVar), new C8427e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public final boolean mo20959a(String str) {
        synchronized (this.f18349c) {
            for (C8424c<?> cVar : this.f18348b) {
                T t = cVar.f18441b;
                if (t != null && cVar.mo21008c(t) && cVar.f18440a.contains(str)) {
                    C3422l.m8213c().mo12926a(f18346d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void mo20960b(Collection collection) {
        synchronized (this.f18349c) {
            for (C8424c<?> cVar : this.f18348b) {
                if (cVar.f18443d != null) {
                    cVar.f18443d = null;
                    cVar.mo21010e((C8424c.C8425a) null, cVar.f18441b);
                }
            }
            for (C8424c<?> d : this.f18348b) {
                d.mo21009d(collection);
            }
            for (C8424c<?> cVar2 : this.f18348b) {
                if (cVar2.f18443d != this) {
                    cVar2.f18443d = this;
                    cVar2.mo21010e(this, cVar2.f18441b);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo20961c() {
        synchronized (this.f18349c) {
            for (C8424c<?> cVar : this.f18348b) {
                if (!cVar.f18440a.isEmpty()) {
                    cVar.f18440a.clear();
                    C0028d<T> dVar = cVar.f18442c;
                    synchronized (dVar.f62c) {
                        if (dVar.f63d.remove(cVar) && dVar.f63d.isEmpty()) {
                            dVar.mo61d();
                        }
                    }
                }
            }
        }
    }
}
