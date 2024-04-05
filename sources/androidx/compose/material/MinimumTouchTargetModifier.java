package androidx.compose.material;

import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7286f;

public final class MinimumTouchTargetModifier implements C1702p {

    /* renamed from: b */
    public final long f2226b;

    public MinimumTouchTargetModifier(long j) {
        this.f2226b = j;
    }

    public final boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier = obj instanceof MinimumTouchTargetModifier ? (MinimumTouchTargetModifier) obj : null;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        long j = this.f2226b;
        long j2 = minimumTouchTargetModifier.f2226b;
        int i = C7286f.f16162d;
        return j == j2;
    }

    public final int hashCode() {
        long j = this.f2226b;
        int i = C7286f.f16162d;
        return Long.hashCode(j);
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        int max = Math.max(J.f3722b, xVar.mo3791V(C7286f.m13989b(this.f2226b)));
        int max2 = Math.max(J.f3723c, xVar.mo3791V(C7286f.m13988a(this.f2226b)));
        return xVar.mo4387Z(max, max2, C19294b0.m32559p0(), new MinimumTouchTargetModifier$measure$1(max, J, max2));
    }
}
