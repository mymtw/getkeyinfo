package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$ObjectRef;

public final class DistinctFlowImpl$collect$2<T> implements C19600e {

    /* renamed from: b */
    public final /* synthetic */ DistinctFlowImpl<T> f43512b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef<Object> f43513c;

    /* renamed from: d */
    public final /* synthetic */ C19600e<T> f43514d;

    public DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, C19600e<? super T> eVar) {
        this.f43512b = distinctFlowImpl;
        this.f43513c = ref$ObjectRef;
        this.f43514d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(T r6, kotlin.coroutines.C19340c<? super kotlin.C19394m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0065
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            kotlinx.coroutines.flow.DistinctFlowImpl<T> r7 = r5.f43512b
            kq.l<T, java.lang.Object> r7 = r7.f43510c
            java.lang.Object r7 = r7.invoke(r6)
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f43513c
            T r2 = r2.element
            kotlinx.coroutines.internal.t r4 = p772tq.C20203a.f44778h
            if (r2 == r4) goto L_0x0056
            kotlinx.coroutines.flow.DistinctFlowImpl<T> r4 = r5.f43512b
            kq.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f43511d
            java.lang.Object r2 = r4.invoke(r2, r7)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        L_0x0056:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f43513c
            r2.element = r7
            kotlinx.coroutines.flow.e<T> r7 = r5.f43514d
            r0.label = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L_0x0065
            return r1
        L_0x0065:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }
}
