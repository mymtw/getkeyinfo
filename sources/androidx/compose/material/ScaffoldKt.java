package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.layout.SubcomposeLayoutKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1345l1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ScaffoldKt {

    /* renamed from: a */
    public static final C1345l1 f2250a = CompositionLocalKt.m2532c(ScaffoldKt$LocalFabPlacement$1.INSTANCE);

    /* renamed from: b */
    public static final float f2251b = ((float) 16);

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01bc, code lost:
        if (r0.mo5434e(r58) != false) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0143  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2208a(androidx.compose.p015ui.C1436d r44, androidx.compose.material.C1216n1 r45, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r46, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r47, p753kq.C19862q<? super androidx.compose.material.C1254t1, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r48, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r49, int r50, boolean r51, p753kq.C19862q<? super androidx.compose.foundation.layout.C0739i, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r52, boolean r53, androidx.compose.p015ui.graphics.C1530k0 r54, float r55, long r56, long r58, long r60, long r62, long r64, p753kq.C19862q<? super androidx.compose.foundation.layout.C0759v, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r66, androidx.compose.runtime.C1302d r67, int r68, int r69, int r70) {
        /*
            r15 = r66
            r13 = r68
            r14 = r69
            r12 = r70
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = 1037492569(0x3dd6e159, float:0.104922004)
            r1 = r67
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0020
            r4 = r13 | 6
            r5 = r4
            r4 = r44
            goto L_0x0034
        L_0x0020:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x0031
            r4 = r44
            boolean r5 = r0.mo5408I(r4)
            if (r5 == 0) goto L_0x002e
            r5 = 4
            goto L_0x002f
        L_0x002e:
            r5 = 2
        L_0x002f:
            r5 = r5 | r13
            goto L_0x0034
        L_0x0031:
            r4 = r44
            r5 = r13
        L_0x0034:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004d
            r6 = r12 & 2
            if (r6 != 0) goto L_0x0047
            r6 = r45
            boolean r9 = r0.mo5408I(r6)
            if (r9 == 0) goto L_0x0049
            r9 = 32
            goto L_0x004b
        L_0x0047:
            r6 = r45
        L_0x0049:
            r9 = 16
        L_0x004b:
            r5 = r5 | r9
            goto L_0x004f
        L_0x004d:
            r6 = r45
        L_0x004f:
            r9 = r12 & 4
            if (r9 == 0) goto L_0x0056
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x0056:
            r2 = r13 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x006a
            r2 = r46
            boolean r16 = r0.mo5408I(r2)
            if (r16 == 0) goto L_0x0065
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r16 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r5 = r5 | r16
            goto L_0x006c
        L_0x006a:
            r2 = r46
        L_0x006c:
            r16 = r12 & 8
            r17 = 2048(0x800, float:2.87E-42)
            r18 = 1024(0x400, float:1.435E-42)
            if (r16 == 0) goto L_0x0077
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x0077:
            r3 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x008b
            r3 = r47
            boolean r20 = r0.mo5408I(r3)
            if (r20 == 0) goto L_0x0086
            r20 = r17
            goto L_0x0088
        L_0x0086:
            r20 = r18
        L_0x0088:
            r5 = r5 | r20
            goto L_0x008d
        L_0x008b:
            r3 = r47
        L_0x008d:
            r20 = r12 & 16
            r21 = 57344(0xe000, float:8.0356E-41)
            r22 = 8192(0x2000, float:1.14794E-41)
            r23 = 16384(0x4000, float:2.2959E-41)
            if (r20 == 0) goto L_0x009d
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r7 = r48
            goto L_0x00b0
        L_0x009d:
            r24 = r13 & r21
            r7 = r48
            if (r24 != 0) goto L_0x00b0
            boolean r25 = r0.mo5408I(r7)
            if (r25 == 0) goto L_0x00ac
            r25 = r23
            goto L_0x00ae
        L_0x00ac:
            r25 = r22
        L_0x00ae:
            r5 = r5 | r25
        L_0x00b0:
            r25 = r12 & 32
            r26 = 131072(0x20000, float:1.83671E-40)
            r27 = 458752(0x70000, float:6.42848E-40)
            r28 = 65536(0x10000, float:9.18355E-41)
            if (r25 == 0) goto L_0x00c1
            r29 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 | r29
            r8 = r49
            goto L_0x00d4
        L_0x00c1:
            r29 = r13 & r27
            r8 = r49
            if (r29 != 0) goto L_0x00d4
            boolean r30 = r0.mo5408I(r8)
            if (r30 == 0) goto L_0x00d0
            r30 = r26
            goto L_0x00d2
        L_0x00d0:
            r30 = r28
        L_0x00d2:
            r5 = r5 | r30
        L_0x00d4:
            r30 = r12 & 64
            r31 = 3670016(0x380000, float:5.142788E-39)
            r32 = 1048576(0x100000, float:1.469368E-39)
            r33 = 524288(0x80000, float:7.34684E-40)
            if (r30 == 0) goto L_0x00e5
            r34 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 | r34
            r10 = r50
            goto L_0x00f8
        L_0x00e5:
            r34 = r13 & r31
            r10 = r50
            if (r34 != 0) goto L_0x00f8
            boolean r35 = r0.mo5432d(r10)
            if (r35 == 0) goto L_0x00f4
            r35 = r32
            goto L_0x00f6
        L_0x00f4:
            r35 = r33
        L_0x00f6:
            r5 = r5 | r35
        L_0x00f8:
            r11 = r12 & 128(0x80, float:1.794E-43)
            r36 = 29360128(0x1c00000, float:7.052966E-38)
            r37 = 12582912(0xc00000, float:1.7632415E-38)
            if (r11 == 0) goto L_0x0105
            r5 = r5 | r37
            r2 = r51
            goto L_0x0118
        L_0x0105:
            r38 = r13 & r36
            r2 = r51
            if (r38 != 0) goto L_0x0118
            boolean r38 = r0.mo5427a(r2)
            if (r38 == 0) goto L_0x0114
            r38 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0116
        L_0x0114:
            r38 = 4194304(0x400000, float:5.877472E-39)
        L_0x0116:
            r5 = r5 | r38
        L_0x0118:
            r2 = r12 & 256(0x100, float:3.59E-43)
            r38 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x0125
            r39 = 100663296(0x6000000, float:2.4074124E-35)
            r5 = r5 | r39
            r3 = r52
            goto L_0x0138
        L_0x0125:
            r39 = r13 & r38
            r3 = r52
            if (r39 != 0) goto L_0x0138
            boolean r39 = r0.mo5408I(r3)
            if (r39 == 0) goto L_0x0134
            r39 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0136
        L_0x0134:
            r39 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0136:
            r5 = r5 | r39
        L_0x0138:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0143
            r39 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r39
            r4 = r53
            goto L_0x0158
        L_0x0143:
            r39 = 1879048192(0x70000000, float:1.58456325E29)
            r39 = r13 & r39
            r4 = r53
            if (r39 != 0) goto L_0x0158
            boolean r39 = r0.mo5427a(r4)
            if (r39 == 0) goto L_0x0154
            r39 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0156
        L_0x0154:
            r39 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0156:
            r5 = r5 | r39
        L_0x0158:
            r39 = r14 & 14
            if (r39 != 0) goto L_0x0172
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L_0x016b
            r4 = r54
            boolean r39 = r0.mo5408I(r4)
            if (r39 == 0) goto L_0x016d
            r19 = 4
            goto L_0x016f
        L_0x016b:
            r4 = r54
        L_0x016d:
            r19 = 2
        L_0x016f:
            r19 = r14 | r19
            goto L_0x0176
        L_0x0172:
            r4 = r54
            r19 = r14
        L_0x0176:
            r4 = r12 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x017f
            r19 = r19 | 48
            r6 = r55
            goto L_0x0192
        L_0x017f:
            r39 = r14 & 112(0x70, float:1.57E-43)
            r6 = r55
            if (r39 != 0) goto L_0x0192
            boolean r39 = r0.mo5428b(r6)
            if (r39 == 0) goto L_0x018e
            r24 = 32
            goto L_0x0190
        L_0x018e:
            r24 = 16
        L_0x0190:
            r19 = r19 | r24
        L_0x0192:
            r6 = r14 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x01ac
            r6 = r12 & 4096(0x1000, float:5.74E-42)
            if (r6 != 0) goto L_0x01a5
            r6 = r56
            boolean r24 = r0.mo5434e(r6)
            if (r24 == 0) goto L_0x01a7
            r34 = 256(0x100, float:3.59E-43)
            goto L_0x01a9
        L_0x01a5:
            r6 = r56
        L_0x01a7:
            r34 = 128(0x80, float:1.794E-43)
        L_0x01a9:
            r19 = r19 | r34
            goto L_0x01ae
        L_0x01ac:
            r6 = r56
        L_0x01ae:
            r6 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x01c6
            r6 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r6 != 0) goto L_0x01bf
            r6 = r58
            boolean r24 = r0.mo5434e(r6)
            if (r24 == 0) goto L_0x01c1
            goto L_0x01c3
        L_0x01bf:
            r6 = r58
        L_0x01c1:
            r17 = r18
        L_0x01c3:
            r19 = r19 | r17
            goto L_0x01c8
        L_0x01c6:
            r6 = r58
        L_0x01c8:
            r17 = r14 & r21
            if (r17 != 0) goto L_0x01e0
            r6 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r6 != 0) goto L_0x01db
            r6 = r60
            boolean r17 = r0.mo5434e(r6)
            if (r17 == 0) goto L_0x01dd
            r22 = r23
            goto L_0x01dd
        L_0x01db:
            r6 = r60
        L_0x01dd:
            r19 = r19 | r22
            goto L_0x01e2
        L_0x01e0:
            r6 = r60
        L_0x01e2:
            r17 = r14 & r27
            r18 = 32768(0x8000, float:4.5918E-41)
            if (r17 != 0) goto L_0x01fd
            r17 = r12 & r18
            r6 = r62
            if (r17 != 0) goto L_0x01f8
            boolean r17 = r0.mo5434e(r6)
            if (r17 == 0) goto L_0x01f8
            r17 = r26
            goto L_0x01fa
        L_0x01f8:
            r17 = r28
        L_0x01fa:
            r19 = r19 | r17
            goto L_0x01ff
        L_0x01fd:
            r6 = r62
        L_0x01ff:
            r17 = r14 & r31
            if (r17 != 0) goto L_0x0215
            r17 = r12 & r28
            r6 = r64
            if (r17 != 0) goto L_0x0210
            boolean r17 = r0.mo5434e(r6)
            if (r17 == 0) goto L_0x0210
            goto L_0x0212
        L_0x0210:
            r32 = r33
        L_0x0212:
            r19 = r19 | r32
            goto L_0x0217
        L_0x0215:
            r6 = r64
        L_0x0217:
            r17 = r12 & r26
            if (r17 == 0) goto L_0x021c
            goto L_0x022b
        L_0x021c:
            r17 = r14 & r36
            if (r17 != 0) goto L_0x022d
            boolean r17 = r0.mo5408I(r15)
            if (r17 == 0) goto L_0x0229
            r37 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x022b
        L_0x0229:
            r37 = 4194304(0x400000, float:5.877472E-39)
        L_0x022b:
            r19 = r19 | r37
        L_0x022d:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r6 = r5 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r6 != r7) goto L_0x026d
            r6 = 23967451(0x16db6db, float:4.3661218E-38)
            r6 = r19 & r6
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r7) goto L_0x026d
            boolean r6 = r0.mo5442i()
            if (r6 != 0) goto L_0x0248
            goto L_0x026d
        L_0x0248:
            r0.mo5396C()
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r9 = r52
            r11 = r54
            r12 = r55
            r17 = r56
            r19 = r58
            r22 = r60
            r24 = r62
            r28 = r64
            r6 = r8
            r7 = r10
            r8 = r51
            r10 = r53
            goto L_0x04b6
        L_0x026d:
            r0.mo5466u0()
            r6 = r13 & 1
            if (r6 == 0) goto L_0x02d5
            boolean r6 = r0.mo5425Y()
            if (r6 == 0) goto L_0x027b
            goto L_0x02d5
        L_0x027b:
            r0.mo5396C()
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0284
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0284:
            r1 = r12 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x028a
            r19 = r19 & -15
        L_0x028a:
            r1 = r19
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x0292
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0292:
            r2 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0298
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0298:
            r2 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x02a0
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r2
        L_0x02a0:
            r2 = r12 & r18
            if (r2 == 0) goto L_0x02a8
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x02a8:
            r2 = r12 & r28
            if (r2 == 0) goto L_0x02b0
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r1 = r1 & r2
        L_0x02b0:
            r6 = r45
            r2 = r46
            r7 = r47
            r11 = r51
            r3 = r52
            r16 = r53
            r4 = r54
            r17 = r56
            r19 = r58
            r22 = r60
            r24 = r62
            r28 = r64
            r26 = r1
            r30 = r5
            r9 = r8
            r1 = r44
            r8 = r48
            r5 = r55
            goto L_0x0400
        L_0x02d5:
            if (r1 == 0) goto L_0x02da
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x02dc
        L_0x02da:
            r1 = r44
        L_0x02dc:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x032b
            r6 = 1569641925(0x5d8ed5c5, float:1.28654364E18)
            r0.mo5465u(r6)
            androidx.compose.material.DrawerValue r6 = androidx.compose.material.DrawerValue.Closed
            androidx.compose.material.k0 r6 = androidx.compose.material.DrawerKt.m2181d(r6, r0)
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r7)
            java.lang.Object r7 = r0.mo5431c0()
            r17 = r1
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r7 != r1) goto L_0x0304
            androidx.compose.material.t1 r7 = new androidx.compose.material.t1
            r7.<init>()
            r0.mo5407H0(r7)
        L_0x0304:
            r8 = 0
            r0.mo5418R(r8)
            androidx.compose.material.t1 r7 = (androidx.compose.material.C1254t1) r7
            r8 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r8)
            java.lang.Object r8 = r0.mo5431c0()
            if (r8 != r1) goto L_0x031e
            androidx.compose.material.n1 r8 = new androidx.compose.material.n1
            r8.<init>(r6, r7)
            r0.mo5407H0(r8)
        L_0x031e:
            r1 = 0
            r0.mo5418R(r1)
            r6 = r8
            androidx.compose.material.n1 r6 = (androidx.compose.material.C1216n1) r6
            r0.mo5418R(r1)
            r5 = r5 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x032f
        L_0x032b:
            r17 = r1
            r6 = r45
        L_0x032f:
            if (r9 == 0) goto L_0x0334
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f2191a
            goto L_0x0336
        L_0x0334:
            r1 = r46
        L_0x0336:
            if (r16 == 0) goto L_0x033b
            androidx.compose.runtime.internal.ComposableLambdaImpl r7 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f2192b
            goto L_0x033d
        L_0x033b:
            r7 = r47
        L_0x033d:
            if (r20 == 0) goto L_0x0342
            androidx.compose.runtime.internal.ComposableLambdaImpl r8 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f2193c
            goto L_0x0344
        L_0x0342:
            r8 = r48
        L_0x0344:
            if (r25 == 0) goto L_0x0349
            androidx.compose.runtime.internal.ComposableLambdaImpl r9 = androidx.compose.material.ComposableSingletons$ScaffoldKt.f2194d
            goto L_0x034b
        L_0x0349:
            r9 = r49
        L_0x034b:
            r16 = 1
            if (r30 == 0) goto L_0x0351
            r10 = r16
        L_0x0351:
            if (r11 == 0) goto L_0x0355
            r11 = 0
            goto L_0x0357
        L_0x0355:
            r11 = r51
        L_0x0357:
            if (r2 == 0) goto L_0x035b
            r2 = 0
            goto L_0x035d
        L_0x035b:
            r2 = r52
        L_0x035d:
            if (r3 == 0) goto L_0x0360
            goto L_0x0362
        L_0x0360:
            r16 = r53
        L_0x0362:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0373
            androidx.compose.runtime.l1 r3 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r3 = r0.mo5410J(r3)
            androidx.compose.material.q1 r3 = (androidx.compose.material.C1225q1) r3
            p.a r3 = r3.f2549c
            r19 = r19 & -15
            goto L_0x0375
        L_0x0373:
            r3 = r54
        L_0x0375:
            r44 = r1
            r1 = r19
            if (r4 == 0) goto L_0x037e
            float r4 = androidx.compose.material.C1203j0.f2505a
            goto L_0x0380
        L_0x037e:
            r4 = r55
        L_0x0380:
            r45 = r2
            r2 = r12 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x039a
            androidx.compose.runtime.l1 r2 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.material.v r2 = (androidx.compose.material.C1259v) r2
            long r19 = r2.mo5363j()
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            r46 = r3
            r3 = r1
            r1 = r19
            goto L_0x039f
        L_0x039a:
            r46 = r3
            r3 = r1
            r1 = r56
        L_0x039f:
            r47 = r4
            r4 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x03ac
            long r19 = androidx.compose.material.ColorsKt.m2174b(r1, r0)
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x03ae
        L_0x03ac:
            r19 = r58
        L_0x03ae:
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x03bb
            long r22 = androidx.compose.material.C1203j0.m2333a(r0)
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r4
            goto L_0x03bd
        L_0x03bb:
            r22 = r60
        L_0x03bd:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x03d6
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.material.v r4 = (androidx.compose.material.C1259v) r4
            long r24 = r4.mo5354a()
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
            r18 = r3
            r3 = r24
            goto L_0x03da
        L_0x03d6:
            r18 = r3
            r3 = r62
        L_0x03da:
            r24 = r12 & r28
            if (r24 == 0) goto L_0x03e8
            long r24 = androidx.compose.material.ColorsKt.m2174b(r3, r0)
            r26 = -3670017(0xffffffffffc7ffff, float:NaN)
            r18 = r18 & r26
            goto L_0x03ea
        L_0x03e8:
            r24 = r64
        L_0x03ea:
            r30 = r5
            r26 = r18
            r28 = r24
            r5 = r47
            r24 = r3
            r3 = r45
            r4 = r46
            r42 = r1
            r2 = r44
            r1 = r17
            r17 = r42
        L_0x0400:
            r0.mo5419S()
            androidx.compose.material.ScaffoldKt$Scaffold$child$1 r12 = new androidx.compose.material.ScaffoldKt$Scaffold$child$1
            r44 = r12
            r45 = r24
            r47 = r28
            r49 = r26
            r50 = r11
            r51 = r10
            r52 = r2
            r53 = r66
            r54 = r9
            r55 = r7
            r56 = r30
            r57 = r8
            r58 = r6
            r44.<init>(r45, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r60 = r2
            r2 = 1823402604(0x6caeea6c, float:1.691681E27)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r0, r2, r12)
            if (r3 == 0) goto L_0x048e
            r12 = -1013848234(0xffffffffc391e756, float:-291.8073)
            r0.mo5465u(r12)
            androidx.compose.material.k0 r12 = r6.f2532a
            r61 = r6
            r6 = 100842932(0x602bdb4, float:2.4589654E-35)
            r62 = r7
            androidx.compose.material.ScaffoldKt$Scaffold$1 r7 = new androidx.compose.material.ScaffoldKt$Scaffold$1
            r7.<init>(r2)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r0, r6, r7)
            r6 = 805306368(0x30000000, float:4.656613E-10)
            int r7 = r30 >> 24
            r7 = r7 & 14
            r6 = r6 | r7
            int r7 = r30 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r6 = r6 | r7
            int r7 = r30 >> 18
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r7
            int r7 = r26 << 12
            r21 = r7 & r21
            r6 = r6 | r21
            r21 = r7 & r27
            r6 = r6 | r21
            r21 = r7 & r31
            r6 = r6 | r21
            r21 = r7 & r36
            r6 = r6 | r21
            r7 = r7 & r38
            r6 = r6 | r7
            r7 = 0
            r44 = r3
            r45 = r1
            r46 = r12
            r47 = r16
            r48 = r4
            r49 = r5
            r50 = r17
            r52 = r19
            r54 = r22
            r56 = r2
            r57 = r0
            r58 = r6
            r59 = r7
            androidx.compose.material.DrawerKt.m2178a(r44, r45, r46, r47, r48, r49, r50, r52, r54, r56, r57, r58, r59)
            r2 = 0
            r0.mo5418R(r2)
            goto L_0x04a7
        L_0x048e:
            r61 = r6
            r62 = r7
            r6 = -1013847725(0xffffffffc391e953, float:-291.82285)
            r0.mo5465u(r6)
            r6 = r30 & 14
            r6 = r6 | 48
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2.invoke(r1, r0, r6)
            r2 = 0
            r0.mo5418R(r2)
        L_0x04a7:
            r2 = r61
            r12 = r5
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r11
            r10 = r16
            r9 = r3
            r11 = r4
            r3 = r60
            r4 = r62
        L_0x04b6:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x04bd
            goto L_0x04df
        L_0x04bd:
            androidx.compose.material.ScaffoldKt$Scaffold$2 r15 = new androidx.compose.material.ScaffoldKt$Scaffold$2
            r40 = r0
            r0 = r15
            r13 = r17
            r41 = r15
            r15 = r19
            r17 = r22
            r19 = r24
            r21 = r28
            r23 = r66
            r24 = r68
            r25 = r69
            r26 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r23, r24, r25, r26)
            r1 = r40
            r0 = r41
            r1.f3081d = r0
        L_0x04df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.m2208a(androidx.compose.ui.d, androidx.compose.material.n1, kq.p, kq.p, kq.q, kq.p, int, boolean, kq.q, boolean, androidx.compose.ui.graphics.k0, float, long, long, long, long, long, kq.q, androidx.compose.runtime.d, int, int, int):void");
    }

    /* renamed from: b */
    public static final void m2209b(boolean z, int i, C19861p pVar, C19862q qVar, C19861p pVar2, C19861p pVar3, C19861p pVar4, C1302d dVar, int i2) {
        int i3;
        ComposerImpl composerImpl;
        int i4 = i;
        C19861p pVar5 = pVar;
        C19862q qVar2 = qVar;
        C19861p pVar6 = pVar2;
        C19861p pVar7 = pVar3;
        C19861p pVar8 = pVar4;
        int i5 = i2;
        ComposerImpl h = dVar.mo5440h(-1401632215);
        boolean z2 = z;
        if ((i5 & 14) == 0) {
            i3 = (h.mo5427a(z2) ? 4 : 2) | i5;
        } else {
            i3 = i5;
        }
        if ((i5 & 112) == 0) {
            i3 |= h.mo5432d(i4) ? 32 : 16;
        }
        if ((i5 & 896) == 0) {
            i3 |= h.mo5408I(pVar5) ? 256 : 128;
        }
        if ((i5 & 7168) == 0) {
            i3 |= h.mo5408I(qVar2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((57344 & i5) == 0) {
            i3 |= h.mo5408I(pVar6) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((458752 & i5) == 0) {
            i3 |= h.mo5408I(pVar7) ? 131072 : 65536;
        }
        if ((3670016 & i5) == 0) {
            i3 |= h.mo5408I(pVar8) ? 1048576 : 524288;
        }
        int i6 = i3;
        if ((i6 & 2995931) != 599186 || !h.mo5442i()) {
            Object[] objArr = {pVar5, pVar6, pVar7, new C1250s0(i4), Boolean.valueOf(z), pVar8, qVar2};
            h.mo5465u(-568225417);
            boolean z3 = false;
            for (int i7 = 0; i7 < 7; i7++) {
                z3 |= h.mo5408I(objArr[i7]);
            }
            Object c0 = h.mo5431c0();
            if (z3 || c0 == C1302d.C1303a.f2828a) {
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = r0;
                composerImpl = h;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$12 = new ScaffoldKt$ScaffoldLayout$1$1(pVar, pVar2, pVar3, i, z, pVar4, i6, qVar);
                composerImpl.mo5407H0(scaffoldKt$ScaffoldLayout$1$1);
                c0 = scaffoldKt$ScaffoldLayout$1$1;
            } else {
                composerImpl = h;
            }
            composerImpl.mo5418R(false);
            SubcomposeLayoutKt.m3531a((C1436d) null, (C19861p) c0, composerImpl, 0, 1);
        } else {
            h.mo5396C();
            composerImpl = h;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new ScaffoldKt$ScaffoldLayout$2(z, i, pVar, qVar, pVar2, pVar3, pVar4, i2);
        }
    }
}
