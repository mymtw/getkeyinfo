package com.usebutton.merchant;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: com.usebutton.merchant.z */
public final class C17513z {

    /* renamed from: c */
    public static final long f38302c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a */
    public final Context f38303a;

    /* renamed from: b */
    public C17490h0<C17514a> f38304b;

    /* renamed from: com.usebutton.merchant.z$a */
    public static class C17514a {

        /* renamed from: a */
        public boolean f38305a;

        /* renamed from: b */
        public Method f38306b;

        /* renamed from: c */
        public Class<?> f38307c;

        public C17514a() {
            Class<AdvertisingIdClient> cls = AdvertisingIdClient.class;
            try {
                this.f38307c = cls;
                this.f38306b = cls.getDeclaredMethod("getAdvertisingIdInfo", new Class[]{Context.class});
                this.f38305a = true;
            } catch (Exception unused) {
                this.f38305a = false;
            }
        }
    }

    public C17513z(Context context) {
        this.f38303a = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if ((android.os.SystemClock.elapsedRealtime() > r0.f38251b) != false) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.usebutton.merchant.C17513z.C17514a mo68688a() {
        /*
            r7 = this;
            com.usebutton.merchant.h0<com.usebutton.merchant.z$a> r0 = r7.f38304b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.f38251b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x0023
        L_0x0015:
            com.usebutton.merchant.h0 r0 = new com.usebutton.merchant.h0
            com.usebutton.merchant.z$a r3 = new com.usebutton.merchant.z$a
            r3.<init>()
            long r4 = f38302c
            r0.<init>(r3, r4)
            r7.f38304b = r0
        L_0x0023:
            com.usebutton.merchant.h0<com.usebutton.merchant.z$a> r0 = r7.f38304b
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.f38251b
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            if (r1 == 0) goto L_0x0038
            r0 = 0
            goto L_0x003a
        L_0x0038:
            T r0 = r0.f38250a
        L_0x003a:
            com.usebutton.merchant.z$a r0 = (com.usebutton.merchant.C17513z.C17514a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.merchant.C17513z.mo68688a():com.usebutton.merchant.z$a");
    }
}
