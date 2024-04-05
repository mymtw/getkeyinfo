package androidx.navigation;

import android.support.p013v4.media.C0072d;

/* renamed from: androidx.navigation.c */
public final class C2952c {

    /* renamed from: a */
    public final C2972n f6684a;

    /* renamed from: b */
    public final boolean f6685b;

    /* renamed from: c */
    public final boolean f6686c;

    /* renamed from: d */
    public final Object f6687d;

    public C2952c(C2972n<?> nVar, boolean z, Object obj, boolean z2) {
        if (!nVar.f6767a && z) {
            throw new IllegalArgumentException(nVar.mo10982b() + " does not allow nullable values");
        } else if (z || !z2 || obj != null) {
            this.f6684a = nVar;
            this.f6685b = z;
            this.f6687d = obj;
            this.f6686c = z2;
        } else {
            StringBuilder h = C0072d.m201h("Argument with type ");
            h.append(nVar.mo10982b());
            h.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(h.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2952c.class != obj.getClass()) {
            return false;
        }
        C2952c cVar = (C2952c) obj;
        if (this.f6685b != cVar.f6685b || this.f6686c != cVar.f6686c || !this.f6684a.equals(cVar.f6684a)) {
            return false;
        }
        Object obj2 = this.f6687d;
        return obj2 != null ? obj2.equals(cVar.f6687d) : cVar.f6687d == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f6684a.hashCode() * 31) + (this.f6685b ? 1 : 0)) * 31) + (this.f6686c ? 1 : 0)) * 31;
        Object obj = this.f6687d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
