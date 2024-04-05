package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;

public final class AppBarKt {

    /* renamed from: a */
    public static final float f2169a = ((float) 56);

    /* renamed from: b */
    public static final float f2170b;

    /* renamed from: c */
    public static final C1436d f2171c;

    /* renamed from: d */
    public static final C1436d f2172d;

    /* renamed from: e */
    public static final float f2173e = ((float) 8);

    /* renamed from: f */
    public static final float f2174f;

    static {
        float f = (float) 4;
        f2170b = f;
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        f2171c = SizeKt.m1495o(aVar, ((float) 16) - f);
        f2172d = SizeKt.m1495o(SizeKt.m1485e(aVar), ((float) 72) - f);
        f2174f = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2165a(float r24, int r25, int r26, long r27, long r29, androidx.compose.foundation.layout.C0759v r31, androidx.compose.runtime.C1302d r32, androidx.compose.p015ui.C1436d r33, androidx.compose.p015ui.graphics.C1530k0 r34, p753kq.C19862q r35) {
        /*
            r10 = r25
            r6 = r31
            r9 = r35
            r0 = -1249680788(0xffffffffb583626c, float:-9.788905E-7)
            r1 = r32
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r26 & 1
            if (r1 == 0) goto L_0x0019
            r1 = r10 | 6
            r3 = r1
            r1 = r27
            goto L_0x002d
        L_0x0019:
            r1 = r10 & 14
            if (r1 != 0) goto L_0x002a
            r1 = r27
            boolean r3 = r0.mo5434e(r1)
            if (r3 == 0) goto L_0x0027
            r3 = 4
            goto L_0x0028
        L_0x0027:
            r3 = 2
        L_0x0028:
            r3 = r3 | r10
            goto L_0x002d
        L_0x002a:
            r1 = r27
            r3 = r10
        L_0x002d:
            r4 = r26 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
            goto L_0x0047
        L_0x0034:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0047
            r4 = r29
            boolean r7 = r0.mo5434e(r4)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r3 = r3 | r7
            goto L_0x0049
        L_0x0047:
            r4 = r29
        L_0x0049:
            r7 = r26 & 4
            if (r7 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0063
            r7 = r24
            boolean r8 = r0.mo5428b(r7)
            if (r8 == 0) goto L_0x005f
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r8
            goto L_0x0065
        L_0x0063:
            r7 = r24
        L_0x0065:
            r8 = r26 & 8
            if (r8 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007c
            boolean r8 = r0.mo5408I(r6)
            if (r8 == 0) goto L_0x0079
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r8
        L_0x007c:
            r8 = r26 & 16
            if (r8 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0098
        L_0x0083:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r10
            if (r8 != 0) goto L_0x0098
            r8 = r34
            boolean r11 = r0.mo5408I(r8)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r11
            goto L_0x009a
        L_0x0098:
            r8 = r34
        L_0x009a:
            r11 = r26 & 32
            r12 = 458752(0x70000, float:6.42848E-40)
            if (r11 == 0) goto L_0x00a4
            r13 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r13
            goto L_0x00b7
        L_0x00a4:
            r13 = r10 & r12
            if (r13 != 0) goto L_0x00b7
            r13 = r33
            boolean r14 = r0.mo5408I(r13)
            if (r14 == 0) goto L_0x00b3
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r3 = r3 | r14
            goto L_0x00b9
        L_0x00b7:
            r13 = r33
        L_0x00b9:
            r14 = r26 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00c1
            r3 = r3 | r15
            goto L_0x00d2
        L_0x00c1:
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00d2
            boolean r14 = r0.mo5408I(r9)
            if (r14 == 0) goto L_0x00cf
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r3 = r3 | r14
        L_0x00d2:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r3
            r12 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r12) goto L_0x00e8
            boolean r12 = r0.mo5442i()
            if (r12 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            r0.mo5396C()
            r23 = r13
            goto L_0x0129
        L_0x00e8:
            if (r11 == 0) goto L_0x00ef
            androidx.compose.ui.d$a r11 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r23 = r11
            goto L_0x00f1
        L_0x00ef:
            r23 = r13
        L_0x00f1:
            r17 = 0
            r11 = -1027830352(0xffffffffc2bc8db0, float:-94.27673)
            androidx.compose.material.AppBarKt$AppBar$1 r12 = new androidx.compose.material.AppBarKt$AppBar$1
            r12.<init>(r6, r9, r3)
            androidx.compose.runtime.internal.ComposableLambdaImpl r19 = p628nj.C18263b.m30805A(r0, r11, r12)
            int r11 = r3 >> 15
            r11 = r11 & 14
            r11 = r11 | r15
            int r12 = r3 >> 9
            r12 = r12 & 112(0x70, float:1.57E-43)
            r11 = r11 | r12
            int r12 = r3 << 6
            r13 = r12 & 896(0x380, float:1.256E-42)
            r11 = r11 | r13
            r12 = r12 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r12
            int r3 = r3 << 9
            r12 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r12
            r21 = r11 | r3
            r22 = 16
            r11 = r23
            r12 = r34
            r13 = r27
            r15 = r29
            r18 = r24
            r20 = r0
            androidx.compose.material.SurfaceKt.m2234a(r11, r12, r13, r15, r17, r18, r19, r20, r21, r22)
        L_0x0129:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x0130
            goto L_0x014a
        L_0x0130:
            androidx.compose.material.AppBarKt$AppBar$2 r13 = new androidx.compose.material.AppBarKt$AppBar$2
            r0 = r13
            r1 = r27
            r3 = r29
            r5 = r24
            r6 = r31
            r7 = r34
            r8 = r23
            r9 = r35
            r10 = r25
            r11 = r26
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m2165a(float, int, int, long, long, androidx.compose.foundation.layout.v, androidx.compose.runtime.d, androidx.compose.ui.d, androidx.compose.ui.graphics.k0, kq.q):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2166b(p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r25, androidx.compose.p015ui.C1436d r26, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r27, p753kq.C19862q<? super androidx.compose.foundation.layout.C0763z, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r28, long r29, long r31, float r33, androidx.compose.runtime.C1302d r34, int r35, int r36) {
        /*
            r1 = r25
            r10 = r35
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = -2087748139(0xffffffff838f7dd5, float:-8.433674E-37)
            r2 = r34
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r36 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r10 | 6
            goto L_0x0029
        L_0x0019:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x0028
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0025
            r2 = 4
            goto L_0x0026
        L_0x0025:
            r2 = 2
        L_0x0026:
            r2 = r2 | r10
            goto L_0x0029
        L_0x0028:
            r2 = r10
        L_0x0029:
            r3 = r36 & 2
            if (r3 == 0) goto L_0x0030
            r2 = r2 | 48
            goto L_0x0043
        L_0x0030:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0043
            r4 = r26
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x003f
            r5 = 32
            goto L_0x0041
        L_0x003f:
            r5 = 16
        L_0x0041:
            r2 = r2 | r5
            goto L_0x0045
        L_0x0043:
            r4 = r26
        L_0x0045:
            r5 = r36 & 4
            if (r5 == 0) goto L_0x004c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004c:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x005f
            r6 = r27
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x005b
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r2 = r2 | r7
            goto L_0x0061
        L_0x005f:
            r6 = r27
        L_0x0061:
            r7 = r36 & 8
            if (r7 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0068:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007b
            r8 = r28
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x0077
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r9
            goto L_0x007d
        L_0x007b:
            r8 = r28
        L_0x007d:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0096
            r9 = r36 & 16
            r11 = r29
            if (r9 != 0) goto L_0x0092
            boolean r9 = r0.mo5434e(r11)
            if (r9 == 0) goto L_0x0092
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r2 = r2 | r9
            goto L_0x0098
        L_0x0096:
            r11 = r29
        L_0x0098:
            r9 = 458752(0x70000, float:6.42848E-40)
            r13 = r10 & r9
            if (r13 != 0) goto L_0x00b3
            r13 = r36 & 32
            if (r13 != 0) goto L_0x00ad
            r13 = r31
            boolean r15 = r0.mo5434e(r13)
            if (r15 == 0) goto L_0x00af
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00ad:
            r13 = r31
        L_0x00af:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r2 = r2 | r15
            goto L_0x00b5
        L_0x00b3:
            r13 = r31
        L_0x00b5:
            r15 = r36 & 64
            if (r15 == 0) goto L_0x00c0
            r16 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r16
            r9 = r33
            goto L_0x00d5
        L_0x00c0:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r9 = r33
            if (r16 != 0) goto L_0x00d5
            boolean r16 = r0.mo5428b(r9)
            if (r16 == 0) goto L_0x00d1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d3
        L_0x00d1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d3:
            r2 = r2 | r16
        L_0x00d5:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r4 = r2 & r16
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r6) goto L_0x00f2
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x00e6
            goto L_0x00f2
        L_0x00e6:
            r0.mo5396C()
            r2 = r26
            r3 = r27
            r4 = r8
            r5 = r11
            r7 = r13
            goto L_0x0193
        L_0x00f2:
            r0.mo5466u0()
            r4 = r10 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x011e
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x0106
            goto L_0x011e
        L_0x0106:
            r0.mo5396C()
            r3 = r36 & 16
            if (r3 == 0) goto L_0x010f
            r2 = r2 & r16
        L_0x010f:
            r3 = r36 & 32
            if (r3 == 0) goto L_0x0114
            r2 = r2 & r6
        L_0x0114:
            r3 = r26
            r4 = r27
            r5 = r8
            r6 = r9
            r7 = r11
            r23 = r13
            goto L_0x0158
        L_0x011e:
            if (r3 == 0) goto L_0x0123
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0125
        L_0x0123:
            r3 = r26
        L_0x0125:
            if (r5 == 0) goto L_0x0129
            r4 = 0
            goto L_0x012b
        L_0x0129:
            r4 = r27
        L_0x012b:
            if (r7 == 0) goto L_0x0130
            androidx.compose.runtime.internal.ComposableLambdaImpl r5 = androidx.compose.material.ComposableSingletons$AppBarKt.f2188a
            goto L_0x0131
        L_0x0130:
            r5 = r8
        L_0x0131:
            r7 = r36 & 16
            if (r7 == 0) goto L_0x0144
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.v r7 = (androidx.compose.material.C1259v) r7
            long r7 = androidx.compose.material.ColorsKt.m2175c(r7)
            r2 = r2 & r16
            goto L_0x0145
        L_0x0144:
            r7 = r11
        L_0x0145:
            r11 = r36 & 32
            if (r11 == 0) goto L_0x014f
            long r11 = androidx.compose.material.ColorsKt.m2174b(r7, r0)
            r2 = r2 & r6
            goto L_0x0150
        L_0x014f:
            r11 = r13
        L_0x0150:
            if (r15 == 0) goto L_0x0155
            float r6 = androidx.compose.material.C1163a.f2372a
            goto L_0x0156
        L_0x0155:
            r6 = r9
        L_0x0156:
            r23 = r11
        L_0x0158:
            r0.mo5419S()
            androidx.compose.foundation.layout.w r18 = androidx.compose.material.C1163a.f2374c
            androidx.compose.ui.graphics.e0$a r21 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            r9 = -1484077694(0xffffffffa78ac582, float:-3.8516833E-15)
            androidx.compose.material.AppBarKt$TopAppBar$1 r11 = new androidx.compose.material.AppBarKt$TopAppBar$1
            r11.<init>(r4, r2, r1, r5)
            androidx.compose.runtime.internal.ComposableLambdaImpl r22 = p628nj.C18263b.m30805A(r0, r9, r11)
            r9 = 1600512(0x186c00, float:2.242795E-39)
            int r11 = r2 >> 12
            r12 = r11 & 14
            r9 = r9 | r12
            r12 = r11 & 112(0x70, float:1.57E-43)
            r9 = r9 | r12
            r11 = r11 & 896(0x380, float:1.256E-42)
            r9 = r9 | r11
            int r2 = r2 << 12
            r11 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r11
            r12 = r9 | r2
            r13 = 0
            r11 = r6
            r14 = r7
            r16 = r23
            r19 = r0
            r20 = r3
            m2165a(r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
            r2 = r3
            r3 = r4
            r4 = r5
            r9 = r6
            r5 = r7
            r7 = r23
        L_0x0193:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x019a
            goto L_0x01a8
        L_0x019a:
            androidx.compose.material.AppBarKt$TopAppBar$2 r13 = new androidx.compose.material.AppBarKt$TopAppBar$2
            r0 = r13
            r1 = r25
            r10 = r35
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.f3081d = r13
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m2166b(kq.p, androidx.compose.ui.d, kq.p, kq.q, long, long, float, androidx.compose.runtime.d, int, int):void");
    }
}
