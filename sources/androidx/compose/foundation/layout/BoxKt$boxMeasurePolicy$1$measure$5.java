package androidx.compose.foundation.layout;

import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1713x;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19857l;

public final class BoxKt$boxMeasurePolicy$1$measure$5 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1428a $alignment;
    public final /* synthetic */ Ref$IntRef $boxHeight;
    public final /* synthetic */ Ref$IntRef $boxWidth;
    public final /* synthetic */ List<C1710u> $measurables;
    public final /* synthetic */ C1686i0[] $placeables;
    public final /* synthetic */ C1713x $this_MeasurePolicy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BoxKt$boxMeasurePolicy$1$measure$5(C1686i0[] i0VarArr, List<? extends C1710u> list, C1713x xVar, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, C1428a aVar) {
        super(1);
        this.$placeables = i0VarArr;
        this.$measurables = list;
        this.$this_MeasurePolicy = xVar;
        this.$boxWidth = ref$IntRef;
        this.$boxHeight = ref$IntRef2;
        this.$alignment = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0[] i0VarArr = this.$placeables;
        List<C1710u> list = this.$measurables;
        C1713x xVar = this.$this_MeasurePolicy;
        Ref$IntRef ref$IntRef = this.$boxWidth;
        Ref$IntRef ref$IntRef2 = this.$boxHeight;
        C1428a aVar2 = this.$alignment;
        int length = i0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            C1686i0 i0Var = i0VarArr[i2];
            int i3 = i + 1;
            if (i0Var != null) {
                BoxKt.m1456b(aVar, i0Var, list.get(i), xVar.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, aVar2);
                i2++;
                i = i3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            }
        }
    }
}
