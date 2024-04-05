package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", mo70541f = "Scrollable.kt", mo70542l = {496}, mo70543m = "performFling")
final class DefaultFlingBehavior$performFling$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C0599a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$1(C0599a aVar, C19340c<? super DefaultFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3858a((ScrollingLogic$doFlingAnimation$2.C0583a) null, 0.0f, this);
    }
}
