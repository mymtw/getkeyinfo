package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", mo70541f = "Context.kt", mo70542l = {275}, mo70543m = "emit")
final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19586a<Object> this$0;

    public CancellableFlowImpl$collect$2$emit$1(C19586a<Object> aVar, C19340c<? super CancellableFlowImpl$collect$2$emit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
