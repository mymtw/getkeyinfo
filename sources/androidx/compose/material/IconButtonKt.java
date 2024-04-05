package androidx.compose.material;

public final class IconButtonKt {

    /* renamed from: a */
    public static final float f2213a = ((float) 24);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2184a(p753kq.C19846a<kotlin.C19394m> r17, androidx.compose.p015ui.C1436d r18, boolean r19, androidx.compose.foundation.interaction.C0640j r20, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r21, androidx.compose.runtime.C1302d r22, int r23, int r24) {
        /*
            r8 = r17
            r9 = r21
            r10 = r23
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = -111063634(0xfffffffff9614dae, float:-7.3115145E34)
            r1 = r22
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r24 & 1
            if (r0 == 0) goto L_0x0020
            r0 = r10 | 6
            goto L_0x0030
        L_0x0020:
            r0 = r10 & 14
            if (r0 != 0) goto L_0x002f
            boolean r0 = r11.mo5408I(r8)
            if (r0 == 0) goto L_0x002c
            r0 = 4
            goto L_0x002d
        L_0x002c:
            r0 = 2
        L_0x002d:
            r0 = r0 | r10
            goto L_0x0030
        L_0x002f:
            r0 = r10
        L_0x0030:
            r1 = r24 & 2
            if (r1 == 0) goto L_0x0037
            r0 = r0 | 48
            goto L_0x004a
        L_0x0037:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004a
            r2 = r18
            boolean r3 = r11.mo5408I(r2)
            if (r3 == 0) goto L_0x0046
            r3 = 32
            goto L_0x0048
        L_0x0046:
            r3 = 16
        L_0x0048:
            r0 = r0 | r3
            goto L_0x004c
        L_0x004a:
            r2 = r18
        L_0x004c:
            r3 = r24 & 4
            if (r3 == 0) goto L_0x0053
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0066
            r4 = r19
            boolean r5 = r11.mo5427a(r4)
            if (r5 == 0) goto L_0x0062
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r0 = r0 | r5
            goto L_0x0068
        L_0x0066:
            r4 = r19
        L_0x0068:
            r5 = r24 & 8
            if (r5 == 0) goto L_0x006f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0082
            r6 = r20
            boolean r7 = r11.mo5408I(r6)
            if (r7 == 0) goto L_0x007e
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r0 = r0 | r7
            goto L_0x0084
        L_0x0082:
            r6 = r20
        L_0x0084:
            r7 = r24 & 16
            if (r7 == 0) goto L_0x008b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009d
        L_0x008b:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r10
            if (r7 != 0) goto L_0x009d
            boolean r7 = r11.mo5408I(r9)
            if (r7 == 0) goto L_0x009a
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r0 = r0 | r7
        L_0x009d:
            r12 = r0
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r0 & r12
            r7 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r7) goto L_0x00b4
            boolean r0 = r11.mo5442i()
            if (r0 != 0) goto L_0x00ad
            goto L_0x00b4
        L_0x00ad:
            r11.mo5396C()
            r3 = r4
            r4 = r6
            goto L_0x01c5
        L_0x00b4:
            if (r1 == 0) goto L_0x00ba
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r13 = r0
            goto L_0x00bb
        L_0x00ba:
            r13 = r2
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            r0 = 1
            r14 = r0
            goto L_0x00c1
        L_0x00c0:
            r14 = r4
        L_0x00c1:
            r15 = 0
            if (r5 == 0) goto L_0x00de
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r0)
            java.lang.Object r0 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r1 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r0 != r1) goto L_0x00d6
            androidx.compose.foundation.interaction.k r0 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x00d6:
            r11.mo5418R(r15)
            androidx.compose.foundation.interaction.j r0 = (androidx.compose.foundation.interaction.C0640j) r0
            r16 = r0
            goto L_0x00e0
        L_0x00de:
            r16 = r6
        L_0x00e0:
            androidx.compose.ui.d r0 = androidx.compose.material.TouchTargetKt.m2285a(r13)
            r1 = 0
            float r2 = f2213a
            r3 = 0
            r6 = 54
            r7 = 4
            r5 = r11
            androidx.compose.material.ripple.c r2 = androidx.compose.material.ripple.C1244j.m2369a(r1, r2, r3, r5, r6, r7)
            r4 = 0
            androidx.compose.ui.semantics.g r5 = new androidx.compose.ui.semantics.g
            r5.<init>(r15)
            r7 = 8
            r1 = r16
            r3 = r14
            r6 = r17
            androidx.compose.ui.d r0 = androidx.compose.foundation.ClickableKt.m1297c(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.b r1 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            r2 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r11.mo5465u(r2)
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.BoxKt.m1457c(r1, r15, r11)
            r2 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r11.mo5465u(r2)
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r2 = r11.mo5410J(r2)
            m0.b r2 = (p174m0.C7282b) r2
            androidx.compose.runtime.l1 r3 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r3 = r11.mo5410J(r3)
            androidx.compose.ui.unit.LayoutDirection r3 = (androidx.compose.p015ui.unit.LayoutDirection) r3
            androidx.compose.runtime.l1 r4 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r4 = r11.mo5410J(r4)
            androidx.compose.ui.platform.j1 r4 = (androidx.compose.p015ui.platform.C1843j1) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r5.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            androidx.compose.runtime.c<?> r6 = r11.f2715a
            boolean r6 = r6 instanceof androidx.compose.runtime.C1299c
            if (r6 == 0) goto L_0x01dd
            r11.mo5392A()
            boolean r6 = r11.f2702K
            if (r6 == 0) goto L_0x0148
            r11.mo5450m(r5)
            goto L_0x014b
        L_0x0148:
            r11.mo5452n()
        L_0x014b:
            r11.f2738x = r15
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r11, r1, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r11, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r11, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r11, r4, r1, r11)
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r1 = r15
            r2 = r0
            r4 = r11
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            r0 = -2146259096(0xffffffff8012af68, float:-1.715963E-39)
            r11.mo5465u(r0)
            if (r14 == 0) goto L_0x0189
            r0 = 753555775(0x2cea593f, float:6.6605883E-12)
            r11.mo5465u(r0)
            androidx.compose.runtime.t r0 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Object r0 = r11.mo5410J(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L_0x0193
        L_0x0189:
            r0 = 753555801(0x2cea5959, float:6.6605996E-12)
            r11.mo5465u(r0)
            float r0 = kotlinx.coroutines.C19543e0.m33299P(r11)
        L_0x0193:
            r11.mo5418R(r15)
            r1 = 1
            androidx.compose.runtime.t0[] r1 = new androidx.compose.runtime.C1412t0[r1]
            androidx.compose.runtime.t r2 = androidx.compose.material.ContentAlphaKt.f2198a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            androidx.compose.runtime.t0 r0 = r2.mo5908b(r0)
            r1[r15] = r0
            int r0 = r12 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 8
            androidx.compose.runtime.CompositionLocalKt.m2530a(r1, r9, r11, r0)
            r11.mo5418R(r15)
            r11.mo5418R(r15)
            r11.mo5418R(r15)
            r0 = 1
            r11.mo5418R(r0)
            r11.mo5418R(r15)
            r11.mo5418R(r15)
            r2 = r13
            r3 = r14
            r4 = r16
        L_0x01c5:
            androidx.compose.runtime.v0 r11 = r11.mo5421U()
            if (r11 != 0) goto L_0x01cc
            goto L_0x01dc
        L_0x01cc:
            androidx.compose.material.IconButtonKt$IconButton$3 r12 = new androidx.compose.material.IconButtonKt$IconButton$3
            r0 = r12
            r1 = r17
            r5 = r21
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.f3081d = r12
        L_0x01dc:
            return
        L_0x01dd:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconButtonKt.m2184a(kq.a, androidx.compose.ui.d, boolean, androidx.compose.foundation.interaction.j, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
