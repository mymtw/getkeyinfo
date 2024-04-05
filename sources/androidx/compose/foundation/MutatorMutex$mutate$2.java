package androidx.compose.foundation;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.MutatorMutex$mutate$2", mo70541f = "MutatorMutex.kt", mo70542l = {173, 119}, mo70543m = "invokeSuspend")
final class MutatorMutex$mutate$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<Object>, Object> {
    public final /* synthetic */ C19857l<C19340c<Object>, Object> $block;
    public final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ MutatorMutex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, C19857l<? super C19340c<Object>, ? extends Object> lVar, C19340c<? super MutatorMutex$mutate$2> cVar) {
        super(2, cVar);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, cVar);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<Object> cVar) {
        return ((MutatorMutex$mutate$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x00a8=Splitter:B:33:0x00a8, B:21:0x008e=Splitter:B:21:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x003e
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r0 = r8.L$2
            androidx.compose.foundation.MutatorMutex r0 = (androidx.compose.foundation.MutatorMutex) r0
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.C19814c) r1
            java.lang.Object r2 = r8.L$0
            androidx.compose.foundation.MutatorMutex$a r2 = (androidx.compose.foundation.MutatorMutex.C0540a) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x001e }
            goto L_0x008e
        L_0x001e:
            r9 = move-exception
            goto L_0x00a8
        L_0x0021:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0029:
            java.lang.Object r1 = r8.L$3
            androidx.compose.foundation.MutatorMutex r1 = (androidx.compose.foundation.MutatorMutex) r1
            java.lang.Object r3 = r8.L$2
            kq.l r3 = (p753kq.C19857l) r3
            java.lang.Object r5 = r8.L$1
            kotlinx.coroutines.sync.c r5 = (kotlinx.coroutines.sync.C19814c) r5
            java.lang.Object r6 = r8.L$0
            androidx.compose.foundation.MutatorMutex$a r6 = (androidx.compose.foundation.MutatorMutex.C0540a) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            r9 = r1
            goto L_0x0079
        L_0x003e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.d0 r9 = (kotlinx.coroutines.C19525d0) r9
            androidx.compose.foundation.MutatorMutex$a r1 = new androidx.compose.foundation.MutatorMutex$a
            androidx.compose.foundation.MutatePriority r5 = r8.$priority
            kotlin.coroutines.CoroutineContext r9 = r9.getCoroutineContext()
            kotlinx.coroutines.g1$b r6 = kotlinx.coroutines.C19699g1.C19701b.f43635b
            kotlin.coroutines.CoroutineContext$a r9 = r9.get(r6)
            kotlin.jvm.internal.C19383o.m32794d(r9)
            kotlinx.coroutines.g1 r9 = (kotlinx.coroutines.C19699g1) r9
            r1.<init>(r5, r9)
            androidx.compose.foundation.MutatorMutex r9 = r8.this$0
            androidx.compose.foundation.MutatorMutex.m1311a(r9, r1)
            androidx.compose.foundation.MutatorMutex r9 = r8.this$0
            kotlinx.coroutines.sync.MutexImpl r5 = r9.f1273b
            kq.l<kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r6 = r8.$block
            r8.L$0 = r1
            r8.L$1 = r5
            r8.L$2 = r6
            r8.L$3 = r9
            r8.label = r3
            java.lang.Object r3 = r5.mo72641c(r4, r8)
            if (r3 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r3 = r6
            r6 = r1
        L_0x0079:
            r1 = r5
            r8.L$0 = r6     // Catch:{ all -> 0x00a3 }
            r8.L$1 = r1     // Catch:{ all -> 0x00a3 }
            r8.L$2 = r9     // Catch:{ all -> 0x00a3 }
            r8.L$3 = r4     // Catch:{ all -> 0x00a3 }
            r8.label = r2     // Catch:{ all -> 0x00a3 }
            java.lang.Object r2 = r3.invoke(r8)     // Catch:{ all -> 0x00a3 }
            if (r2 != r0) goto L_0x008b
            return r0
        L_0x008b:
            r0 = r9
            r9 = r2
            r2 = r6
        L_0x008e:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.foundation.MutatorMutex$a> r0 = r0.f1272a     // Catch:{ all -> 0x00a1 }
        L_0x0090:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00a1 }
            if (r3 == 0) goto L_0x0097
            goto L_0x009d
        L_0x0097:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00a1 }
            if (r3 == r2) goto L_0x0090
        L_0x009d:
            r1.mo72642d(r4)
            return r9
        L_0x00a1:
            r9 = move-exception
            goto L_0x00b8
        L_0x00a3:
            r0 = move-exception
            r2 = r6
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x00a8:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.foundation.MutatorMutex$a> r0 = r0.f1272a     // Catch:{ all -> 0x00a1 }
        L_0x00aa:
            boolean r3 = r0.compareAndSet(r2, r4)     // Catch:{ all -> 0x00a1 }
            if (r3 != 0) goto L_0x00b7
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x00a1 }
            if (r3 != r2) goto L_0x00b7
            goto L_0x00aa
        L_0x00b7:
            throw r9     // Catch:{ all -> 0x00a1 }
        L_0x00b8:
            r1.mo72642d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MutatorMutex$mutate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
