package androidx.room;

/* renamed from: androidx.room.s */
public final /* synthetic */ class C3253s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f7573b;

    /* renamed from: c */
    public final /* synthetic */ Object f7574c;

    /* renamed from: d */
    public final /* synthetic */ Object f7575d;

    public /* synthetic */ C3253s(int i, Object obj, Object obj2) {
        this.f7573b = i;
        this.f7574c = obj;
        this.f7575d = obj2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f7573b
            switch(r0) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0012;
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0073
        L_0x0006:
            java.lang.Object r0 = r7.f7574c
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            java.lang.Object r1 = r7.f7575d
            com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence$cycleIV$animatedCallBack$1 r1 = (com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence$cycleIV$animatedCallBack$1) r1
            com.paypal.pyplcheckout.animation.sequences.CheckoutAnimationSequence.m28697e(r0, r1)
            return
        L_0x0012:
            java.lang.Object r0 = r7.f7574c
            ai.f r0 = (p504ai.C13980f) r0
            java.lang.Object r1 = r7.f7575d
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r2 = r0.f30729a
            monitor-enter(r2)
            boolean r3 = r0.f30740l     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x0022
            goto L_0x005f
        L_0x0022:
            long r3 = r0.f30739k     // Catch:{ all -> 0x0064 }
            r5 = 1
            long r3 = r3 - r5
            r0.f30739k = r3     // Catch:{ all -> 0x0064 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            if (r3 >= 0) goto L_0x0041
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.Object r3 = r0.f30729a     // Catch:{ all -> 0x0064 }
            monitor-enter(r3)     // Catch:{ all -> 0x0064 }
            r0.f30741m = r1     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            goto L_0x005f
        L_0x003e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0041:
            r0.mo46790a()     // Catch:{ all -> 0x0064 }
            r1.run()     // Catch:{ IllegalStateException -> 0x0058, Exception -> 0x0048 }
            goto L_0x005f
        L_0x0048:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            r3.<init>(r1)     // Catch:{ all -> 0x0064 }
            java.lang.Object r1 = r0.f30729a     // Catch:{ all -> 0x0064 }
            monitor-enter(r1)     // Catch:{ all -> 0x0064 }
            r0.f30741m = r3     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            goto L_0x005f
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0058:
            r1 = move-exception
            java.lang.Object r3 = r0.f30729a     // Catch:{ all -> 0x0064 }
            monitor-enter(r3)     // Catch:{ all -> 0x0064 }
            r0.f30741m = r1     // Catch:{ all -> 0x0061 }
            monitor-exit(r3)     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0064 }
            throw r0
        L_0x0067:
            java.lang.Object r0 = r7.f7574c
            androidx.room.u r0 = (androidx.room.C3255u) r0
            r0.getClass()
            java.util.Collections.emptyList()
            r0 = 0
            throw r0
        L_0x0073:
            java.lang.Object r0 = r7.f7574c
            com.paypal.pyplcheckout.services.callbacks.UpdateOrderCallback r0 = (com.paypal.pyplcheckout.services.callbacks.UpdateOrderCallback) r0
            java.lang.Object r1 = r7.f7575d
            com.paypal.pyplcheckout.exception.PYPLException r1 = (com.paypal.pyplcheckout.exception.PYPLException) r1
            com.paypal.pyplcheckout.services.callbacks.UpdateOrderCallback.m28990b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C3253s.run():void");
    }
}
