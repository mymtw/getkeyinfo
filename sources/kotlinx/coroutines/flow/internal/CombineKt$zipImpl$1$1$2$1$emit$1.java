package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import p744gq.C19060c;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", mo70541f = "Combine.kt", mo70542l = {131}, mo70543m = "emit")
public final class CombineKt$zipImpl$1$1$2$1$emit$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CombineKt$zipImpl$1$1.C196202.C196211<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$2$1$emit$1(CombineKt$zipImpl$1$1.C196202.C196211<? super T> r1, C19340c<? super CombineKt$zipImpl$1$1$2$1$emit$1> cVar) {
        super(cVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Object) null, this);
    }
}
