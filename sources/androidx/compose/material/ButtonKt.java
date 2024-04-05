package androidx.compose.material;

public final class ButtonKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: androidx.compose.material.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: androidx.compose.material.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: androidx.compose.material.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v8, resolved type: androidx.compose.material.x} */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0227, code lost:
        if (r3 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x0229;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2170a(p753kq.C19846a<kotlin.C19394m> r29, androidx.compose.p015ui.C1436d r30, boolean r31, androidx.compose.foundation.interaction.C0640j r32, androidx.compose.material.C1220p r33, androidx.compose.p015ui.graphics.C1530k0 r34, androidx.compose.foundation.C0556g r35, androidx.compose.material.C1214n r36, androidx.compose.foundation.layout.C0759v r37, p753kq.C19862q<? super androidx.compose.foundation.layout.C0763z, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, androidx.compose.runtime.C1302d r39, int r40, int r41) {
        /*
            r15 = r29
            r14 = r38
            r13 = r40
            r12 = r41
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = -2116133464(0xffffffff81de5da8, float:-8.168431E-38)
            r1 = r39
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0022
            r0 = r13 | 6
            goto L_0x0032
        L_0x0022:
            r0 = r13 & 14
            if (r0 != 0) goto L_0x0031
            boolean r0 = r11.mo5408I(r15)
            if (r0 == 0) goto L_0x002e
            r0 = 4
            goto L_0x002f
        L_0x002e:
            r0 = 2
        L_0x002f:
            r0 = r0 | r13
            goto L_0x0032
        L_0x0031:
            r0 = r13
        L_0x0032:
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
            goto L_0x004c
        L_0x0039:
            r2 = r13 & 112(0x70, float:1.57E-43)
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
            r4 = r13 & 896(0x380, float:1.256E-42)
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
            r6 = r13 & 7168(0x1c00, float:1.0045E-41)
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
            r7 = r7 & r13
            if (r7 != 0) goto L_0x00a1
            r7 = r12 & 16
            if (r7 != 0) goto L_0x009b
            r7 = r33
            boolean r8 = r11.mo5408I(r7)
            if (r8 == 0) goto L_0x009d
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009b:
            r7 = r33
        L_0x009d:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r0 = r0 | r8
            goto L_0x00a3
        L_0x00a1:
            r7 = r33
        L_0x00a3:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00bd
            r8 = r12 & 32
            if (r8 != 0) goto L_0x00b7
            r8 = r34
            boolean r9 = r11.mo5408I(r8)
            if (r9 == 0) goto L_0x00b9
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bb
        L_0x00b7:
            r8 = r34
        L_0x00b9:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00bb:
            r0 = r0 | r9
            goto L_0x00bf
        L_0x00bd:
            r8 = r34
        L_0x00bf:
            r9 = r12 & 64
            r10 = 3670016(0x380000, float:5.142788E-39)
            if (r9 == 0) goto L_0x00cc
            r16 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 | r16
            r10 = r35
            goto L_0x00df
        L_0x00cc:
            r16 = r13 & r10
            r10 = r35
            if (r16 != 0) goto L_0x00df
            boolean r16 = r11.mo5408I(r10)
            if (r16 == 0) goto L_0x00db
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r0 = r0 | r16
        L_0x00df:
            r16 = 29360128(0x1c00000, float:7.052966E-38)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00fb
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00f4
            r2 = r36
            boolean r16 = r11.mo5408I(r2)
            if (r16 == 0) goto L_0x00f6
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f4:
            r2 = r36
        L_0x00f6:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r0 = r0 | r16
            goto L_0x00fd
        L_0x00fb:
            r2 = r36
        L_0x00fd:
            r2 = r12 & 256(0x100, float:3.59E-43)
            r16 = 234881024(0xe000000, float:1.5777218E-30)
            if (r2 == 0) goto L_0x010a
            r17 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 | r17
            r4 = r37
            goto L_0x011d
        L_0x010a:
            r17 = r13 & r16
            r4 = r37
            if (r17 != 0) goto L_0x011d
            boolean r17 = r11.mo5408I(r4)
            if (r17 == 0) goto L_0x0119
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011b
        L_0x0119:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011b:
            r0 = r0 | r17
        L_0x011d:
            r4 = r12 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == 0) goto L_0x0126
            r0 = r0 | r17
            goto L_0x0137
        L_0x0126:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x0137
            boolean r4 = r11.mo5408I(r14)
            if (r4 == 0) goto L_0x0134
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r0 = r0 | r4
        L_0x0137:
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r4 & r0
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r6) goto L_0x015b
            boolean r4 = r11.mo5442i()
            if (r4 != 0) goto L_0x0147
            goto L_0x015b
        L_0x0147:
            r11.mo5396C()
            r2 = r30
            r3 = r31
            r4 = r32
            r9 = r37
            r5 = r7
            r6 = r8
            r7 = r10
            r27 = r11
            r8 = r36
            goto L_0x0387
        L_0x015b:
            r11.mo5466u0()
            r4 = r13 & 1
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            r19 = 0
            r6 = 0
            if (r4 == 0) goto L_0x0199
            boolean r4 = r11.mo5425Y()
            if (r4 == 0) goto L_0x016f
            goto L_0x0199
        L_0x016f:
            r11.mo5396C()
            r1 = r12 & 16
            if (r1 == 0) goto L_0x0178
            r0 = r0 & r18
        L_0x0178:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0180
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r1
        L_0x0180:
            r1 = r12 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0188
            r1 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r1
        L_0x0188:
            r18 = r30
            r9 = r32
            r6 = r36
            r20 = r8
            r21 = r10
            r10 = r31
            r8 = r7
            r7 = r37
            goto L_0x02ea
        L_0x0199:
            if (r1 == 0) goto L_0x019e
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x01a0
        L_0x019e:
            r1 = r30
        L_0x01a0:
            if (r3 == 0) goto L_0x01a4
            r3 = 1
            goto L_0x01a6
        L_0x01a4:
            r3 = r31
        L_0x01a6:
            if (r5 == 0) goto L_0x01c0
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r4)
            java.lang.Object r4 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r5) goto L_0x01ba
            androidx.compose.foundation.interaction.k r4 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x01ba:
            r11.mo5418R(r6)
            androidx.compose.foundation.interaction.j r4 = (androidx.compose.foundation.interaction.C0640j) r4
            goto L_0x01c2
        L_0x01c0:
            r4 = r32
        L_0x01c2:
            r5 = r12 & 16
            if (r5 == 0) goto L_0x0249
            androidx.compose.foundation.layout.w r5 = androidx.compose.material.C1217o.f2534a
            r5 = -737170518(0xffffffffd40fabaa, float:-2.46824147E12)
            r11.mo5465u(r5)
            r5 = 2
            float r5 = (float) r5
            r7 = 8
            float r7 = (float) r7
            float r6 = (float) r6
            r30 = r1
            r1 = 4
            float r1 = (float) r1
            r31 = r3
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r32 = r4
            m0.d r4 = new m0.d
            r4.<init>(r5)
            r21 = 0
            r3[r21] = r4
            m0.d r4 = new m0.d
            r4.<init>(r7)
            r21 = 1
            r3[r21] = r4
            m0.d r4 = new m0.d
            r4.<init>(r6)
            r21 = 2
            r3[r21] = r4
            r4 = 3
            m0.d r8 = new m0.d
            r8.<init>(r1)
            r3[r4] = r8
            m0.d r4 = new m0.d
            r4.<init>(r1)
            r8 = 4
            r3[r8] = r4
            r4 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.mo5465u(r4)
            r4 = 0
            r8 = 0
        L_0x0212:
            r10 = 5
            if (r4 >= r10) goto L_0x021f
            r10 = r3[r4]
            boolean r10 = r11.mo5408I(r10)
            r8 = r8 | r10
            int r4 = r4 + 1
            goto L_0x0212
        L_0x021f:
            java.lang.Object r3 = r11.mo5431c0()
            if (r8 != 0) goto L_0x0229
            androidx.compose.runtime.d$a$a r4 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r4) goto L_0x023d
        L_0x0229:
            androidx.compose.material.x r3 = new androidx.compose.material.x
            r21 = r3
            r22 = r5
            r23 = r7
            r24 = r6
            r25 = r1
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            r11.mo5407H0(r3)
        L_0x023d:
            r1 = 0
            r11.mo5418R(r1)
            androidx.compose.material.x r3 = (androidx.compose.material.C1265x) r3
            r11.mo5418R(r1)
            r0 = r0 & r18
            goto L_0x0250
        L_0x0249:
            r30 = r1
            r31 = r3
            r32 = r4
            r3 = r7
        L_0x0250:
            r1 = r12 & 32
            if (r1 == 0) goto L_0x0263
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r1 = r11.mo5410J(r1)
            androidx.compose.material.q1 r1 = (androidx.compose.material.C1225q1) r1
            p.a r1 = r1.f2547a
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r4
            goto L_0x0265
        L_0x0263:
            r1 = r34
        L_0x0265:
            if (r9 == 0) goto L_0x026a
            r4 = r19
            goto L_0x026c
        L_0x026a:
            r4 = r35
        L_0x026c:
            r5 = r12 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x02cf
            androidx.compose.foundation.layout.w r5 = androidx.compose.material.C1217o.f2534a
            r5 = 1870371134(0x6f7b993e, float:7.7865996E28)
            r11.mo5465u(r5)
            androidx.compose.runtime.l1 r5 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r6 = r11.mo5410J(r5)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            long r6 = r6.mo5359f()
            long r23 = androidx.compose.material.ColorsKt.m2174b(r6, r11)
            java.lang.Object r8 = r11.mo5410J(r5)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            long r8 = r8.mo5358e()
            r10 = 1039516303(0x3df5c28f, float:0.12)
            long r8 = androidx.compose.p015ui.graphics.C1545s.m3356b(r8, r10)
            java.lang.Object r10 = r11.mo5410J(r5)
            androidx.compose.material.v r10 = (androidx.compose.material.C1259v) r10
            r33 = r3
            r34 = r4
            long r3 = r10.mo5363j()
            long r25 = p628nj.C18263b.m30808C(r8, r3)
            java.lang.Object r3 = r11.mo5410J(r5)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5358e()
            float r5 = kotlinx.coroutines.C19543e0.m33299P(r11)
            long r27 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r5)
            androidx.compose.material.w r3 = new androidx.compose.material.w
            r20 = r3
            r21 = r6
            r20.<init>(r21, r23, r25, r27)
            r4 = 0
            r11.mo5418R(r4)
            r4 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r0 = r0 & r4
            goto L_0x02d5
        L_0x02cf:
            r33 = r3
            r34 = r4
            r3 = r36
        L_0x02d5:
            if (r2 == 0) goto L_0x02da
            androidx.compose.foundation.layout.w r2 = androidx.compose.material.C1217o.f2534a
            goto L_0x02dc
        L_0x02da:
            r2 = r37
        L_0x02dc:
            r18 = r30
            r10 = r31
            r9 = r32
            r8 = r33
            r21 = r34
            r20 = r1
            r7 = r2
            r6 = r3
        L_0x02ea:
            r11.mo5419S()
            int r1 = r0 >> 6
            r2 = r1 & 14
            androidx.compose.runtime.j0 r3 = r6.mo5292a(r10, r11)
            androidx.compose.runtime.j0 r4 = r6.mo5293b(r10, r11)
            java.lang.Object r4 = r4.getValue()
            androidx.compose.ui.graphics.s r4 = (androidx.compose.p015ui.graphics.C1545s) r4
            long r4 = r4.f3366a
            java.lang.Object r22 = r3.getValue()
            r23 = r6
            r6 = r22
            androidx.compose.ui.graphics.s r6 = (androidx.compose.p015ui.graphics.C1545s) r6
            long r12 = r6.f3366a
            r6 = 1065353216(0x3f800000, float:1.0)
            long r12 = androidx.compose.p015ui.graphics.C1545s.m3356b(r12, r6)
            if (r8 != 0) goto L_0x0316
            goto L_0x0320
        L_0x0316:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            androidx.compose.animation.core.f r19 = r8.mo5294a(r10, r9, r11, r2)
        L_0x0320:
            if (r19 == 0) goto L_0x032b
            java.lang.Object r2 = r19.getValue()
            m0.d r2 = (p174m0.C7284d) r2
            float r2 = r2.f16155b
            goto L_0x032d
        L_0x032b:
            r2 = 0
            float r2 = (float) r2
        L_0x032d:
            r19 = r2
            r2 = 7524271(0x72cfaf, float:1.054375E-38)
            androidx.compose.material.ButtonKt$Button$2 r6 = new androidx.compose.material.ButtonKt$Button$2
            r6.<init>(r3, r7, r14, r0)
            androidx.compose.runtime.internal.ComposableLambdaImpl r22 = p628nj.C18263b.m30805A(r11, r2, r6)
            r2 = r0 & 14
            r2 = r2 | r17
            r3 = r0 & 112(0x70, float:1.57E-43)
            r2 = r2 | r3
            r3 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r0
            r1 = r1 | r2
            int r0 = r0 << 15
            r0 = r0 & r16
            r16 = r1 | r0
            r17 = 0
            r0 = r29
            r1 = r18
            r2 = r10
            r3 = r20
            r24 = r7
            r6 = r12
            r25 = r8
            r8 = r21
            r26 = r9
            r9 = r19
            r19 = r10
            r10 = r26
            r27 = r11
            r11 = r22
            r12 = r27
            r13 = r16
            r14 = r17
            androidx.compose.material.SurfaceKt.m2235b(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14)
            r2 = r18
            r3 = r19
            r6 = r20
            r7 = r21
            r8 = r23
            r9 = r24
            r5 = r25
            r4 = r26
        L_0x0387:
            androidx.compose.runtime.v0 r13 = r27.mo5421U()
            if (r13 != 0) goto L_0x038e
            goto L_0x039e
        L_0x038e:
            androidx.compose.material.ButtonKt$Button$3 r14 = new androidx.compose.material.ButtonKt$Button$3
            r0 = r14
            r1 = r29
            r10 = r38
            r11 = r40
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f3081d = r14
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.m2170a(kq.a, androidx.compose.ui.d, boolean, androidx.compose.foundation.interaction.j, androidx.compose.material.p, androidx.compose.ui.graphics.k0, androidx.compose.foundation.g, androidx.compose.material.n, androidx.compose.foundation.layout.v, kq.q, androidx.compose.runtime.d, int, int):void");
    }
}
