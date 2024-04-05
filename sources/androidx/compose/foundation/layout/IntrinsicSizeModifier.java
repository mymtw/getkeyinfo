package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public interface IntrinsicSizeModifier extends C1702p {
    /* renamed from: f */
    int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6664D(i);
    }

    /* renamed from: r */
    int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6669z(i);
    }

    /* renamed from: s */
    int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6668s(i);
    }

    /* renamed from: t */
    int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        return layoutNodeWrapper.mo6667i(i);
    }

    /* renamed from: t0 */
    long mo3944t0(C1713x xVar, C1710u uVar, long j);

    /* renamed from: v */
    C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(C0114h.m285P(j, mo3944t0(xVar, uVar, j)));
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new IntrinsicSizeModifier$measure$1(J));
    }
}
