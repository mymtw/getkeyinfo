package androidx.compose.foundation;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ScrollingLayoutModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ int $side;
    public final /* synthetic */ ScrollingLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i, C1686i0 i0Var) {
        super(1);
        this.this$0 = scrollingLayoutModifier;
        this.$side = i;
        this.$placeable = i0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        ScrollState scrollState = this.this$0.f1285b;
        int i = this.$side;
        scrollState.f1282c.setValue(Integer.valueOf(i));
        if (scrollState.mo3693e() > i) {
            scrollState.f1280a.setValue(Integer.valueOf(i));
        }
        int i2 = 0;
        int M = C19388s.m32833M(this.this$0.f1285b.mo3693e(), 0, this.$side);
        ScrollingLayoutModifier scrollingLayoutModifier = this.this$0;
        int i3 = scrollingLayoutModifier.f1286c ? M - this.$side : -M;
        boolean z = scrollingLayoutModifier.f1287d;
        int i4 = z ? 0 : i3;
        if (z) {
            i2 = i3;
        }
        C1686i0.C1687a.m3584f(aVar, this.$placeable, i4, i2);
    }
}
