package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class SnackbarKt$TextOnlySnackbar$2$measure$4 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $containerHeight;
    public final /* synthetic */ C1686i0 $textPlaceable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$TextOnlySnackbar$2$measure$4(int i, C1686i0 i0Var) {
        super(1);
        this.$containerHeight = i;
        this.$textPlaceable = i0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        int i = this.$containerHeight;
        C1686i0 i0Var = this.$textPlaceable;
        C1686i0.C1687a.m3583e(aVar, i0Var, 0, (i - i0Var.f3723c) / 2);
    }
}
