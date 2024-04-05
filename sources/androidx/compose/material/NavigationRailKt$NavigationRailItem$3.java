package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class NavigationRailKt$NavigationRailItem$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $alwaysShowLabel;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $icon;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $label;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ long $selectedContentColor;
    public final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRailItem$3(boolean z, C19846a<C19394m> aVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, boolean z2, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, boolean z3, C0640j jVar, long j, long j2, int i, int i2) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$icon = pVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$label = pVar2;
        this.$alwaysShowLabel = z3;
        this.$interactionSource = jVar;
        this.$selectedContentColor = j;
        this.$unselectedContentColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r32, int r33) {
        /*
            r31 = this;
            r0 = r31
            boolean r9 = r0.$selected
            kq.a<kotlin.m> r10 = r0.$onClick
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r11 = r0.$icon
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r3 = r0.$label
            boolean r4 = r0.$alwaysShowLabel
            androidx.compose.foundation.interaction.j r5 = r0.$interactionSource
            long r6 = r0.$selectedContentColor
            long r12 = r0.$unselectedContentColor
            int r8 = r0.$$changed
            r14 = r8 | 1
            int r15 = r0.$$default
            androidx.compose.animation.core.j0<java.lang.Float> r8 = androidx.compose.material.NavigationRailKt.f2227a
            java.lang.String r8 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r10, r8)
            java.lang.String r8 = "icon"
            kotlin.jvm.internal.C19383o.m32797g(r11, r8)
            r8 = -1813548445(0xffffffff93e77263, float:-5.8425392E-27)
            r0 = r32
            androidx.compose.runtime.ComposerImpl r0 = r0.mo5440h(r8)
            r8 = r15 & 1
            if (r8 == 0) goto L_0x0038
            r8 = r14 | 6
            goto L_0x0048
        L_0x0038:
            r8 = r14 & 14
            if (r8 != 0) goto L_0x0047
            boolean r8 = r0.mo5427a(r9)
            if (r8 == 0) goto L_0x0044
            r8 = 4
            goto L_0x0045
        L_0x0044:
            r8 = 2
        L_0x0045:
            r8 = r8 | r14
            goto L_0x0048
        L_0x0047:
            r8 = r14
        L_0x0048:
            r16 = r15 & 2
            if (r16 == 0) goto L_0x004f
            r8 = r8 | 48
            goto L_0x0060
        L_0x004f:
            r16 = r14 & 112(0x70, float:1.57E-43)
            if (r16 != 0) goto L_0x0060
            boolean r16 = r0.mo5408I(r10)
            if (r16 == 0) goto L_0x005c
            r16 = 32
            goto L_0x005e
        L_0x005c:
            r16 = 16
        L_0x005e:
            r8 = r8 | r16
        L_0x0060:
            r16 = r15 & 4
            if (r16 == 0) goto L_0x0069
            r8 = r8 | 384(0x180, float:5.38E-43)
            r33 = r10
            goto L_0x007b
        L_0x0069:
            r33 = r10
            r10 = r14 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x007b
            boolean r10 = r0.mo5408I(r11)
            if (r10 == 0) goto L_0x0078
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x007a
        L_0x0078:
            r10 = 128(0x80, float:1.794E-43)
        L_0x007a:
            r8 = r8 | r10
        L_0x007b:
            r10 = r15 & 8
            if (r10 == 0) goto L_0x0084
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            r23 = r11
            goto L_0x0096
        L_0x0084:
            r23 = r11
            r11 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0096
            boolean r11 = r0.mo5408I(r1)
            if (r11 == 0) goto L_0x0093
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0095
        L_0x0093:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0095:
            r8 = r8 | r11
        L_0x0096:
            r11 = r15 & 16
            if (r11 == 0) goto L_0x009d
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b1
        L_0x009d:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00b1
            boolean r16 = r0.mo5427a(r2)
            if (r16 == 0) goto L_0x00ad
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00af
        L_0x00ad:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00af:
            r8 = r8 | r16
        L_0x00b1:
            r16 = r15 & 32
            if (r16 == 0) goto L_0x00b8
            r17 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00c9
        L_0x00b8:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r14 & r17
            if (r17 != 0) goto L_0x00cb
            boolean r17 = r0.mo5408I(r3)
            if (r17 == 0) goto L_0x00c7
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c9
        L_0x00c7:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00c9:
            r8 = r8 | r17
        L_0x00cb:
            r17 = r15 & 64
            if (r17 == 0) goto L_0x00d2
            r18 = 1572864(0x180000, float:2.204052E-39)
            goto L_0x00e3
        L_0x00d2:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r14 & r18
            if (r18 != 0) goto L_0x00e5
            boolean r18 = r0.mo5427a(r4)
            if (r18 == 0) goto L_0x00e1
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r8 = r8 | r18
        L_0x00e5:
            r18 = r1
            r1 = r15 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x00ee
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            goto L_0x00ff
        L_0x00ee:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x0101
            boolean r19 = r0.mo5408I(r5)
            if (r19 == 0) goto L_0x00fd
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ff
        L_0x00fd:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ff:
            r8 = r8 | r19
        L_0x0101:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r14 & r19
            if (r19 != 0) goto L_0x011a
            r19 = r2
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0116
            boolean r2 = r0.mo5434e(r6)
            if (r2 == 0) goto L_0x0116
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r8 = r8 | r2
            goto L_0x011c
        L_0x011a:
            r19 = r2
        L_0x011c:
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r14
            if (r2 != 0) goto L_0x0131
            r2 = r15 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x012e
            boolean r2 = r0.mo5434e(r12)
            if (r2 == 0) goto L_0x012e
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r8 = r8 | r2
        L_0x0131:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r2 = r2 & r8
            r20 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r3) goto L_0x0156
            boolean r2 = r0.mo5442i()
            if (r2 != 0) goto L_0x0143
            goto L_0x0156
        L_0x0143:
            r0.mo5396C()
            r8 = r4
            r10 = r5
            r25 = r6
            r27 = r12
            r5 = r18
            r6 = r19
            r7 = r20
            r12 = r23
            goto L_0x02f4
        L_0x0156:
            r0.mo5466u0()
            r2 = r14 & 1
            r24 = 0
            r3 = 0
            if (r2 == 0) goto L_0x0182
            boolean r2 = r0.mo5425Y()
            if (r2 == 0) goto L_0x0167
            goto L_0x0182
        L_0x0167:
            r0.mo5396C()
            r1 = r15 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0172
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r1
        L_0x0172:
            r1 = r15 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x017a
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r8 = r8 & r1
        L_0x017a:
            r1 = r18
            r2 = r19
        L_0x017e:
            r3 = r20
            goto L_0x01ec
        L_0x0182:
            if (r10 == 0) goto L_0x0188
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r18 = r2
        L_0x0188:
            if (r11 == 0) goto L_0x018c
            r2 = 1
            goto L_0x018e
        L_0x018c:
            r2 = r19
        L_0x018e:
            if (r16 == 0) goto L_0x0192
            r20 = r24
        L_0x0192:
            if (r17 == 0) goto L_0x0195
            r4 = 1
        L_0x0195:
            if (r1 == 0) goto L_0x01af
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r1)
            java.lang.Object r1 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r5) goto L_0x01a9
            androidx.compose.foundation.interaction.k r1 = android.support.p013v4.media.C0072d.m198e(r0)
        L_0x01a9:
            r0.mo5418R(r3)
            r5 = r1
            androidx.compose.foundation.interaction.j r5 = (androidx.compose.foundation.interaction.C0640j) r5
        L_0x01af:
            r1 = r15 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x01c3
            androidx.compose.runtime.l1 r1 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.material.v r1 = (androidx.compose.material.C1259v) r1
            long r6 = r1.mo5359f()
            r1 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r8 = r8 & r1
        L_0x01c3:
            r1 = r15 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x01e9
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentColorKt.f2199a
            java.lang.Object r1 = r0.mo5410J(r1)
            androidx.compose.ui.graphics.s r1 = (androidx.compose.p015ui.graphics.C1545s) r1
            long r10 = r1.f3366a
            float r1 = kotlinx.coroutines.C19543e0.m33302T(r0)
            long r12 = androidx.compose.p015ui.graphics.C1545s.m3356b(r10, r1)
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r1 = r1 & r8
            r8 = r1
            r10 = r2
            r11 = r4
            r25 = r6
            r27 = r12
            r13 = r18
            r7 = r20
            goto L_0x01f4
        L_0x01e9:
            r1 = r18
            goto L_0x017e
        L_0x01ec:
            r10 = r2
            r11 = r4
            r25 = r6
            r27 = r12
            r13 = r1
            r7 = r3
        L_0x01f4:
            r12 = r5
            r0.mo5419S()
            if (r7 == 0) goto L_0x0208
            r1 = -180398615(0xfffffffff53f55e9, float:-2.4254667E32)
            androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1 r2 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$styledLabel$1$1
            r2.<init>(r7, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = p628nj.C18263b.m30805A(r0, r1, r2)
            r6 = r1
            goto L_0x020a
        L_0x0208:
            r6 = r24
        L_0x020a:
            if (r7 != 0) goto L_0x020f
            float r1 = androidx.compose.material.NavigationRailKt.f2229c
            goto L_0x0211
        L_0x020f:
            float r1 = androidx.compose.material.NavigationRailKt.f2228b
        L_0x0211:
            r5 = r1
            r16 = 0
            r17 = 0
            int r1 = r8 >> 18
            r1 = r1 & 896(0x380, float:1.256E-42)
            r21 = r1 | 6
            r22 = 2
            r18 = r25
            r20 = r0
            androidx.compose.material.ripple.c r4 = androidx.compose.material.ripple.C1244j.m2369a(r16, r17, r18, r20, r21, r22)
            androidx.compose.ui.semantics.g r3 = new androidx.compose.ui.semantics.g
            r1 = 4
            r3.<init>(r1)
            r1 = r13
            r2 = r9
            r16 = r3
            r3 = r12
            r32 = r12
            r12 = r5
            r5 = r10
            r22 = r10
            r10 = r6
            r6 = r16
            r29 = r7
            r7 = r33
            androidx.compose.ui.d r1 = androidx.compose.foundation.selection.SelectableKt.m1944a(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1492l(r1, r12)
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r0.mo5465u(r3)
            r3 = 0
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r3, r0)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r0.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r0.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r0.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r5 = r0.mo5410J(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r6.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r17 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r1 = r0.f2715a
            boolean r1 = r1 instanceof androidx.compose.runtime.C1299c
            if (r1 == 0) goto L_0x0311
            r0.mo5392A()
            boolean r1 = r0.f2702K
            if (r1 == 0) goto L_0x028d
            r0.mo5450m(r6)
            goto L_0x0290
        L_0x028d:
            r0.mo5452n()
        L_0x0290:
            r1 = 0
            r0.f2738x = r1
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r0, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r0, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r0, r4, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r18 = p504ai.C13983i.m21490i(r0, r5, r1, r0)
            r16 = 0
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r19 = r0
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r1 = -172871267(0xfffffffff5b2319d, float:-4.5177496E32)
            r0.mo5465u(r1)
            r1 = 670576792(0x27f83098, float:6.8886513E-15)
            androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1 r2 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$2$1
            r12 = r23
            r2.<init>(r11, r12, r10, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r6 = p628nj.C18263b.m30805A(r0, r1, r2)
            int r1 = r8 >> 24
            r2 = r1 & 14
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r8 << 6
            r2 = r2 & 896(0x380, float:1.256E-42)
            r8 = r1 | r2
            r1 = r25
            r3 = r27
            r5 = r9
            r7 = r0
            androidx.compose.material.NavigationRailKt.m2195a(r1, r3, r5, r6, r7, r8)
            r1 = 0
            r2 = 1
            android.support.p013v4.media.session.C0087d.m238h(r0, r1, r1, r1, r2)
            r0.mo5418R(r1)
            r0.mo5418R(r1)
            r10 = r32
            r8 = r11
            r5 = r13
            r6 = r22
            r7 = r29
        L_0x02f4:
            androidx.compose.runtime.v0 r0 = r0.mo5421U()
            if (r0 != 0) goto L_0x02fb
            goto L_0x0310
        L_0x02fb:
            androidx.compose.material.NavigationRailKt$NavigationRailItem$3 r13 = new androidx.compose.material.NavigationRailKt$NavigationRailItem$3
            r1 = r13
            r2 = r9
            r3 = r33
            r4 = r12
            r9 = r10
            r10 = r25
            r30 = r13
            r12 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            r1 = r30
            r0.f3081d = r1
        L_0x0310:
            return
        L_0x0311:
            p001a0.C0005b.m45j0()
            throw r24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.NavigationRailKt$NavigationRailItem$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
