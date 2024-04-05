package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.b */
public final /* synthetic */ class C16559b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C16560c f36742b;

    /* renamed from: c */
    public final /* synthetic */ boolean f36743c;

    public /* synthetic */ C16559b(C16560c cVar, boolean z) {
        this.f36742b = cVar;
        this.f36743c = z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r6 = this;
            com.google.firebase.installations.c r0 = r6.f36742b
            boolean r1 = r6.f36743c
            r0.getClass()
            java.lang.Object r2 = com.google.firebase.installations.C16560c.f36744m
            monitor-enter(r2)
            gm.c r3 = r0.f36746a     // Catch:{ all -> 0x00da }
            r3.mo69021a()     // Catch:{ all -> 0x00da }
            android.content.Context r3 = r3.f38672a     // Catch:{ all -> 0x00da }
            androidx.compose.ui.input.pointer.f r3 = androidx.compose.p015ui.input.pointer.C1634f.m3493c(r3)     // Catch:{ all -> 0x00da }
            com.google.firebase.installations.local.PersistedInstallation r4 = r0.f36748c     // Catch:{ all -> 0x00d3 }
            com.google.firebase.installations.local.b r4 = r4.mo59102b()     // Catch:{ all -> 0x00d3 }
            if (r3 == 0) goto L_0x0020
            r3.mo6597g()     // Catch:{ all -> 0x00da }
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            boolean r3 = r4.isErrored()     // Catch:{ FirebaseInstallationsException -> 0x00ce }
            if (r3 != 0) goto L_0x003d
            boolean r3 = r4.isUnregistered()     // Catch:{ FirebaseInstallationsException -> 0x00ce }
            if (r3 == 0) goto L_0x002e
            goto L_0x003d
        L_0x002e:
            if (r1 != 0) goto L_0x0038
            com.google.firebase.installations.j r1 = r0.f36749d     // Catch:{ FirebaseInstallationsException -> 0x00ce }
            boolean r1 = r1.mo59081a(r4)     // Catch:{ FirebaseInstallationsException -> 0x00ce }
            if (r1 == 0) goto L_0x00d2
        L_0x0038:
            com.google.firebase.installations.local.b r1 = r0.mo59070b(r4)     // Catch:{ FirebaseInstallationsException -> 0x00ce }
            goto L_0x0041
        L_0x003d:
            com.google.firebase.installations.local.b r1 = r0.mo59073e(r4)     // Catch:{ FirebaseInstallationsException -> 0x00ce }
        L_0x0041:
            monitor-enter(r2)
            gm.c r3 = r0.f36746a     // Catch:{ all -> 0x00cb }
            r3.mo69021a()     // Catch:{ all -> 0x00cb }
            android.content.Context r3 = r3.f38672a     // Catch:{ all -> 0x00cb }
            androidx.compose.ui.input.pointer.f r3 = androidx.compose.p015ui.input.pointer.C1634f.m3493c(r3)     // Catch:{ all -> 0x00cb }
            com.google.firebase.installations.local.PersistedInstallation r5 = r0.f36748c     // Catch:{ all -> 0x00c4 }
            r5.mo59101a(r1)     // Catch:{ all -> 0x00c4 }
            if (r3 == 0) goto L_0x0057
            r3.mo6597g()     // Catch:{ all -> 0x00cb }
        L_0x0057:
            monitor-exit(r2)     // Catch:{ all -> 0x00cb }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.f36756k     // Catch:{ all -> 0x00c1 }
            int r2 = r2.size()     // Catch:{ all -> 0x00c1 }
            if (r2 == 0) goto L_0x0088
            java.lang.String r2 = r4.getFirebaseInstallationId()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = r1.getFirebaseInstallationId()     // Catch:{ all -> 0x00c1 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00c1 }
            if (r2 != 0) goto L_0x0088
            java.util.HashSet r2 = r0.f36756k     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x0075:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x0088
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00c1 }
            zm.a r3 = (p730zm.C18969a) r3     // Catch:{ all -> 0x00c1 }
            r1.getFirebaseInstallationId()     // Catch:{ all -> 0x00c1 }
            r3.mo70411a()     // Catch:{ all -> 0x00c1 }
            goto L_0x0075
        L_0x0088:
            monitor-exit(r0)
            boolean r2 = r1.isRegistered()
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = r1.getFirebaseInstallationId()
            monitor-enter(r0)
            r0.f36755j = r2     // Catch:{ all -> 0x0098 }
            monitor-exit(r0)
            goto L_0x009b
        L_0x0098:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x009b:
            boolean r2 = r1.isErrored()
            if (r2 == 0) goto L_0x00ac
            com.google.firebase.installations.FirebaseInstallationsException r1 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r1.<init>(r2)
            r0.mo59074f(r1)
            goto L_0x00d2
        L_0x00ac:
            boolean r2 = r1.isNotGenerated()
            if (r2 == 0) goto L_0x00bd
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.mo59074f(r1)
            goto L_0x00d2
        L_0x00bd:
            r0.mo59075g(r1)
            goto L_0x00d2
        L_0x00c1:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00c4:
            r0 = move-exception
            if (r3 == 0) goto L_0x00ca
            r3.mo6597g()     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00cb }
            throw r0
        L_0x00ce:
            r1 = move-exception
            r0.mo59074f(r1)
        L_0x00d2:
            return
        L_0x00d3:
            r0 = move-exception
            if (r3 == 0) goto L_0x00d9
            r3.mo6597g()     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00da }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C16559b.run():void");
    }
}
