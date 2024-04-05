package kotlinx.coroutines.reactive;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.PublisherCoroutine", mo70541f = "Publish.kt", mo70542l = {98}, mo70543m = "send")
public final class PublisherCoroutine$send$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PublisherCoroutine<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PublisherCoroutine$send$1(PublisherCoroutine<? super T> publisherCoroutine, C19340c<? super PublisherCoroutine$send$1> cVar) {
        super(cVar);
        this.this$0 = publisherCoroutine;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72188E(null, this);
    }
}
