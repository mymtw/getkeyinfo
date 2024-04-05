package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class BoxKt$boxMeasurePolicy$1$measure$2 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1428a $alignment;
    public final /* synthetic */ int $boxHeight;
    public final /* synthetic */ int $boxWidth;
    public final /* synthetic */ C1710u $measurable;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$2(C1686i0 i0Var, C1710u uVar, C1713x xVar, int i, int i2, C1428a aVar) {
        super(1);
        this.$placeable = i0Var;
        this.$measurable = uVar;
        this.$this_MeasurePolicy = xVar;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.$alignment = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        BoxKt.m1456b(aVar, this.$placeable, this.$measurable, this.$this_MeasurePolicy.getLayoutDirection(), this.$boxWidth, this.$boxHeight, this.$alignment);
    }
}
