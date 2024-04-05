package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;

public final class FlowKt__LimitKt$take$2$1<T> implements C19600e {

    /* renamed from: b */
    public final /* synthetic */ Ref$IntRef f43533b;

    /* renamed from: c */
    public final /* synthetic */ int f43534c;

    /* renamed from: d */
    public final /* synthetic */ C19600e<T> f43535d;

    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i, C19600e<? super T> eVar) {
        this.f43533b = ref$IntRef;
        this.f43534c = i;
        this.f43535d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, kotlin.coroutines.C19340c<? super kotlin.C19394m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x005d
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x004f
        L_0x0036:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f43533b
            int r2 = r7.element
            int r2 = r2 + r4
            r7.element = r2
            int r7 = r5.f43534c
            if (r2 >= r7) goto L_0x0052
            kotlinx.coroutines.flow.e<T> r7 = r5.f43535d
            r0.label = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        L_0x0052:
            kotlinx.coroutines.flow.e<T> r7 = r5.f43535d
            r0.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlinx.coroutines.flow.C19643j0.m33422a(r7, r6, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
