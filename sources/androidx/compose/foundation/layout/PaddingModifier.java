package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p174m0.C7284d;

public final class PaddingModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f1415c;

    /* renamed from: d */
    public final float f1416d;

    /* renamed from: e */
    public final float f1417e;

    /* renamed from: f */
    public final float f1418f;

    /* renamed from: g */
    public final boolean f1419g;

    public PaddingModifier() {
        throw null;
    }

    public PaddingModifier(float f, float f2, float f3, float f4) {
        super(InspectableValueKt.f4032a);
        this.f1415c = f;
        this.f1416d = f2;
        this.f1417e = f3;
        this.f1418f = f4;
        boolean z = true;
        this.f1419g = true;
        if ((f < 0.0f && !C7284d.m13983a(f, Float.NaN)) || ((f2 < 0.0f && !C7284d.m13983a(f2, Float.NaN)) || ((f3 < 0.0f && !C7284d.m13983a(f3, Float.NaN)) || (f4 < 0.0f && !C7284d.m13983a(f4, Float.NaN))))) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public final boolean equals(Object obj) {
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        return paddingModifier != null && C7284d.m13983a(this.f1415c, paddingModifier.f1415c) && C7284d.m13983a(this.f1416d, paddingModifier.f1416d) && C7284d.m13983a(this.f1417e, paddingModifier.f1417e) && C7284d.m13983a(this.f1418f, paddingModifier.f1418f) && this.f1419g == paddingModifier.f1419g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1419g) + C0023f.m104c(this.f1418f, C0023f.m104c(this.f1417e, C0023f.m104c(this.f1416d, Float.hashCode(this.f1415c) * 31, 31), 31), 31);
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        int V = xVar.mo3791V(this.f1417e) + xVar.mo3791V(this.f1415c);
        int V2 = xVar.mo3791V(this.f1418f) + xVar.mo3791V(this.f1416d);
        C1686i0 J = uVar.mo6665J(C0114h.m312p0(-V, -V2, j));
        return xVar.mo4387Z(C0114h.m287R(J.f3722b + V, j), C0114h.m286Q(J.f3723c + V2, j), C19294b0.m32559p0(), new PaddingModifier$measure$1(this, J, xVar));
    }
}
