package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1606z;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p174m0.C7282b;
import p202p.C7645g;
import p288y.C8345d;
import p288y.C8347f;
import p628nj.C18263b;

/* renamed from: androidx.compose.material.f */
public final class C1182f implements C1530k0 {

    /* renamed from: a */
    public final C1530k0 f2432a;

    /* renamed from: b */
    public final C1227r0 f2433b;

    public C1182f(C1530k0 k0Var, C1227r0 r0Var) {
        C19383o.m32797g(r0Var, "fabPlacement");
        this.f2432a = k0Var;
        this.f2433b = r0Var;
    }

    /* renamed from: a */
    public final C1606z mo3864a(long j, LayoutDirection layoutDirection, C7282b bVar) {
        C1521g gVar;
        C1521g gVar2;
        LayoutDirection layoutDirection2 = layoutDirection;
        C7282b bVar2 = bVar;
        C19383o.m32797g(layoutDirection2, "layoutDirection");
        C19383o.m32797g(bVar2, "density");
        C1521g d = C18263b.m30838d();
        d.mo6284k(new C8345d(0.0f, 0.0f, C8347f.m16656d(j), C8347f.m16654b(j)));
        C1521g d2 = C18263b.m30838d();
        float B0 = bVar2.mo3789B0(AppBarKt.f2173e);
        C1227r0 r0Var = this.f2433b;
        float f = ((float) 2) * B0;
        long t = C0114h.m319t(((float) r0Var.f2552c) + f, ((float) r0Var.f2553d) + f);
        float f2 = ((float) this.f2433b.f2551b) - B0;
        float d3 = C8347f.m16656d(t) + f2;
        float b = C8347f.m16654b(t) / 2.0f;
        float f3 = -b;
        C1606z a = this.f2432a.mo3864a(t, layoutDirection2, bVar2);
        C19383o.m32797g(a, "outline");
        if (a instanceof C1606z.C1608b) {
            d2.mo6284k(((C1606z.C1608b) a).f3572a);
        } else if (a instanceof C1606z.C1609c) {
            d2.mo6277d(((C1606z.C1609c) a).f3573a);
        } else if (a instanceof C1606z.C1607a) {
            C1492b0.m3195i(d2, ((C1606z.C1607a) a).f3571a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        d2.mo6340p(C19421p.m32952q(f2, f3));
        if (C19383o.m32792b(this.f2432a, C7645g.f16941a)) {
            float B02 = bVar2.mo3789B0(AppBarKt.f2174f);
            float f4 = b * b;
            float f5 = -((float) Math.sqrt((double) (f4 - 0.0f)));
            float f6 = b + f5;
            float f7 = f2 + f6;
            float f8 = d3 - f6;
            float f9 = f5 - 1.0f;
            float f10 = (f9 * f9) + 0.0f;
            float f11 = f9 * f4;
            float f12 = f9;
            double d4 = (double) ((f10 - f4) * f4 * 0.0f);
            gVar = d;
            C1521g gVar3 = d2;
            float sqrt = (f11 - ((float) Math.sqrt(d4))) / f10;
            float sqrt2 = (f11 + ((float) Math.sqrt(d4))) / f10;
            float sqrt3 = (float) Math.sqrt((double) (f4 - (sqrt * sqrt)));
            float sqrt4 = (float) Math.sqrt((double) (f4 - (sqrt2 * sqrt2)));
            Pair pair = sqrt3 < sqrt4 ? new Pair(Float.valueOf(sqrt), Float.valueOf(sqrt3)) : new Pair(Float.valueOf(sqrt2), Float.valueOf(sqrt4));
            float floatValue = ((Number) pair.component1()).floatValue();
            float floatValue2 = ((Number) pair.component2()).floatValue();
            if (floatValue < f12) {
                floatValue2 = -floatValue2;
            }
            Pair pair2 = new Pair(Float.valueOf(floatValue), Float.valueOf(floatValue2));
            float floatValue3 = ((Number) pair2.component1()).floatValue() + b;
            float floatValue4 = ((Number) pair2.component2()).floatValue() - 0.0f;
            gVar2 = gVar3;
            gVar2.mo6280g(f7 - B02, 0.0f);
            gVar2.mo6278e(f7 - 1.0f, 0.0f, f2 + floatValue3, floatValue4);
            gVar2.mo6286m(d3 - floatValue3, floatValue4);
            gVar2.mo6278e(f8 + 1.0f, 0.0f, B02 + f8, 0.0f);
            gVar2.close();
        } else {
            gVar = d;
            gVar2 = d2;
        }
        gVar2.mo6283j(gVar, gVar2, 0);
        return new C1606z.C1607a(gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1182f)) {
            return false;
        }
        C1182f fVar = (C1182f) obj;
        return C19383o.m32792b(this.f2432a, fVar.f2432a) && C19383o.m32792b(this.f2433b, fVar.f2433b);
    }

    public final int hashCode() {
        return this.f2433b.hashCode() + (this.f2432a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BottomAppBarCutoutShape(cutoutShape=");
        h.append(this.f2432a);
        h.append(", fabPlacement=");
        h.append(this.f2433b);
        h.append(')');
        return h.toString();
    }
}
