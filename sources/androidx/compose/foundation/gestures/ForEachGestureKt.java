package androidx.compose.foundation.gestures;

public final class ForEachGestureKt {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if ((!r8) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r8 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1377a(androidx.compose.p015ui.input.pointer.C1631c r7, kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p015ui.input.pointer.C1631c) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r7, r8)
            androidx.compose.ui.input.pointer.l r8 = r7.mo6569g0()
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r8.f3651a
            int r2 = r8.size()
            r5 = r3
        L_0x0047:
            if (r5 >= r2) goto L_0x0058
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            boolean r6 = r6.f3659d
            if (r6 == 0) goto L_0x0055
            r8 = r4
            goto L_0x0059
        L_0x0055:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x0058:
            r8 = r3
        L_0x0059:
            r8 = r8 ^ r4
            if (r8 != 0) goto L_0x0086
        L_0x005c:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p015ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.mo6568f0(r8, r0)
            if (r8 != r1) goto L_0x0069
            return r1
        L_0x0069:
            androidx.compose.ui.input.pointer.l r8 = (androidx.compose.p015ui.input.pointer.C1640l) r8
            java.util.List<androidx.compose.ui.input.pointer.p> r8 = r8.f3651a
            int r2 = r8.size()
            r5 = r3
        L_0x0072:
            if (r5 >= r2) goto L_0x0083
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.p015ui.input.pointer.C1644p) r6
            boolean r6 = r6.f3659d
            if (r6 == 0) goto L_0x0080
            r8 = r4
            goto L_0x0084
        L_0x0080:
            int r5 = r5 + 1
            goto L_0x0072
        L_0x0083:
            r8 = r3
        L_0x0084:
            if (r8 != 0) goto L_0x005c
        L_0x0086:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.m1377a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[SYNTHETIC, Splitter:B:24:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097 A[Catch:{ CancellationException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0098 A[Catch:{ CancellationException -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1378b(androidx.compose.p015ui.input.pointer.C1652w r9, p753kq.C19861p<? super androidx.compose.p015ui.input.pointer.C1652w, ? super kotlin.coroutines.C19340c<? super kotlin.C19394m>, ? extends java.lang.Object> r10, kotlin.coroutines.C19340c<? super kotlin.C19394m> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x0064
            if (r2 == r4) goto L_0x0054
            if (r2 == r5) goto L_0x0042
            if (r2 != r6) goto L_0x003a
            java.lang.Object r9 = r0.L$2
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r10 = r0.L$1
            kq.p r10 = (p753kq.C19861p) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p015ui.input.pointer.C1652w) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0051
        L_0x003a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0042:
            java.lang.Object r9 = r0.L$2
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r10 = r0.L$1
            kq.p r10 = (p753kq.C19861p) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p015ui.input.pointer.C1652w) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ CancellationException -> 0x009d }
        L_0x0051:
            r11 = r9
            r9 = r2
            goto L_0x006b
        L_0x0054:
            java.lang.Object r9 = r0.L$2
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
            java.lang.Object r10 = r0.L$1
            kq.p r10 = (p753kq.C19861p) r10
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.w r2 = (androidx.compose.p015ui.input.pointer.C1652w) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)     // Catch:{ CancellationException -> 0x009d }
            goto L_0x0082
        L_0x0064:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            kotlin.coroutines.CoroutineContext r11 = r0.getContext()
        L_0x006b:
            boolean r2 = androidx.compose.p015ui.text.input.C1993m.m4355P(r11)
            if (r2 == 0) goto L_0x00c6
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x009f }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x009f }
            r0.L$2 = r11     // Catch:{ CancellationException -> 0x009f }
            r0.label = r4     // Catch:{ CancellationException -> 0x009f }
            java.lang.Object r2 = r10.invoke(r9, r0)     // Catch:{ CancellationException -> 0x009f }
            if (r2 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r2 = r9
            r9 = r11
        L_0x0082:
            r0.L$0 = r2     // Catch:{ CancellationException -> 0x009d }
            r0.L$1 = r10     // Catch:{ CancellationException -> 0x009d }
            r0.L$2 = r9     // Catch:{ CancellationException -> 0x009d }
            r0.label = r5     // Catch:{ CancellationException -> 0x009d }
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r11 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2     // Catch:{ CancellationException -> 0x009d }
            r11.<init>(r3)     // Catch:{ CancellationException -> 0x009d }
            java.lang.Object r11 = r2.mo6563s0(r11, r0)     // Catch:{ CancellationException -> 0x009d }
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ CancellationException -> 0x009d }
            if (r11 != r7) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            kotlin.m r11 = kotlin.C19394m.f43287a     // Catch:{ CancellationException -> 0x009d }
        L_0x009a:
            if (r11 != r1) goto L_0x0051
            return r1
        L_0x009d:
            r11 = move-exception
            goto L_0x00a4
        L_0x009f:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r11
            r11 = r8
        L_0x00a4:
            boolean r7 = androidx.compose.p015ui.text.input.C1993m.m4355P(r9)
            if (r7 == 0) goto L_0x00c5
            r0.L$0 = r2
            r0.L$1 = r10
            r0.L$2 = r9
            r0.label = r6
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 r11 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2
            r11.<init>(r3)
            java.lang.Object r11 = r2.mo6563s0(r11, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r11 != r7) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            kotlin.m r11 = kotlin.C19394m.f43287a
        L_0x00c2:
            if (r11 != r1) goto L_0x0051
            return r1
        L_0x00c5:
            throw r11
        L_0x00c6:
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.m1378b(androidx.compose.ui.input.pointer.w, kq.p, kotlin.coroutines.c):java.lang.Object");
    }
}
