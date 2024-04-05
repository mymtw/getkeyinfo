package kotlinx.coroutines.reactive;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.PublisherAsFlow", mo70541f = "ReactiveFlow.kt", mo70542l = {98, 100}, mo70543m = "collectImpl")
final class PublisherAsFlow$collectImpl$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19778d<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PublisherAsFlow$collectImpl$1(C19778d<Object> dVar, C19340c<? super PublisherAsFlow$collectImpl$1> cVar) {
        super(cVar);
        this.this$0 = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72580j(this, (CoroutineContext) null, (C19600e) null);
    }
}
