package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BottomNavigationKt$placeIcon$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $iconPlaceable;
    public final /* synthetic */ int $iconY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeIcon$1(C1686i0 i0Var, int i) {
        super(1);
        this.$iconPlaceable = i0Var;
        this.$iconY = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0.C1687a.m3583e(aVar, this.$iconPlaceable, 0, this.$iconY);
    }
}
