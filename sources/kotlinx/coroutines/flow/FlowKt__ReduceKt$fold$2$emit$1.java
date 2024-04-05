package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", mo70541f = "Reduce.kt", mo70542l = {45}, mo70543m = "emit")
public final class FlowKt__ReduceKt$fold$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19661p0<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__ReduceKt$fold$2$emit$1(C19661p0<Object> p0Var, C19340c<? super FlowKt__ReduceKt$fold$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = p0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
