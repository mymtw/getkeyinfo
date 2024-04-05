package p253u3;

/* renamed from: u3.g */
public final class C8141g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f17849b;

    /* renamed from: c */
    public final /* synthetic */ long f17850c;

    /* renamed from: d */
    public final /* synthetic */ C8139f f17851d;

    /* renamed from: u3.g$a */
    public class C8142a implements Runnable {
        public C8142a() {
        }

        public final void run() {
            C8139f fVar = C8141g.this.f17851d;
            fVar.mo20755n(fVar.f17844z);
        }
    }

    public C8141g(C8139f fVar, long j, long j2) {
        this.f17851d = fVar;
        this.f17849b = j;
        this.f17850c = j2;
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
    public final void run() {
        /*
            r6 = this;
            long r0 = r6.f17849b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0017
            u3.f r4 = r6.f17851d
            u3.o r4 = r4.f17821c
            monitor-enter(r4)
            java.lang.String r5 = "events"
            r4.mo20771Q(r0, r5)     // Catch:{ all -> 0x0014 }
            monitor-exit(r4)
            goto L_0x0017
        L_0x0014:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0017:
            long r0 = r6.f17850c
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x002c
            u3.f r2 = r6.f17851d
            u3.o r2 = r2.f17821c
            monitor-enter(r2)
            java.lang.String r3 = "identifys"
            r2.mo20771Q(r0, r3)     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x002c:
            u3.f r0 = r6.f17851d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f17815E
            r1 = 0
            r0.set(r1)
            u3.f r0 = r6.f17851d
            u3.o r0 = r0.f17821c
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "events"
            long r2 = r0.mo20776h(r2)     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            monitor-enter(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r4 = "identifys"
            long r4 = r0.mo20776h(r4)     // Catch:{ all -> 0x0066 }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            long r2 = r2 + r4
            monitor-exit(r0)
            u3.f r0 = r6.f17851d
            int r4 = r0.f17839u
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x005f
            com.amplitude.api.WorkerThread r0 = r0.f17817G
            u3.g$a r1 = new u3.g$a
            r1.<init>()
            r0.post(r1)
            goto L_0x0065
        L_0x005f:
            r0.f17844z = r1
            int r1 = r0.f17840v
            r0.f17811A = r1
        L_0x0065:
            return
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r1     // Catch:{ all -> 0x006c }
        L_0x0069:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8141g.run():void");
    }
}
