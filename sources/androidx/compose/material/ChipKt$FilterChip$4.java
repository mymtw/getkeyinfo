package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class ChipKt$FilterChip$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ C1222p1 $colors;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $selectedIcon;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $trailingIcon;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$FilterChip$4(boolean z, C19846a<C19394m> aVar, C1436d dVar, boolean z2, C0640j jVar, C1530k0 k0Var, C0556g gVar, C1222p1 p1Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar3, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2, int i3) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$shape = k0Var;
        this.$border = gVar;
        this.$colors = p1Var;
        this.$leadingIcon = pVar;
        this.$selectedIcon = pVar2;
        this.$trailingIcon = pVar3;
        this.$content = qVar;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: androidx.compose.material.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: androidx.compose.material.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: p.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: androidx.compose.material.d0} */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r57, int r58) {
        /*
            r56 = this;
            r0 = r56
            boolean r13 = r0.$selected
            kq.a<kotlin.m> r12 = r0.$onClick
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            androidx.compose.ui.graphics.k0 r4 = r0.$shape
            androidx.compose.foundation.g r5 = r0.$border
            androidx.compose.material.p1 r6 = r0.$colors
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$leadingIcon
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r8 = r0.$selectedIcon
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r9 = r0.$trailingIcon
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r15 = r0.$content
            int r10 = r0.$$changed
            r11 = r10 | 1
            int r10 = r0.$$changed1
            int r14 = r0.$$default
            float r16 = androidx.compose.material.C1256u.f2622a
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            r0 = -1259208246(0xffffffffb4f201ca, float:-4.5077314E-7)
            r16 = r15
            r15 = r57
            androidx.compose.runtime.ComposerImpl r0 = r15.mo5440h(r0)
            r15 = r14 & 1
            r17 = 2
            r18 = 4
            if (r15 == 0) goto L_0x0044
            r15 = r11 | 6
            goto L_0x0056
        L_0x0044:
            r15 = r11 & 14
            if (r15 != 0) goto L_0x0055
            boolean r15 = r0.mo5427a(r13)
            if (r15 == 0) goto L_0x0051
            r15 = r18
            goto L_0x0053
        L_0x0051:
            r15 = r17
        L_0x0053:
            r15 = r15 | r11
            goto L_0x0056
        L_0x0055:
            r15 = r11
        L_0x0056:
            r19 = r14 & 2
            r20 = 16
            r21 = 32
            if (r19 == 0) goto L_0x0061
            r15 = r15 | 48
            goto L_0x0072
        L_0x0061:
            r19 = r11 & 112(0x70, float:1.57E-43)
            if (r19 != 0) goto L_0x0072
            boolean r19 = r0.mo5408I(r12)
            if (r19 == 0) goto L_0x006e
            r19 = r21
            goto L_0x0070
        L_0x006e:
            r19 = r20
        L_0x0070:
            r15 = r15 | r19
        L_0x0072:
            r19 = r14 & 4
            if (r19 == 0) goto L_0x007b
            r15 = r15 | 384(0x180, float:5.38E-43)
            r23 = r12
            goto L_0x008d
        L_0x007b:
            r23 = r12
            r12 = r11 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x008d
            boolean r12 = r0.mo5408I(r1)
            if (r12 == 0) goto L_0x008a
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x008c
        L_0x008a:
            r12 = 128(0x80, float:1.794E-43)
        L_0x008c:
            r15 = r15 | r12
        L_0x008d:
            r12 = r14 & 8
            if (r12 == 0) goto L_0x0096
            r15 = r15 | 3072(0xc00, float:4.305E-42)
            r22 = r1
            goto L_0x00a9
        L_0x0096:
            r22 = r1
            r1 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x00a9
            boolean r1 = r0.mo5427a(r2)
            if (r1 == 0) goto L_0x00a5
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x00a7
        L_0x00a5:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x00a7:
            r1 = r1 | r15
            goto L_0x00aa
        L_0x00a9:
            r1 = r15
        L_0x00aa:
            r15 = r14 & 16
            r25 = 57344(0xe000, float:8.0356E-41)
            if (r15 == 0) goto L_0x00b4
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00c5
        L_0x00b4:
            r24 = r11 & r25
            if (r24 != 0) goto L_0x00c5
            boolean r24 = r0.mo5408I(r3)
            if (r24 == 0) goto L_0x00c1
            r24 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c3
        L_0x00c1:
            r24 = 8192(0x2000, float:1.14794E-41)
        L_0x00c3:
            r1 = r1 | r24
        L_0x00c5:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r11 & r24
            if (r24 != 0) goto L_0x00dc
            r24 = r14 & 32
            if (r24 != 0) goto L_0x00d8
            boolean r24 = r0.mo5408I(r4)
            if (r24 == 0) goto L_0x00d8
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00da
        L_0x00d8:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00da:
            r1 = r1 | r24
        L_0x00dc:
            r24 = r14 & 64
            if (r24 == 0) goto L_0x00e3
            r26 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00f4
        L_0x00e3:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r11 & r26
            if (r26 != 0) goto L_0x00f6
            boolean r26 = r0.mo5408I(r5)
            if (r26 == 0) goto L_0x00f2
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f4
        L_0x00f2:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00f4:
            r1 = r1 | r26
        L_0x00f6:
            r26 = 29360128(0x1c00000, float:7.052966E-38)
            r27 = r11 & r26
            if (r27 != 0) goto L_0x010f
            r27 = r2
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x010b
            boolean r2 = r0.mo5408I(r6)
            if (r2 == 0) goto L_0x010b
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010d
        L_0x010b:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x010d:
            r1 = r1 | r2
            goto L_0x0111
        L_0x010f:
            r27 = r2
        L_0x0111:
            r2 = r14 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0118
            r28 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x0129
        L_0x0118:
            r28 = 234881024(0xe000000, float:1.5777218E-30)
            r28 = r11 & r28
            if (r28 != 0) goto L_0x012b
            boolean r28 = r0.mo5408I(r7)
            if (r28 == 0) goto L_0x0127
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r1 = r1 | r28
        L_0x012b:
            r28 = r3
            r3 = r14 & 512(0x200, float:7.175E-43)
            r29 = 1879048192(0x70000000, float:1.58456325E29)
            if (r3 == 0) goto L_0x0136
            r30 = 805306368(0x30000000, float:4.656613E-10)
            goto L_0x0145
        L_0x0136:
            r30 = r11 & r29
            if (r30 != 0) goto L_0x0147
            boolean r30 = r0.mo5408I(r8)
            if (r30 == 0) goto L_0x0143
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r1 = r1 | r30
        L_0x0147:
            r30 = r4
            r4 = r14 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0150
            r17 = r10 | 6
            goto L_0x0161
        L_0x0150:
            r31 = r10 & 14
            if (r31 != 0) goto L_0x015f
            boolean r31 = r0.mo5408I(r9)
            if (r31 == 0) goto L_0x015c
            r17 = r18
        L_0x015c:
            r17 = r10 | r17
            goto L_0x0161
        L_0x015f:
            r17 = r10
        L_0x0161:
            r18 = r5
            r5 = r14 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0170
            r5 = r17 | 48
            r55 = r16
            r16 = r5
            r5 = r55
            goto L_0x0185
        L_0x0170:
            r5 = r10 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0181
            r5 = r16
            boolean r16 = r0.mo5408I(r5)
            if (r16 == 0) goto L_0x017e
            r20 = r21
        L_0x017e:
            r16 = r17 | r20
            goto L_0x0185
        L_0x0181:
            r5 = r16
            r16 = r17
        L_0x0185:
            r17 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r21 = r5
            r5 = r1 & r17
            r17 = r6
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r6) goto L_0x01bf
            r5 = r16 & 91
            r6 = 18
            if (r5 != r6) goto L_0x01bf
            boolean r5 = r0.mo5442i()
            if (r5 != 0) goto L_0x01a0
            goto L_0x01bf
        L_0x01a0:
            r0.mo5396C()
            r12 = r9
            r38 = r10
            r40 = r11
            r2 = r13
            r36 = r14
            r9 = r17
            r29 = r21
            r4 = r22
            r3 = r23
            r5 = r27
            r6 = r28
            r10 = r7
            r11 = r8
            r8 = r18
            r7 = r30
            goto L_0x0411
        L_0x01bf:
            r0.mo5466u0()
            r5 = r11 & 1
            r6 = 0
            r20 = 0
            if (r5 == 0) goto L_0x01fe
            boolean r5 = r0.mo5425Y()
            if (r5 == 0) goto L_0x01d0
            goto L_0x01fe
        L_0x01d0:
            r0.mo5396C()
            r2 = r14 & 32
            if (r2 == 0) goto L_0x01db
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x01db:
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x01e3
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r2
        L_0x01e3:
            r12 = r1
            r33 = r7
            r34 = r8
            r35 = r9
            r51 = r11
            r50 = r14
            r32 = r18
            r15 = r22
            r11 = r27
            r31 = r30
            r30 = r28
            r28 = r10
            r10 = r17
            goto L_0x0379
        L_0x01fe:
            if (r19 == 0) goto L_0x0203
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0205
        L_0x0203:
            r5 = r22
        L_0x0205:
            if (r12 == 0) goto L_0x020a
            r12 = 1
            r27 = r12
        L_0x020a:
            if (r15 == 0) goto L_0x0225
            r12 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r12)
            java.lang.Object r12 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r15 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r12 != r15) goto L_0x021e
            androidx.compose.foundation.interaction.k r12 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x021e:
            r0.mo5418R(r6)
            r6 = r12
            androidx.compose.foundation.interaction.j r6 = (androidx.compose.foundation.interaction.C0640j) r6
            goto L_0x0227
        L_0x0225:
            r6 = r28
        L_0x0227:
            r12 = r14 & 32
            if (r12 == 0) goto L_0x024d
            androidx.compose.runtime.l1 r12 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r12 = r0.mo5410J(r12)
            androidx.compose.material.q1 r12 = (androidx.compose.material.C1225q1) r12
            p.a r12 = r12.f2547a
            r15 = 50
            r58 = r5
            p.e r5 = new p.e
            float r15 = (float) r15
            r5.<init>(r15)
            r12.getClass()
            p.f r5 = r12.mo20043b(r5, r5, r5, r5)
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r12
            r30 = r5
            goto L_0x024f
        L_0x024d:
            r58 = r5
        L_0x024f:
            if (r24 == 0) goto L_0x0254
            r5 = r20
            goto L_0x0256
        L_0x0254:
            r5 = r18
        L_0x0256:
            r12 = r14 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x033e
            float r12 = androidx.compose.material.C1252t.f2613a
            r12 = 830140629(0x317af0d5, float:3.6516685E-9)
            r0.mo5465u(r12)
            androidx.compose.runtime.l1 r12 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r15 = r0.mo5410J(r12)
            androidx.compose.material.v r15 = (androidx.compose.material.C1259v) r15
            r18 = r5
            r57 = r6
            long r5 = r15.mo5358e()
            r15 = 1039516303(0x3df5c28f, float:0.12)
            long r5 = androidx.compose.p015ui.graphics.C1545s.m3356b(r5, r15)
            java.lang.Object r15 = r0.mo5410J(r12)
            androidx.compose.material.v r15 = (androidx.compose.material.C1259v) r15
            r19 = r7
            r22 = r8
            long r7 = r15.mo5363j()
            long r5 = p628nj.C18263b.m30808C(r5, r7)
            r32 = r5
            java.lang.Object r7 = r0.mo5410J(r12)
            androidx.compose.material.v r7 = (androidx.compose.material.C1259v) r7
            long r7 = r7.mo5358e()
            r15 = 1063172178(0x3f5eb852, float:0.87)
            long r7 = androidx.compose.p015ui.graphics.C1545s.m3356b(r7, r15)
            r34 = r7
            r15 = 1057635697(0x3f0a3d71, float:0.54)
            r24 = r9
            r28 = r10
            long r9 = androidx.compose.p015ui.graphics.C1545s.m3356b(r7, r15)
            r36 = r9
            java.lang.Object r15 = r0.mo5410J(r12)
            androidx.compose.material.v r15 = (androidx.compose.material.C1259v) r15
            r50 = r14
            long r14 = r15.mo5358e()
            float r17 = kotlinx.coroutines.C19543e0.m33299P(r0)
            r31 = 1039516303(0x3df5c28f, float:0.12)
            r51 = r11
            float r11 = r17 * r31
            long r14 = androidx.compose.p015ui.graphics.C1545s.m3356b(r14, r11)
            java.lang.Object r11 = r0.mo5410J(r12)
            androidx.compose.material.v r11 = (androidx.compose.material.C1259v) r11
            r52 = r3
            r53 = r4
            long r3 = r11.mo5363j()
            long r38 = p628nj.C18263b.m30808C(r14, r3)
            float r3 = kotlinx.coroutines.C19543e0.m33299P(r0)
            r4 = 1063172178(0x3f5eb852, float:0.87)
            float r3 = r3 * r4
            long r40 = androidx.compose.p015ui.graphics.C1545s.m3356b(r7, r3)
            float r3 = kotlinx.coroutines.C19543e0.m33299P(r0)
            r4 = 1057635697(0x3f0a3d71, float:0.54)
            float r3 = r3 * r4
            long r42 = androidx.compose.p015ui.graphics.C1545s.m3356b(r9, r3)
            java.lang.Object r3 = r0.mo5410J(r12)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5358e()
            r11 = 1039516303(0x3df5c28f, float:0.12)
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r11)
            long r44 = p628nj.C18263b.m30808C(r3, r5)
            java.lang.Object r3 = r0.mo5410J(r12)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5358e()
            r5 = 1042536202(0x3e23d70a, float:0.16)
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r5)
            long r46 = p628nj.C18263b.m30808C(r3, r7)
            java.lang.Object r3 = r0.mo5410J(r12)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5358e()
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r5)
            long r48 = p628nj.C18263b.m30808C(r3, r9)
            androidx.compose.material.d0 r6 = new androidx.compose.material.d0
            r31 = r6
            r31.<init>(r32, r34, r36, r38, r40, r42, r44, r46, r48)
            r3 = 0
            r0.mo5418R(r3)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r1 = r1 & r3
            goto L_0x0354
        L_0x033e:
            r52 = r3
            r53 = r4
            r18 = r5
            r57 = r6
            r19 = r7
            r22 = r8
            r24 = r9
            r28 = r10
            r51 = r11
            r50 = r14
            r6 = r17
        L_0x0354:
            if (r2 == 0) goto L_0x0359
            r7 = r20
            goto L_0x035b
        L_0x0359:
            r7 = r19
        L_0x035b:
            if (r52 == 0) goto L_0x0360
            r8 = r20
            goto L_0x0362
        L_0x0360:
            r8 = r22
        L_0x0362:
            r15 = r58
            r12 = r1
            r10 = r6
            r33 = r7
            r34 = r8
            r32 = r18
            if (r53 == 0) goto L_0x0371
            r35 = r20
            goto L_0x0373
        L_0x0371:
            r35 = r24
        L_0x0373:
            r11 = r27
            r31 = r30
            r30 = r57
        L_0x0379:
            r0.mo5419S()
            int r27 = r12 << 3
            androidx.compose.runtime.j0 r2 = r10.mo5239c(r11, r13, r0)
            androidx.compose.material.ChipKt$FilterChip$2 r1 = androidx.compose.material.ChipKt$FilterChip$2.INSTANCE
            r3 = 0
            androidx.compose.ui.d r14 = androidx.compose.p015ui.semantics.SemanticsModifierKt.m4174a(r15, r3, r1)
            r36 = r50
            androidx.compose.runtime.j0 r1 = r10.mo5238b(r11, r13, r0)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r3 = r1.f3366a
            r17 = r3
            java.lang.Object r1 = r2.getValue()
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r3 = r1.f3366a
            r1 = 1065353216(0x3f800000, float:1.0)
            long r19 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r1)
            r22 = 0
            r9 = 722126431(0x2b0ac65f, float:4.9302744E-13)
            androidx.compose.material.ChipKt$FilterChip$3 r8 = new androidx.compose.material.ChipKt$FilterChip$3
            r1 = r8
            r3 = r33
            r4 = r13
            r5 = r34
            r6 = r35
            r7 = r21
            r37 = r15
            r15 = r8
            r8 = r16
            r57 = r14
            r14 = r9
            r9 = r10
            r39 = r10
            r38 = r28
            r10 = r11
            r41 = r11
            r40 = r51
            r11 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.runtime.internal.ComposableLambdaImpl r24 = p628nj.C18263b.m30805A(r0, r14, r15)
            r1 = r12 & 14
            r2 = r12 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r12 >> 3
            r2 = r2 & r25
            r1 = r1 | r2
            r2 = r27 & r26
            r1 = r1 | r2
            int r2 = r12 << 15
            r2 = r2 & r29
            r26 = r1 | r2
            r27 = 6
            r28 = 264(0x108, float:3.7E-43)
            r15 = 0
            r29 = r21
            r1 = r37
            r3 = r23
            r12 = r13
            r2 = r13
            r13 = r3
            r16 = r31
            r21 = r32
            r23 = r30
            r25 = r0
            r14 = r57
            androidx.compose.material.SurfaceKt.m2236c(r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = r1
            r6 = r30
            r7 = r31
            r8 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r9 = r39
            r5 = r41
        L_0x0411:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x0418
            goto L_0x042c
        L_0x0418:
            androidx.compose.material.ChipKt$FilterChip$4 r15 = new androidx.compose.material.ChipKt$FilterChip$4
            r1 = r15
            r13 = r29
            r14 = r40
            r54 = r15
            r15 = r38
            r16 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r54
            r0.f3081d = r1
        L_0x042c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt$FilterChip$4.invoke(androidx.compose.runtime.d, int):void");
    }
}
