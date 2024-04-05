package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TabKt$TabBaselineLayout$2$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ Integer $firstBaseline;
    public final /* synthetic */ C1686i0 $iconPlaceable;
    public final /* synthetic */ Integer $lastBaseline;
    public final /* synthetic */ int $tabHeight;
    public final /* synthetic */ int $tabWidth;
    public final /* synthetic */ C1686i0 $textPlaceable;
    public final /* synthetic */ C1713x $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$2$measure$1(C1686i0 i0Var, C1686i0 i0Var2, C1713x xVar, int i, int i2, Integer num, Integer num2) {
        super(1);
        this.$textPlaceable = i0Var;
        this.$iconPlaceable = i0Var2;
        this.$this_Layout = xVar;
        this.$tabWidth = i;
        this.$tabHeight = i2;
        this.$firstBaseline = num;
        this.$lastBaseline = num2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C1686i0 i0Var;
        float f;
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0 i0Var2 = this.$textPlaceable;
        if (i0Var2 != null && (i0Var = this.$iconPlaceable) != null) {
            C1713x xVar = this.$this_Layout;
            int i = this.$tabWidth;
            int i2 = this.$tabHeight;
            Integer num = this.$firstBaseline;
            C19383o.m32794d(num);
            int intValue = num.intValue();
            Integer num2 = this.$lastBaseline;
            C19383o.m32794d(num2);
            int intValue2 = num2.intValue();
            if (intValue == intValue2) {
                f = TabKt.f2316d;
            } else {
                f = TabKt.f2317e;
            }
            int V = xVar.mo3791V(C1274z1.f2679c) + xVar.mo3791V(f);
            int E0 = (xVar.mo3790E0(TabKt.f2318f) + i0Var.f3723c) - intValue;
            int i3 = (i2 - intValue2) - V;
            C1686i0.C1687a.m3583e(aVar, i0Var2, (i - i0Var2.f3722b) / 2, i3);
            C1686i0.C1687a.m3583e(aVar, i0Var, (i - i0Var.f3722b) / 2, i3 - E0);
        } else if (i0Var2 != null) {
            int i4 = this.$tabHeight;
            float f2 = TabKt.f2313a;
            C1686i0.C1687a.m3583e(aVar, i0Var2, 0, (i4 - i0Var2.f3723c) / 2);
        } else {
            C1686i0 i0Var3 = this.$iconPlaceable;
            if (i0Var3 != null) {
                int i5 = this.$tabHeight;
                float f3 = TabKt.f2313a;
                C1686i0.C1687a.m3583e(aVar, i0Var3, 0, (i5 - i0Var3.f3723c) / 2);
            }
        }
    }
}
