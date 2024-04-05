package androidx.compose.material;

public final class OneLine {

    /* renamed from: a */
    public static final OneLine f2234a = new OneLine();

    /* renamed from: b */
    public static final float f2235b = ((float) 48);

    /* renamed from: c */
    public static final float f2236c = ((float) 56);

    /* renamed from: d */
    public static final float f2237d = ((float) 40);

    /* renamed from: e */
    public static final float f2238e;

    /* renamed from: f */
    public static final float f2239f = ((float) 8);

    /* renamed from: g */
    public static final float f2240g;

    /* renamed from: h */
    public static final float f2241h;

    /* renamed from: i */
    public static final float f2242i;

    static {
        float f = (float) 16;
        f2238e = f;
        f2240g = f;
        f2241h = f;
        f2242i = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4976a(androidx.compose.p015ui.C1436d r34, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r35, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r36, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r37, androidx.compose.runtime.C1302d r38, int r39, int r40) {
        /*
            r33 = this;
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r39
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = -1884451315(0xffffffff8fad8e0d, float:-1.7113833E-29)
            r1 = r38
            androidx.compose.runtime.ComposerImpl r5 = r1.mo5440h(r0)
            r0 = r40 & 1
            r1 = 2
            if (r0 == 0) goto L_0x0021
            r2 = r9 | 6
            r3 = r2
            r2 = r34
            goto L_0x0035
        L_0x0021:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x0032
            r2 = r34
            boolean r3 = r5.mo5408I(r2)
            if (r3 == 0) goto L_0x002f
            r3 = 4
            goto L_0x0030
        L_0x002f:
            r3 = r1
        L_0x0030:
            r3 = r3 | r9
            goto L_0x0035
        L_0x0032:
            r2 = r34
            r3 = r9
        L_0x0035:
            r4 = r40 & 2
            if (r4 == 0) goto L_0x003c
            r3 = r3 | 48
            goto L_0x004c
        L_0x003c:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004c
            boolean r4 = r5.mo5408I(r6)
            if (r4 == 0) goto L_0x0049
            r4 = 32
            goto L_0x004b
        L_0x0049:
            r4 = 16
        L_0x004b:
            r3 = r3 | r4
        L_0x004c:
            r4 = r40 & 4
            if (r4 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0063
            boolean r4 = r5.mo5408I(r7)
            if (r4 == 0) goto L_0x0060
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r4
        L_0x0063:
            r4 = r40 & 8
            if (r4 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x007a
            boolean r4 = r5.mo5408I(r8)
            if (r4 == 0) goto L_0x0077
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r4
        L_0x007a:
            r4 = r40 & 16
            if (r4 == 0) goto L_0x0081
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0081:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r9
            if (r4 != 0) goto L_0x0096
            r4 = r33
            boolean r10 = r5.mo5408I(r4)
            if (r10 == 0) goto L_0x0092
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r10
            goto L_0x0098
        L_0x0096:
            r4 = r33
        L_0x0098:
            r23 = r3
            r3 = 46811(0xb6db, float:6.5596E-41)
            r3 = r23 & r3
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r10) goto L_0x00b0
            boolean r3 = r5.mo5442i()
            if (r3 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r5.mo5396C()
            r7 = r5
            goto L_0x035d
        L_0x00b0:
            if (r0 == 0) goto L_0x00b6
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r3 = r0
            goto L_0x00b7
        L_0x00b6:
            r3 = r2
        L_0x00b7:
            if (r6 != 0) goto L_0x00bc
            float r0 = f2235b
            goto L_0x00be
        L_0x00bc:
            float r0 = f2236c
        L_0x00be:
            r2 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1489i(r3, r0, r2, r1)
            r1 = 693286680(0x2952b718, float:4.6788176E-14)
            r5.mo5465u(r1)
            androidx.compose.foundation.layout.d$i r1 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.b$b r2 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.RowKt.m1480a(r1, r2, r5)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r2)
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r10 = r5.mo5410J(r2)
            m0.b r10 = (p174m0.C7282b) r10
            androidx.compose.runtime.l1 r15 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r11 = r5.mo5410J(r15)
            androidx.compose.ui.unit.LayoutDirection r11 = (androidx.compose.p015ui.unit.LayoutDirection) r11
            androidx.compose.runtime.l1 r14 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r12 = r5.mo5410J(r14)
            androidx.compose.ui.platform.j1 r12 = (androidx.compose.p015ui.platform.C1843j1) r12
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r13.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            r34 = r3
            androidx.compose.runtime.c<?> r3 = r5.f2715a
            boolean r3 = r3 instanceof androidx.compose.runtime.C1299c
            r24 = 0
            if (r3 == 0) goto L_0x037d
            r5.mo5392A()
            boolean r3 = r5.f2702K
            if (r3 == 0) goto L_0x010f
            r5.mo5450m(r13)
            goto L_0x0112
        L_0x010f:
            r5.mo5452n()
        L_0x0112:
            r3 = 0
            r5.f2738x = r3
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r3 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r5, r1, r3)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r5, r10, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r10 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r5, r11, r10)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r11 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r12 = p504ai.C13983i.m21490i(r5, r12, r11, r5)
            r16 = 0
            r17 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r18 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r25 = r10
            r10 = r16
            r26 = r11
            r11 = r0
            r0 = r13
            r13 = r5
            r4 = r14
            r14 = r17
            r7 = r15
            r15 = r18
            androidx.appcompat.widget.C0326j.m868m(r10, r11, r12, r13, r14, r15)
            androidx.compose.foundation.layout.a0 r15 = androidx.compose.foundation.layout.C0708a0.f1463a
            r10 = -2040473487(0xffffffff8660d871, float:-4.2288734E-35)
            r5.mo5465u(r10)
            r10 = 1825884304(0x6cd4c890, float:2.0579152E27)
            r5.mo5465u(r10)
            if (r6 == 0) goto L_0x0202
            androidx.compose.ui.d$a r10 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            androidx.compose.ui.d r10 = r15.mo4074b(r10)
            float r17 = f2238e
            float r11 = f2237d
            float r11 = r17 + r11
            r12 = 2
            r13 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.SizeKt.m1496p(r10, r11, r13, r12)
            float r20 = f2239f
            r19 = 0
            r21 = 4
            r18 = r20
            androidx.compose.ui.d r10 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.b r11 = androidx.compose.p015ui.C1428a.C1429a.f3107c
            r12 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.mo5465u(r12)
            r12 = 0
            androidx.compose.ui.layout.v r11 = androidx.compose.foundation.layout.BoxKt.m1457c(r11, r12, r5)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r12)
            java.lang.Object r12 = r5.mo5410J(r2)
            r14 = r12
            m0.b r14 = (p174m0.C7282b) r14
            java.lang.Object r12 = r5.mo5410J(r7)
            r17 = r12
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.p015ui.unit.LayoutDirection) r17
            java.lang.Object r12 = r5.mo5410J(r4)
            r20 = r12
            androidx.compose.ui.platform.j1 r20 = (androidx.compose.p015ui.platform.C1843j1) r20
            androidx.compose.runtime.internal.ComposableLambdaImpl r27 = androidx.compose.p015ui.layout.C1700o.m3617a(r10)
            androidx.compose.runtime.c<?> r10 = r5.f2715a
            boolean r10 = r10 instanceof androidx.compose.runtime.C1299c
            if (r10 == 0) goto L_0x01fe
            r5.mo5392A()
            boolean r10 = r5.f2702K
            if (r10 == 0) goto L_0x01b1
            r5.mo5450m(r0)
            goto L_0x01b4
        L_0x01b1:
            r5.mo5452n()
        L_0x01b4:
            r13 = 0
            r5.f2738x = r13
            r10 = r5
            r12 = r3
            r28 = r13
            r13 = r5
            r29 = r15
            r15 = r1
            r16 = r5
            r18 = r25
            r19 = r5
            r21 = r26
            r22 = r5
            androidx.compose.runtime.a1 r12 = p003a2.C0023f.m106g(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r10 = r28
            r11 = r27
            androidx.appcompat.widget.C0326j.m868m(r10, r11, r12, r13, r14, r15)
            r10 = 722575250(0x2b119f92, float:5.1735797E-13)
            r5.mo5465u(r10)
            int r10 = r23 >> 3
            r10 = r10 & 14
            r11 = 0
            r15 = r0
            r0 = r10
            r27 = r1
            r1 = r35
            r14 = r2
            r2 = r5
            r28 = r34
            r30 = r3
            r3 = r11
            r13 = r4
            r4 = r11
            r12 = r5
            r5 = r11
            androidx.compose.animation.C0472h.m1247j(r0, r1, r2, r3, r4, r5)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r12, r0, r11, r11)
            goto L_0x020f
        L_0x01fe:
            p001a0.C0005b.m45j0()
            throw r24
        L_0x0202:
            r28 = r34
            r27 = r1
            r14 = r2
            r30 = r3
            r13 = r4
            r12 = r5
            r29 = r15
            r15 = r0
            r11 = 0
        L_0x020f:
            r12.mo5418R(r11)
            androidx.compose.ui.d$a r5 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r0 = 1
            r4 = r29
            androidx.compose.ui.d r0 = r4.mo4073a(r5, r0)
            androidx.compose.ui.d r16 = r4.mo4074b(r0)
            float r17 = f2240g
            r18 = 0
            float r19 = f2241h
            r20 = 0
            r21 = 10
            androidx.compose.ui.d r0 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r16, r17, r18, r19, r20, r21)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3107c
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r12.mo5465u(r2)
            r2 = 0
            androidx.compose.ui.layout.v r11 = androidx.compose.foundation.layout.BoxKt.m1457c(r1, r2, r12)
            r1 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r12.mo5465u(r1)
            java.lang.Object r1 = r12.mo5410J(r14)
            m0.b r1 = (p174m0.C7282b) r1
            java.lang.Object r2 = r12.mo5410J(r7)
            r17 = r2
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.p015ui.unit.LayoutDirection) r17
            java.lang.Object r2 = r12.mo5410J(r13)
            r20 = r2
            androidx.compose.ui.platform.j1 r20 = (androidx.compose.p015ui.platform.C1843j1) r20
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c<?> r2 = r12.f2715a
            boolean r2 = r2 instanceof androidx.compose.runtime.C1299c
            if (r2 == 0) goto L_0x0379
            r12.mo5392A()
            boolean r2 = r12.f2702K
            if (r2 == 0) goto L_0x026b
            r12.mo5450m(r15)
            goto L_0x026e
        L_0x026b:
            r12.mo5452n()
        L_0x026e:
            r2 = 0
            r12.f2738x = r2
            r10 = r12
            r3 = r12
            r12 = r30
            r31 = r13
            r13 = r3
            r32 = r14
            r14 = r1
            r1 = r15
            r15 = r27
            r16 = r3
            r18 = r25
            r19 = r3
            r21 = r26
            r22 = r3
            androidx.compose.runtime.a1 r12 = p003a2.C0023f.m106g(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r10 = r2
            r11 = r0
            androidx.appcompat.widget.C0326j.m868m(r10, r11, r12, r13, r14, r15)
            r0 = -869001737(0xffffffffcc3415f7, float:-4.7208412E7)
            r3.mo5465u(r0)
            int r0 = r23 >> 6
            r0 = r0 & 14
            r10 = 0
            r11 = r1
            r1 = r36
            r2 = r3
            r15 = r3
            r3 = r10
            r12 = r4
            r4 = r10
            r13 = r5
            r5 = r10
            androidx.compose.animation.C0472h.m1247j(r0, r1, r2, r3, r4, r5)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r15, r0, r10, r10)
            if (r8 == 0) goto L_0x034f
            androidx.compose.ui.d r16 = r12.mo4074b(r13)
            r17 = 0
            r18 = 0
            float r19 = f2242i
            r20 = 0
            r21 = 11
            androidx.compose.ui.d r0 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r16, r17, r18, r19, r20, r21)
            r1 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r15.mo5465u(r1)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3105a
            r2 = 0
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.BoxKt.m1457c(r1, r2, r15)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r15.mo5465u(r2)
            r2 = r32
            java.lang.Object r2 = r15.mo5410J(r2)
            r14 = r2
            m0.b r14 = (p174m0.C7282b) r14
            java.lang.Object r2 = r15.mo5410J(r7)
            r17 = r2
            androidx.compose.ui.unit.LayoutDirection r17 = (androidx.compose.p015ui.unit.LayoutDirection) r17
            r2 = r31
            java.lang.Object r2 = r15.mo5410J(r2)
            r20 = r2
            androidx.compose.ui.platform.j1 r20 = (androidx.compose.p015ui.platform.C1843j1) r20
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c<?> r2 = r15.f2715a
            boolean r2 = r2 instanceof androidx.compose.runtime.C1299c
            if (r2 == 0) goto L_0x034b
            r15.mo5392A()
            boolean r2 = r15.f2702K
            if (r2 == 0) goto L_0x030a
            r15.mo5450m(r11)
            goto L_0x030d
        L_0x030a:
            r15.mo5452n()
        L_0x030d:
            r2 = 0
            r15.f2738x = r2
            r10 = r15
            r11 = r1
            r12 = r30
            r13 = r15
            r7 = r15
            r15 = r27
            r16 = r7
            r18 = r25
            r19 = r7
            r21 = r26
            r22 = r7
            androidx.compose.runtime.a1 r12 = p003a2.C0023f.m106g(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r15 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r10 = r2
            r11 = r0
            r13 = r7
            androidx.appcompat.widget.C0326j.m868m(r10, r11, r12, r13, r14, r15)
            r0 = 9272137(0x8d7b49, float:1.2993031E-38)
            r7.mo5465u(r0)
            int r0 = r23 >> 9
            r0 = r0 & 14
            r10 = 0
            r1 = r37
            r2 = r7
            r3 = r10
            r4 = r10
            r5 = r10
            androidx.compose.animation.C0472h.m1247j(r0, r1, r2, r3, r4, r5)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r7, r0, r10, r10)
            goto L_0x0351
        L_0x034b:
            p001a0.C0005b.m45j0()
            throw r24
        L_0x034f:
            r7 = r15
            r10 = 0
        L_0x0351:
            r0 = 1
            android.support.p013v4.media.session.C0087d.m238h(r7, r10, r10, r10, r0)
            r7.mo5418R(r10)
            r7.mo5418R(r10)
            r2 = r28
        L_0x035d:
            androidx.compose.runtime.v0 r10 = r7.mo5421U()
            if (r10 != 0) goto L_0x0364
            goto L_0x0378
        L_0x0364:
            androidx.compose.material.OneLine$ListItem$2 r11 = new androidx.compose.material.OneLine$ListItem$2
            r0 = r11
            r1 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r39
            r7 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.f3081d = r11
        L_0x0378:
            return
        L_0x0379:
            p001a0.C0005b.m45j0()
            throw r24
        L_0x037d:
            p001a0.C0005b.m45j0()
            throw r24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OneLine.mo4976a(androidx.compose.ui.d, kq.p, kq.p, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
