package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19857l;

public final class MinimumTouchTargetModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $height;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimumTouchTargetModifier$measure$1(int i, C1686i0 i0Var, int i2) {
        super(1);
        this.$width = i;
        this.$placeable = i0Var;
        this.$height = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0.C1687a.m3581c(this.$placeable, C7279a.m13954l(((float) (this.$width - this.$placeable.f3722b)) / 2.0f), C7279a.m13954l(((float) (this.$height - this.$placeable.f3723c)) / 2.0f), 0.0f);
    }
}
