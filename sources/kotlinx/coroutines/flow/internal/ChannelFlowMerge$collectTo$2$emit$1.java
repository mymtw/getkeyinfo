package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", mo70541f = "Merge.kt", mo70542l = {66}, mo70543m = "emit")
final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19627d<Object> this$0;

    public ChannelFlowMerge$collectTo$2$emit$1(C19627d<Object> dVar, C19340c<? super ChannelFlowMerge$collectTo$2$emit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
