package androidx.compose.material;

public final class MenuKt {

    /* renamed from: a */
    public static final float f2219a;

    /* renamed from: b */
    public static final float f2220b;

    /* renamed from: c */
    public static final float f2221c = ((float) 16);

    /* renamed from: d */
    public static final float f2222d;

    /* renamed from: e */
    public static final float f2223e = ((float) 112);

    /* renamed from: f */
    public static final float f2224f = ((float) 280);

    /* renamed from: g */
    public static final float f2225g;

    static {
        float f = (float) 8;
        f2219a = f;
        float f2 = (float) 48;
        f2220b = f2;
        f2222d = f;
        f2225g = f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2191a(androidx.compose.animation.core.C0418c0<java.lang.Boolean> r19, androidx.compose.runtime.C1338j0<androidx.compose.p015ui.graphics.C1540p0> r20, androidx.compose.p015ui.C1436d r21, p753kq.C19862q<? super androidx.compose.foundation.layout.C0739i, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r22, androidx.compose.runtime.C1302d r23, int r24, int r25) {
        /*
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            java.lang.String r0 = "expandedStates"
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.lang.String r0 = "transformOriginState"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            r0 = 1164283597(0x45658ecd, float:3672.925)
            r3 = r23
            androidx.compose.runtime.ComposerImpl r0 = r3.mo5440h(r0)
            r3 = r25 & 1
            if (r3 == 0) goto L_0x0027
            r3 = r5 | 6
            goto L_0x0037
        L_0x0027:
            r3 = r5 & 14
            if (r3 != 0) goto L_0x0036
            boolean r3 = r0.mo5408I(r1)
            if (r3 == 0) goto L_0x0033
            r3 = 4
            goto L_0x0034
        L_0x0033:
            r3 = 2
        L_0x0034:
            r3 = r3 | r5
            goto L_0x0037
        L_0x0036:
            r3 = r5
        L_0x0037:
            r6 = r25 & 2
            if (r6 == 0) goto L_0x003e
            r3 = r3 | 48
            goto L_0x004e
        L_0x003e:
            r6 = r5 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004e
            boolean r6 = r0.mo5408I(r2)
            if (r6 == 0) goto L_0x004b
            r6 = 32
            goto L_0x004d
        L_0x004b:
            r6 = 16
        L_0x004d:
            r3 = r3 | r6
        L_0x004e:
            r6 = r25 & 4
            if (r6 == 0) goto L_0x0055
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0068
            r7 = r21
            boolean r8 = r0.mo5408I(r7)
            if (r8 == 0) goto L_0x0064
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r8
            goto L_0x006a
        L_0x0068:
            r7 = r21
        L_0x006a:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x0071
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            goto L_0x0081
        L_0x0071:
            r8 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r8 != 0) goto L_0x0081
            boolean r8 = r0.mo5408I(r4)
            if (r8 == 0) goto L_0x007e
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r3 = r3 | r8
        L_0x0081:
            r8 = r3 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0094
            boolean r8 = r0.mo5442i()
            if (r8 != 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            r0.mo5396C()
            r3 = r7
            goto L_0x01e1
        L_0x0094:
            if (r6 == 0) goto L_0x009a
            androidx.compose.ui.d$a r6 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r15 = r6
            goto L_0x009b
        L_0x009a:
            r15 = r7
        L_0x009b:
            java.lang.String r6 = "DropDownMenu"
            androidx.compose.animation.core.Transition r13 = androidx.compose.animation.core.TransitionKt.m1102d(r1, r6, r0)
            androidx.compose.material.MenuKt$DropdownMenuContent$scale$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$scale$2.INSTANCE
            r14 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.mo5465u(r14)
            androidx.compose.animation.core.l0 r16 = androidx.compose.animation.core.VectorConvertersKt.f1076a
            r12 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r12)
            java.lang.Object r7 = r13.mo3410b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1958825495(0xffffffff8b3eb1e9, float:-3.6726514E-32)
            r0.mo5465u(r8)
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            r17 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x00cb
            r7 = r17
            goto L_0x00cc
        L_0x00cb:
            r7 = r9
        L_0x00cc:
            r11 = 0
            r0.mo5418R(r11)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r10 = r13.mo3412d()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0.mo5465u(r8)
            if (r10 == 0) goto L_0x00e5
            r9 = r17
        L_0x00e5:
            r0.mo5418R(r11)
            java.lang.Float r8 = java.lang.Float.valueOf(r9)
            androidx.compose.animation.core.Transition$b r9 = r13.mo3411c()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.lang.Object r6 = r6.invoke(r9, r0, r10)
            r9 = r6
            androidx.compose.animation.core.t r9 = (androidx.compose.animation.core.C0454t) r9
            java.lang.String r18 = "FloatAnimation"
            r6 = r13
            r10 = r16
            r14 = r11
            r11 = r18
            r12 = r0
            androidx.compose.animation.core.Transition$d r12 = androidx.compose.animation.core.TransitionKt.m1101c(r6, r7, r8, r9, r10, r11, r12)
            r0.mo5418R(r14)
            r0.mo5418R(r14)
            androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2 r6 = androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2.INSTANCE
            r7 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.mo5465u(r7)
            r7 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r7)
            java.lang.Object r7 = r13.mo3410b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = -1541356035(0xffffffffa420c5fd, float:-3.4862172E-17)
            r0.mo5465u(r8)
            r9 = 0
            if (r7 == 0) goto L_0x0132
            r7 = r17
            goto L_0x0133
        L_0x0132:
            r7 = r9
        L_0x0133:
            r0.mo5418R(r14)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r10 = r13.mo3412d()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0.mo5465u(r8)
            if (r10 == 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r17 = r9
        L_0x014c:
            r0.mo5418R(r14)
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            androidx.compose.animation.core.Transition$b r9 = r13.mo3411c()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            java.lang.Object r6 = r6.invoke(r9, r0, r10)
            r9 = r6
            androidx.compose.animation.core.t r9 = (androidx.compose.animation.core.C0454t) r9
            java.lang.String r11 = "FloatAnimation"
            r6 = r13
            r10 = r16
            r13 = r12
            r12 = r0
            androidx.compose.animation.core.Transition$d r6 = androidx.compose.animation.core.TransitionKt.m1101c(r6, r7, r8, r9, r10, r11, r12)
            r0.mo5418R(r14)
            r0.mo5418R(r14)
            androidx.compose.ui.d$a r7 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r8 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo5465u(r8)
            boolean r8 = r0.mo5408I(r13)
            boolean r9 = r0.mo5408I(r6)
            r8 = r8 | r9
            boolean r9 = r0.mo5408I(r2)
            r8 = r8 | r9
            java.lang.Object r9 = r0.mo5431c0()
            if (r8 != 0) goto L_0x0193
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r9 != r8) goto L_0x019b
        L_0x0193:
            androidx.compose.material.MenuKt$DropdownMenuContent$1$1 r9 = new androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            r9.<init>(r2, r13, r6)
            r0.mo5407H0(r9)
        L_0x019b:
            r0.mo5418R(r14)
            kq.l r9 = (p753kq.C19857l) r9
            androidx.compose.ui.d r6 = kotlin.jvm.internal.C19388s.m32868j0(r7, r9)
            float r13 = f2219a
            r7 = -242468534(0xfffffffff18c394a, float:-1.3887091E30)
            androidx.compose.material.MenuKt$DropdownMenuContent$2 r8 = new androidx.compose.material.MenuKt$DropdownMenuContent$2
            r8.<init>(r15, r4, r3)
            androidx.compose.runtime.internal.ComposableLambdaImpl r3 = p628nj.C18263b.m30805A(r0, r7, r8)
            r7 = 1956755640(0x74a1b8b8, float:1.0250321E32)
            r0.mo5465u(r7)
            androidx.compose.runtime.l1 r7 = androidx.compose.material.ShapesKt.f2252a
            java.lang.Object r7 = r0.mo5410J(r7)
            androidx.compose.material.q1 r7 = (androidx.compose.material.C1225q1) r7
            p.a r7 = r7.f2548b
            androidx.compose.runtime.l1 r8 = androidx.compose.material.ColorsKt.f2187a
            java.lang.Object r8 = r0.mo5410J(r8)
            androidx.compose.material.v r8 = (androidx.compose.material.C1259v) r8
            long r8 = r8.mo5363j()
            long r10 = androidx.compose.material.ColorsKt.m2174b(r8, r0)
            r12 = 0
            r16 = 1769472(0x1b0000, float:2.479558E-39)
            r17 = 0
            r14 = r3
            r3 = r15
            r15 = r0
            androidx.compose.material.SurfaceKt.m2234a(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17)
            r6 = 0
            r0.mo5418R(r6)
        L_0x01e1:
            androidx.compose.runtime.v0 r7 = r0.mo5421U()
            if (r7 != 0) goto L_0x01e8
            goto L_0x01fa
        L_0x01e8:
            androidx.compose.material.MenuKt$DropdownMenuContent$3 r8 = new androidx.compose.material.MenuKt$DropdownMenuContent$3
            r0 = r8
            r1 = r19
            r2 = r20
            r4 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3081d = r8
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m2191a(androidx.compose.animation.core.c0, androidx.compose.runtime.j0, androidx.compose.ui.d, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2192b(p753kq.C19846a<kotlin.C19394m> r18, androidx.compose.p015ui.C1436d r19, boolean r20, androidx.compose.foundation.layout.C0759v r21, androidx.compose.foundation.interaction.C0640j r22, p753kq.C19862q<? super androidx.compose.foundation.layout.C0763z, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r23, androidx.compose.runtime.C1302d r24, int r25, int r26) {
        /*
            r8 = r18
            r9 = r23
            r10 = r25
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            r0 = 87134531(0x5319143, float:8.3491804E-36)
            r1 = r24
            androidx.compose.runtime.ComposerImpl r11 = r1.mo5440h(r0)
            r0 = r26 & 1
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
            r1 = r26 & 2
            if (r1 == 0) goto L_0x0037
            r0 = r0 | 48
            goto L_0x004a
        L_0x0037:
            r2 = r10 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004a
            r2 = r19
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
            r2 = r19
        L_0x004c:
            r3 = r26 & 4
            if (r3 == 0) goto L_0x0053
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0053:
            r4 = r10 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0066
            r4 = r20
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
            r4 = r20
        L_0x0068:
            r5 = r26 & 8
            if (r5 == 0) goto L_0x006f
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x006f:
            r6 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x0082
            r6 = r21
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
            r6 = r21
        L_0x0084:
            r7 = r26 & 16
            if (r7 == 0) goto L_0x008b
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a0
        L_0x008b:
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r10
            if (r12 != 0) goto L_0x00a0
            r12 = r22
            boolean r13 = r11.mo5408I(r12)
            if (r13 == 0) goto L_0x009c
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009e
        L_0x009c:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009e:
            r0 = r0 | r13
            goto L_0x00a2
        L_0x00a0:
            r12 = r22
        L_0x00a2:
            r13 = r26 & 32
            if (r13 == 0) goto L_0x00a9
            r13 = 196608(0x30000, float:2.75506E-40)
            goto L_0x00b9
        L_0x00a9:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r13 & r10
            if (r13 != 0) goto L_0x00ba
            boolean r13 = r11.mo5408I(r9)
            if (r13 == 0) goto L_0x00b7
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b9
        L_0x00b7:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b9:
            r0 = r0 | r13
        L_0x00ba:
            r13 = r0
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r0 = r0 & r13
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r0 != r14) goto L_0x00d3
            boolean r0 = r11.mo5442i()
            if (r0 != 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            r11.mo5396C()
            r3 = r4
            r4 = r6
            r5 = r12
            goto L_0x01ec
        L_0x00d3:
            if (r1 == 0) goto L_0x00d9
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r14 = r0
            goto L_0x00da
        L_0x00d9:
            r14 = r2
        L_0x00da:
            if (r3 == 0) goto L_0x00df
            r0 = 1
            r15 = r0
            goto L_0x00e0
        L_0x00df:
            r15 = r4
        L_0x00e0:
            if (r5 == 0) goto L_0x00e5
            androidx.compose.foundation.layout.w r0 = androidx.compose.material.C1165a1.f2376a
            goto L_0x00e6
        L_0x00e5:
            r0 = r6
        L_0x00e6:
            r1 = 0
            if (r7 == 0) goto L_0x0102
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo5465u(r2)
            java.lang.Object r2 = r11.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x00fb
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r11)
        L_0x00fb:
            r11.mo5418R(r1)
            r1 = r2
            androidx.compose.foundation.interaction.j r1 = (androidx.compose.foundation.interaction.C0640j) r1
            r12 = r1
        L_0x0102:
            r1 = 1
            r2 = 0
            r3 = 0
            r6 = 6
            r7 = 6
            r5 = r11
            androidx.compose.material.ripple.c r2 = androidx.compose.material.ripple.C1244j.m2369a(r1, r2, r3, r5, r6, r7)
            r4 = 0
            r5 = 0
            r7 = 24
            r6 = r0
            r0 = r14
            r1 = r12
            r3 = r15
            r16 = r6
            r6 = r18
            androidx.compose.ui.d r0 = androidx.compose.foundation.ClickableKt.m1297c(r0, r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.SizeKt.m1487g(r0)
            float r2 = f2223e
            float r4 = f2224f
            float r3 = f2225g
            r5 = 0
            r6 = 8
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.SizeKt.m1494n(r1, r2, r3, r4, r5, r6)
            r7 = r16
            androidx.compose.ui.d r0 = com.google.android.play.core.assetpacks.C15588c1.m25277E0(r0, r7)
            androidx.compose.ui.b$b r1 = androidx.compose.p015ui.C1428a.C1429a.f3114j
            r2 = 693286680(0x2952b718, float:4.6788176E-14)
            r11.mo5465u(r2)
            androidx.compose.foundation.layout.d$i r2 = androidx.compose.foundation.layout.C0718d.f1476a
            androidx.compose.ui.layout.v r1 = androidx.compose.foundation.layout.RowKt.m1480a(r2, r1, r11)
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
            if (r6 == 0) goto L_0x0204
            r11.mo5392A()
            boolean r6 = r11.f2702K
            if (r6 == 0) goto L_0x017c
            r11.mo5450m(r5)
            goto L_0x017f
        L_0x017c:
            r11.mo5452n()
        L_0x017f:
            r5 = 0
            r11.f2738x = r5
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.v, kotlin.m> r5 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3781e
            androidx.compose.runtime.Updater.m2571b(r11, r1, r5)
            kq.p<androidx.compose.ui.node.ComposeUiNode, m0.b, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3780d
            androidx.compose.runtime.Updater.m2571b(r11, r2, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.unit.LayoutDirection, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3782f
            androidx.compose.runtime.Updater.m2571b(r11, r3, r1)
            kq.p<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.platform.j1, kotlin.m> r1 = androidx.compose.p015ui.node.ComposeUiNode.Companion.f3783g
            androidx.compose.runtime.a1 r3 = p504ai.C13983i.m21490i(r11, r4, r1, r11)
            r1 = 0
            r5 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r6 = -678309503(0xffffffffd791d181, float:-3.20657997E14)
            r2 = r0
            r4 = r11
            androidx.appcompat.widget.C0326j.m868m(r1, r2, r3, r4, r5, r6)
            androidx.compose.foundation.layout.a0 r3 = androidx.compose.foundation.layout.C0708a0.f1463a
            r0 = 1664959143(0x633d42a7, float:3.4912374E21)
            r11.mo5465u(r0)
            r4 = 6
            androidx.compose.runtime.l1 r0 = androidx.compose.material.TypographyKt.f2371a
            java.lang.Object r0 = r11.mo5410J(r0)
            androidx.compose.material.d2 r0 = (androidx.compose.material.C1178d2) r0
            androidx.compose.ui.text.s r6 = r0.f2408g
            r5 = 1190489496(0x46f56d98, float:31414.797)
            androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1 r2 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$2$1
            r0 = r2
            r1 = r15
            r17 = r2
            r2 = r23
            r16 = r7
            r7 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r17
            androidx.compose.runtime.internal.ComposableLambdaImpl r0 = p628nj.C18263b.m30805A(r11, r7, r0)
            r1 = 48
            androidx.compose.material.TextKt.m2282a(r6, r0, r11, r1)
            r0 = 0
            r11.mo5418R(r0)
            r11.mo5418R(r0)
            r11.mo5418R(r0)
            r1 = 1
            r11.mo5418R(r1)
            r11.mo5418R(r0)
            r11.mo5418R(r0)
            r5 = r12
            r2 = r14
            r3 = r15
            r4 = r16
        L_0x01ec:
            androidx.compose.runtime.v0 r11 = r11.mo5421U()
            if (r11 != 0) goto L_0x01f3
            goto L_0x0203
        L_0x01f3:
            androidx.compose.material.MenuKt$DropdownMenuItemContent$3 r12 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$3
            r0 = r12
            r1 = r18
            r6 = r23
            r7 = r25
            r8 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r11.f3081d = r12
        L_0x0203:
            return
        L_0x0204:
            p001a0.C0005b.m45j0()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m2192b(kq.a, androidx.compose.ui.d, boolean, androidx.compose.foundation.layout.v, androidx.compose.foundation.interaction.j, kq.q, androidx.compose.runtime.d, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m2193c(p174m0.C7289h r6, p174m0.C7289h r7) {
        /*
            java.lang.String r0 = "parentBounds"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            java.lang.String r0 = "menuBounds"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            int r0 = r7.f16167a
            int r1 = r6.f16169c
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x0015
        L_0x0013:
            r1 = r3
            goto L_0x0039
        L_0x0015:
            int r1 = r7.f16169c
            int r4 = r6.f16167a
            if (r1 > r4) goto L_0x001d
            r1 = r2
            goto L_0x0039
        L_0x001d:
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0021
            goto L_0x0013
        L_0x0021:
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = r6.f16169c
            int r4 = r7.f16169c
            int r1 = java.lang.Math.min(r1, r4)
            int r1 = r1 + r0
            int r1 = r1 / 2
            int r0 = r7.f16167a
            int r1 = r1 - r0
            float r1 = (float) r1
            int r4 = r7.f16169c
            int r4 = r4 - r0
            float r0 = (float) r4
            float r1 = r1 / r0
        L_0x0039:
            int r0 = r7.f16168b
            int r4 = r6.f16170d
            if (r0 < r4) goto L_0x0041
        L_0x003f:
            r2 = r3
            goto L_0x0065
        L_0x0041:
            int r4 = r7.f16170d
            int r5 = r6.f16168b
            if (r4 > r5) goto L_0x0048
            goto L_0x0065
        L_0x0048:
            int r4 = r4 - r0
            if (r4 != 0) goto L_0x004c
            goto L_0x003f
        L_0x004c:
            int r0 = java.lang.Math.max(r5, r0)
            int r6 = r6.f16170d
            int r2 = r7.f16170d
            int r6 = java.lang.Math.min(r6, r2)
            int r6 = r6 + r0
            int r6 = r6 / 2
            int r0 = r7.f16168b
            int r6 = r6 - r0
            float r6 = (float) r6
            int r7 = r7.f16170d
            int r7 = r7 - r0
            float r7 = (float) r7
            float r2 = r6 / r7
        L_0x0065:
            long r6 = p628nj.C18263b.m30840e(r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.m2193c(m0.h, m0.h):long");
    }
}
