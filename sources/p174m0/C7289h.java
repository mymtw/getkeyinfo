package p174m0;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: m0.h */
public final class C7289h {

    /* renamed from: a */
    public final int f16167a;

    /* renamed from: b */
    public final int f16168b;

    /* renamed from: c */
    public final int f16169c;

    /* renamed from: d */
    public final int f16170d;

    public C7289h(int i, int i2, int i3, int i4) {
        this.f16167a = i;
        this.f16168b = i2;
        this.f16169c = i3;
        this.f16170d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7289h)) {
            return false;
        }
        C7289h hVar = (C7289h) obj;
        return this.f16167a == hVar.f16167a && this.f16168b == hVar.f16168b && this.f16169c == hVar.f16169c && this.f16170d == hVar.f16170d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16170d) + C0069a.m170a(this.f16169c, C0069a.m170a(this.f16168b, Integer.hashCode(this.f16167a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("IntRect.fromLTRB(");
        h.append(this.f16167a);
        h.append(", ");
        h.append(this.f16168b);
        h.append(", ");
        h.append(this.f16169c);
        h.append(", ");
        return C0073e.m208h(h, this.f16170d, ')');
    }
}
