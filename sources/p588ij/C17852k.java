package p588ij;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: ij.k */
public final class C17852k {

    /* renamed from: b */
    public static C17852k f38763b;
    @VisibleForTesting

    /* renamed from: a */
    public C17842a f38764a;

    public C17852k(Context context) {
        C17842a a = C17842a.m29965a(context);
        this.f38764a = a;
        a.mo69076b();
        this.f38764a.mo69077c();
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
    public static synchronized p588ij.C17852k m29975b(android.content.Context r2) {
        /*
            java.lang.Class<ij.k> r0 = p588ij.C17852k.class
            monitor-enter(r0)
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001b }
            monitor-enter(r0)     // Catch:{ all -> 0x001b }
            ij.k r1 = f38763b     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0013
            ij.k r1 = new ij.k     // Catch:{ all -> 0x0018 }
            r1.<init>(r2)     // Catch:{ all -> 0x0018 }
            f38763b = r1     // Catch:{ all -> 0x0018 }
        L_0x0013:
            ij.k r2 = f38763b     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            monitor-exit(r0)
            return r2
        L_0x0018:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p588ij.C17852k.m29975b(android.content.Context):ij.k");
    }

    /* renamed from: a */
    public final synchronized void mo69082a() {
        C17842a aVar = this.f38764a;
        aVar.f38755a.lock();
        try {
            aVar.f38756b.edit().clear().apply();
        } finally {
            aVar.f38755a.unlock();
        }
    }
}
