package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", mo70541f = "Count.kt", mo70542l = {31}, mo70543m = "emit")
final class FlowKt__CountKt$count$4$emit$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19677u<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt__CountKt$count$4$emit$1(C19677u<Object> uVar, C19340c<? super FlowKt__CountKt$count$4$emit$1> cVar) {
        super(cVar);
        this.this$0 = uVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
