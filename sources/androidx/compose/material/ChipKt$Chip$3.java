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

final class ChipKt$Chip$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ C1249s $colors;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $leadingIcon;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(C19846a<C19394m> aVar, C1436d dVar, boolean z, C0640j jVar, C1530k0 k0Var, C0556g gVar, C1249s sVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$interactionSource = jVar;
        this.$shape = k0Var;
        this.$border = gVar;
        this.$colors = sVar;
        this.$leadingIcon = pVar;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.compose.material.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: androidx.compose.material.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: androidx.compose.material.z} */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r38, int r39) {
        /*
            r37 = this;
            r0 = r37
            kq.a<kotlin.m> r15 = r0.$onClick
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            androidx.compose.ui.graphics.k0 r4 = r0.$shape
            androidx.compose.foundation.g r5 = r0.$border
            androidx.compose.material.s r6 = r0.$colors
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r7 = r0.$leadingIcon
            kq.q<androidx.compose.foundation.layout.z, androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$content
            int r8 = r0.$$changed
            r13 = r8 | 1
            int r12 = r0.$$default
            float r8 = androidx.compose.material.C1256u.f2622a
            java.lang.String r8 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r8)
            java.lang.String r8 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r8)
            r8 = -368396408(0xffffffffea0ab788, float:-4.1924616E25)
            r9 = r38
            androidx.compose.runtime.ComposerImpl r11 = r9.mo5440h(r8)
            r8 = r12 & 1
            if (r8 == 0) goto L_0x0036
            r8 = r13 | 6
            goto L_0x0046
        L_0x0036:
            r8 = r13 & 14
            if (r8 != 0) goto L_0x0045
            boolean r8 = r11.mo5408I(r15)
            if (r8 == 0) goto L_0x0042
            r8 = 4
            goto L_0x0043
        L_0x0042:
            r8 = 2
        L_0x0043:
            r8 = r8 | r13
            goto L_0x0046
        L_0x0045:
            r8 = r13
        L_0x0046:
            r9 = r12 & 2
            if (r9 == 0) goto L_0x004d
            r8 = r8 | 48
            goto L_0x005d
        L_0x004d:
            r10 = r13 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x005d
            boolean r10 = r11.mo5408I(r1)
            if (r10 == 0) goto L_0x005a
            r10 = 32
            goto L_0x005c
        L_0x005a:
            r10 = 16
        L_0x005c:
            r8 = r8 | r10
        L_0x005d:
            r10 = r12 & 4
            if (r10 == 0) goto L_0x0064
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x0074
        L_0x0064:
            r0 = r13 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0074
            boolean r0 = r11.mo5427a(r2)
            if (r0 == 0) goto L_0x0071
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0073
        L_0x0071:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0073:
            r8 = r8 | r0
        L_0x0074:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x007d
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            r39 = r1
            goto L_0x0090
        L_0x007d:
            r39 = r1
            r1 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r1 != 0) goto L_0x0090
            boolean r1 = r11.mo5408I(r3)
            if (r1 == 0) goto L_0x008c
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x008e
        L_0x008c:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x008e:
            r1 = r1 | r8
            goto L_0x0091
        L_0x0090:
            r1 = r8
        L_0x0091:
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x00a7
            r8 = r12 & 16
            if (r8 != 0) goto L_0x00a4
            boolean r8 = r11.mo5408I(r4)
            if (r8 == 0) goto L_0x00a4
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a6
        L_0x00a4:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x00a6:
            r1 = r1 | r8
        L_0x00a7:
            r8 = r12 & 32
            if (r8 == 0) goto L_0x00ae
            r16 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00bf
        L_0x00ae:
            r16 = 458752(0x70000, float:6.42848E-40)
            r16 = r13 & r16
            if (r16 != 0) goto L_0x00c1
            boolean r16 = r11.mo5408I(r5)
            if (r16 == 0) goto L_0x00bd
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bf
        L_0x00bd:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00bf:
            r1 = r1 | r16
        L_0x00c1:
            r16 = 3670016(0x380000, float:5.142788E-39)
            r17 = r13 & r16
            if (r17 != 0) goto L_0x00d8
            r17 = r12 & 64
            if (r17 != 0) goto L_0x00d4
            boolean r17 = r11.mo5408I(r6)
            if (r17 == 0) goto L_0x00d4
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r17
        L_0x00d8:
            r17 = r2
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00e1
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00f2
        L_0x00e1:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00f4
            boolean r18 = r11.mo5408I(r7)
            if (r18 == 0) goto L_0x00f0
            r18 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f2
        L_0x00f0:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f2:
            r1 = r1 | r18
        L_0x00f4:
            r18 = r3
            r3 = r12 & 256(0x100, float:3.59E-43)
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            if (r3 == 0) goto L_0x00ff
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            goto L_0x010e
        L_0x00ff:
            r3 = r13 & r19
            if (r3 != 0) goto L_0x010f
            boolean r3 = r11.mo5408I(r14)
            if (r3 == 0) goto L_0x010c
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010e
        L_0x010c:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010e:
            r1 = r1 | r3
        L_0x010f:
            r3 = 191739611(0xb6db6db, float:4.5782105E-32)
            r3 = r3 & r1
            r20 = r4
            r4 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r4) goto L_0x013a
            boolean r3 = r11.mo5442i()
            if (r3 != 0) goto L_0x0121
            goto L_0x013a
        L_0x0121:
            r11.mo5396C()
            r3 = r39
            r8 = r6
            r9 = r7
            r0 = r11
            r26 = r12
            r27 = r14
            r23 = r15
            r4 = r17
            r6 = r20
            r7 = r5
            r20 = r13
            r5 = r18
            goto L_0x0308
        L_0x013a:
            r11.mo5466u0()
            r3 = r13 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            r21 = 0
            r22 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r3 == 0) goto L_0x016d
            boolean r3 = r11.mo5425Y()
            if (r3 == 0) goto L_0x0150
            goto L_0x016d
        L_0x0150:
            r11.mo5396C()
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0158
            r1 = r1 & r4
        L_0x0158:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x015e
            r1 = r1 & r22
        L_0x015e:
            r0 = r1
            r36 = r12
            r2 = r17
            r3 = r18
            r4 = r20
            r1 = r39
            r20 = r13
            goto L_0x0278
        L_0x016d:
            if (r9 == 0) goto L_0x0172
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0174
        L_0x0172:
            r3 = r39
        L_0x0174:
            if (r10 == 0) goto L_0x0179
            r4 = 1
            r17 = r4
        L_0x0179:
            r4 = 0
            if (r0 == 0) goto L_0x0194
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r0)
            java.lang.Object r0 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r9 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r9) goto L_0x018e
            androidx.compose.foundation.interaction.k r0 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x018e:
            r11.mo5418R(r4)
            androidx.compose.foundation.interaction.j r0 = (androidx.compose.foundation.interaction.C0640j) r0
            goto L_0x0196
        L_0x0194:
            r0 = r18
        L_0x0196:
            r4 = r12 & 16
            if (r4 == 0) goto L_0x01b8
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r4 = r11.mo5410J(r4)
            androidx.compose.material.q1 r4 = (androidx.compose.material.C1225q1) r4
            p.a r4 = r4.f2547a
            r9 = 50
            p.e r10 = new p.e
            float r9 = (float) r9
            r10.<init>(r9)
            r4.getClass()
            p.f r4 = r4.mo20043b(r10, r10, r10, r10)
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            r1 = r1 & r9
            goto L_0x01ba
        L_0x01b8:
            r4 = r20
        L_0x01ba:
            if (r8 == 0) goto L_0x01be
            r5 = r21
        L_0x01be:
            r8 = r12 & 64
            if (r8 == 0) goto L_0x0258
            float r6 = androidx.compose.material.C1252t.f2613a
            r6 = 1838505436(0x6d955ddc, float:5.778342E27)
            r11.mo5465u(r6)
            androidx.compose.runtime.l1 r6 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r11.mo5410J(r6)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            long r8 = r8.mo5358e()
            r10 = 1039516303(0x3df5c28f, float:0.12)
            long r8 = androidx.compose.p015ui.graphics.C1545s.m3356b(r8, r10)
            java.lang.Object r18 = r11.mo5410J(r6)
            androidx.compose.material.v r18 = (androidx.compose.material.C1259v) r18
            r38 = r3
            r39 = r4
            long r3 = r18.mo5363j()
            long r24 = p628nj.C18263b.m30808C(r8, r3)
            java.lang.Object r3 = r11.mo5410J(r6)
            androidx.compose.material.v r3 = (androidx.compose.material.C1259v) r3
            long r3 = r3.mo5358e()
            r8 = 1063172178(0x3f5eb852, float:0.87)
            long r3 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r8)
            r8 = 1057635697(0x3f0a3d71, float:0.54)
            long r8 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r8)
            java.lang.Object r18 = r11.mo5410J(r6)
            androidx.compose.material.v r18 = (androidx.compose.material.C1259v) r18
            r36 = r12
            r20 = r13
            long r12 = r18.mo5358e()
            float r18 = kotlinx.coroutines.C19543e0.m33299P(r11)
            float r10 = r10 * r18
            long r12 = androidx.compose.p015ui.graphics.C1545s.m3356b(r12, r10)
            java.lang.Object r6 = r11.mo5410J(r6)
            androidx.compose.material.v r6 = (androidx.compose.material.C1259v) r6
            r10 = r5
            long r5 = r6.mo5363j()
            long r30 = p628nj.C18263b.m30808C(r12, r5)
            float r5 = kotlinx.coroutines.C19543e0.m33299P(r11)
            r6 = 1063172178(0x3f5eb852, float:0.87)
            float r5 = r5 * r6
            long r32 = androidx.compose.p015ui.graphics.C1545s.m3356b(r3, r5)
            float r5 = kotlinx.coroutines.C19543e0.m33299P(r11)
            r6 = 1057635697(0x3f0a3d71, float:0.54)
            float r5 = r5 * r6
            long r34 = androidx.compose.p015ui.graphics.C1545s.m3356b(r8, r5)
            androidx.compose.material.z r6 = new androidx.compose.material.z
            r23 = r6
            r26 = r3
            r28 = r8
            r23.<init>(r24, r26, r28, r30, r32, r34)
            r3 = 0
            r11.mo5418R(r3)
            r1 = r1 & r22
            goto L_0x0261
        L_0x0258:
            r38 = r3
            r39 = r4
            r10 = r5
            r36 = r12
            r20 = r13
        L_0x0261:
            if (r2 == 0) goto L_0x026f
            r18 = r39
            r7 = r6
            r5 = r17
            r22 = r21
            r17 = r38
            r21 = r10
            goto L_0x0284
        L_0x026f:
            r4 = r39
            r3 = r0
            r0 = r1
            r5 = r10
            r2 = r17
            r1 = r38
        L_0x0278:
            r17 = r1
            r18 = r4
            r21 = r5
            r22 = r7
            r1 = r0
            r5 = r2
            r0 = r3
            r7 = r6
        L_0x0284:
            r11.mo5419S()
            androidx.compose.runtime.j0 r9 = r7.mo5340a(r5, r11)
            androidx.compose.runtime.j0 r2 = r7.mo5341b(r5, r11)
            java.lang.Object r2 = r2.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r3 = r2.f3366a
            java.lang.Object r2 = r9.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r12 = r2.f3366a
            r2 = 1065353216(0x3f800000, float:1.0)
            long r23 = androidx.compose.p015ui.graphics.C1545s.m3356b(r12, r2)
            r25 = 0
            r2 = 139076687(0x84a244f, float:6.0829844E-34)
            androidx.compose.material.ChipKt$Chip$2 r6 = new androidx.compose.material.ChipKt$Chip$2
            r8 = r6
            r10 = r22
            r13 = r11
            r11 = r7
            r26 = r36
            r12 = r5
            r38 = r0
            r0 = r13
            r13 = r1
            r27 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14)
            androidx.compose.runtime.internal.ComposableLambdaImpl r12 = p628nj.C18263b.m30805A(r0, r2, r6)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r1 & 14
            r2 = r2 | r6
            r6 = r1 & 112(0x70, float:1.57E-43)
            r2 = r2 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r6
            int r6 = r1 >> 3
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r6
            int r6 = r1 << 3
            r6 = r6 & r16
            r2 = r2 | r6
            int r1 = r1 << 15
            r1 = r1 & r19
            r14 = r2 | r1
            r16 = 128(0x80, float:1.794E-43)
            r1 = r15
            r2 = r17
            r8 = r3
            r3 = r5
            r4 = r18
            r19 = r5
            r5 = r8
            r28 = r7
            r7 = r23
            r9 = r21
            r10 = r25
            r11 = r38
            r13 = r0
            r23 = r15
            r15 = r16
            androidx.compose.material.SurfaceKt.m2235b(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15)
            r5 = r38
            r3 = r17
            r6 = r18
            r4 = r19
            r7 = r21
            r9 = r22
            r8 = r28
        L_0x0308:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x030f
            goto L_0x031f
        L_0x030f:
            androidx.compose.material.ChipKt$Chip$3 r13 = new androidx.compose.material.ChipKt$Chip$3
            r1 = r13
            r2 = r23
            r10 = r27
            r11 = r20
            r12 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.f3081d = r13
        L_0x031f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt$Chip$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
