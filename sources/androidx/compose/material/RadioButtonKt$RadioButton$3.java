package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

final class RadioButtonKt$RadioButton$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1204j1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$3(boolean z, C19846a<C19394m> aVar, C1436d dVar, boolean z2, C0640j jVar, C1204j1 j1Var, int i, int i2) {
        super(2);
        this.$selected = z;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$colors = j1Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.compose.material.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: androidx.compose.material.c0} */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0166, code lost:
        if (r4 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x0168;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            boolean r8 = r0.$selected
            kq.a<kotlin.m> r9 = r0.$onClick
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            androidx.compose.material.j1 r4 = r0.$colors
            int r5 = r0.$$changed
            r10 = r5 | 1
            int r11 = r0.$$default
            float r5 = androidx.compose.material.C1207k1.f2508a
            r5 = 1314435585(0x4e58b201, float:9.0888608E8)
            r6 = r22
            androidx.compose.runtime.ComposerImpl r7 = r6.mo5440h(r5)
            r5 = r11 & 1
            if (r5 == 0) goto L_0x0026
            r5 = r10 | 6
            goto L_0x0036
        L_0x0026:
            r5 = r10 & 14
            if (r5 != 0) goto L_0x0035
            boolean r5 = r7.mo5427a(r8)
            if (r5 == 0) goto L_0x0032
            r5 = 4
            goto L_0x0033
        L_0x0032:
            r5 = 2
        L_0x0033:
            r5 = r5 | r10
            goto L_0x0036
        L_0x0035:
            r5 = r10
        L_0x0036:
            r6 = r11 & 2
            if (r6 == 0) goto L_0x003d
            r5 = r5 | 48
            goto L_0x004d
        L_0x003d:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004d
            boolean r6 = r7.mo5408I(r9)
            if (r6 == 0) goto L_0x004a
            r6 = 32
            goto L_0x004c
        L_0x004a:
            r6 = 16
        L_0x004c:
            r5 = r5 | r6
        L_0x004d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0054
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0064
        L_0x0054:
            r12 = r10 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0064
            boolean r12 = r7.mo5408I(r1)
            if (r12 == 0) goto L_0x0061
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r12
        L_0x0064:
            r12 = r11 & 8
            if (r12 == 0) goto L_0x006b
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x006b:
            r13 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x007b
            boolean r13 = r7.mo5427a(r2)
            if (r13 == 0) goto L_0x0078
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r5 = r5 | r13
        L_0x007b:
            r13 = r11 & 16
            if (r13 == 0) goto L_0x0082
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0094
        L_0x0082:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x0094
            boolean r14 = r7.mo5408I(r3)
            if (r14 == 0) goto L_0x0091
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r5 = r5 | r14
        L_0x0094:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r10
            if (r14 != 0) goto L_0x00a9
            r14 = r11 & 32
            if (r14 != 0) goto L_0x00a6
            boolean r14 = r7.mo5408I(r4)
            if (r14 == 0) goto L_0x00a6
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r5 = r5 | r14
        L_0x00a9:
            r14 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r14
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r14) goto L_0x00c5
            boolean r5 = r7.mo5442i()
            if (r5 != 0) goto L_0x00b9
            goto L_0x00c5
        L_0x00b9:
            r7.mo5396C()
            r5 = r2
            r6 = r3
            r13 = r7
            r16 = r11
            r7 = r4
            r4 = r1
            goto L_0x023e
        L_0x00c5:
            r7.mo5466u0()
            r5 = r10 & 1
            r14 = 0
            if (r5 == 0) goto L_0x00de
            boolean r5 = r7.mo5425Y()
            if (r5 == 0) goto L_0x00d4
            goto L_0x00de
        L_0x00d4:
            r7.mo5396C()
            r0 = r1
            r6 = r2
        L_0x00d9:
            r19 = r3
            r5 = r4
            goto L_0x0188
        L_0x00de:
            if (r6 == 0) goto L_0x00e2
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00e2:
            if (r12 == 0) goto L_0x00e5
            r2 = 1
        L_0x00e5:
            if (r13 == 0) goto L_0x00fe
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo5465u(r3)
            java.lang.Object r3 = r7.mo5431c0()
            androidx.compose.runtime.d$a$a r5 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r5) goto L_0x00f9
            androidx.compose.foundation.interaction.k r3 = android.support.p013v4.media.C0072d.m198e(r7)
        L_0x00f9:
            r7.mo5418R(r14)
            androidx.compose.foundation.interaction.j r3 = (androidx.compose.foundation.interaction.C0640j) r3
        L_0x00fe:
            r5 = r11 & 32
            if (r5 == 0) goto L_0x017e
            r4 = 1370708026(0x51b3583a, float:9.6284918E10)
            r7.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r5 = r7.mo5410J(r4)
            androidx.compose.material.v r5 = (androidx.compose.material.C1259v) r5
            long r13 = r5.mo5361h()
            java.lang.Object r5 = r7.mo5410J(r4)
            androidx.compose.material.v r5 = (androidx.compose.material.C1259v) r5
            long r5 = r5.mo5358e()
            r12 = 1058642330(0x3f19999a, float:0.6)
            long r5 = androidx.compose.p015ui.graphics.C1545s.m3356b(r5, r12)
            java.lang.Object r4 = r7.mo5410J(r4)
            androidx.compose.material.v r4 = (androidx.compose.material.C1259v) r4
            r22 = r1
            long r0 = r4.mo5358e()
            float r4 = kotlinx.coroutines.C19543e0.m33299P(r7)
            long r0 = androidx.compose.p015ui.graphics.C1545s.m3356b(r0, r4)
            androidx.compose.ui.graphics.s r4 = new androidx.compose.ui.graphics.s
            r4.<init>(r13)
            androidx.compose.ui.graphics.s r12 = new androidx.compose.ui.graphics.s
            r12.<init>(r5)
            androidx.compose.ui.graphics.s r15 = new androidx.compose.ui.graphics.s
            r15.<init>(r0)
            r23 = r2
            r2 = 1618982084(0x607fb4c4, float:7.370227E19)
            r7.mo5465u(r2)
            boolean r2 = r7.mo5408I(r4)
            boolean r4 = r7.mo5408I(r12)
            r2 = r2 | r4
            boolean r4 = r7.mo5408I(r15)
            r2 = r2 | r4
            java.lang.Object r4 = r7.mo5431c0()
            if (r2 != 0) goto L_0x0168
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r4 != r2) goto L_0x0174
        L_0x0168:
            androidx.compose.material.c0 r4 = new androidx.compose.material.c0
            r12 = r4
            r15 = r5
            r17 = r0
            r12.<init>(r13, r15, r17)
            r7.mo5407H0(r4)
        L_0x0174:
            r0 = 0
            r7.mo5418R(r0)
            androidx.compose.material.c0 r4 = (androidx.compose.material.C1172c0) r4
            r7.mo5418R(r0)
            goto L_0x0182
        L_0x017e:
            r22 = r1
            r23 = r2
        L_0x0182:
            r0 = r22
            r6 = r23
            goto L_0x00d9
        L_0x0188:
            r7.mo5419S()
            if (r8 == 0) goto L_0x0194
            float r1 = androidx.compose.material.C1207k1.f2512e
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 0
            goto L_0x0196
        L_0x0194:
            r2 = 0
            float r1 = (float) r2
        L_0x0196:
            r4 = r2
            r2 = 100
            r3 = 0
            r12 = 6
            androidx.compose.animation.core.j0 r2 = androidx.compose.foundation.layout.C0761x.m1706Z0(r2, r4, r3, r12)
            r3 = 48
            androidx.compose.animation.core.f r3 = androidx.compose.animation.core.C0411a.m1105a(r1, r2, r7, r3)
            r1 = 3
            androidx.compose.runtime.k1 r2 = r5.mo5233a(r6, r8, r7)
            r12 = 1941632354(0x73baf562, float:2.962476E31)
            r7.mo5465u(r12)
            if (r9 == 0) goto L_0x01df
            androidx.compose.ui.d$a r20 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r12 = 0
            float r13 = androidx.compose.material.C1207k1.f2508a
            r14 = 0
            r17 = 54
            r18 = 4
            r16 = r7
            androidx.compose.material.ripple.c r12 = androidx.compose.material.ripple.C1244j.m2369a(r12, r13, r14, r16, r17, r18)
            androidx.compose.ui.semantics.g r13 = new androidx.compose.ui.semantics.g
            r13.<init>(r1)
            r1 = r20
            r14 = r2
            r2 = r8
            r15 = r3
            r3 = r19
            r16 = r11
            r11 = r4
            r4 = r12
            r12 = r5
            r5 = r6
            r17 = r6
            r6 = r13
            r13 = r7
            r7 = r9
            androidx.compose.ui.d r1 = androidx.compose.foundation.selection.SelectableKt.m1944a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01ea
        L_0x01df:
            r14 = r2
            r15 = r3
            r12 = r5
            r17 = r6
            r13 = r7
            r16 = r11
            r11 = r4
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x01ea:
            r13.mo5418R(r11)
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r9 == 0) goto L_0x01f5
            androidx.compose.ui.d r2 = androidx.compose.material.TouchTargetKt.m2285a(r2)
        L_0x01f5:
            androidx.compose.ui.d r2 = r0.mo6148i0(r2)
            androidx.compose.ui.d r1 = r2.mo6148i0(r1)
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1497q(r1, r2)
            float r2 = androidx.compose.material.C1207k1.f2509b
            androidx.compose.ui.d r1 = com.google.android.play.core.assetpacks.C15588c1.m25279F0(r1, r2)
            float r2 = androidx.compose.material.C1207k1.f2510c
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1490j(r1, r2)
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r13.mo5465u(r2)
            boolean r2 = r13.mo5408I(r14)
            boolean r3 = r13.mo5408I(r15)
            r2 = r2 | r3
            java.lang.Object r3 = r13.mo5431c0()
            if (r2 != 0) goto L_0x0228
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x0230
        L_0x0228:
            androidx.compose.material.RadioButtonKt$RadioButton$2$1 r3 = new androidx.compose.material.RadioButtonKt$RadioButton$2$1
            r3.<init>(r14, r15)
            r13.mo5407H0(r3)
        L_0x0230:
            r13.mo5418R(r11)
            kq.l r3 = (p753kq.C19857l) r3
            androidx.compose.foundation.CanvasKt.m1294a(r1, r3, r13, r11)
            r4 = r0
            r7 = r12
            r5 = r17
            r6 = r19
        L_0x023e:
            androidx.compose.runtime.v0 r0 = r13.mo5421U()
            if (r0 != 0) goto L_0x0245
            goto L_0x0252
        L_0x0245:
            androidx.compose.material.RadioButtonKt$RadioButton$3 r11 = new androidx.compose.material.RadioButtonKt$RadioButton$3
            r1 = r11
            r2 = r8
            r3 = r9
            r8 = r10
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f3081d = r11
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.RadioButtonKt$RadioButton$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
