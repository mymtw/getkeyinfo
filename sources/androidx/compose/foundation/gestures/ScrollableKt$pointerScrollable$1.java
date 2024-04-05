package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class ScrollableKt$pointerScrollable$1 extends Lambda implements C19861p<C1302d, Integer, C0611i> {
    public final /* synthetic */ ScrollDraggableState $draggableState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$1(ScrollDraggableState scrollDraggableState) {
        super(2);
        this.$draggableState = scrollDraggableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1302d) obj, ((Number) obj2).intValue());
    }

    public final C0611i invoke(C1302d dVar, int i) {
        dVar.mo5465u(498671830);
        ScrollDraggableState scrollDraggableState = this.$draggableState;
        dVar.mo5406H();
        return scrollDraggableState;
    }
}
