package p365hg;

import androidx.appcompat.widget.C0326j;
import kotlin.jvm.internal.C19386q;

/* renamed from: hg.h0 */
public final class C12867h0 {

    /* renamed from: a */
    public static final String f28364a;

    /* renamed from: b */
    public static final String f28365b;

    /* renamed from: c */
    public static C12889o f28366c;

    static {
        new C12867h0();
        String c = C19386q.m32807a(C12867h0.class).mo71919c();
        if (c == null) {
            c = "UrlRedirectCache";
        }
        f28364a = c;
        f28365b = C0326j.m864i(c, "_Redirect");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7 = p365hg.C12845c0.f28334f;
        r1 = com.facebook.LoggingBehavior.CACHE;
        r3 = f28364a;
        r7.mo45625a(r1, 4, r3, "IOException when accessing cache: " + r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        p365hg.C12869i0.m20566e((java.io.Closeable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        throw r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20544a(android.net.Uri r6, android.net.Uri r7) {
        /*
            if (r6 == 0) goto L_0x0072
            if (r7 != 0) goto L_0x0005
            goto L_0x0072
        L_0x0005:
            r0 = 0
            java.lang.Class<hg.h0> r1 = p365hg.C12867h0.class
            monitor-enter(r1)     // Catch:{ IOException -> 0x0046 }
            hg.o r2 = f28366c     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            hg.o r2 = new hg.o     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = f28364a     // Catch:{ all -> 0x0048 }
            hg.o$d r4 = new hg.o$d     // Catch:{ all -> 0x0048 }
            r4.<init>()     // Catch:{ all -> 0x0048 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0048 }
        L_0x001a:
            f28366c = r2     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = "fromUri.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r6, r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r1 = f28365b     // Catch:{ IOException -> 0x0046 }
            java.io.BufferedOutputStream r0 = r2.mo45650c(r6, r1)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r6 = r7.toString()     // Catch:{ IOException -> 0x0046 }
            java.lang.String r7 = "toUri.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)     // Catch:{ IOException -> 0x0046 }
            java.nio.charset.Charset r7 = kotlin.text.C19446a.f43373b     // Catch:{ IOException -> 0x0046 }
            byte[] r6 = r6.getBytes(r7)     // Catch:{ IOException -> 0x0046 }
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)     // Catch:{ IOException -> 0x0046 }
            r0.write(r6)     // Catch:{ IOException -> 0x0046 }
            goto L_0x006a
        L_0x0044:
            r6 = move-exception
            goto L_0x006e
        L_0x0046:
            r6 = move-exception
            goto L_0x004b
        L_0x0048:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x0046 }
            throw r6     // Catch:{ IOException -> 0x0046 }
        L_0x004b:
            hg.c0$a r7 = p365hg.C12845c0.f28334f     // Catch:{ all -> 0x0044 }
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.CACHE     // Catch:{ all -> 0x0044 }
            r2 = 4
            java.lang.String r3 = f28364a     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r4.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "IOException when accessing cache: "
            r4.append(r5)     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0044 }
            r4.append(r6)     // Catch:{ all -> 0x0044 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0044 }
            r7.mo45625a(r1, r2, r3, r6)     // Catch:{ all -> 0x0044 }
        L_0x006a:
            p365hg.C12869i0.m20566e(r0)
            return
        L_0x006e:
            p365hg.C12869i0.m20566e(r0)
            throw r6
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p365hg.C12867h0.m20544a(android.net.Uri, android.net.Uri):void");
    }
}
