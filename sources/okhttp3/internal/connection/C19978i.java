package okhttp3.internal.connection;

import android.support.p013v4.media.C0072d;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19927a;
import okhttp3.C19940c0;
import okhttp3.internal.connection.C19971e;
import p003a2.C0023f;
import p735br.C18980c;
import p737cr.C18984c;
import p737cr.C18985d;
import p747hr.C19084h;

/* renamed from: okhttp3.internal.connection.i */
public final class C19978i {

    /* renamed from: a */
    public final long f44194a;

    /* renamed from: b */
    public final C18984c f44195b;

    /* renamed from: c */
    public final C19977h f44196c;

    /* renamed from: d */
    public final ConcurrentLinkedQueue<C19976g> f44197d;

    /* renamed from: e */
    public final int f44198e = 5;

    public C19978i(C18985d dVar, TimeUnit timeUnit) {
        C19383o.m32797g(dVar, "taskRunner");
        C19383o.m32797g(timeUnit, "timeUnit");
        this.f44194a = timeUnit.toNanos(5);
        this.f44195b = dVar.mo70430f();
        this.f44196c = new C19977h(this, C0023f.m110k(new StringBuilder(), C18980c.f42307g, " ConnectionPool"));
        this.f44197d = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: a */
    public final boolean mo72933a(C19927a aVar, C19971e eVar, List<C19940c0> list, boolean z) {
        C19383o.m32797g(aVar, "address");
        C19383o.m32797g(eVar, "call");
        Iterator<C19976g> it = this.f44197d.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                return false;
            }
            C19976g next = it.next();
            C19383o.m32796f(next, "connection");
            synchronized (next) {
                if (z) {
                    if (next.f44181f != null) {
                        z2 = true;
                    }
                    if (!z2) {
                        C19394m mVar = C19394m.f43287a;
                    }
                }
                if (next.mo72927h(aVar, list)) {
                    eVar.mo72914b(next);
                    return true;
                }
                C19394m mVar2 = C19394m.f43287a;
            }
        }
    }

    /* renamed from: b */
    public final int mo72934b(C19976g gVar, long j) {
        byte[] bArr = C18980c.f42301a;
        ArrayList arrayList = gVar.f44190o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder h = C0072d.m201h("A connection to ");
                h.append(gVar.f44192q.f43995a.f43948a);
                h.append(" was leaked. ");
                h.append("Did you forget to close a response body?");
                String sb = h.toString();
                C19084h.f42595c.getClass();
                C19084h.f42593a.mo70563k(((C19971e.C19973b) reference).f44174a, sb);
                arrayList.remove(i);
                gVar.f44184i = true;
                if (arrayList.isEmpty()) {
                    gVar.f44191p = j - this.f44194a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
