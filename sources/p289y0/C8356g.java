package p289y0;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p015ui.text.input.C1993m;
import org.apache.commons.cli.HelpFormatter;
import p193o.C7499g;
import p280x0.C8292f;

/* renamed from: y0.g */
public final class C8356g {

    /* renamed from: a */
    public static final C8363m f18327a;

    /* renamed from: b */
    public static final C7499g<String, Typeface> f18328b = new C7499g<>(16);

    /* renamed from: y0.g$a */
    public static class C8357a extends C1993m {

        /* renamed from: B */
        public C8292f.C8295c f18329B;

        public C8357a(C8292f.C8295c cVar) {
            this.f18329B = cVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f18327a = new C8361k();
        } else if (i >= 28) {
            f18327a = new C8360j();
        } else {
            f18327a = new C8359i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m16678a(android.content.Context r7, p280x0.C8286d.C8287a r8, android.content.res.Resources r9, int r10, int r11, p280x0.C8292f.C8295c r12, boolean r13) {
        /*
            boolean r0 = r8 instanceof p280x0.C8286d.C8290d
            r1 = -3
            if (r0 == 0) goto L_0x0149
            x0.d$d r8 = (p280x0.C8286d.C8290d) r8
            java.lang.String r0 = r8.f18169d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x002f
            r12.mo20894b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            r0 = 1
            if (r13 == 0) goto L_0x0038
            int r4 = r8.f18168c
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            if (r12 != 0) goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            r0 = -1
            if (r13 == 0) goto L_0x0041
            int r13 = r8.f18167b
            goto L_0x0042
        L_0x0041:
            r13 = r0
        L_0x0042:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            y0.g$a r5 = new y0.g$a
            r5.<init>(r12)
            b1.e r8 = r8.f18166a
            b1.c r12 = new b1.c
            r12.<init>(r5, r4)
            if (r3 == 0) goto L_0x00cd
            o.g<java.lang.String, android.graphics.Typeface> r3 = p021b1.C3461j.f8071a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.f8060e
            r3.append(r6)
            java.lang.String r6 = "-"
            r3.append(r6)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            o.g<java.lang.String, android.graphics.Typeface> r6 = p021b1.C3461j.f8071a
            java.lang.Object r6 = r6.get(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0086
            b1.a r7 = new b1.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x015c
        L_0x0086:
            if (r13 != r0) goto L_0x0093
            b1.j$a r7 = p021b1.C3461j.m8293a(r3, r7, r8, r11)
            r12.mo12973a(r7)
            android.graphics.Typeface r2 = r7.f8075a
            goto L_0x015c
        L_0x0093:
            b1.f r0 = new b1.f
            r0.<init>(r3, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = p021b1.C3461j.f8072b     // Catch:{ InterruptedException -> 0x00bf }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00bf }
            long r3 = (long) r13
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ae }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ae }
            b1.j$a r7 = (p021b1.C3461j.C3462a) r7     // Catch:{ InterruptedException -> 0x00bf }
            r12.mo12973a(r7)     // Catch:{ InterruptedException -> 0x00bf }
            android.graphics.Typeface r2 = r7.f8075a     // Catch:{ InterruptedException -> 0x00bf }
            goto L_0x015c
        L_0x00ae:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00bf }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00bf }
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b6:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b8:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00bf }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00bf }
            throw r8     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00bf:
            androidx.compose.ui.text.input.m r7 = r12.f8053a
            android.os.Handler r8 = r12.f8054b
            b1.b r12 = new b1.b
            r12.<init>(r7, r1)
            r8.post(r12)
            goto L_0x015c
        L_0x00cd:
            o.g<java.lang.String, android.graphics.Typeface> r13 = p021b1.C3461j.f8071a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r8.f8060e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            o.g<java.lang.String, android.graphics.Typeface> r0 = p021b1.C3461j.f8071a
            java.lang.Object r0 = r0.get(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f9
            b1.a r7 = new b1.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x015c
        L_0x00f9:
            b1.g r0 = new b1.g
            r0.<init>(r12)
            java.lang.Object r3 = p021b1.C3461j.f8073c
            monitor-enter(r3)
            o.i<java.lang.String, java.util.ArrayList<d1.b<b1.j$a>>> r12 = p021b1.C3461j.f8074d     // Catch:{ all -> 0x0146 }
            java.lang.Object r1 = r12.getOrDefault(r13, r2)     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0110
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            goto L_0x015c
        L_0x0110:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0146 }
            r1.<init>()     // Catch:{ all -> 0x0146 }
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            r12.put(r13, r1)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            b1.h r12 = new b1.h
            r12.<init>(r13, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = p021b1.C3461j.f8072b
            b1.i r8 = new b1.i
            r8.<init>(r13)
            android.os.Looper r13 = android.os.Looper.myLooper()
            if (r13 != 0) goto L_0x0138
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r13.<init>(r0)
            goto L_0x013d
        L_0x0138:
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
        L_0x013d:
            b1.n r0 = new b1.n
            r0.<init>(r13, r12, r8)
            r7.execute(r0)
            goto L_0x015c
        L_0x0146:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            throw r7
        L_0x0149:
            y0.m r13 = f18327a
            x0.d$b r8 = (p280x0.C8286d.C8288b) r8
            android.graphics.Typeface r2 = r13.mo20944a(r7, r8, r9, r11)
            if (r12 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x0159
            r12.mo20894b(r2)
            goto L_0x015c
        L_0x0159:
            r12.mo20893a(r1)
        L_0x015c:
            if (r2 == 0) goto L_0x0167
            o.g<java.lang.String, android.graphics.Typeface> r7 = f18328b
            java.lang.String r8 = m16679b(r9, r10, r11)
            r7.put(r8, r2)
        L_0x0167:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p289y0.C8356g.m16678a(android.content.Context, x0.d$a, android.content.res.Resources, int, int, x0.f$c, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m16679b(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + HelpFormatter.DEFAULT_OPT_PREFIX + i + HelpFormatter.DEFAULT_OPT_PREFIX + i2;
    }
}
