package androidx.compose.material;

import androidx.compose.p015ui.state.ToggleableState;

public final class CheckboxKt {

    /* renamed from: a */
    public static final float f2181a = ((float) 24);

    /* renamed from: b */
    public static final float f2182b;

    /* renamed from: c */
    public static final float f2183c = ((float) 20);

    /* renamed from: d */
    public static final float f2184d;

    /* renamed from: e */
    public static final float f2185e;

    /* renamed from: androidx.compose.material.CheckboxKt$a */
    public /* synthetic */ class C1063a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2186a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            f2186a = iArr;
        }
    }

    static {
        float f = (float) 2;
        f2182b = f;
        f2184d = f;
        f2185e = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v42, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: androidx.compose.material.CheckboxKt$CheckboxImpl$1$1} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e3, code lost:
        if (r7 == androidx.compose.runtime.C1302d.C1303a.f2828a) goto L_0x01e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0151  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2171a(boolean r29, androidx.compose.p015ui.state.ToggleableState r30, androidx.compose.p015ui.C1436d r31, androidx.compose.material.C1226r r32, androidx.compose.runtime.C1302d r33, int r34) {
        /*
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r34
            r0 = -2118895727(0xffffffff81b43791, float:-6.620129E-38)
            r6 = r33
            androidx.compose.runtime.ComposerImpl r0 = r6.mo5440h(r0)
            r6 = r5 & 14
            r14 = 2
            if (r6 != 0) goto L_0x0023
            boolean r6 = r0.mo5427a(r1)
            if (r6 == 0) goto L_0x0020
            r6 = 4
            goto L_0x0021
        L_0x0020:
            r6 = r14
        L_0x0021:
            r6 = r6 | r5
            goto L_0x0024
        L_0x0023:
            r6 = r5
        L_0x0024:
            r7 = r5 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0034
            boolean r7 = r0.mo5408I(r2)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r5 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r0.mo5408I(r3)
            if (r7 == 0) goto L_0x0041
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0054
            boolean r7 = r0.mo5408I(r4)
            if (r7 == 0) goto L_0x0051
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0053
        L_0x0051:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r6 = r6 | r7
        L_0x0054:
            r7 = r6 & 5851(0x16db, float:8.199E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r7 != r8) goto L_0x0066
            boolean r7 = r0.mo5442i()
            if (r7 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r0.mo5396C()
            goto L_0x01f7
        L_0x0066:
            r15 = 3
            int r6 = r6 >> r15
            r6 = r6 & 14
            r7 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.m1103e(r2, r7, r0, r6, r14)
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkDrawFraction$2.INSTANCE
            r12 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.mo5465u(r12)
            androidx.compose.animation.core.l0 r17 = androidx.compose.animation.core.VectorConvertersKt.f1076a
            r11 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r11)
            java.lang.Object r7 = r16.mo3410b()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.p015ui.state.ToggleableState) r7
            r8 = -1798345588(0xffffffff94cf6c8c, float:-2.0944473E-26)
            r0.mo5465u(r8)
            int[] r18 = androidx.compose.material.CheckboxKt.C1063a.f2186a
            int r7 = r7.ordinal()
            r7 = r18[r7]
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            if (r7 == r10) goto L_0x00a8
            if (r7 == r14) goto L_0x00a5
            if (r7 != r15) goto L_0x009f
            goto L_0x00a8
        L_0x009f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00a5:
            r7 = r19
            goto L_0x00aa
        L_0x00a8:
            r7 = r20
        L_0x00aa:
            r9 = 0
            r0.mo5418R(r9)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r21 = r16.mo3412d()
            androidx.compose.ui.state.ToggleableState r21 = (androidx.compose.p015ui.state.ToggleableState) r21
            r0.mo5465u(r8)
            int r8 = r21.ordinal()
            r8 = r18[r8]
            if (r8 == r10) goto L_0x00d1
            if (r8 == r14) goto L_0x00ce
            if (r8 != r15) goto L_0x00c8
            goto L_0x00d1
        L_0x00c8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00ce:
            r8 = r19
            goto L_0x00d3
        L_0x00d1:
            r8 = r20
        L_0x00d3:
            r0.mo5418R(r9)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            androidx.compose.animation.core.Transition$b r10 = r16.mo3411c()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r6 = r6.invoke(r10, r0, r11)
            r10 = r6
            androidx.compose.animation.core.t r10 = (androidx.compose.animation.core.C0454t) r10
            java.lang.String r11 = "FloatAnimation"
            r6 = r16
            r13 = r9
            r9 = r10
            r15 = 1
            r10 = r17
            r14 = 1847725064(0x6e220c08, float:1.2537779E28)
            r15 = r12
            r12 = r0
            androidx.compose.animation.core.Transition$d r27 = androidx.compose.animation.core.TransitionKt.m1101c(r6, r7, r8, r9, r10, r11, r12)
            r0.mo5418R(r13)
            r0.mo5418R(r13)
            androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 r6 = androidx.compose.material.CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE
            r0.mo5465u(r15)
            r0.mo5465u(r14)
            java.lang.Object r7 = r16.mo3410b()
            androidx.compose.ui.state.ToggleableState r7 = (androidx.compose.p015ui.state.ToggleableState) r7
            r8 = -2098942571(0xffffffff82e4ad95, float:-3.360122E-37)
            r0.mo5465u(r8)
            int r7 = r7.ordinal()
            r7 = r18[r7]
            r9 = 1
            if (r7 == r9) goto L_0x012d
            r9 = 2
            if (r7 == r9) goto L_0x012d
            r9 = 3
            if (r7 != r9) goto L_0x0127
            r7 = r20
            goto L_0x012f
        L_0x0127:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x012d:
            r7 = r19
        L_0x012f:
            r0.mo5418R(r13)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            java.lang.Object r9 = r16.mo3412d()
            androidx.compose.ui.state.ToggleableState r9 = (androidx.compose.p015ui.state.ToggleableState) r9
            r0.mo5465u(r8)
            int r8 = r9.ordinal()
            r8 = r18[r8]
            r9 = 1
            if (r8 == r9) goto L_0x0157
            r9 = 2
            if (r8 == r9) goto L_0x0157
            r9 = 3
            if (r8 != r9) goto L_0x0151
            r19 = r20
            goto L_0x0157
        L_0x0151:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0157:
            r0.mo5418R(r13)
            java.lang.Float r8 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$b r9 = r16.mo3411c()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            java.lang.Object r6 = r6.invoke(r9, r0, r10)
            r9 = r6
            androidx.compose.animation.core.t r9 = (androidx.compose.animation.core.C0454t) r9
            java.lang.String r11 = "FloatAnimation"
            r6 = r16
            r10 = r17
            r12 = r0
            androidx.compose.animation.core.Transition$d r28 = androidx.compose.animation.core.TransitionKt.m1101c(r6, r7, r8, r9, r10, r11, r12)
            r0.mo5418R(r13)
            r0.mo5418R(r13)
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo5465u(r6)
            java.lang.Object r6 = r0.mo5431c0()
            androidx.compose.runtime.d$a$a r7 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r6 != r7) goto L_0x0194
            androidx.compose.material.q r6 = new androidx.compose.material.q
            r6.<init>(r13)
            r0.mo5407H0(r6)
        L_0x0194:
            r0.mo5418R(r13)
            r23 = r6
            androidx.compose.material.q r23 = (androidx.compose.material.C1223q) r23
            androidx.compose.animation.core.f r26 = r4.mo5299b(r2, r0)
            androidx.compose.runtime.k1 r24 = r4.mo5298a(r1, r2, r0)
            androidx.compose.runtime.k1 r25 = r4.mo5300c(r1, r2, r0)
            androidx.compose.ui.b r6 = androidx.compose.p015ui.C1428a.C1429a.f3108d
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.SizeKt.m1497q(r3, r6)
            float r7 = f2183c
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.SizeKt.m1490j(r6, r7)
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r13] = r24
            r9 = 1
            r8[r9] = r25
            r9 = 2
            r8[r9] = r26
            r9 = 3
            r8[r9] = r27
            r9 = 4
            r8[r9] = r28
            r9 = 5
            r8[r9] = r23
            r9 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo5465u(r9)
            r9 = r13
            r10 = r9
        L_0x01cf:
            if (r9 >= r7) goto L_0x01db
            r11 = r8[r9]
            boolean r11 = r0.mo5408I(r11)
            r10 = r10 | r11
            int r9 = r9 + 1
            goto L_0x01cf
        L_0x01db:
            java.lang.Object r7 = r0.mo5431c0()
            if (r10 != 0) goto L_0x01e5
            androidx.compose.runtime.d$a$a r8 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r7 != r8) goto L_0x01ef
        L_0x01e5:
            androidx.compose.material.CheckboxKt$CheckboxImpl$1$1 r7 = new androidx.compose.material.CheckboxKt$CheckboxImpl$1$1
            r22 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r0.mo5407H0(r7)
        L_0x01ef:
            r0.mo5418R(r13)
            kq.l r7 = (p753kq.C19857l) r7
            androidx.compose.foundation.CanvasKt.m1294a(r6, r7, r0, r13)
        L_0x01f7:
            androidx.compose.runtime.v0 r6 = r0.mo5421U()
            if (r6 != 0) goto L_0x01fe
            goto L_0x0210
        L_0x01fe:
            androidx.compose.material.CheckboxKt$CheckboxImpl$2 r7 = new androidx.compose.material.CheckboxKt$CheckboxImpl$2
            r0 = r7
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            r5 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f3081d = r7
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.m2171a(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.d, androidx.compose.material.r, androidx.compose.runtime.d, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2172b(androidx.compose.p015ui.state.ToggleableState r20, p753kq.C19846a<kotlin.C19394m> r21, androidx.compose.p015ui.C1436d r22, boolean r23, androidx.compose.foundation.interaction.C0640j r24, androidx.compose.material.C1226r r25, androidx.compose.runtime.C1302d r26, int r27, int r28) {
        /*
            r7 = r20
            r8 = r21
            r9 = r27
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            r0 = 2031255194(0x79127e9a, float:4.7540195E34)
            r1 = r26
            androidx.compose.runtime.ComposerImpl r6 = r1.mo5440h(r0)
            r0 = r28 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r9 | 6
            goto L_0x002b
        L_0x001b:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x002a
            boolean r0 = r6.mo5408I(r7)
            if (r0 == 0) goto L_0x0027
            r0 = 4
            goto L_0x0028
        L_0x0027:
            r0 = 2
        L_0x0028:
            r0 = r0 | r9
            goto L_0x002b
        L_0x002a:
            r0 = r9
        L_0x002b:
            r1 = r28 & 2
            if (r1 == 0) goto L_0x0032
            r0 = r0 | 48
            goto L_0x0042
        L_0x0032:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0042
            boolean r1 = r6.mo5408I(r8)
            if (r1 == 0) goto L_0x003f
            r1 = 32
            goto L_0x0041
        L_0x003f:
            r1 = 16
        L_0x0041:
            r0 = r0 | r1
        L_0x0042:
            r1 = r28 & 4
            if (r1 == 0) goto L_0x0049
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x005c
        L_0x0049:
            r2 = r9 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x005c
            r2 = r22
            boolean r3 = r6.mo5408I(r2)
            if (r3 == 0) goto L_0x0058
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r0 = r0 | r3
            goto L_0x005e
        L_0x005c:
            r2 = r22
        L_0x005e:
            r3 = r28 & 8
            if (r3 == 0) goto L_0x0065
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0065:
            r4 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0078
            r4 = r23
            boolean r5 = r6.mo5427a(r4)
            if (r5 == 0) goto L_0x0074
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r0 = r0 | r5
            goto L_0x007a
        L_0x0078:
            r4 = r23
        L_0x007a:
            r5 = r28 & 16
            if (r5 == 0) goto L_0x0081
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0096
        L_0x0081:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r9
            if (r10 != 0) goto L_0x0096
            r10 = r24
            boolean r11 = r6.mo5408I(r10)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r0 = r0 | r11
            goto L_0x0098
        L_0x0096:
            r10 = r24
        L_0x0098:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r9
            if (r11 != 0) goto L_0x00b2
            r11 = r28 & 32
            if (r11 != 0) goto L_0x00ac
            r11 = r25
            boolean r12 = r6.mo5408I(r11)
            if (r12 == 0) goto L_0x00ae
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b0
        L_0x00ac:
            r11 = r25
        L_0x00ae:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00b0:
            r0 = r0 | r12
            goto L_0x00b4
        L_0x00b2:
            r11 = r25
        L_0x00b4:
            r12 = 374491(0x5b6db, float:5.24774E-40)
            r12 = r12 & r0
            r13 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r13) goto L_0x00cd
            boolean r12 = r6.mo5442i()
            if (r12 != 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            r6.mo5396C()
            r3 = r2
            r14 = r6
            r5 = r10
            r6 = r11
            goto L_0x01a0
        L_0x00cd:
            r6.mo5466u0()
            r12 = r9 & 1
            r13 = -458753(0xfffffffffff8ffff, float:NaN)
            r15 = 0
            r14 = 1
            if (r12 == 0) goto L_0x00f1
            boolean r12 = r6.mo5425Y()
            if (r12 == 0) goto L_0x00e0
            goto L_0x00f1
        L_0x00e0:
            r6.mo5396C()
            r1 = r28 & 32
            if (r1 == 0) goto L_0x00e8
            r0 = r0 & r13
        L_0x00e8:
            r19 = r0
            r5 = r2
        L_0x00eb:
            r17 = r4
            r4 = r10
            r18 = r11
            goto L_0x0122
        L_0x00f1:
            if (r1 == 0) goto L_0x00f6
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            goto L_0x00f7
        L_0x00f6:
            r1 = r2
        L_0x00f7:
            if (r3 == 0) goto L_0x00fa
            r4 = r14
        L_0x00fa:
            if (r5 == 0) goto L_0x0114
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.mo5465u(r2)
            java.lang.Object r2 = r6.mo5431c0()
            androidx.compose.runtime.d$a$a r3 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r2 != r3) goto L_0x010e
            androidx.compose.foundation.interaction.k r2 = android.support.p013v4.media.C0072d.m198e(r6)
        L_0x010e:
            r6.mo5418R(r15)
            androidx.compose.foundation.interaction.j r2 = (androidx.compose.foundation.interaction.C0640j) r2
            r10 = r2
        L_0x0114:
            r2 = r28 & 32
            if (r2 == 0) goto L_0x011e
            androidx.compose.material.y r2 = androidx.compose.material.C1261v1.m2394c(r6)
            r0 = r0 & r13
            r11 = r2
        L_0x011e:
            r19 = r0
            r5 = r1
            goto L_0x00eb
        L_0x0122:
            r6.mo5419S()
            r0 = -1517549514(0xffffffffa58c0836, float:-2.4291693E-16)
            r6.mo5465u(r0)
            if (r8 == 0) goto L_0x0162
            androidx.compose.ui.d$a r3 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            r10 = 0
            float r11 = f2181a
            r12 = 0
            r0 = 54
            r16 = 4
            r1 = r14
            r14 = r6
            r2 = r15
            r15 = r0
            androidx.compose.material.ripple.c r0 = androidx.compose.material.ripple.C1244j.m2369a(r10, r11, r12, r14, r15, r16)
            androidx.compose.ui.semantics.g r10 = new androidx.compose.ui.semantics.g
            r10.<init>(r1)
            java.lang.String r1 = "interactionSource"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r1 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            r1 = r4
            r11 = r2
            r2 = r3
            r12 = r3
            r3 = r10
            r10 = r4
            r4 = r20
            r13 = r5
            r5 = r21
            r6 = r17
            androidx.compose.ui.d r0 = androidx.compose.foundation.selection.C0893a.m1947b(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.ui.d r0 = androidx.compose.p015ui.platform.InspectableValueKt.m3945a(r12, r0)
            goto L_0x0168
        L_0x0162:
            r10 = r4
            r13 = r5
            r14 = r6
            r11 = r15
            androidx.compose.ui.d$a r0 = androidx.compose.p015ui.C1436d.C1437a.f3125b
        L_0x0168:
            r14.mo5418R(r11)
            androidx.compose.ui.d$a r1 = androidx.compose.p015ui.C1436d.C1437a.f3125b
            if (r8 == 0) goto L_0x0173
            androidx.compose.ui.d r1 = androidx.compose.material.TouchTargetKt.m2285a(r1)
        L_0x0173:
            androidx.compose.ui.d r1 = r13.mo6148i0(r1)
            androidx.compose.ui.d r0 = r1.mo6148i0(r0)
            float r1 = f2182b
            androidx.compose.ui.d r2 = com.google.android.play.core.assetpacks.C15588c1.m25279F0(r0, r1)
            int r0 = r19 >> 9
            r0 = r0 & 14
            int r1 = r19 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r19 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r5 = r0 | r1
            r0 = r17
            r1 = r20
            r3 = r18
            r4 = r14
            m2171a(r0, r1, r2, r3, r4, r5)
            r5 = r10
            r3 = r13
            r4 = r17
            r6 = r18
        L_0x01a0:
            androidx.compose.runtime.v0 r10 = r14.mo5421U()
            if (r10 != 0) goto L_0x01a7
            goto L_0x01b7
        L_0x01a7:
            androidx.compose.material.CheckboxKt$TriStateCheckbox$2 r11 = new androidx.compose.material.CheckboxKt$TriStateCheckbox$2
            r0 = r11
            r1 = r20
            r2 = r21
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.f3081d = r11
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.CheckboxKt.m2172b(androidx.compose.ui.state.ToggleableState, kq.a, androidx.compose.ui.d, boolean, androidx.compose.foundation.interaction.j, androidx.compose.material.r, androidx.compose.runtime.d, int, int):void");
    }
}
