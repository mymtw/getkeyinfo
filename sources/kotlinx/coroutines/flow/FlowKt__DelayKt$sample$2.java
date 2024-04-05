package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", mo70541f = "Delay.kt", mo70542l = {352}, mo70543m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements C19862q<C19525d0, C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $periodMillis;
    public final /* synthetic */ C19597d<Object> $this_sample;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, C19597d<Object> dVar, C19340c<? super FlowKt__DelayKt$sample$2> cVar) {
        super(3, cVar);
        this.$periodMillis = j;
        this.$this_sample = dVar;
    }

    public final Object invoke(C19525d0 d0Var, C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, cVar);
        flowKt__DelayKt$sample$2.L$0 = d0Var;
        flowKt__DelayKt$sample$2.L$1 = eVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r9.L$3
            kotlinx.coroutines.channels.q r1 = (kotlinx.coroutines.channels.C19515q) r1
            java.lang.Object r4 = r9.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r9.L$1
            kotlinx.coroutines.channels.q r5 = (kotlinx.coroutines.channels.C19515q) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            goto L_0x0049
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0026:
            androidx.compose.foundation.layout.C0761x.m1684O0(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.d0 r10 = (kotlinx.coroutines.C19525d0) r10
            java.lang.Object r1 = r9.L$1
            r6 = r1
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
            r1 = -1
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 r4 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1
            kotlinx.coroutines.flow.d<java.lang.Object> r5 = r9.$this_sample
            r4.<init>(r5, r3)
            kotlinx.coroutines.channels.n r5 = kotlinx.coroutines.channels.ProduceKt.m33139b(r10, r1, r4, r2)
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            long r7 = r9.$periodMillis
            kotlinx.coroutines.channels.n r1 = kotlinx.coroutines.flow.C19684w.m33458c(r10, r7, r7)
        L_0x0049:
            T r10 = r4.element
            kotlinx.coroutines.internal.t r7 = p772tq.C20203a.f44780j
            if (r10 == r7) goto L_0x0084
            r9.L$0 = r6
            r9.L$1 = r5
            r9.L$2 = r4
            r9.L$3 = r1
            r9.label = r2
            kotlinx.coroutines.selects.a r10 = new kotlinx.coroutines.selects.a
            r10.<init>(r9)
            kotlinx.coroutines.selects.d r7 = r5.mo72140q()     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1     // Catch:{ all -> 0x0077 }
            r8.<init>(r4, r1, r3)     // Catch:{ all -> 0x0077 }
            r7.mo72161A(r10, r8)     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.selects.d r7 = r1.mo72139p()     // Catch:{ all -> 0x0077 }
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2     // Catch:{ all -> 0x0077 }
            r8.<init>(r4, r6, r3)     // Catch:{ all -> 0x0077 }
            r7.mo72161A(r10, r8)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r7 = move-exception
            r10.mo72630H(r7)
        L_0x007b:
            java.lang.Object r10 = r10.mo72629G()
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r0) goto L_0x0049
            return r0
        L_0x0084:
            kotlin.m r10 = kotlin.C19394m.f43287a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
