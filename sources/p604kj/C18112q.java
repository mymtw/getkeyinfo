package p604kj;

import android.content.Context;

/* renamed from: kj.q */
public final class C18112q {

    /* renamed from: a */
    public final Context f39552a;

    /* renamed from: b */
    public int f39553b;

    /* renamed from: c */
    public int f39554c = 0;

    public C18112q(Context context) {
        this.f39552a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo69651a() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f39554c     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return r0
        L_0x0007:
            android.content.Context r0 = r5.f39552a     // Catch:{ all -> 0x007f }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x007f }
            android.content.Context r1 = r5.f39552a     // Catch:{ all -> 0x007f }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r1 = r1.checkPermission(r2, r3)     // Catch:{ all -> 0x007f }
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L_0x0028
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r3
        L_0x0028:
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x007f }
            r2 = 1
            if (r1 != 0) goto L_0x004c
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r1 = r0.queryIntentServices(r1, r3)     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x004c
            int r1 = r1.size()     // Catch:{ all -> 0x007f }
            if (r1 > 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r5.f39554c = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r2
        L_0x004c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r1.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "com.google.android.gms"
            r1.setPackage(r4)     // Catch:{ all -> 0x007f }
            java.util.List r0 = r0.queryBroadcastReceivers(r1, r3)     // Catch:{ all -> 0x007f }
            r1 = 2
            if (r0 == 0) goto L_0x006a
            int r0 = r0.size()     // Catch:{ all -> 0x007f }
            if (r0 > 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            r5.f39554c = r1     // Catch:{ all -> 0x007f }
            monitor-exit(r5)
            return r1
        L_0x006a:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r3)     // Catch:{ all -> 0x007f }
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007b
            r5.f39554c = r1     // Catch:{ all -> 0x007f }
            r2 = r1
            goto L_0x007d
        L_0x007b:
            r5.f39554c = r2     // Catch:{ all -> 0x007f }
        L_0x007d:
            monitor-exit(r5)
            return r2
        L_0x007f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p604kj.C18112q.mo69651a():int");
    }
}
