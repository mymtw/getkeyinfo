package p614ll;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ll.b */
public final class C18200b {

    /* renamed from: a */
    public final HashMap f39845a = new HashMap();

    /* renamed from: b */
    public final AtomicBoolean f39846b = new AtomicBoolean(false);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
    public final synchronized boolean mo69733a() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f39846b     // Catch:{ all -> 0x002f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0018
            monitor-enter(r3)     // Catch:{ all -> 0x002f }
            java.util.HashMap r0 = r3.f39845a     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "assetOnlyUpdates"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0015 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0015 }
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            goto L_0x0018
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x0018:
            java.util.HashMap r0 = r3.f39845a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "assetOnlyUpdates"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002f }
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0027
            r0 = 0
            monitor-exit(r3)
            return r0
        L_0x0027:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p614ll.C18200b.mo69733a():boolean");
    }
}
