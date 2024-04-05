package p087e0;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: e0.c */
public final class C6684c {

    /* renamed from: a */
    public final List<Float> f14747a;

    /* renamed from: b */
    public final float f14748b;

    public C6684c(ArrayList arrayList, float f) {
        this.f14747a = arrayList;
        this.f14748b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6684c)) {
            return false;
        }
        C6684c cVar = (C6684c) obj;
        return C19383o.m32792b(this.f14747a, cVar.f14747a) && C19383o.m32792b(Float.valueOf(this.f14748b), Float.valueOf(cVar.f14748b));
    }

    public final int hashCode() {
        return Float.hashCode(this.f14748b) + (this.f14747a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PolynomialFit(coefficients=");
        h.append(this.f14747a);
        h.append(", confidence=");
        return C0388a.m1048d(h, this.f14748b, ')');
    }
}
