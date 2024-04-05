package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", mo70541f = "Errors.kt", mo70542l = {156}, mo70543m = "catchImpl")
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__ErrorsKt$catchImpl$1(C19340c<? super FlowKt__ErrorsKt$catchImpl$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19601e0.m33396a(this, (C19597d) null, (C19600e) null);
    }
}
