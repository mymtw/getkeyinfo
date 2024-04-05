package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", mo70541f = "Limit.kt", mo70542l = {25}, mo70543m = "emit")
final class FlowKt__LimitKt$drop$2$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19604f0<Object> this$0;

    public FlowKt__LimitKt$drop$2$1$emit$1(C19604f0<Object> f0Var, C19340c<? super FlowKt__LimitKt$drop$2$1$emit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
