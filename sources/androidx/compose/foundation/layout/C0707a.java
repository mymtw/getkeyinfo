package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p003a2.C0023f;
import p174m0.C7280a;
import p174m0.C7284d;

/* renamed from: androidx.compose.foundation.layout.a */
public final class C0707a extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final C1665a f1460c;

    /* renamed from: d */
    public final float f1461d;

    /* renamed from: e */
    public final float f1462e;

    public C0707a() {
        throw null;
    }

    public C0707a(C1679f fVar, float f, float f2) {
        super(InspectableValueKt.f4032a);
        this.f1460c = fVar;
        this.f1461d = f;
        this.f1462e = f2;
        if (!((f >= 0.0f || C7284d.m13983a(f, Float.NaN)) && (f2 >= 0.0f || C7284d.m13983a(f2, Float.NaN)))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0707a aVar = obj instanceof C0707a ? (C0707a) obj : null;
        if (aVar == null) {
            return false;
        }
        return C19383o.m32792b(this.f1460c, aVar.f1460c) && C7284d.m13983a(this.f1461d, aVar.f1461d) && C7284d.m13983a(this.f1462e, aVar.f1462e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f1462e) + C0023f.m104c(this.f1461d, this.f1460c.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AlignmentLineOffset(alignmentLine=");
        h.append(this.f1460c);
        h.append(", before=");
        h.append(C7284d.m13984c(this.f1461d));
        h.append(", after=");
        h.append(C7284d.m13984c(this.f1462e));
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C1713x xVar2 = xVar;
        C1710u uVar2 = uVar;
        C19383o.m32797g(xVar2, "$this$measure");
        C19383o.m32797g(uVar2, "measurable");
        C1665a aVar = this.f1460c;
        float f = this.f1461d;
        float f2 = this.f1462e;
        boolean z = aVar instanceof C1679f;
        C1686i0 J = uVar2.mo6665J(z ? C7280a.m13956a(j, 0, 0, 0, 0, 11) : C7280a.m13956a(j, 0, 0, 0, 0, 14));
        int M = J.mo6661M(aVar);
        if (M == Integer.MIN_VALUE) {
            M = 0;
        }
        int i = z ? J.f3723c : J.f3722b;
        int g = (z ? C7280a.m13962g(j) : C7280a.m13963h(j)) - i;
        int M2 = C19388s.m32833M((!C7284d.m13983a(f, Float.NaN) ? xVar2.mo3791V(f) : 0) - M, 0, g);
        int M3 = C19388s.m32833M(((!C7284d.m13983a(f2, Float.NaN) ? xVar2.mo3791V(f2) : 0) - i) + M, 0, g - M2);
        int max = z ? J.f3722b : Math.max(J.f3722b + M2 + M3, C7280a.m13965j(j));
        int max2 = z ? Math.max(J.f3723c + M2 + M3, C7280a.m13964i(j)) : J.f3723c;
        return xVar2.mo4387Z(max, max2, C19294b0.m32559p0(), new AlignmentLineKt$alignmentLineOffsetMeasure$1(aVar, f, M2, max, M3, J, max2));
    }
}
