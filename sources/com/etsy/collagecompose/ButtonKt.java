package com.etsy.collagecompose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.TestTagKt;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.font.C1957k;
import androidx.compose.p015ui.text.font.C1959m;
import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.collagecompose.C12142d;
import com.etsy.collagecompose.C12145e;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import p753kq.C19857l;

public final class ButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x067c  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x068e  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x08e9  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08ff  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19939a(com.etsy.collagecompose.C12145e r38, p753kq.C19846a<kotlin.C19394m> r39, androidx.compose.p015ui.C1436d r40, java.lang.String r41, java.lang.String r42, com.etsy.collagecompose.C12142d r43, java.lang.Integer r44, boolean r45, boolean r46, androidx.compose.runtime.C1302d r47, int r48, int r49) {
        /*
            r1 = r38
            r2 = r39
            r10 = r48
            r11 = r49
            java.lang.String r0 = "style"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            r0 = 608200533(0x24406755, float:4.172089E-17)
            r3 = r47
            androidx.compose.runtime.ComposerImpl r0 = r3.mo5440h(r0)
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r10 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r10 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r0.mo5408I(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r10
            goto L_0x0032
        L_0x0031:
            r3 = r10
        L_0x0032:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0049
            boolean r4 = r0.mo5408I(r2)
            if (r4 == 0) goto L_0x0046
            r4 = 32
            goto L_0x0048
        L_0x0046:
            r4 = 16
        L_0x0048:
            r3 = r3 | r4
        L_0x0049:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0050
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0050:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            r5 = r40
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x005f
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r3 = r3 | r6
            goto L_0x0065
        L_0x0063:
            r5 = r40
        L_0x0065:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007f
        L_0x006c:
            r7 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x007f
            r7 = r41
            boolean r8 = r0.mo5408I(r7)
            if (r8 == 0) goto L_0x007b
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x007b:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r3 = r3 | r8
            goto L_0x0081
        L_0x007f:
            r7 = r41
        L_0x0081:
            r8 = r11 & 16
            if (r8 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x0088:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x009d
            r9 = r42
            boolean r12 = r0.mo5408I(r9)
            if (r12 == 0) goto L_0x0099
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r12
            goto L_0x009f
        L_0x009d:
            r9 = r42
        L_0x009f:
            r12 = r11 & 32
            if (r12 == 0) goto L_0x00a7
            r13 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r13
            goto L_0x00bb
        L_0x00a7:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00bb
            r13 = r43
            boolean r14 = r0.mo5408I(r13)
            if (r14 == 0) goto L_0x00b7
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r3 = r3 | r14
            goto L_0x00bd
        L_0x00bb:
            r13 = r43
        L_0x00bd:
            r14 = r11 & 64
            if (r14 == 0) goto L_0x00c5
            r15 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r15
            goto L_0x00da
        L_0x00c5:
            r15 = 3670016(0x380000, float:5.142788E-39)
            r15 = r15 & r10
            if (r15 != 0) goto L_0x00da
            r15 = r44
            boolean r16 = r0.mo5408I(r15)
            if (r16 == 0) goto L_0x00d5
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d7
        L_0x00d5:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00d7:
            r3 = r3 | r16
            goto L_0x00dc
        L_0x00da:
            r15 = r44
        L_0x00dc:
            r2 = r11 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e7
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r16
            r5 = r45
            goto L_0x00fc
        L_0x00e7:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r10 & r16
            r5 = r45
            if (r16 != 0) goto L_0x00fc
            boolean r16 = r0.mo5427a(r5)
            if (r16 == 0) goto L_0x00f8
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r3 = r3 | r16
        L_0x00fc:
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            r16 = r10 & r16
            if (r16 != 0) goto L_0x0118
            r5 = r11 & 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x0111
            r5 = r46
            boolean r16 = r0.mo5427a(r5)
            if (r16 == 0) goto L_0x0113
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0115
        L_0x0111:
            r5 = r46
        L_0x0113:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0115:
            r3 = r3 | r16
            goto L_0x011a
        L_0x0118:
            r5 = r46
        L_0x011a:
            r16 = 191739611(0xb6db6db, float:4.5782105E-32)
            r5 = r3 & r16
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r7) goto L_0x013b
            boolean r5 = r0.mo5442i()
            if (r5 != 0) goto L_0x012b
            goto L_0x013b
        L_0x012b:
            r0.mo5396C()
            r3 = r40
            r4 = r41
            r8 = r45
            r5 = r9
            r6 = r13
            r7 = r15
            r9 = r46
            goto L_0x08e2
        L_0x013b:
            r0.mo5466u0()
            r5 = r10 & 1
            r7 = 0
            if (r5 == 0) goto L_0x0164
            boolean r5 = r0.mo5425Y()
            if (r5 == 0) goto L_0x014a
            goto L_0x0164
        L_0x014a:
            r0.mo5396C()
            r2 = r11 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0155
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r2
        L_0x0155:
            r4 = r40
            r5 = r41
            r2 = r45
            r26 = r3
            r6 = r9
            r8 = r13
            r9 = r15
            r12 = 1
            r3 = r46
            goto L_0x01ac
        L_0x0164:
            if (r4 == 0) goto L_0x0169
            androidx.compose.ui.d$a r4 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x016b
        L_0x0169:
            r4 = r40
        L_0x016b:
            if (r6 == 0) goto L_0x016f
            r5 = 0
            goto L_0x0171
        L_0x016f:
            r5 = r41
        L_0x0171:
            if (r8 == 0) goto L_0x0175
            r6 = 0
            goto L_0x0176
        L_0x0175:
            r6 = r9
        L_0x0176:
            if (r12 == 0) goto L_0x017b
            com.etsy.collagecompose.d$a r8 = com.etsy.collagecompose.C12142d.C12143a.f27081a
            goto L_0x017c
        L_0x017b:
            r8 = r13
        L_0x017c:
            if (r14 == 0) goto L_0x0180
            r9 = 0
            goto L_0x0181
        L_0x0180:
            r9 = r15
        L_0x0181:
            if (r2 == 0) goto L_0x0185
            r2 = 1
            goto L_0x0187
        L_0x0185:
            r2 = r45
        L_0x0187:
            r12 = r11 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x01a6
            androidx.compose.runtime.t r12 = androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt.f3986a
            java.lang.Object r12 = r0.mo5410J(r12)
            android.content.res.Configuration r12 = (android.content.res.Configuration) r12
            int r12 = r12.uiMode
            r12 = r12 & 48
            r13 = 32
            if (r12 != r13) goto L_0x019e
            r12 = 1
            r13 = 1
            goto L_0x01a0
        L_0x019e:
            r13 = r7
            r12 = 1
        L_0x01a0:
            r13 = r13 ^ r12
            r14 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r3 = r3 & r14
            goto L_0x01a9
        L_0x01a6:
            r12 = 1
            r13 = r46
        L_0x01a9:
            r26 = r3
            r3 = r13
        L_0x01ac:
            r0.mo5419S()
            if (r5 == 0) goto L_0x01ba
            int r13 = r5.length()
            if (r13 != 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r13 = r7
            goto L_0x01bb
        L_0x01ba:
            r13 = r12
        L_0x01bb:
            if (r13 == 0) goto L_0x01d2
            if (r6 == 0) goto L_0x01c7
            int r13 = r6.length()
            if (r13 != 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r12 = r7
        L_0x01c7:
            if (r12 != 0) goto L_0x01ca
            goto L_0x01d2
        L_0x01ca:
            com.etsy.android.stylekit.accessibility.exceptions.EtsyAccessibilityException r0 = new com.etsy.android.stylekit.accessibility.exceptions.EtsyAccessibilityException
            java.lang.String r1 = "Buttons need to have either text or a content description."
            r0.<init>(r1)
            throw r0
        L_0x01d2:
            com.etsy.collagecompose.d$a r13 = com.etsy.collagecompose.C12142d.C12143a.f27081a
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r8, r13)
            if (r12 == 0) goto L_0x01f0
            r12 = -329158726(0xffffffffec616fba, float:-1.0901437E27)
            r0.mo5465u(r12)
            androidx.compose.runtime.l1 r12 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r12 = r0.mo5410J(r12)
            com.etsy.collagecompose.k r12 = (com.etsy.collagecompose.C12160k) r12
            androidx.compose.ui.text.s r12 = r12.f27197c
            r0.mo5418R(r7)
        L_0x01ed:
            r27 = r12
            goto L_0x020c
        L_0x01f0:
            com.etsy.collagecompose.d$b r12 = com.etsy.collagecompose.C12142d.C12144b.f27082a
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r8, r12)
            if (r12 == 0) goto L_0x0924
            r12 = -329158664(0xffffffffec616ff8, float:-1.0901483E27)
            r0.mo5465u(r12)
            androidx.compose.runtime.l1 r12 = com.etsy.collagecompose.TypographyKt.f27060a
            java.lang.Object r12 = r0.mo5410J(r12)
            com.etsy.collagecompose.k r12 = (com.etsy.collagecompose.C12160k) r12
            androidx.compose.ui.text.s r12 = r12.f27198d
            r0.mo5418R(r7)
            goto L_0x01ed
        L_0x020c:
            com.etsy.collagecompose.e$a r12 = com.etsy.collagecompose.C12145e.C12146a.f27083a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r1, r12)
            if (r14 == 0) goto L_0x0248
            r14 = -329158489(0xffffffffec6170a7, float:-1.0901612E27)
            r0.mo5465u(r14)
            if (r3 == 0) goto L_0x0230
            r14 = -329158476(0xffffffffec6170b4, float:-1.09016214E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27123b
            r0.mo5418R(r7)
            goto L_0x0243
        L_0x0230:
            r14 = -329158401(0xffffffffec6170ff, float:-1.0901677E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27125c
            r0.mo5418R(r7)
        L_0x0243:
            r0.mo5418R(r7)
            goto L_0x030f
        L_0x0248:
            com.etsy.collagecompose.e$b r14 = com.etsy.collagecompose.C12145e.C12147b.f27084a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r1, r14)
            if (r14 == 0) goto L_0x0252
            r14 = 1
            goto L_0x0258
        L_0x0252:
            com.etsy.collagecompose.e$d r14 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r1, r14)
        L_0x0258:
            if (r14 == 0) goto L_0x025c
            r14 = 1
            goto L_0x0262
        L_0x025c:
            com.etsy.collagecompose.e$e r14 = com.etsy.collagecompose.C12145e.C12150e.f27087a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r1, r14)
        L_0x0262:
            if (r14 == 0) goto L_0x02b6
            r14 = -329158125(0xffffffffec617213, float:-1.09018804E27)
            r0.mo5465u(r14)
            if (r2 == 0) goto L_0x029f
            r14 = -329158098(0xffffffffec61722e, float:-1.09019E27)
            r0.mo5465u(r14)
            if (r3 == 0) goto L_0x0288
            r14 = -329158067(0xffffffffec61724d, float:-1.0901923E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27125c
            r0.mo5418R(r7)
            goto L_0x029b
        L_0x0288:
            r14 = -329157975(0xffffffffec6172a9, float:-1.0901991E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27123b
            r0.mo5418R(r7)
        L_0x029b:
            r0.mo5418R(r7)
            goto L_0x02b2
        L_0x029f:
            r14 = -329157870(0xffffffffec617312, float:-1.09020685E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27131f
            r0.mo5418R(r7)
        L_0x02b2:
            r0.mo5418R(r7)
            goto L_0x030f
        L_0x02b6:
            com.etsy.collagecompose.e$c r14 = com.etsy.collagecompose.C12145e.C12148c.f27085a
            boolean r14 = kotlin.jvm.internal.C19383o.m32792b(r1, r14)
            if (r14 == 0) goto L_0x0914
            r14 = -329157680(0xffffffffec6173d0, float:-1.0902209E27)
            r0.mo5465u(r14)
            if (r2 == 0) goto L_0x02f9
            r14 = -329157653(0xffffffffec6173eb, float:-1.0902229E27)
            r0.mo5465u(r14)
            if (r3 == 0) goto L_0x02e2
            r14 = -329157622(0xffffffffec61740a, float:-1.09022515E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27158s0
            r0.mo5418R(r7)
            goto L_0x02f5
        L_0x02e2:
            r14 = -329157514(0xffffffffec617476, float:-1.0902331E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27168x0
            r0.mo5418R(r7)
        L_0x02f5:
            r0.mo5418R(r7)
            goto L_0x030c
        L_0x02f9:
            r14 = -329157393(0xffffffffec6174ef, float:-1.09024205E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.i r14 = (com.etsy.collagecompose.C12158i) r14
            long r14 = r14.f27131f
            r0.mo5418R(r7)
        L_0x030c:
            r0.mo5418R(r7)
        L_0x030f:
            boolean r16 = kotlin.jvm.internal.C19383o.m32792b(r1, r12)
            if (r16 == 0) goto L_0x0393
            r7 = -329157152(0xffffffffec6175e0, float:-1.0902598E27)
            r0.mo5465u(r7)
            if (r2 == 0) goto L_0x035a
            r7 = -329157139(0xffffffffec6175ed, float:-1.0902608E27)
            r0.mo5465u(r7)
            if (r3 == 0) goto L_0x0340
            r7 = -329157112(0xffffffffec617608, float:-1.0902628E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            r31 = r6
            long r6 = r7.f27154q0
            r16 = r6
            r6 = 0
            r0.mo5418R(r6)
            r10 = r16
            goto L_0x0356
        L_0x0340:
            r31 = r6
            r6 = 0
            r7 = -329157022(0xffffffffec617662, float:-1.0902694E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r10 = r7.f27164v0
            r0.mo5418R(r6)
        L_0x0356:
            r0.mo5418R(r6)
            goto L_0x038f
        L_0x035a:
            r31 = r6
            r6 = 0
            r7 = -329156923(0xffffffffec6176c5, float:-1.0902767E27)
            r0.mo5465u(r7)
            if (r3 == 0) goto L_0x0379
            r7 = -329156896(0xffffffffec6176e0, float:-1.0902787E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r10 = r7.f27156r0
            r0.mo5418R(r6)
            goto L_0x038c
        L_0x0379:
            r7 = -329156797(0xffffffffec617743, float:-1.090286E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r10 = r7.f27166w0
            r0.mo5418R(r6)
        L_0x038c:
            r0.mo5418R(r6)
        L_0x038f:
            r0.mo5418R(r6)
            goto L_0x03fb
        L_0x0393:
            r31 = r6
            com.etsy.collagecompose.e$b r6 = com.etsy.collagecompose.C12145e.C12147b.f27084a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
            if (r6 == 0) goto L_0x039f
            r6 = 1
            goto L_0x03a5
        L_0x039f:
            com.etsy.collagecompose.e$c r6 = com.etsy.collagecompose.C12145e.C12148c.f27085a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
        L_0x03a5:
            if (r6 == 0) goto L_0x03a9
            r6 = 1
            goto L_0x03af
        L_0x03a9:
            com.etsy.collagecompose.e$e r6 = com.etsy.collagecompose.C12145e.C12150e.f27087a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
        L_0x03af:
            if (r6 == 0) goto L_0x03be
            r6 = -329156474(0xffffffffec617886, float:-1.09030986E27)
            r0.mo5465u(r6)
            r6 = 0
            r0.mo5418R(r6)
            long r10 = androidx.compose.p015ui.graphics.C1545s.f3363h
            goto L_0x03fb
        L_0x03be:
            com.etsy.collagecompose.e$d r6 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
            if (r6 == 0) goto L_0x0904
            r6 = -329156379(0xffffffffec6178e5, float:-1.0903169E27)
            r0.mo5465u(r6)
            if (r3 == 0) goto L_0x03e3
            r6 = -329156366(0xffffffffec6178f2, float:-1.0903178E27)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r6 = r0.mo5410J(r6)
            com.etsy.collagecompose.i r6 = (com.etsy.collagecompose.C12158i) r6
            long r6 = r6.f27160t0
            r10 = 0
            r0.mo5418R(r10)
            goto L_0x03f7
        L_0x03e3:
            r10 = 0
            r6 = -329156275(0xffffffffec61794d, float:-1.09032454E27)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r6 = r0.mo5410J(r6)
            com.etsy.collagecompose.i r6 = (com.etsy.collagecompose.C12158i) r6
            long r6 = r6.f27170y0
            r0.mo5418R(r10)
        L_0x03f7:
            r0.mo5418R(r10)
            r10 = r6
        L_0x03fb:
            r6 = -329156113(0xffffffffec6179ef, float:-1.0903365E27)
            r0.mo5465u(r6)
            boolean r6 = r1 instanceof com.etsy.collagecompose.C12145e.C12147b
            if (r6 == 0) goto L_0x049a
            androidx.compose.runtime.l1 r6 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r6 = r0.mo5410J(r6)
            com.etsy.collagecompose.j r6 = (com.etsy.collagecompose.C12159j) r6
            float r6 = r6.f27190r
            if (r2 == 0) goto L_0x044e
            r7 = -329155951(0xffffffffec617a91, float:-1.09034845E27)
            r0.mo5465u(r7)
            if (r3 == 0) goto L_0x0432
            r7 = -329155920(0xffffffffec617ab0, float:-1.09035074E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            r47 = r13
            r40 = r14
            long r13 = r7.f27154q0
            r7 = 0
            r0.mo5418R(r7)
            goto L_0x044a
        L_0x0432:
            r47 = r13
            r40 = r14
            r7 = 0
            r13 = -329155822(0xffffffffec617b12, float:-1.090358E27)
            r0.mo5465u(r13)
            androidx.compose.runtime.l1 r13 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r13 = r0.mo5410J(r13)
            com.etsy.collagecompose.i r13 = (com.etsy.collagecompose.C12158i) r13
            long r13 = r13.f27164v0
            r0.mo5418R(r7)
        L_0x044a:
            r0.mo5418R(r7)
            goto L_0x0486
        L_0x044e:
            r47 = r13
            r40 = r14
            r7 = -329155711(0xffffffffec617b81, float:-1.09036616E27)
            r0.mo5465u(r7)
            if (r3 == 0) goto L_0x046f
            r7 = -329155680(0xffffffffec617ba0, float:-1.09036845E27)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r7 = r0.mo5410J(r7)
            com.etsy.collagecompose.i r7 = (com.etsy.collagecompose.C12158i) r7
            long r13 = r7.f27156r0
            r7 = 0
            r0.mo5418R(r7)
            goto L_0x0483
        L_0x046f:
            r7 = 0
            r13 = -329155573(0xffffffffec617c0b, float:-1.09037634E27)
            r0.mo5465u(r13)
            androidx.compose.runtime.l1 r13 = com.etsy.collagecompose.ColorsKt.f27041n
            java.lang.Object r13 = r0.mo5410J(r13)
            com.etsy.collagecompose.i r13 = (com.etsy.collagecompose.C12158i) r13
            long r13 = r13.f27166w0
            r0.mo5418R(r7)
        L_0x0483:
            r0.mo5418R(r7)
        L_0x0486:
            p.f r7 = p202p.C7645g.f16941a
            p.e r7 = new p.e
            r15 = 100
            float r15 = (float) r15
            r7.<init>(r15)
            p.f r15 = new p.f
            r15.<init>(r7, r7, r7, r7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.C0555f.m1343b(r6, r13, r15)
            goto L_0x04a0
        L_0x049a:
            r47 = r13
            r40 = r14
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x04a0:
            r7 = 0
            r0.mo5418R(r7)
            if (r5 == 0) goto L_0x04af
            int r7 = r5.length()
            if (r7 != 0) goto L_0x04ad
            goto L_0x04af
        L_0x04ad:
            r7 = 0
            goto L_0x04b0
        L_0x04af:
            r7 = 1
        L_0x04b0:
            if (r7 == 0) goto L_0x04e9
            r13 = -329155242(0xffffffffec617d56, float:-1.0904008E27)
            r0.mo5465u(r13)
            boolean r13 = r8 instanceof com.etsy.collagecompose.C12142d.C12144b
            if (r13 == 0) goto L_0x04d1
            r13 = -329155202(0xffffffffec617d7e, float:-1.0904037E27)
            r0.mo5465u(r13)
            androidx.compose.runtime.l1 r13 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r13 = r0.mo5410J(r13)
            com.etsy.collagecompose.j r13 = (com.etsy.collagecompose.C12159j) r13
            float r13 = r13.f27193u
            r14 = 0
            r0.mo5418R(r14)
            goto L_0x04e5
        L_0x04d1:
            r14 = 0
            r13 = -329155038(0xffffffffec617e22, float:-1.0904158E27)
            r0.mo5465u(r13)
            androidx.compose.runtime.l1 r13 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r13 = r0.mo5410J(r13)
            com.etsy.collagecompose.j r13 = (com.etsy.collagecompose.C12159j) r13
            float r13 = r13.f27178f
            r0.mo5418R(r14)
        L_0x04e5:
            r0.mo5418R(r14)
            goto L_0x04fe
        L_0x04e9:
            r13 = 0
            r14 = -329154964(0xffffffffec617e6c, float:-1.0904213E27)
            r0.mo5465u(r14)
            androidx.compose.runtime.l1 r14 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r14 = r0.mo5410J(r14)
            com.etsy.collagecompose.j r14 = (com.etsy.collagecompose.C12159j) r14
            float r14 = r14.f27179g
            r0.mo5418R(r13)
            r13 = r14
        L_0x04fe:
            p.f r14 = p202p.C7645g.f16941a
            p.e r14 = new p.e
            r15 = 100
            float r15 = (float) r15
            r14.<init>(r15)
            p.f r15 = new p.f
            r15.<init>(r14, r14, r14, r14)
            r14 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r14)
            java.lang.Object r14 = r0.mo5431c0()
            r32 = r3
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r14 != r3) goto L_0x0526
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            androidx.compose.runtime.ParcelableSnapshotMutableState r14 = androidx.compose.foundation.layout.C0761x.m1751w0(r14, androidx.compose.runtime.C1351n1.f2948a)
            r0.mo5407H0(r14)
        L_0x0526:
            r42 = r15
            r15 = 0
            r0.mo5418R(r15)
            r15 = r14
            androidx.compose.runtime.j0 r15 = (androidx.compose.runtime.C1338j0) r15
            java.lang.Object r14 = r15.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r14 == 0) goto L_0x0543
            r14 = 1064514355(0x3f733333, float:0.95)
            r43 = r15
            goto L_0x0547
        L_0x0543:
            r43 = r15
            r14 = r16
        L_0x0547:
            r15 = 14
            r33 = r9
            r9 = 0
            r23 = r13
            r13 = 0
            androidx.compose.animation.core.f r9 = androidx.compose.animation.core.C0411a.m1106b(r14, r13, r0, r9, r15)
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r13)
            java.lang.Object r13 = r0.mo5431c0()
            if (r13 != r3) goto L_0x0563
            androidx.compose.foundation.interaction.k r13 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x0563:
            r14 = 0
            r0.mo5418R(r14)
            androidx.compose.foundation.interaction.j r13 = (androidx.compose.foundation.interaction.C0640j) r13
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r4, r14)
            int r14 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x057e
            r15 = 1
            goto L_0x057f
        L_0x057e:
            r15 = 0
        L_0x057f:
            if (r15 == 0) goto L_0x0595
            if (r14 != 0) goto L_0x0585
            r14 = 1
            goto L_0x0586
        L_0x0585:
            r14 = 0
        L_0x0586:
            if (r14 != 0) goto L_0x0589
            goto L_0x0595
        L_0x0589:
            r34 = r40
            r24 = r3
            r9 = r4
            r36 = r9
            r4 = r42
            r3 = r43
            goto L_0x05b4
        L_0x0595:
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 65532(0xfffc, float:9.183E-41)
            r34 = r40
            r14 = r4
            r24 = r3
            r36 = r4
            r4 = r42
            r3 = r43
            r15 = r9
            r16 = r9
            androidx.compose.ui.d r9 = kotlin.jvm.internal.C19388s.m32869k0(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x05b4:
            boolean r14 = r8 instanceof com.etsy.collagecompose.C12142d.C12144b
            if (r14 == 0) goto L_0x05d1
            if (r7 == 0) goto L_0x05d1
            r15 = -329154373(0xffffffffec6180bb, float:-1.0904649E27)
            r0.mo5465u(r15)
            androidx.compose.runtime.l1 r15 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r15 = r0.mo5410J(r15)
            com.etsy.collagecompose.j r15 = (com.etsy.collagecompose.C12159j) r15
            float r15 = r15.f27192t
            r16 = r15
            r15 = 0
            r0.mo5418R(r15)
            goto L_0x05e7
        L_0x05d1:
            r15 = -329154270(0xffffffffec618122, float:-1.0904725E27)
            r0.mo5465u(r15)
            androidx.compose.runtime.l1 r15 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r15 = r0.mo5410J(r15)
            com.etsy.collagecompose.j r15 = (com.etsy.collagecompose.C12159j) r15
            float r15 = r15.f27173a
            r16 = r15
            r15 = 0
            r0.mo5418R(r15)
        L_0x05e7:
            r25 = r7
            r15 = r16
            androidx.compose.runtime.l1 r7 = com.etsy.collagecompose.DimensKt.f27051e
            java.lang.Object r16 = r0.mo5410J(r7)
            r37 = r8
            r8 = r16
            com.etsy.collagecompose.j r8 = (com.etsy.collagecompose.C12159j) r8
            float r8 = r8.f27173a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.SizeKt.m1483c(r9, r15, r8)
            r9 = -329154083(0xffffffffec6181dd, float:-1.0904863E27)
            r0.mo5465u(r9)
            r9 = 0
            if (r14 == 0) goto L_0x0618
            androidx.compose.ui.d$a r14 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.Object r15 = r0.mo5410J(r7)
            com.etsy.collagecompose.j r15 = (com.etsy.collagecompose.C12159j) r15
            float r15 = r15.f27191s
            r28 = r7
            r7 = 1
            androidx.compose.ui.d r7 = com.google.android.play.core.assetpacks.C15588c1.m25283H0(r14, r9, r15, r7)
            goto L_0x061c
        L_0x0618:
            r28 = r7
            androidx.compose.ui.d$a r7 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x061c:
            r14 = 0
            r0.mo5418R(r14)
            androidx.compose.ui.d r7 = r8.mo6148i0(r7)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.C0761x.m1655A(r7, r10, r4)
            androidx.compose.ui.d r6 = r7.mo6148i0(r6)
            androidx.compose.ui.d r4 = kotlinx.coroutines.C19543e0.m33286B(r6, r4)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 3
            r40 = r6
            r41 = r7
            r42 = r34
            r44 = r0
            r45 = r8
            r46 = r10
            androidx.compose.material.ripple.c r6 = androidx.compose.material.ripple.C1244j.m2369a(r40, r41, r42, r44, r45, r46)
            if (r5 == 0) goto L_0x064f
            int r7 = r5.length()
            if (r7 != 0) goto L_0x064d
            goto L_0x064f
        L_0x064d:
            r7 = 0
            goto L_0x0650
        L_0x064f:
            r7 = 1
        L_0x0650:
            if (r7 == 0) goto L_0x0655
            r7 = r31
            goto L_0x0656
        L_0x0655:
            r7 = r5
        L_0x0656:
            androidx.compose.ui.semantics.g r8 = new androidx.compose.ui.semantics.g
            r10 = 0
            r8.<init>(r10)
            r40 = r4
            r41 = r13
            r42 = r6
            r43 = r2
            r44 = r7
            r45 = r8
            r46 = r39
            androidx.compose.ui.d r4 = androidx.compose.foundation.ClickableKt.m1296b(r40, r41, r42, r43, r44, r45, r46)
            r6 = -329153177(0xffffffffec618567, float:-1.0905531E27)
            r0.mo5465u(r6)
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r12)
            if (r6 == 0) goto L_0x067c
            r6 = 1
            goto L_0x0682
        L_0x067c:
            com.etsy.collagecompose.e$b r6 = com.etsy.collagecompose.C12145e.C12147b.f27084a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
        L_0x0682:
            if (r6 == 0) goto L_0x0686
            r6 = 1
            goto L_0x068c
        L_0x0686:
            com.etsy.collagecompose.e$d r6 = com.etsy.collagecompose.C12145e.C12149d.f27086a
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r1, r6)
        L_0x068c:
            if (r6 == 0) goto L_0x06b8
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r7 = 1157296644(0x44faf204, float:2007.563)
            r0.mo5465u(r7)
            boolean r7 = r0.mo5408I(r3)
            java.lang.Object r8 = r0.mo5431c0()
            if (r7 != 0) goto L_0x06a4
            r7 = r24
            if (r8 != r7) goto L_0x06ad
        L_0x06a4:
            com.etsy.collagecompose.ButtonKt$Button$1$1 r8 = new com.etsy.collagecompose.ButtonKt$Button$1$1
            r7 = 0
            r8.<init>(r3, r7)
            r0.mo5407H0(r8)
        L_0x06ad:
            r3 = 0
            r0.mo5418R(r3)
            kq.p r8 = (p753kq.C19861p) r8
            androidx.compose.ui.d r6 = androidx.compose.p015ui.input.pointer.SuspendingPointerInputFilterKt.m3484b(r6, r13, r8)
            goto L_0x06bb
        L_0x06b8:
            r3 = 0
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x06bb:
            r0.mo5418R(r3)
            androidx.compose.ui.d r3 = r4.mo6148i0(r6)
            r4 = 2
            r13 = r23
            androidx.compose.ui.d r3 = com.google.android.play.core.assetpacks.C15588c1.m25283H0(r3, r13, r9, r4)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.SizeKt.m1498r(r3)
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo5465u(r4)
            androidx.compose.ui.b r4 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r6 = 1
            androidx.compose.ui.layout.v r4 = androidx.compose.foundation.layout.BoxKt.m1457c(r4, r6, r0)
            r6 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r7 = r0.mo5410J(r6)
            m0.b r7 = (p174m0.C7282b) r7
            androidx.compose.runtime.l1 r8 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r9 = r0.mo5410J(r8)
            androidx.compose.ui.unit.LayoutDirection r9 = (androidx.compose.p015ui.unit.LayoutDirection) r9
            androidx.compose.runtime.l1 r10 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r11 = r0.mo5410J(r10)
            androidx.compose.ui.platform.j1 r11 = (androidx.compose.p015ui.platform.C1843j1) r11
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r12.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r12 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r3 = androidx.compose.p015ui.layout.C1700o.m3617a(r3)
            androidx.compose.runtime.c<?> r13 = r0.f2715a
            boolean r13 = r13 instanceof androidx.compose.runtime.C1299c
            if (r13 == 0) goto L_0x08ff
            r0.mo5392A()
            boolean r13 = r0.f2702K
            if (r13 == 0) goto L_0x0714
            r0.mo5450m(r12)
            goto L_0x0717
        L_0x0714:
            r0.mo5452n()
        L_0x0717:
            r13 = 0
            r0.f2738x = r13
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r14 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r4, r14)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r4 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r7, r4)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r7 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r9, r7)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r9 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r11 = p504ai.C13983i.m21490i(r0, r11, r9, r0)
            r15 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r16 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r40 = r13
            r41 = r3
            r42 = r11
            r43 = r0
            r44 = r15
            r45 = r16
            androidx.appcompat.widget.C0326j.m868m(r40, r41, r42, r43, r44, r45)
            androidx.compose.ui.b$b r3 = androidx.compose.p015ui.C1428a.C1429a.f3114j
            r11 = 693286680(0x2952b718, float:4.6788176E-14)
            r0.mo5465u(r11)
            androidx.compose.ui.d$a r11 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.foundation.layout.d$i r13 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.layout.v r13 = androidx.compose.foundation.layout.RowKt.m1480a(r13, r3, r0)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r3)
            java.lang.Object r3 = r0.mo5410J(r6)
            r16 = r3
            m0.b r16 = (p174m0.C7282b) r16
            java.lang.Object r3 = r0.mo5410J(r8)
            r19 = r3
            androidx.compose.ui.unit.LayoutDirection r19 = (androidx.compose.p015ui.unit.LayoutDirection) r19
            java.lang.Object r3 = r0.mo5410J(r10)
            r22 = r3
            androidx.compose.ui.platform.j1 r22 = (androidx.compose.p015ui.platform.C1843j1) r22
            androidx.compose.runtime.internal.ComposableLambdaImpl r3 = androidx.compose.p015ui.layout.C1700o.m3617a(r11)
            androidx.compose.runtime.c<?> r8 = r0.f2715a
            boolean r8 = r8 instanceof androidx.compose.runtime.C1299c
            if (r8 == 0) goto L_0x08fa
            r0.mo5392A()
            boolean r8 = r0.f2702K
            if (r8 == 0) goto L_0x0787
            r0.mo5450m(r12)
            goto L_0x078a
        L_0x0787:
            r0.mo5452n()
        L_0x078a:
            r8 = 0
            r0.f2738x = r8
            r12 = r0
            r10 = r47
            r15 = r0
            r17 = r4
            r18 = r0
            r20 = r7
            r21 = r0
            r23 = r9
            r24 = r0
            androidx.compose.runtime.a1 r4 = p003a2.C0023f.m106g(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r9 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r40 = r8
            r41 = r3
            r42 = r4
            r43 = r0
            r44 = r7
            r45 = r9
            androidx.appcompat.widget.C0326j.m868m(r40, r41, r42, r43, r44, r45)
            r3 = -2085121168(0xffffffff83b79370, float:-1.0789623E-36)
            r0.mo5465u(r3)
            if (r33 == 0) goto L_0x0899
            int r3 = r33.intValue()
            androidx.compose.ui.graphics.painter.Painter r12 = kotlin.jvm.internal.C19388s.m32878p0(r3, r0)
            r3 = 5
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r4 < r7) goto L_0x07d6
            androidx.compose.ui.graphics.k r4 = androidx.compose.p015ui.graphics.C1529k.f3326a
            r7 = r34
            android.graphics.BlendModeColorFilter r3 = r4.mo6367a(r7, r3)
            goto L_0x07e6
        L_0x07d6:
            r7 = r34
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r9 = p628nj.C18263b.m30859o0(r7)
            android.graphics.PorterDuff$Mode r3 = androidx.compose.p015ui.graphics.C1489a.m3160b(r3)
            r4.<init>(r9, r3)
            r3 = r4
        L_0x07e6:
            androidx.compose.ui.graphics.t r4 = new androidx.compose.ui.graphics.t
            r4.<init>(r3)
            r3 = r37
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r3, r10)
            if (r9 == 0) goto L_0x080d
            r6 = -2085120686(0xffffffff83b79552, float:-1.0790056E-36)
            r0.mo5465u(r6)
            r9 = r28
            java.lang.Object r6 = r0.mo5410J(r9)
            com.etsy.collagecompose.j r6 = (com.etsy.collagecompose.C12159j) r6
            r6.getClass()
            float r6 = com.etsy.collagecompose.C12159j.m19965e(r0)
            r10 = 0
            r0.mo5418R(r10)
            goto L_0x0845
        L_0x080d:
            r9 = r28
            com.etsy.collagecompose.d$b r10 = com.etsy.collagecompose.C12142d.C12144b.f27082a
            boolean r10 = kotlin.jvm.internal.C19383o.m32792b(r3, r10)
            if (r10 == 0) goto L_0x0889
            r10 = -2085120599(0xffffffff83b795a9, float:-1.0790134E-36)
            r0.mo5465u(r10)
            java.lang.Object r10 = r0.mo5410J(r9)
            com.etsy.collagecompose.j r10 = (com.etsy.collagecompose.C12159j) r10
            r10.getClass()
            r10 = 1588834060(0x5eb3af0c, float:6.4737903E18)
            r0.mo5465u(r10)
            java.lang.Object r6 = r0.mo5410J(r6)
            m0.b r6 = (p174m0.C7282b) r6
            java.lang.Object r10 = r0.mo5410J(r9)
            com.etsy.collagecompose.j r10 = (com.etsy.collagecompose.C12159j) r10
            long r13 = r10.f27186n
            float r6 = r6.mo3794e(r13)
            r10 = 0
            r0.mo5418R(r10)
            r0.mo5418R(r10)
        L_0x0845:
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.SizeKt.m1492l(r11, r6)
            r10 = -2085120379(0xffffffff83b79685, float:-1.0790331E-36)
            r0.mo5465u(r10)
            if (r25 != 0) goto L_0x086e
            r10 = 0
            r13 = 0
            java.lang.Object r9 = r0.mo5410J(r9)
            com.etsy.collagecompose.j r9 = (com.etsy.collagecompose.C12159j) r9
            float r9 = r9.f27176d
            r14 = 0
            r15 = 11
            r40 = r11
            r41 = r10
            r42 = r13
            r43 = r9
            r44 = r14
            r45 = r15
            androidx.compose.ui.d r11 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r40, r41, r42, r43, r44, r45)
        L_0x086e:
            r9 = 0
            r0.mo5418R(r9)
            androidx.compose.ui.d r14 = r6.mo6148i0(r11)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 56
            r21 = 56
            r6 = 1
            r18 = r4
            r19 = r0
            androidx.compose.foundation.ImageKt.m1308a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x089f
        L_0x0889:
            r1 = 0
            r2 = -2085130964(0xffffffff83b76d2c, float:-1.0780838E-36)
            r0.mo5465u(r2)
            r0.mo5418R(r1)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0899:
            r7 = r34
            r3 = r37
            r9 = 0
            r6 = 1
        L_0x089f:
            r0.mo5418R(r9)
            if (r5 != 0) goto L_0x08a5
            goto L_0x08cb
        L_0x08a5:
            r13 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            int r4 = r26 >> 9
            r28 = r4 & 14
            r29 = 0
            r30 = 4090(0xffa, float:5.731E-42)
            r12 = r5
            r14 = r7
            r26 = r27
            r27 = r0
            com.etsy.collagecompose.TextKt.m19958a(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            kotlin.m r4 = kotlin.C19394m.f43287a
        L_0x08cb:
            android.support.p013v4.media.session.C0087d.m238h(r0, r9, r9, r6, r9)
            android.support.p013v4.media.session.C0087d.m238h(r0, r9, r9, r9, r6)
            r0.mo5418R(r9)
            r0.mo5418R(r9)
            r8 = r2
            r6 = r3
            r4 = r5
            r5 = r31
            r9 = r32
            r7 = r33
            r3 = r36
        L_0x08e2:
            androidx.compose.runtime.v0 r12 = r0.mo5421U()
            if (r12 != 0) goto L_0x08e9
            goto L_0x08f9
        L_0x08e9:
            com.etsy.collagecompose.ButtonKt$Button$3 r13 = new com.etsy.collagecompose.ButtonKt$Button$3
            r0 = r13
            r1 = r38
            r2 = r39
            r10 = r48
            r11 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.f3081d = r13
        L_0x08f9:
            return
        L_0x08fa:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        L_0x08ff:
            r0 = 0
            p001a0.C0005b.m45j0()
            throw r0
        L_0x0904:
            r1 = -329161878(0xffffffffec61636a, float:-1.0899111E27)
            r0.mo5465u(r1)
            r1 = 0
            r0.mo5418R(r1)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0914:
            r1 = r7
            r2 = -329161878(0xffffffffec61636a, float:-1.0899111E27)
            r0.mo5465u(r2)
            r0.mo5418R(r1)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0924:
            r1 = r7
            r2 = -329161878(0xffffffffec61636a, float:-1.0899111E27)
            r0.mo5465u(r2)
            r0.mo5418R(r1)
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.ButtonKt.m19939a(com.etsy.collagecompose.e, kq.a, androidx.compose.ui.d, java.lang.String, java.lang.String, com.etsy.collagecompose.d, java.lang.Integer, boolean, boolean, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m19940b(com.etsy.collagecompose.C12145e r28, java.lang.String r29, com.etsy.collagecompose.C12142d r30, androidx.compose.runtime.C1302d r31, int r32, int r33) {
        /*
            r12 = r29
            r13 = r32
            r0 = -1831964971(0xffffffff92ce6ed5, float:-1.302775E-27)
            r1 = r31
            androidx.compose.runtime.ComposerImpl r15 = r1.mo5440h(r0)
            r0 = r33 & 1
            if (r0 == 0) goto L_0x0016
            r0 = r13 | 6
            r14 = r28
            goto L_0x0028
        L_0x0016:
            r0 = r13 & 14
            r14 = r28
            if (r0 != 0) goto L_0x0027
            boolean r0 = r15.mo5408I(r14)
            if (r0 == 0) goto L_0x0024
            r0 = 4
            goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            r0 = r0 | r13
            goto L_0x0028
        L_0x0027:
            r0 = r13
        L_0x0028:
            r1 = r33 & 2
            if (r1 == 0) goto L_0x002f
            r0 = r0 | 48
            goto L_0x003f
        L_0x002f:
            r1 = r13 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x003f
            boolean r1 = r15.mo5408I(r12)
            if (r1 == 0) goto L_0x003c
            r1 = 32
            goto L_0x003e
        L_0x003c:
            r1 = 16
        L_0x003e:
            r0 = r0 | r1
        L_0x003f:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x0046
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0046:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0059
            r2 = r30
            boolean r3 = r15.mo5408I(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r0 = r0 | r3
            goto L_0x005b
        L_0x0059:
            r2 = r30
        L_0x005b:
            r3 = r0 & 731(0x2db, float:1.024E-42)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x006f
            boolean r3 = r15.mo5442i()
            if (r3 != 0) goto L_0x0068
            goto L_0x006f
        L_0x0068:
            r15.mo5396C()
            r3 = r2
            r2 = r15
            goto L_0x014f
        L_0x006f:
            if (r1 == 0) goto L_0x0076
            com.etsy.collagecompose.d$a r1 = com.etsy.collagecompose.C12142d.C12143a.f27081a
            r26 = r1
            goto L_0x0078
        L_0x0076:
            r26 = r2
        L_0x0078:
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1487g(r1)
            androidx.compose.ui.d r1 = androidx.compose.p015ui.platform.TestTagKt.m3948a(r1, r12)
            androidx.compose.foundation.layout.d$f r2 = androidx.compose.foundation.layout.C0718d.f1482g
            r3 = 693286680(0x2952b718, float:4.6788176E-14)
            r15.mo5465u(r3)
            androidx.compose.ui.b$b r3 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.RowKt.m1480a(r2, r3, r15)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r15.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r15.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r5 = r15.mo5410J(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r6.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r7 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r1 = r15.f2715a
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            if (r1 == 0) goto L_0x0167
            r15.mo5392A()
            boolean r1 = r15.f2702K
            if (r1 == 0) goto L_0x00ca
            r15.mo5450m(r6)
            goto L_0x00cd
        L_0x00ca:
            r15.mo5452n()
        L_0x00cd:
            r11 = 0
            r15.f2738x = r11
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r15, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r15, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r15, r4, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r15, r5, r1, r15)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r1 = r11
            r2 = r7
            r4 = r15
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            com.etsy.collagecompose.ButtonKt$ButtonIconRow$1$1 r1 = com.etsy.collagecompose.ButtonKt$ButtonIconRow$1$1.INSTANCE
            r17 = 0
            r4 = 0
            r16 = 2131231413(0x7f0802b5, float:1.8078906E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r16)
            r7 = 0
            r8 = 0
            r10 = r0 & 14
            r2 = r10 | 48
            int r3 = r0 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            int r0 = r0 << 9
            r18 = r0 & r3
            r19 = r2 | r18
            r20 = 404(0x194, float:5.66E-43)
            r2 = 0
            r0 = r28
            r3 = r29
            r5 = r26
            r9 = r15
            r27 = r10
            r10 = r19
            r12 = r11
            r11 = r20
            m19939a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.etsy.collagecompose.ButtonKt$ButtonIconRow$1$2 r0 = com.etsy.collagecompose.ButtonKt$ButtonIconRow$1$2.INSTANCE
            r1 = 0
            java.lang.Integer r20 = java.lang.Integer.valueOf(r16)
            r21 = 0
            r22 = 0
            r2 = r27
            r2 = r2 | 24624(0x6030, float:3.4506E-41)
            r24 = r2 | r18
            r25 = 396(0x18c, float:5.55E-43)
            java.lang.String r18 = "icon-only button"
            r14 = r28
            r2 = r15
            r15 = r0
            r16 = r1
            r19 = r26
            r23 = r2
            m19939a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = 1
            android.support.p013v4.media.session.C0087d.m238h(r2, r12, r12, r0, r12)
            r2.mo5418R(r12)
            r3 = r26
        L_0x014f:
            androidx.compose.runtime.v0 r6 = r2.mo5421U()
            if (r6 != 0) goto L_0x0156
            goto L_0x0166
        L_0x0156:
            com.etsy.collagecompose.ButtonKt$ButtonIconRow$2 r7 = new com.etsy.collagecompose.ButtonKt$ButtonIconRow$2
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f3081d = r7
        L_0x0166:
            return
        L_0x0167:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.collagecompose.ButtonKt.m19940b(com.etsy.collagecompose.e, java.lang.String, com.etsy.collagecompose.d, androidx.compose.runtime.d, int, int):void");
    }

    /* renamed from: c */
    public static final void m19941c(int i, C1302d dVar, String str) {
        int i2;
        ComposerImpl composerImpl;
        int i3 = i;
        String str2 = str;
        ComposerImpl h = dVar.mo5440h(-1224572423);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            C1436d.C1437a aVar = C1436d.C1437a.f3125b;
            C1345l1 l1Var = DimensKt.f27051e;
            C15588c1.m25324f(SizeKt.m1488h(aVar, ((C12159j) h.mo5410J(l1Var)).f27178f), h, 0);
            ComposerImpl composerImpl2 = h;
            String str3 = str2;
            TextKt.m19958a(str, (C1436d) null, 0, 0, (C1957k) null, (C1959m) null, (C1952g) null, (C2029d) null, 0, false, 0, (C19857l<? super C2021q, C19394m>) null, ((C12160k) h.mo5410J(TypographyKt.f27060a)).f27195a, composerImpl2, i2 & 14, 0, 4094);
            composerImpl = composerImpl2;
            C15588c1.m25324f(SizeKt.m1488h(aVar, ((C12159j) composerImpl.mo5410J(l1Var)).f27177e), composerImpl, 0);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$Header$1(str, i3);
        }
    }

    /* renamed from: d */
    public static final void m19942d(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(616266653);
        if (i != 0 || !h.mo5442i()) {
            m19941c(6, h, "Buttons with icons");
            ComposerImpl composerImpl = h;
            m19940b(C12145e.C12146a.f27083a, "IconPrimary", (C12142d) null, composerImpl, 54, 4);
            m19940b(C12145e.C12147b.f27084a, "IconSecondary", (C12142d) null, composerImpl, 54, 4);
            m19940b(C12145e.C12149d.f27086a, "IconTertiary", (C12142d) null, composerImpl, 54, 4);
            m19940b(C12145e.C12148c.f27085a, "IconSecondaryAlt", (C12142d) null, composerImpl, 54, 4);
            m19940b(C12145e.C12150e.f27087a, "IconTertiaryTransparent", (C12142d) null, composerImpl, 54, 4);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$ButtonWithIconSection$1(i);
        }
    }

    /* renamed from: e */
    public static final void m19943e(C1302d dVar, int i) {
        int i2 = i;
        ComposerImpl h = dVar.mo5440h(619985338);
        if (i2 != 0 || !h.mo5442i()) {
            m19941c(6, h, "Disabled buttons");
            C12145e.C12146a aVar = C12145e.C12146a.f27083a;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            ComposerImpl composerImpl = h;
            m19939a(aVar, ButtonKt$DisabledButtonSection$1.INSTANCE, TestTagKt.m3948a(aVar2, "DisabledPrimary"), "Primary disabled", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 12586422, 368);
            m19939a(C12145e.C12147b.f27084a, ButtonKt$DisabledButtonSection$2.INSTANCE, TestTagKt.m3948a(aVar2, "DisabledSecondary"), "Secondary disabled", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 12586422, 368);
            m19939a(C12145e.C12149d.f27086a, ButtonKt$DisabledButtonSection$3.INSTANCE, TestTagKt.m3948a(aVar2, "DisabledTertiary"), "Tertiary disabled", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 12586422, 368);
            m19939a(C12145e.C12148c.f27085a, ButtonKt$DisabledButtonSection$4.INSTANCE, TestTagKt.m3948a(aVar2, "DisabledSecondaryAlt"), "Secondary Alt disabled", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 12586422, 368);
            m19939a(C12145e.C12150e.f27087a, ButtonKt$DisabledButtonSection$5.INSTANCE, TestTagKt.m3948a(aVar2, "DisabledTertiaryTransparent"), "Tertiary Transparent disabled", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 12586422, 368);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$DisabledButtonSection$6(i2);
        }
    }

    /* renamed from: f */
    public static final void m19944f(C1302d dVar, int i) {
        int i2 = i;
        ComposerImpl h = dVar.mo5440h(1424199479);
        if (i2 != 0 || !h.mo5442i()) {
            m19941c(6, h, "Buttons");
            C12145e.C12146a aVar = C12145e.C12146a.f27083a;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            ComposerImpl composerImpl = h;
            m19939a(aVar, ButtonKt$MainButtonSection$1.INSTANCE, TestTagKt.m3948a(aVar2, "MainPrimary"), "Primary", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 3510, 496);
            m19939a(C12145e.C12147b.f27084a, ButtonKt$MainButtonSection$2.INSTANCE, TestTagKt.m3948a(aVar2, "MainSecondary"), "Secondary", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 3510, 496);
            m19939a(C12145e.C12149d.f27086a, ButtonKt$MainButtonSection$3.INSTANCE, TestTagKt.m3948a(aVar2, "MainTertiary"), "Tertiary", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 3510, 496);
            m19939a(C12145e.C12148c.f27085a, ButtonKt$MainButtonSection$4.INSTANCE, TestTagKt.m3948a(aVar2, "MainSecondaryAlt"), "Secondary Alt", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 3510, 496);
            m19939a(C12145e.C12150e.f27087a, ButtonKt$MainButtonSection$5.INSTANCE, TestTagKt.m3948a(aVar2, "MainTertiaryTransparent"), "Tertiary Transparent", (String) null, (C12142d) null, (Integer) null, false, false, composerImpl, 3510, 496);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$MainButtonSection$6(i2);
        }
    }

    /* renamed from: g */
    public static final void m19945g(C1302d dVar, int i) {
        int i2 = i;
        ComposerImpl h = dVar.mo5440h(1425541481);
        if (i2 != 0 || !h.mo5442i()) {
            m19941c(6, h, "Small buttons");
            C12145e.C12146a aVar = C12145e.C12146a.f27083a;
            C12142d.C12144b bVar = C12142d.C12144b.f27082a;
            C1436d.C1437a aVar2 = C1436d.C1437a.f3125b;
            C12142d.C12144b bVar2 = bVar;
            ComposerImpl composerImpl = h;
            m19939a(aVar, ButtonKt$SmallButtonSection$1.INSTANCE, TestTagKt.m3948a(aVar2, "SmallPrimary"), "Primary small", (String) null, bVar2, (Integer) null, false, false, composerImpl, 200118, 464);
            m19939a(C12145e.C12147b.f27084a, ButtonKt$SmallButtonSection$2.INSTANCE, TestTagKt.m3948a(aVar2, "SmallSecondary"), "Secondary small", (String) null, bVar2, (Integer) null, false, false, composerImpl, 200118, 464);
            m19939a(C12145e.C12149d.f27086a, ButtonKt$SmallButtonSection$3.INSTANCE, TestTagKt.m3948a(aVar2, "SmallTertiary"), "Tertiary small", (String) null, bVar2, (Integer) null, false, false, composerImpl, 200118, 464);
            m19939a(C12145e.C12148c.f27085a, ButtonKt$SmallButtonSection$4.INSTANCE, TestTagKt.m3948a(aVar2, "SmallSecondaryAlt"), "Secondary Alt small", (String) null, bVar2, (Integer) null, false, false, composerImpl, 200118, 464);
            m19939a(C12145e.C12150e.f27087a, ButtonKt$SmallButtonSection$5.INSTANCE, TestTagKt.m3948a(aVar2, "SmallTertiaryTransparent"), "Tertiary Transparent small", (String) null, bVar2, (Integer) null, false, false, composerImpl, 200118, 464);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$SmallButtonSection$6(i2);
        }
    }

    /* renamed from: h */
    public static final void m19946h(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(876189672);
        if (i != 0 || !h.mo5442i()) {
            m19941c(6, h, "Small buttons with icons");
            C12145e.C12146a aVar = C12145e.C12146a.f27083a;
            C12142d.C12144b bVar = C12142d.C12144b.f27082a;
            ComposerImpl composerImpl = h;
            m19940b(aVar, "SmallIconPrimary", bVar, composerImpl, 438, 0);
            m19940b(C12145e.C12147b.f27084a, "SmallIconSecondary", bVar, composerImpl, 438, 0);
            m19940b(C12145e.C12149d.f27086a, "SmallIconTertiary", bVar, composerImpl, 438, 0);
            m19940b(C12145e.C12148c.f27085a, "SmallIconSecondaryAlt", bVar, composerImpl, 438, 0);
            m19940b(C12145e.C12150e.f27087a, "SmallIconTertiaryTransparent", bVar, composerImpl, 438, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ButtonKt$SmallButtonWithIconSection$1(i);
        }
    }
}
