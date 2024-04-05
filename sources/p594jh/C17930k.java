package p594jh;

import com.paypal.pyplcheckout.addshipping.ShippingUtilsKt;
import p505aj.C14003j;
import p513bj.C14075p;

/* renamed from: jh.k */
public final class C17930k {

    /* renamed from: a */
    public final C14003j f39028a;

    /* renamed from: b */
    public final long f39029b;

    /* renamed from: c */
    public final long f39030c;

    /* renamed from: d */
    public final long f39031d = C17912g.m30087a((long) ShippingUtilsKt.mediumHeightScreen);

    /* renamed from: e */
    public final long f39032e = C17912g.m30087a((long) 5000);

    /* renamed from: f */
    public final int f39033f = -1;

    /* renamed from: g */
    public final long f39034g = C17912g.m30087a((long) 0);

    /* renamed from: h */
    public int f39035h = 13107200;

    /* renamed from: i */
    public boolean f39036i;

    public C17930k() {
        C14003j jVar = new C14003j();
        m30240a("bufferForPlaybackMs", ShippingUtilsKt.mediumHeightScreen, 0, "0");
        m30240a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        m30240a("minBufferMs", 50000, ShippingUtilsKt.mediumHeightScreen, "bufferForPlaybackMs");
        m30240a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        m30240a("maxBufferMs", 50000, 50000, "minBufferMs");
        m30240a("backBufferDurationMs", 0, 0, "0");
        this.f39028a = jVar;
        long j = (long) 50000;
        this.f39029b = C17912g.m30087a(j);
        this.f39030c = C17912g.m30087a(j);
    }

    /* renamed from: a */
    public static void m30240a(String str, int i, int i2, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C14075p.m21692d(z, sb.toString());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final void mo69419b(boolean r3) {
        /*
            r2 = this;
            int r0 = r2.f39033f
            r1 = -1
            if (r0 != r1) goto L_0x0007
            r0 = 13107200(0xc80000, float:1.8367099E-38)
        L_0x0007:
            r2.f39035h = r0
            r0 = 0
            r2.f39036i = r0
            if (r3 == 0) goto L_0x002e
            aj.j r3 = r2.f39028a
            monitor-enter(r3)
            boolean r1 = r3.f30784a     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            int r1 = r3.f30787d     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            r3.f30787d = r0     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0024
            r3.mo46824b()     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3)
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p594jh.C17930k.mo69419b(boolean):void");
    }
}
