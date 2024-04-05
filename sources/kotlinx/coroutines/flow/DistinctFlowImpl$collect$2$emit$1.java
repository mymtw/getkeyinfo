package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo70541f = "Distinct.kt", mo70542l = {81}, mo70543m = "emit")
public final class DistinctFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DistinctFlowImpl$collect$2<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl$collect$2<? super T> distinctFlowImpl$collect$2, C19340c<? super DistinctFlowImpl$collect$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = distinctFlowImpl$collect$2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
