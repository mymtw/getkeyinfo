package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.e0 */
public final /* synthetic */ class C19601e0 {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable m33396a(kotlin.coroutines.C19340c r5, kotlinx.coroutines.flow.C19597d r6, kotlinx.coroutines.flow.C19600e r7) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x002b }
            goto L_0x004d
        L_0x002b:
            r5 = move-exception
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2     // Catch:{ all -> 0x004f }
            r2.<init>(r7, r5)     // Catch:{ all -> 0x004f }
            r0.L$0 = r5     // Catch:{ all -> 0x004f }
            r0.label = r3     // Catch:{ all -> 0x004f }
            java.lang.Object r5 = r6.collect(r2, r0)     // Catch:{ all -> 0x004f }
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r5 = 0
            return r5
        L_0x004f:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x0053:
            T r6 = r6.element
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7 = 0
            if (r6 == 0) goto L_0x0062
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r6, r5)
            if (r1 == 0) goto L_0x0062
            r1 = r3
            goto L_0x0063
        L_0x0062:
            r1 = r7
        L_0x0063:
            if (r1 != 0) goto L_0x009a
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            kotlinx.coroutines.g1$b r1 = kotlinx.coroutines.C19699g1.C19701b.f43635b
            kotlin.coroutines.CoroutineContext$a r0 = r0.get(r1)
            kotlinx.coroutines.g1 r0 = (kotlinx.coroutines.C19699g1) r0
            if (r0 == 0) goto L_0x0089
            boolean r1 = r0.isCancelled()
            if (r1 != 0) goto L_0x007a
            goto L_0x0089
        L_0x007a:
            java.util.concurrent.CancellationException r0 = r0.mo72398h()
            if (r0 == 0) goto L_0x0087
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r5)
            if (r0 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r3 = r7
        L_0x0088:
            r7 = r3
        L_0x0089:
            if (r7 != 0) goto L_0x009a
            if (r6 != 0) goto L_0x008e
            return r5
        L_0x008e:
            boolean r7 = r5 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L_0x0096
            p568fn.C17782b.m29886t(r6, r5)
            throw r6
        L_0x0096:
            p568fn.C17782b.m29886t(r5, r6)
            throw r5
        L_0x009a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19601e0.m33396a(kotlin.coroutines.c, kotlinx.coroutines.flow.d, kotlinx.coroutines.flow.e):java.io.Serializable");
    }
}
