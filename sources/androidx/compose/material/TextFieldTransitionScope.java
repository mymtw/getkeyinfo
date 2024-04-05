package androidx.compose.material;

public final class TextFieldTransitionScope {

    /* renamed from: a */
    public static final TextFieldTransitionScope f2340a = new TextFieldTransitionScope();

    /* renamed from: androidx.compose.material.TextFieldTransitionScope$a */
    public /* synthetic */ class C1161a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2341a;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            f2341a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0174, code lost:
        if (r8 != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        if (r8 != false) goto L_0x01a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0234  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5200a(androidx.compose.material.InputPhase r23, long r24, long r26, p753kq.C19862q<? super androidx.compose.material.InputPhase, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, androidx.compose.p015ui.graphics.C1545s> r28, boolean r29, p753kq.C19865t<? super java.lang.Float, ? super androidx.compose.p015ui.graphics.C1545s, ? super androidx.compose.p015ui.graphics.C1545s, ? super java.lang.Float, ? super androidx.compose.runtime.C1302d, ? super java.lang.Integer, kotlin.C19394m> r30, androidx.compose.runtime.C1302d r31, int r32) {
        /*
            r22 = this;
            r2 = r23
            r7 = r28
            r8 = r29
            r5 = r30
            r6 = r32
            java.lang.String r0 = "inputState"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "contentColor"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            r0 = 1988729962(0x76899c6a, float:1.3955413E33)
            r1 = r31
            androidx.compose.runtime.ComposerImpl r0 = r1.mo5440h(r0)
            r1 = r6 & 14
            r3 = 2
            if (r1 != 0) goto L_0x0032
            boolean r1 = r0.mo5408I(r2)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            r1 = r1 | r6
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            r4 = r6 & 112(0x70, float:1.57E-43)
            r14 = r24
            if (r4 != 0) goto L_0x0045
            boolean r4 = r0.mo5434e(r14)
            if (r4 == 0) goto L_0x0042
            r4 = 32
            goto L_0x0044
        L_0x0042:
            r4 = 16
        L_0x0044:
            r1 = r1 | r4
        L_0x0045:
            r4 = r6 & 896(0x380, float:1.256E-42)
            r12 = r26
            if (r4 != 0) goto L_0x0057
            boolean r4 = r0.mo5434e(r12)
            if (r4 == 0) goto L_0x0054
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0056
        L_0x0054:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0056:
            r1 = r1 | r4
        L_0x0057:
            r4 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != 0) goto L_0x0067
            boolean r4 = r0.mo5408I(r7)
            if (r4 == 0) goto L_0x0064
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0066
        L_0x0064:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0066:
            r1 = r1 | r4
        L_0x0067:
            r4 = 57344(0xe000, float:8.0356E-41)
            r9 = r6 & r4
            if (r9 != 0) goto L_0x007a
            boolean r9 = r0.mo5427a(r8)
            if (r9 == 0) goto L_0x0077
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0079
        L_0x0077:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0079:
            r1 = r1 | r9
        L_0x007a:
            r9 = 458752(0x70000, float:6.42848E-40)
            r9 = r9 & r6
            if (r9 != 0) goto L_0x008b
            boolean r9 = r0.mo5408I(r5)
            if (r9 == 0) goto L_0x0088
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x008a
        L_0x0088:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x008a:
            r1 = r1 | r9
        L_0x008b:
            r9 = 374491(0x5b6db, float:5.24774E-40)
            r9 = r9 & r1
            r10 = 74898(0x12492, float:1.04954E-40)
            if (r9 != r10) goto L_0x00a0
            boolean r9 = r0.mo5442i()
            if (r9 != 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            r0.mo5396C()
            goto L_0x0367
        L_0x00a0:
            r9 = r1 & 14
            r9 = r9 | 48
            java.lang.String r10 = "TextFieldInputState"
            r11 = 0
            androidx.compose.animation.core.Transition r16 = androidx.compose.animation.core.TransitionKt.m1103e(r2, r10, r0, r9, r11)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2.INSTANCE
            r10 = 1399891485(0x5370a61d, float:1.03357907E12)
            r0.mo5465u(r10)
            androidx.compose.animation.core.l0 r17 = androidx.compose.animation.core.VectorConvertersKt.f1076a
            r4 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r4)
            java.lang.Object r18 = r16.mo3410b()
            androidx.compose.material.InputPhase r18 = (androidx.compose.material.InputPhase) r18
            r10 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r0.mo5465u(r10)
            int[] r19 = androidx.compose.material.TextFieldTransitionScope.C1161a.f2341a
            int r18 = r18.ordinal()
            r4 = r19[r18]
            r18 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            r11 = 3
            if (r4 == r10) goto L_0x00e5
            if (r4 == r3) goto L_0x00e2
            if (r4 != r11) goto L_0x00dc
            goto L_0x00e5
        L_0x00dc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e2:
            r4 = r18
            goto L_0x00e7
        L_0x00e5:
            r4 = r20
        L_0x00e7:
            r11 = 0
            r0.mo5418R(r11)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r11 = r16.mo3412d()
            androidx.compose.material.InputPhase r11 = (androidx.compose.material.InputPhase) r11
            r3 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r0.mo5465u(r3)
            int r3 = r11.ordinal()
            r3 = r19[r3]
            if (r3 == r10) goto L_0x0114
            r11 = 2
            if (r3 == r11) goto L_0x0110
            r11 = 3
            if (r3 != r11) goto L_0x010a
            goto L_0x0115
        L_0x010a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0110:
            r11 = 3
            r3 = r18
            goto L_0x0117
        L_0x0114:
            r11 = 3
        L_0x0115:
            r3 = r20
        L_0x0117:
            r11 = 0
            r0.mo5418R(r11)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.animation.core.Transition$b r10 = r16.mo3411c()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r9.invoke(r10, r0, r2)
            androidx.compose.animation.core.t r2 = (androidx.compose.animation.core.C0454t) r2
            java.lang.String r21 = "LabelProgress"
            r9 = r16
            r5 = 1399891485(0x5370a61d, float:1.03357907E12)
            r10 = r4
            r4 = r11
            r11 = r3
            r12 = r2
            r13 = r17
            r14 = r21
            r15 = r0
            androidx.compose.animation.core.Transition$d r2 = androidx.compose.animation.core.TransitionKt.m1101c(r9, r10, r11, r12, r13, r14, r15)
            r0.mo5418R(r4)
            r0.mo5418R(r4)
            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 r3 = androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2.INSTANCE
            r0.mo5465u(r5)
            r5 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r5)
            java.lang.Object r5 = r16.mo3410b()
            androidx.compose.material.InputPhase r5 = (androidx.compose.material.InputPhase) r5
            r9 = -1376159017(0xffffffffadf97ad7, float:-2.8362574E-11)
            r0.mo5465u(r9)
            int r5 = r5.ordinal()
            r5 = r19[r5]
            r10 = 1
            if (r5 == r10) goto L_0x0179
            r10 = 2
            if (r5 == r10) goto L_0x0174
            r10 = 3
            if (r5 != r10) goto L_0x016e
            goto L_0x0176
        L_0x016e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0174:
            if (r8 == 0) goto L_0x0179
        L_0x0176:
            r5 = r18
            goto L_0x017b
        L_0x0179:
            r5 = r20
        L_0x017b:
            r0.mo5418R(r4)
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            java.lang.Object r5 = r16.mo3412d()
            androidx.compose.material.InputPhase r5 = (androidx.compose.material.InputPhase) r5
            r0.mo5465u(r9)
            int r5 = r5.ordinal()
            r5 = r19[r5]
            r9 = 1
            if (r5 == r9) goto L_0x01a4
            r9 = 2
            if (r5 == r9) goto L_0x01a1
            r9 = 3
            if (r5 != r9) goto L_0x019b
            goto L_0x01a6
        L_0x019b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01a1:
            if (r8 == 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r18 = r20
        L_0x01a6:
            r0.mo5418R(r4)
            java.lang.Float r11 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$b r5 = r16.mo3411c()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Object r3 = r3.invoke(r5, r0, r9)
            r12 = r3
            androidx.compose.animation.core.t r12 = (androidx.compose.animation.core.C0454t) r12
            java.lang.String r14 = "PlaceholderOpacity"
            r9 = r16
            r13 = r17
            r15 = r0
            androidx.compose.animation.core.Transition$d r3 = androidx.compose.animation.core.TransitionKt.m1101c(r9, r10, r11, r12, r13, r14, r15)
            r0.mo5418R(r4)
            r0.mo5418R(r4)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 r5 = androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2.INSTANCE
            r15 = -1462136984(0xffffffffa8d98f68, float:-2.4154032E-14)
            r0.mo5465u(r15)
            java.lang.Object r9 = r16.mo3412d()
            androidx.compose.material.InputPhase r9 = (androidx.compose.material.InputPhase) r9
            r10 = -1490209928(0xffffffffa72d3378, float:-2.4036474E-15)
            r0.mo5465u(r10)
            int r9 = r9.ordinal()
            r9 = r19[r9]
            r11 = 1
            if (r9 != r11) goto L_0x01ed
            r11 = r24
            goto L_0x01ef
        L_0x01ed:
            r11 = r26
        L_0x01ef:
            r0.mo5418R(r4)
            androidx.compose.ui.graphics.colorspace.c r9 = androidx.compose.p015ui.graphics.C1545s.m3360f(r11)
            r14 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.mo5465u(r14)
            boolean r11 = r0.mo5408I(r9)
            java.lang.Object r12 = r0.mo5431c0()
            if (r11 != 0) goto L_0x020a
            androidx.compose.runtime.d$a$a r11 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r12 != r11) goto L_0x0216
        L_0x020a:
            kq.l<androidx.compose.ui.graphics.colorspace.c, androidx.compose.animation.core.k0<androidx.compose.ui.graphics.s, androidx.compose.animation.core.i>> r11 = androidx.compose.animation.ColorVectorConverterKt.f975a
            java.lang.Object r9 = r11.invoke(r9)
            r12 = r9
            androidx.compose.animation.core.k0 r12 = (androidx.compose.animation.core.C0435k0) r12
            r0.mo5407H0(r12)
        L_0x0216:
            r0.mo5418R(r4)
            r13 = r12
            androidx.compose.animation.core.k0 r13 = (androidx.compose.animation.core.C0435k0) r13
            r9 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r9)
            java.lang.Object r9 = r16.mo3410b()
            androidx.compose.material.InputPhase r9 = (androidx.compose.material.InputPhase) r9
            r0.mo5465u(r10)
            int r9 = r9.ordinal()
            r9 = r19[r9]
            r11 = 1
            if (r9 != r11) goto L_0x0237
            r11 = r24
            goto L_0x0239
        L_0x0237:
            r11 = r26
        L_0x0239:
            r0.mo5418R(r4)
            androidx.compose.ui.graphics.s r9 = new androidx.compose.ui.graphics.s
            r9.<init>(r11)
            java.lang.Object r11 = r16.mo3412d()
            androidx.compose.material.InputPhase r11 = (androidx.compose.material.InputPhase) r11
            r0.mo5465u(r10)
            int r10 = r11.ordinal()
            r10 = r19[r10]
            r11 = 1
            if (r10 != r11) goto L_0x0256
            r10 = r24
            goto L_0x0258
        L_0x0256:
            r10 = r26
        L_0x0258:
            r0.mo5418R(r4)
            androidx.compose.ui.graphics.s r12 = new androidx.compose.ui.graphics.s
            r12.<init>(r10)
            androidx.compose.animation.core.Transition$b r10 = r16.mo3411c()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.invoke(r10, r0, r11)
            androidx.compose.animation.core.t r5 = (androidx.compose.animation.core.C0454t) r5
            java.lang.String r17 = "LabelTextStyleColor"
            r10 = r9
            r9 = r16
            r11 = r12
            r12 = r5
            r5 = r14
            r14 = r17
            r5 = r15
            r15 = r0
            androidx.compose.animation.core.Transition$d r18 = androidx.compose.animation.core.TransitionKt.m1101c(r9, r10, r11, r12, r13, r14, r15)
            r0.mo5418R(r4)
            r0.mo5418R(r4)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 r9 = androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2.INSTANCE
            r10 = r1 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | 384(0x180, float:5.38E-43)
            r0.mo5465u(r5)
            java.lang.Object r5 = r16.mo3412d()
            int r11 = r10 >> 6
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r5 = r7.invoke(r5, r0, r11)
            androidx.compose.ui.graphics.s r5 = (androidx.compose.p015ui.graphics.C1545s) r5
            long r11 = r5.f3366a
            androidx.compose.ui.graphics.colorspace.c r5 = androidx.compose.p015ui.graphics.C1545s.m3360f(r11)
            r11 = -3686930(0xffffffffffc7bdee, float:NaN)
            r0.mo5465u(r11)
            boolean r11 = r0.mo5408I(r5)
            java.lang.Object r12 = r0.mo5431c0()
            if (r11 != 0) goto L_0x02b9
            androidx.compose.runtime.d$a$a r11 = androidx.compose.runtime.C1302d.C1303a.f2828a
            if (r12 != r11) goto L_0x02c5
        L_0x02b9:
            kq.l<androidx.compose.ui.graphics.colorspace.c, androidx.compose.animation.core.k0<androidx.compose.ui.graphics.s, androidx.compose.animation.core.i>> r11 = androidx.compose.animation.ColorVectorConverterKt.f975a
            java.lang.Object r5 = r11.invoke(r5)
            r12 = r5
            androidx.compose.animation.core.k0 r12 = (androidx.compose.animation.core.C0435k0) r12
            r0.mo5407H0(r12)
        L_0x02c5:
            r0.mo5418R(r4)
            r13 = r12
            androidx.compose.animation.core.k0 r13 = (androidx.compose.animation.core.C0435k0) r13
            r5 = r10 & 14
            r5 = r5 | 64
            r11 = 3
            int r10 = r10 << r11
            r11 = r10 & 896(0x380, float:1.256E-42)
            r5 = r5 | r11
            r11 = r10 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r11
            r5 = r5 | r10
            r10 = 1847725064(0x6e220c08, float:1.2537779E28)
            r0.mo5465u(r10)
            java.lang.Object r10 = r16.mo3410b()
            int r11 = r5 >> 9
            r11 = r11 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object r10 = r7.invoke(r10, r0, r12)
            java.lang.Object r12 = r16.mo3412d()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r7.invoke(r12, r0, r11)
            androidx.compose.animation.core.Transition$b r12 = r16.mo3411c()
            r14 = 3
            int r5 = r5 >> r14
            r5 = r5 & 112(0x70, float:1.57E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r9.invoke(r12, r0, r5)
            r12 = r5
            androidx.compose.animation.core.t r12 = (androidx.compose.animation.core.C0454t) r12
            java.lang.String r14 = "LabelContentColor"
            r9 = r16
            r15 = r0
            androidx.compose.animation.core.Transition$d r5 = androidx.compose.animation.core.TransitionKt.m1101c(r9, r10, r11, r12, r13, r14, r15)
            r0.mo5418R(r4)
            r0.mo5418R(r4)
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Float r10 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r18.getValue()
            androidx.compose.ui.graphics.s r2 = (androidx.compose.p015ui.graphics.C1545s) r2
            long r11 = r2.f3366a
            androidx.compose.ui.graphics.s r2 = new androidx.compose.ui.graphics.s
            r2.<init>(r11)
            java.lang.Object r4 = r5.getValue()
            androidx.compose.ui.graphics.s r4 = (androidx.compose.p015ui.graphics.C1545s) r4
            long r4 = r4.f3366a
            androidx.compose.ui.graphics.s r12 = new androidx.compose.ui.graphics.s
            r12.<init>(r4)
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Float r13 = java.lang.Float.valueOf(r3)
            r3 = 3
            int r1 = r1 >> r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r9 = r30
            r11 = r2
            r14 = r0
            r9.invoke(r10, r11, r12, r13, r14, r15)
        L_0x0367:
            androidx.compose.runtime.v0 r11 = r0.mo5421U()
            if (r11 != 0) goto L_0x036e
            goto L_0x0386
        L_0x036e:
            androidx.compose.material.TextFieldTransitionScope$Transition$1 r12 = new androidx.compose.material.TextFieldTransitionScope$Transition$1
            r0 = r12
            r1 = r22
            r2 = r23
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r32
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.f3081d = r12
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.mo5200a(androidx.compose.material.InputPhase, long, long, kq.q, boolean, kq.t, androidx.compose.runtime.d, int):void");
    }
}
