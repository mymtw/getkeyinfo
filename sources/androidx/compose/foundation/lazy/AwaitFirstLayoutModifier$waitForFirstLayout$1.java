package androidx.compose.foundation.lazy;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", mo70541f = "LazyListState.kt", mo70542l = {417}, mo70543m = "waitForFirstLayout")
public final class AwaitFirstLayoutModifier$waitForFirstLayout$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AwaitFirstLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AwaitFirstLayoutModifier$waitForFirstLayout$1(AwaitFirstLayoutModifier awaitFirstLayoutModifier, C19340c<? super AwaitFirstLayoutModifier$waitForFirstLayout$1> cVar) {
        super(cVar);
        this.this$0 = awaitFirstLayoutModifier;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4168a(this);
    }
}
