package androidx.compose.foundation.lazy;

public final class LazyDslKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1771a(androidx.compose.p015ui.C1436d r28, androidx.compose.foundation.lazy.LazyListState r29, androidx.compose.foundation.layout.C0759v r30, boolean r31, androidx.compose.foundation.layout.C0718d.C0729k r32, androidx.compose.p015ui.C1428a.C1430b r33, androidx.compose.foundation.gestures.C0608f r34, boolean r35, p753kq.C19857l<? super androidx.compose.foundation.lazy.C0859r, kotlin.C19394m> r36, androidx.compose.runtime.C1302d r37, int r38, int r39) {
        /*
            r15 = r36
            r14 = r38
            r13 = r39
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r1 = r37
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r14 | 6
            r2 = r1
            r1 = r28
            goto L_0x0032
        L_0x001e:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r28
            boolean r2 = r12.mo5408I(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r14
            goto L_0x0032
        L_0x002f:
            r1 = r28
            r2 = r14
        L_0x0032:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r13 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r29
            boolean r4 = r12.mo5408I(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r29
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r29
        L_0x004d:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r30
            boolean r6 = r12.mo5408I(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r30
        L_0x0069:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r31
            boolean r8 = r12.mo5427a(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r31
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00a0
            r8 = r13 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r32
            boolean r9 = r12.mo5408I(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r32
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r2 = r2 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r32
        L_0x00a2:
            r9 = r13 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00ac
            r11 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r11
            goto L_0x00c0
        L_0x00ac:
            r11 = r14 & r10
            if (r11 != 0) goto L_0x00c0
            r11 = r33
            boolean r16 = r12.mo5408I(r11)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r2 = r2 | r16
            goto L_0x00c2
        L_0x00c0:
            r11 = r33
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r13 & 64
            r10 = r34
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r12.mo5408I(r10)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r17
            goto L_0x00de
        L_0x00dc:
            r10 = r34
        L_0x00de:
            r1 = r13 & 128(0x80, float:1.794E-43)
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            if (r1 == 0) goto L_0x00eb
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r18
            r3 = r35
            goto L_0x00fe
        L_0x00eb:
            r18 = r14 & r17
            r3 = r35
            if (r18 != 0) goto L_0x00fe
            boolean r18 = r12.mo5427a(r3)
            if (r18 == 0) goto L_0x00fa
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r2 = r2 | r18
        L_0x00fe:
            r3 = r13 & 256(0x100, float:3.59E-43)
            r18 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x0107
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0116
        L_0x0107:
            r3 = r14 & r18
            if (r3 != 0) goto L_0x0117
            boolean r3 = r12.mo5408I(r15)
            if (r3 == 0) goto L_0x0114
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r2 = r2 | r3
        L_0x0117:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r2
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x013a
            boolean r3 = r12.mo5442i()
            if (r3 != 0) goto L_0x0127
            goto L_0x013a
        L_0x0127:
            r12.mo5396C()
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r7
            r5 = r8
            r7 = r10
            r6 = r11
            r27 = r12
            r8 = r35
            goto L_0x022c
        L_0x013a:
            r12.mo5466u0()
            r3 = r14 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r3 == 0) goto L_0x0174
            boolean r3 = r12.mo5425Y()
            if (r3 == 0) goto L_0x014e
            goto L_0x0174
        L_0x014e:
            r12.mo5396C()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0157
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0157:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x015c
            r2 = r2 & r5
        L_0x015c:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0162
            r2 = r2 & r19
        L_0x0162:
            r19 = r28
            r20 = r29
            r21 = r30
            r26 = r35
            r22 = r7
            r23 = r8
            r25 = r10
            r24 = r11
            goto L_0x01d2
        L_0x0174:
            if (r0 == 0) goto L_0x0179
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x017b
        L_0x0179:
            r0 = r28
        L_0x017b:
            r3 = r13 & 2
            r5 = 0
            if (r3 == 0) goto L_0x0187
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.C0863v.m1919a(r12)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0189
        L_0x0187:
            r3 = r29
        L_0x0189:
            if (r4 == 0) goto L_0x0192
            float r4 = (float) r5
            androidx.compose.foundation.layout.w r5 = new androidx.compose.foundation.layout.w
            r5.<init>(r4, r4, r4, r4)
            goto L_0x0194
        L_0x0192:
            r5 = r30
        L_0x0194:
            if (r6 == 0) goto L_0x0197
            r7 = 0
        L_0x0197:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x01a9
            androidx.compose.foundation.layout.d$i r4 = androidx.compose.foundation.layout.C0718d.f1476a
            if (r7 != 0) goto L_0x01a2
            androidx.compose.foundation.layout.d$j r4 = androidx.compose.foundation.layout.C0718d.f1478c
            goto L_0x01a4
        L_0x01a2:
            androidx.compose.foundation.layout.d$a r4 = androidx.compose.foundation.layout.C0718d.f1479d
        L_0x01a4:
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = r2 & r6
            goto L_0x01aa
        L_0x01a9:
            r4 = r8
        L_0x01aa:
            if (r9 == 0) goto L_0x01af
            androidx.compose.ui.b$a r6 = androidx.compose.p015ui.C1428a.C1429a.f3116l
            goto L_0x01b0
        L_0x01af:
            r6 = r11
        L_0x01b0:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x01bb
            androidx.compose.foundation.gestures.a r8 = kotlin.reflect.C19421p.m32919I(r12)
            r2 = r2 & r19
            goto L_0x01bc
        L_0x01bb:
            r8 = r10
        L_0x01bc:
            if (r1 == 0) goto L_0x01c0
            r1 = 1
            goto L_0x01c2
        L_0x01c0:
            r1 = r35
        L_0x01c2:
            r19 = r0
            r26 = r1
            r20 = r3
            r23 = r4
            r21 = r5
            r24 = r6
            r22 = r7
            r25 = r8
        L_0x01d2:
            r12.mo5419S()
            r4 = 1
            r9 = 0
            r10 = 0
            r0 = r2 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r2 >> 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r1 = r1 & r16
            r0 = r0 | r1
            int r1 = r2 << 6
            r1 = r1 & r17
            r0 = r0 | r1
            int r1 = r2 << 12
            r1 = r1 & r18
            r16 = r0 | r1
            int r0 = r2 >> 21
            r17 = r0 & 112(0x70, float:1.57E-43)
            r18 = 1536(0x600, float:2.152E-42)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r25
            r6 = r26
            r7 = r24
            r8 = r23
            r11 = r36
            r27 = r12
            r13 = r16
            r14 = r17
            r15 = r18
            androidx.compose.foundation.lazy.LazyListKt.m1784a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
        L_0x022c:
            androidx.compose.runtime.v0 r12 = r27.mo5421U()
            if (r12 != 0) goto L_0x0233
            goto L_0x0241
        L_0x0233:
            androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
            r0 = r13
            r9 = r36
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.m1771a(androidx.compose.ui.d, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.v, boolean, androidx.compose.foundation.layout.d$k, androidx.compose.ui.a$b, androidx.compose.foundation.gestures.f, boolean, kq.l, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0105  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1772b(androidx.compose.p015ui.C1436d r28, androidx.compose.foundation.lazy.LazyListState r29, androidx.compose.foundation.layout.C0759v r30, boolean r31, androidx.compose.foundation.layout.C0718d.C0722d r32, androidx.compose.p015ui.C1428a.C1431c r33, androidx.compose.foundation.gestures.C0608f r34, boolean r35, p753kq.C19857l<? super androidx.compose.foundation.lazy.C0859r, kotlin.C19394m> r36, androidx.compose.runtime.C1302d r37, int r38, int r39) {
        /*
            r15 = r36
            r14 = r38
            r13 = r39
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r1 = r37
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = r13 & 1
            if (r0 == 0) goto L_0x001e
            r1 = r14 | 6
            r2 = r1
            r1 = r28
            goto L_0x0032
        L_0x001e:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x002f
            r1 = r28
            boolean r2 = r12.mo5408I(r1)
            if (r2 == 0) goto L_0x002c
            r2 = 4
            goto L_0x002d
        L_0x002c:
            r2 = 2
        L_0x002d:
            r2 = r2 | r14
            goto L_0x0032
        L_0x002f:
            r1 = r28
            r2 = r14
        L_0x0032:
            r3 = r14 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004b
            r3 = r13 & 2
            if (r3 != 0) goto L_0x0045
            r3 = r29
            boolean r4 = r12.mo5408I(r3)
            if (r4 == 0) goto L_0x0047
            r4 = 32
            goto L_0x0049
        L_0x0045:
            r3 = r29
        L_0x0047:
            r4 = 16
        L_0x0049:
            r2 = r2 | r4
            goto L_0x004d
        L_0x004b:
            r3 = r29
        L_0x004d:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0054
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r30
            boolean r6 = r12.mo5408I(r5)
            if (r6 == 0) goto L_0x0063
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r2 = r2 | r6
            goto L_0x0069
        L_0x0067:
            r5 = r30
        L_0x0069:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0070
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            r7 = r31
            boolean r8 = r12.mo5427a(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r2 = r2 | r8
            goto L_0x0085
        L_0x0083:
            r7 = r31
        L_0x0085:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00a0
            r8 = r13 & 16
            if (r8 != 0) goto L_0x009a
            r8 = r32
            boolean r9 = r12.mo5408I(r8)
            if (r9 == 0) goto L_0x009c
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009a:
            r8 = r32
        L_0x009c:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r2 = r2 | r9
            goto L_0x00a2
        L_0x00a0:
            r8 = r32
        L_0x00a2:
            r9 = r13 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r9 == 0) goto L_0x00ac
            r11 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r11
            goto L_0x00c0
        L_0x00ac:
            r11 = r14 & r10
            if (r11 != 0) goto L_0x00c0
            r11 = r33
            boolean r16 = r12.mo5408I(r11)
            if (r16 == 0) goto L_0x00bb
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bd
        L_0x00bb:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bd:
            r2 = r2 | r16
            goto L_0x00c2
        L_0x00c0:
            r11 = r33
        L_0x00c2:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r14 & r16
            if (r17 != 0) goto L_0x00dc
            r17 = r13 & 64
            r10 = r34
            if (r17 != 0) goto L_0x00d7
            boolean r17 = r12.mo5408I(r10)
            if (r17 == 0) goto L_0x00d7
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r17
            goto L_0x00de
        L_0x00dc:
            r10 = r34
        L_0x00de:
            r1 = r13 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e9
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r17
            r3 = r35
            goto L_0x00fe
        L_0x00e9:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r14 & r17
            r3 = r35
            if (r17 != 0) goto L_0x00fe
            boolean r17 = r12.mo5427a(r3)
            if (r17 == 0) goto L_0x00fa
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r2 = r2 | r17
        L_0x00fe:
            r3 = r13 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0105
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0115
        L_0x0105:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0116
            boolean r3 = r12.mo5408I(r15)
            if (r3 == 0) goto L_0x0113
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0113:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r2 = r2 | r3
        L_0x0116:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r2
            r5 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r5) goto L_0x0139
            boolean r3 = r12.mo5442i()
            if (r3 != 0) goto L_0x0126
            goto L_0x0139
        L_0x0126:
            r12.mo5396C()
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r7
            r5 = r8
            r7 = r10
            r6 = r11
            r27 = r12
            r8 = r35
            goto L_0x022d
        L_0x0139:
            r12.mo5466u0()
            r3 = r14 & 1
            r5 = -57345(0xffffffffffff1fff, float:NaN)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r3 == 0) goto L_0x0173
            boolean r3 = r12.mo5425Y()
            if (r3 == 0) goto L_0x014d
            goto L_0x0173
        L_0x014d:
            r12.mo5396C()
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0156
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0156:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x015b
            r2 = r2 & r5
        L_0x015b:
            r0 = r13 & 64
            if (r0 == 0) goto L_0x0161
            r2 = r2 & r17
        L_0x0161:
            r17 = r28
            r18 = r29
            r19 = r30
            r24 = r35
            r20 = r7
            r21 = r8
            r23 = r10
            r22 = r11
            goto L_0x01d1
        L_0x0173:
            if (r0 == 0) goto L_0x0178
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x017a
        L_0x0178:
            r0 = r28
        L_0x017a:
            r3 = r13 & 2
            r5 = 0
            if (r3 == 0) goto L_0x0186
            androidx.compose.foundation.lazy.LazyListState r3 = androidx.compose.foundation.lazy.C0863v.m1919a(r12)
            r2 = r2 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0188
        L_0x0186:
            r3 = r29
        L_0x0188:
            if (r4 == 0) goto L_0x0191
            float r4 = (float) r5
            androidx.compose.foundation.layout.w r5 = new androidx.compose.foundation.layout.w
            r5.<init>(r4, r4, r4, r4)
            goto L_0x0193
        L_0x0191:
            r5 = r30
        L_0x0193:
            if (r6 == 0) goto L_0x0196
            r7 = 0
        L_0x0196:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x01a8
            androidx.compose.foundation.layout.d$i r4 = androidx.compose.foundation.layout.C0718d.f1476a
            if (r7 != 0) goto L_0x01a1
            androidx.compose.foundation.layout.d$i r4 = androidx.compose.foundation.layout.C0718d.f1476a
            goto L_0x01a3
        L_0x01a1:
            androidx.compose.foundation.layout.d$c r4 = androidx.compose.foundation.layout.C0718d.f1477b
        L_0x01a3:
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            r2 = r2 & r6
            goto L_0x01a9
        L_0x01a8:
            r4 = r8
        L_0x01a9:
            if (r9 == 0) goto L_0x01ae
            androidx.compose.ui.b$b r6 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            goto L_0x01af
        L_0x01ae:
            r6 = r11
        L_0x01af:
            r8 = r13 & 64
            if (r8 == 0) goto L_0x01ba
            androidx.compose.foundation.gestures.a r8 = kotlin.reflect.C19421p.m32919I(r12)
            r2 = r2 & r17
            goto L_0x01bb
        L_0x01ba:
            r8 = r10
        L_0x01bb:
            if (r1 == 0) goto L_0x01bf
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = r35
        L_0x01c1:
            r17 = r0
            r24 = r1
            r18 = r3
            r21 = r4
            r19 = r5
            r22 = r6
            r20 = r7
            r23 = r8
        L_0x01d1:
            r12.mo5419S()
            r4 = 0
            r7 = 0
            r8 = 0
            r0 = r2 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r1 = r2 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r1 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r2 >> 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r0 = r0 | r3
            r1 = r1 & r16
            r0 = r0 | r1
            r1 = 1879048192(0x70000000, float:1.58456325E29)
            int r3 = r2 << 12
            r1 = r1 & r3
            r16 = r0 | r1
            int r0 = r2 >> 12
            r0 = r0 & 14
            int r1 = r2 >> 21
            r1 = r1 & 112(0x70, float:1.57E-43)
            r25 = r0 | r1
            r26 = 384(0x180, float:5.38E-43)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r9 = r22
            r10 = r21
            r11 = r36
            r27 = r12
            r13 = r16
            r14 = r25
            r15 = r26
            androidx.compose.foundation.lazy.LazyListKt.m1784a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
        L_0x022d:
            androidx.compose.runtime.v0 r12 = r27.mo5421U()
            if (r12 != 0) goto L_0x0234
            goto L_0x0242
        L_0x0234:
            androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1 r13 = new androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
            r0 = r13
            r9 = r36
            r10 = r38
            r11 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.m1772b(androidx.compose.ui.d, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.v, boolean, androidx.compose.foundation.layout.d$d, androidx.compose.ui.a$c, androidx.compose.foundation.gestures.f, boolean, kq.l, androidx.compose.runtime.d, int, int):void");
    }
}
