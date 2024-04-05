package okhttp3.internal.connection;

import p737cr.C18982a;

/* renamed from: okhttp3.internal.connection.h */
public final class C19977h extends C18982a {

    /* renamed from: e */
    public final /* synthetic */ C19978i f44193e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19977h(C19978i iVar, String str) {
        super(str, true);
        this.f44193e = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007c, code lost:
        r1 = r6.f44178c;
        kotlin.jvm.internal.C19383o.m32794d(r1);
        p735br.C18980c.m32100d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r0.f44197d.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        r0.f44195b.mo70420a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo70418a() {
        /*
            r13 = this;
            okhttp3.internal.connection.i r0 = r13.f44193e
            long r1 = java.lang.System.nanoTime()
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.g> r3 = r0.f44197d
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = -9223372036854775808
            r7 = r6
            r6 = r5
            r5 = r4
        L_0x0013:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0044
            java.lang.Object r9 = r3.next()
            okhttp3.internal.connection.g r9 = (okhttp3.internal.connection.C19976g) r9
            java.lang.String r10 = "connection"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            monitor-enter(r9)
            int r10 = r0.mo72934b(r9, r1)     // Catch:{ all -> 0x0041 }
            if (r10 <= 0) goto L_0x002e
            int r5 = r5 + 1
            goto L_0x003f
        L_0x002e:
            int r4 = r4 + 1
            long r10 = r9.f44191p     // Catch:{ all -> 0x0041 }
            long r10 = r1 - r10
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x003d
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0041 }
            r6 = r9
            r7 = r10
            goto L_0x003f
        L_0x003d:
            kotlin.m r10 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r9)
            goto L_0x0013
        L_0x0041:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0044:
            long r9 = r0.f44194a
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0059
            int r3 = r0.f44198e
            if (r4 <= r3) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            if (r4 <= 0) goto L_0x0053
            long r9 = r9 - r7
            goto L_0x0091
        L_0x0053:
            if (r5 <= 0) goto L_0x0056
            goto L_0x0091
        L_0x0056:
            r9 = -1
            goto L_0x0091
        L_0x0059:
            kotlin.jvm.internal.C19383o.m32794d(r6)
            monitor-enter(r6)
            java.util.ArrayList r3 = r6.f44190o     // Catch:{ all -> 0x0092 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0092 }
            r4 = 1
            r3 = r3 ^ r4
            r9 = 0
            if (r3 == 0) goto L_0x006b
            monitor-exit(r6)
            goto L_0x0091
        L_0x006b:
            long r11 = r6.f44191p     // Catch:{ all -> 0x0092 }
            long r11 = r11 + r7
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0074
            monitor-exit(r6)
            goto L_0x0091
        L_0x0074:
            r6.f44184i = r4     // Catch:{ all -> 0x0092 }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.g> r1 = r0.f44197d     // Catch:{ all -> 0x0092 }
            r1.remove(r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r6)
            java.net.Socket r1 = r6.f44178c
            kotlin.jvm.internal.C19383o.m32794d(r1)
            p735br.C18980c.m32100d(r1)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.g> r1 = r0.f44197d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0091
            cr.c r0 = r0.f44195b
            r0.mo70420a()
        L_0x0091:
            return r9
        L_0x0092:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C19977h.mo70418a():long");
    }
}
