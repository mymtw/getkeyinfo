package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class InsetsPaddingModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $left;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ int $top;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsPaddingModifier$measure$1(C1686i0 i0Var, int i, int i2) {
        super(1);
        this.$placeable = i0Var;
        this.$left = i;
        this.$top = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0.C1687a.m3581c(this.$placeable, this.$left, this.$top, 0.0f);
    }
}
