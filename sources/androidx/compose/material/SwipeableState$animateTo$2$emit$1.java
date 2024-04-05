package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.SwipeableState$animateTo$2", mo70541f = "Swipeable.kt", mo70542l = {335}, mo70543m = "emit")
public final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableState$animateTo$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, C19340c<? super SwipeableState$animateTo$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = swipeableState$animateTo$2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map<Float, Object>) null, this);
    }
}
