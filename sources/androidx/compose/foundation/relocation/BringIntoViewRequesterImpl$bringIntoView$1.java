package androidx.compose.foundation.relocation;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p288y.C8345d;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", mo70541f = "BringIntoViewRequester.kt", mo70542l = {121}, mo70543m = "bringIntoView")
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, C19340c<? super BringIntoViewRequesterImpl$bringIntoView$1> cVar) {
        super(cVar);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4403a((C8345d) null, this);
    }
}
