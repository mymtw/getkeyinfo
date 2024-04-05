package androidx.compose.foundation.text;

public final class BasicTextFieldKt {
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1951a(androidx.compose.p015ui.text.input.TextFieldValue r36, p753kq.C19857l<? super androidx.compose.p015ui.text.input.TextFieldValue, kotlin.C19394m> r37, androidx.compose.p015ui.C1436d r38, boolean r39, boolean r40, androidx.compose.p015ui.text.C2023s r41, androidx.compose.foundation.text.C0954h r42, androidx.compose.foundation.text.C0953g r43, boolean r44, int r45, androidx.compose.p015ui.text.input.C2006x r46, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r47, androidx.compose.foundation.interaction.C0640j r48, androidx.compose.p015ui.graphics.C1533m r49, p753kq.C19862q<? super p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m>, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r50, androidx.compose.runtime.C1302d r51, int r52, int r53, int r54) {
        /*
            r15 = r36
            r14 = r37
            r13 = r52
            r12 = r53
            r11 = r54
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = -560482651(0xffffffffde97b6a5, float:-5.4660533E18)
            r1 = r51
            androidx.compose.runtime.ComposerImpl r10 = r1.mo5440h(r0)
            r0 = r11 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.mo5408I(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r13
            goto L_0x0034
        L_0x0033:
            r0 = r13
        L_0x0034:
            r1 = r11 & 2
            if (r1 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004b
            boolean r1 = r10.mo5408I(r14)
            if (r1 == 0) goto L_0x0048
            r1 = 32
            goto L_0x004a
        L_0x0048:
            r1 = 16
        L_0x004a:
            r0 = r0 | r1
        L_0x004b:
            r1 = r11 & 4
            if (r1 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0065
            r2 = r38
            boolean r3 = r10.mo5408I(r2)
            if (r3 == 0) goto L_0x0061
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r3
            goto L_0x0067
        L_0x0065:
            r2 = r38
        L_0x0067:
            r3 = r11 & 8
            if (r3 == 0) goto L_0x006e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0081
            r6 = r39
            boolean r7 = r10.mo5427a(r6)
            if (r7 == 0) goto L_0x007d
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r0 = r0 | r7
            goto L_0x0083
        L_0x0081:
            r6 = r39
        L_0x0083:
            r7 = r11 & 16
            r8 = 57344(0xe000, float:8.0356E-41)
            r16 = 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0091
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r4 = r40
            goto L_0x00a4
        L_0x0091:
            r17 = r13 & r8
            r4 = r40
            if (r17 != 0) goto L_0x00a4
            boolean r17 = r10.mo5427a(r4)
            if (r17 == 0) goto L_0x00a0
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r17 = r16
        L_0x00a2:
            r0 = r0 | r17
        L_0x00a4:
            r17 = r11 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00b1
            r19 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r19
            r5 = r41
            goto L_0x00c4
        L_0x00b1:
            r19 = r13 & r18
            r5 = r41
            if (r19 != 0) goto L_0x00c4
            boolean r20 = r10.mo5408I(r5)
            if (r20 == 0) goto L_0x00c0
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r0 = r0 | r20
        L_0x00c4:
            r20 = r11 & 64
            r21 = 3670016(0x380000, float:5.142788E-39)
            if (r20 == 0) goto L_0x00d1
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r9 = r42
            goto L_0x00e4
        L_0x00d1:
            r22 = r13 & r21
            r9 = r42
            if (r22 != 0) goto L_0x00e4
            boolean r23 = r10.mo5408I(r9)
            if (r23 == 0) goto L_0x00e0
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r0 = r0 | r23
        L_0x00e4:
            r8 = r11 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r8 == 0) goto L_0x00f1
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r25
            r2 = r43
            goto L_0x0104
        L_0x00f1:
            r25 = r13 & r24
            r2 = r43
            if (r25 != 0) goto L_0x0104
            boolean r25 = r10.mo5408I(r2)
            if (r25 == 0) goto L_0x0100
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r0 = r0 | r25
        L_0x0104:
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x010f
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r25
            r4 = r44
            goto L_0x0124
        L_0x010f:
            r25 = 234881024(0xe000000, float:1.5777218E-30)
            r25 = r13 & r25
            r4 = r44
            if (r25 != 0) goto L_0x0124
            boolean r25 = r10.mo5427a(r4)
            if (r25 == 0) goto L_0x0120
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r0 = r0 | r25
        L_0x0124:
            r4 = r11 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x012f
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r25
            r5 = r45
            goto L_0x0144
        L_0x012f:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r13 & r25
            r5 = r45
            if (r25 != 0) goto L_0x0144
            boolean r25 = r10.mo5432d(r5)
            if (r25 == 0) goto L_0x0140
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r0 = r0 | r25
        L_0x0144:
            r5 = r11 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x014d
            r25 = r12 | 6
            r6 = r46
            goto L_0x0163
        L_0x014d:
            r25 = r12 & 14
            r6 = r46
            if (r25 != 0) goto L_0x0161
            boolean r25 = r10.mo5408I(r6)
            if (r25 == 0) goto L_0x015c
            r25 = 4
            goto L_0x015e
        L_0x015c:
            r25 = 2
        L_0x015e:
            r25 = r12 | r25
            goto L_0x0163
        L_0x0161:
            r25 = r12
        L_0x0163:
            r6 = r11 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x016a
            r25 = r25 | 48
            goto L_0x017d
        L_0x016a:
            r26 = r12 & 112(0x70, float:1.57E-43)
            r9 = r47
            if (r26 != 0) goto L_0x017d
            boolean r26 = r10.mo5408I(r9)
            if (r26 == 0) goto L_0x0179
            r26 = 32
            goto L_0x017b
        L_0x0179:
            r26 = 16
        L_0x017b:
            r25 = r25 | r26
        L_0x017d:
            r9 = r25
            r14 = r11 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0186
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x019a
        L_0x0186:
            r15 = r12 & 896(0x380, float:1.256E-42)
            if (r15 != 0) goto L_0x019a
            r15 = r48
            boolean r25 = r10.mo5408I(r15)
            if (r25 == 0) goto L_0x0195
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r9 = r9 | r25
            goto L_0x019c
        L_0x019a:
            r15 = r48
        L_0x019c:
            r15 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r15 != 0) goto L_0x01b6
            r15 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r15 != 0) goto L_0x01af
            r15 = r49
            boolean r25 = r10.mo5408I(r15)
            if (r25 == 0) goto L_0x01b1
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x01b3
        L_0x01af:
            r15 = r49
        L_0x01b1:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x01b3:
            r9 = r9 | r19
            goto L_0x01b8
        L_0x01b6:
            r15 = r49
        L_0x01b8:
            r15 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r15 == 0) goto L_0x01c1
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            r12 = r50
            goto L_0x01d4
        L_0x01c1:
            r19 = 57344(0xe000, float:8.0356E-41)
            r25 = r12 & r19
            r12 = r50
            if (r25 != 0) goto L_0x01d4
            boolean r19 = r10.mo5408I(r12)
            if (r19 == 0) goto L_0x01d2
            r16 = 16384(0x4000, float:2.2959E-41)
        L_0x01d2:
            r9 = r9 | r16
        L_0x01d4:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r12 = r0 & r16
            r51 = r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r0) goto L_0x0210
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r9
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r12) goto L_0x0210
            boolean r0 = r10.mo5442i()
            if (r0 != 0) goto L_0x01ef
            goto L_0x0210
        L_0x01ef:
            r10.mo5396C()
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r11 = r46
            r12 = r47
            r13 = r48
            r14 = r49
            r15 = r50
            r21 = r10
            r10 = r45
            goto L_0x039b
        L_0x0210:
            r10.mo5466u0()
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0243
            boolean r0 = r10.mo5425Y()
            if (r0 == 0) goto L_0x021e
            goto L_0x0243
        L_0x021e:
            r10.mo5396C()
            r0 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0227
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0227:
            r19 = r38
            r20 = r39
            r22 = r40
            r25 = r41
            r15 = r42
            r26 = r43
            r27 = r44
            r28 = r45
            r29 = r46
            r30 = r47
            r31 = r48
            r32 = r49
            r33 = r50
            goto L_0x02de
        L_0x0243:
            if (r1 == 0) goto L_0x0248
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x024a
        L_0x0248:
            r0 = r38
        L_0x024a:
            if (r3 == 0) goto L_0x024e
            r1 = 1
            goto L_0x0250
        L_0x024e:
            r1 = r39
        L_0x0250:
            if (r7 == 0) goto L_0x0254
            r3 = 0
            goto L_0x0256
        L_0x0254:
            r3 = r40
        L_0x0256:
            if (r17 == 0) goto L_0x025b
            androidx.compose.ui.text.s r7 = androidx.compose.p015ui.text.C2023s.f4598d
            goto L_0x025d
        L_0x025b:
            r7 = r41
        L_0x025d:
            if (r20 == 0) goto L_0x0262
            androidx.compose.foundation.text.h r16 = androidx.compose.foundation.text.C0954h.f1985e
            goto L_0x0264
        L_0x0262:
            r16 = r42
        L_0x0264:
            if (r8 == 0) goto L_0x0269
            androidx.compose.foundation.text.g r8 = androidx.compose.foundation.text.C0953g.f1978g
            goto L_0x026b
        L_0x0269:
            r8 = r43
        L_0x026b:
            if (r2 == 0) goto L_0x026f
            r2 = 0
            goto L_0x0271
        L_0x026f:
            r2 = r44
        L_0x0271:
            if (r4 == 0) goto L_0x0277
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0279
        L_0x0277:
            r4 = r45
        L_0x0279:
            if (r5 == 0) goto L_0x027e
            a9.b r5 = androidx.compose.p015ui.text.input.C2006x.C2007a.f4530a
            goto L_0x0280
        L_0x027e:
            r5 = r46
        L_0x0280:
            if (r6 == 0) goto L_0x0285
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5 r6 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$5.INSTANCE
            goto L_0x0287
        L_0x0285:
            r6 = r47
        L_0x0287:
            if (r14 == 0) goto L_0x02a3
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo5465u(r14)
            java.lang.Object r14 = r10.mo5431c0()
            androidx.compose.runtime.d$a$a r12 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r14 != r12) goto L_0x029b
            androidx.compose.foundation.interaction.k r14 = android.support.p013v4.media.C0072d.m198e(r10)
        L_0x029b:
            r12 = 0
            r10.mo5418R(r12)
            r12 = r14
            androidx.compose.foundation.interaction.j r12 = (androidx.compose.foundation.interaction.C0640j) r12
            goto L_0x02a5
        L_0x02a3:
            r12 = r48
        L_0x02a5:
            r14 = r11 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L_0x02b7
            androidx.compose.ui.graphics.l0 r14 = new androidx.compose.ui.graphics.l0
            r38 = r0
            r39 = r1
            long r0 = androidx.compose.p015ui.graphics.C1545s.f3357b
            r14.<init>(r0)
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x02bd
        L_0x02b7:
            r38 = r0
            r39 = r1
            r14 = r49
        L_0x02bd:
            if (r15 == 0) goto L_0x02c2
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f1907b
            goto L_0x02c4
        L_0x02c2:
            r0 = r50
        L_0x02c4:
            r19 = r38
            r20 = r39
            r33 = r0
            r27 = r2
            r22 = r3
            r28 = r4
            r29 = r5
            r30 = r6
            r25 = r7
            r26 = r8
            r31 = r12
            r32 = r14
            r15 = r16
        L_0x02de:
            r10.mo5419S()
            androidx.compose.ui.text.input.j r12 = new androidx.compose.ui.text.input.j
            int r0 = r15.f1986a
            boolean r1 = r15.f1987b
            int r2 = r15.f1988c
            int r3 = r15.f1989d
            r38 = r12
            r39 = r27
            r40 = r0
            r41 = r1
            r42 = r2
            r43 = r3
            r38.<init>(r39, r40, r41, r42, r43)
            r8 = r27 ^ 1
            if (r27 == 0) goto L_0x0300
            r14 = 1
            goto L_0x0302
        L_0x0300:
            r14 = r28
        L_0x0302:
            r0 = r51 & 14
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.mo5465u(r1)
            r7 = r36
            boolean r1 = r10.mo5408I(r7)
            r6 = r37
            boolean r2 = r10.mo5408I(r6)
            r1 = r1 | r2
            java.lang.Object r2 = r10.mo5431c0()
            if (r1 != 0) goto L_0x0321
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r1) goto L_0x0329
        L_0x0321:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1 r2 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
            r2.<init>(r7, r6)
            r10.mo5407H0(r2)
        L_0x0329:
            r1 = 0
            r10.mo5418R(r1)
            r1 = r2
            kq.l r1 = (p753kq.C19857l) r1
            r2 = r51
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            int r3 = r2 >> 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            int r3 = r9 << 12
            r4 = 57344(0xe000, float:8.0356E-41)
            r5 = r3 & r4
            r0 = r0 | r5
            r4 = r3 & r18
            r0 = r0 | r4
            r4 = r3 & r21
            r0 = r0 | r4
            r3 = r3 & r24
            r16 = r0 | r3
            int r0 = r2 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r2 = r2 >> 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r9
            r17 = r0 | r2
            r18 = 0
            r0 = r36
            r2 = r19
            r3 = r25
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r14
            r21 = r10
            r10 = r12
            r11 = r26
            r12 = r20
            r13 = r22
            r14 = r33
            r23 = r15
            r15 = r21
            androidx.compose.foundation.text.CoreTextFieldKt.m1957a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r19
            r4 = r20
            r5 = r22
            r7 = r23
            r6 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
        L_0x039b:
            androidx.compose.runtime.v0 r2 = r21.mo5421U()
            if (r2 != 0) goto L_0x03a2
            goto L_0x03bc
        L_0x03a2:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8
            r0 = r1
            r34 = r1
            r1 = r36
            r35 = r2
            r2 = r37
            r16 = r52
            r17 = r53
            r18 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r34
            r0 = r35
            r0.f3081d = r1
        L_0x03bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.m1951a(androidx.compose.ui.text.input.TextFieldValue, kq.l, androidx.compose.ui.d, boolean, boolean, androidx.compose.ui.text.s, androidx.compose.foundation.text.h, androidx.compose.foundation.text.g, boolean, int, androidx.compose.ui.text.input.x, kq.l, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.m, kq.q, androidx.compose.runtime.d, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m1952b(java.lang.String r38, p753kq.C19857l<? super java.lang.String, kotlin.C19394m> r39, androidx.compose.p015ui.C1436d r40, boolean r41, boolean r42, androidx.compose.p015ui.text.C2023s r43, androidx.compose.foundation.text.C0954h r44, androidx.compose.foundation.text.C0953g r45, boolean r46, int r47, androidx.compose.p015ui.text.input.C2006x r48, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r49, androidx.compose.foundation.interaction.C0640j r50, androidx.compose.p015ui.graphics.C1533m r51, p753kq.C19862q<? super p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m>, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r52, androidx.compose.runtime.C1302d r53, int r54, int r55, int r56) {
        /*
            r1 = r38
            r2 = r39
            r15 = r54
            r14 = r55
            r13 = r56
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            r0 = -454732590(0xffffffffe4e554d2, float:-3.384333E22)
            r3 = r53
            androidx.compose.runtime.ComposerImpl r0 = r3.mo5440h(r0)
            r3 = r13 & 1
            if (r3 == 0) goto L_0x0024
            r3 = r15 | 6
            goto L_0x0034
        L_0x0024:
            r3 = r15 & 14
            if (r3 != 0) goto L_0x0033
            boolean r3 = r0.mo5408I(r1)
            if (r3 == 0) goto L_0x0030
            r3 = 4
            goto L_0x0031
        L_0x0030:
            r3 = 2
        L_0x0031:
            r3 = r3 | r15
            goto L_0x0034
        L_0x0033:
            r3 = r15
        L_0x0034:
            r4 = r13 & 2
            if (r4 == 0) goto L_0x003b
            r3 = r3 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004b
            boolean r4 = r0.mo5408I(r2)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r3 = r3 | r4
        L_0x004b:
            r4 = r13 & 4
            if (r4 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0065
            r5 = r40
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r40
        L_0x0067:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x006e
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r9 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0081
            r9 = r41
            boolean r10 = r0.mo5427a(r9)
            if (r10 == 0) goto L_0x007d
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r3 = r3 | r10
            goto L_0x0083
        L_0x0081:
            r9 = r41
        L_0x0083:
            r10 = r13 & 16
            r11 = 57344(0xe000, float:8.0356E-41)
            r16 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0091
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            r7 = r42
            goto L_0x00a4
        L_0x0091:
            r17 = r15 & r11
            r7 = r42
            if (r17 != 0) goto L_0x00a4
            boolean r17 = r0.mo5427a(r7)
            if (r17 == 0) goto L_0x00a0
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a2
        L_0x00a0:
            r17 = r16
        L_0x00a2:
            r3 = r3 | r17
        L_0x00a4:
            r17 = r13 & 32
            r18 = 458752(0x70000, float:6.42848E-40)
            if (r17 == 0) goto L_0x00b1
            r19 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r19
            r8 = r43
            goto L_0x00c4
        L_0x00b1:
            r19 = r15 & r18
            r8 = r43
            if (r19 != 0) goto L_0x00c4
            boolean r20 = r0.mo5408I(r8)
            if (r20 == 0) goto L_0x00c0
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r3 = r3 | r20
        L_0x00c4:
            r20 = r13 & 64
            r21 = 3670016(0x380000, float:5.142788E-39)
            if (r20 == 0) goto L_0x00d1
            r22 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r22
            r12 = r44
            goto L_0x00e4
        L_0x00d1:
            r22 = r15 & r21
            r12 = r44
            if (r22 != 0) goto L_0x00e4
            boolean r23 = r0.mo5408I(r12)
            if (r23 == 0) goto L_0x00e0
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r3 = r3 | r23
        L_0x00e4:
            r11 = r13 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r11 == 0) goto L_0x00f1
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r25
            r5 = r45
            goto L_0x0104
        L_0x00f1:
            r25 = r15 & r24
            r5 = r45
            if (r25 != 0) goto L_0x0104
            boolean r25 = r0.mo5408I(r5)
            if (r25 == 0) goto L_0x0100
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0102
        L_0x0100:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0102:
            r3 = r3 | r25
        L_0x0104:
            r5 = r13 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x010f
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r25
            r7 = r46
            goto L_0x0124
        L_0x010f:
            r25 = 234881024(0xe000000, float:1.5777218E-30)
            r25 = r15 & r25
            r7 = r46
            if (r25 != 0) goto L_0x0124
            boolean r25 = r0.mo5427a(r7)
            if (r25 == 0) goto L_0x0120
            r25 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0122
        L_0x0120:
            r25 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0122:
            r3 = r3 | r25
        L_0x0124:
            r7 = r13 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x012f
            r25 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r25
            r8 = r47
            goto L_0x0144
        L_0x012f:
            r25 = 1879048192(0x70000000, float:1.58456325E29)
            r25 = r15 & r25
            r8 = r47
            if (r25 != 0) goto L_0x0144
            boolean r25 = r0.mo5432d(r8)
            if (r25 == 0) goto L_0x0140
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0142
        L_0x0140:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0142:
            r3 = r3 | r25
        L_0x0144:
            r8 = r13 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x014d
            r25 = r14 | 6
            r9 = r48
            goto L_0x0163
        L_0x014d:
            r25 = r14 & 14
            r9 = r48
            if (r25 != 0) goto L_0x0161
            boolean r25 = r0.mo5408I(r9)
            if (r25 == 0) goto L_0x015c
            r25 = 4
            goto L_0x015e
        L_0x015c:
            r25 = 2
        L_0x015e:
            r25 = r14 | r25
            goto L_0x0163
        L_0x0161:
            r25 = r14
        L_0x0163:
            r9 = r13 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x016a
            r25 = r25 | 48
            goto L_0x017d
        L_0x016a:
            r26 = r14 & 112(0x70, float:1.57E-43)
            r12 = r49
            if (r26 != 0) goto L_0x017d
            boolean r26 = r0.mo5408I(r12)
            if (r26 == 0) goto L_0x0179
            r26 = 32
            goto L_0x017b
        L_0x0179:
            r26 = 16
        L_0x017b:
            r25 = r25 | r26
        L_0x017d:
            r12 = r25
            r2 = r13 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0186
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x019a
        L_0x0186:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x019a
            r1 = r50
            boolean r25 = r0.mo5408I(r1)
            if (r25 == 0) goto L_0x0195
            r25 = 256(0x100, float:3.59E-43)
            goto L_0x0197
        L_0x0195:
            r25 = 128(0x80, float:1.794E-43)
        L_0x0197:
            r12 = r12 | r25
            goto L_0x019c
        L_0x019a:
            r1 = r50
        L_0x019c:
            r1 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x01b6
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x01af
            r1 = r51
            boolean r25 = r0.mo5408I(r1)
            if (r25 == 0) goto L_0x01b1
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x01b3
        L_0x01af:
            r1 = r51
        L_0x01b1:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x01b3:
            r12 = r12 | r19
            goto L_0x01b8
        L_0x01b6:
            r1 = r51
        L_0x01b8:
            r1 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x01c1
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            r14 = r52
            goto L_0x01d4
        L_0x01c1:
            r19 = 57344(0xe000, float:8.0356E-41)
            r25 = r14 & r19
            r14 = r52
            if (r25 != 0) goto L_0x01d4
            boolean r19 = r0.mo5408I(r14)
            if (r19 == 0) goto L_0x01d2
            r16 = 16384(0x4000, float:2.2959E-41)
        L_0x01d2:
            r12 = r12 | r16
        L_0x01d4:
            r16 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r14 = r3 & r16
            r53 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r3) goto L_0x0212
            r3 = 46811(0xb6db, float:6.5596E-41)
            r3 = r3 & r12
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r14) goto L_0x0212
            boolean r3 = r0.mo5442i()
            if (r3 != 0) goto L_0x01ef
            goto L_0x0212
        L_0x01ef:
            r0.mo5396C()
            r6 = r38
            r9 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r10 = r43
            r7 = r44
            r8 = r45
            r11 = r46
            r12 = r47
            r13 = r48
            r35 = r49
            r14 = r50
            r15 = r51
            r16 = r52
            goto L_0x03fb
        L_0x0212:
            r0.mo5466u0()
            r3 = r15 & 1
            if (r3 == 0) goto L_0x0247
            boolean r3 = r0.mo5425Y()
            if (r3 == 0) goto L_0x0220
            goto L_0x0247
        L_0x0220:
            r0.mo5396C()
            r1 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0229
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0229:
            r1 = r40
            r2 = r41
            r6 = r42
            r10 = r43
            r14 = r44
            r11 = r45
            r3 = r46
            r7 = r47
            r8 = r48
            r9 = r49
            r4 = r50
            r5 = r51
            r16 = r12
            r12 = r52
            goto L_0x02d6
        L_0x0247:
            if (r4 == 0) goto L_0x024c
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x024e
        L_0x024c:
            r3 = r40
        L_0x024e:
            if (r6 == 0) goto L_0x0252
            r4 = 1
            goto L_0x0254
        L_0x0252:
            r4 = r41
        L_0x0254:
            if (r10 == 0) goto L_0x0258
            r6 = 0
            goto L_0x025a
        L_0x0258:
            r6 = r42
        L_0x025a:
            if (r17 == 0) goto L_0x025f
            androidx.compose.ui.text.s r10 = androidx.compose.p015ui.text.C2023s.f4598d
            goto L_0x0261
        L_0x025f:
            r10 = r43
        L_0x0261:
            if (r20 == 0) goto L_0x0266
            androidx.compose.foundation.text.h r14 = androidx.compose.foundation.text.C0954h.f1985e
            goto L_0x0268
        L_0x0266:
            r14 = r44
        L_0x0268:
            if (r11 == 0) goto L_0x026d
            androidx.compose.foundation.text.g r11 = androidx.compose.foundation.text.C0953g.f1978g
            goto L_0x026f
        L_0x026d:
            r11 = r45
        L_0x026f:
            if (r5 == 0) goto L_0x0273
            r5 = 0
            goto L_0x0275
        L_0x0273:
            r5 = r46
        L_0x0275:
            if (r7 == 0) goto L_0x027b
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x027d
        L_0x027b:
            r7 = r47
        L_0x027d:
            if (r8 == 0) goto L_0x0282
            a9.b r8 = androidx.compose.p015ui.text.input.C2006x.C2007a.f4530a
            goto L_0x0284
        L_0x0282:
            r8 = r48
        L_0x0284:
            if (r9 == 0) goto L_0x0289
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1 r9 = androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$1.INSTANCE
            goto L_0x028b
        L_0x0289:
            r9 = r49
        L_0x028b:
            if (r2 == 0) goto L_0x02a8
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r2)
            java.lang.Object r2 = r0.mo5431c0()
            r40 = r3
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x02a1
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x02a1:
            r3 = 0
            r0.mo5418R(r3)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            goto L_0x02ac
        L_0x02a8:
            r40 = r3
            r2 = r50
        L_0x02ac:
            r3 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x02be
            androidx.compose.ui.graphics.l0 r3 = new androidx.compose.ui.graphics.l0
            r41 = r4
            r42 = r5
            long r4 = androidx.compose.p015ui.graphics.C1545s.f3357b
            r3.<init>(r4)
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x02c4
        L_0x02be:
            r41 = r4
            r42 = r5
            r3 = r51
        L_0x02c4:
            if (r1 == 0) goto L_0x02c9
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.f1906a
            goto L_0x02cb
        L_0x02c9:
            r1 = r52
        L_0x02cb:
            r4 = r2
            r5 = r3
            r16 = r12
            r2 = r41
            r3 = r42
            r12 = r1
            r1 = r40
        L_0x02d6:
            r0.mo5419S()
            r46 = r7
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r7)
            java.lang.Object r7 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r13 = androidx.compose.runtime.C1302d.C1303a.f2828a
            r15 = 6
            if (r7 != r13) goto L_0x0301
            androidx.compose.ui.text.input.TextFieldValue r7 = new androidx.compose.ui.text.input.TextFieldValue
            r47 = r11
            r48 = r12
            r11 = 0
            r49 = r6
            r6 = r38
            r7.<init>((java.lang.String) r6, (long) r11, (int) r15)
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = androidx.compose.foundation.layout.C0761x.m1751w0(r7, androidx.compose.runtime.C1351n1.f2948a)
            r0.mo5407H0(r7)
            goto L_0x0309
        L_0x0301:
            r49 = r6
            r47 = r11
            r48 = r12
            r6 = r38
        L_0x0309:
            r11 = 0
            r0.mo5418R(r11)
            androidx.compose.runtime.j0 r7 = (androidx.compose.runtime.C1338j0) r7
            java.lang.Object r11 = r7.getValue()
            androidx.compose.ui.text.input.TextFieldValue r11 = (androidx.compose.p015ui.text.input.TextFieldValue) r11
            r50 = r4
            r51 = r5
            long r4 = r11.f4449b
            androidx.compose.ui.text.r r11 = r11.f4450c
            androidx.compose.ui.text.input.TextFieldValue r12 = new androidx.compose.ui.text.input.TextFieldValue
            r52 = r2
            androidx.compose.ui.text.a r2 = new androidx.compose.ui.text.a
            r35 = r9
            r9 = 0
            r2.<init>(r6, r9, r15)
            r12.<init>((androidx.compose.p015ui.text.C1913a) r2, (long) r4, (androidx.compose.p015ui.text.C2022r) r11)
            r2 = 1157296644(0x44faf204, float:2007.563)
            r0.mo5465u(r2)
            boolean r2 = r0.mo5408I(r6)
            java.lang.Object r4 = r0.mo5431c0()
            if (r2 != 0) goto L_0x033e
            if (r4 != r13) goto L_0x0345
        L_0x033e:
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = androidx.compose.foundation.layout.C0761x.m1751w0(r38, androidx.compose.runtime.C1351n1.f2948a)
            r0.mo5407H0(r4)
        L_0x0345:
            r2 = 0
            r0.mo5418R(r2)
            androidx.compose.runtime.j0 r4 = (androidx.compose.runtime.C1338j0) r4
            androidx.compose.ui.text.input.j r26 = new androidx.compose.ui.text.input.j
            int r2 = r14.f1986a
            boolean r5 = r14.f1987b
            int r9 = r14.f1988c
            int r11 = r14.f1989d
            r40 = r26
            r41 = r3
            r42 = r2
            r43 = r5
            r44 = r9
            r45 = r11
            r40.<init>(r41, r42, r43, r44, r45)
            r2 = r3 ^ 1
            if (r3 == 0) goto L_0x036c
            r5 = 1
            r25 = r5
            goto L_0x036e
        L_0x036c:
            r25 = r46
        L_0x036e:
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo5465u(r5)
            boolean r5 = r0.mo5408I(r7)
            boolean r9 = r0.mo5408I(r4)
            r5 = r5 | r9
            r9 = r39
            boolean r11 = r0.mo5408I(r9)
            r5 = r5 | r11
            java.lang.Object r11 = r0.mo5431c0()
            if (r5 != 0) goto L_0x038c
            if (r11 != r13) goto L_0x0394
        L_0x038c:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1 r11 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
            r11.<init>(r9, r7, r4)
            r0.mo5407H0(r11)
        L_0x0394:
            r4 = 0
            r0.mo5418R(r4)
            r17 = r11
            kq.l r17 = (p753kq.C19857l) r17
            r4 = r53
            r5 = r4 & 896(0x380, float:1.256E-42)
            int r7 = r4 >> 6
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r7
            int r7 = r16 << 12
            r11 = 57344(0xe000, float:8.0356E-41)
            r13 = r7 & r11
            r5 = r5 | r13
            r11 = r7 & r18
            r5 = r5 | r11
            r11 = r7 & r21
            r5 = r5 | r11
            r7 = r7 & r24
            r32 = r5 | r7
            int r5 = r4 >> 18
            r5 = r5 & 112(0x70, float:1.57E-43)
            int r4 = r4 >> 3
            r7 = r4 & 896(0x380, float:1.256E-42)
            r5 = r5 | r7
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r16 & r5
            r33 = r4 | r5
            r34 = 0
            r16 = r12
            r18 = r1
            r19 = r10
            r20 = r8
            r21 = r35
            r22 = r50
            r23 = r51
            r24 = r2
            r27 = r47
            r28 = r52
            r29 = r49
            r30 = r48
            r31 = r0
            androidx.compose.foundation.text.CoreTextFieldKt.m1957a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r12 = r46
            r16 = r48
            r5 = r49
            r15 = r51
            r4 = r52
            r11 = r3
            r13 = r8
            r7 = r14
            r8 = r47
            r14 = r50
            r3 = r1
        L_0x03fb:
            androidx.compose.runtime.v0 r2 = r0.mo5421U()
            if (r2 != 0) goto L_0x0402
            goto L_0x042c
        L_0x0402:
            androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4 r1 = new androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4
            r0 = r1
            r36 = r1
            r1 = r38
            r6 = r2
            r2 = r39
            r9 = r6
            r6 = r10
            r10 = r9
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r11
            r11 = r13
            r13 = r12
            r12 = r35
            r37 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r54
            r17 = r55
            r18 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r36
            r0 = r37
            r0.f3081d = r1
        L_0x042c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.m1952b(java.lang.String, kq.l, androidx.compose.ui.d, boolean, boolean, androidx.compose.ui.text.s, androidx.compose.foundation.text.h, androidx.compose.foundation.text.g, boolean, int, androidx.compose.ui.text.input.x, kq.l, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.m, kq.q, androidx.compose.runtime.d, int, int, int):void");
    }
}
