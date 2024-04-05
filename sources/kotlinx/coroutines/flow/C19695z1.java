package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;

/* renamed from: kotlinx.coroutines.flow.z1 */
public final class C19695z1<T> implements C19600e<T> {
    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.C19394m mo72389b(kotlin.coroutines.C19340c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L_0x0046
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 != r0) goto L_0x002c
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
        L_0x0029:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0034:
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.internal.SafeCollector r1 = (kotlinx.coroutines.flow.internal.SafeCollector) r1
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.z1 r0 = (kotlinx.coroutines.flow.C19695z1) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x005a }
            r1.releaseIntercepted()
            r0.getClass()
            goto L_0x0029
        L_0x0046:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            kotlinx.coroutines.flow.internal.SafeCollector r1 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.L$0 = r4     // Catch:{ all -> 0x005a }
            r0.L$1 = r1     // Catch:{ all -> 0x005a }
            r0.label = r2     // Catch:{ all -> 0x005a }
            throw r3     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C19695z1.mo72389b(kotlin.coroutines.c):kotlin.m");
    }

    public final Object emit(T t, C19340c<? super C19394m> cVar) {
        throw null;
    }
}
