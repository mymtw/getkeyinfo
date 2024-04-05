package androidx.compose.material;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.SwipeableKt$PreUpPostDownNestedScrollConnection$1", mo70541f = "Swipeable.kt", mo70542l = {882}, mo70543m = "onPostFling-RZ2iAVY")
public final class SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SwipeableKt$PreUpPostDownNestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(SwipeableKt$PreUpPostDownNestedScrollConnection$1 swipeableKt$PreUpPostDownNestedScrollConnection$1, C19340c<? super SwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = swipeableKt$PreUpPostDownNestedScrollConnection$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3814a(0, 0, this);
    }
}
