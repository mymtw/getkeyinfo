package androidx.compose.foundation.text;

public final class BasicTextKt {
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0207 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1953a(androidx.compose.p015ui.text.C1913a r27, androidx.compose.p015ui.C1436d r28, androidx.compose.p015ui.text.C2023s r29, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r30, int r31, boolean r32, int r33, java.util.Map<java.lang.String, androidx.compose.foundation.text.C0947a> r34, androidx.compose.runtime.C1302d r35, int r36, int r37) {
        /*
            r9 = r27
            r10 = r36
            r11 = r37
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = -648605928(0xffffffffd9570f18, float:-3.78335723E15)
            r1 = r35
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x002a
            boolean r0 = r12.mo5408I(r9)
            if (r0 == 0) goto L_0x0027
            r0 = 4
            goto L_0x0028
        L_0x0027:
            r0 = 2
        L_0x0028:
            r0 = r0 | r10
            goto L_0x002b
        L_0x002a:
            r0 = r10
        L_0x002b:
            r1 = r11 & 2
            if (r1 == 0) goto L_0x0032
            r0 = r0 | 48
            goto L_0x0045
        L_0x0032:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0045
            r2 = r28
            boolean r3 = r12.mo5408I(r2)
            if (r3 == 0) goto L_0x0041
            r3 = 32
            goto L_0x0043
        L_0x0041:
            r3 = 16
        L_0x0043:
            r0 = r0 | r3
            goto L_0x0047
        L_0x0045:
            r2 = r28
        L_0x0047:
            r3 = r11 & 4
            if (r3 == 0) goto L_0x004e
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0061
            r4 = r29
            boolean r5 = r12.mo5408I(r4)
            if (r5 == 0) goto L_0x005d
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r0 = r0 | r5
            goto L_0x0063
        L_0x0061:
            r4 = r29
        L_0x0063:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x006a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007d
            r6 = r30
            boolean r7 = r12.mo5408I(r6)
            if (r7 == 0) goto L_0x0079
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r7
            goto L_0x007f
        L_0x007d:
            r6 = r30
        L_0x007f:
            r7 = r11 & 16
            if (r7 == 0) goto L_0x0086
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r10
            if (r8 != 0) goto L_0x009b
            r8 = r31
            boolean r13 = r12.mo5432d(r8)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r0 = r0 | r13
            goto L_0x009d
        L_0x009b:
            r8 = r31
        L_0x009d:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r14
            goto L_0x00b9
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b9
            r14 = r32
            boolean r15 = r12.mo5427a(r14)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r0 = r0 | r15
            goto L_0x00bb
        L_0x00b9:
            r14 = r32
        L_0x00bb:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r16
            r2 = r33
            goto L_0x00db
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r2 = r33
            if (r16 != 0) goto L_0x00db
            boolean r16 = r12.mo5432d(r2)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r0 = r0 | r16
        L_0x00db:
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e3
            r16 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 | r16
        L_0x00e3:
            r4 = 128(0x80, float:1.794E-43)
            if (r2 != r4) goto L_0x0109
            r4 = 23967451(0x16db6db, float:4.3661218E-38)
            r4 = r4 & r0
            r6 = 4793490(0x492492, float:6.71711E-39)
            if (r4 != r6) goto L_0x0109
            boolean r4 = r12.mo5442i()
            if (r4 != 0) goto L_0x00f7
            goto L_0x0109
        L_0x00f7:
            r12.mo5396C()
            r3 = r28
            r4 = r29
            r15 = r30
            r7 = r33
            r5 = r8
            r2 = r9
            r6 = r14
            r8 = r34
            goto L_0x03d9
        L_0x0109:
            r12.mo5466u0()
            r4 = r10 & 1
            if (r4 == 0) goto L_0x0130
            boolean r4 = r12.mo5425Y()
            if (r4 == 0) goto L_0x0117
            goto L_0x0130
        L_0x0117:
            r12.mo5396C()
            if (r2 == 0) goto L_0x0120
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r1
        L_0x0120:
            r13 = r28
            r15 = r30
            r18 = r33
            r7 = r0
            r16 = r8
            r17 = r14
            r14 = r29
            r8 = r34
            goto L_0x016f
        L_0x0130:
            if (r1 == 0) goto L_0x0135
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0137
        L_0x0135:
            r1 = r28
        L_0x0137:
            if (r3 == 0) goto L_0x013c
            androidx.compose.ui.text.s r3 = androidx.compose.p015ui.text.C2023s.f4598d
            goto L_0x013e
        L_0x013c:
            r3 = r29
        L_0x013e:
            if (r5 == 0) goto L_0x0143
            androidx.compose.foundation.text.BasicTextKt$BasicText$4 r4 = androidx.compose.foundation.text.BasicTextKt$BasicText$4.INSTANCE
            goto L_0x0145
        L_0x0143:
            r4 = r30
        L_0x0145:
            if (r7 == 0) goto L_0x0149
            r5 = 1
            goto L_0x014a
        L_0x0149:
            r5 = r8
        L_0x014a:
            if (r13 == 0) goto L_0x014e
            r6 = 1
            goto L_0x014f
        L_0x014e:
            r6 = r14
        L_0x014f:
            if (r15 == 0) goto L_0x0155
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0157
        L_0x0155:
            r7 = r33
        L_0x0157:
            if (r2 == 0) goto L_0x0162
            java.util.Map r2 = kotlin.collections.C19294b0.m32559p0()
            r8 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r8
            goto L_0x0164
        L_0x0162:
            r2 = r34
        L_0x0164:
            r13 = r1
            r8 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r7 = r0
        L_0x016f:
            r12.mo5419S()
            if (r18 <= 0) goto L_0x0176
            r0 = 1
            goto L_0x0177
        L_0x0176:
            r0 = 0
        L_0x0177:
            if (r0 == 0) goto L_0x03f6
            androidx.compose.runtime.t r0 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.f2081a
            java.lang.Object r0 = r12.mo5410J(r0)
            r6 = r0
            androidx.compose.foundation.text.selection.l r6 = (androidx.compose.foundation.text.selection.C1018l) r6
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r0 = r12.mo5410J(r0)
            r19 = r0
            m0.b r19 = (p174m0.C7282b) r19
            androidx.compose.runtime.l1 r0 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4022h
            java.lang.Object r0 = r12.mo5410J(r0)
            r20 = r0
            androidx.compose.ui.text.font.g$a r20 = (androidx.compose.p015ui.text.font.C1952g.C1953a) r20
            androidx.compose.runtime.t r0 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.f2103a
            java.lang.Object r0 = r12.mo5410J(r0)
            androidx.compose.foundation.text.selection.t r0 = (androidx.compose.foundation.text.selection.C1026t) r0
            long r4 = r0.f2155b
            kotlin.Pair<java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.j>>, java.util.List<androidx.compose.ui.text.a$b<kq.q<java.lang.String, androidx.compose.runtime.d, java.lang.Integer, kotlin.m>>>> r0 = androidx.compose.foundation.text.CoreTextKt.f1914a
            java.lang.String r0 = "inlineContent"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01ba
            kotlin.Pair<java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.j>>, java.util.List<androidx.compose.ui.text.a$b<kq.q<java.lang.String, androidx.compose.runtime.d, java.lang.Integer, kotlin.m>>>> r0 = androidx.compose.foundation.text.CoreTextKt.f1914a
            r1 = 0
            r22 = r1
            r28 = r4
            r31 = r7
            r21 = r8
            goto L_0x026d
        L_0x01ba:
            int r0 = r27.length()
            java.util.List<androidx.compose.ui.text.a$b<? extends java.lang.Object>> r1 = r9.f4299e
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            int r3 = r1.size()
            r21 = 0
            r28 = r4
            r4 = r21
        L_0x01d3:
            if (r4 >= r3) goto L_0x0210
            java.lang.Object r5 = r1.get(r4)
            r21 = r1
            r1 = r5
            androidx.compose.ui.text.a$b r1 = (androidx.compose.p015ui.text.C1913a.C1916b) r1
            r30 = r3
            T r3 = r1.f4308a
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x01ff
            java.lang.String r3 = r1.f4311d
            r31 = r7
            java.lang.String r7 = "androidx.compose.foundation.text.inlineContent"
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r7, r3)
            if (r3 == 0) goto L_0x0201
            int r3 = r1.f4309b
            int r1 = r1.f4310c
            r7 = 0
            boolean r1 = androidx.compose.p015ui.text.C1933b.m4232b(r7, r0, r3, r1)
            if (r1 == 0) goto L_0x0201
            r1 = 1
            goto L_0x0202
        L_0x01ff:
            r31 = r7
        L_0x0201:
            r1 = 0
        L_0x0202:
            if (r1 == 0) goto L_0x0207
            r2.add(r5)
        L_0x0207:
            int r4 = r4 + 1
            r3 = r30
            r7 = r31
            r1 = r21
            goto L_0x01d3
        L_0x0210:
            r31 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r2.size()
            r4 = 0
        L_0x0221:
            if (r4 >= r3) goto L_0x0262
            java.lang.Object r5 = r2.get(r4)
            androidx.compose.ui.text.a$b r5 = (androidx.compose.p015ui.text.C1913a.C1916b) r5
            T r7 = r5.f4308a
            java.lang.Object r7 = r8.get(r7)
            androidx.compose.foundation.text.a r7 = (androidx.compose.foundation.text.C0947a) r7
            if (r7 == 0) goto L_0x0253
            androidx.compose.ui.text.a$b r7 = new androidx.compose.ui.text.a$b
            r30 = r2
            int r2 = r5.f4309b
            r32 = r3
            int r3 = r5.f4310c
            r21 = r8
            r8 = 0
            r7.<init>(r8, r2, r3)
            r0.add(r7)
            androidx.compose.ui.text.a$b r2 = new androidx.compose.ui.text.a$b
            int r3 = r5.f4309b
            int r5 = r5.f4310c
            r2.<init>(r8, r3, r5)
            r1.add(r2)
            goto L_0x0259
        L_0x0253:
            r30 = r2
            r32 = r3
            r21 = r8
        L_0x0259:
            int r4 = r4 + 1
            r2 = r30
            r3 = r32
            r8 = r21
            goto L_0x0221
        L_0x0262:
            r21 = r8
            r2 = 0
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r0, r1)
            r22 = r2
            r0 = r3
        L_0x026d:
            java.lang.Object r1 = r0.component1()
            r23 = r1
            java.util.List r23 = (java.util.List) r23
            java.lang.Object r0 = r0.component2()
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r9
            r1 = 1
            r0[r1] = r6
            androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1 r1 = new androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            r1.<init>(r6)
            androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2 r2 = androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2.INSTANCE
            androidx.compose.runtime.saveable.h r1 = androidx.compose.runtime.saveable.SaverKt.m2861a(r1, r2)
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2 r2 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
            r2.<init>(r6)
            r3 = 4
            java.lang.Object r0 = androidx.compose.runtime.saveable.C1366b.m2863a(r0, r1, r2, r12, r3)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.mo5465u(r0)
            java.lang.Object r0 = r12.mo5431c0()
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x02e3
            androidx.compose.foundation.text.TextController r7 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r3 = new androidx.compose.foundation.text.TextState
            androidx.compose.foundation.text.k r2 = new androidx.compose.foundation.text.k
            r0 = r2
            r1 = r27
            r10 = r2
            r2 = r14
            r11 = r3
            r3 = r18
            r24 = r28
            r28 = r13
            r29 = r14
            r13 = r4
            r4 = r17
            r5 = r16
            r9 = r6
            r6 = r19
            r26 = r31
            r30 = r9
            r9 = r7
            r7 = r20
            r31 = r8
            r8 = r23
            r0.<init>((androidx.compose.p015ui.text.C1913a) r1, (androidx.compose.p015ui.text.C2023s) r2, (int) r3, (boolean) r4, (int) r5, (p174m0.C7282b) r6, (androidx.compose.p015ui.text.font.C1952g.C1953a) r7, (java.util.List) r8)
            r11.<init>(r10, r13)
            r9.<init>(r11)
            r12.mo5407H0(r9)
            r0 = r9
            goto L_0x02ef
        L_0x02e3:
            r24 = r28
            r26 = r31
            r30 = r6
            r31 = r8
            r28 = r13
            r29 = r14
        L_0x02ef:
            r1 = 0
            r12.mo5418R(r1)
            r9 = r0
            androidx.compose.foundation.text.TextController r9 = (androidx.compose.foundation.text.TextController) r9
            androidx.compose.foundation.text.TextState r10 = r9.f1923b
            boolean r0 = r12.f2702K
            if (r0 != 0) goto L_0x0315
            androidx.compose.foundation.text.k r0 = r10.f1961a
            r1 = r27
            r2 = r29
            r3 = r19
            r4 = r20
            r5 = r17
            r6 = r16
            r7 = r18
            r8 = r23
            androidx.compose.foundation.text.k r0 = androidx.compose.foundation.text.CoreTextKt.m1965b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo4508b(r0)
        L_0x0315:
            r10.getClass()
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r10.f1963c = r15
            r0 = r24
            r10.f1968h = r0
            r0 = r30
            r9.mo4509c(r0)
            boolean r0 = r31.isEmpty()
            if (r0 == 0) goto L_0x0333
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextKt.f1908a
            r2 = r27
            goto L_0x0345
        L_0x0333:
            r0 = 1892283635(0x70c9f4f3, float:5.000209E29)
            androidx.compose.foundation.text.BasicTextKt$BasicText$6 r1 = new androidx.compose.foundation.text.BasicTextKt$BasicText$6
            r2 = r27
            r4 = r31
            r3 = r26
            r1.<init>(r2, r4, r3)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r12, r0, r1)
        L_0x0345:
            androidx.compose.ui.d r1 = r9.f1927f
            androidx.compose.ui.d r3 = r9.f1928g
            androidx.compose.ui.d r1 = r1.mo6148i0(r3)
            androidx.compose.ui.d r3 = r9.f1929h
            androidx.compose.ui.d r1 = r1.mo6148i0(r3)
            r3 = r28
            androidx.compose.ui.d r1 = r3.mo6148i0(r1)
            androidx.compose.foundation.text.TextController$measurePolicy$1 r4 = r9.f1926e
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r5 = r12.mo5410J(r5)
            m0.b r5 = (p174m0.C7282b) r5
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r6 = r12.mo5410J(r6)
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p015ui.unit.LayoutDirection) r6
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r7 = r12.mo5410J(r7)
            androidx.compose.ui.platform.j1 r7 = (androidx.compose.p015ui.platform.C1843j1) r7
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r8.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r8 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r9 = r12.f2715a
            boolean r9 = r9 instanceof androidx.compose.runtime.C1299c
            if (r9 == 0) goto L_0x03f2
            r12.mo5392A()
            boolean r9 = r12.f2702K
            if (r9 == 0) goto L_0x0395
            r12.mo5450m(r8)
            goto L_0x0398
        L_0x0395:
            r12.mo5452n()
        L_0x0398:
            r8 = 0
            r12.f2738x = r8
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r8 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r12, r4, r8)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r12, r5, r4)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r12, r6, r4)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r4 = p504ai.C13983i.m21490i(r12, r7, r4, r12)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r1.invoke(r4, r12, r6)
            r1 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12.mo5465u(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.invoke(r12, r1)
            r12.mo5418R(r5)
            r0 = 1
            r12.mo5418R(r0)
            r12.mo5418R(r5)
            r4 = r29
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r21
        L_0x03d9:
            androidx.compose.runtime.v0 r11 = r12.mo5421U()
            if (r11 != 0) goto L_0x03e0
            goto L_0x03f1
        L_0x03e0:
            androidx.compose.foundation.text.BasicTextKt$BasicText$7 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText$7
            r0 = r12
            r1 = r27
            r2 = r3
            r3 = r4
            r4 = r15
            r9 = r36
            r10 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f3081d = r12
        L_0x03f1:
            return
        L_0x03f2:
            p001a0.C0005b.m45j0()
            throw r22
        L_0x03f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1953a(androidx.compose.ui.text.a, androidx.compose.ui.d, androidx.compose.ui.text.s, kq.l, int, boolean, int, java.util.Map, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e8, code lost:
        if (r5.f2019g == r12) goto L_0x0208;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f6  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1954b(java.lang.String r27, androidx.compose.p015ui.C1436d r28, androidx.compose.p015ui.text.C2023s r29, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r30, int r31, boolean r32, int r33, androidx.compose.runtime.C1302d r34, int r35, int r36) {
        /*
            r1 = r27
            r8 = r35
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = 1022429478(0x3cf10926, float:0.029423308)
            r2 = r34
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r36 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r8 | 6
            goto L_0x0029
        L_0x0019:
            r2 = r8 & 14
            if (r2 != 0) goto L_0x0028
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0025
            r2 = 4
            goto L_0x0026
        L_0x0025:
            r2 = 2
        L_0x0026:
            r2 = r2 | r8
            goto L_0x0029
        L_0x0028:
            r2 = r8
        L_0x0029:
            r5 = r36 & 2
            if (r5 == 0) goto L_0x0030
            r2 = r2 | 48
            goto L_0x0043
        L_0x0030:
            r6 = r8 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0043
            r6 = r28
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x003f
            r7 = 32
            goto L_0x0041
        L_0x003f:
            r7 = 16
        L_0x0041:
            r2 = r2 | r7
            goto L_0x0045
        L_0x0043:
            r6 = r28
        L_0x0045:
            r7 = r36 & 4
            if (r7 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r9 = r8 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x005f
            r9 = r29
            boolean r10 = r0.mo5408I(r9)
            if (r10 == 0) goto L_0x005b
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r10
            goto L_0x0061
        L_0x005f:
            r9 = r29
        L_0x0061:
            r10 = r36 & 8
            if (r10 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r11 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007b
            r11 = r30
            boolean r12 = r0.mo5408I(r11)
            if (r12 == 0) goto L_0x0077
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r12
            goto L_0x007d
        L_0x007b:
            r11 = r30
        L_0x007d:
            r12 = r36 & 16
            if (r12 == 0) goto L_0x0084
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0099
        L_0x0084:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x0099
            r13 = r31
            boolean r14 = r0.mo5432d(r13)
            if (r14 == 0) goto L_0x0095
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r2 = r2 | r14
            goto L_0x009b
        L_0x0099:
            r13 = r31
        L_0x009b:
            r14 = r36 & 32
            if (r14 == 0) goto L_0x00a3
            r15 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r15
            goto L_0x00b8
        L_0x00a3:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r8
            if (r15 != 0) goto L_0x00b8
            r15 = r32
            boolean r16 = r0.mo5427a(r15)
            if (r16 == 0) goto L_0x00b3
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r2 = r2 | r16
            goto L_0x00ba
        L_0x00b8:
            r15 = r32
        L_0x00ba:
            r16 = r36 & 64
            if (r16 == 0) goto L_0x00c5
            r17 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r17
            r3 = r33
            goto L_0x00da
        L_0x00c5:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r8 & r17
            r3 = r33
            if (r17 != 0) goto L_0x00da
            boolean r17 = r0.mo5432d(r3)
            if (r17 == 0) goto L_0x00d6
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r2 = r2 | r17
        L_0x00da:
            r17 = 2995931(0x2db6db, float:4.198194E-39)
            r2 = r2 & r17
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r4) goto L_0x00f6
            boolean r2 = r0.mo5442i()
            if (r2 != 0) goto L_0x00eb
            goto L_0x00f6
        L_0x00eb:
            r0.mo5396C()
        L_0x00ee:
            r7 = r3
            r2 = r6
            r3 = r9
            r4 = r11
            r5 = r13
            r6 = r15
            goto L_0x02bc
        L_0x00f6:
            if (r5 == 0) goto L_0x00fb
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r6 = r2
        L_0x00fb:
            if (r7 == 0) goto L_0x0100
            androidx.compose.ui.text.s r2 = androidx.compose.p015ui.text.C2023s.f4598d
            r9 = r2
        L_0x0100:
            if (r10 == 0) goto L_0x0105
            androidx.compose.foundation.text.BasicTextKt$BasicText$1 r2 = androidx.compose.foundation.text.BasicTextKt$BasicText$1.INSTANCE
            r11 = r2
        L_0x0105:
            r2 = 1
            if (r12 == 0) goto L_0x0109
            r13 = r2
        L_0x0109:
            if (r14 == 0) goto L_0x010c
            r15 = r2
        L_0x010c:
            if (r16 == 0) goto L_0x0111
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x0111:
            r4 = 0
            if (r3 <= 0) goto L_0x0116
            r5 = r2
            goto L_0x0117
        L_0x0116:
            r5 = r4
        L_0x0117:
            if (r5 == 0) goto L_0x02d7
            androidx.compose.runtime.t r5 = androidx.compose.foundation.text.selection.SelectionRegistrarKt.f2081a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.foundation.text.selection.l r5 = (androidx.compose.foundation.text.selection.C1018l) r5
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r10 = r0.mo5410J(r7)
            m0.b r10 = (p174m0.C7282b) r10
            androidx.compose.runtime.l1 r12 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4022h
            java.lang.Object r12 = r0.mo5410J(r12)
            androidx.compose.ui.text.font.g$a r12 = (androidx.compose.p015ui.text.font.C1952g.C1953a) r12
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r4] = r1
            r14[r2] = r5
            androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1 r2 = new androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            r2.<init>(r5)
            androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2 r4 = androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2.INSTANCE
            androidx.compose.runtime.saveable.h r2 = androidx.compose.runtime.saveable.SaverKt.m2861a(r2, r4)
            androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1 r4 = new androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
            r4.<init>(r5)
            r8 = 4
            java.lang.Object r2 = androidx.compose.runtime.saveable.C1366b.m2863a(r14, r2, r4, r0, r8)
            java.lang.Number r2 = (java.lang.Number) r2
            r30 = r7
            long r7 = r2.longValue()
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r2)
            java.lang.Object r2 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            r14 = 6
            if (r2 != r4) goto L_0x0193
            androidx.compose.foundation.text.TextController r2 = new androidx.compose.foundation.text.TextController
            androidx.compose.foundation.text.TextState r4 = new androidx.compose.foundation.text.TextState
            r16 = r6
            androidx.compose.ui.text.a r6 = new androidx.compose.ui.text.a
            r32 = r5
            r5 = 0
            r6.<init>(r1, r5, r14)
            androidx.compose.foundation.text.k r5 = new androidx.compose.foundation.text.k
            r26 = 128(0x80, float:1.794E-43)
            r18 = r5
            r19 = r6
            r20 = r9
            r21 = r3
            r22 = r15
            r23 = r13
            r24 = r10
            r25 = r12
            r18.<init>((androidx.compose.p015ui.text.C1913a) r19, (androidx.compose.p015ui.text.C2023s) r20, (int) r21, (boolean) r22, (int) r23, (p174m0.C7282b) r24, (androidx.compose.p015ui.text.font.C1952g.C1953a) r25, (int) r26)
            r4.<init>(r5, r7)
            r2.<init>(r4)
            r0.mo5407H0(r2)
            goto L_0x0197
        L_0x0193:
            r32 = r5
            r16 = r6
        L_0x0197:
            r4 = 0
            r0.mo5418R(r4)
            androidx.compose.foundation.text.TextController r2 = (androidx.compose.foundation.text.TextController) r2
            androidx.compose.foundation.text.TextState r4 = r2.f1923b
            boolean r5 = r0.f2702K
            if (r5 != 0) goto L_0x020b
            androidx.compose.foundation.text.k r5 = r4.f1961a
            kotlin.Pair<java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.j>>, java.util.List<androidx.compose.ui.text.a$b<kq.q<java.lang.String, androidx.compose.runtime.d, java.lang.Integer, kotlin.m>>>> r6 = androidx.compose.foundation.text.CoreTextKt.f1914a
            java.lang.String r6 = "current"
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)
            java.lang.String r6 = "style"
            kotlin.jvm.internal.C19383o.m32797g(r9, r6)
            java.lang.String r6 = "density"
            kotlin.jvm.internal.C19383o.m32797g(r10, r6)
            java.lang.String r6 = "fontFamilyResolver"
            kotlin.jvm.internal.C19383o.m32797g(r12, r6)
            androidx.compose.ui.text.a r6 = r5.f2013a
            java.lang.String r6 = r6.f4296b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r1)
            if (r6 == 0) goto L_0x01ea
            androidx.compose.ui.text.s r6 = r5.f2014b
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r9)
            if (r6 == 0) goto L_0x01ea
            boolean r6 = r5.f2016d
            if (r6 != r15) goto L_0x01ea
            int r6 = r5.f2017e
            if (r6 != r13) goto L_0x01d7
            r6 = 1
            goto L_0x01d8
        L_0x01d7:
            r6 = 0
        L_0x01d8:
            if (r6 == 0) goto L_0x01ea
            int r6 = r5.f2015c
            if (r6 != r3) goto L_0x01ea
            m0.b r6 = r5.f2018f
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r10)
            if (r6 == 0) goto L_0x01ea
            androidx.compose.ui.text.font.g$a r6 = r5.f2019g
            if (r6 == r12) goto L_0x0208
        L_0x01ea:
            androidx.compose.ui.text.a r5 = new androidx.compose.ui.text.a
            r6 = 0
            r5.<init>(r1, r6, r14)
            androidx.compose.foundation.text.k r6 = new androidx.compose.foundation.text.k
            r26 = 128(0x80, float:1.794E-43)
            r18 = r6
            r19 = r5
            r20 = r9
            r21 = r3
            r22 = r15
            r23 = r13
            r24 = r10
            r25 = r12
            r18.<init>((androidx.compose.p015ui.text.C1913a) r19, (androidx.compose.p015ui.text.C2023s) r20, (int) r21, (boolean) r22, (int) r23, (p174m0.C7282b) r24, (androidx.compose.p015ui.text.font.C1952g.C1953a) r25, (int) r26)
            r5 = r6
        L_0x0208:
            r2.mo4508b(r5)
        L_0x020b:
            r4.getClass()
            java.lang.String r5 = "<set-?>"
            kotlin.jvm.internal.C19383o.m32797g(r11, r5)
            r4.f1963c = r11
            r5 = r32
            r2.mo4509c(r5)
            r6 = 959239573(0x392cd595, float:1.6482764E-4)
            r0.mo5465u(r6)
            if (r5 == 0) goto L_0x022e
            androidx.compose.runtime.t r5 = androidx.compose.foundation.text.selection.TextSelectionColorsKt.f2103a
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.foundation.text.selection.t r5 = (androidx.compose.foundation.text.selection.C1026t) r5
            long r5 = r5.f2155b
            r4.f1968h = r5
        L_0x022e:
            r4 = 0
            r0.mo5418R(r4)
            androidx.compose.ui.d r4 = r2.f1927f
            androidx.compose.ui.d r5 = r2.f1928g
            androidx.compose.ui.d r4 = r4.mo6148i0(r5)
            androidx.compose.ui.d r5 = r2.f1929h
            androidx.compose.ui.d r4 = r4.mo6148i0(r5)
            r6 = r16
            androidx.compose.ui.d r4 = r6.mo6148i0(r4)
            androidx.compose.foundation.text.TextController$measurePolicy$1 r2 = r2.f1926e
            r5 = 544976794(0x207baf9a, float:2.1318629E-19)
            r0.mo5465u(r5)
            r5 = r30
            java.lang.Object r5 = r0.mo5410J(r5)
            m0.b r5 = (p174m0.C7282b) r5
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.ui.unit.LayoutDirection r7 = (androidx.compose.p015ui.unit.LayoutDirection) r7
            androidx.compose.runtime.l1 r8 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.ui.platform.j1 r8 = (androidx.compose.p015ui.platform.C1843j1) r8
            androidx.compose.ui.d r4 = androidx.compose.p015ui.ComposedModifierKt.m3051c(r0, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r10 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r10.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            r12 = 1405779621(0x53ca7ea5, float:1.73941627E12)
            r0.mo5465u(r12)
            androidx.compose.runtime.c<?> r12 = r0.f2715a
            boolean r12 = r12 instanceof androidx.compose.runtime.C1299c
            if (r12 == 0) goto L_0x02d2
            r0.mo5392A()
            boolean r12 = r0.f2702K
            if (r12 == 0) goto L_0x028d
            androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1 r12 = new androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
            r12.<init>(r10)
            r0.mo5450m(r12)
            goto L_0x0290
        L_0x028d:
            r0.mo5452n()
        L_0x0290:
            r10 = 0
            r0.f2738x = r10
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r2, r10)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r5, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r7, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.Updater.m2571b(r0, r8, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.d, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3779c
            androidx.compose.runtime.Updater.m2571b(r0, r4, r2)
            r0.mo5430c()
            r2 = 1
            r0.mo5418R(r2)
            r2 = 0
            r0.mo5418R(r2)
            r0.mo5418R(r2)
            goto L_0x00ee
        L_0x02bc:
            androidx.compose.runtime.v0 r10 = r0.mo5421U()
            if (r10 != 0) goto L_0x02c3
            goto L_0x02d1
        L_0x02c3:
            androidx.compose.foundation.text.BasicTextKt$BasicText$3 r11 = new androidx.compose.foundation.text.BasicTextKt$BasicText$3
            r0 = r11
            r1 = r27
            r8 = r35
            r9 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f3081d = r11
        L_0x02d1:
            return
        L_0x02d2:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        L_0x02d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.m1954b(java.lang.String, androidx.compose.ui.d, androidx.compose.ui.text.s, kq.l, int, boolean, int, androidx.compose.runtime.d, int, int):void");
    }
}
