package p604kj;

/* renamed from: kj.g */
public final /* synthetic */ class C18102g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f39525b;

    /* renamed from: c */
    public final /* synthetic */ Object f39526c;

    public /* synthetic */ C18102g(Object obj, int i) {
        this.f39525b = i;
        this.f39526c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(r3.length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r3 = r0.f39540g.f39548a;
        r4 = r0.f39536c;
        r5 = android.os.Message.obtain();
        r5.what = r1.f39545c;
        r5.arg1 = r1.f39543a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo69646b());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f39546d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = r0.f39537d;
        r3 = r1.f39541a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r3 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00aa, code lost:
        r1 = r1.f39542b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        if (r1 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        r1.zzb(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ba, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bc, code lost:
        r0.mo69639a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f39525b
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c8
        L_0x0007:
            java.lang.Object r0 = r8.f39526c
            kj.k r0 = (p604kj.C18106k) r0
        L_0x000b:
            monitor-enter(r0)
            int r1 = r0.f39535b     // Catch:{ all -> 0x00c5 }
            r2 = 2
            if (r1 == r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x001f
        L_0x0013:
            java.util.ArrayDeque r1 = r0.f39538e     // Catch:{ all -> 0x00c5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x0020
            r0.mo69641c()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
        L_0x001f:
            return
        L_0x0020:
            java.util.ArrayDeque r1 = r0.f39538e     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00c5 }
            kj.n r1 = (p604kj.C18109n) r1     // Catch:{ all -> 0x00c5 }
            android.util.SparseArray<kj.n<?>> r3 = r0.f39539f     // Catch:{ all -> 0x00c5 }
            int r4 = r1.f39543a     // Catch:{ all -> 0x00c5 }
            r3.put(r4, r1)     // Catch:{ all -> 0x00c5 }
            kj.p r3 = r0.f39540g     // Catch:{ all -> 0x00c5 }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f39549b     // Catch:{ all -> 0x00c5 }
            kj.j r4 = new kj.j     // Catch:{ all -> 0x00c5 }
            r5 = 0
            r4.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x00c5 }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00c5 }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            java.lang.String r3 = "MessengerIpcClient"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 8
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r4 = r5.toString()
            android.util.Log.d(r3, r4)
        L_0x006a:
            kj.p r3 = r0.f39540g
            android.content.Context r3 = r3.f39548a
            android.os.Messenger r4 = r0.f39536c
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f39545c
            r5.what = r6
            int r6 = r1.f39543a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "oneWay"
            boolean r7 = r1.mo69646b()
            r4.putBoolean(r6, r7)
            java.lang.String r6 = "pkg"
            java.lang.String r3 = r3.getPackageName()
            r4.putString(r6, r3)
            java.lang.String r3 = "data"
            android.os.Bundle r1 = r1.f39546d
            r4.putBundle(r3, r1)
            r5.setData(r4)
            kj.l r1 = r0.f39537d     // Catch:{ RemoteException -> 0x00bb }
            android.os.Messenger r3 = r1.f39541a     // Catch:{ RemoteException -> 0x00bb }
            if (r3 == 0) goto L_0x00aa
            r3.send(r5)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x000b
        L_0x00aa:
            com.google.android.gms.cloudmessaging.zzd r1 = r1.f39542b     // Catch:{ RemoteException -> 0x00bb }
            if (r1 == 0) goto L_0x00b3
            r1.zzb(r5)     // Catch:{ RemoteException -> 0x00bb }
            goto L_0x000b
        L_0x00b3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x00bb }
            java.lang.String r3 = "Both messengers are null"
            r1.<init>(r3)     // Catch:{ RemoteException -> 0x00bb }
            throw r1     // Catch:{ RemoteException -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo69639a(r2, r1)
            goto L_0x000b
        L_0x00c5:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            throw r1
        L_0x00c8:
            java.lang.Object r0 = r8.f39526c
            com.google.android.gms.measurement.internal.v5 r0 = (com.google.android.gms.measurement.internal.C15113v5) r0
            r1 = 0
            r0.f33929k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kj.C18102g.run():void");
    }
}
