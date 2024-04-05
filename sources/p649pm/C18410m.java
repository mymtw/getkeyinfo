package p649pm;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p517bn.C14123n;
import p575gm.C17791a;
import p706wm.C18750b;
import p706wm.C18751c;
import p706wm.C18752d;

/* renamed from: pm.m */
public final class C18410m implements C18752d, C18751c {

    /* renamed from: a */
    public final HashMap f40490a = new HashMap();

    /* renamed from: b */
    public ArrayDeque f40491b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f40492c;

    public C18410m(Executor executor) {
        this.f40492c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo69948a(p706wm.C18750b r3) {
        /*
            r2 = this;
            java.lang.Class<gm.a> r0 = p575gm.C17791a.class
            monitor-enter(r2)
            java.util.HashMap r1 = r2.f40490a     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x000d
            monitor-exit(r2)
            return
        L_0x000d:
            java.util.HashMap r1 = r2.f40490a     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0025 }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0025 }
            r1.remove(r3)     // Catch:{ all -> 0x0025 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x0023
            java.util.HashMap r3 = r2.f40490a     // Catch:{ all -> 0x0025 }
            r3.remove(r0)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r2)
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p649pm.C18410m.mo69948a(wm.b):void");
    }

    /* renamed from: b */
    public final void mo69949b(C14123n nVar) {
        mo69950c(this.f40492c, nVar);
    }

    /* renamed from: c */
    public final synchronized void mo69950c(Executor executor, C18750b bVar) {
        Class<C17791a> cls = C17791a.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f40490a.containsKey(cls)) {
                this.f40490a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f40490a.get(cls)).put(bVar, executor);
        }
    }
}
