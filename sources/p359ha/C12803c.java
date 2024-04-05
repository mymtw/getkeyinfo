package p359ha;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: ha.c */
public final class C12803c {

    /* renamed from: a */
    public final String f28285a;

    /* renamed from: b */
    public final String f28286b;

    /* renamed from: c */
    public final String f28287c;

    /* renamed from: d */
    public final double f28288d;

    /* renamed from: e */
    public final int f28289e;

    public C12803c(String str, double d, String str2, int i, String str3) {
        this.f28285a = str;
        this.f28286b = str2;
        this.f28287c = str3;
        this.f28288d = d;
        this.f28289e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12803c)) {
            return false;
        }
        C12803c cVar = (C12803c) obj;
        return C19383o.m32792b(this.f28285a, cVar.f28285a) && C19383o.m32792b(this.f28286b, cVar.f28286b) && C19383o.m32792b(this.f28287c, cVar.f28287c) && C19383o.m32792b(Double.valueOf(this.f28288d), Double.valueOf(cVar.f28288d)) && this.f28289e == cVar.f28289e;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f28286b, this.f28285a.hashCode() * 31, 31);
        String str = this.f28287c;
        int hashCode = str == null ? 0 : str.hashCode();
        return Integer.hashCode(this.f28289e) + ((Double.hashCode(this.f28288d) + ((e + hashCode) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PurchaseItem(id=");
        h.append(this.f28285a);
        h.append(", name=");
        h.append(this.f28286b);
        h.append(", category=");
        h.append(this.f28287c);
        h.append(", price=");
        h.append(this.f28288d);
        h.append(", quantity=");
        return C0073e.m208h(h, this.f28289e, ')');
    }
}
