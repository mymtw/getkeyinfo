package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", mo70541f = "Merge.kt", mo70542l = {30}, mo70543m = "emit")
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C196151<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C196151<? super T> r1, C19340c<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
