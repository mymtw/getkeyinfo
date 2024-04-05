package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p174m0.C7290i;
import p753kq.C19857l;
import p753kq.C19861p;

public final class WrapContentModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ int $wrapperHeight;
    public final /* synthetic */ int $wrapperWidth;
    public final /* synthetic */ WrapContentModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapContentModifier$measure$1(WrapContentModifier wrapContentModifier, int i, C1686i0 i0Var, int i2, C1713x xVar) {
        super(1);
        this.this$0 = wrapContentModifier;
        this.$wrapperWidth = i;
        this.$placeable = i0Var;
        this.$wrapperHeight = i2;
        this.$this_measure = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C19861p<C7290i, LayoutDirection, C7287g> pVar = this.this$0.f1458e;
        int i = this.$wrapperWidth;
        C1686i0 i0Var = this.$placeable;
        C1686i0.C1687a.m3582d(this.$placeable, pVar.invoke(new C7290i(C0761x.m1707a(i - i0Var.f3722b, this.$wrapperHeight - i0Var.f3723c)), this.$this_measure.getLayoutDirection()).f16166a, 0.0f);
    }
}
