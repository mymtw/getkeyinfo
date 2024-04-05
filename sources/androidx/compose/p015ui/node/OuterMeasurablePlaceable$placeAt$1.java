package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.OuterMeasurablePlaceable$placeAt$1 */
public final class OuterMeasurablePlaceable$placeAt$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C19857l<C1549v, C19394m> $layerBlock;
    public final /* synthetic */ long $position;
    public final /* synthetic */ float $zIndex;
    public final /* synthetic */ OuterMeasurablePlaceable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OuterMeasurablePlaceable$placeAt$1(OuterMeasurablePlaceable outerMeasurablePlaceable, long j, float f, C19857l<? super C1549v, C19394m> lVar) {
        super(0);
        this.this$0 = outerMeasurablePlaceable;
        this.$position = j;
        this.$zIndex = f;
        this.$layerBlock = lVar;
    }

    public final void invoke() {
        OuterMeasurablePlaceable outerMeasurablePlaceable = this.this$0;
        long j = this.$position;
        float f = this.$zIndex;
        C19857l<C1549v, C19394m> lVar = this.$layerBlock;
        outerMeasurablePlaceable.getClass();
        C1686i0.C1687a.C1688a aVar = C1686i0.C1687a.f3726a;
        if (lVar == null) {
            LayoutNodeWrapper layoutNodeWrapper = outerMeasurablePlaceable.f3875g;
            aVar.getClass();
            C1686i0.C1687a.m3582d(layoutNodeWrapper, j, f);
            return;
        }
        LayoutNodeWrapper layoutNodeWrapper2 = outerMeasurablePlaceable.f3875g;
        aVar.getClass();
        C1686i0.C1687a.m3587i(layoutNodeWrapper2, j, f, lVar);
    }
}
