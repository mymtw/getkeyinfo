package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.SharedFlowImpl", mo70541f = "SharedFlow.kt", mo70542l = {373, 380, 383}, mo70543m = "collect$suspendImpl")
final class SharedFlowImpl$collect$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19671s1<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(C19671s1<Object> s1Var, C19340c<? super SharedFlowImpl$collect$1> cVar) {
        super(cVar);
        this.this$0 = s1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19671s1.m33431k(this.this$0, (C19600e) null, this);
    }
}
