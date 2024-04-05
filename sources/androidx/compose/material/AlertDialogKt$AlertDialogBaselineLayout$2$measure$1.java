package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $textPlaceable;
    public final /* synthetic */ int $textPositionY;
    public final /* synthetic */ C1686i0 $titlePlaceable;
    public final /* synthetic */ int $titlePositionY;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(C1686i0 i0Var, int i, C1686i0 i0Var2, int i2) {
        super(1);
        this.$titlePlaceable = i0Var;
        this.$titlePositionY = i;
        this.$textPlaceable = i0Var2;
        this.$textPositionY = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0 i0Var = this.$titlePlaceable;
        if (i0Var != null) {
            C1686i0.C1687a.m3581c(i0Var, 0, this.$titlePositionY, 0.0f);
        }
        C1686i0 i0Var2 = this.$textPlaceable;
        if (i0Var2 != null) {
            C1686i0.C1687a.m3581c(i0Var2, 0, this.$textPositionY, 0.0f);
        }
    }
}
