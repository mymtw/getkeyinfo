package p253u3;

import okhttp3.C19944e;

/* renamed from: u3.b */
public final /* synthetic */ class C8135b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C8139f f17804b;

    /* renamed from: c */
    public final /* synthetic */ C19944e.C19945a f17805c = null;

    /* renamed from: d */
    public final /* synthetic */ String f17806d = null;

    /* renamed from: e */
    public final /* synthetic */ C8139f f17807e;

    public /* synthetic */ C8135b(C8139f fVar, C8139f fVar2) {
        this.f17804b = fVar;
        this.f17807e = fVar2;
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [w3.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        p253u3.C8149n.f17874c.mo20765a("u3.f", java.lang.String.format("Failed to initialize Amplitude SDK due to: %s", new java.lang.Object[]{r0.getMessage()}));
        r3.f17822d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            u3.f r0 = r11.f17804b
            okhttp3.e$a r1 = r11.f17805c
            java.lang.String r2 = r11.f17806d
            u3.f r3 = r11.f17807e
            boolean r4 = r0.f17826h
            if (r4 != 0) goto L_0x00d8
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x002a
            androidx.compose.animation.c r1 = new androidx.compose.animation.c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r1.<init>()     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.Object r6 = p272w3.C8229a.f18061d     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            boolean r6 = r1 instanceof p272w3.C8229a     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            if (r6 == 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            w3.a r6 = new w3.a     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r6.<init>(r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r1 = r6
        L_0x0022:
            u3.c r6 = new u3.c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r6.<init>(r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17820b = r6     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            goto L_0x002c
        L_0x002a:
            r0.f17820b = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
        L_0x002c:
            u3.q r1 = new u3.q     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            android.content.Context r6 = r0.f17819a     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            boolean r7 = r0.f17830l     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r1.<init>(r6, r7)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17838t = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = r0.mo20748d()     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17825g = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            u3.q r1 = r0.f17838t     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r1.mo20787a()     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = "user_id"
            if (r2 == 0) goto L_0x004e
            r3.f17824f = r2     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            u3.o r6 = r0.f17821c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r6.mo20785u(r1, r2)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            goto L_0x005c
        L_0x004e:
            u3.o r2 = r0.f17821c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            monitor-enter(r2)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r6 = "store"
            java.lang.Object r1 = r2.mo20779k(r6, r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00bc }
            monitor-exit(r2)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r3.f17824f = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
        L_0x005c:
            u3.o r1 = r0.f17821c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r2 = "opt_out"
            monitor-enter(r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r6 = "long_store"
            java.lang.Object r2 = r1.mo20779k(r6, r2)     // Catch:{ all -> 0x00b9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x00b9 }
            monitor-exit(r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            if (r2 == 0) goto L_0x0078
            long r1 = r2.longValue()     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r6 = 1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0078
            r1 = r5
            goto L_0x0079
        L_0x0078:
            r1 = r4
        L_0x0079:
            r0.f17827i = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = "previous_session_id"
            r6 = -1
            long r1 = r0.mo20747c(r6, r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17837s = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x008d
            r0.f17832n = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
        L_0x008d:
            java.lang.String r1 = "sequence_number"
            long r1 = r0.mo20747c(r8, r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17833o = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = "last_event_id"
            long r1 = r0.mo20747c(r6, r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17834p = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = "last_identify_id"
            long r1 = r0.mo20747c(r6, r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17835q = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            java.lang.String r1 = "last_event_time"
            long r1 = r0.mo20747c(r6, r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17836r = r1     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            u3.o r1 = r0.f17821c     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            u3.i r2 = new u3.i     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r2.<init>(r0, r3)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r1.f17882d = r2     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            r0.f17826h = r5     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            goto L_0x00d8
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            throw r0     // Catch:{ CursorWindowAllocationException -> 0x00bf }
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ CursorWindowAllocationException -> 0x00bf }
            throw r0     // Catch:{ CursorWindowAllocationException -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            u3.n r1 = p253u3.C8149n.f17874c
            java.lang.String r2 = "u3.f"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r0 = r0.getMessage()
            r5[r4] = r0
            java.lang.String r0 = "Failed to initialize Amplitude SDK due to: %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            r1.mo20765a(r2, r0)
            r0 = 0
            r3.f17822d = r0
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8135b.run():void");
    }
}
