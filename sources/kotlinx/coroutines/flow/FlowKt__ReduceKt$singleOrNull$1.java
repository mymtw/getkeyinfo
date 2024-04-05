package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo70541f = "Reduce.kt", mo70542l = {183}, mo70543m = "singleOrNull")
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$singleOrNull$1(C19340c<? super FlowKt__ReduceKt$singleOrNull$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.m33379i(this);
    }
}
