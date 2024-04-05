package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import p173m.C7279a;
import p174m0.C7280a;

public final class OutlinedTextFieldKt {

    /* renamed from: a */
    public static final float f2243a = ((float) 4);

    /* renamed from: b */
    public static final float f2244b = ((float) 8);

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2198a(java.lang.String r43, p753kq.C19857l<? super java.lang.String, kotlin.C19394m> r44, androidx.compose.p015ui.C1436d r45, boolean r46, boolean r47, androidx.compose.p015ui.text.C2023s r48, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r49, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r50, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r51, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r52, boolean r53, androidx.compose.p015ui.text.input.C2006x r54, androidx.compose.foundation.text.C0954h r55, androidx.compose.foundation.text.C0953g r56, boolean r57, int r58, androidx.compose.foundation.interaction.C0640j r59, androidx.compose.p015ui.graphics.C1530k0 r60, androidx.compose.material.C1166a2 r61, androidx.compose.runtime.C1302d r62, int r63, int r64, int r65) {
        /*
            r15 = r43
            r12 = r44
            r10 = r63
            r9 = r64
            r8 = r65
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "onValueChange"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            r0 = -2099955827(0xffffffff82d5378d, float:-3.1329422E-37)
            r1 = r62
            androidx.compose.runtime.ComposerImpl r7 = r1.mo5440h(r0)
            r0 = r8 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r10 | 6
            goto L_0x0034
        L_0x0024:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x0033
            boolean r0 = r7.mo5408I(r15)
            if (r0 == 0) goto L_0x0030
            r0 = 4
            goto L_0x0031
        L_0x0030:
            r0 = 2
        L_0x0031:
            r0 = r0 | r10
            goto L_0x0034
        L_0x0033:
            r0 = r10
        L_0x0034:
            r1 = r8 & 2
            if (r1 == 0) goto L_0x003b
            r0 = r0 | 48
            goto L_0x004b
        L_0x003b:
            r1 = r10 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004b
            boolean r1 = r7.mo5408I(r12)
            if (r1 == 0) goto L_0x0048
            r1 = 32
            goto L_0x004a
        L_0x0048:
            r1 = 16
        L_0x004a:
            r0 = r0 | r1
        L_0x004b:
            r1 = r8 & 4
            if (r1 == 0) goto L_0x0052
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0052:
            r2 = r10 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0065
            r2 = r45
            boolean r3 = r7.mo5408I(r2)
            if (r3 == 0) goto L_0x0061
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r0 = r0 | r3
            goto L_0x0067
        L_0x0065:
            r2 = r45
        L_0x0067:
            r3 = r8 & 8
            if (r3 == 0) goto L_0x006e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x006e:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0081
            r6 = r46
            boolean r11 = r7.mo5427a(r6)
            if (r11 == 0) goto L_0x007d
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r0 = r0 | r11
            goto L_0x0083
        L_0x0081:
            r6 = r46
        L_0x0083:
            r11 = r8 & 16
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r11 == 0) goto L_0x008f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r4 = r47
            goto L_0x00a2
        L_0x008f:
            r17 = r10 & r16
            r4 = r47
            if (r17 != 0) goto L_0x00a2
            boolean r17 = r7.mo5427a(r4)
            if (r17 == 0) goto L_0x009e
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r17 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r0 = r0 | r17
        L_0x00a2:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r10 & r17
            r18 = 131072(0x20000, float:1.83671E-40)
            r19 = 65536(0x10000, float:9.18355E-41)
            if (r17 != 0) goto L_0x00c0
            r17 = r8 & 32
            r5 = r48
            if (r17 != 0) goto L_0x00bb
            boolean r20 = r7.mo5408I(r5)
            if (r20 == 0) goto L_0x00bb
            r20 = r18
            goto L_0x00bd
        L_0x00bb:
            r20 = r19
        L_0x00bd:
            r0 = r0 | r20
            goto L_0x00c2
        L_0x00c0:
            r5 = r48
        L_0x00c2:
            r20 = r8 & 64
            r21 = 3670016(0x380000, float:5.142788E-39)
            if (r20 == 0) goto L_0x00cf
            r22 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r22
            r13 = r49
            goto L_0x00e2
        L_0x00cf:
            r22 = r10 & r21
            r13 = r49
            if (r22 != 0) goto L_0x00e2
            boolean r23 = r7.mo5408I(r13)
            if (r23 == 0) goto L_0x00de
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r0 = r0 | r23
        L_0x00e2:
            r14 = r8 & 128(0x80, float:1.794E-43)
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            if (r14 == 0) goto L_0x00ef
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r25
            r2 = r50
            goto L_0x0102
        L_0x00ef:
            r25 = r10 & r24
            r2 = r50
            if (r25 != 0) goto L_0x0102
            boolean r25 = r7.mo5408I(r2)
            if (r25 == 0) goto L_0x00fe
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0100
        L_0x00fe:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0100:
            r0 = r0 | r25
        L_0x0102:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r25 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010f
            r26 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r26
            r4 = r51
            goto L_0x0122
        L_0x010f:
            r26 = r10 & r25
            r4 = r51
            if (r26 != 0) goto L_0x0122
            boolean r26 = r7.mo5408I(r4)
            if (r26 == 0) goto L_0x011e
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0120
        L_0x011e:
            r26 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0120:
            r0 = r0 | r26
        L_0x0122:
            r4 = r8 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x012d
            r26 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r26
            r5 = r52
            goto L_0x0142
        L_0x012d:
            r26 = 1879048192(0x70000000, float:1.58456325E29)
            r26 = r10 & r26
            r5 = r52
            if (r26 != 0) goto L_0x0142
            boolean r26 = r7.mo5408I(r5)
            if (r26 == 0) goto L_0x013e
            r26 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0140
        L_0x013e:
            r26 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0140:
            r0 = r0 | r26
        L_0x0142:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x014b
            r26 = r9 | 6
            r6 = r53
            goto L_0x0161
        L_0x014b:
            r26 = r9 & 14
            r6 = r53
            if (r26 != 0) goto L_0x015f
            boolean r26 = r7.mo5427a(r6)
            if (r26 == 0) goto L_0x015a
            r26 = 4
            goto L_0x015c
        L_0x015a:
            r26 = 2
        L_0x015c:
            r26 = r9 | r26
            goto L_0x0161
        L_0x015f:
            r26 = r9
        L_0x0161:
            r6 = r8 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x016a
            r26 = r26 | 48
            r12 = r54
            goto L_0x017d
        L_0x016a:
            r27 = r9 & 112(0x70, float:1.57E-43)
            r12 = r54
            if (r27 != 0) goto L_0x017d
            boolean r27 = r7.mo5408I(r12)
            if (r27 == 0) goto L_0x0179
            r27 = 32
            goto L_0x017b
        L_0x0179:
            r27 = 16
        L_0x017b:
            r26 = r26 | r27
        L_0x017d:
            r12 = r9 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0197
            r12 = r8 & 4096(0x1000, float:5.74E-42)
            if (r12 != 0) goto L_0x0190
            r12 = r55
            boolean r27 = r7.mo5408I(r12)
            if (r27 == 0) goto L_0x0192
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x0194
        L_0x0190:
            r12 = r55
        L_0x0192:
            r27 = 128(0x80, float:1.794E-43)
        L_0x0194:
            r26 = r26 | r27
            goto L_0x0199
        L_0x0197:
            r12 = r55
        L_0x0199:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x01b3
            r12 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r12 != 0) goto L_0x01ac
            r12 = r56
            boolean r27 = r7.mo5408I(r12)
            if (r27 == 0) goto L_0x01ae
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x01b0
        L_0x01ac:
            r12 = r56
        L_0x01ae:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x01b0:
            r26 = r26 | r17
            goto L_0x01b5
        L_0x01b3:
            r12 = r56
        L_0x01b5:
            r12 = r26
            r13 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x01c0
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
            r15 = r57
            goto L_0x01d3
        L_0x01c0:
            r17 = r9 & r16
            r15 = r57
            if (r17 != 0) goto L_0x01d3
            boolean r17 = r7.mo5427a(r15)
            if (r17 == 0) goto L_0x01cf
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01d1
        L_0x01cf:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x01d1:
            r12 = r12 | r22
        L_0x01d3:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r8 & r17
            if (r17 == 0) goto L_0x01e1
            r22 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 | r22
            r15 = r58
            goto L_0x01f6
        L_0x01e1:
            r22 = 458752(0x70000, float:6.42848E-40)
            r22 = r9 & r22
            r15 = r58
            if (r22 != 0) goto L_0x01f6
            boolean r22 = r7.mo5432d(r15)
            if (r22 == 0) goto L_0x01f2
            r22 = r18
            goto L_0x01f4
        L_0x01f2:
            r22 = r19
        L_0x01f4:
            r12 = r12 | r22
        L_0x01f6:
            r19 = r8 & r19
            if (r19 == 0) goto L_0x0201
            r22 = 1572864(0x180000, float:2.204052E-39)
            r12 = r12 | r22
            r15 = r59
            goto L_0x0214
        L_0x0201:
            r22 = r9 & r21
            r15 = r59
            if (r22 != 0) goto L_0x0214
            boolean r22 = r7.mo5408I(r15)
            if (r22 == 0) goto L_0x0210
            r22 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0212
        L_0x0210:
            r22 = 524288(0x80000, float:7.34684E-40)
        L_0x0212:
            r12 = r12 | r22
        L_0x0214:
            r22 = r9 & r24
            if (r22 != 0) goto L_0x022c
            r22 = r8 & r18
            r15 = r60
            if (r22 != 0) goto L_0x0227
            boolean r22 = r7.mo5408I(r15)
            if (r22 == 0) goto L_0x0227
            r22 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0229
        L_0x0227:
            r22 = 4194304(0x400000, float:5.877472E-39)
        L_0x0229:
            r12 = r12 | r22
            goto L_0x022e
        L_0x022c:
            r15 = r60
        L_0x022e:
            r22 = r9 & r25
            r23 = 262144(0x40000, float:3.67342E-40)
            if (r22 != 0) goto L_0x0248
            r22 = r8 & r23
            r9 = r61
            if (r22 != 0) goto L_0x0243
            boolean r22 = r7.mo5408I(r9)
            if (r22 == 0) goto L_0x0243
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0245
        L_0x0243:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0245:
            r12 = r12 | r22
            goto L_0x024a
        L_0x0248:
            r9 = r61
        L_0x024a:
            r22 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r9 = r0 & r22
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r15) goto L_0x028d
            r9 = 191739611(0xb6db6db, float:4.5782105E-32)
            r9 = r9 & r12
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            if (r9 != r15) goto L_0x028d
            boolean r9 = r7.mo5442i()
            if (r9 != 0) goto L_0x0264
            goto L_0x028d
        L_0x0264:
            r7.mo5396C()
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r8 = r50
            r9 = r51
            r10 = r52
            r11 = r53
            r12 = r54
            r13 = r55
            r14 = r56
            r15 = r57
            r16 = r58
            r17 = r59
            r18 = r60
            r19 = r61
            r25 = r7
            r7 = r49
            goto L_0x0507
        L_0x028d:
            r7.mo5466u0()
            r9 = r10 & 1
            if (r9 == 0) goto L_0x02e7
            boolean r9 = r7.mo5425Y()
            if (r9 == 0) goto L_0x029b
            goto L_0x02e7
        L_0x029b:
            r7.mo5396C()
            r1 = r8 & 32
            if (r1 == 0) goto L_0x02a6
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x02a6:
            r1 = r8 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x02ac
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02ac:
            r1 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x02b2
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x02b2:
            r1 = r8 & r18
            if (r1 == 0) goto L_0x02ba
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r12 = r12 & r1
        L_0x02ba:
            r1 = r8 & r23
            if (r1 == 0) goto L_0x02c2
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r12 = r12 & r1
        L_0x02c2:
            r19 = r45
            r15 = r46
            r20 = r47
            r22 = r49
            r23 = r50
            r26 = r51
            r27 = r52
            r9 = r53
            r28 = r54
            r29 = r55
            r30 = r56
            r31 = r57
            r32 = r58
            r33 = r59
            r6 = r60
            r5 = r61
            r1 = r12
            r12 = r48
            goto L_0x03c7
        L_0x02e7:
            if (r1 == 0) goto L_0x02ec
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x02ee
        L_0x02ec:
            r1 = r45
        L_0x02ee:
            if (r3 == 0) goto L_0x02f2
            r3 = 1
            goto L_0x02f4
        L_0x02f2:
            r3 = r46
        L_0x02f4:
            if (r11 == 0) goto L_0x02f8
            r9 = 0
            goto L_0x02fa
        L_0x02f8:
            r9 = r47
        L_0x02fa:
            r11 = r8 & 32
            if (r11 == 0) goto L_0x030c
            androidx.compose.runtime.t r11 = androidx.compose.material.TextKt.f2342a
            java.lang.Object r11 = r7.mo5410J(r11)
            androidx.compose.ui.text.s r11 = (androidx.compose.p015ui.text.C2023s) r11
            r22 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r22
            goto L_0x030e
        L_0x030c:
            r11 = r48
        L_0x030e:
            r22 = 0
            if (r20 == 0) goto L_0x0315
            r20 = r22
            goto L_0x0317
        L_0x0315:
            r20 = r49
        L_0x0317:
            if (r14 == 0) goto L_0x031c
            r14 = r22
            goto L_0x031e
        L_0x031c:
            r14 = r50
        L_0x031e:
            if (r2 == 0) goto L_0x0323
            r2 = r22
            goto L_0x0325
        L_0x0323:
            r2 = r51
        L_0x0325:
            if (r4 == 0) goto L_0x0328
            goto L_0x032a
        L_0x0328:
            r22 = r52
        L_0x032a:
            if (r5 == 0) goto L_0x032e
            r4 = 0
            goto L_0x0330
        L_0x032e:
            r4 = r53
        L_0x0330:
            if (r6 == 0) goto L_0x0335
            a9.b r5 = androidx.compose.p015ui.text.input.C2006x.C2007a.f4530a
            goto L_0x0337
        L_0x0335:
            r5 = r54
        L_0x0337:
            r6 = r8 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0340
            androidx.compose.foundation.text.h r6 = androidx.compose.foundation.text.C0954h.f1985e
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0342
        L_0x0340:
            r6 = r55
        L_0x0342:
            r15 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x034b
            androidx.compose.foundation.text.g r15 = androidx.compose.foundation.text.C0953g.f1978g
            r12 = r12 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x034d
        L_0x034b:
            r15 = r56
        L_0x034d:
            if (r13 == 0) goto L_0x0351
            r13 = 0
            goto L_0x0353
        L_0x0351:
            r13 = r57
        L_0x0353:
            if (r17 == 0) goto L_0x0359
            r17 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x035b
        L_0x0359:
            r17 = r58
        L_0x035b:
            if (r19 == 0) goto L_0x037a
            r45 = r0
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo5465u(r0)
            java.lang.Object r0 = r7.mo5431c0()
            r19 = r1
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x0373
            androidx.compose.foundation.interaction.k r0 = android.support.p013v4.media.C0072d.m198e(r7)
        L_0x0373:
            r1 = 0
            r7.mo5418R(r1)
            androidx.compose.foundation.interaction.j r0 = (androidx.compose.foundation.interaction.C0640j) r0
            goto L_0x0380
        L_0x037a:
            r45 = r0
            r19 = r1
            r0 = r59
        L_0x0380:
            r1 = r8 & r18
            if (r1 == 0) goto L_0x0394
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r1 = r7.mo5410J(r1)
            androidx.compose.material.q1 r1 = (androidx.compose.material.C1225q1) r1
            p.a r1 = r1.f2547a
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r12 = r12 & r18
            goto L_0x0396
        L_0x0394:
            r1 = r60
        L_0x0396:
            r18 = r8 & r23
            if (r18 == 0) goto L_0x03a6
            androidx.compose.material.TextFieldDefaults r18 = androidx.compose.material.TextFieldDefaults.f2324a
            androidx.compose.material.g0 r18 = androidx.compose.material.TextFieldDefaults.m2262e(r7)
            r23 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r12 = r12 & r23
            goto L_0x03a8
        L_0x03a6:
            r18 = r61
        L_0x03a8:
            r33 = r0
            r26 = r2
            r28 = r5
            r29 = r6
            r31 = r13
            r23 = r14
            r30 = r15
            r32 = r17
            r5 = r18
            r27 = r22
            r0 = r45
            r6 = r1
            r15 = r3
            r1 = r12
            r22 = r20
            r20 = r9
            r12 = r11
            r9 = r4
        L_0x03c7:
            r7.mo5419S()
            r2 = 1961394975(0x74e8831f, float:1.4737211E32)
            r7.mo5465u(r2)
            long r2 = r12.mo7758b()
            long r13 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x03dc
            r4 = 1
            goto L_0x03dd
        L_0x03dc:
            r4 = 0
        L_0x03dd:
            if (r4 == 0) goto L_0x03e0
            goto L_0x03ec
        L_0x03e0:
            androidx.compose.runtime.j0 r2 = r5.mo5224c(r15, r7)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r2 = r2.f3366a
        L_0x03ec:
            r4 = 0
            r7.mo5418R(r4)
            androidx.compose.ui.text.s r4 = new androidx.compose.ui.text.s
            r13 = 0
            r11 = 0
            r17 = 0
            r18 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 262142(0x3fffe, float:3.67339E-40)
            r45 = r4
            r46 = r2
            r48 = r13
            r50 = r11
            r51 = r17
            r52 = r18
            r53 = r34
            r55 = r36
            r56 = r37
            r57 = r38
            r59 = r40
            r45.<init>(r46, r48, r50, r51, r52, r53, r55, r56, r57, r59)
            androidx.compose.ui.text.s r34 = r12.mo7759c(r4)
            if (r22 == 0) goto L_0x043b
            r2 = 0
            float r3 = f2244b
            r4 = 0
            r11 = 0
            r13 = 13
            r46 = r19
            r47 = r2
            r48 = r3
            r49 = r4
            r50 = r11
            r51 = r13
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r46, r47, r48, r49, r50, r51)
            goto L_0x043d
        L_0x043b:
            r2 = r19
        L_0x043d:
            androidx.compose.runtime.j0 r3 = r5.mo5229j(r7)
            java.lang.Object r3 = r3.getValue()
            androidx.compose.ui.graphics.s r3 = (androidx.compose.p015ui.graphics.C1545s) r3
            long r3 = r3.f3366a
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.C0761x.m1655A(r2, r3, r6)
            float r3 = androidx.compose.material.TextFieldDefaults.f2326c
            float r4 = androidx.compose.material.TextFieldDefaults.f2325b
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.SizeKt.m1483c(r2, r3, r4)
            androidx.compose.ui.graphics.l0 r3 = new androidx.compose.ui.graphics.l0
            r13 = r3
            androidx.compose.runtime.j0 r4 = r5.mo5228i(r9, r7)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.s r4 = (androidx.compose.p015ui.graphics.C1545s) r4
            long r10 = r4.f3366a
            r3.<init>(r10)
            r11 = 0
            r3 = 986454116(0x3acc1864, float:0.0015571234)
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2 r4 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$2
            r45 = r4
            r46 = r43
            r47 = r15
            r48 = r31
            r49 = r28
            r50 = r33
            r51 = r9
            r52 = r22
            r53 = r23
            r54 = r26
            r55 = r27
            r56 = r5
            r57 = r0
            r58 = r1
            r59 = r6
            r45.<init>(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = p628nj.C18263b.m30805A(r7, r3, r4)
            r3 = r0 & 14
            r4 = r0 & 112(0x70, float:1.57E-43)
            r3 = r3 | r4
            r4 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r0 = r0 & r16
            r0 = r0 | r3
            int r3 = r1 << 12
            r4 = r3 & r21
            r0 = r0 | r4
            androidx.compose.foundation.text.g r4 = androidx.compose.foundation.text.C0953g.f1978g
            r0 = r0 | 0
            r4 = r3 & r24
            r0 = r0 | r4
            r4 = r3 & r25
            r0 = r0 | r4
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r4
            r16 = r0 | r3
            int r0 = r1 >> 3
            r0 = r0 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            int r1 = r1 >> 12
            r1 = r1 & 896(0x380, float:1.256E-42)
            r17 = r0 | r1
            r18 = 2048(0x800, float:2.87E-42)
            r0 = r43
            r1 = r44
            r3 = r15
            r4 = r20
            r21 = r5
            r5 = r34
            r24 = r6
            r6 = r29
            r25 = r7
            r7 = r30
            r8 = r31
            r34 = r9
            r9 = r32
            r10 = r28
            r35 = r12
            r12 = r33
            r36 = r15
            r15 = r25
            androidx.compose.foundation.text.BasicTextFieldKt.m1952b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3 = r19
            r5 = r20
            r19 = r21
            r7 = r22
            r8 = r23
            r18 = r24
            r9 = r26
            r10 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r11 = r34
            r6 = r35
            r4 = r36
        L_0x0507:
            androidx.compose.runtime.v0 r2 = r25.mo5421U()
            if (r2 != 0) goto L_0x050e
            goto L_0x0528
        L_0x050e:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3 r1 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextField$3
            r0 = r1
            r41 = r1
            r1 = r43
            r42 = r2
            r2 = r44
            r20 = r63
            r21 = r64
            r22 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r41
            r0 = r42
            r0.f3081d = r1
        L_0x0528:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.m2198a(java.lang.String, kq.l, androidx.compose.ui.d, boolean, boolean, androidx.compose.ui.text.s, kq.p, kq.p, kq.p, kq.p, boolean, androidx.compose.ui.text.input.x, androidx.compose.foundation.text.h, androidx.compose.foundation.text.g, boolean, int, androidx.compose.foundation.interaction.j, androidx.compose.ui.graphics.k0, androidx.compose.material.a2, androidx.compose.runtime.d, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0513  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2199b(androidx.compose.p015ui.C1436d r35, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r36, p753kq.C19862q<? super androidx.compose.p015ui.C1436d, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r37, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r39, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r40, boolean r41, float r42, p753kq.C19857l<? super p288y.C8347f, kotlin.C19394m> r43, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r44, androidx.compose.foundation.layout.C0759v r45, androidx.compose.runtime.C1302d r46, int r47, int r48) {
        /*
            r1 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r39
            r12 = r40
            r13 = r41
            r14 = r42
            r15 = r43
            r0 = r44
            r7 = r45
            r6 = r47
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "textField"
            kotlin.jvm.internal.C19383o.m32797g(r8, r2)
            java.lang.String r2 = "onLabelMeasured"
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            java.lang.String r2 = "border"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r2 = "paddingValues"
            kotlin.jvm.internal.C19383o.m32797g(r7, r2)
            r2 = -2049536174(0xffffffff85d68f52, float:-2.0177111E-35)
            r3 = r46
            androidx.compose.runtime.ComposerImpl r5 = r3.mo5440h(r2)
            r2 = r6 & 14
            if (r2 != 0) goto L_0x0049
            boolean r2 = r5.mo5408I(r1)
            if (r2 == 0) goto L_0x0046
            r2 = 4
            goto L_0x0047
        L_0x0046:
            r2 = 2
        L_0x0047:
            r2 = r2 | r6
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            r3 = r6 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x005a
            boolean r3 = r5.mo5408I(r8)
            if (r3 == 0) goto L_0x0057
            r3 = 32
            goto L_0x0059
        L_0x0057:
            r3 = 16
        L_0x0059:
            r2 = r2 | r3
        L_0x005a:
            r3 = r6 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x006a
            boolean r3 = r5.mo5408I(r9)
            if (r3 == 0) goto L_0x0067
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r2 = r2 | r3
        L_0x006a:
            r3 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x007a
            boolean r3 = r5.mo5408I(r10)
            if (r3 == 0) goto L_0x0077
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r3
        L_0x007a:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x008c
            boolean r3 = r5.mo5408I(r11)
            if (r3 == 0) goto L_0x0089
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008b
        L_0x0089:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x008b:
            r2 = r2 | r3
        L_0x008c:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x009d
            boolean r3 = r5.mo5408I(r12)
            if (r3 == 0) goto L_0x009a
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009c
        L_0x009a:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x009c:
            r2 = r2 | r3
        L_0x009d:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x00ae
            boolean r3 = r5.mo5427a(r13)
            if (r3 == 0) goto L_0x00ab
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ad
        L_0x00ab:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x00ad:
            r2 = r2 | r3
        L_0x00ae:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x00bf
            boolean r3 = r5.mo5428b(r14)
            if (r3 == 0) goto L_0x00bc
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00be
        L_0x00bc:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00be:
            r2 = r2 | r3
        L_0x00bf:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x00d0
            boolean r3 = r5.mo5408I(r15)
            if (r3 == 0) goto L_0x00cd
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00cf
        L_0x00cd:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00cf:
            r2 = r2 | r3
        L_0x00d0:
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r3 = r3 & r6
            if (r3 != 0) goto L_0x00e1
            boolean r3 = r5.mo5408I(r0)
            if (r3 == 0) goto L_0x00de
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00e0
        L_0x00de:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00e0:
            r2 = r2 | r3
        L_0x00e1:
            r29 = r2
            r2 = r48 & 14
            if (r2 != 0) goto L_0x00f3
            boolean r2 = r5.mo5408I(r7)
            if (r2 == 0) goto L_0x00ef
            r2 = 4
            goto L_0x00f0
        L_0x00ef:
            r2 = 2
        L_0x00f0:
            r2 = r48 | r2
            goto L_0x00f5
        L_0x00f3:
            r2 = r48
        L_0x00f5:
            r3 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r29 & r3
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r4) goto L_0x0111
            r2 = r2 & 11
            r3 = 2
            if (r2 != r3) goto L_0x0111
            boolean r2 = r5.mo5442i()
            if (r2 != 0) goto L_0x010b
            goto L_0x0111
        L_0x010b:
            r5.mo5396C()
            r11 = r5
            goto L_0x04e9
        L_0x0111:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r15
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r41)
            r4 = 1
            r2[r4] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r42)
            r4 = 2
            r2[r4] = r3
            r3 = 3
            r2[r3] = r7
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r5.mo5465u(r3)
            r3 = 4
            r4 = 0
            r16 = 0
        L_0x0132:
            if (r4 >= r3) goto L_0x0140
            r3 = r2[r4]
            boolean r3 = r5.mo5408I(r3)
            r16 = r16 | r3
            int r4 = r4 + 1
            r3 = 4
            goto L_0x0132
        L_0x0140:
            java.lang.Object r2 = r5.mo5431c0()
            if (r16 != 0) goto L_0x014a
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x0152
        L_0x014a:
            androidx.compose.material.OutlinedTextFieldMeasurePolicy r2 = new androidx.compose.material.OutlinedTextFieldMeasurePolicy
            r2.<init>(r15, r13, r14, r7)
            r5.mo5407H0(r2)
        L_0x0152:
            r3 = 0
            r5.mo5418R(r3)
            androidx.compose.material.OutlinedTextFieldMeasurePolicy r2 = (androidx.compose.material.OutlinedTextFieldMeasurePolicy) r2
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r3 = r5.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p015ui.unit.LayoutDirection) r3
            int r16 = r29 << 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r1)
            androidx.compose.runtime.l1 r1 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r17 = r5.mo5410J(r1)
            r46 = r3
            r3 = r17
            m0.b r3 = (p174m0.C7282b) r3
            java.lang.Object r17 = r5.mo5410J(r4)
            r6 = r17
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p015ui.unit.LayoutDirection) r6
            androidx.compose.runtime.l1 r7 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r17 = r5.mo5410J(r7)
            r8 = r17
            androidx.compose.ui.platform.j1 r8 = (androidx.compose.p015ui.platform.C1843j1) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r17.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = androidx.compose.p015ui.layout.C1700o.m3617a(r35)
            int r15 = r16 << 9
            r15 = r15 & 7168(0x1c00, float:1.0045E-41)
            r15 = r15 | 6
            androidx.compose.runtime.c<?> r10 = r5.f2715a
            boolean r10 = r10 instanceof androidx.compose.runtime.C1299c
            r30 = 0
            if (r10 == 0) goto L_0x0517
            r5.mo5392A()
            boolean r10 = r5.f2702K
            if (r10 == 0) goto L_0x01ac
            r5.mo5450m(r13)
            goto L_0x01af
        L_0x01ac:
            r5.mo5452n()
        L_0x01af:
            r10 = 0
            r5.f2738x = r10
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r5, r2, r10)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r5, r3, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r5, r6, r3)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r8 = p504ai.C13983i.m21490i(r5, r8, r6, r5)
            int r16 = r15 >> 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
            r14.invoke(r8, r5, r9)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r5.mo5465u(r8)
            int r8 = r15 >> 9
            r8 = r8 & 14
            r9 = 118153609(0x70ae189, float:1.0448245E-34)
            r5.mo5465u(r9)
            r8 = r8 & 11
            r9 = 2
            if (r8 != r9) goto L_0x01f5
            boolean r8 = r5.mo5442i()
            if (r8 != 0) goto L_0x01ee
            goto L_0x01f5
        L_0x01ee:
            r5.mo5396C()
            r1 = 0
            r11 = r5
            goto L_0x04e5
        L_0x01f5:
            int r8 = r29 >> 27
            r8 = r8 & 14
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.invoke(r5, r8)
            r8 = 1169914108(0x45bb78fc, float:5999.123)
            r5.mo5465u(r8)
            r8 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            if (r11 == 0) goto L_0x02ab
            androidx.compose.ui.d$a r9 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.String r14 = "Leading"
            androidx.compose.ui.d r9 = androidx.compose.p015ui.text.input.C1993m.m4358S(r9, r14)
            androidx.compose.ui.d r14 = androidx.compose.material.TextFieldImplKt.f2332d
            androidx.compose.ui.d r9 = r9.mo6148i0(r14)
            androidx.compose.ui.b r14 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r5.mo5465u(r8)
            r8 = 0
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r14, r8, r5)
            r8 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r8)
            java.lang.Object r8 = r5.mo5410J(r1)
            r20 = r8
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r8 = r5.mo5410J(r4)
            r23 = r8
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r8 = r5.mo5410J(r7)
            r26 = r8
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r8 = androidx.compose.p015ui.layout.C1700o.m3617a(r9)
            androidx.compose.runtime.c<?> r9 = r5.f2715a
            boolean r9 = r9 instanceof androidx.compose.runtime.C1299c
            if (r9 == 0) goto L_0x02a7
            r5.mo5392A()
            boolean r9 = r5.f2702K
            if (r9 == 0) goto L_0x0256
            r5.mo5450m(r13)
            goto L_0x0259
        L_0x0256:
            r5.mo5452n()
        L_0x0259:
            r9 = 0
            r5.f2738x = r9
            r16 = r5
            r18 = r10
            r19 = r5
            r21 = r2
            r22 = r5
            r24 = r3
            r25 = r5
            r27 = r6
            r28 = r5
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r9
            r17 = r8
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r8 = 1691709354(0x64d56faa, float:3.1497622E22)
            r5.mo5465u(r8)
            int r8 = r29 >> 12
            r8 = r8 & 14
            r14 = r2
            r2 = r8
            r8 = r46
            r15 = r3
            r3 = r39
            r31 = r4
            r4 = r5
            r32 = r5
            r5 = r9
            r33 = r6
            r6 = r9
            r0 = r45
            r11 = r7
            r7 = r9
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            r7 = r32
            android.support.p013v4.media.C0071c.m194f(r7, r2, r9, r9)
            goto L_0x02b8
        L_0x02a7:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x02ab:
            r0 = r45
            r8 = r46
            r14 = r2
            r15 = r3
            r31 = r4
            r33 = r6
            r11 = r7
            r7 = r5
            r9 = 0
        L_0x02b8:
            r7.mo5418R(r9)
            r2 = 1169914393(0x45bb7a19, float:5999.262)
            r7.mo5465u(r2)
            if (r12 == 0) goto L_0x0361
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.String r3 = "Trailing"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r2, r3)
            androidx.compose.ui.d r3 = androidx.compose.material.TextFieldImplKt.f2332d
            androidx.compose.ui.d r2 = r2.mo6148i0(r3)
            androidx.compose.ui.b r3 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r7.mo5465u(r4)
            r4 = 0
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r3, r4, r7)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo5465u(r3)
            java.lang.Object r3 = r7.mo5410J(r1)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            r9 = r31
            java.lang.Object r3 = r7.mo5410J(r9)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r3 = r7.mo5410J(r11)
            r26 = r3
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r3 = r7.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            if (r3 == 0) goto L_0x035d
            r7.mo5392A()
            boolean r3 = r7.f2702K
            if (r3 == 0) goto L_0x0313
            r7.mo5450m(r13)
            goto L_0x0316
        L_0x0313:
            r7.mo5452n()
        L_0x0316:
            r3 = 0
            r7.f2738x = r3
            r16 = r7
            r18 = r10
            r19 = r7
            r21 = r14
            r22 = r7
            r24 = r15
            r25 = r7
            r27 = r33
            r28 = r7
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r3
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r2 = -1351586719(0xffffffffaf706c61, float:-2.1866377E-10)
            r7.mo5465u(r2)
            int r2 = r29 >> 15
            r2 = r2 & 14
            r6 = 0
            r3 = r40
            r4 = r7
            r5 = r6
            r46 = r6
            r16 = r11
            r11 = r7
            r7 = r46
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            r3 = r46
            android.support.p013v4.media.C0071c.m194f(r11, r2, r3, r3)
            r6 = r3
            goto L_0x0367
        L_0x035d:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x0361:
            r16 = r11
            r9 = r31
            r11 = r7
            r6 = 0
        L_0x0367:
            r11.mo5418R(r6)
            float r2 = com.google.android.play.core.assetpacks.C15588c1.m25290L(r0, r8)
            float r3 = com.google.android.play.core.assetpacks.C15588c1.m25288K(r0, r8)
            androidx.compose.ui.d$a r8 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r7 = r16
            if (r39 == 0) goto L_0x0383
            float r4 = androidx.compose.material.TextFieldImplKt.f2331c
            float r2 = r2 - r4
            float r4 = (float) r6
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0383
            r18 = r4
            goto L_0x0385
        L_0x0383:
            r18 = r2
        L_0x0385:
            r19 = 0
            if (r12 == 0) goto L_0x0394
            float r2 = androidx.compose.material.TextFieldImplKt.f2331c
            float r3 = r3 - r2
            float r2 = (float) r6
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0394
            r20 = r2
            goto L_0x0396
        L_0x0394:
            r20 = r3
        L_0x0396:
            r21 = 0
            r22 = 10
            r17 = r8
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r17, r18, r19, r20, r21, r22)
            r3 = 1169915404(0x45bb7e0c, float:5999.756)
            r11.mo5465u(r3)
            r6 = r37
            if (r6 == 0) goto L_0x03bf
            java.lang.String r3 = "Hint"
            androidx.compose.ui.d r3 = androidx.compose.p015ui.text.input.C1993m.m4358S(r8, r3)
            androidx.compose.ui.d r3 = r3.mo6148i0(r2)
            int r4 = r29 >> 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.invoke(r3, r11, r4)
        L_0x03bf:
            r3 = 0
            r11.mo5418R(r3)
            java.lang.String r3 = "TextField"
            androidx.compose.ui.d r3 = androidx.compose.p015ui.text.input.C1993m.m4358S(r8, r3)
            androidx.compose.ui.d r2 = r3.mo6148i0(r2)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r3)
            androidx.compose.ui.b r5 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r3 = 1
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r5, r3, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            java.lang.Object r3 = r11.mo5410J(r1)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r3 = r11.mo5410J(r9)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r3 = r11.mo5410J(r7)
            r26 = r3
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r3 = r11.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            if (r3 == 0) goto L_0x0513
            r11.mo5392A()
            boolean r3 = r11.f2702K
            if (r3 == 0) goto L_0x040d
            r11.mo5450m(r13)
            goto L_0x0410
        L_0x040d:
            r11.mo5452n()
        L_0x0410:
            r3 = 0
            r11.f2738x = r3
            r16 = r11
            r18 = r10
            r19 = r11
            r21 = r14
            r22 = r11
            r24 = r15
            r25 = r11
            r27 = r33
            r28 = r11
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r3
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r2 = -1205597937(0xffffffffb824090f, float:-3.9109083E-5)
            r11.mo5465u(r2)
            int r2 = r29 >> 3
            r2 = r2 & 14
            r4 = 0
            r3 = r36
            r46 = r4
            r4 = r11
            r34 = r5
            r5 = r46
            r6 = r46
            r0 = r7
            r7 = r46
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            r3 = r46
            android.support.p013v4.media.C0071c.m194f(r11, r2, r3, r3)
            if (r38 == 0) goto L_0x04e4
            java.lang.String r2 = "Label"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r8, r2)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r4)
            r4 = r34
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r4, r3, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            java.lang.Object r1 = r11.mo5410J(r1)
            r20 = r1
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r1 = r11.mo5410J(r9)
            r23 = r1
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r0 = r11.mo5410J(r0)
            r26 = r0
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r1 = r11.f2715a
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            if (r1 == 0) goto L_0x04e0
            r11.mo5392A()
            boolean r1 = r11.f2702K
            if (r1 == 0) goto L_0x049f
            r11.mo5450m(r13)
            goto L_0x04a2
        L_0x049f:
            r11.mo5452n()
        L_0x04a2:
            r1 = 0
            r11.f2738x = r1
            r16 = r11
            r18 = r10
            r19 = r11
            r21 = r14
            r22 = r11
            r24 = r15
            r25 = r11
            r27 = r33
            r28 = r11
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r1
            r17 = r0
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r0 = -55131805(0xfffffffffcb6c163, float:-7.591363E36)
            r11.mo5465u(r0)
            int r0 = r29 >> 9
            r2 = r0 & 14
            r3 = r38
            r4 = r11
            r5 = r1
            r6 = r1
            r7 = r1
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r11, r0, r1, r1)
            goto L_0x04e5
        L_0x04e0:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x04e4:
            r1 = r3
        L_0x04e5:
            r0 = 1
            android.support.p013v4.media.session.C0087d.m238h(r11, r1, r1, r0, r1)
        L_0x04e9:
            androidx.compose.runtime.v0 r14 = r11.mo5421U()
            if (r14 != 0) goto L_0x04f0
            goto L_0x0512
        L_0x04f0:
            androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2 r15 = new androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
            r0 = r15
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r47
            r13 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.f3081d = r15
        L_0x0512:
            return
        L_0x0513:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x0517:
            p001a0.C0005b.m45j0()
            throw r30
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.m2199b(androidx.compose.ui.d, kq.p, kq.q, kq.p, kq.p, kq.p, boolean, float, kq.l, kq.p, androidx.compose.foundation.layout.v, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final int m2200c(int i, int i2, int i3, int i4, int i5, long j, float f, C0759v vVar) {
        float max = Math.max(vVar.mo4153d() * f, ((float) i4) / 2.0f);
        return Math.max(C7280a.m13964i(j), Math.max(i, Math.max(i2, C7279a.m13954l(max + ((float) Math.max(i3, i5)) + (vVar.mo4150a() * f)))));
    }
}
