package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
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

public final class OffsetModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f1410c;

    /* renamed from: d */
    public final float f1411d;

    /* renamed from: e */
    public final boolean f1412e;

    public OffsetModifier() {
        throw null;
    }

    public OffsetModifier(float f, float f2) {
        super(InspectableValueKt.f4032a);
        this.f1410c = f;
        this.f1411d = f2;
        this.f1412e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetModifier offsetModifier = obj instanceof OffsetModifier ? (OffsetModifier) obj : null;
        if (offsetModifier == null) {
            return false;
        }
        return C7284d.m13983a(this.f1410c, offsetModifier.f1410c) && C7284d.m13983a(this.f1411d, offsetModifier.f1411d) && this.f1412e == offsetModifier.f1412e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1412e) + C0023f.m104c(this.f1411d, Float.hashCode(this.f1410c) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("OffsetModifier(x=");
        h.append(C7284d.m13984c(this.f1410c));
        h.append(", y=");
        h.append(C7284d.m13984c(this.f1411d));
        h.append(", rtlAware=");
        return C0391c.m1058d(h, this.f1412e, ')');
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new OffsetModifier$measure$1(this, J, xVar));
    }
}
