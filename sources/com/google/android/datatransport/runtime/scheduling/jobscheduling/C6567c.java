package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.C6556p;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
public final /* synthetic */ class C6567c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6573i f14501b;

    /* renamed from: c */
    public final /* synthetic */ C6556p f14502c;

    /* renamed from: d */
    public final /* synthetic */ int f14503d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f14504e;

    public /* synthetic */ C6567c(C6573i iVar, C6556p pVar, int i, Runnable runnable) {
        this.f14501b = iVar;
        this.f14502c = pVar;
        this.f14503d = i;
        this.f14504e = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f14522d.mo18752a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.i r0 = r8.f14501b
            com.google.android.datatransport.runtime.p r1 = r8.f14502c
            int r2 = r8.f14503d
            java.lang.Runnable r3 = r8.f14504e
            r0.getClass()
            r4 = 1
            gh.a r5 = r0.f14524f     // Catch:{ SynchronizationException -> 0x0047 }
            com.google.android.datatransport.runtime.scheduling.persistence.b r6 = r0.f14521c     // Catch:{ SynchronizationException -> 0x0047 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            be.a r7 = new be.a     // Catch:{ SynchronizationException -> 0x0047 }
            r7.<init>(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            r5.mo18790e(r7)     // Catch:{ SynchronizationException -> 0x0047 }
            android.content.Context r5 = r0.f14519a     // Catch:{ SynchronizationException -> 0x0047 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0047 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0047 }
            if (r5 == 0) goto L_0x0033
            r5 = r4
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            if (r5 != 0) goto L_0x0041
            gh.a r5 = r0.f14524f     // Catch:{ SynchronizationException -> 0x0047 }
            com.google.android.datatransport.runtime.scheduling.jobscheduling.d r6 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.d     // Catch:{ SynchronizationException -> 0x0047 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0047 }
            r5.mo18790e(r6)     // Catch:{ SynchronizationException -> 0x0047 }
            goto L_0x004d
        L_0x0041:
            r0.mo18755a(r1, r2)     // Catch:{ SynchronizationException -> 0x0047 }
            goto L_0x004d
        L_0x0045:
            r0 = move-exception
            goto L_0x0051
        L_0x0047:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.m r0 = r0.f14522d     // Catch:{ all -> 0x0045 }
            int r2 = r2 + r4
            r0.mo18752a(r1, r2)     // Catch:{ all -> 0x0045 }
        L_0x004d:
            r3.run()
            return
        L_0x0051:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C6567c.run():void");
    }
}
