package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
public final /* synthetic */ class C15062p6 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f33755b;

    /* renamed from: c */
    public final /* synthetic */ Object f33756c;

    public /* synthetic */ C15062p6(Object obj, int i) {
        this.f33755b = i;
        this.f33756c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        android.util.Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.f33755b
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00a0
        L_0x0008:
            java.lang.Object r0 = r11.f33756c
            com.google.android.gms.measurement.internal.q6 r0 = (com.google.android.gms.measurement.internal.C15071q6) r0
            com.google.android.gms.measurement.internal.r6 r2 = r0.f33785d
            long r7 = r0.f33783b
            long r3 = r0.f33784c
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            r0.mo51995g()
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33731n
            java.lang.String r5 = "Application going to the background"
            r0.mo52237a(r5)
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            com.google.android.gms.measurement.internal.w2 r0 = r0.f33312q
            r0.mo52353a(r1)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            boolean r0 = r0.mo51974q()
            if (r0 != 0) goto L_0x008e
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.t6 r0 = r0.f33935f
            com.google.android.gms.measurement.internal.s6 r0 = r0.f33857c
            r0.mo52168a()
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            r5 = 0
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C14959e2.f33404f0
            boolean r0 = r0.mo51973p(r5, r9)
            r5 = 0
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.t6 r0 = r0.f33935f
            long r9 = r0.f33856b
            r0.f33856b = r3
            long r9 = r3 - r9
            java.lang.String r0 = "_et"
            r6.putLong(r0, r9)
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.v5 r0 = r0.mo52332t()
            com.google.android.gms.measurement.internal.p5 r0 = r0.mo52348n(r1)
            com.google.android.gms.measurement.internal.C15018k7.m24481s(r0, r6, r1)
            goto L_0x0087
        L_0x0086:
            r1 = r5
        L_0x0087:
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.t6 r0 = r0.f33935f
            r0.mo52319a(r3, r5, r1)
        L_0x008e:
            com.google.android.gms.measurement.internal.v6 r0 = r2.f33814b
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.j5 r3 = r0.mo52331s()
            java.lang.String r4 = "auto"
            java.lang.String r5 = "_ab"
            r3.mo52152n(r4, r5, r6, r7)
            return
        L_0x00a0:
            java.lang.Object r0 = r11.f33756c
            android.content.Context r0 = (android.content.Context) r0
            java.util.concurrent.atomic.AtomicReference r2 = p665rl.C18483a.f40713e
            java.lang.Class<sl.m> r2 = p673sl.C18533m.class
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x00c7 }
            sl.m r3 = p673sl.C18533m.f40801j     // Catch:{ all -> 0x00c4 }
            if (r3 != 0) goto L_0x00b6
            sl.m r3 = new sl.m     // Catch:{ all -> 0x00c4 }
            com.google.android.play.core.splitinstall.zzo r4 = com.google.android.play.core.splitinstall.zzo.INSTANCE     // Catch:{ all -> 0x00c4 }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x00c4 }
            p673sl.C18533m.f40801j = r3     // Catch:{ all -> 0x00c4 }
        L_0x00b6:
            sl.m r0 = p673sl.C18533m.f40801j     // Catch:{ all -> 0x00c4 }
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x00c7 }
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x00c7 }
            r0.f40214f = r1     // Catch:{ all -> 0x00c1 }
            r0.mo69853b()     // Catch:{ all -> 0x00c1 }
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x00c7 }
            goto L_0x00ce
        L_0x00c1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x00c7 }
            throw r1     // Catch:{ SecurityException -> 0x00c7 }
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x00c7 }
            throw r0     // Catch:{ SecurityException -> 0x00c7 }
        L_0x00c7:
            java.lang.String r0 = "SplitCompat"
            java.lang.String r1 = "Failed to set broadcast receiver to always on."
            android.util.Log.e(r0, r1)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15062p6.run():void");
    }
}
