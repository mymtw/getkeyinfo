package androidx.compose.foundation.gestures;

/* renamed from: androidx.compose.foundation.gestures.p */
public final class C0618p {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1434a(androidx.compose.p015ui.input.pointer.C1631c r17, kotlin.coroutines.C19340c r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1
            if (r1 == 0) goto L_0x0015
            r1 = r0
            androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1 r1 = (androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1 r1 = new androidx.compose.foundation.gestures.TransformableKt$awaitTwoDowns$1
            r1.<init>(r0)
        L_0x001a:
            java.lang.Object r0 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r5 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r5) goto L_0x0033
            boolean r3 = r1.Z$0
            java.lang.Object r6 = r1.L$1
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r7 = r1.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p015ui.input.pointer.C1631c) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            r3 = 0
            r6 = r0
            r0 = r17
        L_0x0047:
            r1.L$0 = r0
            r1.L$1 = r6
            r1.Z$0 = r3
            r1.label = r5
            java.lang.Object r7 = r0.mo6568f0(androidx.compose.p015ui.input.pointer.PointerEventPass.Main, r1)
            if (r7 != r2) goto L_0x0057
            goto L_0x00ce
        L_0x0057:
            r16 = r7
            r7 = r0
            r0 = r16
        L_0x005c:
            androidx.compose.ui.input.pointer.l r0 = (androidx.compose.p015ui.input.pointer.C1640l) r0
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            T r9 = r6.element
            if (r9 == 0) goto L_0x0069
            r9 = r5
            goto L_0x006a
        L_0x0069:
            r9 = 0
        L_0x006a:
            r8.element = r9
            java.util.List<androidx.compose.ui.input.pointer.p> r0 = r0.f3651a
            int r9 = r0.size()
            r10 = 0
        L_0x0073:
            if (r10 >= r9) goto L_0x00c3
            java.lang.Object r11 = r0.get(r10)
            androidx.compose.ui.input.pointer.p r11 = (androidx.compose.p015ui.input.pointer.C1644p) r11
            if (r3 == 0) goto L_0x0082
            boolean r12 = com.google.android.play.core.appupdate.C15562d.m25203s(r11)
            goto L_0x0086
        L_0x0082:
            boolean r12 = com.google.android.play.core.appupdate.C15562d.m25204t(r11)
        L_0x0086:
            if (r3 == 0) goto L_0x008d
            boolean r13 = com.google.android.play.core.appupdate.C15562d.m25205u(r11)
            goto L_0x0091
        L_0x008d:
            boolean r13 = com.google.android.play.core.appupdate.C15562d.m25206v(r11)
        L_0x0091:
            if (r13 == 0) goto L_0x00b0
            long r13 = r11.f3656a
            T r15 = r6.element
            if (r15 != 0) goto L_0x009b
            r4 = 0
            goto L_0x00a3
        L_0x009b:
            androidx.compose.ui.input.pointer.o r15 = (androidx.compose.p015ui.input.pointer.C1643o) r15
            long r4 = r15.f3655a
            boolean r4 = androidx.compose.p015ui.input.pointer.C1643o.m3516a(r4, r13)
        L_0x00a3:
            if (r4 == 0) goto L_0x00af
            r4 = 0
            r6.element = r4
            int r4 = r8.element
            r5 = 1
            int r4 = r4 - r5
            r8.element = r4
            goto L_0x00b0
        L_0x00af:
            r5 = 1
        L_0x00b0:
            if (r12 == 0) goto L_0x00c0
            long r11 = r11.f3656a
            androidx.compose.ui.input.pointer.o r4 = new androidx.compose.ui.input.pointer.o
            r4.<init>(r11)
            r6.element = r4
            int r4 = r8.element
            int r4 = r4 + r5
            r8.element = r4
        L_0x00c0:
            int r10 = r10 + 1
            goto L_0x0073
        L_0x00c3:
            int r0 = r8.element
            if (r0 <= r5) goto L_0x00c9
            r0 = r5
            goto L_0x00ca
        L_0x00c9:
            r0 = 0
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            kotlin.m r2 = kotlin.C19394m.f43287a
        L_0x00ce:
            return r2
        L_0x00cf:
            r0 = r7
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0618p.m1434a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1435b(androidx.compose.p015ui.input.pointer.C1652w r22, androidx.compose.runtime.C1342k1 r23, androidx.compose.runtime.C1342k1 r24, kotlin.coroutines.C19340c r25) {
        /*
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r2 = (androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 r2 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$1
            r2.<init>(r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x006b
            if (r4 == r6) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ CancellationException -> 0x00f0 }
            goto L_0x00f0
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            float r0 = r2.F$0
            java.lang.Object r4 = r2.L$7
            kotlin.jvm.internal.Ref$BooleanRef r4 = (kotlin.jvm.internal.Ref$BooleanRef) r4
            java.lang.Object r6 = r2.L$6
            kotlin.jvm.internal.Ref$BooleanRef r6 = (kotlin.jvm.internal.Ref$BooleanRef) r6
            java.lang.Object r8 = r2.L$5
            kotlin.jvm.internal.Ref$LongRef r8 = (kotlin.jvm.internal.Ref$LongRef) r8
            java.lang.Object r9 = r2.L$4
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref$FloatRef) r9
            java.lang.Object r10 = r2.L$3
            kotlin.jvm.internal.Ref$FloatRef r10 = (kotlin.jvm.internal.Ref$FloatRef) r10
            java.lang.Object r11 = r2.L$2
            androidx.compose.runtime.k1 r11 = (androidx.compose.runtime.C1342k1) r11
            java.lang.Object r12 = r2.L$1
            androidx.compose.runtime.k1 r12 = (androidx.compose.runtime.C1342k1) r12
            java.lang.Object r13 = r2.L$0
            androidx.compose.ui.input.pointer.w r13 = (androidx.compose.p015ui.input.pointer.C1652w) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r18 = r0
            r19 = r4
            r1 = r6
            r17 = r8
            r15 = r9
            r16 = r10
            r14 = r11
            r20 = r12
            goto L_0x00c7
        L_0x006b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.element = r1
            kotlin.jvm.internal.Ref$LongRef r8 = new kotlin.jvm.internal.Ref$LongRef
            r8.<init>()
            long r11 = p288y.C8343c.f18295b
            r8.element = r11
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            androidx.compose.ui.platform.j1 r4 = r22.getViewConfiguration()
            float r4 = r4.mo6773e()
            kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef
            r11.<init>()
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$2 r12 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$2
            r12.<init>(r7)
            r2.L$0 = r0
            r13 = r23
            r2.L$1 = r13
            r14 = r24
            r2.L$2 = r14
            r2.L$3 = r10
            r2.L$4 = r9
            r2.L$5 = r8
            r2.L$6 = r1
            r2.L$7 = r11
            r2.F$0 = r4
            r2.label = r6
            java.lang.Object r6 = r0.mo6563s0(r12, r2)
            if (r6 != r3) goto L_0x00bb
            goto L_0x00f2
        L_0x00bb:
            r18 = r4
            r17 = r8
            r15 = r9
            r16 = r10
            r19 = r11
            r20 = r13
            r13 = r0
        L_0x00c7:
            java.lang.Object r0 = r14.getValue()     // Catch:{ CancellationException -> 0x00f0 }
            androidx.compose.foundation.gestures.q r0 = (androidx.compose.foundation.gestures.C0619q) r0     // Catch:{ CancellationException -> 0x00f0 }
            androidx.compose.foundation.MutatePriority r4 = androidx.compose.foundation.MutatePriority.Default     // Catch:{ CancellationException -> 0x00f0 }
            androidx.compose.foundation.gestures.TransformableKt$detectZoom$3 r12 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$3     // Catch:{ CancellationException -> 0x00f0 }
            r21 = 0
            r14 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$0 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$1 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$2 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$3 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$4 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$5 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$6 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.L$7 = r7     // Catch:{ CancellationException -> 0x00f0 }
            r2.label = r5     // Catch:{ CancellationException -> 0x00f0 }
            java.lang.Object r0 = r0.mo3863a()     // Catch:{ CancellationException -> 0x00f0 }
            if (r0 != r3) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            kotlin.m r3 = kotlin.C19394m.f43287a
        L_0x00f2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0618p.m1435b(androidx.compose.ui.input.pointer.w, androidx.compose.runtime.k1, androidx.compose.runtime.k1, kotlin.coroutines.c):java.lang.Object");
    }
}
