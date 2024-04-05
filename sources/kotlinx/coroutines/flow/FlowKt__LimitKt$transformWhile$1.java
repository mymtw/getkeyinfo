package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", mo70541f = "Limit.kt", mo70542l = {153}, mo70543m = "invokeSuspend")
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $this_transformWhile;
    public final /* synthetic */ C19862q<C19600e<Object>, Object, C19340c<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1(C19597d<Object> dVar, C19862q<? super C19600e<Object>, Object, ? super C19340c<? super Boolean>, ? extends Object> qVar, C19340c<? super FlowKt__LimitKt$transformWhile$1> cVar) {
        super(2, cVar);
        this.$this_transformWhile = dVar;
        this.$transform = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, cVar);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19556xdf1aa1b6 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<Object> dVar = this.$this_transformWhile;
            C19556xdf1aa1b6 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new C19556xdf1aa1b6(this.$transform, (C19600e) this.L$0);
            try {
                this.L$0 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.label = 1;
                if (dVar.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                if (e.getOwner() != flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
                    throw e;
                }
                return C19394m.f43287a;
            }
        } else if (i == 1) {
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (C19556xdf1aa1b6) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (AbortFlowException e2) {
                e = e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
