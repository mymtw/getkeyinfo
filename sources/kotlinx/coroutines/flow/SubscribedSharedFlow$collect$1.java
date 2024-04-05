package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.SubscribedSharedFlow", mo70541f = "Share.kt", mo70542l = {409}, mo70543m = "collect")
final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19589a2<Object> this$0;

    public SubscribedSharedFlow$collect$1(C19589a2<Object> a2Var, C19340c<? super SubscribedSharedFlow$collect$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
