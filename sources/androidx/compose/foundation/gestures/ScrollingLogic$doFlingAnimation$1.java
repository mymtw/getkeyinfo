package androidx.compose.foundation.gestures;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.ScrollingLogic", mo70541f = "Scrollable.kt", mo70542l = {399}, mo70543m = "doFlingAnimation-QWom1Mo")
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, C19340c<? super ScrollingLogic$doFlingAnimation$1> cVar) {
        super(cVar);
        this.this$0 = scrollingLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3818b(0, this);
    }
}
