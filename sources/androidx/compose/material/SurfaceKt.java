package androidx.compose.material;

import androidx.compose.foundation.C0555f;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.C1448j;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import kotlinx.coroutines.C19543e0;

public final class SurfaceKt {
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2234a(androidx.compose.p015ui.C1436d r22, androidx.compose.p015ui.graphics.C1530k0 r23, long r24, long r26, androidx.compose.foundation.C0556g r28, float r29, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r30, androidx.compose.runtime.C1302d r31, int r32, int r33) {
        /*
            r10 = r30
            r11 = r32
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            r0 = 1412203386(0x542c837a, float:2.96376074E12)
            r1 = r31
            androidx.compose.runtime.ComposerImpl r12 = r1.mo5440h(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L_0x001c
            r2 = r11 | 6
            r3 = r2
            r2 = r22
            goto L_0x0030
        L_0x001c:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x002d
            r2 = r22
            boolean r3 = r12.mo5408I(r2)
            if (r3 == 0) goto L_0x002a
            r3 = 4
            goto L_0x002b
        L_0x002a:
            r3 = 2
        L_0x002b:
            r3 = r3 | r11
            goto L_0x0030
        L_0x002d:
            r2 = r22
            r3 = r11
        L_0x0030:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x004a
        L_0x0037:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r23
            boolean r6 = r12.mo5408I(r5)
            if (r6 == 0) goto L_0x0046
            r6 = 32
            goto L_0x0048
        L_0x0046:
            r6 = 16
        L_0x0048:
            r3 = r3 | r6
            goto L_0x004c
        L_0x004a:
            r5 = r23
        L_0x004c:
            r6 = r11 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0065
            r6 = r33 & 4
            if (r6 != 0) goto L_0x005f
            r6 = r24
            boolean r8 = r12.mo5434e(r6)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r6 = r24
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
            goto L_0x0067
        L_0x0065:
            r6 = r24
        L_0x0067:
            r8 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r33 & 8
            if (r8 != 0) goto L_0x007a
            r8 = r26
            boolean r13 = r12.mo5434e(r8)
            if (r13 == 0) goto L_0x007c
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007a:
            r8 = r26
        L_0x007c:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r13
            goto L_0x0082
        L_0x0080:
            r8 = r26
        L_0x0082:
            r13 = r33 & 16
            if (r13 == 0) goto L_0x0089
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009e
        L_0x0089:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x009e
            r14 = r28
            boolean r15 = r12.mo5408I(r14)
            if (r15 == 0) goto L_0x009a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r3 = r3 | r15
            goto L_0x00a0
        L_0x009e:
            r14 = r28
        L_0x00a0:
            r15 = r33 & 32
            if (r15 == 0) goto L_0x00ab
            r16 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r16
            r1 = r29
            goto L_0x00c0
        L_0x00ab:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r11 & r16
            r1 = r29
            if (r16 != 0) goto L_0x00c0
            boolean r16 = r12.mo5428b(r1)
            if (r16 == 0) goto L_0x00bc
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00be
        L_0x00bc:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00be:
            r3 = r3 | r16
        L_0x00c0:
            r16 = r33 & 64
            if (r16 == 0) goto L_0x00c7
            r16 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00d8
        L_0x00c7:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r16 = r11 & r16
            if (r16 != 0) goto L_0x00da
            boolean r16 = r12.mo5408I(r10)
            if (r16 == 0) goto L_0x00d6
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r3 = r3 | r16
        L_0x00da:
            r16 = 2995931(0x2db6db, float:4.198194E-39)
            r1 = r3 & r16
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r2) goto L_0x00f8
            boolean r1 = r12.mo5442i()
            if (r1 != 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            r12.mo5396C()
            r1 = r22
            r2 = r5
            r3 = r6
            r5 = r8
            r7 = r14
            r8 = r29
            goto L_0x01af
        L_0x00f8:
            r12.mo5466u0()
            r1 = r11 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0125
            boolean r1 = r12.mo5425Y()
            if (r1 == 0) goto L_0x0107
            goto L_0x0125
        L_0x0107:
            r12.mo5396C()
            r0 = r33 & 4
            if (r0 == 0) goto L_0x0110
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0110:
            r0 = r33 & 8
            if (r0 == 0) goto L_0x0120
            r0 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r13 = r22
            r18 = r29
            r15 = r6
            r17 = r14
            r6 = r0
        L_0x011e:
            r14 = r5
            goto L_0x015d
        L_0x0120:
            r0 = r22
        L_0x0122:
            r1 = r29
            goto L_0x0155
        L_0x0125:
            if (r0 == 0) goto L_0x012a
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x012c
        L_0x012a:
            r0 = r22
        L_0x012c:
            if (r4 == 0) goto L_0x0131
            androidx.compose.ui.graphics.e0$a r1 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            r5 = r1
        L_0x0131:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x0143
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r12.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r6 = r1.mo5363j()
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0143:
            r1 = r33 & 8
            if (r1 == 0) goto L_0x014e
            long r8 = androidx.compose.material.ColorsKt.m2174b(r6, r12)
            r1 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            r3 = r1
        L_0x014e:
            if (r13 == 0) goto L_0x0152
            r1 = 0
            r14 = r1
        L_0x0152:
            if (r15 == 0) goto L_0x0122
            float r1 = (float) r2
        L_0x0155:
            r13 = r0
            r18 = r1
            r15 = r6
            r17 = r14
            r6 = r3
            goto L_0x011e
        L_0x015d:
            r12.mo5419S()
            androidx.compose.runtime.t r0 = androidx.compose.material.ElevationOverlayKt.f2207b
            java.lang.Object r1 = r12.mo5410J(r0)
            m0.d r1 = (p174m0.C7284d) r1
            float r1 = r1.f16155b
            float r5 = r1 + r18
            r1 = 2
            androidx.compose.runtime.t0[] r7 = new androidx.compose.runtime.C1412t0[r1]
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            androidx.compose.ui.graphics.s r3 = new androidx.compose.ui.graphics.s
            r3.<init>(r8)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r3)
            r7[r2] = r1
            m0.d r1 = new m0.d
            r1.<init>(r5)
            androidx.compose.runtime.t0 r0 = r0.mo5908b(r1)
            r1 = 1
            r7[r1] = r0
            r3 = -1822160838(0xffffffff9364083a, float:-2.8781702E-27)
            androidx.compose.material.SurfaceKt$Surface$1 r4 = new androidx.compose.material.SurfaceKt$Surface$1
            r0 = r4
            r1 = r13
            r2 = r14
            r10 = r3
            r11 = r4
            r3 = r15
            r19 = r7
            r7 = r17
            r20 = r8
            r8 = r18
            r9 = r30
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r12, r10, r11)
            r1 = 56
            r2 = r19
            androidx.compose.runtime.CompositionLocalKt.m2530a(r2, r0, r12, r1)
            r1 = r13
            r2 = r14
            r5 = r20
        L_0x01af:
            androidx.compose.runtime.v0 r12 = r12.mo5421U()
            if (r12 != 0) goto L_0x01b6
            goto L_0x01c4
        L_0x01b6:
            androidx.compose.material.SurfaceKt$Surface$2 r13 = new androidx.compose.material.SurfaceKt$Surface$2
            r0 = r13
            r9 = r30
            r10 = r32
            r11 = r33
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m2234a(androidx.compose.ui.d, androidx.compose.ui.graphics.k0, long, long, androidx.compose.foundation.g, float, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0127  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2235b(p753kq.C19846a<kotlin.C19394m> r29, androidx.compose.p015ui.C1436d r30, boolean r31, androidx.compose.p015ui.graphics.C1530k0 r32, long r33, long r35, androidx.compose.foundation.C0556g r37, float r38, androidx.compose.foundation.interaction.C0640j r39, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r40, androidx.compose.runtime.C1302d r41, int r42, int r43) {
        /*
            r13 = r29
            r14 = r40
            r15 = r42
            r12 = r43
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1560876237(0x5d0914cd, float:6.1735908E17)
            r1 = r41
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r15 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r15 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo5408I(r13)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r15
            goto L_0x0032
        L_0x0031:
            r0 = r15
        L_0x0032:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r15 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            r2 = r30
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
            r2 = r30
        L_0x004e:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0055
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r4 = r15 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0068
            r4 = r31
            boolean r5 = r11.mo5427a(r4)
            if (r5 == 0) goto L_0x0064
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r0 = r0 | r5
            goto L_0x006a
        L_0x0068:
            r4 = r31
        L_0x006a:
            r5 = r12 & 8
            if (r5 == 0) goto L_0x0071
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0084
            r6 = r32
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r0 = r0 | r7
            goto L_0x0086
        L_0x0084:
            r6 = r32
        L_0x0086:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r15
            if (r7 != 0) goto L_0x00a1
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009b
            r7 = r33
            boolean r9 = r11.mo5434e(r7)
            if (r9 == 0) goto L_0x009d
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r7 = r33
        L_0x009d:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r9
            goto L_0x00a3
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r15
            if (r9 != 0) goto L_0x00be
            r9 = r12 & 32
            if (r9 != 0) goto L_0x00b7
            r9 = r35
            boolean r16 = r11.mo5434e(r9)
            if (r16 == 0) goto L_0x00b9
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r9 = r35
        L_0x00b9:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r16
            goto L_0x00c0
        L_0x00be:
            r9 = r35
        L_0x00c0:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x00cb
            r17 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r17
            r2 = r37
            goto L_0x00e0
        L_0x00cb:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r15 & r17
            r2 = r37
            if (r17 != 0) goto L_0x00e0
            boolean r17 = r11.mo5408I(r2)
            if (r17 == 0) goto L_0x00dc
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r0 = r0 | r17
        L_0x00e0:
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00eb
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r17
            r4 = r38
            goto L_0x0100
        L_0x00eb:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            r4 = r38
            if (r17 != 0) goto L_0x0100
            boolean r17 = r11.mo5428b(r4)
            if (r17 == 0) goto L_0x00fc
            r17 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fc:
            r17 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r0 = r0 | r17
        L_0x0100:
            r4 = r12 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x010b
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r17
            r6 = r39
            goto L_0x0120
        L_0x010b:
            r17 = 234881024(0xe000000, float:1.5777218E-30)
            r17 = r15 & r17
            r6 = r39
            if (r17 != 0) goto L_0x0120
            boolean r17 = r11.mo5408I(r6)
            if (r17 == 0) goto L_0x011c
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011e
        L_0x011c:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011e:
            r0 = r0 | r17
        L_0x0120:
            r6 = r12 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0127
            r6 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0137
        L_0x0127:
            r6 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r6 & r15
            if (r6 != 0) goto L_0x0138
            boolean r6 = r11.mo5408I(r14)
            if (r6 == 0) goto L_0x0135
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0137
        L_0x0135:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0137:
            r0 = r0 | r6
        L_0x0138:
            r6 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r6 & r0
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x015d
            boolean r6 = r11.mo5442i()
            if (r6 != 0) goto L_0x0148
            goto L_0x015d
        L_0x0148:
            r11.mo5396C()
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r33
            r7 = r9
            r15 = r11
            r9 = r37
            r10 = r38
            r11 = r39
            goto L_0x026e
        L_0x015d:
            r11.mo5466u0()
            r6 = r15 & 1
            r7 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = 1
            if (r6 == 0) goto L_0x0191
            boolean r6 = r11.mo5425Y()
            if (r6 == 0) goto L_0x0170
            goto L_0x0191
        L_0x0170:
            r11.mo5396C()
            r1 = r12 & 16
            if (r1 == 0) goto L_0x017b
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r1
        L_0x017b:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0180
            r0 = r0 & r7
        L_0x0180:
            r16 = r30
            r18 = r31
            r19 = r32
            r20 = r33
            r22 = r37
            r23 = r38
            r24 = r39
            r6 = r0
            goto L_0x0206
        L_0x0191:
            if (r1 == 0) goto L_0x0196
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0198
        L_0x0196:
            r1 = r30
        L_0x0198:
            if (r3 == 0) goto L_0x019d
            r3 = r17
            goto L_0x019f
        L_0x019d:
            r3 = r31
        L_0x019f:
            if (r5 == 0) goto L_0x01a4
            androidx.compose.ui.graphics.e0$a r5 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            goto L_0x01a6
        L_0x01a4:
            r5 = r32
        L_0x01a6:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x01bd
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r6 = r11.mo5410J(r6)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            long r18 = r6.mo5363j()
            r6 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r6
            r8 = r18
            goto L_0x01bf
        L_0x01bd:
            r8 = r33
        L_0x01bf:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x01c9
            long r18 = androidx.compose.material.ColorsKt.m2174b(r8, r11)
            r0 = r0 & r7
            goto L_0x01cb
        L_0x01c9:
            r18 = r35
        L_0x01cb:
            if (r16 == 0) goto L_0x01cf
            r6 = 0
            goto L_0x01d1
        L_0x01cf:
            r6 = r37
        L_0x01d1:
            if (r2 == 0) goto L_0x01d6
            r2 = 0
            float r2 = (float) r2
            goto L_0x01d8
        L_0x01d6:
            r2 = r38
        L_0x01d8:
            if (r4 == 0) goto L_0x01f3
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r4)
            java.lang.Object r4 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r7 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r7) goto L_0x01ec
            androidx.compose.foundation.interaction.k r4 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x01ec:
            r7 = 0
            r11.mo5418R(r7)
            androidx.compose.foundation.interaction.j r4 = (androidx.compose.foundation.interaction.C0640j) r4
            goto L_0x01f5
        L_0x01f3:
            r4 = r39
        L_0x01f5:
            r16 = r1
            r23 = r2
            r24 = r4
            r22 = r6
            r20 = r8
            r9 = r18
            r6 = r0
            r18 = r3
            r19 = r5
        L_0x0206:
            r11.mo5419S()
            androidx.compose.runtime.t r0 = androidx.compose.material.ElevationOverlayKt.f2207b
            java.lang.Object r1 = r11.mo5410J(r0)
            m0.d r1 = (p174m0.C7284d) r1
            float r1 = r1.f16155b
            float r5 = r1 + r23
            r1 = 2
            androidx.compose.runtime.t0[] r8 = new androidx.compose.runtime.C1412t0[r1]
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
            r2.<init>(r9)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r2)
            r2 = 0
            r8[r2] = r1
            m0.d r1 = new m0.d
            r1.<init>(r5)
            androidx.compose.runtime.t0 r0 = r0.mo5908b(r1)
            r8[r17] = r0
            r7 = 2031491085(0x7916180d, float:4.870827E34)
            androidx.compose.material.SurfaceKt$Surface$4 r3 = new androidx.compose.material.SurfaceKt$Surface$4
            r0 = r3
            r1 = r16
            r2 = r19
            r13 = r3
            r3 = r20
            r14 = r7
            r7 = r22
            r25 = r8
            r8 = r23
            r26 = r9
            r9 = r24
            r10 = r18
            r15 = r11
            r11 = r29
            r12 = r40
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r15, r14, r13)
            r1 = 56
            r2 = r25
            androidx.compose.runtime.CompositionLocalKt.m2530a(r2, r0, r15, r1)
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r9 = r22
            r10 = r23
            r11 = r24
            r7 = r26
        L_0x026e:
            androidx.compose.runtime.v0 r15 = r15.mo5421U()
            if (r15 != 0) goto L_0x0275
            goto L_0x0289
        L_0x0275:
            androidx.compose.material.SurfaceKt$Surface$5 r14 = new androidx.compose.material.SurfaceKt$Surface$5
            r0 = r14
            r1 = r29
            r12 = r40
            r13 = r42
            r28 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14)
            r0 = r28
            r15.f3081d = r0
        L_0x0289:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m2235b(kq.a, androidx.compose.ui.d, boolean, androidx.compose.ui.graphics.k0, long, long, androidx.compose.foundation.g, float, androidx.compose.foundation.interaction.j, kq.p, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2236c(boolean r32, p753kq.C19846a<kotlin.C19394m> r33, androidx.compose.p015ui.C1436d r34, boolean r35, androidx.compose.p015ui.graphics.C1530k0 r36, long r37, long r39, androidx.compose.foundation.C0556g r41, float r42, androidx.compose.foundation.interaction.C0640j r43, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r44, androidx.compose.runtime.C1302d r45, int r46, int r47, int r48) {
        /*
            r15 = r33
            r14 = r44
            r13 = r46
            r12 = r48
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 262027249(0xf9e37f1, float:1.560155E-29)
            r1 = r45
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0024
            r0 = r13 | 6
            r10 = r32
            goto L_0x0036
        L_0x0024:
            r0 = r13 & 14
            r10 = r32
            if (r0 != 0) goto L_0x0035
            boolean r0 = r11.mo5427a(r10)
            if (r0 == 0) goto L_0x0032
            r0 = 4
            goto L_0x0033
        L_0x0032:
            r0 = 2
        L_0x0033:
            r0 = r0 | r13
            goto L_0x0036
        L_0x0035:
            r0 = r13
        L_0x0036:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x003d
            r0 = r0 | 48
            goto L_0x004d
        L_0x003d:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004d
            boolean r1 = r11.mo5408I(r15)
            if (r1 == 0) goto L_0x004a
            r1 = 32
            goto L_0x004c
        L_0x004a:
            r1 = 16
        L_0x004c:
            r0 = r0 | r1
        L_0x004d:
            r1 = r12 & 4
            if (r1 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0054:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0067
            r2 = r34
            boolean r3 = r11.mo5408I(r2)
            if (r3 == 0) goto L_0x0063
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r3
            goto L_0x0069
        L_0x0067:
            r2 = r34
        L_0x0069:
            r3 = r12 & 8
            if (r3 == 0) goto L_0x0070
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0070:
            r4 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0083
            r4 = r35
            boolean r5 = r11.mo5427a(r4)
            if (r5 == 0) goto L_0x007f
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r0 = r0 | r5
            goto L_0x0085
        L_0x0083:
            r4 = r35
        L_0x0085:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x008c
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008c:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00a1
            r6 = r36
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x009d
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r7
            goto L_0x00a3
        L_0x00a1:
            r6 = r36
        L_0x00a3:
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00bd
            r7 = r12 & 32
            if (r7 != 0) goto L_0x00b7
            r7 = r37
            boolean r9 = r11.mo5434e(r7)
            if (r9 == 0) goto L_0x00b9
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r7 = r37
        L_0x00b9:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r9
            goto L_0x00bf
        L_0x00bd:
            r7 = r37
        L_0x00bf:
            r9 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00d7
            r9 = r12 & 64
            r6 = r39
            if (r9 != 0) goto L_0x00d3
            boolean r8 = r11.mo5434e(r6)
            if (r8 == 0) goto L_0x00d3
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r8 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r0 = r0 | r8
            goto L_0x00d9
        L_0x00d7:
            r6 = r39
        L_0x00d9:
            r8 = r12 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00e1
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r9
            goto L_0x00f6
        L_0x00e1:
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r13
            if (r9 != 0) goto L_0x00f6
            r9 = r41
            boolean r16 = r11.mo5408I(r9)
            if (r16 == 0) goto L_0x00f1
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f3
        L_0x00f1:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f3:
            r0 = r0 | r16
            goto L_0x00f8
        L_0x00f6:
            r9 = r41
        L_0x00f8:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0103
            r16 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r16
            r4 = r42
            goto L_0x0118
        L_0x0103:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r13 & r16
            r4 = r42
            if (r16 != 0) goto L_0x0118
            boolean r16 = r11.mo5428b(r4)
            if (r16 == 0) goto L_0x0114
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0116
        L_0x0114:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0116:
            r0 = r0 | r16
        L_0x0118:
            r4 = r12 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0123
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r0 | r16
            r6 = r43
            goto L_0x0137
        L_0x0123:
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r16 = r13 & r16
            r6 = r43
            if (r16 != 0) goto L_0x0137
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x0134
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r0 = r0 | r7
        L_0x0137:
            r7 = r12 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x013e
            r7 = r47 | 6
            goto L_0x014d
        L_0x013e:
            r7 = r47 & 14
            if (r7 != 0) goto L_0x0150
            boolean r7 = r11.mo5408I(r14)
            if (r7 == 0) goto L_0x014a
            r7 = 4
            goto L_0x014b
        L_0x014a:
            r7 = 2
        L_0x014b:
            r7 = r47 | r7
        L_0x014d:
            r16 = r7
            goto L_0x0152
        L_0x0150:
            r16 = r47
        L_0x0152:
            r7 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r7 = r7 & r0
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r6) goto L_0x017c
            r6 = r16 & 11
            r7 = 2
            if (r6 != r7) goto L_0x017c
            boolean r6 = r11.mo5442i()
            if (r6 != 0) goto L_0x0167
            goto L_0x017c
        L_0x0167:
            r11.mo5396C()
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r12 = r43
            r10 = r9
            r1 = r11
            r8 = r39
            r11 = r42
            goto L_0x0299
        L_0x017c:
            r11.mo5466u0()
            r6 = r13 & 1
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r18 = 1
            if (r6 == 0) goto L_0x01b3
            boolean r6 = r11.mo5425Y()
            if (r6 == 0) goto L_0x0192
            goto L_0x01b3
        L_0x0192:
            r11.mo5396C()
            r1 = r12 & 32
            if (r1 == 0) goto L_0x019b
            r0 = r0 & r17
        L_0x019b:
            r1 = r12 & 64
            if (r1 == 0) goto L_0x01a0
            r0 = r0 & r7
        L_0x01a0:
            r17 = r34
            r19 = r35
            r20 = r36
            r21 = r37
            r24 = r42
            r25 = r43
            r6 = r0
            r23 = r9
            r8 = r39
            goto L_0x022b
        L_0x01b3:
            if (r1 == 0) goto L_0x01b8
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x01ba
        L_0x01b8:
            r1 = r34
        L_0x01ba:
            if (r3 == 0) goto L_0x01bf
            r3 = r18
            goto L_0x01c1
        L_0x01bf:
            r3 = r35
        L_0x01c1:
            if (r5 == 0) goto L_0x01c6
            androidx.compose.ui.graphics.e0$a r5 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            goto L_0x01c8
        L_0x01c6:
            r5 = r36
        L_0x01c8:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x01de
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r6 = r11.mo5410J(r6)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            long r19 = r6.mo5363j()
            r0 = r0 & r17
            r6 = r8
            r7 = r19
            goto L_0x01e1
        L_0x01de:
            r6 = r8
            r7 = r37
        L_0x01e1:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x01ef
            long r19 = androidx.compose.material.ColorsKt.m2174b(r7, r11)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r0 = r0 & r17
            goto L_0x01f1
        L_0x01ef:
            r19 = r39
        L_0x01f1:
            if (r6 == 0) goto L_0x01f5
            r6 = 0
            goto L_0x01f6
        L_0x01f5:
            r6 = r9
        L_0x01f6:
            if (r2 == 0) goto L_0x01fb
            r2 = 0
            float r2 = (float) r2
            goto L_0x01fd
        L_0x01fb:
            r2 = r42
        L_0x01fd:
            if (r4 == 0) goto L_0x0218
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r4)
            java.lang.Object r4 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r9) goto L_0x0211
            androidx.compose.foundation.interaction.k r4 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x0211:
            r9 = 0
            r11.mo5418R(r9)
            androidx.compose.foundation.interaction.j r4 = (androidx.compose.foundation.interaction.C0640j) r4
            goto L_0x021a
        L_0x0218:
            r4 = r43
        L_0x021a:
            r17 = r1
            r24 = r2
            r25 = r4
            r23 = r6
            r21 = r7
            r8 = r19
            r6 = r0
            r19 = r3
            r20 = r5
        L_0x022b:
            r11.mo5419S()
            androidx.compose.runtime.t r0 = androidx.compose.material.ElevationOverlayKt.f2207b
            java.lang.Object r1 = r11.mo5410J(r0)
            m0.d r1 = (p174m0.C7284d) r1
            float r1 = r1.f16155b
            float r5 = r1 + r24
            r1 = 2
            androidx.compose.runtime.t0[] r7 = new androidx.compose.runtime.C1412t0[r1]
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
            r2.<init>(r8)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r2)
            r2 = 0
            r7[r2] = r1
            m0.d r1 = new m0.d
            r1.<init>(r5)
            androidx.compose.runtime.t0 r0 = r0.mo5908b(r1)
            r7[r18] = r0
            androidx.compose.material.SurfaceKt$Surface$7 r3 = new androidx.compose.material.SurfaceKt$Surface$7
            r0 = r3
            r1 = r17
            r2 = r20
            r15 = r3
            r3 = r21
            r26 = r7
            r7 = r23
            r27 = r8
            r8 = r24
            r9 = r32
            r10 = r25
            r29 = r11
            r11 = r19
            r12 = r33
            r13 = r44
            r14 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = -1391199439(0xffffffffad13fb31, float:-8.411758E-12)
            r1 = r29
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r1, r0, r15)
            r2 = 56
            r3 = r26
            androidx.compose.runtime.CompositionLocalKt.m2530a(r3, r0, r1, r2)
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            r8 = r27
        L_0x0299:
            androidx.compose.runtime.v0 r15 = r1.mo5421U()
            if (r15 != 0) goto L_0x02a0
            goto L_0x02bc
        L_0x02a0:
            androidx.compose.material.SurfaceKt$Surface$8 r14 = new androidx.compose.material.SurfaceKt$Surface$8
            r0 = r14
            r1 = r32
            r2 = r33
            r13 = r44
            r30 = r14
            r14 = r46
            r31 = r15
            r15 = r47
            r16 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16)
            r1 = r30
            r0 = r31
            r0.f3081d = r1
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m2236c(boolean, kq.a, androidx.compose.ui.d, boolean, androidx.compose.ui.graphics.k0, long, long, androidx.compose.foundation.g, float, androidx.compose.foundation.interaction.j, kq.p, androidx.compose.runtime.d, int, int, int):void");
    }

    /* renamed from: d */
    public static final C1436d m2237d(C1436d dVar, C1530k0 k0Var, long j, C0556g gVar, float f) {
        return C19543e0.m33286B(C0761x.m1655A(C1448j.m3094a(dVar, f, k0Var, 24).mo6148i0(gVar != null ? C0555f.m1342a(gVar, k0Var) : C1436d.C1437a.f3125b), j, k0Var), k0Var);
    }

    /* renamed from: e */
    public static final long m2238e(long j, C1215n0 n0Var, float f, C1302d dVar, int i) {
        dVar.mo5465u(1561611256);
        if (C1545s.m3357c(j, ((C1259v) dVar.mo5410J(ColorsKt.f2187a)).mo5363j()) && n0Var != null) {
            j = n0Var.mo5221a(j, f, dVar, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        dVar.mo5406H();
        return j;
    }
}
