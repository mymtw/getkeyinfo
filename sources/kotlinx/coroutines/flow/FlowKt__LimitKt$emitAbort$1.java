package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo70541f = "Limit.kt", mo70542l = {73}, mo70543m = "emitAbort$FlowKt__LimitKt")
final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__LimitKt$emitAbort$1(C19340c<? super FlowKt__LimitKt$emitAbort$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19643j0.m33422a((C19600e) null, (Object) null, this);
    }
}
