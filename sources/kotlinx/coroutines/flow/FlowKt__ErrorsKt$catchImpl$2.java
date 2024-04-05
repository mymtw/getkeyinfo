package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

public final class FlowKt__ErrorsKt$catchImpl$2<T> implements C19600e {

    /* renamed from: b */
    public final /* synthetic */ C19600e<T> f43523b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef<Throwable> f43524c;

    public FlowKt__ErrorsKt$catchImpl$2(C19600e<? super T> eVar, Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.f43523b = eVar;
        this.f43524c = ref$ObjectRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0045
        L_0x002b:
            r6 = move-exception
            goto L_0x004a
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            kotlinx.coroutines.flow.e<T> r6 = r4.f43523b     // Catch:{ all -> 0x0048 }
            r0.L$0 = r4     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x0048:
            r6 = move-exception
            r5 = r4
        L_0x004a:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f43524c
            r5.element = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
