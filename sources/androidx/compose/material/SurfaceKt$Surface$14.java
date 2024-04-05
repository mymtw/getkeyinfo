package androidx.compose.material;

import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.C0871p;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class SurfaceKt$Surface$14 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0556g $border;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0871p $indication;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ C1900g $role;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SurfaceKt$Surface$14(C19846a<C19394m> aVar, C1436d dVar, C1530k0 k0Var, long j, long j2, C0556g gVar, float f, C0640j jVar, C0871p pVar, boolean z, String str, C1900g gVar2, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, int i2, int i3) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$shape = k0Var;
        this.$color = j;
        this.$contentColor = j2;
        this.$border = gVar;
        this.$elevation = f;
        this.$interactionSource = jVar;
        this.$indication = pVar;
        this.$enabled = z;
        this.$onClickLabel = str;
        this.$role = gVar2;
        this.$content = pVar2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r42, int r43) {
        /*
            r41 = this;
            r0 = r41
            kq.a<kotlin.m> r15 = r0.$onClick
            androidx.compose.ui.d r1 = r0.$modifier
            androidx.compose.ui.graphics.k0 r2 = r0.$shape
            long r3 = r0.$color
            long r5 = r0.$contentColor
            androidx.compose.foundation.g r7 = r0.$border
            float r8 = r0.$elevation
            androidx.compose.foundation.interaction.j r9 = r0.$interactionSource
            androidx.compose.foundation.p r10 = r0.$indication
            boolean r11 = r0.$enabled
            java.lang.String r12 = r0.$onClickLabel
            androidx.compose.ui.semantics.g r13 = r0.$role
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r14 = r0.$content
            r16 = r13
            int r13 = r0.$$changed
            r17 = 1
            r13 = r13 | 1
            r18 = r12
            int r12 = r0.$$changed1
            r19 = r12
            int r12 = r0.$$default
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            r0 = 1585925488(0x5e874d70, float:4.874786E18)
            r43 = r14
            r14 = r42
            androidx.compose.runtime.ComposerImpl r0 = r14.mo5440h(r0)
            r14 = r12 & 1
            r20 = 4
            if (r14 == 0) goto L_0x004a
            r14 = r13 | 6
            goto L_0x005b
        L_0x004a:
            r14 = r13 & 14
            if (r14 != 0) goto L_0x005a
            boolean r14 = r0.mo5408I(r15)
            if (r14 == 0) goto L_0x0057
            r14 = r20
            goto L_0x0058
        L_0x0057:
            r14 = 2
        L_0x0058:
            r14 = r14 | r13
            goto L_0x005b
        L_0x005a:
            r14 = r13
        L_0x005b:
            r21 = r12 & 2
            r22 = 32
            r23 = 16
            if (r21 == 0) goto L_0x0066
            r14 = r14 | 48
            goto L_0x0077
        L_0x0066:
            r24 = r13 & 112(0x70, float:1.57E-43)
            if (r24 != 0) goto L_0x0077
            boolean r24 = r0.mo5408I(r1)
            if (r24 == 0) goto L_0x0073
            r24 = r22
            goto L_0x0075
        L_0x0073:
            r24 = r23
        L_0x0075:
            r14 = r14 | r24
        L_0x0077:
            r24 = r12 & 4
            r25 = 128(0x80, float:1.794E-43)
            r26 = 256(0x100, float:3.59E-43)
            if (r24 == 0) goto L_0x0084
            r14 = r14 | 384(0x180, float:5.38E-43)
            r27 = r1
            goto L_0x0097
        L_0x0084:
            r27 = r1
            r1 = r13 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0097
            boolean r1 = r0.mo5408I(r2)
            if (r1 == 0) goto L_0x0093
            r1 = r26
            goto L_0x0095
        L_0x0093:
            r1 = r25
        L_0x0095:
            r1 = r1 | r14
            goto L_0x0098
        L_0x0097:
            r1 = r14
        L_0x0098:
            r14 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x00ac
            r14 = r12 & 8
            if (r14 != 0) goto L_0x00a9
            boolean r14 = r0.mo5434e(r3)
            if (r14 == 0) goto L_0x00a9
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x00ab
        L_0x00a9:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x00ab:
            r1 = r1 | r14
        L_0x00ac:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r13
            if (r14 != 0) goto L_0x00c2
            r14 = r12 & 16
            if (r14 != 0) goto L_0x00bf
            boolean r14 = r0.mo5434e(r5)
            if (r14 == 0) goto L_0x00bf
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00c1
        L_0x00bf:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x00c1:
            r1 = r1 | r14
        L_0x00c2:
            r14 = r12 & 32
            if (r14 == 0) goto L_0x00c9
            r28 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00da
        L_0x00c9:
            r28 = 458752(0x70000, float:6.42848E-40)
            r28 = r13 & r28
            if (r28 != 0) goto L_0x00dc
            boolean r28 = r0.mo5408I(r7)
            if (r28 == 0) goto L_0x00d8
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00da
        L_0x00d8:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00da:
            r1 = r1 | r28
        L_0x00dc:
            r28 = r12 & 64
            if (r28 == 0) goto L_0x00e3
            r29 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00f4
        L_0x00e3:
            r29 = 3670016(0x380000, float:5.142788E-39)
            r29 = r13 & r29
            if (r29 != 0) goto L_0x00f6
            boolean r29 = r0.mo5428b(r8)
            if (r29 == 0) goto L_0x00f2
            r29 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f4
        L_0x00f2:
            r29 = 524288(0x80000, float:7.34684E-40)
        L_0x00f4:
            r1 = r1 | r29
        L_0x00f6:
            r29 = r2
            r2 = r12 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00ff
            r30 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x0110
        L_0x00ff:
            r30 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r13 & r30
            if (r30 != 0) goto L_0x0112
            boolean r30 = r0.mo5408I(r9)
            if (r30 == 0) goto L_0x010e
            r30 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0110
        L_0x010e:
            r30 = 4194304(0x400000, float:5.877472E-39)
        L_0x0110:
            r1 = r1 | r30
        L_0x0112:
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r30 = r13 & r30
            if (r30 != 0) goto L_0x012b
            r31 = r3
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0127
            boolean r3 = r0.mo5408I(r10)
            if (r3 == 0) goto L_0x0127
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0129
        L_0x0127:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0129:
            r1 = r1 | r3
            goto L_0x012d
        L_0x012b:
            r31 = r3
        L_0x012d:
            r3 = r12 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0135
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r4
            goto L_0x0146
        L_0x0135:
            r4 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r13
            if (r4 != 0) goto L_0x0146
            boolean r4 = r0.mo5427a(r11)
            if (r4 == 0) goto L_0x0143
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0145
        L_0x0143:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0145:
            r1 = r1 | r4
        L_0x0146:
            r4 = r12 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0151
            r20 = r19 | 6
            r33 = r5
            r5 = r18
            goto L_0x0167
        L_0x0151:
            r30 = r19 & 14
            r33 = r5
            r5 = r18
            if (r30 != 0) goto L_0x0165
            boolean r6 = r0.mo5408I(r5)
            if (r6 == 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r20 = 2
        L_0x0162:
            r20 = r19 | r20
            goto L_0x0167
        L_0x0165:
            r20 = r19
        L_0x0167:
            r6 = r12 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x016e
            r20 = r20 | 48
            goto L_0x0188
        L_0x016e:
            r18 = r19 & 112(0x70, float:1.57E-43)
            if (r18 != 0) goto L_0x0188
            r18 = r5
            r5 = r16
            boolean r16 = r0.mo5408I(r5)
            if (r16 == 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r22 = r23
        L_0x017f:
            r16 = r20 | r22
            r39 = r16
            r16 = r5
            r5 = r39
            goto L_0x0190
        L_0x0188:
            r18 = r5
            r5 = r16
            r16 = r5
            r5 = r20
        L_0x0190:
            r20 = r7
            r7 = r12 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x019d
            r5 = r5 | 384(0x180, float:5.38E-43)
            r7 = r19
            r19 = r8
            goto L_0x01b2
        L_0x019d:
            r7 = r19
            r19 = r8
            r8 = r7 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x01b2
            r8 = r43
            boolean r22 = r0.mo5408I(r8)
            if (r22 == 0) goto L_0x01af
            r25 = r26
        L_0x01af:
            r5 = r5 | r25
            goto L_0x01b4
        L_0x01b2:
            r8 = r43
        L_0x01b4:
            r22 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r23 = r7
            r7 = r1 & r22
            r43 = r8
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r8) goto L_0x01f1
            r7 = r5 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x01f1
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x01cf
            goto L_0x01f1
        L_0x01cf:
            r0.mo5396C()
            r30 = r13
            r37 = r15
            r15 = r16
            r14 = r18
            r21 = r23
            r3 = r27
            r4 = r29
            r5 = r31
            r7 = r33
            r13 = r11
            r23 = r12
            r11 = r9
            r12 = r10
            r10 = r19
            r9 = r20
            r20 = r43
            goto L_0x0345
        L_0x01f1:
            r0.mo5466u0()
            r7 = r13 & 1
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r7 == 0) goto L_0x022e
            boolean r7 = r0.mo5425Y()
            if (r7 == 0) goto L_0x0202
            goto L_0x022e
        L_0x0202:
            r0.mo5396C()
            r2 = r12 & 8
            if (r2 == 0) goto L_0x020b
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x020b:
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0211
            r1 = r1 & r22
        L_0x0211:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0219
            r2 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r2
        L_0x0219:
            r7 = r1
            r22 = r9
            r25 = r10
            r26 = r11
            r28 = r16
            r24 = r27
            r10 = r33
            r27 = r18
            r18 = r20
            r20 = r5
            goto L_0x02c3
        L_0x022e:
            if (r21 == 0) goto L_0x0233
            androidx.compose.ui.d$a r7 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x0235
        L_0x0233:
            r7 = r27
        L_0x0235:
            if (r24 == 0) goto L_0x023b
            androidx.compose.ui.graphics.e0$a r21 = androidx.compose.p015ui.graphics.C1517e0.f3292a
            r29 = r21
        L_0x023b:
            r21 = r12 & 8
            if (r21 == 0) goto L_0x0254
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            long r24 = r8.mo5363j()
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r39 = r24
            r24 = r7
            r7 = r39
            goto L_0x0258
        L_0x0254:
            r24 = r7
            r7 = r31
        L_0x0258:
            r25 = r12 & 16
            if (r25 == 0) goto L_0x0264
            long r25 = androidx.compose.material.ColorsKt.m2174b(r7, r0)
            r1 = r1 & r22
            r33 = r25
        L_0x0264:
            if (r14 == 0) goto L_0x0268
            r14 = 0
            goto L_0x026a
        L_0x0268:
            r14 = r20
        L_0x026a:
            r20 = r5
            r25 = r7
            if (r28 == 0) goto L_0x0274
            r5 = 0
            float r7 = (float) r5
            r8 = r7
            goto L_0x0276
        L_0x0274:
            r8 = r19
        L_0x0276:
            if (r2 == 0) goto L_0x0291
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r2)
            java.lang.Object r2 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r5) goto L_0x028a
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x028a:
            r5 = 0
            r0.mo5418R(r5)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            r9 = r2
        L_0x0291:
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x02a2
            androidx.compose.runtime.l1 r2 = androidx.compose.foundation.IndicationKt.f1271a
            java.lang.Object r2 = r0.mo5410J(r2)
            androidx.compose.foundation.p r2 = (androidx.compose.foundation.C0871p) r2
            r5 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r1 = r1 & r5
            r10 = r2
        L_0x02a2:
            if (r3 == 0) goto L_0x02a6
            r11 = r17
        L_0x02a6:
            if (r4 == 0) goto L_0x02ab
            r2 = 0
            r18 = r2
        L_0x02ab:
            if (r6 == 0) goto L_0x02b0
            r2 = 0
            r16 = r2
        L_0x02b0:
            r7 = r1
            r19 = r8
            r22 = r9
            r28 = r16
            r27 = r18
            r31 = r25
            r25 = r10
            r26 = r11
            r18 = r14
            r10 = r33
        L_0x02c3:
            r0.mo5419S()
            androidx.compose.runtime.t r1 = androidx.compose.material.ElevationOverlayKt.f2207b
            java.lang.Object r2 = r0.mo5410J(r1)
            m0.d r2 = (p174m0.C7284d) r2
            float r2 = r2.f16155b
            float r2 = r2 + r19
            r6 = r2
            r3 = 2
            androidx.compose.runtime.t0[] r14 = new androidx.compose.runtime.C1412t0[r3]
            androidx.compose.runtime.t r3 = androidx.compose.material.ContentColorKt.f2199a
            androidx.compose.ui.graphics.s r4 = new androidx.compose.ui.graphics.s
            r4.<init>(r10)
            androidx.compose.runtime.t0 r3 = r3.mo5908b(r4)
            r4 = 0
            r14[r4] = r3
            m0.d r3 = new m0.d
            r3.<init>(r2)
            androidx.compose.runtime.t0 r1 = r1.mo5908b(r3)
            r14[r17] = r1
            androidx.compose.material.SurfaceKt$Surface$13 r9 = new androidx.compose.material.SurfaceKt$Surface$13
            r1 = r9
            r2 = r24
            r3 = r29
            r17 = r20
            r4 = r31
            r16 = r23
            r20 = r43
            r8 = r18
            r35 = r9
            r9 = r19
            r33 = r10
            r10 = r22
            r11 = r25
            r23 = r12
            r21 = r16
            r12 = r26
            r30 = r13
            r13 = r27
            r36 = r14
            r14 = r28
            r37 = r15
            r16 = r20
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 149594672(0x8eaa230, float:1.4121493E-33)
            r2 = r35
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r0, r1, r2)
            r2 = 56
            r3 = r36
            androidx.compose.runtime.CompositionLocalKt.m2530a(r3, r1, r0, r2)
            r9 = r18
            r10 = r19
            r11 = r22
            r3 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r4 = r29
            r5 = r31
            r7 = r33
        L_0x0345:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x034c
            goto L_0x0362
        L_0x034c:
            androidx.compose.material.SurfaceKt$Surface$14 r2 = new androidx.compose.material.SurfaceKt$Surface$14
            r1 = r2
            r38 = r2
            r2 = r37
            r16 = r20
            r17 = r30
            r18 = r21
            r19 = r23
            r1.<init>(r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r38
            r0.f3081d = r1
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt$Surface$14.invoke(androidx.compose.runtime.d, int):void");
    }
}
