package androidx.compose.animation;

import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7287g;
import p753kq.C19857l;

public final class SlideModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ long $measuredSize;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1(SlideModifier slideModifier, C1686i0 i0Var, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$placeable = i0Var;
        this.$measuredSize = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        SlideModifier slideModifier = this.this$0;
        C1686i0.C1687a.m3588j(aVar, this.$placeable, ((C7287g) slideModifier.f998b.mo3418a(slideModifier.f1001e, new SlideModifier$measure$1$slideOffset$1(slideModifier, this.$measuredSize)).getValue()).f16166a);
    }
}
