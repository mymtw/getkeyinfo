package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7280a;
import p174m0.C7284d;

public final class UnspecifiedConstraintsModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f1440c;

    /* renamed from: d */
    public final float f1441d;

    public UnspecifiedConstraintsModifier() {
        throw null;
    }

    public UnspecifiedConstraintsModifier(float f, float f2) {
        super(InspectableValueKt.f4032a);
        this.f1440c = f;
        this.f1441d = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
        return C7284d.m13983a(this.f1440c, unspecifiedConstraintsModifier.f1440c) && C7284d.m13983a(this.f1441d, unspecifiedConstraintsModifier.f1441d);
    }

    /* renamed from: f */
    public final int mo3562f(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        int D = layoutNodeWrapper.mo6664D(i);
        int V = !C7284d.m13983a(this.f1440c, Float.NaN) ? xVar.mo3791V(this.f1440c) : 0;
        return D < V ? V : D;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1441d) + (Float.hashCode(this.f1440c) * 31);
    }

    /* renamed from: r */
    public final int mo3563r(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        int z = layoutNodeWrapper.mo6669z(i);
        int V = !C7284d.m13983a(this.f1440c, Float.NaN) ? xVar.mo3791V(this.f1440c) : 0;
        return z < V ? V : z;
    }

    /* renamed from: s */
    public final int mo3564s(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        int s = layoutNodeWrapper.mo6668s(i);
        int V = !C7284d.m13983a(this.f1441d, Float.NaN) ? xVar.mo3791V(this.f1441d) : 0;
        return s < V ? V : s;
    }

    /* renamed from: t */
    public final int mo3565t(C1713x xVar, LayoutNodeWrapper layoutNodeWrapper, int i) {
        C19383o.m32797g(xVar, "<this>");
        C19383o.m32797g(layoutNodeWrapper, "measurable");
        int i2 = layoutNodeWrapper.mo6667i(i);
        int V = !C7284d.m13983a(this.f1441d, Float.NaN) ? xVar.mo3791V(this.f1441d) : 0;
        return i2 < V ? V : i2;
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        int i;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        int i2 = 0;
        if (C7284d.m13983a(this.f1440c, Float.NaN) || C7280a.m13965j(j) != 0) {
            i = C7280a.m13965j(j);
        } else {
            i = xVar.mo3791V(this.f1440c);
            int h = C7280a.m13963h(j);
            if (i > h) {
                i = h;
            }
            if (i < 0) {
                i = 0;
            }
        }
        int h2 = C7280a.m13963h(j);
        if (C7284d.m13983a(this.f1441d, Float.NaN) || C7280a.m13964i(j) != 0) {
            i2 = C7280a.m13964i(j);
        } else {
            int V = xVar.mo3791V(this.f1441d);
            int g = C7280a.m13962g(j);
            if (V > g) {
                V = g;
            }
            if (V >= 0) {
                i2 = V;
            }
        }
        C1686i0 J = uVar.mo6665J(C0114h.m313q(i, h2, i2, C7280a.m13962g(j)));
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new UnspecifiedConstraintsModifier$measure$1(J));
    }
}
