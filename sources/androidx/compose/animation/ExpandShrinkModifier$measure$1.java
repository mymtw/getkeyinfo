package androidx.compose.animation;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class ExpandShrinkModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ long $offset;
    public final /* synthetic */ long $offsetDelta;
    public final /* synthetic */ C1686i0 $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$1(C1686i0 i0Var, long j, long j2) {
        super(1);
        this.$placeable = i0Var;
        this.$offset = j;
        this.$offsetDelta = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0 i0Var = this.$placeable;
        long j = this.$offset;
        int i = C7287g.f16165c;
        C1686i0.C1687a.m3581c(i0Var, ((int) (this.$offsetDelta >> 32)) + ((int) (j >> 32)), C7287g.m13992b(this.$offsetDelta) + C7287g.m13992b(j), 0.0f);
    }
}
