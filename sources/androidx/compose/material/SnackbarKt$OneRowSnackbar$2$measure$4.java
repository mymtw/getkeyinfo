package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SnackbarKt$OneRowSnackbar$2$measure$4 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $buttonPlaceX;
    public final /* synthetic */ int $buttonPlaceY;
    public final /* synthetic */ C1686i0 $buttonPlaceable;
    public final /* synthetic */ int $textPlaceY;
    public final /* synthetic */ C1686i0 $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(C1686i0 i0Var, int i, C1686i0 i0Var2, int i2, int i3) {
        super(1);
        this.$textPlaceable = i0Var;
        this.$textPlaceY = i;
        this.$buttonPlaceable = i0Var2;
        this.$buttonPlaceX = i2;
        this.$buttonPlaceY = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0.C1687a.m3583e(aVar, this.$textPlaceable, 0, this.$textPlaceY);
        C1686i0.C1687a.m3583e(aVar, this.$buttonPlaceable, this.$buttonPlaceX, this.$buttonPlaceY);
    }
}
