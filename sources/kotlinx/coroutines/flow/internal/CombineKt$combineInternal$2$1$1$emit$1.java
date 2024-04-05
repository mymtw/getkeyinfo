package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", mo70541f = "Combine.kt", mo70542l = {35, 36}, mo70543m = "emit")
public final class CombineKt$combineInternal$2$1$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CombineKt$combineInternal$2.C196171.C196181<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C196171.C196181<? super T> r1, C19340c<? super CombineKt$combineInternal$2$1$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
