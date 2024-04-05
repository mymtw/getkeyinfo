package kotlinx.coroutines.stream;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.stream.StreamFlow", mo70541f = "Stream.kt", mo70542l = {26}, mo70543m = "collect")
public final class StreamFlow$collect$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StreamFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamFlow$collect$1(StreamFlow<T> streamFlow, C19340c<? super StreamFlow$collect$1> cVar) {
        super(cVar);
        this.this$0 = streamFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect((C19600e) null, this);
    }
}
