package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo70541f = "Limit.kt", mo70542l = {137}, mo70543m = "collectWhile")
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__LimitKt$collectWhile$1(C19340c<? super FlowKt__LimitKt$collectWhile$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1;
        AbortFlowException e;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            flowKt__LimitKt$collectWhile$1 = this;
        } else {
            flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(this);
        }
        Object obj2 = flowKt__LimitKt$collectWhile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$collectWhile$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$12 = new FlowKt__LimitKt$collectWhile$collector$1();
            try {
                flowKt__LimitKt$collectWhile$1.L$0 = flowKt__LimitKt$collectWhile$collector$12;
                flowKt__LimitKt$collectWhile$1.label = 1;
                throw null;
            } catch (AbortFlowException e2) {
                FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$13 = flowKt__LimitKt$collectWhile$collector$12;
                e = e2;
                flowKt__LimitKt$collectWhile$collector$1 = flowKt__LimitKt$collectWhile$collector$13;
                if (e.getOwner() != flowKt__LimitKt$collectWhile$collector$1) {
                    throw e;
                }
                return C19394m.f43287a;
            }
        } else if (i2 == 1) {
            flowKt__LimitKt$collectWhile$collector$1 = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.L$0;
            try {
                C0761x.m1684O0(obj2);
            } catch (AbortFlowException e3) {
                e = e3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
