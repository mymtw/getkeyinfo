package com.etsy.collagecompose;

public final class DialogKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0117  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19950a(p753kq.C19846a<kotlin.C19394m> r18, androidx.compose.p015ui.C1436d r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, p753kq.C19846a<kotlin.C19394m> r23, java.lang.String r24, p753kq.C19846a<kotlin.C19394m> r25, androidx.compose.p015ui.window.C2089b r26, androidx.compose.runtime.C1302d r27, int r28, int r29) {
        /*
            r1 = r18
            r10 = r28
            r11 = r29
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = -409916145(0xffffffffe7912d0f, float:-1.3711486E24)
            r2 = r27
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r11 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r10 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r10
            goto L_0x002b
        L_0x002a:
            r2 = r10
        L_0x002b:
            r3 = r11 & 2
            if (r3 == 0) goto L_0x0032
            r2 = r2 | 48
            goto L_0x0045
        L_0x0032:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0045
            r4 = r19
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r2 = r2 | r5
            goto L_0x0047
        L_0x0045:
            r4 = r19
        L_0x0047:
            r5 = r11 & 4
            if (r5 == 0) goto L_0x004e
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r20
            boolean r7 = r0.mo5408I(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r2 = r2 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r20
        L_0x0063:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x007d
        L_0x006a:
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x007d
            r8 = r21
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r9
            goto L_0x007f
        L_0x007d:
            r8 = r21
        L_0x007f:
            r9 = r11 & 16
            if (r9 == 0) goto L_0x0086
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009b
        L_0x0086:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x009b
            r12 = r22
            boolean r13 = r0.mo5408I(r12)
            if (r13 == 0) goto L_0x0097
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r2 = r2 | r13
            goto L_0x009d
        L_0x009b:
            r12 = r22
        L_0x009d:
            r13 = r11 & 32
            if (r13 == 0) goto L_0x00a5
            r14 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r14
            goto L_0x00b9
        L_0x00a5:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00b9
            r14 = r23
            boolean r15 = r0.mo5408I(r14)
            if (r15 == 0) goto L_0x00b5
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r2 = r2 | r15
            goto L_0x00bb
        L_0x00b9:
            r14 = r23
        L_0x00bb:
            r15 = r11 & 64
            if (r15 == 0) goto L_0x00c6
            r16 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r16
            r1 = r24
            goto L_0x00db
        L_0x00c6:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r10 & r16
            r1 = r24
            if (r16 != 0) goto L_0x00db
            boolean r16 = r0.mo5408I(r1)
            if (r16 == 0) goto L_0x00d7
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r2 = r2 | r16
        L_0x00db:
            r1 = r11 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00e6
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r16
            r4 = r25
            goto L_0x00fb
        L_0x00e6:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            r4 = r25
            if (r16 != 0) goto L_0x00fb
            boolean r16 = r0.mo5408I(r4)
            if (r16 == 0) goto L_0x00f7
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f9
        L_0x00f7:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f9:
            r2 = r2 | r16
        L_0x00fb:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x0117
            r4 = r11 & 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0110
            r4 = r26
            boolean r16 = r0.mo5408I(r4)
            if (r16 == 0) goto L_0x0112
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0114
        L_0x0110:
            r4 = r26
        L_0x0112:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0114:
            r2 = r2 | r16
            goto L_0x0119
        L_0x0117:
            r4 = r26
        L_0x0119:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r4 = r2 & r16
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r6) goto L_0x013c
            boolean r4 = r0.mo5442i()
            if (r4 != 0) goto L_0x012a
            goto L_0x013c
        L_0x012a:
            r0.mo5396C()
            r2 = r19
            r3 = r20
            r7 = r24
            r9 = r26
            r4 = r8
            r5 = r12
            r6 = r14
            r8 = r25
            goto L_0x01d2
        L_0x013c:
            r0.mo5466u0()
            r4 = r10 & 1
            r6 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            if (r4 == 0) goto L_0x015e
            boolean r4 = r0.mo5425Y()
            if (r4 == 0) goto L_0x014d
            goto L_0x015e
        L_0x014d:
            r0.mo5396C()
            r1 = r11 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0155
            r2 = r2 & r6
        L_0x0155:
            r3 = r19
            r5 = r20
            r7 = r24
            r4 = r25
            goto L_0x018c
        L_0x015e:
            if (r3 == 0) goto L_0x0163
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0165
        L_0x0163:
            r3 = r19
        L_0x0165:
            r4 = 0
            if (r5 == 0) goto L_0x016a
            r5 = r4
            goto L_0x016c
        L_0x016a:
            r5 = r20
        L_0x016c:
            if (r7 == 0) goto L_0x016f
            r8 = r4
        L_0x016f:
            if (r9 == 0) goto L_0x0172
            r12 = r4
        L_0x0172:
            if (r13 == 0) goto L_0x0175
            r14 = r4
        L_0x0175:
            if (r15 == 0) goto L_0x0179
            r7 = r4
            goto L_0x017b
        L_0x0179:
            r7 = r24
        L_0x017b:
            if (r1 == 0) goto L_0x017e
            goto L_0x0180
        L_0x017e:
            r4 = r25
        L_0x0180:
            r1 = r11 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x018c
            androidx.compose.ui.window.b r1 = new androidx.compose.ui.window.b
            r9 = 0
            r1.<init>(r9)
            r2 = r2 & r6
            goto L_0x018e
        L_0x018c:
            r1 = r26
        L_0x018e:
            r0.mo5419S()
            r6 = -150423720(0xfffffffff708b758, float:-2.7729337E33)
            com.etsy.collagecompose.DialogKt$Dialog$1 r9 = new com.etsy.collagecompose.DialogKt$Dialog$1
            r19 = r9
            r20 = r3
            r21 = r2
            r22 = r5
            r23 = r8
            r24 = r7
            r25 = r4
            r26 = r12
            r27 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = p628nj.C18263b.m30805A(r0, r6, r9)
            r9 = r2 & 14
            r9 = r9 | 384(0x180, float:5.38E-43)
            int r2 = r2 >> 21
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r9
            r9 = 0
            r19 = r18
            r20 = r1
            r21 = r6
            r22 = r0
            r23 = r2
            r24 = r9
            androidx.compose.p015ui.window.AndroidDialog_androidKt.m4511a(r19, r20, r21, r22, r23, r24)
            r9 = r1
            r2 = r3
            r3 = r5
            r5 = r12
            r6 = r14
            r17 = r8
            r8 = r4
            r4 = r17
        L_0x01d2:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x01d9
            goto L_0x01e7
        L_0x01d9:
            com.etsy.collagecompose.DialogKt$Dialog$2 r13 = new com.etsy.collagecompose.DialogKt$Dialog$2
            r0 = r13
            r1 = r18
            r10 = r28
            r11 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.DialogKt.m19950a(kq.a, androidx.compose.ui.d, java.lang.String, java.lang.String, java.lang.String, kq.a, java.lang.String, kq.a, androidx.compose.ui.window.b, androidx.compose.runtime.d, int, int):void");
    }
}
