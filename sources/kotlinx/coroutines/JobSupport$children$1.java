package kotlinx.coroutines;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.JobSupport$children$1", mo70541f = "JobSupport.kt", mo70542l = {952, 954}, mo70543m = "invokeSuspend")
final class JobSupport$children$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super C19699g1>, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C19749k1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(C19749k1 k1Var, C19340c<? super JobSupport$children$1> cVar) {
        super(2, cVar);
        this.this$0 = k1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, cVar);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    public final Object invoke(C19433i<? super C19699g1> iVar, C19340c<? super C19394m> cVar) {
        return ((JobSupport$children$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r3) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            java.lang.Object r1 = r7.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r7.L$1
            kotlinx.coroutines.internal.i r3 = (kotlinx.coroutines.internal.C19724i) r3
            java.lang.Object r4 = r7.L$0
            kotlin.sequences.i r4 = (kotlin.sequences.C19433i) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r8 = r7
            goto L_0x007d
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0025:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x0082
        L_0x0029:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.lang.Object r8 = r7.L$0
            kotlin.sequences.i r8 = (kotlin.sequences.C19433i) r8
            kotlinx.coroutines.k1 r1 = r7.this$0
            java.lang.Object r1 = r1.mo72521h0()
            boolean r4 = r1 instanceof kotlinx.coroutines.C19765p
            if (r4 == 0) goto L_0x0047
            kotlinx.coroutines.p r1 = (kotlinx.coroutines.C19765p) r1
            kotlinx.coroutines.q r1 = r1.f43723f
            r7.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r8.mo72006a(r1, r7)
            if (r8 != r0) goto L_0x0082
            return r0
        L_0x0047:
            boolean r3 = r1 instanceof kotlinx.coroutines.C19466a1
            if (r3 == 0) goto L_0x0082
            kotlinx.coroutines.a1 r1 = (kotlinx.coroutines.C19466a1) r1
            kotlinx.coroutines.p1 r1 = r1.mo72101d()
            if (r1 != 0) goto L_0x0054
            goto L_0x0082
        L_0x0054:
            java.lang.Object r3 = r1.mo72420t()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x005f:
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r1, r3)
            if (r5 != 0) goto L_0x0082
            boolean r5 = r1 instanceof kotlinx.coroutines.C19765p
            if (r5 == 0) goto L_0x007d
            r5 = r1
            kotlinx.coroutines.p r5 = (kotlinx.coroutines.C19765p) r5
            kotlinx.coroutines.q r5 = r5.f43723f
            r8.L$0 = r4
            r8.L$1 = r3
            r8.L$2 = r1
            r8.label = r2
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = r4.mo72006a(r5, r8)
            if (r5 != r0) goto L_0x007d
            return r0
        L_0x007d:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.mo72421u()
            goto L_0x005f
        L_0x0082:
            kotlin.m r8 = kotlin.C19394m.f43287a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
