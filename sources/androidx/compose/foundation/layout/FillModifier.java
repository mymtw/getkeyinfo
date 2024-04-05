package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1859o0;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p173m.C7279a;
import p174m0.C7280a;
import p753kq.C19857l;

public final class FillModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final Direction f1397c;

    /* renamed from: d */
    public final float f1398d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillModifier(Direction direction, float f, C19857l<? super C1859o0, C19394m> lVar) {
        super(lVar);
        C19383o.m32797g(direction, "direction");
        this.f1397c = direction;
        this.f1398d = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) obj;
            if (this.f1397c == fillModifier.f1397c) {
                if (this.f1398d == fillModifier.f1398d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1398d) + (this.f1397c.hashCode() * 31);
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        if (!C7280a.m13959d(j) || this.f1397c == Direction.Vertical) {
            i2 = C7280a.m13965j(j);
            i = C7280a.m13963h(j);
        } else {
            i2 = C19388s.m32833M(C7279a.m13954l(((float) C7280a.m13963h(j)) * this.f1398d), C7280a.m13965j(j), C7280a.m13963h(j));
            i = i2;
        }
        if (!C7280a.m13958c(j) || this.f1397c == Direction.Horizontal) {
            int i5 = C7280a.m13964i(j);
            i3 = C7280a.m13962g(j);
            i4 = i5;
        } else {
            i4 = C19388s.m32833M(C7279a.m13954l(((float) C7280a.m13962g(j)) * this.f1398d), C7280a.m13964i(j), C7280a.m13962g(j));
            i3 = i4;
        }
        C1686i0 J = uVar.mo6665J(C0114h.m313q(i2, i, i4, i3));
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new FillModifier$measure$1(J));
    }
}
