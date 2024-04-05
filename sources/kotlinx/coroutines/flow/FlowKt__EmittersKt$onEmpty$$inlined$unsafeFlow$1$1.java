package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", mo70541f = "Emitters.kt", mo70542l = {114, 122}, mo70543m = "collect")
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C19690y this$0;

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1(C19690y yVar, C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
