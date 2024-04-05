package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo70541f = "Reduce.kt", mo70542l = {183}, mo70543m = "first")
public final class FlowKt__ReduceKt$first$3<T> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ReduceKt$first$3(C19340c<? super FlowKt__ReduceKt$first$3> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__ReduceKt.m33372b((C19597d) null, (C19861p) null, this);
    }
}
