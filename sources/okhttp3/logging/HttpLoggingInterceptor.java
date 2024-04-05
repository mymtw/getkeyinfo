package okhttp3.logging;

import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19994o;
import okhttp3.C20000q;

public final class HttpLoggingInterceptor implements C20000q {

    /* renamed from: b */
    public volatile EmptySet f44223b;

    /* renamed from: c */
    public volatile Level f44224c;

    /* renamed from: d */
    public final C19987a f44225d;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface C19987a {

        /* renamed from: a */
        public static final C19988a f44226a = new C19988a();

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this(0);
    }

    public HttpLoggingInterceptor(C19987a aVar) {
        C19383o.m32797g(aVar, "logger");
        this.f44225d = aVar;
        this.f44223b = EmptySet.INSTANCE;
        this.f44224c = Level.NONE;
    }

    /* renamed from: a */
    public final void mo72942a(C19994o oVar, int i) {
        String m = this.f44223b.contains(oVar.mo72949c(i)) ? "██" : oVar.mo72955m(i);
        C19987a aVar = this.f44225d;
        aVar.log(oVar.mo72949c(i) + ": " + m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5 A[LOOP:0: B:39:0x00f3->B:40:0x00f5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C20018z intercept(okhttp3.C20000q.C20001a r24) throws java.io.IOException {
        /*
            r23 = this;
            r1 = r23
            okhttp3.logging.HttpLoggingInterceptor$Level r0 = r1.f44224c
            r2 = r24
            dr.f r2 = (p739dr.C19006f) r2
            okhttp3.u r3 = r2.f42351f
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r0 != r4) goto L_0x0013
            okhttp3.z r0 = r2.mo70453a(r3)
            return r0
        L_0x0013:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            if (r0 != r4) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r4 != 0) goto L_0x0023
            okhttp3.logging.HttpLoggingInterceptor$Level r5 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r0 != r5) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            okhttp3.y r5 = r3.f44345e
            okhttp3.internal.connection.g r6 = r2.mo70454b()
            java.lang.String r7 = "--> "
            java.lang.StringBuilder r7 = android.support.p013v4.media.C0072d.m201h(r7)
            java.lang.String r8 = r3.f44343c
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            okhttp3.p r8 = r3.f44342b
            r7.append(r8)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x0056
            java.lang.String r9 = " "
            java.lang.StringBuilder r9 = android.support.p013v4.media.C0072d.m201h(r9)
            okhttp3.Protocol r6 = r6.f44180e
            kotlin.jvm.internal.C19383o.m32794d(r6)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x0057
        L_0x0056:
            r6 = r8
        L_0x0057:
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "-byte body)"
            java.lang.String r9 = " ("
            if (r0 != 0) goto L_0x0078
            if (r5 == 0) goto L_0x0078
            java.lang.StringBuilder r6 = android.support.p013v4.media.C0073e.m211k(r6, r9)
            long r10 = r5.mo72943a()
            r6.append(r10)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x0078:
            okhttp3.logging.HttpLoggingInterceptor$a r10 = r1.f44225d
            r10.log(r6)
            java.lang.String r6 = "-byte body omitted)"
            java.lang.String r10 = "UTF_8"
            java.lang.String r11 = "identity"
            java.lang.String r12 = "gzip"
            java.lang.String r13 = "Content-Encoding"
            if (r0 == 0) goto L_0x01c9
            okhttp3.o r14 = r3.f44344d
            if (r5 == 0) goto L_0x00e6
            okhttp3.r r15 = r5.mo72944b()
            r24 = r0
            if (r15 == 0) goto L_0x00b8
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r14.mo72948a(r0)
            if (r0 != 0) goto L_0x00b8
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f44225d
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r17 = r6
            java.lang.String r6 = "Content-Type: "
            r2.append(r6)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r0.log(r2)
            goto L_0x00bc
        L_0x00b8:
            r16 = r2
            r17 = r6
        L_0x00bc:
            long r18 = r5.mo72943a()
            r20 = -1
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r14.mo72948a(r0)
            if (r0 != 0) goto L_0x00ec
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f44225d
            java.lang.String r2 = "Content-Length: "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            r15 = r7
            long r6 = r5.mo72943a()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.log(r2)
            goto L_0x00ed
        L_0x00e6:
            r24 = r0
            r16 = r2
            r17 = r6
        L_0x00ec:
            r15 = r7
        L_0x00ed:
            java.lang.String[] r0 = r14.f44235b
            int r0 = r0.length
            int r0 = r0 / 2
            r2 = 0
        L_0x00f3:
            if (r2 >= r0) goto L_0x00fb
            r1.mo72942a(r14, r2)
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x00fb:
            java.lang.String r0 = "--> END "
            if (r4 == 0) goto L_0x01b3
            if (r5 != 0) goto L_0x0103
            goto L_0x01b3
        L_0x0103:
            okhttp3.o r2 = r3.f44344d
            java.lang.String r2 = r2.mo72948a(r13)
            if (r2 == 0) goto L_0x011a
            r6 = 1
            boolean r7 = kotlin.text.C19457k.m33019W0(r2, r11, r6)
            if (r7 != 0) goto L_0x011a
            boolean r2 = kotlin.text.C19457k.m33019W0(r2, r12, r6)
            if (r2 != 0) goto L_0x011a
            r2 = 1
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            if (r2 == 0) goto L_0x0136
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r5 = r3.f44343c
            r0.append(r5)
            java.lang.String r5 = " (encoded body omitted)"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.log(r0)
            r6 = r15
            goto L_0x018b
        L_0x0136:
            lr.f r2 = new lr.f
            r2.<init>()
            r5.mo72945c(r2)
            okhttp3.r r6 = r5.mo72944b()
            if (r6 == 0) goto L_0x014d
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r6 = r6.mo72983a(r7)
            if (r6 == 0) goto L_0x014d
            goto L_0x0152
        L_0x014d:
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            kotlin.jvm.internal.C19383o.m32796f(r6, r10)
        L_0x0152:
            okhttp3.logging.HttpLoggingInterceptor$a r7 = r1.f44225d
            r7.log(r8)
            boolean r7 = androidx.compose.p015ui.text.input.C1993m.m4356Q(r2)
            if (r7 == 0) goto L_0x018e
            okhttp3.logging.HttpLoggingInterceptor$a r7 = r1.f44225d
            r18 = r15
            long r14 = r2.f43876c
            java.lang.String r2 = r2.mo72770x(r14, r6)
            r7.log(r2)
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r6 = r3.f44343c
            r0.append(r6)
            r0.append(r9)
            long r5 = r5.mo72943a()
            r0.append(r5)
            r6 = r18
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.log(r0)
        L_0x018b:
            r5 = r17
            goto L_0x01cf
        L_0x018e:
            r6 = r15
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r7 = r3.f44343c
            r0.append(r7)
            java.lang.String r7 = " (binary "
            r0.append(r7)
            long r14 = r5.mo72943a()
            r0.append(r14)
            r5 = r17
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.log(r0)
            goto L_0x01cf
        L_0x01b3:
            r6 = r15
            r5 = r17
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r7 = r3.f44343c
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r2.log(r0)
            goto L_0x01cf
        L_0x01c9:
            r24 = r0
            r16 = r2
            r5 = r6
            r6 = r7
        L_0x01cf:
            long r14 = java.lang.System.nanoTime()
            r0 = r16
            okhttp3.z r0 = r0.mo70453a(r3)     // Catch:{ Exception -> 0x03a4 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r16 = java.lang.System.nanoTime()
            long r14 = r16 - r14
            long r2 = r2.toMillis(r14)
            okhttp3.a0 r7 = r0.f44368i
            kotlin.jvm.internal.C19383o.m32794d(r7)
            long r14 = r7.mo70456d()
            r16 = -1
            int r16 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r16 == 0) goto L_0x020a
            r18 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r14)
            r16 = r14
            java.lang.String r14 = "-byte"
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            goto L_0x0210
        L_0x020a:
            r18 = r6
            r16 = r14
            java.lang.String r6 = "unknown-length"
        L_0x0210:
            okhttp3.logging.HttpLoggingInterceptor$a r14 = r1.f44225d
            java.lang.String r15 = "<-- "
            java.lang.StringBuilder r15 = android.support.p013v4.media.C0072d.m201h(r15)
            r19 = r5
            int r5 = r0.f44365f
            r15.append(r5)
            java.lang.String r5 = r0.f44364e
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0229
            r5 = 1
            goto L_0x022a
        L_0x0229:
            r5 = 0
        L_0x022a:
            if (r5 == 0) goto L_0x0236
            r5 = 32
            r20 = r8
            r22 = r10
            r8 = r5
            r5 = r20
            goto L_0x0253
        L_0x0236:
            java.lang.String r5 = r0.f44364e
            r20 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r21 = 32
            r22 = r10
            java.lang.String r10 = java.lang.String.valueOf(r21)
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r8 = r21
        L_0x0253:
            r15.append(r5)
            r15.append(r8)
            okhttp3.u r5 = r0.f44362c
            okhttp3.p r5 = r5.f44342b
            r15.append(r5)
            r15.append(r9)
            r15.append(r2)
            java.lang.String r2 = "ms"
            r15.append(r2)
            if (r24 != 0) goto L_0x0276
            java.lang.String r2 = ", "
            java.lang.String r3 = " body"
            java.lang.String r2 = p010a9.C0048b.m163a(r2, r6, r3)
            goto L_0x0278
        L_0x0276:
            r2 = r20
        L_0x0278:
            r15.append(r2)
            r2 = 41
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.log(r2)
            if (r24 == 0) goto L_0x03a3
            okhttp3.o r2 = r0.f44367h
            java.lang.String[] r3 = r2.f44235b
            int r3 = r3.length
            int r3 = r3 / 2
            r5 = 0
        L_0x0291:
            if (r5 >= r3) goto L_0x0299
            r1.mo72942a(r2, r5)
            int r5 = r5 + 1
            goto L_0x0291
        L_0x0299:
            if (r4 == 0) goto L_0x039c
            boolean r3 = p739dr.C19005e.m32152a(r0)
            if (r3 != 0) goto L_0x02a3
            goto L_0x039c
        L_0x02a3:
            okhttp3.o r3 = r0.f44367h
            java.lang.String r3 = r3.mo72948a(r13)
            if (r3 == 0) goto L_0x02ba
            r4 = 1
            boolean r5 = kotlin.text.C19457k.m33019W0(r3, r11, r4)
            if (r5 != 0) goto L_0x02ba
            boolean r3 = kotlin.text.C19457k.m33019W0(r3, r12, r4)
            if (r3 != 0) goto L_0x02ba
            r3 = 1
            goto L_0x02bb
        L_0x02ba:
            r3 = 0
        L_0x02bb:
            if (r3 == 0) goto L_0x02c6
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            goto L_0x03a3
        L_0x02c6:
            lr.i r3 = r7.mo70458f()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3.request(r4)
            lr.f r3 = r3.mo72745l()
            java.lang.String r2 = r2.mo72948a(r13)
            r4 = 1
            boolean r2 = kotlin.text.C19457k.m33019W0(r12, r2, r4)
            r4 = 0
            if (r2 == 0) goto L_0x0307
            long r5 = r3.f43876c
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            lr.o r5 = new lr.o
            lr.f r3 = r3.clone()
            r5.<init>(r3)
            lr.f r3 = new lr.f     // Catch:{ all -> 0x02fe }
            r3.<init>()     // Catch:{ all -> 0x02fe }
            r3.mo72764w0(r5)     // Catch:{ all -> 0x02fe }
            kotlin.reflect.C19421p.m32917E(r5, r4)
            r4 = r2
            goto L_0x0307
        L_0x02fe:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0301 }
        L_0x0301:
            r0 = move-exception
            r3 = r0
            kotlin.reflect.C19421p.m32917E(r5, r2)
            throw r3
        L_0x0307:
            okhttp3.r r2 = r7.mo70457e()
            if (r2 == 0) goto L_0x0316
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.mo72983a(r5)
            if (r2 == 0) goto L_0x0316
            goto L_0x031d
        L_0x0316:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r5 = r22
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
        L_0x031d:
            boolean r5 = androidx.compose.p015ui.text.input.C1993m.m4356Q(r3)
            if (r5 != 0) goto L_0x0344
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            r5 = r20
            r2.log(r5)
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.String r4 = "<-- END HTTP (binary "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            long r5 = r3.f43876c
            r4.append(r5)
            r3 = r19
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            return r0
        L_0x0344:
            r5 = r20
            r6 = 0
            int r6 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0360
            okhttp3.logging.HttpLoggingInterceptor$a r6 = r1.f44225d
            r6.log(r5)
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f44225d
            lr.f r6 = r3.clone()
            long r7 = r6.f43876c
            java.lang.String r2 = r6.mo72770x(r7, r2)
            r5.log(r2)
        L_0x0360:
            java.lang.String r2 = "<-- END HTTP ("
            if (r4 == 0) goto L_0x0384
            okhttp3.logging.HttpLoggingInterceptor$a r5 = r1.f44225d
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            long r6 = r3.f43876c
            r2.append(r6)
            java.lang.String r3 = "-byte, "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "-gzipped-byte body)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.log(r2)
            goto L_0x03a3
        L_0x0384:
            okhttp3.logging.HttpLoggingInterceptor$a r4 = r1.f44225d
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            long r5 = r3.f43876c
            r2.append(r5)
            r3 = r18
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r4.log(r2)
            goto L_0x03a3
        L_0x039c:
            okhttp3.logging.HttpLoggingInterceptor$a r2 = r1.f44225d
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L_0x03a3:
            return r0
        L_0x03a4:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$a r0 = r1.f44225d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.log(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.q$a):okhttp3.z");
    }

    public /* synthetic */ HttpLoggingInterceptor(int i) {
        this((C19987a) C19987a.f44226a);
    }
}
