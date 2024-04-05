package p737cr;

import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p735br.C18980c;

/* renamed from: cr.c */
public final class C18984c {

    /* renamed from: a */
    public boolean f42314a;

    /* renamed from: b */
    public C18982a f42315b;

    /* renamed from: c */
    public final ArrayList f42316c = new ArrayList();

    /* renamed from: d */
    public boolean f42317d;

    /* renamed from: e */
    public final C18985d f42318e;

    /* renamed from: f */
    public final String f42319f;

    public C18984c(C18985d dVar, String str) {
        C19383o.m32797g(dVar, "taskRunner");
        C19383o.m32797g(str, "name");
        this.f42318e = dVar;
        this.f42319f = str;
    }

    /* renamed from: a */
    public final void mo70420a() {
        byte[] bArr = C18980c.f42301a;
        synchronized (this.f42318e) {
            if (mo70421b()) {
                this.f42318e.mo70429e(this);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: b */
    public final boolean mo70421b() {
        C18982a aVar = this.f42315b;
        if (aVar != null && aVar.f42312d) {
            this.f42317d = true;
        }
        boolean z = false;
        for (int size = this.f42316c.size() - 1; size >= 0; size--) {
            if (((C18982a) this.f42316c.get(size)).f42312d) {
                C18982a aVar2 = (C18982a) this.f42316c.get(size);
                C18985d dVar = C18985d.f42320h;
                if (C18985d.f42321i.isLoggable(Level.FINE)) {
                    C19543e0.m33334t(aVar2, this, "canceled");
                }
                this.f42316c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70422c(p737cr.C18982a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            cr.d r0 = r2.f42318e
            monitor-enter(r0)
            boolean r1 = r2.f42314a     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0040
            boolean r4 = r3.f42312d     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0026
            cr.d$b r4 = p737cr.C18985d.f42322j     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = p737cr.C18985d.f42321i     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0024
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            kotlinx.coroutines.C19543e0.m33334t(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            cr.d$b r4 = p737cr.C18985d.f42322j     // Catch:{ all -> 0x0050 }
            r4.getClass()     // Catch:{ all -> 0x0050 }
            java.util.logging.Logger r4 = p737cr.C18985d.f42321i     // Catch:{ all -> 0x0050 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0050 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x003a
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            kotlinx.coroutines.C19543e0.m33334t(r3, r2, r4)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0050 }
            r3.<init>()     // Catch:{ all -> 0x0050 }
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0040:
            r1 = 0
            boolean r3 = r2.mo70423e(r3, r4, r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004c
            cr.d r3 = r2.f42318e     // Catch:{ all -> 0x0050 }
            r3.mo70429e(r2)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            kotlin.m r3 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            return
        L_0x0050:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p737cr.C18984c.mo70422c(cr.a, long):void");
    }

    /* renamed from: e */
    public final boolean mo70423e(C18982a aVar, long j, boolean z) {
        String str;
        C19383o.m32797g(aVar, "task");
        C18984c cVar = aVar.f42309a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.f42309a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long nanoTime = this.f42318e.f42329g.nanoTime();
        long j2 = nanoTime + j;
        int indexOf = this.f42316c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f42310b <= j2) {
                C18985d dVar = C18985d.f42320h;
                if (C18985d.f42321i.isLoggable(Level.FINE)) {
                    C19543e0.m33334t(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f42316c.remove(indexOf);
        }
        aVar.f42310b = j2;
        C18985d dVar2 = C18985d.f42320h;
        if (C18985d.f42321i.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder h = C0072d.m201h("run again after ");
                h.append(C19543e0.m33296M(j2 - nanoTime));
                str = h.toString();
            } else {
                StringBuilder h2 = C0072d.m201h("scheduled after ");
                h2.append(C19543e0.m33296M(j2 - nanoTime));
                str = h2.toString();
            }
            C19543e0.m33334t(aVar, this, str);
        }
        Iterator it = this.f42316c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C18982a) it.next()).f42310b - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.f42316c.size();
        }
        this.f42316c.add(i, aVar);
        return i == 0;
    }

    /* renamed from: f */
    public final void mo70424f() {
        byte[] bArr = C18980c.f42301a;
        synchronized (this.f42318e) {
            this.f42314a = true;
            if (mo70421b()) {
                this.f42318e.mo70429e(this);
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    public final String toString() {
        return this.f42319f;
    }
}
