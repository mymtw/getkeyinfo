package androidx.compose.foundation;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", mo70541f = "MutatorMutex.kt", mo70542l = {173, 160}, mo70543m = "invokeSuspend")
public final class MutatorMutex$mutateWith$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super R>, Object> {
    public final /* synthetic */ C19861p<T, C19340c<? super R>, Object> $block;
    public final /* synthetic */ MutatePriority $priority;
    public final /* synthetic */ T $receiver;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, C19861p<? super T, ? super C19340c<? super R>, ? extends Object> pVar, T t, C19340c<? super MutatorMutex$mutateWith$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = pVar;
        this.$receiver = t;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, cVar);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super R> cVar) {
        return ((MutatorMutex$mutateWith$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:31:0x00b0=Splitter:B:31:0x00b0, B:20:0x0098=Splitter:B:20:0x0098} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0041
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r9.L$2
            androidx.compose.foundation.MutatorMutex r0 = (androidx.compose.foundation.MutatorMutex) r0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.C19814c) r1
            java.lang.Object r2 = r9.L$0
            androidx.compose.foundation.MutatorMutex$a r2 = (androidx.compose.foundation.MutatorMutex.C0540a) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)     // Catch:{ all -> 0x001e }
            goto L_0x0098
        L_0x001e:
            r10 = move-exception
            goto L_0x00b0
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0029:
            java.lang.Object r1 = r9.L$4
            androidx.compose.foundation.MutatorMutex r1 = (androidx.compose.foundation.MutatorMutex) r1
            java.lang.Object r3 = r9.L$3
            java.lang.Object r5 = r9.L$2
            kq.p r5 = (p753kq.C19861p) r5
            java.lang.Object r6 = r9.L$1
            kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.C19814c) r6
            java.lang.Object r7 = r9.L$0
            androidx.compose.foundation.MutatorMutex$a r7 = (androidx.compose.foundation.MutatorMutex.C0540a) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            r10 = r1
            r1 = r6
            goto L_0x0082
        L_0x0041:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.d0 r10 = (kotlinx.coroutines.C19525d0) r10
            androidx.compose.foundation.MutatorMutex$a r1 = new androidx.compose.foundation.MutatorMutex$a
            androidx.compose.foundation.MutatePriority r5 = r9.$priority
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            kotlinx.coroutines.g1$b r6 = kotlinx.coroutines.C19699g1.C19701b.f43635b
            kotlin.coroutines.CoroutineContext$a r10 = r10.get(r6)
            kotlin.jvm.internal.C19383o.m32794d(r10)
            kotlinx.coroutines.g1 r10 = (kotlinx.coroutines.C19699g1) r10
            r1.<init>(r5, r10)
            androidx.compose.foundation.MutatorMutex r10 = r9.this$0
            androidx.compose.foundation.MutatorMutex.m1311a(r10, r1)
            androidx.compose.foundation.MutatorMutex r10 = r9.this$0
            kotlinx.coroutines.sync.MutexImpl r5 = r10.f1273b
            kq.p<T, kotlin.coroutines.c<? super R>, java.lang.Object> r6 = r9.$block
            T r7 = r9.$receiver
            r9.L$0 = r1
            r9.L$1 = r5
            r9.L$2 = r6
            r9.L$3 = r7
            r9.L$4 = r10
            r9.label = r3
            java.lang.Object r3 = r5.mo72641c(r4, r9)
            if (r3 != r0) goto L_0x007e
            return r0
        L_0x007e:
            r3 = r7
            r7 = r1
            r1 = r5
            r5 = r6
        L_0x0082:
            r9.L$0 = r7     // Catch:{ all -> 0x00ab }
            r9.L$1 = r1     // Catch:{ all -> 0x00ab }
            r9.L$2 = r10     // Catch:{ all -> 0x00ab }
            r9.L$3 = r4     // Catch:{ all -> 0x00ab }
            r9.L$4 = r4     // Catch:{ all -> 0x00ab }
            r9.label = r2     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r5.invoke(r3, r9)     // Catch:{ all -> 0x00ab }
            if (r2 != r0) goto L_0x0095
            return r0
        L_0x0095:
            r0 = r10
            r10 = r2
            r2 = r7
        L_0x0098:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.foundation.MutatorMutex$a> r0 = r0.f1272a     // Catch:{ all -> 0x00c0 }
        L_0x009a:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00c0 }
            if (r3 == r2) goto L_0x009a
        L_0x00a7:
            r1.mo72642d(r4)
            return r10
        L_0x00ab:
            r0 = move-exception
            r2 = r7
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x00b0:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.foundation.MutatorMutex$a> r0 = r0.f1272a     // Catch:{ all -> 0x00c0 }
        L_0x00b2:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00c0 }
            if (r3 != 0) goto L_0x00bf
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00c0 }
            if (r3 != r2) goto L_0x00bf
            goto L_0x00b2
        L_0x00bf:
            throw r10     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r10 = move-exception
            r1.mo72642d(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
