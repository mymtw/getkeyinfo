package androidx.compose.material;

public final class FloatingActionButtonKt {

    /* renamed from: a */
    public static final float f2209a = ((float) 56);

    /* renamed from: b */
    public static final float f2210b = ((float) 48);

    /* renamed from: c */
    public static final float f2211c = ((float) 12);

    /* renamed from: d */
    public static final float f2212d = ((float) 20);

    /* JADX WARNING: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x010c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2182a(p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r29, p753kq.C19846a<kotlin.C19394m> r30, androidx.compose.p015ui.C1436d r31, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r32, androidx.compose.foundation.interaction.C0640j r33, androidx.compose.p015ui.graphics.C1530k0 r34, long r35, long r37, androidx.compose.material.C1263w0 r39, androidx.compose.runtime.C1302d r40, int r41, int r42) {
        /*
            r1 = r29
            r15 = r30
            r0 = r41
            r14 = r42
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            r2 = -1555720195(0xffffffffa34597fd, float:-1.0711576E-17)
            r3 = r40
            androidx.compose.runtime.ComposerImpl r13 = r3.mo5440h(r2)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0022
            r2 = r0 | 6
            goto L_0x0032
        L_0x0022:
            r2 = r0 & 14
            if (r2 != 0) goto L_0x0031
            boolean r2 = r13.mo5408I(r1)
            if (r2 == 0) goto L_0x002e
            r2 = 4
            goto L_0x002f
        L_0x002e:
            r2 = 2
        L_0x002f:
            r2 = r2 | r0
            goto L_0x0032
        L_0x0031:
            r2 = r0
        L_0x0032:
            r3 = r14 & 2
            if (r3 == 0) goto L_0x0039
            r2 = r2 | 48
            goto L_0x0049
        L_0x0039:
            r3 = r0 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0049
            boolean r3 = r13.mo5408I(r15)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r2 = r2 | r3
        L_0x0049:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x0050
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r4 = r0 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            r4 = r31
            boolean r5 = r13.mo5408I(r4)
            if (r5 == 0) goto L_0x005f
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r2 = r2 | r5
            goto L_0x0065
        L_0x0063:
            r4 = r31
        L_0x0065:
            r5 = r14 & 8
            if (r5 == 0) goto L_0x006c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r6 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x007f
            r6 = r32
            boolean r7 = r13.mo5408I(r6)
            if (r7 == 0) goto L_0x007b
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r2 = r2 | r7
            goto L_0x0081
        L_0x007f:
            r6 = r32
        L_0x0081:
            r7 = r14 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x008b
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r8 = r8 & r0
            if (r8 != 0) goto L_0x009d
            r8 = r33
            boolean r9 = r13.mo5408I(r8)
            if (r9 == 0) goto L_0x0099
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r2 = r2 | r9
            goto L_0x009f
        L_0x009d:
            r8 = r33
        L_0x009f:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r0
            if (r9 != 0) goto L_0x00b9
            r9 = r14 & 32
            if (r9 != 0) goto L_0x00b3
            r9 = r34
            boolean r10 = r13.mo5408I(r9)
            if (r10 == 0) goto L_0x00b5
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b3:
            r9 = r34
        L_0x00b5:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r2 = r2 | r10
            goto L_0x00bb
        L_0x00b9:
            r9 = r34
        L_0x00bb:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r0
            if (r10 != 0) goto L_0x00d5
            r10 = r14 & 64
            if (r10 != 0) goto L_0x00cf
            r10 = r35
            boolean r12 = r13.mo5434e(r10)
            if (r12 == 0) goto L_0x00d1
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00cf:
            r10 = r35
        L_0x00d1:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r2 = r2 | r12
            goto L_0x00d7
        L_0x00d5:
            r10 = r35
        L_0x00d7:
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r0
            if (r12 != 0) goto L_0x00ef
            r12 = r14 & 128(0x80, float:1.794E-43)
            r8 = r37
            if (r12 != 0) goto L_0x00eb
            boolean r12 = r13.mo5434e(r8)
            if (r12 == 0) goto L_0x00eb
            r12 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ed
        L_0x00eb:
            r12 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ed:
            r2 = r2 | r12
            goto L_0x00f1
        L_0x00ef:
            r8 = r37
        L_0x00f1:
            r12 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r0
            if (r12 != 0) goto L_0x010c
            r12 = r14 & 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x0105
            r12 = r39
            boolean r16 = r13.mo5408I(r12)
            if (r16 == 0) goto L_0x0107
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0105:
            r12 = r39
        L_0x0107:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r2 = r2 | r16
            goto L_0x010e
        L_0x010c:
            r12 = r39
        L_0x010e:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r4 = r2 & r16
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r6) goto L_0x0134
            boolean r4 = r13.mo5442i()
            if (r4 != 0) goto L_0x011f
            goto L_0x0134
        L_0x011f:
            r13.mo5396C()
            r3 = r31
            r4 = r32
            r5 = r33
            r6 = r34
            r26 = r13
            r27 = r10
            r11 = r12
            r9 = r8
            r7 = r27
            goto L_0x0270
        L_0x0134:
            r13.mo5466u0()
            r4 = r0 & 1
            r6 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r16 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x0178
            boolean r4 = r13.mo5425Y()
            if (r4 == 0) goto L_0x014e
            goto L_0x0178
        L_0x014e:
            r13.mo5396C()
            r3 = r14 & 32
            if (r3 == 0) goto L_0x0157
            r2 = r2 & r17
        L_0x0157:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x015d
            r2 = r2 & r16
        L_0x015d:
            r3 = r14 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0162
            r2 = r2 & r6
        L_0x0162:
            r3 = r14 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0168
            r2 = r2 & r18
        L_0x0168:
            r0 = r31
            r16 = r33
            r17 = r34
            r20 = r8
            r18 = r10
            r22 = r12
            r12 = r32
            goto L_0x0207
        L_0x0178:
            if (r3 == 0) goto L_0x017d
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x017f
        L_0x017d:
            r3 = r31
        L_0x017f:
            if (r5 == 0) goto L_0x0183
            r4 = 0
            goto L_0x0185
        L_0x0183:
            r4 = r32
        L_0x0185:
            if (r7 == 0) goto L_0x01a0
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r13.mo5465u(r5)
            java.lang.Object r5 = r13.mo5431c0()
            androidx.compose.runtime.d$a$a r6 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r5 != r6) goto L_0x0199
            androidx.compose.foundation.interaction.k r5 = android.support.p013v4.media.C0072d.m198e(r13)
        L_0x0199:
            r6 = 0
            r13.mo5418R(r6)
            androidx.compose.foundation.interaction.j r5 = (androidx.compose.foundation.interaction.C0640j) r5
            goto L_0x01a2
        L_0x01a0:
            r5 = r33
        L_0x01a2:
            r6 = r14 & 32
            if (r6 == 0) goto L_0x01c2
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r6 = r13.mo5410J(r6)
            androidx.compose.material.q1 r6 = (androidx.compose.material.C1225q1) r6
            p.a r6 = r6.f2547a
            r7 = 50
            p.e r0 = new p.e
            float r7 = (float) r7
            r0.<init>(r7)
            r6.getClass()
            p.f r0 = r6.mo20043b(r0, r0, r0, r0)
            r2 = r2 & r17
            goto L_0x01c4
        L_0x01c2:
            r0 = r34
        L_0x01c4:
            r6 = r14 & 64
            if (r6 == 0) goto L_0x01d7
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r6 = r13.mo5410J(r6)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            long r6 = r6.mo5361h()
            r2 = r2 & r16
            goto L_0x01d8
        L_0x01d7:
            r6 = r10
        L_0x01d8:
            r10 = r14 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01e4
            long r8 = androidx.compose.material.ColorsKt.m2174b(r6, r13)
            r10 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r2 & r10
        L_0x01e4:
            r10 = r14 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x01fb
            androidx.compose.material.b0 r10 = p001a0.C0005b.m31Y(r13)
            r2 = r2 & r18
            r17 = r0
            r0 = r3
            r12 = r4
            r16 = r5
            r18 = r6
            r20 = r8
            r22 = r10
            goto L_0x0207
        L_0x01fb:
            r17 = r0
            r0 = r3
            r16 = r5
            r18 = r6
            r20 = r8
            r22 = r12
            r12 = r4
        L_0x0207:
            r13.mo5419S()
            float r3 = f2210b
            r4 = 0
            r5 = 0
            r6 = 12
            r31 = r0
            r32 = r3
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r6
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.SizeKt.m1494n(r31, r32, r33, r34, r35, r36)
            r4 = 1418981691(0x5493f13b, float:5.0832589E12)
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2 r5 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$2
            r5.<init>(r12, r2, r1)
            androidx.compose.runtime.internal.ComposableLambdaImpl r11 = p628nj.C18263b.m30805A(r13, r4, r5)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            int r5 = r2 >> 3
            r5 = r5 & 14
            r4 = r4 | r5
            int r2 = r2 >> 6
            r5 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r2
            r4 = r4 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r2
            r4 = r4 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r5
            r23 = r4 | r2
            r24 = 0
            r2 = r30
            r4 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r10 = r22
            r25 = r12
            r12 = r13
            r26 = r13
            r13 = r23
            r14 = r24
            m2183b(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14)
            r3 = r0
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r11 = r22
            r4 = r25
        L_0x0270:
            androidx.compose.runtime.v0 r14 = r26.mo5421U()
            if (r14 != 0) goto L_0x0277
            goto L_0x0288
        L_0x0277:
            androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3 r13 = new androidx.compose.material.FloatingActionButtonKt$ExtendedFloatingActionButton$3
            r0 = r13
            r1 = r29
            r2 = r30
            r12 = r41
            r15 = r13
            r13 = r42
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13)
            r14.f3081d = r15
        L_0x0288:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m2182a(kq.p, kq.a, androidx.compose.ui.d, kq.p, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.k0, long, long, androidx.compose.material.w0, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0112  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2183b(p753kq.C19846a<kotlin.C19394m> r30, androidx.compose.p015ui.C1436d r31, androidx.compose.foundation.interaction.C0640j r32, androidx.compose.p015ui.graphics.C1530k0 r33, long r34, long r36, androidx.compose.material.C1263w0 r38, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r39, androidx.compose.runtime.C1302d r40, int r41, int r42) {
        /*
            r15 = r30
            r14 = r39
            r13 = r41
            r12 = r42
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1028985328(0x3d5511f0, float:0.05201906)
            r1 = r40
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo5408I(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r31
            boolean r3 = r11.mo5408I(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
            goto L_0x004e
        L_0x004c:
            r2 = r31
        L_0x004e:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r13 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r32
            boolean r5 = r11.mo5408I(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r32
        L_0x006a:
            r5 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0083
            r5 = r12 & 8
            if (r5 != 0) goto L_0x007d
            r5 = r33
            boolean r6 = r11.mo5408I(r5)
            if (r6 == 0) goto L_0x007f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007d:
            r5 = r33
        L_0x007f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r6
            goto L_0x0085
        L_0x0083:
            r5 = r33
        L_0x0085:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00a0
            r6 = r12 & 16
            if (r6 != 0) goto L_0x009a
            r6 = r34
            boolean r8 = r11.mo5434e(r6)
            if (r8 == 0) goto L_0x009c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r6 = r34
        L_0x009c:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r8
            goto L_0x00a2
        L_0x00a0:
            r6 = r34
        L_0x00a2:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00bc
            r8 = r12 & 32
            if (r8 != 0) goto L_0x00b6
            r8 = r36
            boolean r10 = r11.mo5434e(r8)
            if (r10 == 0) goto L_0x00b8
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r8 = r36
        L_0x00b8:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r0 = r0 | r10
            goto L_0x00be
        L_0x00bc:
            r8 = r36
        L_0x00be:
            r10 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r13
            if (r10 != 0) goto L_0x00d9
            r10 = r12 & 64
            if (r10 != 0) goto L_0x00d2
            r10 = r38
            boolean r16 = r11.mo5408I(r10)
            if (r16 == 0) goto L_0x00d4
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d2:
            r10 = r38
        L_0x00d4:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r0 = r0 | r16
            goto L_0x00db
        L_0x00d9:
            r10 = r38
        L_0x00db:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e2
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00f2
        L_0x00e2:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r13
            if (r2 != 0) goto L_0x00f3
            boolean r2 = r11.mo5408I(r14)
            if (r2 == 0) goto L_0x00f0
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r0 = r0 | r2
        L_0x00f3:
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r0
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r4) goto L_0x0112
            boolean r2 = r11.mo5442i()
            if (r2 != 0) goto L_0x0103
            goto L_0x0112
        L_0x0103:
            r11.mo5396C()
            r2 = r31
            r3 = r32
            r4 = r5
            r5 = r6
            r7 = r8
            r9 = r10
            r25 = r11
            goto L_0x023f
        L_0x0112:
            r11.mo5466u0()
            r2 = r13 & 1
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x014e
            boolean r2 = r11.mo5425Y()
            if (r2 == 0) goto L_0x0129
            goto L_0x014e
        L_0x0129:
            r11.mo5396C()
            r1 = r12 & 8
            if (r1 == 0) goto L_0x0132
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0132:
            r1 = r12 & 16
            if (r1 == 0) goto L_0x0138
            r0 = r0 & r17
        L_0x0138:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x013e
            r0 = r0 & r16
        L_0x013e:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x0143
            r0 = r0 & r4
        L_0x0143:
            r16 = r31
            r17 = r5
            r18 = r6
            r6 = r10
            r10 = r32
            goto L_0x01cd
        L_0x014e:
            if (r1 == 0) goto L_0x0153
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0155
        L_0x0153:
            r1 = r31
        L_0x0155:
            if (r3 == 0) goto L_0x0170
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r2)
            java.lang.Object r2 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0169
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x0169:
            r3 = 0
            r11.mo5418R(r3)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            goto L_0x0172
        L_0x0170:
            r2 = r32
        L_0x0172:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0192
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r3 = r11.mo5410J(r3)
            androidx.compose.material.q1 r3 = (androidx.compose.material.C1225q1) r3
            p.a r3 = r3.f2547a
            r4 = 50
            p.e r5 = new p.e
            float r4 = (float) r4
            r5.<init>(r4)
            r3.getClass()
            p.f r3 = r3.mo20043b(r5, r5, r5, r5)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x0193
        L_0x0192:
            r3 = r5
        L_0x0193:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01a6
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r4 = r11.mo5410J(r4)
            androidx.compose.material.v r4 = (androidx.compose.material.C1259v) r4
            long r4 = r4.mo5361h()
            r0 = r0 & r17
            goto L_0x01a7
        L_0x01a6:
            r4 = r6
        L_0x01a7:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x01b2
            long r6 = androidx.compose.material.ColorsKt.m2174b(r4, r11)
            r0 = r0 & r16
            goto L_0x01b3
        L_0x01b2:
            r6 = r8
        L_0x01b3:
            r8 = r12 & 64
            if (r8 == 0) goto L_0x01c0
            androidx.compose.material.b0 r8 = p001a0.C0005b.m31Y(r11)
            r9 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r9
            goto L_0x01c1
        L_0x01c0:
            r8 = r10
        L_0x01c1:
            r16 = r1
            r10 = r2
            r17 = r3
            r18 = r4
            r28 = r6
            r6 = r8
            r8 = r28
        L_0x01cd:
            r11.mo5419S()
            r2 = 0
            r20 = 0
            int r1 = r0 >> 6
            r1 = r1 & 14
            int r3 = r0 >> 15
            r3 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            androidx.compose.animation.core.f r1 = r6.mo5230a(r10, r11, r1)
            java.lang.Object r1 = r1.getValue()
            m0.d r1 = (p174m0.C7284d) r1
            float r7 = r1.f16155b
            r1 = 1972871863(0x7597a2b7, float:3.8444193E32)
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2 r3 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$2
            r3.<init>(r8, r14, r0)
            androidx.compose.runtime.internal.ComposableLambdaImpl r21 = p628nj.C18263b.m30805A(r11, r1, r3)
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r0 & 14
            r1 = r1 | r3
            r3 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r3
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r1 = r1 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            int r0 = r0 << 18
            r0 = r0 & r3
            r22 = r1 | r0
            r23 = 68
            r0 = r30
            r1 = r16
            r3 = r17
            r4 = r18
            r24 = r6
            r25 = r7
            r6 = r8
            r26 = r8
            r8 = r20
            r9 = r25
            r20 = r10
            r25 = r11
            r11 = r21
            r12 = r25
            r13 = r22
            r14 = r23
            androidx.compose.material.SurfaceKt.m2235b(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            r2 = r16
            r4 = r17
            r5 = r18
            r3 = r20
            r9 = r24
            r7 = r26
        L_0x023f:
            androidx.compose.runtime.v0 r13 = r25.mo5421U()
            if (r13 != 0) goto L_0x0246
            goto L_0x0256
        L_0x0246:
            androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3 r14 = new androidx.compose.material.FloatingActionButtonKt$FloatingActionButton$3
            r0 = r14
            r1 = r30
            r10 = r39
            r11 = r41
            r12 = r42
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r13.f3081d = r14
        L_0x0256:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.FloatingActionButtonKt.m2183b(kq.a, androidx.compose.ui.d, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.k0, long, long, androidx.compose.material.w0, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
