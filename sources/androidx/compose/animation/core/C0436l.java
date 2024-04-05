package androidx.compose.animation.core;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.core.l */
public final class C0436l {

    /* renamed from: a */
    public double f1148a;

    /* renamed from: b */
    public double f1149b;

    public C0436l(double d, double d2) {
        this.f1148a = d;
        this.f1149b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0436l)) {
            return false;
        }
        C0436l lVar = (C0436l) obj;
        return C19383o.m32792b(Double.valueOf(this.f1148a), Double.valueOf(lVar.f1148a)) && C19383o.m32792b(Double.valueOf(this.f1149b), Double.valueOf(lVar.f1149b));
    }

    public final int hashCode() {
        return Double.hashCode(this.f1149b) + (Double.hashCode(this.f1148a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ComplexDouble(_real=");
        h.append(this.f1148a);
        h.append(", _imaginary=");
        h.append(this.f1149b);
        h.append(')');
        return h.toString();
    }
}
