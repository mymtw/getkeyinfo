package kotlinx.coroutines.reactive;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.reactive.ReactiveSubscriber", mo70541f = "ReactiveFlow.kt", mo70542l = {129}, mo70543m = "takeNextOrNull")
final class ReactiveSubscriber$takeNextOrNull$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19780f<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactiveSubscriber$takeNextOrNull$1(C19780f<Object> fVar, C19340c<? super ReactiveSubscriber$takeNextOrNull$1> cVar) {
        super(cVar);
        this.this$0 = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo72581a(this);
    }
}
