package com.bugsnag.android;

import java.io.File;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: com.bugsnag.android.p1 */
public final class C5820p1 implements C19846a<C5908s0> {

    /* renamed from: b */
    public C5908s0 f12447b;

    /* renamed from: c */
    public final File f12448c;

    /* renamed from: d */
    public final String f12449d;

    /* renamed from: e */
    public final C5816o1 f12450e;

    public C5820p1(File file, String str, C5816o1 o1Var) {
        C19383o.m32798h(str, "apiKey");
        C19383o.m32798h(o1Var, "logger");
        this.f12448c = file;
        this.f12449d = str;
        this.f12450e = o1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029c, code lost:
        if (r22 == false) goto L_0x029e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r33 = this;
            r1 = r33
            com.bugsnag.android.s0 r0 = r1.f12447b
            if (r0 != 0) goto L_0x09b7
            com.bugsnag.android.l r0 = new com.bugsnag.android.l
            com.bugsnag.android.o1 r2 = r1.f12450e
            r0.<init>(r2)
            com.bugsnag.android.repackaged.dslplatform.json.e<java.util.Map<java.lang.String, java.lang.Object>> r2 = com.bugsnag.android.internal.C5769e.f12343a
            java.io.File r2 = r1.f12448c
            java.lang.String r3 = "file"
            kotlin.jvm.internal.C19383o.m32798h(r2, r3)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x09b4, IOException -> 0x099b }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x09b4, IOException -> 0x099b }
            java.util.Map r4 = com.bugsnag.android.internal.C5769e.m11567a(r3)     // Catch:{ all -> 0x098d }
            r5 = 0
            kotlin.reflect.C19421p.m32917E(r3, r5)     // Catch:{ FileNotFoundException -> 0x09b4, IOException -> 0x099b }
            com.bugsnag.android.s0 r2 = new com.bugsnag.android.s0
            java.lang.String r7 = r1.f12449d
            java.lang.String r3 = "apiKey"
            kotlin.jvm.internal.C19383o.m32798h(r7, r3)
            com.bugsnag.android.u0 r3 = new com.bugsnag.android.u0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            kotlin.collections.EmptySet r13 = kotlin.collections.EmptySet.INSTANCE
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.bugsnag.android.r1 r11 = new com.bugsnag.android.r1
            r6 = 0
            r11.<init>((int) r6)
            com.bugsnag.android.b1 r12 = new com.bugsnag.android.b1
            r12.<init>()
            java.lang.String r6 = "handledException"
            com.bugsnag.android.g2 r14 = com.bugsnag.android.C5750g2.m11538a(r5, r6, r5)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            com.bugsnag.android.t2 r9 = new com.bugsnag.android.t2
            r9.<init>(r5, r5, r5)
            r17 = 0
            r6 = r3
            r5 = r9
            r9 = r13
            r16 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = "exceptions"
            java.lang.Object r5 = r4.get(r5)
            boolean r6 = r5 instanceof java.util.List
            if (r6 != 0) goto L_0x006a
            r5 = 0
        L_0x006a:
            java.util.List r5 = (java.util.List) r5
            java.lang.String r6 = "stacktrace"
            java.lang.String r7 = "cannot find json property 'type'"
            java.lang.String r8 = "type"
            java.lang.String r9 = "json property '"
            java.lang.String r10 = "' not "
            java.lang.String r11 = "of expected type, found "
            if (r5 == 0) goto L_0x0149
            java.util.List<com.bugsnag.android.p0> r12 = r3.f12658m
            java.util.Iterator r5 = r5.iterator()
        L_0x0080:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x0149
            java.lang.Object r13 = r5.next()
            java.util.Map r13 = (java.util.Map) r13
            com.bugsnag.android.p0 r14 = new com.bugsnag.android.p0
            java.lang.String r15 = "error"
            kotlin.jvm.internal.C19383o.m32798h(r13, r15)
            java.lang.String r15 = "errorClass"
            r16 = r5
            java.lang.Object r5 = r13.get(r15)
            r17 = r2
            boolean r2 = r5 instanceof java.lang.String
            if (r2 == 0) goto L_0x0131
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r2 = "message"
            java.lang.Object r2 = r13.get(r2)
            boolean r15 = r2 instanceof java.lang.String
            if (r15 != 0) goto L_0x00ae
            r2 = 0
        L_0x00ae:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r15 = r13.get(r8)
            boolean r1 = r15 instanceof java.lang.String
            if (r1 == 0) goto L_0x011b
            java.lang.String r15 = (java.lang.String) r15
            com.bugsnag.android.ErrorType$a r1 = com.bugsnag.android.ErrorType.Companion
            r1.getClass()
            com.bugsnag.android.ErrorType r1 = com.bugsnag.android.ErrorType.C5707a.m11494a(r15)
            if (r1 == 0) goto L_0x00ff
            java.lang.Object r13 = r13.get(r6)
            boolean r15 = r13 instanceof java.util.List
            if (r15 == 0) goto L_0x00e7
            java.util.List r13 = (java.util.List) r13
            com.bugsnag.android.j2 r13 = com.bugsnag.android.C5800l.m11577a(r13)
            com.bugsnag.android.q0 r15 = new com.bugsnag.android.q0
            r15.<init>(r5, r2, r13, r1)
            com.bugsnag.android.o1 r1 = r0.f12409b
            r14.<init>(r15, r1)
            r12.add(r14)
            r1 = r33
            r5 = r16
            r2 = r17
            goto L_0x0080
        L_0x00e7:
            if (r13 != 0) goto L_0x00f1
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'stacktrace'"
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r6, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r13, r1)
            r0.<init>(r1)
            throw r0
        L_0x00ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown ErrorType: '"
            r1.append(r2)
            r1.append(r15)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011b:
            if (r15 != 0) goto L_0x0123
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0123:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r8, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r15, r1)
            r0.<init>(r1)
            throw r0
        L_0x0131:
            if (r5 != 0) goto L_0x013b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'errorClass'"
            r0.<init>(r1)
            throw r0
        L_0x013b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r15, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x0149:
            r17 = r2
            java.lang.String r1 = "user"
            java.lang.Object r2 = r4.get(r1)
            boolean r5 = r2 instanceof java.util.Map
            if (r5 == 0) goto L_0x0973
            java.util.Map r2 = (java.util.Map) r2
            kotlin.jvm.internal.C19383o.m32798h(r2, r1)
            com.bugsnag.android.t2 r1 = new com.bugsnag.android.t2
            java.lang.String r5 = "id"
            java.lang.Object r12 = r2.get(r5)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x0167
            r12 = 0
        L_0x0167:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "email"
            java.lang.Object r13 = r2.get(r13)
            boolean r14 = r13 instanceof java.lang.String
            if (r14 != 0) goto L_0x0174
            r13 = 0
        L_0x0174:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "name"
            java.lang.Object r2 = r2.get(r14)
            boolean r15 = r2 instanceof java.lang.String
            if (r15 != 0) goto L_0x0181
            r2 = 0
        L_0x0181:
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r12, r13, r2)
            r3.f12662q = r1
            java.lang.String r1 = "metaData"
            java.lang.Object r2 = r4.get(r1)
            boolean r12 = r2 instanceof java.util.Map
            if (r12 == 0) goto L_0x0959
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x019c:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x01c4
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r12.getValue()
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r15 = "section"
            kotlin.jvm.internal.C19383o.m32798h(r13, r15)
            java.lang.String r15 = "value"
            kotlin.jvm.internal.C19383o.m32798h(r12, r15)
            com.bugsnag.android.r1 r15 = r3.f12648c
            r15.mo16616b(r13, r12)
            goto L_0x019c
        L_0x01c4:
            java.lang.String r2 = "featureFlags"
            java.lang.Object r12 = r4.get(r2)
            boolean r13 = r12 instanceof java.util.List
            if (r13 == 0) goto L_0x093f
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r2 = r12.iterator()
        L_0x01d4:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0225
            java.lang.Object r12 = r2.next()
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r13 = "featureFlag"
            java.lang.Object r15 = r12.get(r13)
            r16 = r2
            boolean r2 = r15 instanceof java.lang.String
            if (r2 == 0) goto L_0x020d
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r2 = "variant"
            java.lang.Object r2 = r12.get(r2)
            boolean r12 = r2 instanceof java.lang.String
            if (r12 != 0) goto L_0x01f9
            r2 = 0
        L_0x01f9:
            java.lang.String r2 = (java.lang.String) r2
            kotlin.jvm.internal.C19383o.m32798h(r15, r14)
            com.bugsnag.android.b1 r12 = r3.f12649d
            java.util.Map<java.lang.String, java.lang.String> r13 = r12.f12158c
            if (r2 == 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            java.lang.String r2 = r12.f12157b
        L_0x0207:
            r13.put(r15, r2)
            r2 = r16
            goto L_0x01d4
        L_0x020d:
            if (r15 != 0) goto L_0x0217
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'featureFlag'"
            r0.<init>(r1)
            throw r0
        L_0x0217:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r13, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r15, r1)
            r0.<init>(r1)
            throw r0
        L_0x0225:
            java.lang.String r2 = "breadcrumbs"
            java.lang.Object r12 = r4.get(r2)
            boolean r13 = r12 instanceof java.util.List
            if (r13 == 0) goto L_0x0925
            java.util.List r12 = (java.util.List) r12
            java.util.List<com.bugsnag.android.Breadcrumb> r2 = r3.f12657l
            java.util.Iterator r12 = r12.iterator()
        L_0x0237:
            boolean r13 = r12.hasNext()
            java.lang.String r15 = "cannot find json property 'name'"
            if (r13 == 0) goto L_0x032c
            java.lang.Object r13 = r12.next()
            java.util.Map r13 = (java.util.Map) r13
            r16 = r12
            com.bugsnag.android.Breadcrumb r12 = new com.bugsnag.android.Breadcrumb
            r18 = r6
            java.lang.String r6 = "breadcrumb"
            kotlin.jvm.internal.C19383o.m32798h(r13, r6)
            java.lang.Object r6 = r13.get(r14)
            r19 = r5
            boolean r5 = r6 instanceof java.lang.String
            if (r5 == 0) goto L_0x0316
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r13.get(r8)
            boolean r15 = r5 instanceof java.lang.String
            if (r15 == 0) goto L_0x0300
            java.lang.String r5 = (java.lang.String) r5
            com.bugsnag.android.BreadcrumbType$a r15 = com.bugsnag.android.BreadcrumbType.Companion
            r15.getClass()
            kotlin.jvm.internal.C19383o.m32798h(r5, r8)
            com.bugsnag.android.BreadcrumbType[] r15 = com.bugsnag.android.BreadcrumbType.values()
            r20 = r3
            int r3 = r15.length
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r4
            r4 = r21
        L_0x027f:
            if (r4 >= r3) goto L_0x029c
            r21 = r15[r4]
            r25 = r3
            java.lang.String r3 = r21.type
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r5)
            if (r3 == 0) goto L_0x0297
            if (r22 == 0) goto L_0x0292
            goto L_0x029e
        L_0x0292:
            r3 = 1
            r22 = r3
            r23 = r21
        L_0x0297:
            int r4 = r4 + 1
            r3 = r25
            goto L_0x027f
        L_0x029c:
            if (r22 != 0) goto L_0x02a0
        L_0x029e:
            r23 = 0
        L_0x02a0:
            if (r23 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            com.bugsnag.android.BreadcrumbType r23 = com.bugsnag.android.BreadcrumbType.MANUAL
        L_0x02a5:
            r3 = r23
            java.lang.Object r4 = r13.get(r1)
            boolean r5 = r4 instanceof java.util.Map
            if (r5 == 0) goto L_0x02b9
            boolean r5 = r4 instanceof p755lq.C19875a
            if (r5 == 0) goto L_0x02b7
            boolean r5 = r4 instanceof p755lq.C19878d
            if (r5 == 0) goto L_0x02b9
        L_0x02b7:
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            if (r5 != 0) goto L_0x02bd
            r4 = 0
        L_0x02bd:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "timestamp"
            java.lang.Object r13 = r13.get(r5)
            boolean r15 = r13 instanceof java.lang.String
            if (r15 == 0) goto L_0x02e8
            java.lang.String r13 = (java.lang.String) r13
            java.util.Date r5 = r0.mo16566b(r13)
            com.bugsnag.android.j r13 = new com.bugsnag.android.j
            r13.<init>(r6, r3, r4, r5)
            com.bugsnag.android.o1 r3 = r0.f12409b
            r12.<init>((com.bugsnag.android.C5772j) r13, (com.bugsnag.android.C5816o1) r3)
            r2.add(r12)
            r12 = r16
            r6 = r18
            r5 = r19
            r3 = r20
            r4 = r24
            goto L_0x0237
        L_0x02e8:
            if (r13 != 0) goto L_0x02f2
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'timestamp'"
            r0.<init>(r1)
            throw r0
        L_0x02f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r5, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r13, r1)
            r0.<init>(r1)
            throw r0
        L_0x0300:
            if (r5 != 0) goto L_0x0308
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0308:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r8, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x0316:
            if (r6 != 0) goto L_0x031e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r15)
            throw r0
        L_0x031e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r14, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r6, r1)
            r0.<init>(r1)
            throw r0
        L_0x032c:
            r20 = r3
            r24 = r4
            r19 = r5
            r18 = r6
            java.lang.String r1 = "context"
            r2 = r24
            java.lang.Object r1 = r2.get(r1)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 != 0) goto L_0x0341
            r1 = 0
        L_0x0341:
            java.lang.String r1 = (java.lang.String) r1
            r3 = r20
            r3.f12661p = r1
            java.lang.String r1 = "groupingHash"
            java.lang.Object r1 = r2.get(r1)
            boolean r4 = r1 instanceof java.lang.String
            if (r4 != 0) goto L_0x0352
            r1 = 0
        L_0x0352:
            java.lang.String r1 = (java.lang.String) r1
            r3.f12660o = r1
            java.lang.String r1 = "app"
            java.lang.Object r4 = r2.get(r1)
            boolean r5 = r4 instanceof java.util.Map
            if (r5 == 0) goto L_0x090b
            java.util.Map r4 = (java.util.Map) r4
            kotlin.jvm.internal.C19383o.m32798h(r4, r1)
            com.bugsnag.android.e r1 = new com.bugsnag.android.e
            java.lang.String r5 = "binaryArch"
            java.lang.Object r5 = r4.get(r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L_0x0372
            r5 = 0
        L_0x0372:
            r21 = r5
            java.lang.String r21 = (java.lang.String) r21
            r5 = r19
            java.lang.Object r6 = r4.get(r5)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x0381
            r6 = 0
        L_0x0381:
            r22 = r6
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r6 = "releaseStage"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x0390
            r6 = 0
        L_0x0390:
            r23 = r6
            java.lang.String r23 = (java.lang.String) r23
            java.lang.String r6 = "version"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x039f
            r6 = 0
        L_0x039f:
            r24 = r6
            java.lang.String r24 = (java.lang.String) r24
            java.lang.String r6 = "codeBundleId"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x03ae
            r6 = 0
        L_0x03ae:
            r25 = r6
            java.lang.String r25 = (java.lang.String) r25
            java.lang.String r6 = "buildUUID"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x03bd
            r6 = 0
        L_0x03bd:
            r26 = r6
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r6 = r4.get(r8)
            boolean r12 = r6 instanceof java.lang.String
            if (r12 != 0) goto L_0x03ca
            r6 = 0
        L_0x03ca:
            r27 = r6
            java.lang.String r27 = (java.lang.String) r27
            java.lang.String r6 = "versionCode"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.Number
            if (r12 != 0) goto L_0x03d9
            r6 = 0
        L_0x03d9:
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x03e6
            int r6 = r6.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x03e7
        L_0x03e6:
            r6 = 0
        L_0x03e7:
            r28 = r6
            java.lang.String r6 = "duration"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.Number
            if (r12 != 0) goto L_0x03f4
            r6 = 0
        L_0x03f4:
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x0401
            long r12 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            goto L_0x0402
        L_0x0401:
            r6 = 0
        L_0x0402:
            r29 = r6
            java.lang.String r6 = "durationInForeground"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.Number
            if (r12 != 0) goto L_0x040f
            r6 = 0
        L_0x040f:
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x041c
            long r12 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            goto L_0x041d
        L_0x041c:
            r6 = 0
        L_0x041d:
            r30 = r6
            java.lang.String r6 = "inForeground"
            java.lang.Object r6 = r4.get(r6)
            boolean r12 = r6 instanceof java.lang.Boolean
            if (r12 != 0) goto L_0x042a
            r6 = 0
        L_0x042a:
            r31 = r6
            java.lang.Boolean r31 = (java.lang.Boolean) r31
            java.lang.String r6 = "isLaunching"
            java.lang.Object r4 = r4.get(r6)
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 != 0) goto L_0x0439
            r4 = 0
        L_0x0439:
            r32 = r4
            java.lang.Boolean r32 = (java.lang.Boolean) r32
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.f12655j = r1
            java.lang.String r1 = "device"
            java.lang.Object r4 = r2.get(r1)
            boolean r6 = r4 instanceof java.util.Map
            if (r6 == 0) goto L_0x08f1
            java.util.Map r4 = (java.util.Map) r4
            kotlin.jvm.internal.C19383o.m32798h(r4, r1)
            com.bugsnag.android.n0 r1 = new com.bugsnag.android.n0
            com.bugsnag.android.i0 r6 = new com.bugsnag.android.i0
            java.lang.String r12 = "manufacturer"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x0462
            r12 = 0
        L_0x0462:
            r20 = r12
            java.lang.String r20 = (java.lang.String) r20
            java.lang.String r12 = "model"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x0471
            r12 = 0
        L_0x0471:
            r21 = r12
            java.lang.String r21 = (java.lang.String) r21
            java.lang.String r12 = "osVersion"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x0480
            r12 = 0
        L_0x0480:
            r22 = r12
            java.lang.String r22 = (java.lang.String) r22
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            java.lang.String r12 = "cpuAbi"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.util.List
            if (r13 != 0) goto L_0x0499
            r12 = 0
        L_0x0499:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x04b1
            r13 = 0
            java.lang.String[] r13 = new java.lang.String[r13]
            java.lang.Object[] r12 = r12.toArray(r13)
            if (r12 == 0) goto L_0x04a9
            java.lang.String[] r12 = (java.lang.String[]) r12
            goto L_0x04b2
        L_0x04a9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x04b1:
            r12 = 0
        L_0x04b2:
            r28 = r12
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r12 = "jailbroken"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.Boolean
            if (r13 != 0) goto L_0x04c4
            r12 = 0
        L_0x04c4:
            r21 = r12
            java.lang.Boolean r21 = (java.lang.Boolean) r21
            java.lang.Object r12 = r4.get(r5)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x04d1
            r12 = 0
        L_0x04d1:
            r22 = r12
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r12 = "locale"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x04e0
            r12 = 0
        L_0x04e0:
            r23 = r12
            java.lang.String r23 = (java.lang.String) r23
            java.lang.String r12 = "totalMemory"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.Number
            if (r13 != 0) goto L_0x04ef
            r12 = 0
        L_0x04ef:
            java.lang.Number r12 = (java.lang.Number) r12
            if (r12 == 0) goto L_0x04fc
            long r12 = r12.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x04fd
        L_0x04fc:
            r12 = 0
        L_0x04fd:
            r24 = r12
            java.lang.String r12 = "runtimeVersions"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.util.Map
            if (r13 != 0) goto L_0x050a
            r12 = 0
        L_0x050a:
            java.util.Map r12 = (java.util.Map) r12
            if (r12 == 0) goto L_0x0513
            java.util.LinkedHashMap r12 = kotlin.collections.C19294b0.m32558A0(r12)
            goto L_0x0518
        L_0x0513:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
        L_0x0518:
            r25 = r12
            java.lang.String r12 = "freeDisk"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.Number
            if (r13 != 0) goto L_0x0525
            r12 = 0
        L_0x0525:
            java.lang.Number r12 = (java.lang.Number) r12
            if (r12 == 0) goto L_0x0532
            long r12 = r12.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x0533
        L_0x0532:
            r12 = 0
        L_0x0533:
            r26 = r12
            java.lang.String r12 = "freeMemory"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.Number
            if (r13 != 0) goto L_0x0540
            r12 = 0
        L_0x0540:
            java.lang.Number r12 = (java.lang.Number) r12
            if (r12 == 0) goto L_0x054d
            long r12 = r12.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            goto L_0x054e
        L_0x054d:
            r12 = 0
        L_0x054e:
            r27 = r12
            java.lang.String r12 = "orientation"
            java.lang.Object r12 = r4.get(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 != 0) goto L_0x055b
            r12 = 0
        L_0x055b:
            r28 = r12
            java.lang.String r28 = (java.lang.String) r28
            java.lang.String r12 = "time"
            java.lang.Object r4 = r4.get(r12)
            boolean r12 = r4 instanceof java.lang.String
            if (r12 != 0) goto L_0x056a
            r4 = 0
        L_0x056a:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0573
            java.util.Date r4 = r0.mo16566b(r4)
            goto L_0x0574
        L_0x0573:
            r4 = 0
        L_0x0574:
            r29 = r4
            r19 = r1
            r20 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.f12656k = r1
            java.lang.String r1 = "session"
            java.lang.Object r1 = r2.get(r1)
            boolean r4 = r1 instanceof java.util.Map
            if (r4 != 0) goto L_0x058a
            r1 = 0
        L_0x058a:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r4 = "unhandled"
            if (r1 == 0) goto L_0x05e4
            com.bugsnag.android.c2 r6 = new com.bugsnag.android.c2
            com.bugsnag.android.o1 r12 = r0.f12409b
            r13 = 0
            r6.<init>(r13, r13, r12)
            java.lang.Object r12 = r1.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x05a3
            r6.f12184d = r12
            goto L_0x05aa
        L_0x05a3:
            com.bugsnag.android.o1 r12 = r6.f12187g
            java.lang.String r13 = "Invalid null value supplied to session.id, ignoring"
            r12.mo16605e(r13)
        L_0x05aa:
            java.lang.String r12 = "startedAt"
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.util.Date r12 = com.bugsnag.android.internal.C5760a.m11556a(r12)
            r6.f12185e = r12
            java.lang.String r12 = "events"
            java.lang.Object r1 = r1.get(r12)
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r12 = "handled"
            java.lang.Object r12 = r1.get(r12)
            java.lang.Number r12 = (java.lang.Number) r12
            java.util.concurrent.atomic.AtomicInteger r13 = r6.f12192l
            int r12 = r12.intValue()
            r13.set(r12)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Number r1 = (java.lang.Number) r1
            java.util.concurrent.atomic.AtomicInteger r12 = r6.f12191k
            int r1 = r1.intValue()
            r12.set(r1)
            r3.f12653h = r6
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x05e4:
            java.lang.String r1 = "threads"
            java.lang.Object r1 = r2.get(r1)
            boolean r6 = r1 instanceof java.util.List
            if (r6 != 0) goto L_0x05ef
            r1 = 0
        L_0x05ef:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r6 = "desc"
            if (r1 == 0) goto L_0x070e
            java.util.List<com.bugsnag.android.Thread> r12 = r3.f12659n
            java.util.Iterator r1 = r1.iterator()
        L_0x05fb:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x070e
            java.lang.Object r13 = r1.next()
            java.util.Map r13 = (java.util.Map) r13
            r16 = r1
            com.bugsnag.android.Thread r1 = new com.bugsnag.android.Thread
            r19 = r4
            java.lang.String r4 = "thread"
            kotlin.jvm.internal.C19383o.m32798h(r13, r4)
            java.lang.Object r4 = r13.get(r5)
            r20 = r5
            boolean r5 = r4 instanceof java.lang.Number
            if (r5 != 0) goto L_0x061d
            r4 = 0
        L_0x061d:
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L_0x0626
            long r4 = r4.longValue()
            goto L_0x0628
        L_0x0626:
            r4 = 0
        L_0x0628:
            r22 = r4
            java.lang.Object r4 = r13.get(r14)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x06f8
            r24 = r4
            java.lang.String r24 = (java.lang.String) r24
            com.bugsnag.android.ThreadType$a r4 = com.bugsnag.android.ThreadType.Companion
            java.lang.Object r5 = r13.get(r8)
            r29 = r3
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L_0x06e2
            java.lang.String r5 = (java.lang.String) r5
            r4.getClass()
            kotlin.jvm.internal.C19383o.m32798h(r5, r6)
            com.bugsnag.android.ThreadType[] r3 = com.bugsnag.android.ThreadType.values()
            int r4 = r3.length
            r21 = 0
            r30 = r6
            r6 = r21
        L_0x0655:
            if (r6 >= r4) goto L_0x066b
            r21 = r3[r6]
            r25 = r3
            java.lang.String r3 = r21.getDesc$bugsnag_android_core_release()
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r5)
            if (r3 == 0) goto L_0x0666
            goto L_0x066d
        L_0x0666:
            int r6 = r6 + 1
            r3 = r25
            goto L_0x0655
        L_0x066b:
            r21 = 0
        L_0x066d:
            if (r21 == 0) goto L_0x0672
            r25 = r21
            goto L_0x0676
        L_0x0672:
            com.bugsnag.android.ThreadType r3 = com.bugsnag.android.ThreadType.ANDROID
            r25 = r3
        L_0x0676:
            java.lang.String r3 = "errorReportingThread"
            java.lang.Object r3 = r13.get(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r26 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            java.lang.String r3 = "state"
            java.lang.Object r4 = r13.get(r3)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x06ca
            r27 = r4
            java.lang.String r27 = (java.lang.String) r27
            r5 = r18
            java.lang.Object r3 = r13.get(r5)
            boolean r4 = r3 instanceof java.util.List
            if (r4 != 0) goto L_0x069b
            r3 = 0
        L_0x069b:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x06a4
            com.bugsnag.android.j2 r3 = com.bugsnag.android.C5800l.m11577a(r3)
            goto L_0x06ab
        L_0x06a4:
            com.bugsnag.android.j2 r3 = new com.bugsnag.android.j2
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
            r3.<init>(r4)
        L_0x06ab:
            r28 = r3
            com.bugsnag.android.o2 r3 = new com.bugsnag.android.o2
            r21 = r3
            r21.<init>(r22, r24, r25, r26, r27, r28)
            com.bugsnag.android.o1 r4 = r0.f12409b
            r1.<init>(r3, r4)
            r12.add(r1)
            r18 = r5
            r1 = r16
            r4 = r19
            r5 = r20
            r3 = r29
            r6 = r30
            goto L_0x05fb
        L_0x06ca:
            if (r4 != 0) goto L_0x06d4
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'state'"
            r0.<init>(r1)
            throw r0
        L_0x06d4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r3, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x06e2:
            if (r5 != 0) goto L_0x06ea
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x06ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r8, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r5, r1)
            r0.<init>(r1)
            throw r0
        L_0x06f8:
            if (r4 != 0) goto L_0x0700
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r15)
            throw r0
        L_0x0700:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r14, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x070e:
            r29 = r3
            r19 = r4
            r30 = r6
            java.lang.String r0 = "projectPackages"
            java.lang.Object r0 = r2.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 != 0) goto L_0x071f
            r0 = 0
        L_0x071f:
            java.util.List r0 = (java.util.List) r0
            r1 = r29
            if (r0 == 0) goto L_0x0729
            r1.f12651f = r0
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0729:
            java.lang.String r0 = "severity"
            java.lang.Object r3 = r2.get(r0)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x08d7
            java.lang.String r3 = (java.lang.String) r3
            com.bugsnag.android.Severity$a r0 = com.bugsnag.android.Severity.Companion
            r0.getClass()
            r0 = r30
            kotlin.jvm.internal.C19383o.m32798h(r3, r0)
            com.bugsnag.android.Severity[] r0 = com.bugsnag.android.Severity.values()
            int r4 = r0.length
            r5 = 0
        L_0x0745:
            if (r5 >= r4) goto L_0x0757
            r6 = r0[r5]
            java.lang.String r12 = r6.str
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r3)
            if (r12 == 0) goto L_0x0754
            goto L_0x0758
        L_0x0754:
            int r5 = r5 + 1
            goto L_0x0745
        L_0x0757:
            r6 = 0
        L_0x0758:
            r22 = r6
            r0 = r19
            java.lang.Object r3 = r2.get(r0)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x08bd
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r23 = r3.booleanValue()
            java.lang.String r0 = "severityReason"
            java.lang.Object r2 = r2.get(r0)
            boolean r3 = r2 instanceof java.util.Map
            if (r3 == 0) goto L_0x08a3
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = "unhandledOverridden"
            java.lang.Object r3 = r2.get(r0)
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x0889
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            java.lang.Object r3 = r2.get(r8)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x0871
            r21 = r3
            java.lang.String r21 = (java.lang.String) r21
            if (r0 == 0) goto L_0x079c
            if (r23 != 0) goto L_0x0798
            r0 = 1
            goto L_0x0799
        L_0x0798:
            r0 = 0
        L_0x0799:
            r24 = r0
            goto L_0x079e
        L_0x079c:
            r24 = r23
        L_0x079e:
            java.lang.String r0 = "attributes"
            java.lang.Object r2 = r2.get(r0)
            if (r2 == 0) goto L_0x07a9
            boolean r3 = r2 instanceof java.util.Map
            goto L_0x07aa
        L_0x07a9:
            r3 = 1
        L_0x07aa:
            if (r3 == 0) goto L_0x0857
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x07e4
            java.util.Set r0 = r2.entrySet()
            if (r0 == 0) goto L_0x07e4
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L_0x07c9
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x07de
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            goto L_0x07e1
        L_0x07c9:
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x07d4
            goto L_0x07de
        L_0x07d4:
            java.lang.Object r2 = r0.next()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x07e0
        L_0x07de:
            r0 = 0
            goto L_0x07e1
        L_0x07e0:
            r0 = r2
        L_0x07e1:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x07e5
        L_0x07e4:
            r0 = 0
        L_0x07e5:
            com.bugsnag.android.g2 r2 = new com.bugsnag.android.g2
            if (r0 == 0) goto L_0x07f0
            java.lang.Object r3 = r0.getValue()
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x07f1
        L_0x07f0:
            r3 = 0
        L_0x07f1:
            r25 = r3
            if (r0 == 0) goto L_0x07fc
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x07fd
        L_0x07fc:
            r0 = 0
        L_0x07fd:
            r26 = r0
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1.f12647b = r2
            java.util.LinkedHashSet r0 = r1.mo16689a()
            int r0 = r0.size()
            r2 = 1
            if (r0 != r2) goto L_0x0849
            java.util.List<com.bugsnag.android.p0> r0 = r1.f12658m
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x081c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0835
            java.lang.Object r3 = r0.next()
            com.bugsnag.android.p0 r3 = (com.bugsnag.android.C5819p0) r3
            com.bugsnag.android.q0 r3 = r3.f12445b
            java.util.List<com.bugsnag.android.i2> r3 = r3.f12455b
            java.lang.String r4 = "it.stacktrace"
            kotlin.jvm.internal.C19383o.m32793c(r3, r4)
            kotlin.collections.C19324q.m32628J0(r3, r2)
            goto L_0x081c
        L_0x0835:
            java.util.Iterator r0 = r2.iterator()
        L_0x0839:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0849
            java.lang.Object r2 = r0.next()
            com.bugsnag.android.i2 r2 = (com.bugsnag.android.C5759i2) r2
            r3 = 0
            r2.f12307l = r3
            goto L_0x0839
        L_0x0849:
            r5 = r33
            com.bugsnag.android.o1 r0 = r5.f12450e
            r2 = r17
            r2.<init>(r1, r0)
            r5.f12447b = r2
            r0 = r2
            goto L_0x09b8
        L_0x0857:
            r5 = r33
            if (r2 != 0) goto L_0x0863
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'attributes'"
            r0.<init>(r1)
            throw r0
        L_0x0863:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = p504ai.C13983i.m21495n(r9, r0, r10, r11)
            java.lang.String r0 = p003a2.C0023f.m108i(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0871:
            r5 = r33
            if (r3 != 0) goto L_0x087b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x087b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r8, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r3, r1)
            r0.<init>(r1)
            throw r0
        L_0x0889:
            r5 = r33
            if (r3 != 0) goto L_0x0895
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'unhandledOverridden'"
            r0.<init>(r1)
            throw r0
        L_0x0895:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = p504ai.C13983i.m21495n(r9, r0, r10, r11)
            java.lang.String r0 = p003a2.C0023f.m108i(r3, r0)
            r1.<init>(r0)
            throw r1
        L_0x08a3:
            r5 = r33
            if (r2 != 0) goto L_0x08af
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'severityReason'"
            r0.<init>(r1)
            throw r0
        L_0x08af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = p504ai.C13983i.m21495n(r9, r0, r10, r11)
            java.lang.String r0 = p003a2.C0023f.m108i(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x08bd:
            r5 = r33
            if (r3 != 0) goto L_0x08c9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'unhandled'"
            r0.<init>(r1)
            throw r0
        L_0x08c9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = p504ai.C13983i.m21495n(r9, r0, r10, r11)
            java.lang.String r0 = p003a2.C0023f.m108i(r3, r0)
            r1.<init>(r0)
            throw r1
        L_0x08d7:
            r5 = r33
            if (r3 != 0) goto L_0x08e3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'severity'"
            r0.<init>(r1)
            throw r0
        L_0x08e3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = p504ai.C13983i.m21495n(r9, r0, r10, r11)
            java.lang.String r0 = p003a2.C0023f.m108i(r3, r0)
            r1.<init>(r0)
            throw r1
        L_0x08f1:
            r5 = r33
            if (r4 != 0) goto L_0x08fd
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'device'"
            r0.<init>(r1)
            throw r0
        L_0x08fd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r1, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x090b:
            r5 = r33
            if (r4 != 0) goto L_0x0917
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'app'"
            r0.<init>(r1)
            throw r0
        L_0x0917:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r1, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r4, r1)
            r0.<init>(r1)
            throw r0
        L_0x0925:
            r5 = r33
            if (r12 != 0) goto L_0x0931
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'breadcrumbs'"
            r0.<init>(r1)
            throw r0
        L_0x0931:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r2, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r12, r1)
            r0.<init>(r1)
            throw r0
        L_0x093f:
            r5 = r33
            if (r12 != 0) goto L_0x094b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'featureFlags'"
            r0.<init>(r1)
            throw r0
        L_0x094b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r2, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r12, r1)
            r0.<init>(r1)
            throw r0
        L_0x0959:
            r5 = r33
            if (r2 != 0) goto L_0x0965
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'metaData'"
            r0.<init>(r1)
            throw r0
        L_0x0965:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r1, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x0973:
            r5 = r33
            if (r2 != 0) goto L_0x097f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot find json property 'user'"
            r0.<init>(r1)
            throw r0
        L_0x097f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = p504ai.C13983i.m21495n(r9, r1, r10, r11)
            java.lang.String r1 = p003a2.C0023f.m108i(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x098d:
            r0 = move-exception
            r5 = r1
            r1 = r0
            throw r1     // Catch:{ all -> 0x0991 }
        L_0x0991:
            r0 = move-exception
            r4 = r0
            kotlin.reflect.C19421p.m32917E(r3, r1)     // Catch:{ FileNotFoundException -> 0x0999, IOException -> 0x0997 }
            throw r4     // Catch:{ FileNotFoundException -> 0x0999, IOException -> 0x0997 }
        L_0x0997:
            r0 = move-exception
            goto L_0x099d
        L_0x0999:
            r0 = move-exception
            goto L_0x09b6
        L_0x099b:
            r0 = move-exception
            r5 = r1
        L_0x099d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not deserialize from "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x09b4:
            r0 = move-exception
            r5 = r1
        L_0x09b6:
            throw r0
        L_0x09b7:
            r5 = r1
        L_0x09b8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C5820p1.invoke():java.lang.Object");
    }
}
