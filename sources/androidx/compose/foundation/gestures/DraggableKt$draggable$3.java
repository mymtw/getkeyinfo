package androidx.compose.foundation.gestures;

import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class DraggableKt$draggable$3 extends Lambda implements C19861p<C1302d, Integer, C0611i> {
    public final /* synthetic */ C0607e $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$3(C0607e eVar) {
        super(2);
        this.$state = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1302d) obj, ((Number) obj2).intValue());
    }

    public final C0611i invoke(C1302d dVar, int i) {
        dVar.mo5465u(830271906);
        C0607e eVar = this.$state;
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(eVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            v = new IgnorePointerDraggableState(eVar);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) v;
        dVar.mo5406H();
        return ignorePointerDraggableState;
    }
}
