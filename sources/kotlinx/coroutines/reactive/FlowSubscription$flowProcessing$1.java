package kotlinx.coroutines.reactive;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.FlowSubscription", mo70541f = "ReactiveFlow.kt", mo70542l = {209}, mo70543m = "flowProcessing")
final class FlowSubscription$flowProcessing$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19777c<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowSubscription$flowProcessing$1(C19777c<Object> cVar, C19340c<? super FlowSubscription$flowProcessing$1> cVar2) {
        super(cVar2);
        this.this$0 = cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19777c.m33730E0(this.this$0, this);
    }
}
