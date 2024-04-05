package androidx.compose.foundation.layout;

import androidx.compose.p015ui.graphics.C1549v;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p174m0.C7287g;
import p753kq.C19857l;

public final class IntrinsicSizeModifier$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $placeable;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntrinsicSizeModifier$measure$1(C1686i0 i0Var) {
        super(1);
        this.$placeable = i0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        C1686i0 i0Var = this.$placeable;
        int i = C7287g.f16165c;
        long j = C7287g.f16164b;
        C1686i0.C1687a.C1688a aVar2 = C1686i0.C1687a.f3726a;
        C19383o.m32797g(i0Var, "$this$placeRelative");
        if (aVar.mo6680a() == LayoutDirection.Ltr || aVar.mo6681b() == 0) {
            long X = i0Var.mo6674X();
            i0Var.mo6662q0(C19421p.m32949o(((int) (j >> 32)) + ((int) (X >> 32)), C7287g.m13992b(X) + C7287g.m13992b(j)), 0.0f, (C19857l<? super C1549v, C19394m>) null);
            return;
        }
        long o = C19421p.m32949o((aVar.mo6681b() - ((int) (i0Var.f3724d >> 32))) - ((int) (j >> 32)), C7287g.m13992b(j));
        long X2 = i0Var.mo6674X();
        i0Var.mo6662q0(C19421p.m32949o(((int) (o >> 32)) + ((int) (X2 >> 32)), C7287g.m13992b(X2) + C7287g.m13992b(o)), 0.0f, (C19857l<? super C1549v, C19394m>) null);
    }
}
