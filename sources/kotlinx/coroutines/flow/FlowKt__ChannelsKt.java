package kotlinx.coroutines.flow;

public final /* synthetic */ class FlowKt__ChannelsKt {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f A[SYNTHETIC, Splitter:B:36:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m33370a(kotlinx.coroutines.flow.C19600e<? super T> r7, kotlinx.coroutines.channels.C19515q<? extends T> r8, boolean r9, kotlin.coroutines.C19340c<? super kotlin.C19394m> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x0040
            if (r2 != r5) goto L_0x0038
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.C19515q) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C19600e) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x0052 }
        L_0x0034:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x005b
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.q r8 = (kotlinx.coroutines.channels.C19515q) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.e r9 = (kotlinx.coroutines.flow.C19600e) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x0052 }
            kotlinx.coroutines.channels.g r10 = (kotlinx.coroutines.channels.C19503g) r10     // Catch:{ all -> 0x0052 }
            java.lang.Object r10 = r10.f43450a     // Catch:{ all -> 0x0052 }
            goto L_0x006d
        L_0x0052:
            r9 = move-exception
            goto L_0x00b3
        L_0x0054:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            boolean r10 = r7 instanceof kotlinx.coroutines.flow.C19593b2
            if (r10 != 0) goto L_0x00bb
        L_0x005b:
            r0.L$0 = r7     // Catch:{ all -> 0x00af }
            r0.L$1 = r8     // Catch:{ all -> 0x00af }
            r0.Z$0 = r9     // Catch:{ all -> 0x00af }
            r0.label = r4     // Catch:{ all -> 0x00af }
            java.lang.Object r10 = r8.mo72146y(r0)     // Catch:{ all -> 0x00af }
            if (r10 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x006d:
            boolean r2 = r10 instanceof kotlinx.coroutines.channels.C19503g.C19504a     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0080
            java.lang.Throwable r9 = kotlinx.coroutines.channels.C19503g.m33187a(r10)     // Catch:{ all -> 0x0052 }
            if (r9 != 0) goto L_0x007f
            if (r7 == 0) goto L_0x007c
            kotlin.jvm.internal.C19388s.m32827J(r8, r3)
        L_0x007c:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        L_0x007f:
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x0080:
            boolean r2 = r10 instanceof kotlinx.coroutines.channels.C19503g.C19505b     // Catch:{ all -> 0x0052 }
            if (r2 != 0) goto L_0x0093
            r0.L$0 = r9     // Catch:{ all -> 0x0052 }
            r0.L$1 = r8     // Catch:{ all -> 0x0052 }
            r0.Z$0 = r7     // Catch:{ all -> 0x0052 }
            r0.label = r5     // Catch:{ all -> 0x0052 }
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch:{ all -> 0x0052 }
            if (r10 != r1) goto L_0x0034
            return r1
        L_0x0093:
            boolean r9 = r10 instanceof kotlinx.coroutines.channels.C19503g.C19504a     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x009f
            r9 = r10
            kotlinx.coroutines.channels.g$a r9 = (kotlinx.coroutines.channels.C19503g.C19504a) r9     // Catch:{ all -> 0x0052 }
            java.lang.Throwable r9 = r9.f43451a     // Catch:{ all -> 0x0052 }
            if (r9 == 0) goto L_0x009f
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x009f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Trying to call 'getOrThrow' on a failed channel result: "
            java.lang.String r10 = kotlin.jvm.internal.C19383o.m32802l(r10, r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0052 }
            r9.<init>(r10)     // Catch:{ all -> 0x0052 }
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x00af:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x00b3:
            throw r9     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r10 = move-exception
            if (r7 == 0) goto L_0x00ba
            kotlin.jvm.internal.C19388s.m32827J(r8, r9)
        L_0x00ba:
            throw r10
        L_0x00bb:
            kotlinx.coroutines.flow.b2 r7 = (kotlinx.coroutines.flow.C19593b2) r7
            r7.getClass()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m33370a(kotlinx.coroutines.flow.e, kotlinx.coroutines.channels.q, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}
