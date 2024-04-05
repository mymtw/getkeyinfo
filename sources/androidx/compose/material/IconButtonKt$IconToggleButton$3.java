package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class IconButtonKt$IconToggleButton$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconToggleButton$3(boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, boolean z2, C0640j jVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.runtime.C1302d r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            boolean r8 = r0.$checked
            kq.l<java.lang.Boolean, kotlin.m> r9 = r0.$onCheckedChange
            androidx.compose.ui.d r1 = r0.$modifier
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.j r3 = r0.$interactionSource
            kq.p<androidx.compose.runtime.d, java.lang.Integer, kotlin.m> r10 = r0.$content
            int r4 = r0.$$changed
            r11 = 1
            r12 = r4 | 1
            int r13 = r0.$$default
            float r4 = androidx.compose.material.IconButtonKt.f2213a
            java.lang.String r4 = "onCheckedChange"
            kotlin.jvm.internal.C19383o.m32797g(r9, r4)
            java.lang.String r4 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r10, r4)
            r4 = -54657793(0xfffffffffcbdfcff, float:-7.891804E36)
            r5 = r26
            androidx.compose.runtime.ComposerImpl r7 = r5.mo5440h(r4)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x0031
            r4 = r12 | 6
            goto L_0x0041
        L_0x0031:
            r4 = r12 & 14
            if (r4 != 0) goto L_0x0040
            boolean r4 = r7.mo5427a(r8)
            if (r4 == 0) goto L_0x003d
            r4 = 4
            goto L_0x003e
        L_0x003d:
            r4 = 2
        L_0x003e:
            r4 = r4 | r12
            goto L_0x0041
        L_0x0040:
            r4 = r12
        L_0x0041:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0048
            r4 = r4 | 48
            goto L_0x0058
        L_0x0048:
            r5 = r12 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0058
            boolean r5 = r7.mo5408I(r9)
            if (r5 == 0) goto L_0x0055
            r5 = 32
            goto L_0x0057
        L_0x0055:
            r5 = 16
        L_0x0057:
            r4 = r4 | r5
        L_0x0058:
            r5 = r13 & 4
            if (r5 == 0) goto L_0x005f
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006f
        L_0x005f:
            r6 = r12 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006f
            boolean r6 = r7.mo5408I(r1)
            if (r6 == 0) goto L_0x006c
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006c:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006e:
            r4 = r4 | r6
        L_0x006f:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x0076
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0076:
            r14 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r14 != 0) goto L_0x0086
            boolean r14 = r7.mo5427a(r2)
            if (r14 == 0) goto L_0x0083
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0085
        L_0x0083:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0085:
            r4 = r4 | r14
        L_0x0086:
            r14 = r13 & 16
            if (r14 == 0) goto L_0x008d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009f
        L_0x008d:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r12
            if (r15 != 0) goto L_0x009f
            boolean r15 = r7.mo5408I(r3)
            if (r15 == 0) goto L_0x009c
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r4 = r4 | r15
        L_0x009f:
            r15 = r13 & 32
            if (r15 == 0) goto L_0x00a6
            r15 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b6
        L_0x00a6:
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r12
            if (r15 != 0) goto L_0x00b7
            boolean r15 = r7.mo5408I(r10)
            if (r15 == 0) goto L_0x00b4
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r15
        L_0x00b7:
            r21 = r4
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r21 & r4
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r15) goto L_0x00d3
            boolean r4 = r7.mo5442i()
            if (r4 != 0) goto L_0x00ca
            goto L_0x00d3
        L_0x00ca:
            r7.mo5396C()
            r4 = r1
            r5 = r2
            r6 = r3
            r2 = r7
            goto L_0x01e8
        L_0x00d3:
            if (r5 == 0) goto L_0x00d7
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x00d7:
            r22 = r1
            if (r6 == 0) goto L_0x00de
            r23 = r11
            goto L_0x00e0
        L_0x00de:
            r23 = r2
        L_0x00e0:
            r6 = 0
            if (r14 == 0) goto L_0x00fb
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo5465u(r1)
            java.lang.Object r1 = r7.mo5431c0()
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r1 != r2) goto L_0x00f5
            androidx.compose.foundation.interaction.k r1 = android.support.p013v4.media.C0072d.m198e(r7)
        L_0x00f5:
            r7.mo5418R(r6)
            r3 = r1
            androidx.compose.foundation.interaction.j r3 = (androidx.compose.foundation.interaction.C0640j) r3
        L_0x00fb:
            r24 = r3
            androidx.compose.ui.d r1 = androidx.compose.material.TouchTargetKt.m2285a(r22)
            r14 = 0
            float r15 = androidx.compose.material.IconButtonKt.f2213a
            r16 = 0
            r19 = 54
            r20 = 4
            r18 = r7
            androidx.compose.material.ripple.c r4 = androidx.compose.material.ripple.C1244j.m2369a(r14, r15, r16, r18, r19, r20)
            androidx.compose.ui.semantics.g r14 = new androidx.compose.ui.semantics.g
            r14.<init>(r11)
            r2 = r8
            r3 = r24
            r5 = r23
            r15 = r6
            r6 = r14
            r14 = r7
            r7 = r9
            androidx.compose.ui.d r1 = androidx.compose.foundation.selection.C0893a.m1946a(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.b r2 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r14.mo5465u(r3)
            androidx.compose.ui.layout.v r2 = androidx.compose.foundation.layout.BoxKt.m1457c(r2, r15, r14)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r14.mo5465u(r3)
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r3 = r14.mo5410J(r3)
            m0.b r3 = (p174m0.C7282b) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r4 = r14.mo5410J(r4)
            androidx.compose.ui.unit.LayoutDirection r4 = (androidx.compose.p015ui.unit.LayoutDirection) r4
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r5 = r14.mo5410J(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.p015ui.platform.C1843j1) r5
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r6.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r1)
            androidx.compose.runtime.c<?> r7 = r14.f2715a
            boolean r7 = r7 instanceof androidx.compose.runtime.C1299c
            if (r7 == 0) goto L_0x01fd
            r14.mo5392A()
            boolean r7 = r14.f2702K
            if (r7 == 0) goto L_0x0168
            r14.mo5450m(r6)
            goto L_0x016b
        L_0x0168:
            r14.mo5452n()
        L_0x016b:
            r14.f2738x = r15
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r6 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r14, r2, r6)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r14, r3, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r14, r4, r2)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r2 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r16 = p504ai.C13983i.m21490i(r14, r5, r2, r14)
            r18 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r19 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r2 = r14
            r14 = r15
            r3 = r15
            r15 = r1
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r14, r15, r16, r17, r18, r19)
            r1 = -430124743(0xffffffffe65cd139, float:-2.6069503E23)
            r2.mo5465u(r1)
            if (r23 == 0) goto L_0x01ac
            r1 = -1866758102(0xffffffff90bb882a, float:-7.396829E-29)
            r2.mo5465u(r1)
            androidx.compose.runtime.t r1 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Object r1 = r2.mo5410J(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            goto L_0x01b6
        L_0x01ac:
            r1 = -1866758076(0xffffffff90bb8844, float:-7.3968445E-29)
            r2.mo5465u(r1)
            float r1 = kotlinx.coroutines.C19543e0.m33299P(r2)
        L_0x01b6:
            r2.mo5418R(r3)
            androidx.compose.runtime.t0[] r4 = new androidx.compose.runtime.C1412t0[r11]
            androidx.compose.runtime.t r5 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.t0 r1 = r5.mo5908b(r1)
            r4[r3] = r1
            int r1 = r21 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 8
            androidx.compose.runtime.CompositionLocalKt.m2530a(r4, r10, r2, r1)
            r2.mo5418R(r3)
            r2.mo5418R(r3)
            r2.mo5418R(r3)
            r2.mo5418R(r11)
            r2.mo5418R(r3)
            r2.mo5418R(r3)
            r4 = r22
            r5 = r23
            r6 = r24
        L_0x01e8:
            androidx.compose.runtime.v0 r11 = r2.mo5421U()
            if (r11 != 0) goto L_0x01ef
            goto L_0x01fc
        L_0x01ef:
            androidx.compose.material.IconButtonKt$IconToggleButton$3 r14 = new androidx.compose.material.IconButtonKt$IconToggleButton$3
            r1 = r14
            r2 = r8
            r3 = r9
            r7 = r10
            r8 = r12
            r9 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f3081d = r14
        L_0x01fc:
            return
        L_0x01fd:
            p001a0.C0005b.m45j0()
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt$IconToggleButton$3.invoke(androidx.compose.runtime.d, int):void");
    }
}
