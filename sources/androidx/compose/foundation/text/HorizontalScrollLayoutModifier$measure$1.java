package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C2005w;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19857l;

public final class HorizontalScrollLayoutModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ int $width;
    public final /* synthetic */ HorizontalScrollLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalScrollLayoutModifier$measure$1(C1713x xVar, HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, C1686i0 i0Var, int i) {
        super(1);
        this.$this_measure = xVar;
        this.this$0 = horizontalScrollLayoutModifier;
        this.$placeable = i0Var;
        this.$width = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1713x xVar = this.$this_measure;
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = this.this$0;
        int i = horizontalScrollLayoutModifier.f1917c;
        C2005w wVar = horizontalScrollLayoutModifier.f1918d;
        C0965r invoke = horizontalScrollLayoutModifier.f1919e.invoke();
        this.this$0.f1916b.mo4554b(Orientation.Horizontal, C0962p.m2001a(xVar, i, wVar, invoke != null ? invoke.f2042a : null, this.$this_measure.getLayoutDirection() == LayoutDirection.Rtl, this.$placeable.f3722b), this.$width, this.$placeable.f3722b);
        C1686i0.C1687a.m3583e(aVar, this.$placeable, C7279a.m13954l(-this.this$0.f1916b.mo4553a()), 0);
    }
}
