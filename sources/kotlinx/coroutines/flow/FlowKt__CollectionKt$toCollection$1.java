package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", mo70541f = "Collection.kt", mo70542l = {26}, mo70543m = "toCollection")
final class FlowKt__CollectionKt$toCollection$1<T, C extends Collection<? super T>> extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public FlowKt__CollectionKt$toCollection$1(C19340c<? super FlowKt__CollectionKt$toCollection$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C19674t.m33449a(this);
    }
}
