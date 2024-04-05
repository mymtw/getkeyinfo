package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p174m0.C7282b;
import p753kq.C19857l;
import p753kq.C19864s;

public final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C19864s<Integer, int[], LayoutDirection, C7282b, int[], C19394m> $arrangement;
    public final /* synthetic */ Ref$IntRef $beforeCrossAxisAlignmentLine;
    public final /* synthetic */ C0743k $crossAxisAlignment;
    public final /* synthetic */ int $crossAxisLayoutSize;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ int[] $mainAxisPositions;
    public final /* synthetic */ List<C1710u> $measurables;
    public final /* synthetic */ LayoutOrientation $orientation;
    public final /* synthetic */ C1686i0[] $placeables;
    public final /* synthetic */ C0762y[] $rowColumnParentData;
    public final /* synthetic */ C1713x $this_measure;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(List<? extends C1710u> list, C1686i0[] i0VarArr, C19864s<? super Integer, ? super int[], ? super LayoutDirection, ? super C7282b, ? super int[], C19394m> sVar, int i, C1713x xVar, int[] iArr, LayoutOrientation layoutOrientation, C0762y[] yVarArr, C0743k kVar, int i2, Ref$IntRef ref$IntRef) {
        super(1);
        this.$measurables = list;
        this.$placeables = i0VarArr;
        this.$arrangement = sVar;
        this.$mainAxisLayoutSize = i;
        this.$this_measure = xVar;
        this.$mainAxisPositions = iArr;
        this.$orientation = layoutOrientation;
        this.$rowColumnParentData = yVarArr;
        this.$crossAxisAlignment = kVar;
        this.$crossAxisLayoutSize = i2;
        this.$beforeCrossAxisAlignmentLine = ref$IntRef;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        int i;
        LayoutDirection layoutDirection;
        int i2;
        C19383o.m32797g(aVar, "$this$layout");
        int size = this.$measurables.size();
        int[] iArr = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1686i0 i0Var = this.$placeables[i4];
            C19383o.m32794d(i0Var);
            if (this.$orientation == LayoutOrientation.Horizontal) {
                i2 = i0Var.f3722b;
            } else {
                i2 = i0Var.f3723c;
            }
            iArr[i4] = i2;
        }
        this.$arrangement.invoke(Integer.valueOf(this.$mainAxisLayoutSize), iArr, this.$this_measure.getLayoutDirection(), this.$this_measure, this.$mainAxisPositions);
        C1686i0[] i0VarArr = this.$placeables;
        C0762y[] yVarArr = this.$rowColumnParentData;
        C0743k kVar = this.$crossAxisAlignment;
        int i5 = this.$crossAxisLayoutSize;
        LayoutOrientation layoutOrientation = this.$orientation;
        C1713x xVar = this.$this_measure;
        Ref$IntRef ref$IntRef = this.$beforeCrossAxisAlignmentLine;
        int[] iArr2 = this.$mainAxisPositions;
        int length = i0VarArr.length;
        int i6 = 0;
        while (i3 < length) {
            C1686i0 i0Var2 = i0VarArr[i3];
            int i7 = i6 + 1;
            C19383o.m32794d(i0Var2);
            C0762y yVar = yVarArr[i6];
            C0743k kVar2 = yVar != null ? yVar.f1571c : null;
            if (kVar2 == null) {
                kVar2 = kVar;
            }
            LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
            if (layoutOrientation == layoutOrientation2) {
                i = i0Var2.f3723c;
            } else {
                i = i0Var2.f3722b;
            }
            int i8 = i5 - i;
            if (layoutOrientation == layoutOrientation2) {
                layoutDirection = LayoutDirection.Ltr;
            } else {
                layoutDirection = xVar.getLayoutDirection();
            }
            C1686i0[] i0VarArr2 = i0VarArr;
            LayoutDirection layoutDirection2 = layoutDirection;
            C0762y[] yVarArr2 = yVarArr;
            int i9 = ref$IntRef.element;
            int a = kVar2.mo4127a(i8, layoutDirection2, i0Var2);
            if (layoutOrientation == layoutOrientation2) {
                C1686i0.C1687a.m3581c(i0Var2, iArr2[i6], a, 0.0f);
            } else {
                C1686i0.C1687a.m3581c(i0Var2, a, iArr2[i6], 0.0f);
            }
            i3++;
            i0VarArr = i0VarArr2;
            i6 = i7;
            yVarArr = yVarArr2;
        }
    }
}
