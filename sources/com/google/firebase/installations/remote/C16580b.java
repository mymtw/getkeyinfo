package com.google.firebase.installations.remote;

import com.google.firebase.installations.C16570j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.reflect.C19421p;

/* renamed from: com.google.firebase.installations.remote.b */
public final class C16580b {

    /* renamed from: d */
    public static final long f36783d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f36784e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C16570j f36785a;

    /* renamed from: b */
    public long f36786b;

    /* renamed from: c */
    public int f36787c;

    public C16580b() {
        if (C19421p.f43320j == null) {
            Pattern pattern = C16570j.f36767c;
            C19421p.f43320j = new C19421p();
        }
        C19421p pVar = C19421p.f43320j;
        if (C16570j.f36768d == null) {
            C16570j.f36768d = new C16570j(pVar);
        }
        this.f36785a = C16570j.f36768d;
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
    public final synchronized void mo59142a(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 1
            if (r7 < r0) goto L_0x000b
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x0016
        L_0x000b:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0016
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x0022
            monitor-enter(r6)     // Catch:{ all -> 0x0073 }
            r6.f36787c = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            monitor-exit(r6)
            return
        L_0x001f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            throw r7     // Catch:{ all -> 0x0073 }
        L_0x0022:
            int r0 = r6.f36787c     // Catch:{ all -> 0x0073 }
            int r0 = r0 + r2
            r6.f36787c = r0     // Catch:{ all -> 0x0073 }
            monitor-enter(r6)     // Catch:{ all -> 0x0073 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x0034
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0035
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            if (r1 != 0) goto L_0x003d
            long r0 = f36783d     // Catch:{ all -> 0x003b }
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            goto L_0x0061
        L_0x003b:
            r7 = move-exception
            goto L_0x0071
        L_0x003d:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = r6.f36787c     // Catch:{ all -> 0x003b }
            double r2 = (double) r7     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.pow(r0, r2)     // Catch:{ all -> 0x003b }
            com.google.firebase.installations.j r7 = r6.f36785a     // Catch:{ all -> 0x003b }
            r7.getClass()     // Catch:{ all -> 0x003b }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x003b }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = r0 + r2
            long r2 = f36784e     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x003b }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
        L_0x0061:
            com.google.firebase.installations.j r7 = r6.f36785a     // Catch:{ all -> 0x0073 }
            kotlin.reflect.p r7 = r7.f36769a     // Catch:{ all -> 0x0073 }
            r7.getClass()     // Catch:{ all -> 0x0073 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0073 }
            long r2 = r2 + r0
            r6.f36786b = r2     // Catch:{ all -> 0x0073 }
            monitor-exit(r6)
            return
        L_0x0071:
            monitor-exit(r6)     // Catch:{ all -> 0x0073 }
            throw r7     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.C16580b.mo59142a(int):void");
    }
}
