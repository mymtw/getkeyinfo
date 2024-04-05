package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class PaddingModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ PaddingModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingModifier$measure$1(PaddingModifier paddingModifier, C1686i0 i0Var, C1713x xVar) {
        super(1);
        this.this$0 = paddingModifier;
        this.$placeable = i0Var;
        this.$this_measure = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        PaddingModifier paddingModifier = this.this$0;
        if (paddingModifier.f1419g) {
            C1686i0.C1687a.m3583e(aVar, this.$placeable, this.$this_measure.mo3791V(paddingModifier.f1415c), this.$this_measure.mo3791V(this.this$0.f1416d));
        } else {
            C1686i0.C1687a.m3581c(this.$placeable, this.$this_measure.mo3791V(paddingModifier.f1415c), this.$this_measure.mo3791V(this.this$0.f1416d), 0.0f);
        }
    }
}
