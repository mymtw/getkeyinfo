package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.C0601c;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragLogic", mo70541f = "Draggable.kt", mo70542l = {390, 393, 395}, mo70543m = "processDragStart")
public final class DragLogic$processDragStart$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DragLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragLogic$processDragStart$1(DragLogic dragLogic, C19340c<? super DragLogic$processDragStart$1> cVar) {
        super(cVar);
        this.this$0 = dragLogic;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3765b((C19525d0) null, (C0601c.C0604c) null, this);
    }
}
