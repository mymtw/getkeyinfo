package androidx.compose.runtime;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.runtime.ProduceStateScopeImpl", mo70541f = "ProduceState.kt", mo70542l = {227}, mo70543m = "awaitDispose")
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C1359r0<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(C1359r0<Object> r0Var, C19340c<? super ProduceStateScopeImpl$awaitDispose$1> cVar) {
        super(cVar);
        this.this$0 = r0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kq.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.result = r6
            int r6 = r5.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.label = r6
            androidx.compose.runtime.r0<java.lang.Object> r6 = r5.this$0
            r6.getClass()
            int r1 = r5.label
            r2 = r1 & r0
            if (r2 == 0) goto L_0x0019
            int r1 = r1 - r0
            r5.label = r1
            r0 = r5
            goto L_0x001e
        L_0x0019:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r6, r5)
        L_0x001e:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r3) goto L_0x0032
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r0 = r0.L$0
            r4 = r0
            kq.a r4 = (p753kq.C19846a) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ all -> 0x005b }
            goto L_0x0055
        L_0x003b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r0.L$0 = r4     // Catch:{ all -> 0x005b }
            r0.label = r3     // Catch:{ all -> 0x005b }
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch:{ all -> 0x005b }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ all -> 0x005b }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x005b }
            r6.mo72548n()     // Catch:{ all -> 0x005b }
            java.lang.Object r6 = r6.mo72547l()     // Catch:{ all -> 0x005b }
            if (r6 != r1) goto L_0x0055
            return r1
        L_0x0055:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x005b }
            r6.<init>()     // Catch:{ all -> 0x005b }
            throw r6     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            r4.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
