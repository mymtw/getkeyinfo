package okhttp3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.internal.connection.C19971e;

/* renamed from: okhttp3.k */
public final class C19985k {

    /* renamed from: a */
    public ThreadPoolExecutor f44218a;

    /* renamed from: b */
    public final ArrayDeque<C19971e.C19972a> f44219b = new ArrayDeque<>();

    /* renamed from: c */
    public final ArrayDeque<C19971e.C19972a> f44220c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<C19971e> f44221d = new ArrayDeque<>();

    /* renamed from: a */
    public final void mo72940a(C19971e.C19972a aVar) {
        C19383o.m32797g(aVar, "call");
        aVar.f44171b.decrementAndGet();
        ArrayDeque<C19971e.C19972a> arrayDeque = this.f44220c;
        synchronized (this) {
            if (arrayDeque.remove(aVar)) {
                C19394m mVar = C19394m.f43287a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        mo72941b();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final void mo72941b() {
        /*
            r14 = this;
            byte[] r0 = p735br.C18980c.f42301a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque<okhttp3.internal.connection.e$a> r1 = r14.f44219b     // Catch:{ all -> 0x00e7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)     // Catch:{ all -> 0x00e7 }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00e7 }
            okhttp3.internal.connection.e$a r2 = (okhttp3.internal.connection.C19971e.C19972a) r2     // Catch:{ all -> 0x00e7 }
            java.util.ArrayDeque<okhttp3.internal.connection.e$a> r3 = r14.f44220c     // Catch:{ all -> 0x00e7 }
            int r3 = r3.size()     // Catch:{ all -> 0x00e7 }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x0045
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f44171b     // Catch:{ all -> 0x00e7 }
            int r3 = r3.get()     // Catch:{ all -> 0x00e7 }
            r4 = 5
            if (r3 < r4) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r1.remove()     // Catch:{ all -> 0x00e7 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f44171b     // Catch:{ all -> 0x00e7 }
            r3.incrementAndGet()     // Catch:{ all -> 0x00e7 }
            r0.add(r2)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayDeque<okhttp3.internal.connection.e$a> r3 = r14.f44220c     // Catch:{ all -> 0x00e7 }
            r3.add(r2)     // Catch:{ all -> 0x00e7 }
            goto L_0x0013
        L_0x0045:
            monitor-enter(r14)     // Catch:{ all -> 0x00e7 }
            java.util.ArrayDeque<okhttp3.internal.connection.e$a> r1 = r14.f44220c     // Catch:{ all -> 0x00e4 }
            int r1 = r1.size()     // Catch:{ all -> 0x00e4 }
            java.util.ArrayDeque<okhttp3.internal.connection.e> r2 = r14.f44221d     // Catch:{ all -> 0x00e4 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e4 }
            int r1 = r1 + r2
            monitor-exit(r14)     // Catch:{ all -> 0x00e7 }
            r2 = 0
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00e7 }
            monitor-exit(r14)
            int r1 = r0.size()
            r3 = r2
        L_0x005d:
            if (r3 >= r1) goto L_0x00e3
            java.lang.Object r4 = r0.get(r3)
            okhttp3.internal.connection.e$a r4 = (okhttp3.internal.connection.C19971e.C19972a) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f44218a     // Catch:{ all -> 0x00e0 }
            if (r5 != 0) goto L_0x009c
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x00e0 }
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 60
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00e0 }
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch:{ all -> 0x00e0 }
            r12.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r6.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r13 = p735br.C18980c.f42307g     // Catch:{ all -> 0x00e0 }
            r6.append(r13)     // Catch:{ all -> 0x00e0 }
            java.lang.String r13 = " Dispatcher"
            r6.append(r13)     // Catch:{ all -> 0x00e0 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.String r13 = "name"
            kotlin.jvm.internal.C19383o.m32797g(r6, r13)     // Catch:{ all -> 0x00e0 }
            br.b r13 = new br.b     // Catch:{ all -> 0x00e0 }
            r13.<init>(r6, r2)     // Catch:{ all -> 0x00e0 }
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch:{ all -> 0x00e0 }
            r14.f44218a = r5     // Catch:{ all -> 0x00e0 }
        L_0x009c:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f44218a     // Catch:{ all -> 0x00e0 }
            kotlin.jvm.internal.C19383o.m32794d(r5)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r14)
            r4.getClass()
            okhttp3.internal.connection.e r6 = r4.f44173d
            okhttp3.t r6 = r6.f44168q
            okhttp3.k r6 = r6.f44286b
            byte[] r6 = p735br.C18980c.f42301a
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x00b3 }
            goto L_0x00d3
        L_0x00b1:
            r0 = move-exception
            goto L_0x00d6
        L_0x00b3:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x00b1 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x00b1 }
            r6.initCause(r5)     // Catch:{ all -> 0x00b1 }
            okhttp3.internal.connection.e r5 = r4.f44173d     // Catch:{ all -> 0x00b1 }
            r5.mo72920i(r6)     // Catch:{ all -> 0x00b1 }
            okhttp3.f r5 = r4.f44172c     // Catch:{ all -> 0x00b1 }
            okhttp3.internal.connection.e r7 = r4.f44173d     // Catch:{ all -> 0x00b1 }
            r5.onFailure(r7, r6)     // Catch:{ all -> 0x00b1 }
            okhttp3.internal.connection.e r5 = r4.f44173d
            okhttp3.t r5 = r5.f44168q
            okhttp3.k r5 = r5.f44286b
            r5.mo72940a(r4)
        L_0x00d3:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00d6:
            okhttp3.internal.connection.e r1 = r4.f44173d
            okhttp3.t r1 = r1.f44168q
            okhttp3.k r1 = r1.f44286b
            r1.mo72940a(r4)
            throw r0
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C19985k.mo72941b():void");
    }
}
