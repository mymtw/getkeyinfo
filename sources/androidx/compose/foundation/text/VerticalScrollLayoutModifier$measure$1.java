package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.text.input.C2005w;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19857l;

public final class VerticalScrollLayoutModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $height;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ VerticalScrollLayoutModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerticalScrollLayoutModifier$measure$1(C1713x xVar, VerticalScrollLayoutModifier verticalScrollLayoutModifier, C1686i0 i0Var, int i) {
        super(1);
        this.$this_measure = xVar;
        this.this$0 = verticalScrollLayoutModifier;
        this.$placeable = i0Var;
        this.$height = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1713x xVar = this.$this_measure;
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = this.this$0;
        int i = verticalScrollLayoutModifier.f1971c;
        C2005w wVar = verticalScrollLayoutModifier.f1972d;
        C0965r invoke = verticalScrollLayoutModifier.f1973e.invoke();
        this.this$0.f1970b.mo4554b(Orientation.Vertical, C0962p.m2001a(xVar, i, wVar, invoke != null ? invoke.f2042a : null, false, this.$placeable.f3722b), this.$height, this.$placeable.f3723c);
        C1686i0.C1687a.m3583e(aVar, this.$placeable, 0, C7279a.m13954l(-this.this$0.f1970b.mo4553a()));
    }
}
