package com.etsy.collagecompose;

public final class AlertKt {

    /* renamed from: com.etsy.collagecompose.AlertKt$a */
    public /* synthetic */ class C12115a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27017a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f27018b;

        static {
            int[] iArr = new int[AlertType.values().length];
            iArr[AlertType.Error.ordinal()] = 1;
            iArr[AlertType.Info.ordinal()] = 2;
            iArr[AlertType.InfoSubtle.ordinal()] = 3;
            iArr[AlertType.News.ordinal()] = 4;
            iArr[AlertType.Success.ordinal()] = 5;
            iArr[AlertType.Warning.ordinal()] = 6;
            f27017a = iArr;
            int[] iArr2 = new int[AnchorDirection.values().length];
            iArr2[AnchorDirection.Bottom.ordinal()] = 1;
            iArr2[AnchorDirection.End.ordinal()] = 2;
            iArr2[AnchorDirection.Start.ordinal()] = 3;
            iArr2[AnchorDirection.Top.ordinal()] = 4;
            iArr2[AnchorDirection.None.ordinal()] = 5;
            f27018b = iArr2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0be4  */
    /* JADX WARNING: Removed duplicated region for block: B:417:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19937a(com.etsy.collagecompose.AlertType r46, java.lang.String r47, androidx.compose.p015ui.C1436d r48, com.etsy.collagecompose.C12122a.C12125c r49, com.etsy.collagecompose.C12122a.C12123a r50, com.etsy.collagecompose.C12122a.C12124b r51, p753kq.C19846a<kotlin.C19394m> r52, java.lang.String r53, java.lang.String r54, int r55, java.lang.String r56, boolean r57, boolean r58, com.etsy.collagecompose.AnchorDirection r59, float r60, boolean r61, boolean r62, androidx.compose.runtime.C1302d r63, int r64, int r65, int r66) {
        /*
            r1 = r46
            r0 = r47
            r4 = r64
            r5 = r65
            r2 = r66
            java.lang.String r3 = "type"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            java.lang.String r3 = "titleText"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            r3 = -2073096041(0xffffffff846f1097, float:-2.8101933E-36)
            r6 = r63
            androidx.compose.runtime.ComposerImpl r15 = r6.mo5440h(r3)
            r3 = r2 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r4 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r15.mo5408I(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r4
            goto L_0x0034
        L_0x0033:
            r3 = r4
        L_0x0034:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r6 = r4 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004b
            boolean r6 = r15.mo5408I(r0)
            if (r6 == 0) goto L_0x0048
            r6 = 32
            goto L_0x004a
        L_0x0048:
            r6 = 16
        L_0x004a:
            r3 = r3 | r6
        L_0x004b:
            r6 = r2 & 4
            if (r6 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0065
            r7 = r48
            boolean r8 = r15.mo5408I(r7)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r7 = r48
        L_0x0067:
            r8 = r2 & 8
            if (r8 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0081
            r11 = r49
            boolean r12 = r15.mo5408I(r11)
            if (r12 == 0) goto L_0x007d
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r12
            goto L_0x0083
        L_0x0081:
            r11 = r49
        L_0x0083:
            r12 = r2 & 16
            if (r12 == 0) goto L_0x008c
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r9 = r50
            goto L_0x00a2
        L_0x008c:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r4 & r16
            r9 = r50
            if (r16 != 0) goto L_0x00a2
            boolean r16 = r15.mo5408I(r9)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r3 = r3 | r16
        L_0x00a2:
            r16 = r2 & 32
            r17 = 65536(0x10000, float:9.18355E-41)
            if (r16 == 0) goto L_0x00af
            r18 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r18
            r10 = r51
            goto L_0x00c4
        L_0x00af:
            r18 = 458752(0x70000, float:6.42848E-40)
            r18 = r4 & r18
            r10 = r51
            if (r18 != 0) goto L_0x00c4
            boolean r19 = r15.mo5408I(r10)
            if (r19 == 0) goto L_0x00c0
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r19 = r17
        L_0x00c2:
            r3 = r3 | r19
        L_0x00c4:
            r19 = r2 & 64
            if (r19 == 0) goto L_0x00cf
            r20 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r20
            r13 = r52
            goto L_0x00e4
        L_0x00cf:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r4 & r20
            r13 = r52
            if (r20 != 0) goto L_0x00e4
            boolean r21 = r15.mo5408I(r13)
            if (r21 == 0) goto L_0x00e0
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r3 = r3 | r21
        L_0x00e4:
            r14 = r2 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x00ef
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r22
            r0 = r53
            goto L_0x0104
        L_0x00ef:
            r22 = 29360128(0x1c00000, float:7.052966E-38)
            r22 = r4 & r22
            r0 = r53
            if (r22 != 0) goto L_0x0104
            boolean r22 = r15.mo5408I(r0)
            if (r22 == 0) goto L_0x0100
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r3 = r3 | r22
        L_0x0104:
            r0 = r2 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x010f
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r22
            r1 = r54
            goto L_0x0124
        L_0x010f:
            r22 = 234881024(0xe000000, float:1.5777218E-30)
            r22 = r4 & r22
            r1 = r54
            if (r22 != 0) goto L_0x0124
            boolean r22 = r15.mo5408I(r1)
            if (r22 == 0) goto L_0x0120
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r3 = r3 | r22
        L_0x0124:
            r1 = r2 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x012f
            r22 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r22
            r4 = r55
            goto L_0x0144
        L_0x012f:
            r22 = 1879048192(0x70000000, float:1.58456325E29)
            r22 = r4 & r22
            r4 = r55
            if (r22 != 0) goto L_0x0144
            boolean r22 = r15.mo5432d(r4)
            if (r22 == 0) goto L_0x0140
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r3 = r3 | r22
        L_0x0144:
            r22 = r3
            r3 = r2 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x014f
            r23 = r5 | 6
            r4 = r56
            goto L_0x0165
        L_0x014f:
            r23 = r5 & 14
            r4 = r56
            if (r23 != 0) goto L_0x0163
            boolean r23 = r15.mo5408I(r4)
            if (r23 == 0) goto L_0x015e
            r23 = 4
            goto L_0x0160
        L_0x015e:
            r23 = 2
        L_0x0160:
            r23 = r5 | r23
            goto L_0x0165
        L_0x0163:
            r23 = r5
        L_0x0165:
            r4 = r2 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x016c
            r23 = r23 | 48
            goto L_0x017f
        L_0x016c:
            r24 = r5 & 112(0x70, float:1.57E-43)
            r7 = r57
            if (r24 != 0) goto L_0x017f
            boolean r24 = r15.mo5427a(r7)
            if (r24 == 0) goto L_0x017b
            r24 = 32
            goto L_0x017d
        L_0x017b:
            r24 = 16
        L_0x017d:
            r23 = r23 | r24
        L_0x017f:
            r7 = r23
            r9 = r2 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0188
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019c
        L_0x0188:
            r10 = r5 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x019c
            r10 = r58
            boolean r23 = r15.mo5427a(r10)
            if (r23 == 0) goto L_0x0197
            r23 = 256(0x100, float:3.59E-43)
            goto L_0x0199
        L_0x0197:
            r23 = 128(0x80, float:1.794E-43)
        L_0x0199:
            r7 = r7 | r23
            goto L_0x019e
        L_0x019c:
            r10 = r58
        L_0x019e:
            r10 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a5
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b9
        L_0x01a5:
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01b9
            r11 = r59
            boolean r23 = r15.mo5408I(r11)
            if (r23 == 0) goto L_0x01b4
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x01b6
        L_0x01b4:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x01b6:
            r7 = r7 | r18
            goto L_0x01bb
        L_0x01b9:
            r11 = r59
        L_0x01bb:
            r11 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c4
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r13 = r60
            goto L_0x01da
        L_0x01c4:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r5 & r18
            r13 = r60
            if (r18 != 0) goto L_0x01da
            boolean r18 = r15.mo5428b(r13)
            if (r18 == 0) goto L_0x01d6
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01d8
        L_0x01d6:
            r20 = 8192(0x2000, float:1.14794E-41)
        L_0x01d8:
            r7 = r7 | r20
        L_0x01da:
            r18 = 32768(0x8000, float:4.5918E-41)
            r18 = r2 & r18
            if (r18 == 0) goto L_0x01e8
            r20 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r20
            r13 = r61
            goto L_0x01fd
        L_0x01e8:
            r20 = 458752(0x70000, float:6.42848E-40)
            r20 = r5 & r20
            r13 = r61
            if (r20 != 0) goto L_0x01fd
            boolean r20 = r15.mo5427a(r13)
            if (r20 == 0) goto L_0x01f9
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01fb
        L_0x01f9:
            r20 = r17
        L_0x01fb:
            r7 = r7 | r20
        L_0x01fd:
            r17 = r2 & r17
            if (r17 == 0) goto L_0x0208
            r20 = 1572864(0x180000, float:2.204052E-39)
            r7 = r7 | r20
            r2 = r62
            goto L_0x021d
        L_0x0208:
            r20 = 3670016(0x380000, float:5.142788E-39)
            r20 = r5 & r20
            r2 = r62
            if (r20 != 0) goto L_0x021d
            boolean r20 = r15.mo5427a(r2)
            if (r20 == 0) goto L_0x0219
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021b
        L_0x0219:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x021b:
            r7 = r7 | r20
        L_0x021d:
            r20 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r22 & r20
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r5) goto L_0x025b
            r2 = 2995931(0x2db6db, float:4.198194E-39)
            r2 = r2 & r7
            r5 = 599186(0x92492, float:8.39638E-40)
            if (r2 != r5) goto L_0x025b
            boolean r2 = r15.mo5442i()
            if (r2 != 0) goto L_0x0237
            goto L_0x025b
        L_0x0237:
            r15.mo5396C()
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r11 = r56
            r12 = r57
            r14 = r59
            r17 = r62
            r16 = r13
            r2 = r15
            r13 = r58
            r15 = r60
            goto L_0x0bdd
        L_0x025b:
            if (r6 == 0) goto L_0x0261
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r5 = r2
            goto L_0x0263
        L_0x0261:
            r5 = r48
        L_0x0263:
            r23 = 0
            if (r8 == 0) goto L_0x026a
            r24 = r23
            goto L_0x026c
        L_0x026a:
            r24 = r49
        L_0x026c:
            if (r12 == 0) goto L_0x0271
            r25 = r23
            goto L_0x0273
        L_0x0271:
            r25 = r50
        L_0x0273:
            if (r16 == 0) goto L_0x0278
            r26 = r23
            goto L_0x027a
        L_0x0278:
            r26 = r51
        L_0x027a:
            if (r19 == 0) goto L_0x027f
            r27 = r23
            goto L_0x0281
        L_0x027f:
            r27 = r52
        L_0x0281:
            java.lang.String r2 = ""
            if (r14 == 0) goto L_0x0288
            r28 = r2
            goto L_0x028a
        L_0x0288:
            r28 = r53
        L_0x028a:
            if (r0 == 0) goto L_0x028e
            r0 = r2
            goto L_0x0290
        L_0x028e:
            r0 = r54
        L_0x0290:
            r6 = 0
            if (r1 == 0) goto L_0x0295
            r1 = r6
            goto L_0x0297
        L_0x0295:
            r1 = r55
        L_0x0297:
            if (r3 == 0) goto L_0x029a
            goto L_0x029c
        L_0x029a:
            r2 = r56
        L_0x029c:
            if (r4 == 0) goto L_0x02a1
            r29 = r6
            goto L_0x02a3
        L_0x02a1:
            r29 = r57
        L_0x02a3:
            if (r9 == 0) goto L_0x02a8
            r30 = r6
            goto L_0x02aa
        L_0x02a8:
            r30 = r58
        L_0x02aa:
            if (r10 == 0) goto L_0x02b0
            com.etsy.collagecompose.AnchorDirection r3 = com.etsy.collagecompose.AnchorDirection.None
            r4 = r3
            goto L_0x02b2
        L_0x02b0:
            r4 = r59
        L_0x02b2:
            r3 = 0
            if (r11 == 0) goto L_0x02b8
            r31 = r3
            goto L_0x02ba
        L_0x02b8:
            r31 = r60
        L_0x02ba:
            if (r18 == 0) goto L_0x02bf
            r32 = r6
            goto L_0x02c1
        L_0x02bf:
            r32 = r13
        L_0x02c1:
            if (r17 == 0) goto L_0x02c6
            r33 = r6
            goto L_0x02c8
        L_0x02c6:
            r33 = r62
        L_0x02c8:
            int[] r7 = com.etsy.collagecompose.AlertKt.C12115a.f27017a
            int r8 = r46.ordinal()
            r7 = r7[r8]
            switch(r7) {
                case 1: goto L_0x0340;
                case 2: goto L_0x032c;
                case 3: goto L_0x0318;
                case 4: goto L_0x0304;
                case 5: goto L_0x02f0;
                case 6: goto L_0x02dc;
                default: goto L_0x02d3;
            }
        L_0x02d3:
            r2 = r15
            r0 = -2126217690(0xffffffff81447e26, float:-3.6090022E-38)
            r2.mo5465u(r0)
            goto L_0x0c0f
        L_0x02dc:
            r7 = -2126211712(0xffffffff81449580, float:-3.6106775E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27134g0
            r15.mo5418R(r6)
            goto L_0x0353
        L_0x02f0:
            r7 = -2126211780(0xffffffff8144953c, float:-3.6106585E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27126c0
            r15.mo5418R(r6)
            goto L_0x0353
        L_0x0304:
            r7 = -2126211845(0xffffffff814494fb, float:-3.6106403E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27128d0
            r15.mo5418R(r6)
            goto L_0x0353
        L_0x0318:
            r7 = -2126211914(0xffffffff814494b6, float:-3.610621E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27132f0
            r15.mo5418R(r6)
            goto L_0x0353
        L_0x032c:
            r7 = -2126211982(0xffffffff81449472, float:-3.610602E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27130e0
            r15.mo5418R(r6)
            goto L_0x0353
        L_0x0340:
            r7 = -2126212045(0xffffffff81449433, float:-3.6105842E-38)
            r15.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r15.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r7 = r7.f27136h0
            r15.mo5418R(r6)
        L_0x0353:
            float r9 = p628nj.C18263b.m30843f0(r7)
            double r9 = (double) r9
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0362
            r9 = 1
            r34 = r9
            goto L_0x0364
        L_0x0362:
            r34 = r6
        L_0x0364:
            r9 = -2126211510(0xffffffff8144964a, float:-3.6107342E-38)
            r15.mo5465u(r9)
            if (r1 == 0) goto L_0x0371
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto L_0x03b2
        L_0x0371:
            int r9 = r2.length()
            if (r9 <= 0) goto L_0x0379
            r9 = 1
            goto L_0x037a
        L_0x0379:
            r9 = r6
        L_0x037a:
            if (r9 == 0) goto L_0x03b0
            androidx.compose.runtime.l1 r9 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3987b
            java.lang.Object r9 = r15.mo5410J(r9)
            android.content.Context r9 = (android.content.Context) r9
            android.content.res.Resources r10 = r9.getResources()
            java.lang.String r11 = "drawable"
            java.lang.String r9 = r9.getPackageName()     // Catch:{ NotFoundException -> 0x03b0 }
            int r9 = r10.getIdentifier(r2, r11, r9)     // Catch:{ NotFoundException -> 0x03b0 }
            if (r9 != 0) goto L_0x03ab
            java.lang.String r9 = "Collage"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NotFoundException -> 0x03b0 }
            r10.<init>()     // Catch:{ NotFoundException -> 0x03b0 }
            java.lang.String r11 = "Tried to look up unsupported icon name "
            r10.append(r11)     // Catch:{ NotFoundException -> 0x03b0 }
            r10.append(r2)     // Catch:{ NotFoundException -> 0x03b0 }
            java.lang.String r10 = r10.toString()     // Catch:{ NotFoundException -> 0x03b0 }
            android.util.Log.w(r9, r10)     // Catch:{ NotFoundException -> 0x03b0 }
            goto L_0x03b0
        L_0x03ab:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NotFoundException -> 0x03b0 }
            goto L_0x03b2
        L_0x03b0:
            r9 = r23
        L_0x03b2:
            r15.mo5418R(r6)
            if (r34 == 0) goto L_0x03cb
            r10 = -2126210599(0xffffffff814499d9, float:-3.6109895E-38)
            r15.mo5465u(r10)
            androidx.compose.runtime.l1 r10 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r10 = r15.mo5410J(r10)
            com.etsy.collagecompose.i r10 = (com.etsy.collagecompose.C12158i) r10
            long r10 = r10.f27125c
            r15.mo5418R(r6)
            goto L_0x03de
        L_0x03cb:
            r10 = -2126210531(0xffffffff81449a1d, float:-3.6110085E-38)
            r15.mo5465u(r10)
            androidx.compose.runtime.l1 r10 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r10 = r15.mo5410J(r10)
            com.etsy.collagecompose.i r10 = (com.etsy.collagecompose.C12158i) r10
            long r10 = r10.f27123b
            r15.mo5418R(r6)
        L_0x03de:
            r35 = r10
            r10 = -2126210445(0xffffffff81449a73, float:-3.6110326E-38)
            r15.mo5465u(r10)
            if (r29 == 0) goto L_0x03eb
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x03fc
        L_0x03eb:
            androidx.compose.ui.d$a r10 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.runtime.l1 r11 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r11 = r15.mo5410J(r11)
            com.etsy.collagecompose.j r11 = (com.etsy.collagecompose.C12159j) r11
            float r11 = r11.f27177e
            r12 = 2
            androidx.compose.ui.d r3 = com.google.android.play.core.assetpacks.C15588c1.m25283H0(r10, r11, r3, r12)
        L_0x03fc:
            r15.mo5418R(r6)
            if (r29 == 0) goto L_0x0415
            r10 = -2126210283(0xffffffff81449b15, float:-3.611078E-38)
            r15.mo5465u(r10)
            androidx.compose.runtime.l1 r10 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r10 = r15.mo5410J(r10)
            com.etsy.collagecompose.j r10 = (com.etsy.collagecompose.C12159j) r10
            float r10 = r10.f27179g
            r15.mo5418R(r6)
            goto L_0x0428
        L_0x0415:
            r10 = -2126210238(0xffffffff81449b42, float:-3.6110907E-38)
            r15.mo5465u(r10)
            androidx.compose.runtime.l1 r10 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r10 = r15.mo5410J(r10)
            com.etsy.collagecompose.j r10 = (com.etsy.collagecompose.C12159j) r10
            float r10 = r10.f27178f
            r15.mo5418R(r6)
        L_0x0428:
            com.etsy.collagecompose.j r11 = p001a0.C0005b.m36d0(r15)
            float r11 = r11.f27179g
            r12 = -2126210115(0xffffffff81449bbd, float:-3.611125E-38)
            r15.mo5465u(r12)
            if (r26 == 0) goto L_0x043d
            com.etsy.collagecompose.j r12 = p001a0.C0005b.m36d0(r15)
            float r12 = r12.f27176d
            goto L_0x043e
        L_0x043d:
            r12 = r11
        L_0x043e:
            r15.mo5418R(r6)
            r13 = -2126209910(0xffffffff81449c8a, float:-3.6111826E-38)
            r15.mo5465u(r13)
            if (r9 == 0) goto L_0x044f
            com.etsy.collagecompose.j r11 = p001a0.C0005b.m36d0(r15)
            float r11 = r11.f27178f
        L_0x044f:
            r15.mo5418R(r6)
            com.etsy.collagecompose.j r6 = p001a0.C0005b.m36d0(r15)
            float r6 = r6.f27180h
            com.etsy.collagecompose.j r13 = p001a0.C0005b.m36d0(r15)
            float r13 = r13.f27178f
            com.etsy.collagecompose.AnchorDirection r14 = com.etsy.collagecompose.AnchorDirection.None
            if (r4 != r14) goto L_0x047e
            r6 = -2126209546(0xffffffff81449df6, float:-3.6112846E-38)
            r15.mo5465u(r6)
            if (r29 == 0) goto L_0x046d
            androidx.compose.ui.graphics.e0$a r6 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            goto L_0x0477
        L_0x046d:
            com.etsy.collagecompose.j r6 = p001a0.C0005b.m36d0(r15)
            float r6 = r6.f27194v
            p.f r6 = p202p.C7645g.m14661a(r6)
        L_0x0477:
            r14 = 0
            r15.mo5418R(r14)
            r63 = r1
            goto L_0x04bf
        L_0x047e:
            r14 = -2126209391(0xffffffff81449e91, float:-3.611328E-38)
            r15.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r14 = r15.mo5410J(r14)
            m0.b r14 = (p174m0.C7282b) r14
            if (r29 == 0) goto L_0x0493
            r16 = 0
            r63 = r1
            goto L_0x04a1
        L_0x0493:
            r63 = r1
            com.etsy.collagecompose.j r1 = p001a0.C0005b.m36d0(r15)
            float r1 = r1.f27194v
            float r1 = r14.mo3789B0(r1)
            r16 = r1
        L_0x04a1:
            com.etsy.collagecompose.o r1 = new com.etsy.collagecompose.o
            float r6 = r14.mo3789B0(r6)
            float r14 = r14.mo3789B0(r13)
            r48 = r1
            r49 = r4
            r50 = r16
            r51 = r6
            r52 = r14
            r53 = r31
            r48.<init>(r49, r50, r51, r52, r53)
            r6 = 0
            r15.mo5418R(r6)
            r6 = r1
        L_0x04bf:
            r1 = -2126208750(0xffffffff8144a112, float:-3.6115077E-38)
            r15.mo5465u(r1)
            if (r32 == 0) goto L_0x04d8
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            com.etsy.collagecompose.j r14 = p001a0.C0005b.m36d0(r15)
            float r14 = r14.f27182j
            r16 = r2
            r2 = 28
            androidx.compose.ui.d r1 = androidx.compose.p015ui.draw.C1448j.m3094a(r1, r14, r6, r2)
            goto L_0x04dc
        L_0x04d8:
            r16 = r2
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x04dc:
            r2 = 0
            r15.mo5418R(r2)
            if (r33 != 0) goto L_0x04e9
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1487g(r2)
            goto L_0x04eb
        L_0x04e9:
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x04eb:
            androidx.compose.ui.d r2 = r5.mo6148i0(r2)
            androidx.compose.ui.d r2 = r2.mo6148i0(r3)
            androidx.compose.ui.d r1 = r2.mo6148i0(r1)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.C0761x.m1655A(r1, r7, r6)
            if (r27 == 0) goto L_0x0559
            r2 = -2126208138(0xffffffff8144a376, float:-3.6116792E-38)
            r15.mo5465u(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo5465u(r3)
            java.lang.Object r3 = r15.mo5431c0()
            androidx.compose.runtime.d$a$a r7 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r7) goto L_0x0517
            androidx.compose.foundation.interaction.k r3 = android.support.p013v4.media.C0072d.m198e(r15)
        L_0x0517:
            r7 = 0
            r15.mo5418R(r7)
            androidx.compose.foundation.interaction.j r3 = (androidx.compose.foundation.interaction.C0640j) r3
            r8 = 0
            r14 = 0
            r17 = 3
            r48 = r7
            r49 = r8
            r50 = r35
            r52 = r15
            r53 = r14
            r54 = r17
            androidx.compose.material.ripple.c r7 = androidx.compose.material.ripple.C1244j.m2369a(r48, r49, r50, r52, r53, r54)
            androidx.compose.ui.semantics.g r8 = new androidx.compose.ui.semantics.g
            r8.<init>(r14)
            r14 = 12
            r17 = 0
            r18 = 0
            r48 = r2
            r49 = r3
            r50 = r7
            r51 = r17
            r52 = r18
            r53 = r8
            r54 = r27
            r55 = r14
            androidx.compose.ui.d r2 = androidx.compose.foundation.ClickableKt.m1297c(r48, r49, r50, r51, r52, r53, r54, r55)
            androidx.compose.ui.d r2 = kotlinx.coroutines.C19543e0.m33286B(r2, r6)
            r3 = 0
            r15.mo5418R(r3)
            goto L_0x0599
        L_0x0559:
            r2 = -2126207705(0xffffffff8144a527, float:-3.6118005E-38)
            r15.mo5465u(r2)
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.mo5465u(r3)
            java.lang.Object r3 = r15.mo5431c0()
            androidx.compose.runtime.d$a$a r6 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r6) goto L_0x0573
            androidx.compose.foundation.interaction.k r3 = android.support.p013v4.media.C0072d.m198e(r15)
        L_0x0573:
            r6 = 0
            r15.mo5418R(r6)
            androidx.compose.foundation.interaction.j r3 = (androidx.compose.foundation.interaction.C0640j) r3
            r6 = 0
            r7 = 0
            r8 = 0
            r14 = 0
            com.etsy.collagecompose.AlertKt$Alert$3 r17 = com.etsy.collagecompose.AlertKt$Alert$3.INSTANCE
            r18 = 24
            r48 = r2
            r49 = r3
            r50 = r6
            r51 = r7
            r52 = r8
            r53 = r14
            r54 = r17
            r55 = r18
            androidx.compose.ui.d r2 = androidx.compose.foundation.ClickableKt.m1297c(r48, r49, r50, r51, r52, r53, r54, r55)
            r3 = 0
            r15.mo5418R(r3)
        L_0x0599:
            androidx.compose.ui.d r1 = r1.mo6148i0(r2)
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25285I0(r1, r11, r10, r12, r10)
            int[] r2 = com.etsy.collagecompose.AlertKt.C12115a.f27018b
            int r3 = r4.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x060a
            r3 = 2
            if (r2 == r3) goto L_0x05f2
            r3 = 3
            if (r2 == r3) goto L_0x05da
            r3 = 4
            if (r2 == r3) goto L_0x05c2
            r3 = 5
            if (r2 != r3) goto L_0x05bc
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0620
        L_0x05bc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c2:
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 13
            r48 = r2
            r49 = r3
            r50 = r13
            r51 = r6
            r52 = r7
            r53 = r8
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            goto L_0x0620
        L_0x05da:
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 14
            r48 = r2
            r49 = r13
            r50 = r3
            r51 = r6
            r52 = r7
            r53 = r8
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            goto L_0x0620
        L_0x05f2:
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 11
            r48 = r2
            r49 = r3
            r50 = r6
            r51 = r13
            r52 = r7
            r53 = r8
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            goto L_0x0620
        L_0x060a:
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r48 = r2
            r49 = r3
            r50 = r6
            r51 = r7
            r52 = r13
            r53 = r8
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
        L_0x0620:
            androidx.compose.ui.d r1 = r1.mo6148i0(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25307T0(r1, r2)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo5465u(r2)
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r3 = 0
            androidx.compose.ui.layout.v r3 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r3, r15)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r7 = r15.mo5410J(r6)
            m0.b r7 = (p174m0.C7282b) r7
            androidx.compose.runtime.l1 r8 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r10 = r15.mo5410J(r8)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p015ui.unit.LayoutDirection) r10
            androidx.compose.runtime.l1 r11 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r12 = r15.mo5410J(r11)
            androidx.compose.ui.platform.j1 r12 = (androidx.compose.p015ui.platform.C1843j1) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r13.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r14 = r15.f2715a
            boolean r14 = r14 instanceof androidx.compose.runtime.C1299c
            if (r14 == 0) goto L_0x0c0b
            r15.mo5392A()
            boolean r14 = r15.f2702K
            if (r14 == 0) goto L_0x0671
            r15.mo5450m(r13)
            goto L_0x0674
        L_0x0671:
            r15.mo5452n()
        L_0x0674:
            r14 = 0
            r15.f2738x = r14
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r14 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r15, r3, r14)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r15, r7, r3)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r15, r10, r7)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r12 = p504ai.C13983i.m21490i(r15, r12, r10, r15)
            r17 = 0
            r18 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r19 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r48 = r17
            r49 = r1
            r50 = r12
            r51 = r15
            r52 = r18
            r53 = r19
            androidx.appcompat.widget.C0326j.m868m(r48, r49, r50, r51, r52, r53)
            r1 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo5465u(r1)
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.layout.d$i r12 = androidx.compose.foundation.layout.C0718d.f1476a
            r17 = r4
            androidx.compose.ui.b$b r4 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            androidx.compose.ui.layout.v r18 = androidx.compose.foundation.layout.RowKt.m1480a(r12, r4, r15)
            r61 = r4
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r4)
            java.lang.Object r4 = r15.mo5410J(r6)
            m0.b r4 = (p174m0.C7282b) r4
            java.lang.Object r19 = r15.mo5410J(r8)
            androidx.compose.ui.unit.LayoutDirection r19 = (androidx.compose.p015ui.unit.LayoutDirection) r19
            java.lang.Object r20 = r15.mo5410J(r11)
            androidx.compose.ui.platform.j1 r20 = (androidx.compose.p015ui.platform.C1843j1) r20
            androidx.compose.runtime.internal.ComposableLambdaImpl r21 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            r37 = r5
            androidx.compose.runtime.c<?> r5 = r15.f2715a
            boolean r5 = r5 instanceof androidx.compose.runtime.C1299c
            if (r5 == 0) goto L_0x0c07
            r15.mo5392A()
            boolean r5 = r15.f2702K
            if (r5 == 0) goto L_0x06e6
            r15.mo5450m(r13)
            goto L_0x06e9
        L_0x06e6:
            r15.mo5452n()
        L_0x06e9:
            r5 = 0
            r15.f2738x = r5
            r48 = r15
            r49 = r18
            r50 = r14
            r51 = r15
            r52 = r4
            r53 = r3
            r54 = r15
            r55 = r19
            r56 = r7
            r57 = r15
            r58 = r20
            r59 = r10
            r60 = r15
            androidx.compose.runtime.a1 r4 = p003a2.C0023f.m106g(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r18 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r19 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r48 = r5
            r49 = r21
            r50 = r4
            r52 = r18
            r53 = r19
            androidx.appcompat.widget.C0326j.m868m(r48, r49, r50, r51, r52, r53)
            androidx.compose.foundation.layout.a0 r4 = androidx.compose.foundation.layout.C0708a0.f1463a
            r5 = 1524973491(0x5ae53fb3, float:3.22639038E16)
            r15.mo5465u(r5)
            if (r9 == 0) goto L_0x0853
            com.etsy.collagecompose.i r5 = p001a0.C0005b.m35c0(r15)
            r62 = r4
            long r4 = r5.f27150o0
            r18 = r12
            p.f r12 = p202p.C7645g.f16941a
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.C0761x.m1655A(r1, r4, r12)
            com.etsy.collagecompose.j r5 = p001a0.C0005b.m36d0(r15)
            r5.getClass()
            float r5 = com.etsy.collagecompose.C12159j.m19966f(r15)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.SizeKt.m1492l(r4, r5)
            java.lang.String r5 = "IconBox"
            androidx.compose.ui.d r4 = androidx.compose.p015ui.platform.TestTagKt.m3948a(r4, r5)
            r5 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo5465u(r5)
            r5 = 0
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r5, r15)
            r5 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r5)
            java.lang.Object r5 = r15.mo5410J(r6)
            m0.b r5 = (p174m0.C7282b) r5
            java.lang.Object r12 = r15.mo5410J(r8)
            androidx.compose.ui.unit.LayoutDirection r12 = (androidx.compose.p015ui.unit.LayoutDirection) r12
            java.lang.Object r19 = r15.mo5410J(r11)
            androidx.compose.ui.platform.j1 r19 = (androidx.compose.p015ui.platform.C1843j1) r19
            androidx.compose.runtime.internal.ComposableLambdaImpl r4 = androidx.compose.p015ui.layout.C1700o.m3617a(r4)
            r38 = r0
            androidx.compose.runtime.c<?> r0 = r15.f2715a
            boolean r0 = r0 instanceof androidx.compose.runtime.C1299c
            if (r0 == 0) goto L_0x084f
            r15.mo5392A()
            boolean r0 = r15.f2702K
            if (r0 == 0) goto L_0x0786
            r15.mo5450m(r13)
            goto L_0x0789
        L_0x0786:
            r15.mo5452n()
        L_0x0789:
            r0 = 0
            r15.f2738x = r0
            r48 = r15
            r49 = r2
            r50 = r14
            r51 = r15
            r52 = r5
            r53 = r3
            r54 = r15
            r55 = r12
            r56 = r7
            r57 = r15
            r58 = r19
            r59 = r10
            r60 = r15
            androidx.compose.runtime.a1 r0 = p003a2.C0023f.m106g(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            r2 = 0
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r12 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r48 = r2
            r49 = r4
            r50 = r0
            r52 = r5
            r53 = r12
            androidx.appcompat.widget.C0326j.m868m(r48, r49, r50, r51, r52, r53)
            int r0 = r9.intValue()
            androidx.compose.ui.graphics.painter.Painter r0 = kotlin.jvm.internal.C19388s.m32878p0(r0, r15)
            com.etsy.collagecompose.i r2 = p001a0.C0005b.m35c0(r15)
            long r4 = r2.f27152p0
            r2 = 5
            int r9 = android.os.Build.VERSION.SDK_INT
            r12 = 29
            if (r9 < r12) goto L_0x07da
            androidx.compose.ui.graphics.k r9 = androidx.compose.p015ui.graphics.C1529k.f3326a
            android.graphics.BlendModeColorFilter r2 = r9.mo6367a(r4, r2)
            goto L_0x07e8
        L_0x07da:
            android.graphics.PorterDuffColorFilter r9 = new android.graphics.PorterDuffColorFilter
            int r4 = p628nj.C18263b.m30859o0(r4)
            android.graphics.PorterDuff$Mode r2 = androidx.compose.p015ui.graphics.C1489a.m3160b(r2)
            r9.<init>(r4, r2)
            r2 = r9
        L_0x07e8:
            androidx.compose.ui.graphics.t r4 = new androidx.compose.ui.graphics.t
            r4.<init>(r2)
            com.etsy.collagecompose.j r2 = p001a0.C0005b.m36d0(r15)
            r2.getClass()
            float r2 = com.etsy.collagecompose.C12159j.m19965e(r15)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1492l(r1, r2)
            androidx.compose.ui.b r5 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            java.lang.String r9 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r2, r9)
            androidx.compose.foundation.layout.e r9 = new androidx.compose.foundation.layout.e
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r12 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r12 = 0
            r9.<init>(r5, r12)
            androidx.compose.ui.d r2 = r2.mo6148i0(r9)
            r5 = 0
            r9 = 0
            r12 = 0
            r19 = 0
            r20 = 56
            r21 = 56
            r48 = r0
            r49 = r5
            r50 = r2
            r51 = r9
            r52 = r12
            r53 = r19
            r54 = r4
            r55 = r15
            r56 = r20
            r57 = r21
            androidx.compose.foundation.ImageKt.m1308a(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r15.mo5406H()
            r15.mo5406H()
            r15.mo5456p()
            r15.mo5406H()
            r15.mo5406H()
            com.etsy.collagecompose.j r0 = p001a0.C0005b.m36d0(r15)
            float r0 = r0.mo39062a()
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1492l(r1, r0)
            r2 = 0
            com.google.android.play.core.assetpacks.C15588c1.m25324f(r0, r15, r2)
            goto L_0x085a
        L_0x084f:
            p001a0.C0005b.m45j0()
            throw r23
        L_0x0853:
            r38 = r0
            r62 = r4
            r18 = r12
            r2 = 0
        L_0x085a:
            r15.mo5418R(r2)
            r0 = r62
            androidx.compose.ui.d r4 = r0.mo4074b(r1)
            if (r33 == 0) goto L_0x086b
            androidx.compose.ui.d r0 = r0.mo4073a(r1, r2)
            r2 = 1
            goto L_0x0870
        L_0x086b:
            r2 = 1
            androidx.compose.ui.d r0 = r0.mo4073a(r1, r2)
        L_0x0870:
            r21 = r2
            androidx.compose.ui.d r0 = r4.mo6148i0(r0)
            r2 = -483455358(0xffffffffe32f0e82, float:-3.2292256E21)
            r15.mo5465u(r2)
            androidx.compose.foundation.layout.d$j r2 = androidx.compose.foundation.layout.C0718d.f1478c
            androidx.compose.ui.b$a r4 = androidx.compose.p015ui.C1428a.C1429a.f3116l
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.ColumnKt.m1461a(r2, r4, r15)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r4)
            java.lang.Object r4 = r15.mo5410J(r6)
            m0.b r4 = (p174m0.C7282b) r4
            java.lang.Object r5 = r15.mo5410J(r8)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p015ui.unit.LayoutDirection) r5
            java.lang.Object r6 = r15.mo5410J(r11)
            androidx.compose.ui.platform.j1 r6 = (androidx.compose.p015ui.platform.C1843j1) r6
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c<?> r8 = r15.f2715a
            boolean r8 = r8 instanceof androidx.compose.runtime.C1299c
            if (r8 == 0) goto L_0x0c03
            r15.mo5392A()
            boolean r8 = r15.f2702K
            if (r8 == 0) goto L_0x08b1
            r15.mo5450m(r13)
            goto L_0x08b4
        L_0x08b1:
            r15.mo5452n()
        L_0x08b4:
            r8 = 0
            r15.f2738x = r8
            androidx.compose.runtime.Updater.m2571b(r15, r2, r14)
            androidx.compose.runtime.Updater.m2571b(r15, r4, r3)
            androidx.compose.runtime.Updater.m2571b(r15, r5, r7)
            androidx.compose.runtime.Updater.m2571b(r15, r6, r10)
            r15.mo5430c()
            androidx.compose.runtime.a1 r2 = androidx.compose.runtime.C1295a1.m2576a(r15)
            r39 = 0
            r3 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r4 = -1163856341(0xffffffffbaa0f62b, float:-0.0012280395)
            r48 = r39
            r49 = r0
            r50 = r2
            r51 = r15
            r52 = r3
            r53 = r4
            androidx.appcompat.widget.C0326j.m868m(r48, r49, r50, r51, r52, r53)
            r0 = -1290227171(0xffffffffb318b21d, float:-3.555225E-8)
            r15.mo5465u(r0)
            int r0 = r38.length()
            if (r0 <= 0) goto L_0x08f0
            r0 = r21
            goto L_0x08f2
        L_0x08f0:
            r0 = r39
        L_0x08f2:
            if (r0 == 0) goto L_0x092c
            com.etsy.collagecompose.BadgeStyle r0 = com.etsy.collagecompose.BadgeStyle.Tertiary
            r2 = 0
            r3 = 0
            r4 = 0
            com.etsy.collagecompose.j r5 = p001a0.C0005b.m36d0(r15)
            float r5 = r5.mo39065d()
            r6 = 7
            r48 = r1
            r49 = r2
            r50 = r3
            r51 = r4
            r52 = r5
            r53 = r6
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            r3 = 0
            int r4 = r22 >> 24
            r4 = r4 & 14
            r4 = r4 | 48
            r5 = 8
            r48 = r38
            r49 = r0
            r50 = r2
            r51 = r3
            r52 = r15
            r53 = r4
            r54 = r5
            com.etsy.collagecompose.BadgeKt.m19938a(r48, r49, r50, r51, r52, r53, r54)
        L_0x092c:
            r15.mo5406H()
            if (r30 == 0) goto L_0x0943
            r0 = -1290226789(0xffffffffb318b39b, float:-3.5553608E-8)
            r15.mo5465u(r0)
            com.etsy.collagecompose.k r0 = p001a0.C0005b.m41h0(r15)
            androidx.compose.ui.text.s r0 = r0.mo39067b()
            r15.mo5406H()
            goto L_0x0954
        L_0x0943:
            r0 = -1290226702(0xffffffffb318b3f2, float:-3.5553917E-8)
            r15.mo5465u(r0)
            com.etsy.collagecompose.k r0 = p001a0.C0005b.m41h0(r15)
            androidx.compose.ui.text.s r0 = r0.mo39068c()
            r15.mo5406H()
        L_0x0954:
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r10 = r11
            r12 = 0
            r13 = r12
            r14 = r12
            r4 = r18
            r2 = 0
            r5 = r15
            r15 = r2
            int r2 = r22 >> 3
            r18 = r2 & 14
            r19 = 0
            r20 = 4090(0xffa, float:5.731E-42)
            r40 = r16
            r2 = r47
            r43 = r61
            r42 = r4
            r60 = r5
            r41 = r37
            r37 = r17
            r4 = r35
            r16 = r0
            r17 = r60
            com.etsy.collagecompose.TextKt.m19958a(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = -1290226540(0xffffffffb318b494, float:-3.5554493E-8)
            r2 = r60
            r2.mo5465u(r0)
            int r0 = r28.length()
            if (r0 <= 0) goto L_0x0991
            goto L_0x0993
        L_0x0991:
            r21 = r39
        L_0x0993:
            if (r21 == 0) goto L_0x09d7
            com.etsy.collagecompose.k r0 = p001a0.C0005b.m41h0(r2)
            androidx.compose.ui.text.s r18 = r0.mo39066a()
            r0 = 0
            com.etsy.collagecompose.j r3 = p001a0.C0005b.m36d0(r2)
            float r3 = r3.mo39064c()
            r4 = 0
            r5 = 0
            r6 = 13
            r48 = r1
            r49 = r0
            r50 = r3
            r51 = r4
            r52 = r5
            r53 = r6
            androidx.compose.ui.d r5 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            int r0 = r22 >> 21
            r20 = r0 & 14
            r21 = 0
            r22 = 4088(0xff8, float:5.729E-42)
            r4 = r28
            r6 = r35
            r19 = r2
            com.etsy.collagecompose.TextKt.m19958a(r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x09d7:
            r2.mo5406H()
            r0 = 1524975953(0x5ae54951, float:3.2269191E16)
            r2.mo5465u(r0)
            if (r24 != 0) goto L_0x09e4
            if (r25 == 0) goto L_0x0b38
        L_0x09e4:
            androidx.compose.ui.b$a r0 = androidx.compose.p015ui.C1428a.C1429a.f3118n
            androidx.compose.foundation.layout.o r3 = new androidx.compose.foundation.layout.o
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r4 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r3.<init>(r0)
            r1.mo6148i0(r3)
            r0 = 0
            com.etsy.collagecompose.j r4 = p001a0.C0005b.m36d0(r2)
            float r4 = r4.mo39063b()
            r5 = 0
            r6 = 0
            r7 = 13
            r48 = r3
            r49 = r0
            r50 = r4
            r51 = r5
            r52 = r6
            r53 = r7
            androidx.compose.ui.d r0 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r2.mo5465u(r3)
            r3 = r42
            r4 = r43
            androidx.compose.ui.layout.v r3 = androidx.compose.foundation.layout.RowKt.m1480a(r3, r4, r2)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r2.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.m3941c()
            java.lang.Object r4 = r2.mo5410J(r4)
            m0.b r4 = (p174m0.C7282b) r4
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.m3942d()
            java.lang.Object r5 = r2.mo5410J(r5)
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p015ui.unit.LayoutDirection) r5
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.m3943e()
            java.lang.Object r6 = r2.mo5410J(r6)
            androidx.compose.ui.platform.j1 r6 = (androidx.compose.p015ui.platform.C1843j1) r6
            kq.a r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.m3660a()
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c r8 = r2.mo5446k()
            boolean r8 = r8 instanceof androidx.compose.runtime.C1299c
            if (r8 == 0) goto L_0x0bff
            r2.mo5392A()
            boolean r8 = r2.mo5436f()
            if (r8 == 0) goto L_0x0a5c
            r2.mo5450m(r7)
            goto L_0x0a5f
        L_0x0a5c:
            r2.mo5452n()
        L_0x0a5f:
            r2.mo5394B()
            kq.p r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.m3663d()
            androidx.compose.runtime.Updater.m2571b(r2, r3, r7)
            kq.p r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.m3661b()
            androidx.compose.runtime.Updater.m2571b(r2, r4, r3)
            kq.p r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.m3662c()
            androidx.compose.runtime.Updater.m2571b(r2, r5, r3)
            kq.p r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.m3664e()
            androidx.compose.runtime.Updater.m2571b(r2, r6, r3)
            r2.mo5430c()
            androidx.compose.runtime.a1 r3 = androidx.compose.runtime.C1295a1.m2576a(r2)
            r4 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r48 = r39
            r49 = r0
            r50 = r3
            r51 = r2
            r52 = r4
            r53 = r5
            androidx.appcompat.widget.C0326j.m868m(r48, r49, r50, r51, r52, r53)
            r0 = -1645135303(0xffffffff9df13a39, float:-6.385237E-21)
            r2.mo5465u(r0)
            if (r25 != 0) goto L_0x0aa3
            goto L_0x0ad5
        L_0x0aa3:
            java.lang.String r0 = r25.mo39055b()
            com.etsy.collagecompose.e$d r3 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            com.etsy.collagecompose.d$b r4 = com.etsy.collagecompose.C12142d.C12144b.f27082a
            kq.a r5 = r25.mo39054a()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 196614(0x30006, float:2.75515E-40)
            r11 = 212(0xd4, float:2.97E-43)
            r48 = r3
            r49 = r5
            r50 = r6
            r51 = r0
            r52 = r7
            r53 = r4
            r54 = r8
            r55 = r9
            r56 = r34
            r57 = r2
            r58 = r10
            r59 = r11
            com.etsy.collagecompose.ButtonKt.m19939a(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0ad5:
            r2.mo5406H()
            if (r24 != 0) goto L_0x0adb
            goto L_0x0b29
        L_0x0adb:
            java.lang.String r0 = r24.mo39058b()
            com.etsy.collagecompose.e$a r3 = com.etsy.collagecompose.C12145e.C12146a.f27083a
            com.etsy.collagecompose.d$b r4 = com.etsy.collagecompose.C12142d.C12144b.f27082a
            kq.a r5 = r24.mo39057a()
            com.etsy.collagecompose.j r6 = p001a0.C0005b.m36d0(r2)
            float r6 = r6.mo39065d()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r48 = r1
            r49 = r6
            r50 = r7
            r51 = r8
            r52 = r9
            r53 = r10
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r48, r49, r50, r51, r52, r53)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 196614(0x30006, float:2.75515E-40)
            r10 = 208(0xd0, float:2.91E-43)
            r48 = r3
            r49 = r5
            r50 = r1
            r51 = r0
            r52 = r6
            r53 = r4
            r54 = r7
            r55 = r8
            r56 = r34
            r57 = r2
            r58 = r9
            r59 = r10
            com.etsy.collagecompose.ButtonKt.m19939a(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0b29:
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5456p()
            r2.mo5406H()
            r2.mo5406H()
        L_0x0b38:
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5456p()
            r2.mo5406H()
            r2.mo5406H()
            if (r26 != 0) goto L_0x0b4d
            goto L_0x0ba1
        L_0x0b4d:
            com.etsy.collagecompose.e$e r0 = com.etsy.collagecompose.C12145e.C12150e.f27087a
            com.etsy.collagecompose.d$b r1 = com.etsy.collagecompose.C12142d.C12144b.f27082a
            r3 = 2131231354(0x7f08027a, float:1.8078787E38)
            kq.a r4 = r26.mo39056a()
            r5 = 1524977564(0x5ae54f9c, float:3.22726506E16)
            r2.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.InspectionModeKt.m3946a()
            java.lang.Object r5 = r2.mo5410J(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0b71
            java.lang.String r5 = "Dismiss"
            goto L_0x0b75
        L_0x0b71:
            java.lang.String r5 = androidx.compose.p015ui.text.input.C1993m.m4351L(r2)
        L_0x0b75:
            r2.mo5406H()
            r6 = 0
            r7 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8 = 0
            r9 = 196614(0x30006, float:2.75515E-40)
            r10 = 140(0x8c, float:1.96E-43)
            r48 = r0
            r49 = r4
            r50 = r6
            r51 = r7
            r52 = r5
            r53 = r1
            r54 = r3
            r55 = r8
            r56 = r34
            r57 = r2
            r58 = r9
            r59 = r10
            com.etsy.collagecompose.ButtonKt.m19939a(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            kotlin.m r0 = kotlin.C19394m.f43287a
        L_0x0ba1:
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5456p()
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5406H()
            r2.mo5456p()
            r2.mo5406H()
            r2.mo5406H()
            r10 = r63
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r12 = r29
            r13 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r14 = r37
            r9 = r38
            r11 = r40
            r3 = r41
        L_0x0bdd:
            androidx.compose.runtime.v0 r2 = r2.mo5421U()
            if (r2 != 0) goto L_0x0be4
            goto L_0x0bfe
        L_0x0be4:
            com.etsy.collagecompose.AlertKt$Alert$5 r1 = new com.etsy.collagecompose.AlertKt$Alert$5
            r0 = r1
            r44 = r1
            r1 = r46
            r45 = r2
            r2 = r47
            r18 = r64
            r19 = r65
            r20 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r44
            r0 = r45
            r0.f3081d = r1
        L_0x0bfe:
            return
        L_0x0bff:
            p001a0.C0005b.m45j0()
            throw r23
        L_0x0c03:
            p001a0.C0005b.m45j0()
            throw r23
        L_0x0c07:
            p001a0.C0005b.m45j0()
            throw r23
        L_0x0c0b:
            p001a0.C0005b.m45j0()
            throw r23
        L_0x0c0f:
            r2.mo5418R(r6)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.AlertKt.m19937a(com.etsy.collagecompose.AlertType, java.lang.String, androidx.compose.ui.d, com.etsy.collagecompose.a$c, com.etsy.collagecompose.a$a, com.etsy.collagecompose.a$b, kq.a, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, com.etsy.collagecompose.AnchorDirection, float, boolean, boolean, androidx.compose.runtime.d, int, int, int):void");
    }
}
