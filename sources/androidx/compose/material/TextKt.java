package androidx.compose.material;

import androidx.compose.p015ui.text.C2023s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class TextKt {

    /* renamed from: a */
    public static final C1411t f2342a;

    static {
        C1351n1 n1Var = C1351n1.f2948a;
        TextKt$LocalTextStyle$1 textKt$LocalTextStyle$1 = TextKt$LocalTextStyle$1.INSTANCE;
        C19383o.m32797g(textKt$LocalTextStyle$1, "defaultFactory");
        f2342a = new C1411t(n1Var, textKt$LocalTextStyle$1);
    }

    /* renamed from: a */
    public static final void m2282a(C2023s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(sVar, "value");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(1772272796);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(sVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            C1411t tVar = f2342a;
            CompositionLocalKt.m2530a(new C1412t0[]{tVar.mo5908b(((C2023s) h.mo5410J(tVar)).mo7759c(sVar))}, pVar, h, (i2 & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new TextKt$ProvideTextStyle$1(sVar, pVar, i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0132  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2283b(java.lang.String r35, androidx.compose.p015ui.C1436d r36, long r37, long r39, androidx.compose.p015ui.text.font.C1957k r41, androidx.compose.p015ui.text.font.C1959m r42, androidx.compose.p015ui.text.font.C1952g r43, long r44, androidx.compose.p015ui.text.style.C2030e r46, androidx.compose.p015ui.text.style.C2029d r47, long r48, int r50, boolean r51, int r52, p753kq.C19857l<? super androidx.compose.p015ui.text.C2021q, kotlin.C19394m> r53, androidx.compose.p015ui.text.C2023s r54, androidx.compose.runtime.C1302d r55, int r56, int r57, int r58) {
        /*
            r1 = r35
            r14 = r56
            r15 = r57
            r13 = r58
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            r0 = -366126944(0xffffffffea2d58a0, float:-5.239067E25)
            r2 = r55
            androidx.compose.runtime.ComposerImpl r0 = r2.mo5440h(r0)
            r2 = r13 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r14 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r14 & 14
            if (r2 != 0) goto L_0x002c
            boolean r2 = r0.mo5408I(r1)
            if (r2 == 0) goto L_0x0029
            r2 = 4
            goto L_0x002a
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r14
            goto L_0x002d
        L_0x002c:
            r2 = r14
        L_0x002d:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0034
            r2 = r2 | 48
            goto L_0x0047
        L_0x0034:
            r8 = r14 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0047
            r8 = r36
            boolean r9 = r0.mo5408I(r8)
            if (r9 == 0) goto L_0x0043
            r9 = 32
            goto L_0x0045
        L_0x0043:
            r9 = 16
        L_0x0045:
            r2 = r2 | r9
            goto L_0x0049
        L_0x0047:
            r8 = r36
        L_0x0049:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0052
            r2 = r2 | 384(0x180, float:5.38E-43)
            r3 = r37
            goto L_0x0065
        L_0x0052:
            r12 = r14 & 896(0x380, float:1.256E-42)
            r3 = r37
            if (r12 != 0) goto L_0x0065
            boolean r16 = r0.mo5434e(r3)
            if (r16 == 0) goto L_0x0061
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r2 = r2 | r16
        L_0x0065:
            r16 = r13 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x0072
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r7 = r39
            goto L_0x0085
        L_0x0072:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            r7 = r39
            if (r6 != 0) goto L_0x0085
            boolean r20 = r0.mo5434e(r7)
            if (r20 == 0) goto L_0x0081
            r20 = r18
            goto L_0x0083
        L_0x0081:
            r20 = r17
        L_0x0083:
            r2 = r2 | r20
        L_0x0085:
            r20 = r13 & 16
            r21 = 57344(0xe000, float:8.0356E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x0095
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            r6 = r41
            goto L_0x00a8
        L_0x0095:
            r24 = r14 & r21
            r6 = r41
            if (r24 != 0) goto L_0x00a8
            boolean r25 = r0.mo5408I(r6)
            if (r25 == 0) goto L_0x00a4
            r25 = r23
            goto L_0x00a6
        L_0x00a4:
            r25 = r22
        L_0x00a6:
            r2 = r2 | r25
        L_0x00a8:
            r25 = r13 & 32
            r26 = 458752(0x70000, float:6.42848E-40)
            if (r25 == 0) goto L_0x00b5
            r27 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r27
            r10 = r42
            goto L_0x00c8
        L_0x00b5:
            r27 = r14 & r26
            r10 = r42
            if (r27 != 0) goto L_0x00c8
            boolean r28 = r0.mo5408I(r10)
            if (r28 == 0) goto L_0x00c4
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r2 = r2 | r28
        L_0x00c8:
            r28 = r13 & 64
            r29 = 3670016(0x380000, float:5.142788E-39)
            if (r28 == 0) goto L_0x00d5
            r30 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r30
            r11 = r43
            goto L_0x00e8
        L_0x00d5:
            r30 = r14 & r29
            r11 = r43
            if (r30 != 0) goto L_0x00e8
            boolean r31 = r0.mo5408I(r11)
            if (r31 == 0) goto L_0x00e4
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e6
        L_0x00e4:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e6:
            r2 = r2 | r31
        L_0x00e8:
            r12 = r13 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x00f3
            r32 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r32
            r3 = r44
            goto L_0x0108
        L_0x00f3:
            r32 = 29360128(0x1c00000, float:7.052966E-38)
            r32 = r14 & r32
            r3 = r44
            if (r32 != 0) goto L_0x0108
            boolean r32 = r0.mo5434e(r3)
            if (r32 == 0) goto L_0x0104
            r32 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r32 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r2 = r2 | r32
        L_0x0108:
            r1 = r13 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0113
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r2 | r32
            r3 = r46
            goto L_0x0127
        L_0x0113:
            r32 = 234881024(0xe000000, float:1.5777218E-30)
            r32 = r14 & r32
            r3 = r46
            if (r32 != 0) goto L_0x0127
            boolean r4 = r0.mo5408I(r3)
            if (r4 == 0) goto L_0x0124
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0124:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0126:
            r2 = r2 | r4
        L_0x0127:
            r4 = r13 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0132
            r32 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r2 | r32
            r3 = r47
            goto L_0x0147
        L_0x0132:
            r32 = 1879048192(0x70000000, float:1.58456325E29)
            r32 = r14 & r32
            r3 = r47
            if (r32 != 0) goto L_0x0147
            boolean r32 = r0.mo5408I(r3)
            if (r32 == 0) goto L_0x0143
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r32 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r2 = r2 | r32
        L_0x0147:
            r3 = r13 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0150
            r31 = r15 | 6
            r6 = r48
            goto L_0x0166
        L_0x0150:
            r32 = r15 & 14
            r6 = r48
            if (r32 != 0) goto L_0x0164
            boolean r8 = r0.mo5434e(r6)
            if (r8 == 0) goto L_0x015f
            r31 = 4
            goto L_0x0161
        L_0x015f:
            r31 = 2
        L_0x0161:
            r31 = r15 | r31
            goto L_0x0166
        L_0x0164:
            r31 = r15
        L_0x0166:
            r8 = r13 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x016f
            r31 = r31 | 48
            r6 = r50
            goto L_0x0182
        L_0x016f:
            r32 = r15 & 112(0x70, float:1.57E-43)
            r6 = r50
            if (r32 != 0) goto L_0x0182
            boolean r7 = r0.mo5432d(r6)
            if (r7 == 0) goto L_0x017e
            r24 = 32
            goto L_0x0180
        L_0x017e:
            r24 = 16
        L_0x0180:
            r31 = r31 | r24
        L_0x0182:
            r7 = r31
            r6 = r13 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x018b
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x019f
        L_0x018b:
            r10 = r15 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x019f
            r10 = r51
            boolean r19 = r0.mo5427a(r10)
            if (r19 == 0) goto L_0x019a
            r27 = 256(0x100, float:3.59E-43)
            goto L_0x019c
        L_0x019a:
            r27 = 128(0x80, float:1.794E-43)
        L_0x019c:
            r7 = r7 | r27
            goto L_0x01a1
        L_0x019f:
            r10 = r51
        L_0x01a1:
            r10 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x01a8
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01b9
        L_0x01a8:
            r11 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x01b9
            r11 = r52
            boolean r19 = r0.mo5432d(r11)
            if (r19 == 0) goto L_0x01b6
            r17 = r18
        L_0x01b6:
            r7 = r7 | r17
            goto L_0x01bb
        L_0x01b9:
            r11 = r52
        L_0x01bb:
            r11 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x01c2
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x01d5
        L_0x01c2:
            r17 = r15 & r21
            if (r17 != 0) goto L_0x01d5
            r17 = r11
            r11 = r53
            boolean r18 = r0.mo5408I(r11)
            if (r18 == 0) goto L_0x01d2
            r22 = r23
        L_0x01d2:
            r7 = r7 | r22
            goto L_0x01d9
        L_0x01d5:
            r17 = r11
            r11 = r53
        L_0x01d9:
            r18 = r15 & r26
            r19 = 32768(0x8000, float:4.5918E-41)
            if (r18 != 0) goto L_0x01f4
            r18 = r13 & r19
            r11 = r54
            if (r18 != 0) goto L_0x01ef
            boolean r18 = r0.mo5408I(r11)
            if (r18 == 0) goto L_0x01ef
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f1
        L_0x01ef:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x01f1:
            r7 = r7 | r18
            goto L_0x01f6
        L_0x01f4:
            r11 = r54
        L_0x01f6:
            r18 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r2 & r18
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto L_0x0233
            r11 = 374491(0x5b6db, float:5.24774E-40)
            r11 = r11 & r7
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r11 != r15) goto L_0x0233
            boolean r11 = r0.mo5442i()
            if (r11 != 0) goto L_0x0210
            goto L_0x0233
        L_0x0210:
            r0.mo5396C()
            r2 = r36
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r12 = r46
            r13 = r47
            r14 = r48
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            goto L_0x0390
        L_0x0233:
            r0.mo5466u0()
            r11 = r14 & 1
            if (r11 == 0) goto L_0x026c
            boolean r11 = r0.mo5425Y()
            if (r11 == 0) goto L_0x0241
            goto L_0x026c
        L_0x0241:
            r0.mo5396C()
            r1 = r13 & r19
            if (r1 == 0) goto L_0x024c
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r1
        L_0x024c:
            r5 = r36
            r22 = r37
            r30 = r39
            r11 = r41
            r16 = r42
            r18 = r43
            r24 = r44
            r1 = r46
            r9 = r47
            r3 = r48
            r8 = r50
            r6 = r51
            r10 = r52
            r12 = r53
        L_0x0268:
            r15 = r54
            goto L_0x02db
        L_0x026c:
            if (r5 == 0) goto L_0x0271
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0273
        L_0x0271:
            r5 = r36
        L_0x0273:
            if (r9 == 0) goto L_0x0278
            long r22 = androidx.compose.p015ui.graphics.C1545s.f3364i
            goto L_0x027a
        L_0x0278:
            r22 = r37
        L_0x027a:
            if (r16 == 0) goto L_0x027f
            long r30 = p174m0.C7292j.f16173c
            goto L_0x0281
        L_0x027f:
            r30 = r39
        L_0x0281:
            r9 = 0
            if (r20 == 0) goto L_0x0286
            r11 = r9
            goto L_0x0288
        L_0x0286:
            r11 = r41
        L_0x0288:
            if (r25 == 0) goto L_0x028d
            r16 = r9
            goto L_0x028f
        L_0x028d:
            r16 = r42
        L_0x028f:
            if (r28 == 0) goto L_0x0294
            r18 = r9
            goto L_0x0296
        L_0x0294:
            r18 = r43
        L_0x0296:
            if (r12 == 0) goto L_0x029b
            long r24 = p174m0.C7292j.f16173c
            goto L_0x029d
        L_0x029b:
            r24 = r44
        L_0x029d:
            if (r1 == 0) goto L_0x02a1
            r1 = r9
            goto L_0x02a3
        L_0x02a1:
            r1 = r46
        L_0x02a3:
            if (r4 == 0) goto L_0x02a6
            goto L_0x02a8
        L_0x02a6:
            r9 = r47
        L_0x02a8:
            if (r3 == 0) goto L_0x02ad
            long r3 = p174m0.C7292j.f16173c
            goto L_0x02af
        L_0x02ad:
            r3 = r48
        L_0x02af:
            if (r8 == 0) goto L_0x02b3
            r8 = 1
            goto L_0x02b5
        L_0x02b3:
            r8 = r50
        L_0x02b5:
            if (r6 == 0) goto L_0x02b9
            r6 = 1
            goto L_0x02bb
        L_0x02b9:
            r6 = r51
        L_0x02bb:
            if (r10 == 0) goto L_0x02c1
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x02c3
        L_0x02c1:
            r10 = r52
        L_0x02c3:
            if (r17 == 0) goto L_0x02c8
            androidx.compose.material.TextKt$Text$1 r12 = androidx.compose.material.TextKt$Text$1.INSTANCE
            goto L_0x02ca
        L_0x02c8:
            r12 = r53
        L_0x02ca:
            r17 = r13 & r19
            if (r17 == 0) goto L_0x0268
            androidx.compose.runtime.t r15 = f2342a
            java.lang.Object r15 = r0.mo5410J(r15)
            androidx.compose.ui.text.s r15 = (androidx.compose.p015ui.text.C2023s) r15
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = r7 & r17
        L_0x02db:
            r0.mo5419S()
            r13 = 1557613088(0x5cd74a20, float:4.8478897E17)
            r0.mo5465u(r13)
            long r19 = androidx.compose.p015ui.graphics.C1545s.f3364i
            int r13 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x02ec
            r13 = 1
            goto L_0x02ed
        L_0x02ec:
            r13 = 0
        L_0x02ed:
            if (r13 == 0) goto L_0x02f4
            r51 = r15
            r27 = r22
            goto L_0x0320
        L_0x02f4:
            long r27 = r15.mo7758b()
            int r13 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x02fe
            r13 = 1
            goto L_0x02ff
        L_0x02fe:
            r13 = 0
        L_0x02ff:
            if (r13 == 0) goto L_0x0304
            r51 = r15
            goto L_0x0320
        L_0x0304:
            androidx.compose.runtime.t r13 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r13 = r0.mo5410J(r13)
            androidx.compose.ui.graphics.s r13 = (androidx.compose.p015ui.graphics.C1545s) r13
            r51 = r15
            long r14 = r13.f3366a
            androidx.compose.runtime.t r13 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Object r13 = r0.mo5410J(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            long r27 = androidx.compose.p015ui.graphics.C1545s.m3356b(r14, r13)
        L_0x0320:
            r13 = 0
            r0.mo5418R(r13)
            androidx.compose.ui.text.s r13 = new androidx.compose.ui.text.s
            r14 = 175952(0x2af50, float:2.46561E-40)
            r36 = r13
            r37 = r27
            r39 = r30
            r41 = r16
            r42 = r11
            r43 = r18
            r44 = r24
            r46 = r1
            r47 = r9
            r48 = r3
            r50 = r14
            r36.<init>(r37, r39, r41, r42, r43, r44, r46, r47, r48, r50)
            r15 = r51
            androidx.compose.ui.text.s r13 = r15.mo7759c(r13)
            r14 = r2 & 14
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r14
            int r14 = r7 >> 3
            r14 = r14 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r14
            int r7 = r7 << 9
            r14 = r7 & r21
            r2 = r2 | r14
            r14 = r7 & r26
            r2 = r2 | r14
            r7 = r7 & r29
            r2 = r2 | r7
            r7 = 0
            r36 = r35
            r37 = r5
            r38 = r13
            r39 = r12
            r40 = r8
            r41 = r6
            r42 = r10
            r43 = r0
            r44 = r2
            r45 = r7
            androidx.compose.foundation.text.BasicTextKt.m1954b(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r2 = r5
            r17 = r6
            r13 = r9
            r7 = r11
            r19 = r12
            r20 = r15
            r9 = r18
            r5 = r30
            r12 = r1
            r14 = r3
            r18 = r10
            r3 = r22
            r10 = r24
            r34 = r16
            r16 = r8
            r8 = r34
        L_0x0390:
            androidx.compose.runtime.v0 r1 = r0.mo5421U()
            if (r1 != 0) goto L_0x0397
            goto L_0x03ac
        L_0x0397:
            androidx.compose.material.TextKt$Text$2 r0 = new androidx.compose.material.TextKt$Text$2
            r36 = r0
            r33 = r1
            r1 = r35
            r21 = r56
            r22 = r57
            r23 = r58
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r33
            r1.f3081d = r0
        L_0x03ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m2283b(java.lang.String, androidx.compose.ui.d, long, long, androidx.compose.ui.text.font.k, androidx.compose.ui.text.font.m, androidx.compose.ui.text.font.g, long, androidx.compose.ui.text.style.e, androidx.compose.ui.text.style.d, long, int, boolean, int, kq.l, androidx.compose.ui.text.s, androidx.compose.runtime.d, int, int, int):void");
    }
}
