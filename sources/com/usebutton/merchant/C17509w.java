package com.usebutton.merchant;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.usebutton.merchant.w */
public final class C17509w implements C17508v {

    /* renamed from: d */
    public static C17509w f38290d;

    /* renamed from: a */
    public final Context f38291a;

    /* renamed from: b */
    public final C17513z f38292b;

    /* renamed from: c */
    public C17510a f38293c = new C17510a();

    /* renamed from: com.usebutton.merchant.w$a */
    public class C17510a {
    }

    public C17509w(Context context, C17513z zVar) {
        this.f38291a = context;
        this.f38292b = zVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo68686a() {
        /*
            r7 = this;
            com.usebutton.merchant.z r0 = r7.f38292b
            com.usebutton.merchant.z$a r1 = r0.mo68688a()
            android.content.Context r2 = r0.f38303a
            boolean r3 = r1.f38305a
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            java.lang.reflect.Method r3 = r1.f38306b     // Catch:{ Exception -> 0x0034 }
            java.lang.Class<?> r1 = r1.f38307c     // Catch:{ Exception -> 0x0034 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0034 }
            r6[r5] = r2     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r1 = r3.invoke(r1, r6)     // Catch:{ Exception -> 0x0034 }
            java.lang.Class r2 = r1.getClass()     // Catch:{ Exception -> 0x0034 }
            java.lang.String r3 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0034 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch:{ Exception -> 0x0034 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0034 }
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch:{ Exception -> 0x0034 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x0034 }
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r1 = r5
        L_0x0035:
            r2 = 0
            if (r1 != 0) goto L_0x0078
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            if (r1 != r3) goto L_0x0048
            r1 = r4
            goto L_0x0049
        L_0x0048:
            r1 = r5
        L_0x0049:
            if (r1 == 0) goto L_0x004c
            goto L_0x0078
        L_0x004c:
            com.usebutton.merchant.z$a r1 = r0.mo68688a()
            android.content.Context r0 = r0.f38303a
            boolean r3 = r1.f38305a
            if (r3 != 0) goto L_0x0057
            goto L_0x0078
        L_0x0057:
            java.lang.reflect.Method r3 = r1.f38306b     // Catch:{ Exception -> 0x0078 }
            java.lang.Class<?> r1 = r1.f38307c     // Catch:{ Exception -> 0x0078 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0078 }
            r4[r5] = r0     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r0 = r3.invoke(r1, r4)     // Catch:{ Exception -> 0x0078 }
            java.lang.Class r1 = r0.getClass()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = "getId"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0078 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)     // Catch:{ Exception -> 0x0078 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r0 = r1.invoke(r0, r3)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0078 }
            r2 = r0
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.merchant.C17509w.mo68686a():java.lang.String");
    }

    /* renamed from: b */
    public final PackageInfo mo68687b() {
        try {
            return this.f38291a.getPackageManager().getPackageInfo(this.f38291a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
