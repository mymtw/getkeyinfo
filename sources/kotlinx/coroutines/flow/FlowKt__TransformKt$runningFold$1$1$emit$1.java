package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", mo70541f = "Transform.kt", mo70542l = {103, 104}, mo70543m = "emit")
final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19605f1<Object> this$0;

    public FlowKt__TransformKt$runningFold$1$1$emit$1(C19605f1<Object> f1Var, C19340c<? super FlowKt__TransformKt$runningFold$1$1$emit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
