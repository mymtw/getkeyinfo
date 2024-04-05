package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class PaddingValuesModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final C0759v f1420c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaddingValuesModifier(androidx.compose.foundation.layout.C0759v r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "paddingValues"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1420c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.PaddingValuesModifier.<init>(androidx.compose.foundation.layout.v):void");
    }

    public final boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier = obj instanceof PaddingValuesModifier ? (PaddingValuesModifier) obj : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return C19383o.m32792b(this.f1420c, paddingValuesModifier.f1420c);
    }

    public final int hashCode() {
        return this.f1420c.hashCode();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        boolean z = false;
        float f = (float) 0;
        if (Float.compare(this.f1420c.mo4151b(xVar.getLayoutDirection()), f) >= 0 && Float.compare(this.f1420c.mo4153d(), f) >= 0 && Float.compare(this.f1420c.mo4152c(xVar.getLayoutDirection()), f) >= 0 && Float.compare(this.f1420c.mo4150a(), f) >= 0) {
            z = true;
        }
        if (z) {
            int V = xVar.mo3791V(this.f1420c.mo4152c(xVar.getLayoutDirection())) + xVar.mo3791V(this.f1420c.mo4151b(xVar.getLayoutDirection()));
            int V2 = xVar.mo3791V(this.f1420c.mo4150a()) + xVar.mo3791V(this.f1420c.mo4153d());
            C1686i0 J = uVar.mo6665J(C0114h.m312p0(-V, -V2, j));
            return xVar.mo4387Z(C0114h.m287R(J.f3722b + V, j), C0114h.m286Q(J.f3723c + V2, j), C19294b0.m32559p0(), new PaddingValuesModifier$measure$2(J, xVar, this));
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
