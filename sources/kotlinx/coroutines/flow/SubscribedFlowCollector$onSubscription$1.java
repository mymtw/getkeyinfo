package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo70541f = "Share.kt", mo70542l = {419, 423}, mo70543m = "onSubscription")
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19695z1<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(C19695z1<Object> z1Var, C19340c<? super SubscribedFlowCollector$onSubscription$1> cVar) {
        super(cVar);
        this.this$0 = z1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72389b(this);
    }
}
