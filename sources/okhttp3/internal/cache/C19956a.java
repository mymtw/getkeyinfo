package okhttp3.internal.cache;

import kotlin.text.C19457k;
import okhttp3.C19933c;
import okhttp3.C20000q;
import okhttp3.C20018z;

/* renamed from: okhttp3.internal.cache.a */
public final class C19956a implements C20000q {

    /* renamed from: c */
    public static final C19957a f44107c = new C19957a();

    /* renamed from: b */
    public final C19933c f44108b;

    /* renamed from: okhttp3.internal.cache.a$a */
    public static final class C19957a {
        /* renamed from: a */
        public static final C20018z m34135a(C19957a aVar, C20018z zVar) {
            aVar.getClass();
            if ((zVar != null ? zVar.f44368i : null) == null) {
                return zVar;
            }
            zVar.getClass();
            C20018z.C20019a aVar2 = new C20018z.C20019a(zVar);
            aVar2.f44381g = null;
            return aVar2.mo73008a();
        }

        /* renamed from: b */
        public static boolean m34136b(String str) {
            return !C19457k.m33019W0("Connection", str, true) && !C19457k.m33019W0("Keep-Alive", str, true) && !C19457k.m33019W0("Proxy-Authenticate", str, true) && !C19457k.m33019W0("Proxy-Authorization", str, true) && !C19457k.m33019W0("TE", str, true) && !C19457k.m33019W0("Trailers", str, true) && !C19457k.m33019W0("Transfer-Encoding", str, true) && !C19457k.m33019W0("Upgrade", str, true);
        }
    }

