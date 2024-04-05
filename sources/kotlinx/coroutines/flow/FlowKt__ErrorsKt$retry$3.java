package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19863r;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", mo70541f = "Errors.kt", mo70542l = {95}, mo70543m = "invokeSuspend")
final class FlowKt__ErrorsKt$retry$3 extends SuspendLambda implements C19863r<C19600e<Object>, Throwable, Long, C19340c<? super Boolean>, Object> {
    public final /* synthetic */ C19861p<Throwable, C19340c<? super Boolean>, Object> $predicate;
    public final /* synthetic */ long $retries;
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ErrorsKt$retry$3(long j, C19861p<? super Throwable, ? super C19340c<? super Boolean>, ? extends Object> pVar, C19340c<? super FlowKt__ErrorsKt$retry$3> cVar) {
        super(4, cVar);
        this.$retries = j;
        this.$predicate = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((C19600e<Object>) (C19600e) obj, (Throwable) obj2, ((Number) obj3).longValue(), (C19340c<? super Boolean>) (C19340c) obj4);
    }

    public final Object invoke(C19600e<Object> eVar, Throwable th, long j, C19340c<? super Boolean> cVar) {
        FlowKt__ErrorsKt$retry$3 flowKt__ErrorsKt$retry$3 = new FlowKt__ErrorsKt$retry$3(this.$retries, this.$predicate, cVar);
        flowKt__ErrorsKt$retry$3.L$0 = th;
        flowKt__ErrorsKt$retry$3.J$0 = j;
        return flowKt__ErrorsKt$retry$3.invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x002f
        L_0x000d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0015:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.lang.Object r8 = r7.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            long r3 = r7.J$0
            long r5 = r7.$retries
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0038
            kq.p<java.lang.Throwable, kotlin.coroutines.c<? super java.lang.Boolean>, java.lang.Object> r1 = r7.$predicate
            r7.label = r2
            java.lang.Object r8 = r1.invoke(r8, r7)
            if (r8 != r0) goto L_0x002f
            return r0
        L_0x002f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
