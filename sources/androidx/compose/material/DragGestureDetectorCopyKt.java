package androidx.compose.material;

public final class DragGestureDetectorCopyKt {

    /* renamed from: a */
    public static final float f2202a = (((float) 0.125d) / ((float) 18));

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0112 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m2177a(androidx.compose.p015ui.input.pointer.C1631c r18, long r19, int r21, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1644p, ? super java.lang.Float, kotlin.C19394m> r22, kotlin.coroutines.C19340c<? super androidx.compose.p015ui.input.pointer.C1644p> r23) {
        /*
            r0 = r19
            r2 = r23
            boolean r3 = r2 instanceof androidx.compose.material.C1070x2966ccbb
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.material.C1070x2966ccbb) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r7 = 2
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x006b
            if (r5 == r10) goto L_0x004c
            if (r5 != r7) goto L_0x0044
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$3
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5
            java.lang.Object r11 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r11 = (kotlin.jvm.internal.Ref$LongRef) r11
            java.lang.Object r12 = r3.L$1
            androidx.compose.ui.input.pointer.c r12 = (androidx.compose.p015ui.input.pointer.C1631c) r12
            java.lang.Object r13 = r3.L$0
            kq.p r13 = (p753kq.C19861p) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            goto L_0x018e
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref$LongRef) r5
            java.lang.Object r11 = r3.L$1
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p015ui.input.pointer.C1631c) r11
            java.lang.Object r12 = r3.L$0
            kq.p r12 = (p753kq.C19861p) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            r17 = r3
            r3 = r0
            r0 = r11
            r11 = r4
            r4 = r1
            r1 = r12
            r12 = r5
            r5 = r17
            goto L_0x00eb
        L_0x006b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r2)
            androidx.compose.ui.input.pointer.l r2 = r18.mo6569g0()
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r5 = r2.size()
            r11 = 0
        L_0x0079:
            if (r11 >= r5) goto L_0x008e
            java.lang.Object r12 = r2.get(r11)
            r13 = r12
            androidx.compose.ui.input.pointer.p r13 = (androidx.compose.p015ui.input.pointer.C1644p) r13
            long r13 = r13.f3656a
            boolean r13 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r13, r0)
            if (r13 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            int r11 = r11 + 1
            goto L_0x0079
        L_0x008e:
            r12 = r9
        L_0x008f:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            if (r12 == 0) goto L_0x0099
            boolean r2 = r12.f3659d
            if (r2 != r10) goto L_0x0099
            r2 = r10
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            r2 = r2 ^ r10
            if (r2 == 0) goto L_0x009f
            goto L_0x01b4
        L_0x009f:
            androidx.compose.ui.platform.j1 r2 = r18.getViewConfiguration()
            java.lang.String r5 = "$this$pointerSlop"
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            r5 = r21
            if (r5 != r7) goto L_0x00ae
            r5 = r10
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            if (r5 == 0) goto L_0x00b9
            float r2 = r2.mo6773e()
            float r5 = f2202a
            float r2 = r2 * r5
            goto L_0x00bd
        L_0x00b9:
            float r2 = r2.mo6773e()
        L_0x00bd:
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.element = r0
            r0 = r18
            r1 = r22
            r11 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x00cd:
            r4.L$0 = r1
            r4.L$1 = r0
            r4.L$2 = r11
            r4.L$3 = r9
            r4.F$0 = r3
            r4.F$1 = r2
            r4.label = r10
            java.lang.Object r12 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r4)
            if (r12 != r5) goto L_0x00e2
            return r5
        L_0x00e2:
            r17 = r3
            r3 = r2
            r2 = r12
            r12 = r11
            r11 = r5
            r5 = r4
            r4 = r17
        L_0x00eb:
            androidx.compose.ui.input.pointer.l r2 = (androidx.compose.p015ui.input.pointer.C1640l) r2
            java.util.List<androidx.compose.ui.input.pointer.p> r13 = r2.f3651a
            int r14 = r13.size()
            r15 = 0
        L_0x00f4:
            if (r15 >= r14) goto L_0x0112
            java.lang.Object r16 = r13.get(r15)
            r6 = r16
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            long r8 = r6.f3656a
            r18 = r11
            long r10 = r12.element
            boolean r8 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r8, r10)
            if (r8 == 0) goto L_0x010b
            goto L_0x0116
        L_0x010b:
            int r15 = r15 + 1
            r11 = r18
            r9 = 0
            r10 = 1
            goto L_0x00f4
        L_0x0112:
            r18 = r11
            r16 = 0
        L_0x0116:
            kotlin.jvm.internal.C19383o.m32794d(r16)
            r8 = r16
            androidx.compose.ui.input.pointer.p r8 = (androidx.compose.p015ui.input.pointer.C1644p) r8
            boolean r9 = r8.mo6615b()
            if (r9 == 0) goto L_0x0125
            goto L_0x0194
        L_0x0125:
            boolean r9 = com.google.android.play.core.appupdate.C15562d.m25206v(r8)
            if (r9 == 0) goto L_0x0157
            java.util.List<androidx.compose.ui.input.pointer.p> r2 = r2.f3651a
            int r8 = r2.size()
            r9 = 0
        L_0x0132:
            if (r9 >= r8) goto L_0x0143
            java.lang.Object r10 = r2.get(r9)
            r11 = r10
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            boolean r11 = r11.f3659d
            if (r11 == 0) goto L_0x0140
            goto L_0x0144
        L_0x0140:
            int r9 = r9 + 1
            goto L_0x0132
        L_0x0143:
            r10 = 0
        L_0x0144:
            androidx.compose.ui.input.pointer.p r10 = (androidx.compose.p015ui.input.pointer.C1644p) r10
            if (r10 != 0) goto L_0x0149
            goto L_0x0194
        L_0x0149:
            long r8 = r10.f3656a
            r12.element = r8
            r2 = r3
            r3 = r4
            r4 = r5
            r11 = r12
            r9 = 0
            r10 = 1
            r5 = r18
            goto L_0x00cd
        L_0x0157:
            long r9 = r8.f3658c
            long r13 = r8.f3661f
            float r2 = p288y.C8343c.m16642c(r9)
            float r9 = p288y.C8343c.m16642c(r13)
            float r2 = r2 - r9
            float r2 = r2 + r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x019d
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r5.L$0 = r1
            r5.L$1 = r0
            r5.L$2 = r12
            r5.L$3 = r8
            r5.F$0 = r4
            r5.F$1 = r2
            r5.label = r7
            java.lang.Object r3 = r0.mo6568f0(r3, r5)
            r9 = r18
            if (r3 != r9) goto L_0x0186
            return r9
        L_0x0186:
            r13 = r1
            r1 = r4
            r3 = r5
            r5 = r8
            r4 = r9
            r11 = r12
            r12 = r0
            r0 = r2
        L_0x018e:
            boolean r2 = r5.mo6615b()
            if (r2 == 0) goto L_0x0196
        L_0x0194:
            r9 = 0
            goto L_0x01b4
        L_0x0196:
            r2 = r0
            r5 = r4
            r0 = r12
            r4 = r3
            r3 = r1
            r1 = r13
            goto L_0x01ba
        L_0x019d:
            r9 = r18
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r2)
            r1.invoke(r8, r3)
            boolean r2 = r8.mo6615b()
            if (r2 == 0) goto L_0x01b5
            r9 = r8
        L_0x01b4:
            return r9
        L_0x01b5:
            r3 = r4
            r4 = r5
            r5 = r9
            r11 = r12
            r2 = 0
        L_0x01ba:
            r9 = 0
            r10 = 1
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DragGestureDetectorCopyKt.m2177a(androidx.compose.ui.input.pointer.c, long, int, kq.p, kotlin.coroutines.c):java.lang.Object");
    }
}
