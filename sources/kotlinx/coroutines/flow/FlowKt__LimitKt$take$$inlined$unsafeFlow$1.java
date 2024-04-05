package kotlinx.coroutines.flow;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;

public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f43525b;

    /* renamed from: c */
    public final /* synthetic */ int f43526c = 1;

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1) {
        this.f43525b = swipeableState$special$$inlined$filter$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(kotlinx.coroutines.flow.C19600e<java.lang.Object> r7, kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C195551
            if (r0 == 0) goto L_0x0013
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C195551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.e r7 = (kotlinx.coroutines.flow.C19600e) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ AbortFlowException -> 0x004f }
            goto L_0x0056
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            kotlinx.coroutines.flow.d r2 = r6.f43525b     // Catch:{ AbortFlowException -> 0x004f }
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch:{ AbortFlowException -> 0x004f }
            int r5 = r6.f43526c     // Catch:{ AbortFlowException -> 0x004f }
            r4.<init>(r8, r5, r7)     // Catch:{ AbortFlowException -> 0x004f }
            r0.L$0 = r7     // Catch:{ AbortFlowException -> 0x004f }
            r0.label = r3     // Catch:{ AbortFlowException -> 0x004f }
            java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ AbortFlowException -> 0x004f }
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x004f:
            r8 = move-exception
            kotlinx.coroutines.flow.e r0 = r8.getOwner()
            if (r0 != r7) goto L_0x0059
        L_0x0056:
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        L_0x0059:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }
}