    public C19956a(C19933c cVar) {
        this.f44108b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        if (r0 > 0) goto L_0x023d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03fd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C20018z intercept(okhttp3.C20000q.C20001a r31) throws java.io.IOException {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            dr.f r0 = (p739dr.C19006f) r0
            okhttp3.internal.connection.e r2 = r0.f42347b
            okhttp3.c r3 = r1.f44108b
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0103
            okhttp3.u r7 = r0.f42351f
            java.lang.String r8 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            okhttp3.c$b r8 = okhttp3.C19933c.f43969c
            okhttp3.p r9 = r7.f44342b
            r8.getClass()
            java.lang.String r8 = okhttp3.C19933c.C19936b.m34090a(r9)
            okhttp3.internal.cache.DiskLruCache r3 = r3.f43970b     // Catch:{ IOException -> 0x0103 }
            okhttp3.internal.cache.DiskLruCache$b r3 = r3.mo72884e(r8)     // Catch:{ IOException -> 0x0103 }
            if (r3 == 0) goto L_0x0103
            okhttp3.c$c r8 = new okhttp3.c$c     // Catch:{ IOException -> 0x0100 }
            java.util.List<lr.c0> r9 = r3.f44105d     // Catch:{ IOException -> 0x0100 }
            java.lang.Object r9 = r9.get(r4)     // Catch:{ IOException -> 0x0100 }
            lr.c0 r9 = (p756lr.C19888c0) r9     // Catch:{ IOException -> 0x0100 }
            r8.<init>((p756lr.C19888c0) r9)     // Catch:{ IOException -> 0x0100 }
            okhttp3.o r9 = r8.f43985g
            java.lang.String r10 = "Content-Type"
            java.lang.String r9 = r9.mo72948a(r10)
            okhttp3.o r10 = r8.f43985g
            java.lang.String r11 = "Content-Length"
            java.lang.String r10 = r10.mo72948a(r11)
            okhttp3.u$a r11 = new okhttp3.u$a
            r11.<init>()
            java.lang.String r12 = r8.f43979a
            r11.mo73003f(r12)
            java.lang.String r12 = r8.f43981c
            r11.mo73001d(r12, r6)
            okhttp3.o r12 = r8.f43980b
            java.lang.String r13 = "headers"
            kotlin.jvm.internal.C19383o.m32797g(r12, r13)
            okhttp3.o$a r12 = r12.mo72952g()
            r11.f44349c = r12
            okhttp3.u r11 = r11.mo72999b()
            okhttp3.z$a r12 = new okhttp3.z$a
            r12.<init>()
            r12.f44375a = r11
            okhttp3.Protocol r11 = r8.f43982d
            java.lang.String r13 = "protocol"
            kotlin.jvm.internal.C19383o.m32797g(r11, r13)
            r12.f44376b = r11
            int r11 = r8.f43983e
            r12.f44377c = r11
            java.lang.String r11 = r8.f43984f
            java.lang.String r13 = "message"
            kotlin.jvm.internal.C19383o.m32797g(r11, r13)
            r12.f44378d = r11
            okhttp3.o r11 = r8.f43985g
            r12.mo73009c(r11)
            okhttp3.c$a r11 = new okhttp3.c$a
            r11.<init>(r3, r9, r10)
            r12.f44381g = r11
            okhttp3.Handshake r3 = r8.f43986h
            r12.f44379e = r3
            long r9 = r8.f43987i
            r12.f44385k = r9
            long r9 = r8.f43988j
            r12.f44386l = r9
            okhttp3.z r3 = r12.mo73008a()
            java.lang.String r9 = r8.f43979a
            okhttp3.p r10 = r7.f44342b
            java.lang.String r10 = r10.f44248j
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r9 == 0) goto L_0x00f5
            java.lang.String r9 = r8.f43981c
            java.lang.String r10 = r7.f44343c
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            if (r9 == 0) goto L_0x00f5
            okhttp3.o r8 = r8.f43980b
            java.lang.String r9 = "cachedRequest"
            kotlin.jvm.internal.C19383o.m32797g(r8, r9)
            okhttp3.o r9 = r3.f44367h
            java.util.Set r9 = okhttp3.C19933c.C19936b.m34092c(r9)
            boolean r10 = r9 instanceof java.util.Collection
            if (r10 == 0) goto L_0x00cd
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x00cd
            goto L_0x00f0
        L_0x00cd:
            java.util.Iterator r9 = r9.iterator()
        L_0x00d1:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00f0
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r11 = r8.mo72956n(r10)
            okhttp3.o r12 = r7.f44344d
            java.util.List r10 = r12.mo72956n(r10)
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r11, r10)
            r10 = r10 ^ r5
            if (r10 == 0) goto L_0x00d1
            r7 = r4
            goto L_0x00f1
        L_0x00f0:
            r7 = r5
        L_0x00f1:
            if (r7 == 0) goto L_0x00f5
            r7 = r5
            goto L_0x00f6
        L_0x00f5:
            r7 = r4
        L_0x00f6:
            if (r7 != 0) goto L_0x0104
            okhttp3.a0 r3 = r3.f44368i
            if (r3 == 0) goto L_0x0103
            p735br.C18980c.m32099c(r3)
            goto L_0x0103
        L_0x0100:
            p735br.C18980c.m32099c(r3)
        L_0x0103:
            r3 = r6
        L_0x0104:
            long r7 = java.lang.System.currentTimeMillis()
            okhttp3.u r9 = r0.f42351f
            java.lang.String r10 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r9, r10)
            if (r3 == 0) goto L_0x018a
            long r13 = r3.f44372m
            long r11 = r3.f44373n
            okhttp3.o r15 = r3.f44367h
            java.lang.String[] r4 = r15.f44235b
            int r4 = r4.length
            int r4 = r4 / 2
            r16 = r6
            r19 = r16
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r6 = 0
            r24 = -1
        L_0x012b:
            if (r6 >= r4) goto L_0x0183
            java.lang.String r10 = r15.mo72949c(r6)
            r25 = r4
            java.lang.String r4 = r15.mo72955m(r6)
            r26 = r11
            java.lang.String r11 = "Date"
            boolean r11 = kotlin.text.C19457k.m33019W0(r10, r11, r5)
            if (r11 == 0) goto L_0x0148
            java.util.Date r16 = p739dr.C19002c.m32143a(r4)
            r23 = r4
            goto L_0x017c
        L_0x0148:
            java.lang.String r11 = "Expires"
            boolean r11 = kotlin.text.C19457k.m33019W0(r10, r11, r5)
            if (r11 == 0) goto L_0x0155
            java.util.Date r19 = p739dr.C19002c.m32143a(r4)
            goto L_0x017c
        L_0x0155:
            java.lang.String r11 = "Last-Modified"
            boolean r11 = kotlin.text.C19457k.m33019W0(r10, r11, r5)
            if (r11 == 0) goto L_0x0164
            java.util.Date r20 = p739dr.C19002c.m32143a(r4)
            r22 = r4
            goto L_0x017c
        L_0x0164:
            java.lang.String r11 = "ETag"
            boolean r11 = kotlin.text.C19457k.m33019W0(r10, r11, r5)
            if (r11 == 0) goto L_0x016f
            r21 = r4
            goto L_0x017c
        L_0x016f:
            java.lang.String r11 = "Age"
            boolean r10 = kotlin.text.C19457k.m33019W0(r10, r11, r5)
            if (r10 == 0) goto L_0x017c
            r10 = -1
            int r24 = p735br.C18980c.m32119w(r10, r4)
        L_0x017c:
            int r6 = r6 + 1
            r4 = r25
            r11 = r26
            goto L_0x012b
        L_0x0183:
            r26 = r11
            r4 = r16
            r6 = r24
            goto L_0x019a
        L_0x018a:
            r4 = 0
            r6 = -1
            r13 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
        L_0x019a:
            if (r3 != 0) goto L_0x01a3
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r10 = 0
            r4.<init>(r9, r10)
            goto L_0x01bf
        L_0x01a3:
            r10 = 0
            okhttp3.p r11 = r9.f44342b
            boolean r11 = r11.f44239a
            if (r11 == 0) goto L_0x01b4
            okhttp3.Handshake r11 = r3.f44366g
            if (r11 != 0) goto L_0x01b4
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r4.<init>(r9, r10)
            goto L_0x01bf
        L_0x01b4:
            boolean r11 = okhttp3.internal.cache.C19960d.C19961a.m34139a(r9, r3)
            if (r11 != 0) goto L_0x01c3
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r4.<init>(r9, r10)
        L_0x01bf:
            r28 = r0
            goto L_0x03a6
        L_0x01c3:
            okhttp3.d r10 = r9.f44341a
            if (r10 != 0) goto L_0x01d4
            okhttp3.d$b r10 = okhttp3.C19941d.f43999o
            okhttp3.o r11 = r9.f44344d
            r10.getClass()
            okhttp3.d r10 = okhttp3.C19941d.C19943b.m34097a(r11)
            r9.f44341a = r10
        L_0x01d4:
            boolean r11 = r10.f44000a
            if (r11 != 0) goto L_0x039e
            java.lang.String r11 = "If-Modified-Since"
            okhttp3.o r12 = r9.f44344d
            java.lang.String r12 = r12.mo72948a(r11)
            java.lang.String r15 = "If-None-Match"
            if (r12 != 0) goto L_0x01ef
            okhttp3.o r12 = r9.f44344d
            java.lang.String r12 = r12.mo72948a(r15)
            if (r12 == 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r12 = 0
            goto L_0x01f0
        L_0x01ef:
            r12 = r5
        L_0x01f0:
            if (r12 == 0) goto L_0x01f4
            goto L_0x039e
        L_0x01f4:
            okhttp3.d r12 = r3.mo73004a()
            if (r4 == 0) goto L_0x020e
            long r28 = r4.getTime()
            r25 = r6
            long r5 = r26 - r28
            r28 = r0
            r0 = 0
            long r5 = java.lang.Math.max(r0, r5)
            r0 = r15
            r1 = r25
            goto L_0x0214
        L_0x020e:
            r28 = r0
            r0 = r15
            r1 = r6
            r5 = 0
        L_0x0214:
            r15 = -1
            if (r1 == r15) goto L_0x0225
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            r25 = r0
            long r0 = (long) r1
            long r0 = r15.toMillis(r0)
            long r5 = java.lang.Math.max(r5, r0)
            goto L_0x0227
        L_0x0225:
            r25 = r0
        L_0x0227:
            long r0 = r26 - r13
            long r7 = r7 - r26
            long r5 = r5 + r0
            long r5 = r5 + r7
            okhttp3.d r0 = r3.mo73004a()
            int r0 = r0.f44002c
            r1 = -1
            if (r0 == r1) goto L_0x0240
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r7 = (long) r0
            long r0 = r1.toMillis(r7)
        L_0x023d:
            r17 = r0
            goto L_0x0255
        L_0x0240:
            if (r19 == 0) goto L_0x025a
            if (r4 == 0) goto L_0x0248
            long r26 = r4.getTime()
        L_0x0248:
            long r0 = r19.getTime()
            long r0 = r0 - r26
            r7 = 0
            int r13 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x0292
            goto L_0x023d
        L_0x0255:
            r0 = r17
            r17 = 0
            goto L_0x0296
        L_0x025a:
            if (r20 == 0) goto L_0x0292
            okhttp3.u r0 = r3.f44362c
            okhttp3.p r0 = r0.f44342b
            java.util.List<java.lang.String> r1 = r0.f44246h
            if (r1 != 0) goto L_0x0266
            r0 = 0
            goto L_0x0279
        L_0x0266:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            okhttp3.p$b r7 = okhttp3.C19997p.f44238l
            java.util.List<java.lang.String> r0 = r0.f44246h
            r7.getClass()
            okhttp3.C19997p.C19999b.m34238g(r0, r1)
            java.lang.String r0 = r1.toString()
        L_0x0279:
            if (r0 != 0) goto L_0x0292
            if (r4 == 0) goto L_0x0281
            long r13 = r4.getTime()
        L_0x0281:
            long r0 = r20.getTime()
            long r13 = r13 - r0
            r17 = 0
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0294
            r0 = 10
            long r0 = (long) r0
            long r0 = r13 / r0
            goto L_0x0296
        L_0x0292:
            r17 = 0
        L_0x0294:
            r0 = r17
        L_0x0296:
            int r7 = r10.f44002c
            r8 = -1
            if (r7 == r8) goto L_0x02a6
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r7
            long r13 = r13.toMillis(r14)
            long r0 = java.lang.Math.min(r0, r13)
        L_0x02a6:
            int r7 = r10.f44008i
            if (r7 == r8) goto L_0x02b2
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r14 = (long) r7
            long r13 = r13.toMillis(r14)
            goto L_0x02b4
        L_0x02b2:
            r13 = r17
        L_0x02b4:
            boolean r7 = r12.f44006g
            if (r7 != 0) goto L_0x02c7
            int r7 = r10.f44007h
            if (r7 == r8) goto L_0x02c7
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r15 = r11
            long r10 = (long) r7
            long r7 = r8.toMillis(r10)
            r17 = r7
            goto L_0x02c8
        L_0x02c7:
            r15 = r11
        L_0x02c8:
            boolean r7 = r12.f44000a
            if (r7 != 0) goto L_0x0312
            long r13 = r13 + r5
            long r17 = r17 + r0
            int r7 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r7 >= 0) goto L_0x0312
            okhttp3.z$a r4 = new okhttp3.z$a
            r4.<init>(r3)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02e5
            java.lang.String r0 = "110 HttpURLConnection \"Response is stale\""
            okhttp3.o$a r1 = r4.f44380f
            java.lang.String r7 = "Warning"
            r1.mo72958a(r7, r0)
        L_0x02e5:
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0305
            okhttp3.d r0 = r3.mo73004a()
            int r0 = r0.f44002c
            r1 = -1
            if (r0 != r1) goto L_0x02f9
            if (r19 != 0) goto L_0x02f9
            r0 = 1
            goto L_0x02fa
        L_0x02f9:
            r0 = 0
        L_0x02fa:
            if (r0 == 0) goto L_0x0305
            java.lang.String r0 = "113 HttpURLConnection \"Heuristic expiration\""
            okhttp3.o$a r1 = r4.f44380f
            java.lang.String r5 = "Warning"
            r1.mo72958a(r5, r0)
        L_0x0305:
            okhttp3.internal.cache.d r0 = new okhttp3.internal.cache.d
            okhttp3.z r1 = r4.mo73008a()
            r4 = 0
            r0.<init>(r4, r1)
            r4 = r0
            goto L_0x03a6
        L_0x0312:
            if (r21 == 0) goto L_0x0319
            r0 = r21
            r11 = r25
            goto L_0x0325
        L_0x0319:
            if (r20 == 0) goto L_0x031e
            r21 = r22
            goto L_0x0322
        L_0x031e:
            if (r4 == 0) goto L_0x0397
            r21 = r23
        L_0x0322:
            r11 = r15
            r0 = r21
        L_0x0325:
            okhttp3.o r1 = r9.f44344d
            okhttp3.o$a r1 = r1.mo72952g()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            r1.mo72960c(r11, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            okhttp3.p r11 = r9.f44342b
            java.lang.String r12 = r9.f44343c
            okhttp3.y r14 = r9.f44345e
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r9.f44346f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x034a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            goto L_0x0350
        L_0x034a:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = r9.f44346f
            java.util.LinkedHashMap r0 = kotlin.collections.C19294b0.m32558A0(r0)
        L_0x0350:
            okhttp3.o r4 = r9.f44344d
            r4.mo72952g()
            okhttp3.o r1 = r1.mo72961d()
            okhttp3.o$a r1 = r1.mo72952g()
            if (r11 == 0) goto L_0x038b
            okhttp3.o r13 = r1.mo72961d()
            byte[] r1 = p735br.C18980c.f42301a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0370
            java.util.Map r0 = kotlin.collections.C19294b0.m32559p0()
            goto L_0x037e
        L_0x0370:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            java.lang.String r1 = "Collections.unmodifiableMap(LinkedHashMap(this))"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
        L_0x037e:
            r15 = r0
            okhttp3.u r0 = new okhttp3.u
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r4.<init>(r0, r3)
            goto L_0x03a6
        L_0x038b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "url == null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0397:
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r0 = 0
            r4.<init>(r9, r0)
            goto L_0x03a6
        L_0x039e:
            r28 = r0
            r0 = 0
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r4.<init>(r9, r0)
        L_0x03a6:
            okhttp3.u r0 = r4.f44113a
            if (r0 == 0) goto L_0x03c6
            okhttp3.d r0 = r9.f44341a
            if (r0 != 0) goto L_0x03bb
            okhttp3.d$b r0 = okhttp3.C19941d.f43999o
            okhttp3.o r1 = r9.f44344d
            r0.getClass()
            okhttp3.d r0 = okhttp3.C19941d.C19943b.m34097a(r1)
            r9.f44341a = r0
        L_0x03bb:
            boolean r0 = r0.f44009j
            if (r0 == 0) goto L_0x03c6
            okhttp3.internal.cache.d r4 = new okhttp3.internal.cache.d
            r10 = 0
            r4.<init>(r10, r10)
            goto L_0x03c7
        L_0x03c6:
            r10 = 0
        L_0x03c7:
            okhttp3.u r0 = r4.f44113a
            okhttp3.z r1 = r4.f44114b
            r5 = r30
            okhttp3.c r6 = r5.f44108b
            if (r6 == 0) goto L_0x03de
            monitor-enter(r6)
            okhttp3.u r7 = r4.f44113a     // Catch:{ all -> 0x03db }
            if (r7 == 0) goto L_0x03d7
            goto L_0x03d9
        L_0x03d7:
            okhttp3.z r4 = r4.f44114b     // Catch:{ all -> 0x03db }
        L_0x03d9:
            monitor-exit(r6)
            goto L_0x03de
        L_0x03db:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x03de:
            boolean r4 = r2 instanceof okhttp3.internal.connection.C19971e
            if (r4 != 0) goto L_0x03e4
            r4 = r10
            goto L_0x03e5
        L_0x03e4:
            r4 = r2
        L_0x03e5:
            if (r4 == 0) goto L_0x03ec
            okhttp3.m r4 = r4.f44154c
            if (r4 == 0) goto L_0x03ec
            goto L_0x03ee
        L_0x03ec:
            okhttp3.m$a r4 = okhttp3.C19989m.f44227a
        L_0x03ee:
            if (r3 == 0) goto L_0x03f9
            if (r1 != 0) goto L_0x03f9
            okhttp3.a0 r6 = r3.f44368i
            if (r6 == 0) goto L_0x03f9
            p735br.C18980c.m32099c(r6)
        L_0x03f9:
            r6 = -1
            if (r0 != 0) goto L_0x0439
            if (r1 != 0) goto L_0x0439
            okhttp3.z$a r0 = new okhttp3.z$a
            r0.<init>()
            r1 = r28
            okhttp3.u r1 = r1.f42351f
            java.lang.String r3 = "request"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r0.f44375a = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            java.lang.String r3 = "protocol"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r0.f44376b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r0.f44377c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r0.f44378d = r1
            okhttp3.b0 r1 = p735br.C18980c.f42303c
            r0.f44381g = r1
            r0.f44385k = r6
            long r6 = java.lang.System.currentTimeMillis()
            r0.f44386l = r6
            okhttp3.z r0 = r0.mo73008a()
            r4.getClass()
            java.lang.String r1 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            return r0
        L_0x0439:
            if (r0 != 0) goto L_0x045d
            kotlin.jvm.internal.C19383o.m32794d(r1)
            okhttp3.z$a r0 = new okhttp3.z$a
            r0.<init>(r1)
            okhttp3.internal.cache.a$a r3 = f44107c
            okhttp3.z r1 = okhttp3.internal.cache.C19956a.C19957a.m34135a(r3, r1)
            java.lang.String r3 = "cacheResponse"
            okhttp3.C20018z.C20019a.m34287b(r3, r1)
            r0.f44383i = r1
            okhttp3.z r0 = r0.mo73008a()
            r4.getClass()
            java.lang.String r1 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            return r0
        L_0x045d:
            if (r1 == 0) goto L_0x0468
            r4.getClass()
            java.lang.String r8 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r8)
            goto L_0x0474
        L_0x0468:
            okhttp3.c r8 = r5.f44108b
            if (r8 == 0) goto L_0x0474
            r4.getClass()
            java.lang.String r8 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r8)
        L_0x0474:
            r8 = r31
            dr.f r8 = (p739dr.C19006f) r8     // Catch:{ all -> 0x06dd }
            okhttp3.z r3 = r8.mo70453a(r0)     // Catch:{ all -> 0x06dd }
            if (r1 == 0) goto L_0x05a8
            int r8 = r3.f44365f
            r9 = 304(0x130, float:4.26E-43)
            if (r8 != r9) goto L_0x059f
            okhttp3.z$a r0 = new okhttp3.z$a
            r0.<init>(r1)
            okhttp3.internal.cache.a$a r6 = f44107c
            okhttp3.o r7 = r1.f44367h
            okhttp3.o r8 = r3.f44367h
            r6.getClass()
            okhttp3.o$a r6 = new okhttp3.o$a
            r6.<init>()
            java.lang.String[] r9 = r7.f44235b
            int r9 = r9.length
            int r9 = r9 / 2
            r11 = 0
        L_0x049d:
            if (r11 >= r9) goto L_0x04ed
            java.lang.String r12 = r7.mo72949c(r11)
            java.lang.String r13 = r7.mo72955m(r11)
            java.lang.String r14 = "Warning"
            r15 = 1
            boolean r14 = kotlin.text.C19457k.m33019W0(r14, r12, r15)
            if (r14 == 0) goto L_0x04ba
            java.lang.String r14 = "1"
            r15 = 0
            boolean r14 = kotlin.text.C19457k.m33025c1(r13, r14, r15)
            if (r14 == 0) goto L_0x04bb
            goto L_0x04e9
        L_0x04ba:
            r15 = 0
        L_0x04bb:
            java.lang.String r14 = "Content-Length"
            r10 = 1
            boolean r14 = kotlin.text.C19457k.m33019W0(r14, r12, r10)
            if (r14 != 0) goto L_0x04d7
            java.lang.String r14 = "Content-Encoding"
            boolean r14 = kotlin.text.C19457k.m33019W0(r14, r12, r10)
            if (r14 != 0) goto L_0x04d7
            java.lang.String r14 = "Content-Type"
            boolean r14 = kotlin.text.C19457k.m33019W0(r14, r12, r10)
            if (r14 == 0) goto L_0x04d5
            goto L_0x04d7
        L_0x04d5:
            r10 = r15
            goto L_0x04d8
        L_0x04d7:
            r10 = 1
        L_0x04d8:
            if (r10 != 0) goto L_0x04e6
            boolean r10 = okhttp3.internal.cache.C19956a.C19957a.m34136b(r12)
            if (r10 == 0) goto L_0x04e6
            java.lang.String r10 = r8.mo72948a(r12)
            if (r10 != 0) goto L_0x04e9
        L_0x04e6:
            r6.mo72960c(r12, r13)
        L_0x04e9:
            int r11 = r11 + 1
            r10 = 0
            goto L_0x049d
        L_0x04ed:
            r15 = 0
            java.lang.String[] r7 = r8.f44235b
            int r7 = r7.length
            int r7 = r7 / 2
            r9 = r15
        L_0x04f4:
            if (r9 >= r7) goto L_0x0529
            java.lang.String r10 = r8.mo72949c(r9)
            java.lang.String r11 = "Content-Length"
            r12 = 1
            boolean r11 = kotlin.text.C19457k.m33019W0(r11, r10, r12)
            if (r11 != 0) goto L_0x0516
            java.lang.String r11 = "Content-Encoding"
            boolean r11 = kotlin.text.C19457k.m33019W0(r11, r10, r12)
            if (r11 != 0) goto L_0x0516
            java.lang.String r11 = "Content-Type"
            boolean r11 = kotlin.text.C19457k.m33019W0(r11, r10, r12)
            if (r11 == 0) goto L_0x0514
            goto L_0x0516
        L_0x0514:
            r11 = r15
            goto L_0x0517
        L_0x0516:
            r11 = 1
        L_0x0517:
            if (r11 != 0) goto L_0x0526
            boolean r11 = okhttp3.internal.cache.C19956a.C19957a.m34136b(r10)
            if (r11 == 0) goto L_0x0526
            java.lang.String r11 = r8.mo72955m(r9)
            r6.mo72960c(r10, r11)
        L_0x0526:
            int r9 = r9 + 1
            goto L_0x04f4
        L_0x0529:
            okhttp3.o r6 = r6.mo72961d()
            r0.mo73009c(r6)
            long r6 = r3.f44372m
            r0.f44385k = r6
            long r6 = r3.f44373n
            r0.f44386l = r6
            okhttp3.internal.cache.a$a r6 = f44107c
            okhttp3.z r7 = okhttp3.internal.cache.C19956a.C19957a.m34135a(r6, r1)
            java.lang.String r8 = "cacheResponse"
            okhttp3.C20018z.C20019a.m34287b(r8, r7)
            r0.f44383i = r7
            okhttp3.z r6 = okhttp3.internal.cache.C19956a.C19957a.m34135a(r6, r3)
            java.lang.String r7 = "networkResponse"
            okhttp3.C20018z.C20019a.m34287b(r7, r6)
            r0.f44382h = r6
            okhttp3.z r0 = r0.mo73008a()
            okhttp3.a0 r3 = r3.f44368i
            kotlin.jvm.internal.C19383o.m32794d(r3)
            r3.close()
            okhttp3.c r3 = r5.f44108b
            kotlin.jvm.internal.C19383o.m32794d(r3)
            monitor-enter(r3)
            monitor-exit(r3)
            okhttp3.c r3 = r5.f44108b
            r3.getClass()
            okhttp3.c$c r3 = new okhttp3.c$c
            r3.<init>((okhttp3.C20018z) r0)
            okhttp3.a0 r1 = r1.f44368i
            if (r1 == 0) goto L_0x0597
            okhttp3.c$a r1 = (okhttp3.C19933c.C19934a) r1
            okhttp3.internal.cache.DiskLruCache$b r1 = r1.f43972e
            okhttp3.internal.cache.DiskLruCache r6 = r1.f44106e     // Catch:{ IOException -> 0x0588 }
            java.lang.String r7 = r1.f44103b     // Catch:{ IOException -> 0x0588 }
            long r8 = r1.f44104c     // Catch:{ IOException -> 0x0588 }
            okhttp3.internal.cache.DiskLruCache$Editor r6 = r6.mo72883d(r8, r7)     // Catch:{ IOException -> 0x0588 }
            if (r6 == 0) goto L_0x058e
            r3.mo72850c(r6)     // Catch:{ IOException -> 0x0589 }
            r6.mo72895b()     // Catch:{ IOException -> 0x0589 }
            goto L_0x058e
        L_0x0588:
            r6 = 0
        L_0x0589:
            if (r6 == 0) goto L_0x058e
            r6.mo72894a()     // Catch:{ IOException -> 0x058e }
        L_0x058e:
            r4.getClass()
            java.lang.String r1 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            return r0
        L_0x0597:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            r0.<init>(r1)
            throw r0
        L_0x059f:
            r15 = 0
            okhttp3.a0 r8 = r1.f44368i
            if (r8 == 0) goto L_0x05a9
            p735br.C18980c.m32099c(r8)
            goto L_0x05a9
        L_0x05a8:
            r15 = 0
        L_0x05a9:
            okhttp3.z$a r8 = new okhttp3.z$a
            r8.<init>(r3)
            okhttp3.internal.cache.a$a r9 = f44107c
            okhttp3.z r10 = okhttp3.internal.cache.C19956a.C19957a.m34135a(r9, r1)
            java.lang.String r11 = "cacheResponse"
            okhttp3.C20018z.C20019a.m34287b(r11, r10)
            r8.f44383i = r10
            okhttp3.z r3 = okhttp3.internal.cache.C19956a.C19957a.m34135a(r9, r3)
            java.lang.String r9 = "networkResponse"
            okhttp3.C20018z.C20019a.m34287b(r9, r3)
            r8.f44382h = r3
            okhttp3.z r3 = r8.mo73008a()
            okhttp3.c r8 = r5.f44108b
            if (r8 == 0) goto L_0x06dc
            boolean r8 = p739dr.C19005e.m32152a(r3)
            if (r8 == 0) goto L_0x06a1
            boolean r8 = okhttp3.internal.cache.C19960d.C19961a.m34139a(r0, r3)
            if (r8 == 0) goto L_0x06a1
            okhttp3.c r0 = r5.f44108b
            r0.getClass()
            okhttp3.u r8 = r3.f44362c
            java.lang.String r8 = r8.f44343c
            java.lang.String r9 = "method"
            kotlin.jvm.internal.C19383o.m32797g(r8, r9)
            java.lang.String r9 = "POST"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r9 != 0) goto L_0x0610
            java.lang.String r9 = "PATCH"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r9 != 0) goto L_0x0610
            java.lang.String r9 = "PUT"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r9 != 0) goto L_0x0610
            java.lang.String r9 = "DELETE"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r9 != 0) goto L_0x0610
            java.lang.String r9 = "MOVE"
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            if (r9 == 0) goto L_0x0611
        L_0x0610:
            r15 = 1
        L_0x0611:
            if (r15 == 0) goto L_0x0619
            okhttp3.u r6 = r3.f44362c     // Catch:{ IOException -> 0x065e }
            r0.mo72847a(r6)     // Catch:{ IOException -> 0x065e }
            goto L_0x065e
        L_0x0619:
            java.lang.String r9 = "GET"
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0624
            goto L_0x065e
        L_0x0624:
            okhttp3.c$b r8 = okhttp3.C19933c.f43969c
            r8.getClass()
            okhttp3.o r8 = r3.f44367h
            java.util.Set r8 = okhttp3.C19933c.C19936b.m34092c(r8)
            java.lang.String r9 = "*"
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x0638
            goto L_0x065e
        L_0x0638:
            okhttp3.c$c r8 = new okhttp3.c$c
            r8.<init>((okhttp3.C20018z) r3)
            okhttp3.internal.cache.DiskLruCache r9 = r0.f43970b     // Catch:{ IOException -> 0x0658 }
            okhttp3.u r10 = r3.f44362c     // Catch:{ IOException -> 0x0658 }
            okhttp3.p r10 = r10.f44342b     // Catch:{ IOException -> 0x0658 }
            java.lang.String r10 = okhttp3.C19933c.C19936b.m34090a(r10)     // Catch:{ IOException -> 0x0658 }
            kotlin.text.Regex r11 = okhttp3.internal.cache.DiskLruCache.f44064w     // Catch:{ IOException -> 0x0658 }
            okhttp3.internal.cache.DiskLruCache$Editor r10 = r9.mo72883d(r6, r10)     // Catch:{ IOException -> 0x0658 }
            if (r10 == 0) goto L_0x065e
            r8.mo72850c(r10)     // Catch:{ IOException -> 0x0659 }
            okhttp3.c$d r6 = new okhttp3.c$d     // Catch:{ IOException -> 0x0659 }
            r6.<init>(r10)     // Catch:{ IOException -> 0x0659 }
            goto L_0x065f
        L_0x0658:
            r10 = 0
        L_0x0659:
            if (r10 == 0) goto L_0x065e
            r10.mo72894a()     // Catch:{ IOException -> 0x065e }
        L_0x065e:
            r6 = 0
        L_0x065f:
            if (r6 != 0) goto L_0x0662
            goto L_0x0696
        L_0x0662:
            okhttp3.c$d$a r0 = r6.f43990b
            okhttp3.a0 r7 = r3.f44368i
            kotlin.jvm.internal.C19383o.m32794d(r7)
            lr.i r7 = r7.mo70458f()
            lr.w r0 = p756lr.C19906r.m33997a(r0)
            okhttp3.internal.cache.b r8 = new okhttp3.internal.cache.b
            r8.<init>(r7, r6, r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = okhttp3.C20018z.m34284b(r3, r0)
            okhttp3.a0 r6 = r3.f44368i
            long r6 = r6.mo70456d()
            okhttp3.z$a r9 = new okhttp3.z$a
            r9.<init>(r3)
            dr.g r3 = new dr.g
            lr.x r8 = p756lr.C19906r.m33998b(r8)
            r3.<init>(r0, r6, r8)
            r9.f44381g = r3
            okhttp3.z r3 = r9.mo73008a()
        L_0x0696:
            if (r1 == 0) goto L_0x06a0
            r4.getClass()
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
        L_0x06a0:
            return r3
        L_0x06a1:
            r9 = 1
            java.lang.String r1 = r0.f44343c
            java.lang.String r2 = "method"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "POST"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r2 != 0) goto L_0x06d4
            java.lang.String r2 = "PATCH"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r2 != 0) goto L_0x06d4
            java.lang.String r2 = "PUT"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r2 != 0) goto L_0x06d4
            java.lang.String r2 = "DELETE"
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r2 != 0) goto L_0x06d4
            java.lang.String r2 = "MOVE"
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            if (r1 == 0) goto L_0x06d2
            goto L_0x06d4
        L_0x06d2:
            r4 = r15
            goto L_0x06d5
        L_0x06d4:
            r4 = r9
        L_0x06d5:
            if (r4 == 0) goto L_0x06dc
            okhttp3.c r1 = r5.f44108b     // Catch:{ IOException -> 0x06dc }
            r1.mo72847a(r0)     // Catch:{ IOException -> 0x06dc }
        L_0x06dc:
            return r3
        L_0x06dd:
            r0 = move-exception
            if (r3 == 0) goto L_0x06e7
            okhttp3.a0 r1 = r3.f44368i
            if (r1 == 0) goto L_0x06e7
            p735br.C18980c.m32099c(r1)
        L_0x06e7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C19956a.intercept(okhttp3.q$a):okhttp3.z");
    }
}
