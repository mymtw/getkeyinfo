package p087e0;

import android.support.p013v4.media.C0072d;
import p003a2.C0015b;
import p288y.C8343c;

/* renamed from: e0.b */
public final class C6683b {

    /* renamed from: a */
    public final long f14745a;

    /* renamed from: b */
    public final long f14746b;

    public C6683b(long j, long j2) {
        this.f14745a = j;
        this.f14746b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6683b)) {
            return false;
        }
        C6683b bVar = (C6683b) obj;
        return C8343c.m16640a(this.f14745a, bVar.f14745a) && this.f14746b == bVar.f14746b;
    }

    public final int hashCode() {
        long j = this.f14745a;
        int i = C8343c.f18298e;
        return Long.hashCode(this.f14746b) + (Long.hashCode(j) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PointAtTime(point=");
        h.append(C8343c.m16647h(this.f14745a));
        h.append(", time=");
        return C0015b.m91j(h, this.f14746b, ')');
    }
}
