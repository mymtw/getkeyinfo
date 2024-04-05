package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7287g;
import p753kq.C19857l;

public final class OffsetPxModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final C19857l<C7282b, C7287g> f1413c;

    /* renamed from: d */
    public final boolean f1414d = true;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OffsetPxModifier(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "offset"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1413c = r3
            r3 = 1
            r2.f1414d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.OffsetPxModifier.<init>(kq.l):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxModifier offsetPxModifier = obj instanceof OffsetPxModifier ? (OffsetPxModifier) obj : null;
        if (offsetPxModifier == null) {
            return false;
        }
        return C19383o.m32792b(this.f1413c, offsetPxModifier.f1413c) && this.f1414d == offsetPxModifier.f1414d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1414d) + (this.f1413c.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OffsetPxModifier(offset=");
        h.append(this.f1413c);
        h.append(", rtlAware=");
        return C0391c.m1058d(h, this.f1414d, ')');
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new OffsetPxModifier$measure$1(this, xVar, J));
    }
}
