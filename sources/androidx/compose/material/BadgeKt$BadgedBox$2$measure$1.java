package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class BadgeKt$BadgedBox$2$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $anchorPlaceable;
    public final /* synthetic */ C1686i0 $badgePlaceable;
    public final /* synthetic */ C1713x $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$measure$1(C1686i0 i0Var, C1713x xVar, C1686i0 i0Var2) {
        super(1);
        this.$badgePlaceable = i0Var;
        this.$this_Layout = xVar;
        this.$anchorPlaceable = i0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        float f;
        C19383o.m32797g(aVar, "$this$layout");
        if (this.$badgePlaceable.f3722b > this.$this_Layout.mo3791V(C1179e.f2415a) * 2) {
            f = C1179e.f2419e;
        } else {
            f = C1179e.f2420f;
        }
        C1686i0.C1687a.m3583e(aVar, this.$anchorPlaceable, 0, 0);
        int V = this.$this_Layout.mo3791V(f) + this.$anchorPlaceable.f3722b;
        C1686i0 i0Var = this.$badgePlaceable;
        C1686i0.C1687a.m3583e(aVar, i0Var, V, (-i0Var.f3723c) / 2);
    }
}
