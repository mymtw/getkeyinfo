package p365hg;

/* renamed from: hg.a */
public final class C12828a {

    /* renamed from: a */
    public static C12828a f28315a;

    /* renamed from: b */
    public static final C12829a f28316b = new C12829a();

    /* renamed from: hg.a$a */
    public static final class C12829a {
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public final synchronized p365hg.C12828a mo45611a(java.util.UUID r4, int r5) {
            /*
                r3 = this;
                java.lang.Class<hg.a> r0 = p365hg.C12828a.class
                monitor-enter(r3)
                hg.a r1 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x004f }
                boolean r1 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x004f }
                r2 = 0
                if (r1 == 0) goto L_0x000d
                goto L_0x0014
            L_0x000d:
                hg.a r1 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x0010 }
                goto L_0x0015
            L_0x0010:
                r1 = move-exception
                p401mg.C13080a.m20761a(r0, r1)     // Catch:{ all -> 0x004f }
            L_0x0014:
                r1 = r2
            L_0x0015:
                if (r1 == 0) goto L_0x0051
                p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x004f }
                boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r2, r4)     // Catch:{ all -> 0x004f }
                r4 = r4 ^ 1
                if (r4 != 0) goto L_0x0051
                p401mg.C13080a.m20762b(r1)     // Catch:{ all -> 0x004f }
                if (r5 == 0) goto L_0x0028
                goto L_0x0051
            L_0x0028:
                monitor-enter(r3)     // Catch:{ all -> 0x004f }
                hg.a r4 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x004c }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x004c }
                if (r4 == 0) goto L_0x0032
                goto L_0x0039
            L_0x0032:
                hg.a r4 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x0035 }
                goto L_0x0039
            L_0x0035:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ all -> 0x004c }
            L_0x0039:
                hg.a r4 = p365hg.C12828a.f28315a     // Catch:{ all -> 0x004c }
                boolean r4 = p401mg.C13080a.m20762b(r0)     // Catch:{ all -> 0x004c }
                if (r4 == 0) goto L_0x0042
                goto L_0x0049
            L_0x0042:
                p365hg.C12828a.f28315a = r2     // Catch:{ all -> 0x0045 }
                goto L_0x0049
            L_0x0045:
                r4 = move-exception
                p401mg.C13080a.m20761a(r0, r4)     // Catch:{ all -> 0x004c }
            L_0x0049:
                monitor-exit(r3)     // Catch:{ all -> 0x004f }
                monitor-exit(r3)
                return r1
            L_0x004c:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x004f }
                throw r4     // Catch:{ all -> 0x004f }
            L_0x004f:
                r4 = move-exception
                goto L_0x0053
            L_0x0051:
                monitor-exit(r3)
                return r2
            L_0x0053:
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p365hg.C12828a.C12829a.mo45611a(java.util.UUID, int):hg.a");
        }
    }
}
