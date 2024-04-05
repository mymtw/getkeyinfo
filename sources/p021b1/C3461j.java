package p021b1;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import com.etsy.android.lib.requests.EtsyRequest;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p077d1.C6618b;
import p193o.C7499g;
import p193o.C7506i;

/* renamed from: b1.j */
public final class C3461j {

    /* renamed from: a */
    public static final C7499g<String, Typeface> f8071a = new C7499g<>(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f8072b;

    /* renamed from: c */
    public static final Object f8073c = new Object();

    /* renamed from: d */
    public static final C7506i<String, ArrayList<C6618b<C3462a>>> f8074d = new C7506i<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) EtsyRequest.DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C3465m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f8072b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p021b1.C3461j.C3462a m8293a(java.lang.String r6, android.content.Context r7, p021b1.C3456e r8, int r9) {
        /*
            o.g<java.lang.String, android.graphics.Typeface> r0 = f8071a
            java.lang.Object r0 = r0.get(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            b1.j$a r6 = new b1.j$a
            r6.<init>((android.graphics.Typeface) r0)
            return r6
        L_0x0010:
            b1.k r8 = p021b1.C3454d.m8291a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0060 }
            int r0 = r8.f8077a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r0 = -2
            goto L_0x003d
        L_0x001f:
            b1.l[] r0 = r8.f8078b
            if (r0 == 0) goto L_0x003c
            int r3 = r0.length
            if (r3 != 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x002a:
            if (r4 >= r2) goto L_0x003b
            r5 = r0[r4]
            int r5 = r5.f8083e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r0 = r1
            goto L_0x003d
        L_0x0036:
            r0 = r5
            goto L_0x003d
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r2 = r3
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            b1.j$a r6 = new b1.j$a
            r6.<init>((int) r0)
            return r6
        L_0x0045:
            b1.l[] r8 = r8.f8078b
            y0.m r0 = p289y0.C8356g.f18327a
            android.graphics.Typeface r7 = r0.mo20945b(r7, r8, r9)
            if (r7 == 0) goto L_0x005a
            o.g<java.lang.String, android.graphics.Typeface> r8 = f8071a
            r8.put(r6, r7)
            b1.j$a r6 = new b1.j$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x005a:
            b1.j$a r6 = new b1.j$a
            r6.<init>((int) r1)
            return r6
        L_0x0060:
            b1.j$a r6 = new b1.j$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C3461j.m8293a(java.lang.String, android.content.Context, b1.e, int):b1.j$a");
    }

    /* renamed from: b1.j$a */
    public static final class C3462a {

        /* renamed from: a */
        public final Typeface f8075a;

        /* renamed from: b */
        public final int f8076b;

        public C3462a(int i) {
            this.f8075a = null;
            this.f8076b = i;
        }

        @SuppressLint({"WrongConstant"})
        public C3462a(Typeface typeface) {
            this.f8075a = typeface;
            this.f8076b = 0;
        }
    }
}
