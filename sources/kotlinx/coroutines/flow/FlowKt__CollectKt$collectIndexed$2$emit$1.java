package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class FlowKt__CollectKt$collectIndexed$2$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19666r this$0;

    public FlowKt__CollectKt$collectIndexed$2$emit$1(C19666r rVar, C19340c<? super FlowKt__CollectKt$collectIndexed$2$emit$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
