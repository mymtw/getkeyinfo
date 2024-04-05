package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C19513o;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.CallbackFlowBuilder", mo70541f = "Builders.kt", mo70542l = {336}, mo70543m = "collectTo")
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallbackFlowBuilder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, C19340c<? super CallbackFlowBuilder$collectTo$1> cVar) {
        super(cVar);
        this.this$0 = callbackFlowBuilder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72260f((C19513o) null, this);
    }
}
