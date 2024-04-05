package p250u0;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: u0.j */
public final class C8094j {

    /* renamed from: a */
    public final Bundle f17639a;

    /* renamed from: b */
    public IconCompat f17640b;

    /* renamed from: c */
    public final C8111v[] f17641c;

    /* renamed from: d */
    public boolean f17642d;

    /* renamed from: e */
    public boolean f17643e = true;

    /* renamed from: f */
    public final int f17644f;

    /* renamed from: g */
    public final boolean f17645g;
    @Deprecated

    /* renamed from: h */
    public int f17646h;

    /* renamed from: i */
    public CharSequence f17647i;

    /* renamed from: j */
    public PendingIntent f17648j;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8094j(androidx.core.graphics.drawable.IconCompat r11, java.lang.CharSequence r12, android.app.PendingIntent r13, android.os.Bundle r14, p250u0.C8111v[] r15, p250u0.C8111v[] r16, boolean r17, int r18, boolean r19, boolean r20) {
        /*
            r10 = this;
            r1 = r10
            r2 = r11
            r10.<init>()
            r0 = 1
            r1.f17643e = r0
            r1.f17640b = r2
            if (r2 == 0) goto L_0x0083
            int r0 = r2.f5517a
            r3 = -1
            if (r0 != r3) goto L_0x007a
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r4 = r2.f5518b
            android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
            java.lang.String r5 = "Unable to get icon type "
            java.lang.String r6 = "IconCompat"
            r7 = 28
            if (r0 < r7) goto L_0x0024
            int r0 = r4.getType()
            goto L_0x007a
        L_0x0024:
            java.lang.Class r0 = r4.getClass()     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            java.lang.String r7 = "getType"
            r8 = 0
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r0 = r0.getMethod(r7, r9)     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            java.lang.Object r0 = r0.invoke(r4, r7)     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            int r0 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x0066, InvocationTargetException -> 0x0052, NoSuchMethodException -> 0x003e }
            goto L_0x007a
        L_0x003e:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r6, r4, r0)
            goto L_0x0079
        L_0x0052:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r6, r4, r0)
            goto L_0x0079
        L_0x0066:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            android.util.Log.e(r6, r4, r0)
        L_0x0079:
            r0 = r3
        L_0x007a:
            r3 = 2
            if (r0 != r3) goto L_0x0083
            int r0 = r11.mo8747d()
            r1.f17646h = r0
        L_0x0083:
            java.lang.CharSequence r0 = p250u0.C8100m.m16287c(r12)
            r1.f17647i = r0
            r2 = r13
            r1.f17648j = r2
            if (r14 == 0) goto L_0x0090
            r0 = r14
            goto L_0x0095
        L_0x0090:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0095:
            r1.f17639a = r0
            r2 = r15
            r1.f17641c = r2
            r2 = r17
            r1.f17642d = r2
            r2 = r18
            r1.f17644f = r2
            r2 = r19
            r1.f17643e = r2
            r2 = r20
            r1.f17645g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p250u0.C8094j.<init>(androidx.core.graphics.drawable.IconCompat, java.lang.CharSequence, android.app.PendingIntent, android.os.Bundle, u0.v[], u0.v[], boolean, int, boolean, boolean):void");
    }

    /* renamed from: a */
    public final IconCompat mo20683a() {
        int i;
        if (this.f17640b == null && (i = this.f17646h) != 0) {
            this.f17640b = IconCompat.m4961c((Resources) null, "", i);
        }
        return this.f17640b;
    }
}
