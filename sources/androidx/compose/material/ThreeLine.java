package androidx.compose.material;

public final class ThreeLine {

    /* renamed from: a */
    public static final ThreeLine f2343a = new ThreeLine();

    /* renamed from: b */
    public static final float f2344b = ((float) 88);

    /* renamed from: c */
    public static final float f2345c = ((float) 40);

    /* renamed from: d */
    public static final float f2346d;

    /* renamed from: e */
    public static final float f2347e;

    /* renamed from: f */
    public static final float f2348f;

    /* renamed from: g */
    public static final float f2349g;

    /* renamed from: h */
    public static final float f2350h = ((float) 28);

    /* renamed from: i */
    public static final float f2351i;

    /* renamed from: j */
    public static final float f2352j;

    /* renamed from: k */
    public static final float f2353k;

    /* renamed from: l */
    public static final float f2354l;

    static {
        float f = (float) 16;
        f2346d = f;
        f2347e = f;
        f2348f = f;
        f2349g = f;
        float f2 = (float) 20;
        f2351i = f2;
        f2352j = f2;
        f2353k = f;
        f2354l = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: type inference failed for: r11v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5211a(androidx.compose.p015ui.C1436d r33, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r34, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r35, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r36, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r37, p753kq.C19861p<? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r38, androidx.compose.runtime.C1302d r39, int r40, int r41) {
        /*
            r32 = this;
            r6 = r34
            r7 = r35
            r8 = r36
            r9 = r37
            r10 = r38
            r11 = r40
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "secondaryText"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            r0 = 1749738797(0x684ae52d, float:3.8325823E24)
            r1 = r39
            androidx.compose.runtime.ComposerImpl r5 = r1.mo5440h(r0)
            r0 = r41 & 1
            r1 = 2
            if (r0 == 0) goto L_0x002a
            r2 = r11 | 6
            r3 = r2
            r2 = r33
            goto L_0x003e
        L_0x002a:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x003b
            r2 = r33
            boolean r3 = r5.mo5408I(r2)
            if (r3 == 0) goto L_0x0038
            r3 = 4
            goto L_0x0039
        L_0x0038:
            r3 = r1
        L_0x0039:
            r3 = r3 | r11
            goto L_0x003e
        L_0x003b:
            r2 = r33
            r3 = r11
        L_0x003e:
            r4 = r41 & 2
            if (r4 == 0) goto L_0x0045
            r3 = r3 | 48
            goto L_0x0055
        L_0x0045:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0055
            boolean r4 = r5.mo5408I(r6)
            if (r4 == 0) goto L_0x0052
            r4 = 32
            goto L_0x0054
        L_0x0052:
            r4 = 16
        L_0x0054:
            r3 = r3 | r4
        L_0x0055:
            r4 = r41 & 4
            if (r4 == 0) goto L_0x005c
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r4 = r11 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x006c
            boolean r4 = r5.mo5408I(r7)
            if (r4 == 0) goto L_0x0069
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r3 = r3 | r4
        L_0x006c:
            r4 = r41 & 8
            if (r4 == 0) goto L_0x0073
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0083
            boolean r4 = r5.mo5408I(r8)
            if (r4 == 0) goto L_0x0080
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r3 = r3 | r4
        L_0x0083:
            r4 = r41 & 16
            if (r4 == 0) goto L_0x008a
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008a:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x009c
            boolean r4 = r5.mo5408I(r9)
            if (r4 == 0) goto L_0x0099
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r3 = r3 | r4
        L_0x009c:
            r4 = r41 & 32
            if (r4 == 0) goto L_0x00a3
            r4 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b3
        L_0x00a3:
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00b4
            boolean r4 = r5.mo5408I(r10)
            if (r4 == 0) goto L_0x00b1
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b3
        L_0x00b1:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x00b3:
            r3 = r3 | r4
        L_0x00b4:
            r4 = r41 & 64
            if (r4 == 0) goto L_0x00bc
            r4 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r4
            goto L_0x00d0
        L_0x00bc:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x00d0
            r4 = r32
            boolean r12 = r5.mo5408I(r4)
            if (r12 == 0) goto L_0x00cc
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r12 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r12
            goto L_0x00d2
        L_0x00d0:
            r4 = r32
        L_0x00d2:
            r12 = 2995931(0x2db6db, float:4.198194E-39)
            r12 = r12 & r3
            r13 = 599186(0x92492, float:8.39638E-40)
            if (r12 != r13) goto L_0x00e8
            boolean r12 = r5.mo5442i()
            if (r12 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            r5.mo5396C()
            r11 = r5
            goto L_0x02ca
        L_0x00e8:
            if (r0 == 0) goto L_0x00ed
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r2 = r0
        L_0x00ed:
            float r0 = f2344b
            r12 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1489i(r2, r0, r12, r1)
            r1 = 693286680(0x2952b718, float:4.6788176E-14)
            r5.mo5465u(r1)
            androidx.compose.foundation.layout.d$i r1 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.b$b r12 = androidx.compose.p015ui.C1428a.C1429a.f3113i
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.RowKt.m1480a(r1, r12, r5)
            r12 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r12)
            androidx.compose.runtime.l1 r15 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4019e
            java.lang.Object r12 = r5.mo5410J(r15)
            m0.b r12 = (p174m0.C7282b) r12
            androidx.compose.runtime.l1 r14 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4025k
            java.lang.Object r13 = r5.mo5410J(r14)
            androidx.compose.ui.unit.LayoutDirection r13 = (androidx.compose.p015ui.unit.LayoutDirection) r13
            r33 = r2
            androidx.compose.runtime.l1 r2 = androidx.compose.p015ui.platform.CompositionLocalsKt.f4029o
            java.lang.Object r16 = r5.mo5410J(r2)
            r4 = r16
            androidx.compose.ui.platform.j1 r4 = (androidx.compose.p015ui.platform.C1843j1) r4
            androidx.compose.ui.node.ComposeUiNode$Companion r16 = androidx.compose.p015ui.node.ComposeUiNode.f3776c0
            r16.getClass()
            kq.a<androidx.compose.ui.node.ComposeUiNode> r11 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3778b
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r0)
            r39 = r14
            androidx.compose.runtime.c<?> r14 = r5.f2715a
            boolean r14 = r14 instanceof androidx.compose.runtime.C1299c
            r18 = 0
            if (r14 == 0) goto L_0x02f6
            r5.mo5392A()
            boolean r14 = r5.f2702K
            if (r14 == 0) goto L_0x0144
            r5.mo5450m(r11)
            goto L_0x0147
        L_0x0144:
            r5.mo5452n()
        L_0x0147:
            r14 = 0
            r5.f2738x = r14
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r14 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r5, r1, r14)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r5, r12, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r12 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r5, r13, r12)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r13 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r4 = p504ai.C13983i.m21490i(r5, r4, r13, r5)
            r16 = 0
            r17 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r19 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r20 = r12
            r12 = r16
            r23 = r13
            r13 = r0
            r0 = r39
            r21 = r14
            r14 = r4
            r4 = r15
            r15 = r5
            r16 = r17
            r17 = r19
            androidx.appcompat.widget.C0326j.m868m(r12, r13, r14, r15, r16, r17)
            r12 = 1483377809(0x586a8c91, float:1.0315578E15)
            r5.mo5465u(r12)
            r12 = -280382992(0xffffffffef49b1f0, float:-6.24216E28)
            r5.mo5465u(r12)
            if (r6 == 0) goto L_0x022c
            float r25 = f2346d
            float r12 = f2345c
            float r28 = r25 + r12
            androidx.compose.ui.d$a r26 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r29 = 0
            r30 = 0
            r31 = 12
            r27 = r28
            androidx.compose.ui.d r24 = androidx.compose.foundation.layout.SizeKt.m1494n(r26, r27, r28, r29, r30, r31)
            float r28 = f2347e
            r27 = 0
            r29 = 4
            r26 = r28
            androidx.compose.ui.d r12 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.b r13 = androidx.compose.p015ui.C1428a.C1429a.f3107c
            r14 = 733328855(0x2bb5b5d7, float:1.2911294E-12)
            r5.mo5465u(r14)
            r14 = 0
            androidx.compose.ui.layout.v r13 = androidx.compose.foundation.layout.BoxKt.m1457c(r13, r14, r5)
            r14 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r5.mo5465u(r14)
            java.lang.Object r4 = r5.mo5410J(r4)
            r16 = r4
            m0.b r16 = (p174m0.C7282b) r16
            java.lang.Object r0 = r5.mo5410J(r0)
            r19 = r0
            androidx.compose.ui.unit.LayoutDirection r19 = (androidx.compose.p015ui.unit.LayoutDirection) r19
            java.lang.Object r0 = r5.mo5410J(r2)
            r22 = r0
            androidx.compose.ui.platform.j1 r22 = (androidx.compose.p015ui.platform.C1843j1) r22
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = androidx.compose.p015ui.layout.C1700o.m3617a(r12)
            androidx.compose.runtime.c<?> r2 = r5.f2715a
            boolean r2 = r2 instanceof androidx.compose.runtime.C1299c
            if (r2 == 0) goto L_0x0228
            r5.mo5392A()
            boolean r2 = r5.f2702K
            if (r2 == 0) goto L_0x01ea
            r5.mo5450m(r11)
            goto L_0x01ed
        L_0x01ea:
            r5.mo5452n()
        L_0x01ed:
            r2 = 0
            r5.f2738x = r2
            r12 = r5
            r14 = r21
            r15 = r5
            r17 = r1
            r18 = r5
            r21 = r5
            r24 = r5
            androidx.compose.runtime.a1 r14 = p003a2.C0023f.m106g(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r16 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r17 = -2137368960(0xffffffff809a5680, float:-1.4173697E-38)
            r12 = r2
            r13 = r0
            androidx.appcompat.widget.C0326j.m868m(r12, r13, r14, r15, r16, r17)
            r0 = 2007028978(0x77a0d4f2, float:6.5241136E33)
            r5.mo5465u(r0)
            int r0 = r3 >> 3
            r0 = r0 & 14
            r11 = 0
            r1 = r34
            r19 = r33
            r2 = r5
            r15 = r3
            r3 = r11
            r4 = r11
            r14 = r5
            r5 = r11
            androidx.compose.animation.C0472h.m1247j(r0, r1, r2, r3, r4, r5)
            r0 = 1
            android.support.p013v4.media.C0071c.m194f(r14, r0, r11, r11)
            goto L_0x0231
        L_0x0228:
            p001a0.C0005b.m45j0()
            throw r18
        L_0x022c:
            r19 = r33
            r15 = r3
            r14 = r5
            r11 = 0
        L_0x0231:
            r14.mo5418R(r11)
            r0 = 3
            m0.d[] r0 = new p174m0.C7284d[r0]
            float r1 = f2350h
            m0.d r2 = new m0.d
            r2.<init>(r1)
            r0[r11] = r2
            float r2 = f2351i
            m0.d r3 = new m0.d
            r3.<init>(r2)
            r2 = 1
            r0[r2] = r3
            float r2 = f2352j
            m0.d r3 = new m0.d
            r3.<init>(r2)
            r2 = 2
            r0[r2] = r3
            java.util.List r12 = p568fn.C17782b.m29865e0(r0)
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r2 = 1065353216(0x3f800000, float:1.0)
            double r3 = (double) r2
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0265
            r3 = 1
            goto L_0x0266
        L_0x0265:
            r3 = 0
        L_0x0266:
            if (r3 == 0) goto L_0x02ea
            androidx.compose.foundation.layout.s r3 = new androidx.compose.foundation.layout.s
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r4 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r4 = 1
            r3.<init>(r2, r4)
            r0.mo6148i0(r3)
            float r21 = f2348f
            r22 = 0
            float r23 = f2349g
            r24 = 0
            r25 = 10
            r20 = r3
            androidx.compose.ui.d r13 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r20, r21, r22, r23, r24, r25)
            r2 = -318094245(0xffffffffed0a445b, float:-2.674473E27)
            androidx.compose.material.ThreeLine$ListItem$1$2 r3 = new androidx.compose.material.ThreeLine$ListItem$1$2
            r3.<init>(r9, r15, r7, r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r2 = p628nj.C18263b.m30805A(r14, r2, r3)
            r16 = 384(0x180, float:5.38E-43)
            r17 = 0
            r11 = r14
            r14 = r2
            r3 = r15
            r15 = r11
            androidx.compose.material.C1270y0.m2406a(r12, r13, r14, r15, r16, r17)
            if (r10 == 0) goto L_0x02bd
            float r22 = f2353k
            float r1 = r1 - r22
            r21 = 0
            float r23 = f2354l
            r24 = 0
            r25 = 9
            r20 = r0
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25287J0(r20, r21, r22, r23, r24, r25)
            int r0 = r3 >> 9
            r0 = r0 & 896(0x380, float:1.256E-42)
            r4 = r0 | 54
            r5 = 0
            r0 = r1
            r1 = r2
            r2 = r38
            r3 = r11
            androidx.compose.material.C1270y0.m2407b(r0, r1, r2, r3, r4, r5)
        L_0x02bd:
            r0 = 0
            r1 = 1
            android.support.p013v4.media.session.C0087d.m238h(r11, r0, r0, r0, r1)
            r11.mo5418R(r0)
            r11.mo5418R(r0)
            r2 = r19
        L_0x02ca:
            androidx.compose.runtime.v0 r11 = r11.mo5421U()
            if (r11 != 0) goto L_0x02d1
            goto L_0x02e9
        L_0x02d1:
            androidx.compose.material.ThreeLine$ListItem$2 r12 = new androidx.compose.material.ThreeLine$ListItem$2
            r0 = r12
            r1 = r32
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r7 = r38
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.f3081d = r12
        L_0x02e9:
            return
        L_0x02ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid weight 1.0; must be greater than zero"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x02f6:
            p001a0.C0005b.m45j0()
            throw r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ThreeLine.mo5211a(androidx.compose.ui.d, kq.p, kq.p, kq.p, kq.p, kq.p, androidx.compose.runtime.d, int, int):void");
    }
}
