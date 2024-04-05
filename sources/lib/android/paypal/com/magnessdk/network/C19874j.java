package lib.android.paypal.com.magnessdk.network;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import p770sq.C20168b;

/* renamed from: lib.android.paypal.com.magnessdk.network.j */
public final class C19874j extends Handler {

    /* renamed from: a */
    private static C19874j f43856a;

    /* renamed from: b */
    private WeakReference<C20168b> f43857b;

    private C19874j(Looper looper, C20168b bVar) {
        super(looper);
        this.f43857b = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public static synchronized C19874j m33866a(Looper looper, C20168b bVar) {
        C19874j jVar;
        synchronized (C19874j.class) {
            if (f43856a == null) {
                f43856a = new C19874j(looper, bVar);
            }
            jVar = f43856a;
        }
        return jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b5, code lost:
        r2.append(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<sq.b> r0 = r4.f43857b
            java.lang.Object r0 = r0.get()
            sq.b r0 = (p770sq.C20168b) r0
            if (r0 == 0) goto L_0x0114
            int r0 = r5.what
            r1 = 0
            if (r0 == 0) goto L_0x00fc
            r2 = 1
            r3 = 3
            if (r0 == r2) goto L_0x00e3
            r2 = 2
            if (r0 == r2) goto L_0x00d9
            switch(r0) {
                case 10: goto L_0x003c;
                case 11: goto L_0x0031;
                case 12: goto L_0x0026;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r0) {
                case 20: goto L_0x005d;
                case 21: goto L_0x0052;
                case 22: goto L_0x0047;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r0) {
                case 40: goto L_0x007e;
                case 41: goto L_0x0073;
                case 42: goto L_0x0068;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r2 = "POST request to "
            switch(r0) {
                case 50: goto L_0x00cd;
                case 51: goto L_0x00c3;
                case 52: goto L_0x00b9;
                case 53: goto L_0x00a8;
                case 54: goto L_0x0097;
                case 55: goto L_0x0089;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0114
        L_0x0026:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remote config fetched successfully. "
            goto L_0x0105
        L_0x0031:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "remote config error. "
            goto L_0x00ec
        L_0x003c:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "remote config started. fetching "
            goto L_0x0105
        L_0x0047:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "beacon successed. "
            goto L_0x0105
        L_0x0052:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "beacon error. "
            goto L_0x00ec
        L_0x005d:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "beacon started. "
            goto L_0x0105
        L_0x0068:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "s request successed. "
            goto L_0x0105
        L_0x0073:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "s request error. "
            goto L_0x00ec
        L_0x007e:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "s request started. "
            goto L_0x0105
        L_0x0089:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.Object r5 = r5.obj
            r2.append(r5)
            java.lang.String r5 = " successfully."
            goto L_0x00b5
        L_0x0097:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.Object r5 = r5.obj
            r1.append(r5)
            java.lang.String r5 = "error."
            r1.append(r5)
            goto L_0x00f4
        L_0x00a8:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.Object r5 = r5.obj
            r2.append(r5)
            java.lang.String r5 = " started."
        L_0x00b5:
            r2.append(r5)
            goto L_0x010d
        L_0x00b9:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "GET request succeeded with: "
            goto L_0x0105
        L_0x00c3:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GET request error with HTTP code: "
            goto L_0x00ec
        L_0x00cd:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.Object r5 = r5.obj
            vq.h r5 = (p774vq.C20213h) r5
            r5.getClass()
            java.lang.String r5 = "GET request to https://www.paypalobjects.com/digitalassets/c/rda-magnes/magnes_android_rc_v1.json started."
            goto L_0x0111
        L_0x00d9:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "device info payload successed. "
            goto L_0x0105
        L_0x00e3:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "device info payload error. "
        L_0x00ec:
            r1.append(r2)
            java.lang.Object r5 = r5.obj
            r1.append(r5)
        L_0x00f4:
            java.lang.String r5 = r1.toString()
            p773uq.C20205a.m34554a(r5, r3, r0)
            goto L_0x0114
        L_0x00fc:
            java.lang.Class<lib.android.paypal.com.magnessdk.network.j> r0 = lib.android.paypal.com.magnessdk.network.C19874j.class
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "device info payload started. "
        L_0x0105:
            r2.append(r3)
            java.lang.Object r5 = r5.obj
            r2.append(r5)
        L_0x010d:
            java.lang.String r5 = r2.toString()
        L_0x0111:
            p773uq.C20205a.m34554a(r5, r1, r0)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.android.paypal.com.magnessdk.network.C19874j.handleMessage(android.os.Message):void");
    }
}
