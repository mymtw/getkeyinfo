package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: androidx.compose.foundation.layout.q */
public final class C0754q {

    /* renamed from: a */
    public final int f1545a;

    /* renamed from: b */
    public final int f1546b;

    /* renamed from: c */
    public final int f1547c;

    /* renamed from: d */
    public final int f1548d;

    public C0754q(int i, int i2, int i3, int i4) {
        this.f1545a = i;
        this.f1546b = i2;
        this.f1547c = i3;
        this.f1548d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0754q)) {
            return false;
        }
        C0754q qVar = (C0754q) obj;
        return this.f1545a == qVar.f1545a && this.f1546b == qVar.f1546b && this.f1547c == qVar.f1547c && this.f1548d == qVar.f1548d;
    }

    public final int hashCode() {
        return (((((this.f1545a * 31) + this.f1546b) * 31) + this.f1547c) * 31) + this.f1548d;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("InsetsValues(left=");
        h.append(this.f1545a);
        h.append(", top=");
        h.append(this.f1546b);
        h.append(", right=");
        h.append(this.f1547c);
        h.append(", bottom=");
        return C0073e.m208h(h, this.f1548d, ')');
    }
}
