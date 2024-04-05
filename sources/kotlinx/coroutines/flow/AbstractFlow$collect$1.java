package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.AbstractFlow", mo70541f = "Flow.kt", mo70542l = {230}, mo70543m = "collect")
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, C19340c<? super AbstractFlow$collect$1> cVar) {
        super(cVar);
        this.this$0 = abstractFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect((C19600e) null, this);
    }
}
