package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class OffsetPxModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ OffsetPxModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, C1713x xVar, C1686i0 i0Var) {
        super(1);
        this.this$0 = offsetPxModifier;
        this.$this_measure = xVar;
        this.$placeable = i0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        long j = this.this$0.f1413c.invoke(this.$this_measure).f16166a;
        if (this.this$0.f1414d) {
            C1686i0.C1687a.m3584f(aVar, this.$placeable, (int) (j >> 32), C7287g.m13992b(j));
            return;
        }
        C1686i0.C1687a.m3586h(aVar, this.$placeable, (int) (j >> 32), C7287g.m13992b(j), (C19857l) null, 12);
    }
}
