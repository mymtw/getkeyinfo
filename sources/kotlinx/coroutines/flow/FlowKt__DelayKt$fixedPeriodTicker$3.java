package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C19513o;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", mo70541f = "Delay.kt", mo70542l = {314, 316, 317}, mo70543m = "invokeSuspend")
final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements C19861p<C19513o<? super C19394m>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ long $delayMillis;
    public final /* synthetic */ long $initialDelayMillis;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$3(long j, long j2, C19340c<? super FlowKt__DelayKt$fixedPeriodTicker$3> cVar) {
        super(2, cVar);
        this.$initialDelayMillis = j;
        this.$delayMillis = j2;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.$initialDelayMillis, this.$delayMillis, cVar);
        flowKt__DelayKt$fixedPeriodTicker$3.L$0 = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    public final Object invoke(C19513o<? super C19394m> oVar, C19340c<? super C19394m> cVar) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$3) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.channels.o} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r4) goto L_0x000f
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
        L_0x000f:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.C19513o) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            goto L_0x003d
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001f:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.C19513o) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            r8 = r7
            goto L_0x004f
        L_0x0028:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.C19513o) r1
            long r5 = r7.$initialDelayMillis
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = p628nj.C18263b.m30814I(r5, r7)
            if (r8 != r0) goto L_0x003d
            return r0
        L_0x003d:
            r8 = r7
        L_0x003e:
            kotlinx.coroutines.channels.u r4 = r1.mo72217t()
            kotlin.m r5 = kotlin.C19394m.f43287a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r4 = r4.mo72188E(r5, r8)
            if (r4 != r0) goto L_0x004f
            return r0
        L_0x004f:
            long r4 = r8.$delayMillis
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r4 = p628nj.C18263b.m30814I(r4, r8)
            if (r4 != r0) goto L_0x003e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
