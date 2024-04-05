package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class NavigationRailKt$placeLabelAndIcon$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $iconPlaceable;
    public final /* synthetic */ float $iconPositionAnimationProgress;
    public final /* synthetic */ int $iconX;
    public final /* synthetic */ C1686i0 $labelPlaceable;
    public final /* synthetic */ int $labelX;
    public final /* synthetic */ int $labelY;
    public final /* synthetic */ int $offset;
    public final /* synthetic */ int $selectedIconY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(float f, C1686i0 i0Var, int i, int i2, int i3, C1686i0 i0Var2, int i4, int i5) {
        super(1);
        this.$iconPositionAnimationProgress = f;
        this.$labelPlaceable = i0Var;
        this.$labelX = i;
        this.$labelY = i2;
        this.$offset = i3;
        this.$iconPlaceable = i0Var2;
        this.$iconX = i4;
        this.$selectedIconY = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        if (!(this.$iconPositionAnimationProgress == 0.0f)) {
            C1686i0.C1687a.m3583e(aVar, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset);
        }
        C1686i0.C1687a.m3583e(aVar, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset);
    }
}
