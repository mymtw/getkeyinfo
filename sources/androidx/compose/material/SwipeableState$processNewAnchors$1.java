package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.SwipeableState", mo70541f = "Swipeable.kt", mo70542l = {159, 183, 186}, mo70543m = "processNewAnchors$material_release")
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public float F$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(SwipeableState<T> swipeableState, C19340c<? super SwipeableState$processNewAnchors$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo5120h((Map) null, (Map) null, this);
    }
}
