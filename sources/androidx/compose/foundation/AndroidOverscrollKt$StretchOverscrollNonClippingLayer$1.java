package androidx.compose.foundation;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7280a;
import p753kq.C19857l;
import p753kq.C19862q;

public final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends Lambda implements C19862q<C1713x, C1710u, C7280a, C1712w> {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 INSTANCE = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    public AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m34646invoke3p2s80s((C1713x) obj, (C1710u) obj2, ((C7280a) obj3).f16152a);
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final C1712w m34646invoke3p2s80s(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$layout");
        C19383o.m32797g(uVar, "measurable");
        final C1686i0 J = uVar.mo6665J(j);
        final int V = xVar.mo3791V(C0621i.f1364a * ((float) 2));
        return xVar.mo4387Z(J.mo6676o0() - V, J.mo6675i0() - V, C19294b0.m32559p0(), new C19857l<C1686i0.C1687a, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1686i0.C1687a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C1686i0.C1687a aVar) {
                C19383o.m32797g(aVar, "$this$layout");
                C1686i0 i0Var = J;
                int o0 = ((-V) / 2) - ((i0Var.f3722b - i0Var.mo6676o0()) / 2);
                C1686i0 i0Var2 = J;
                C1686i0.C1687a.m3586h(aVar, i0Var, o0, ((-V) / 2) - ((i0Var2.f3723c - i0Var2.mo6675i0()) / 2), (C19857l) null, 12);
            }
        });
    }
}
