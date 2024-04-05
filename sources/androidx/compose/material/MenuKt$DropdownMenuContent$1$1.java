package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements C19857l<C1549v, C19394m> {
    public final /* synthetic */ C1342k1<Float> $alpha$delegate;
    public final /* synthetic */ C1342k1<Float> $scale$delegate;
    public final /* synthetic */ C1338j0<C1540p0> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(C1338j0<C1540p0> j0Var, C1342k1<Float> k1Var, C1342k1<Float> k1Var2) {
        super(1);
        this.$transformOriginState = j0Var;
        this.$scale$delegate = k1Var;
        this.$alpha$delegate = k1Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1549v) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1549v vVar) {
        C19383o.m32797g(vVar, "$this$graphicsLayer");
        C1342k1<Float> k1Var = this.$scale$delegate;
        float f = MenuKt.f2219a;
        vVar.mo6349g(k1Var.getValue().floatValue());
        vVar.mo6355o(this.$scale$delegate.getValue().floatValue());
        vVar.setAlpha(this.$alpha$delegate.getValue().floatValue());
        vVar.mo6345W(this.$transformOriginState.getValue().f3339a);
    }
}
