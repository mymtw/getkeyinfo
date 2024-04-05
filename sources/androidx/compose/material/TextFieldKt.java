package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import p173m.C7279a;
import p174m0.C7280a;

public final class TextFieldKt {

    /* renamed from: a */
    public static final float f2334a = ((float) 20);

    /* renamed from: b */
    public static final float f2335b = ((float) 10);

    /* renamed from: c */
    public static final float f2336c = ((float) 4);

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04c9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2272a(androidx.compose.p015ui.C1436d r36, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r37, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, p753kq.C19862q<? super androidx.compose.p015ui.C1436d, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r39, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r40, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r41, boolean r42, float r43, androidx.compose.foundation.layout.C0759v r44, androidx.compose.runtime.C1302d r45, int r46) {
        /*
            r1 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r42
            r14 = r43
            r15 = r44
            r0 = r46
            java.lang.String r2 = "modifier"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "textField"
            kotlin.jvm.internal.C19383o.m32797g(r8, r2)
            java.lang.String r2 = "paddingValues"
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            r2 = -2112507061(0xffffffff8215b34b, float:-1.0998246E-37)
            r3 = r45
            androidx.compose.runtime.ComposerImpl r7 = r3.mo5440h(r2)
            r2 = r0 & 14
            if (r2 != 0) goto L_0x003b
            boolean r2 = r7.mo5408I(r1)
            if (r2 == 0) goto L_0x0038
            r2 = 4
            goto L_0x0039
        L_0x0038:
            r2 = 2
        L_0x0039:
            r2 = r2 | r0
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            r3 = r0 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x004c
            boolean r3 = r7.mo5408I(r8)
            if (r3 == 0) goto L_0x0049
            r3 = 32
            goto L_0x004b
        L_0x0049:
            r3 = 16
        L_0x004b:
            r2 = r2 | r3
        L_0x004c:
            r3 = r0 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x005c
            boolean r3 = r7.mo5408I(r9)
            if (r3 == 0) goto L_0x0059
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r2 = r2 | r3
        L_0x005c:
            r3 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x006c
            boolean r3 = r7.mo5408I(r10)
            if (r3 == 0) goto L_0x0069
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x006b
        L_0x0069:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x006b:
            r2 = r2 | r3
        L_0x006c:
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r0
            if (r3 != 0) goto L_0x007e
            boolean r3 = r7.mo5408I(r11)
            if (r3 == 0) goto L_0x007b
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x007d
        L_0x007b:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x007d:
            r2 = r2 | r3
        L_0x007e:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            if (r3 != 0) goto L_0x008f
            boolean r3 = r7.mo5408I(r12)
            if (r3 == 0) goto L_0x008c
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008e
        L_0x008c:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x008e:
            r2 = r2 | r3
        L_0x008f:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r0
            if (r3 != 0) goto L_0x00a0
            boolean r3 = r7.mo5427a(r13)
            if (r3 == 0) goto L_0x009d
            r3 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009f
        L_0x009d:
            r3 = 524288(0x80000, float:7.34684E-40)
        L_0x009f:
            r2 = r2 | r3
        L_0x00a0:
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r0
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r7.mo5428b(r14)
            if (r3 == 0) goto L_0x00ae
            r3 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00b0
        L_0x00ae:
            r3 = 4194304(0x400000, float:5.877472E-39)
        L_0x00b0:
            r2 = r2 | r3
        L_0x00b1:
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r0
            if (r3 != 0) goto L_0x00c2
            boolean r3 = r7.mo5408I(r15)
            if (r3 == 0) goto L_0x00bf
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00c1
        L_0x00bf:
            r3 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00c1:
            r2 = r2 | r3
        L_0x00c2:
            r29 = r2
            r2 = 191739611(0xb6db6db, float:4.5782105E-32)
            r2 = r29 & r2
            r3 = 38347922(0x2492492, float:1.4777643E-37)
            if (r2 != r3) goto L_0x00db
            boolean r2 = r7.mo5442i()
            if (r2 != 0) goto L_0x00d5
            goto L_0x00db
        L_0x00d5:
            r7.mo5396C()
            r11 = r7
            goto L_0x04a5
        L_0x00db:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r42)
            java.lang.Float r3 = java.lang.Float.valueOf(r43)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r7.mo5465u(r4)
            boolean r2 = r7.mo5408I(r2)
            boolean r3 = r7.mo5408I(r3)
            r2 = r2 | r3
            boolean r3 = r7.mo5408I(r15)
            r2 = r2 | r3
            java.lang.Object r3 = r7.mo5431c0()
            if (r2 != 0) goto L_0x0101
            androidx.compose.runtime.d$a$a r2 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r3 != r2) goto L_0x0109
        L_0x0101:
            androidx.compose.material.TextFieldMeasurePolicy r3 = new androidx.compose.material.TextFieldMeasurePolicy
            r3.<init>(r13, r14, r15)
            r7.mo5407H0(r3)
        L_0x0109:
            r2 = 0
            r7.mo5418R(r2)
            androidx.compose.material.TextFieldMeasurePolicy r3 = (androidx.compose.material.TextFieldMeasurePolicy) r3
            androidx.compose.runtime.l1 r6 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r2 = r7.mo5410J(r6)
            r5 = r2
            androidx.compose.ui.unit.LayoutDirection r5 = (androidx.compose.p015ui.unit.LayoutDirection) r5
            int r2 = r29 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r4 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo5465u(r4)
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r16 = r7.mo5410J(r4)
            r0 = r16
            m0.b r0 = (p174m0.C7282b) r0
            java.lang.Object r16 = r7.mo5410J(r6)
            r1 = r16
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.p015ui.unit.LayoutDirection) r1
            r45 = r5
            androidx.compose.runtime.l1 r5 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r16 = r7.mo5410J(r5)
            r8 = r16
            androidx.compose.ui.platform.j1 r8 = (androidx.compose.p015ui.platform.C1843j1) r8
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r16.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r14 = androidx.compose.p015ui.layout.C1700o.m3617a(r36)
            int r2 = r2 << 9
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 6
            androidx.compose.runtime.c<?> r9 = r7.f2715a
            boolean r9 = r9 instanceof androidx.compose.runtime.C1299c
            r30 = 0
            if (r9 == 0) goto L_0x04cd
            r7.mo5392A()
            boolean r9 = r7.f2702K
            if (r9 == 0) goto L_0x0164
            r7.mo5450m(r13)
            goto L_0x0167
        L_0x0164:
            r7.mo5452n()
        L_0x0167:
            r9 = 0
            r7.f2738x = r9
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r9 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r7, r3, r9)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r7, r0, r3)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r0 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r7, r1, r0)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r8 = p504ai.C13983i.m21490i(r7, r8, r1, r7)
            int r16 = r2 >> 3
            r16 = r16 & 112(0x70, float:1.57E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r14.invoke(r8, r7, r10)
            r8 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r7.mo5465u(r8)
            int r2 = r2 >> 9
            r2 = r2 & 14
            r8 = 642667778(0x264e5502, float:7.1585814E-16)
            r7.mo5465u(r8)
            r2 = r2 & 11
            r8 = 2
            if (r2 != r8) goto L_0x01ad
            boolean r2 = r7.mo5442i()
            if (r2 != 0) goto L_0x01a6
            goto L_0x01ad
        L_0x01a6:
            r7.mo5396C()
            r0 = 0
            r11 = r7
            goto L_0x04a1
        L_0x01ad:
            r2 = 254816194(0xf302fc2, float:8.686668E-30)
            r7.mo5465u(r2)
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            if (r11 == 0) goto L_0x0251
            androidx.compose.ui.d$a r8 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.String r10 = "Leading"
            androidx.compose.ui.d r8 = androidx.compose.p015ui.text.input.C1993m.m4358S(r8, r10)
            androidx.compose.ui.d r10 = androidx.compose.material.TextFieldImplKt.f2332d
            androidx.compose.ui.d r8 = r8.mo6148i0(r10)
            androidx.compose.ui.b r10 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r7.mo5465u(r2)
            r2 = 0
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r10, r2, r7)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r7.mo5465u(r2)
            java.lang.Object r2 = r7.mo5410J(r4)
            r20 = r2
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r2 = r7.mo5410J(r6)
            r23 = r2
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r2 = r7.mo5410J(r5)
            r26 = r2
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r8)
            androidx.compose.runtime.c<?> r8 = r7.f2715a
            boolean r8 = r8 instanceof androidx.compose.runtime.C1299c
            if (r8 == 0) goto L_0x024d
            r7.mo5392A()
            boolean r8 = r7.f2702K
            if (r8 == 0) goto L_0x0203
            r7.mo5450m(r13)
            goto L_0x0206
        L_0x0203:
            r7.mo5452n()
        L_0x0206:
            r8 = 0
            r7.f2738x = r8
            r16 = r7
            r18 = r9
            r19 = r7
            r21 = r3
            r22 = r7
            r24 = r0
            r25 = r7
            r27 = r1
            r28 = r7
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r8
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r2 = 822730659(0x3109dfa3, float:2.0063247E-9)
            r7.mo5465u(r2)
            int r2 = r29 >> 12
            r2 = r2 & 14
            r10 = r3
            r3 = r40
            r14 = r4
            r4 = r7
            r31 = r45
            r32 = r5
            r5 = r8
            r33 = r6
            r6 = r8
            r11 = r7
            r7 = r8
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            android.support.p013v4.media.C0071c.m194f(r11, r2, r8, r8)
            goto L_0x025b
        L_0x024d:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x0251:
            r31 = r45
            r10 = r3
            r14 = r4
            r32 = r5
            r33 = r6
            r11 = r7
            r8 = 0
        L_0x025b:
            r11.mo5418R(r8)
            r2 = 254816479(0xf3030df, float:8.686882E-30)
            r11.mo5465u(r2)
            if (r12 == 0) goto L_0x0306
            androidx.compose.ui.d$a r2 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            java.lang.String r3 = "Trailing"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r2, r3)
            androidx.compose.ui.d r3 = androidx.compose.material.TextFieldImplKt.f2332d
            androidx.compose.ui.d r2 = r2.mo6148i0(r3)
            androidx.compose.ui.b r3 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r4 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r4)
            r4 = 0
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r3, r4, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            java.lang.Object r3 = r11.mo5410J(r14)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            r8 = r33
            java.lang.Object r3 = r11.mo5410J(r8)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            r7 = r32
            java.lang.Object r3 = r11.mo5410J(r7)
            r26 = r3
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r3 = r11.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            if (r3 == 0) goto L_0x0302
            r11.mo5392A()
            boolean r3 = r11.f2702K
            if (r3 == 0) goto L_0x02b8
            r11.mo5450m(r13)
            goto L_0x02bb
        L_0x02b8:
            r11.mo5452n()
        L_0x02bb:
            r3 = 0
            r11.f2738x = r3
            r16 = r11
            r18 = r9
            r19 = r11
            r21 = r10
            r22 = r11
            r24 = r0
            r25 = r11
            r27 = r1
            r28 = r11
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r3
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r2 = -1007916070(0xffffffffc3ec6bda, float:-472.8426)
            r11.mo5465u(r2)
            int r2 = r29 >> 15
            r2 = r2 & 14
            r6 = 0
            r3 = r41
            r4 = r11
            r5 = r6
            r45 = r6
            r32 = r1
            r1 = r7
            r7 = r45
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            r3 = r45
            android.support.p013v4.media.C0071c.m194f(r11, r2, r3, r3)
            r6 = r3
            goto L_0x030f
        L_0x0302:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x0306:
            r8 = r33
            r35 = r32
            r32 = r1
            r1 = r35
            r6 = 0
        L_0x030f:
            r11.mo5418R(r6)
            r2 = r31
            float r3 = com.google.android.play.core.assetpacks.C15588c1.m25290L(r15, r2)
            float r2 = com.google.android.play.core.assetpacks.C15588c1.m25288K(r15, r2)
            androidx.compose.ui.d$a r7 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r40 == 0) goto L_0x032b
            float r4 = androidx.compose.material.TextFieldImplKt.f2331c
            float r3 = r3 - r4
            float r4 = (float) r6
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x032b
            r17 = r4
            goto L_0x032d
        L_0x032b:
            r17 = r3
        L_0x032d:
            r18 = 0
            if (r12 == 0) goto L_0x033c
            float r3 = androidx.compose.material.TextFieldImplKt.f2331c
            float r2 = r2 - r3
            float r3 = (float) r6
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x033c
            r19 = r3
            goto L_0x033e
        L_0x033c:
            r19 = r2
        L_0x033e:
            r20 = 0
            r21 = 10
            r16 = r7
            androidx.compose.ui.d r6 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r16, r17, r18, r19, r20, r21)
            r2 = 254817490(0xf3034d2, float:8.687643E-30)
            r11.mo5465u(r2)
            r5 = r39
            if (r5 == 0) goto L_0x0367
            java.lang.String r2 = "Hint"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r7, r2)
            androidx.compose.ui.d r2 = r2.mo6148i0(r6)
            int r3 = r29 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.invoke(r2, r11, r3)
        L_0x0367:
            r2 = 0
            r11.mo5418R(r2)
            r3 = 254817619(0xf303553, float:8.68774E-30)
            r11.mo5465u(r3)
            if (r38 == 0) goto L_0x040e
            java.lang.String r2 = "Label"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r7, r2)
            androidx.compose.ui.d r2 = r2.mo6148i0(r6)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r3)
            androidx.compose.ui.b r3 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r4 = 0
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r3, r4, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            java.lang.Object r3 = r11.mo5410J(r14)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r3 = r11.mo5410J(r8)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r3 = r11.mo5410J(r1)
            r26 = r3
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r3 = r11.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            if (r3 == 0) goto L_0x040a
            r11.mo5392A()
            boolean r3 = r11.f2702K
            if (r3 == 0) goto L_0x03bd
            r11.mo5450m(r13)
            goto L_0x03c0
        L_0x03bd:
            r11.mo5452n()
        L_0x03c0:
            r3 = 0
            r11.f2738x = r3
            r16 = r11
            r18 = r9
            r19 = r11
            r21 = r10
            r22 = r11
            r24 = r0
            r25 = r11
            r27 = r32
            r28 = r11
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r3
            r17 = r2
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r2 = 1319246300(0x4ea219dc, float:1.35980186E9)
            r11.mo5465u(r2)
            int r2 = r29 >> 6
            r2 = r2 & 14
            r4 = 0
            r3 = r38
            r45 = r4
            r4 = r11
            r5 = r45
            r34 = r6
            r6 = r45
            r12 = r7
            r7 = r45
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r2 = 1
            r3 = r45
            android.support.p013v4.media.C0071c.m194f(r11, r2, r3, r3)
            r2 = r3
            goto L_0x0411
        L_0x040a:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x040e:
            r34 = r6
            r12 = r7
        L_0x0411:
            r11.mo5418R(r2)
            java.lang.String r2 = "TextField"
            androidx.compose.ui.d r2 = androidx.compose.p015ui.text.input.C1993m.m4358S(r12, r2)
            r3 = r34
            androidx.compose.ui.d r2 = r2.mo6148i0(r3)
            r3 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r3)
            androidx.compose.ui.b r3 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r4 = 1
            androidx.compose.ui.layout.v r17 = androidx.compose.foundation.layout.BoxKt.m1457c(r3, r4, r11)
            r3 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r3)
            java.lang.Object r3 = r11.mo5410J(r14)
            r20 = r3
            m0.b r20 = (p174m0.C7282b) r20
            java.lang.Object r3 = r11.mo5410J(r8)
            r23 = r3
            androidx.compose.ui.unit.LayoutDirection r23 = (androidx.compose.p015ui.unit.LayoutDirection) r23
            java.lang.Object r1 = r11.mo5410J(r1)
            r26 = r1
            androidx.compose.ui.platform.j1 r26 = (androidx.compose.p015ui.platform.C1843j1) r26
            androidx.compose.runtime.internal.ComposableLambdaImpl r1 = androidx.compose.p015ui.layout.C1700o.m3617a(r2)
            androidx.compose.runtime.c<?> r2 = r11.f2715a
            boolean r2 = r2 instanceof androidx.compose.runtime.C1299c
            if (r2 == 0) goto L_0x04c9
            r11.mo5392A()
            boolean r2 = r11.f2702K
            if (r2 == 0) goto L_0x0460
            r11.mo5450m(r13)
            goto L_0x0463
        L_0x0460:
            r11.mo5452n()
        L_0x0463:
            r2 = 0
            r11.f2738x = r2
            r16 = r11
            r18 = r9
            r19 = r11
            r21 = r10
            r22 = r11
            r24 = r0
            r25 = r11
            r27 = r32
            r28 = r11
            androidx.compose.runtime.a1 r18 = p003a2.C0023f.m106g(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r20 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r21 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r16 = r2
            r17 = r1
            androidx.appcompat.widget.C0326j.m868m(r16, r17, r18, r19, r20, r21)
            r0 = -2048931960(0xffffffff85dfc788, float:-2.1044115E-35)
            r11.mo5465u(r0)
            int r0 = r29 >> 3
            r2 = r0 & 14
            r0 = 0
            r3 = r37
            r4 = r11
            r5 = r0
            r6 = r0
            r7 = r0
            androidx.compose.animation.C0472h.m1247j(r2, r3, r4, r5, r6, r7)
            r1 = 1
            android.support.p013v4.media.C0071c.m194f(r11, r1, r0, r0)
        L_0x04a1:
            r1 = 1
            android.support.p013v4.media.session.C0087d.m238h(r11, r0, r0, r1, r0)
        L_0x04a5:
            androidx.compose.runtime.v0 r11 = r11.mo5421U()
            if (r11 != 0) goto L_0x04ac
            goto L_0x04c8
        L_0x04ac:
            androidx.compose.material.TextFieldKt$TextFieldLayout$2 r12 = new androidx.compose.material.TextFieldKt$TextFieldLayout$2
            r0 = r12
            r1 = r36
            r2 = r37
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r8 = r43
            r9 = r44
            r10 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f3081d = r12
        L_0x04c8:
            return
        L_0x04c9:
            p001a0.C0005b.m45j0()
            throw r30
        L_0x04cd:
            p001a0.C0005b.m45j0()
            throw r30
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.m2272a(androidx.compose.ui.d, kq.p, kq.p, kq.q, kq.p, kq.p, boolean, float, androidx.compose.foundation.layout.v, androidx.compose.runtime.d, int):void");
    }

    /* renamed from: b */
    public static final int m2273b(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, C0759v vVar) {
        float f2 = f2336c * f;
        float d = vVar.mo4153d() * f;
        float a = vVar.mo4150a() * f;
        int max = Math.max(i, i5);
        return Math.max(C7279a.m13954l(z ? ((float) i2) + f2 + ((float) max) + a : d + ((float) max) + a), Math.max(Math.max(i3, i4), C7280a.m13964i(j)));
    }
}
