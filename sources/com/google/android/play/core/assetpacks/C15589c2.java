package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.gms.measurement.internal.C15032m3;

/* renamed from: com.google.android.play.core.assetpacks.c2 */
public final class C15589c2 {

    /* renamed from: c */
    public static final C15032m3 f35098c = new C15032m3("PackageStateCache");

    /* renamed from: a */
    public final Context f35099a;

    /* renamed from: b */
    public int f35100b = -1;

    public C15589c2(Context context) {
        this.f35099a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo55388a() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f35100b     // Catch:{ all -> 0x0029 }
            r1 = -1
            if (r0 != r1) goto L_0x0025
            r0 = 0
            android.content.Context r1 = r3.f35099a     // Catch:{ NameNotFoundException -> 0x001c }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.Context r2 = r3.f35099a     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001c }
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x001c }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x001c }
            r3.f35100b = r1     // Catch:{ NameNotFoundException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            com.google.android.gms.measurement.internal.m3 r1 = f35098c     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "The current version of the app could not be retrieved"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0029 }
            r1.mo52243c(r2, r0)     // Catch:{ all -> 0x0029 }
        L_0x0025:
            int r0 = r3.f35100b     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15589c2.mo55388a():int");
    }
}
