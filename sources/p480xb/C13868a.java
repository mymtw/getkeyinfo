package p480xb;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: xb.a */
public final class C13868a {

    /* renamed from: a */
    public final String f30512a;

    /* renamed from: b */
    public final String f30513b;

    /* renamed from: c */
    public final String f30514c;

    /* renamed from: d */
    public final String f30515d;

    /* renamed from: e */
    public final String f30516e;

    /* renamed from: f */
    public final String f30517f;

    /* renamed from: g */
    public final String f30518g;

    /* renamed from: h */
    public final String f30519h;

    /* renamed from: i */
    public final String f30520i;

    public C13868a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f30512a = str;
        this.f30513b = str2;
        this.f30514c = str3;
        this.f30515d = str4;
        this.f30516e = str5;
        this.f30517f = str6;
        this.f30518g = str7;
        this.f30519h = str8;
        this.f30520i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13868a)) {
            return false;
        }
        C13868a aVar = (C13868a) obj;
        return C19383o.m32792b(this.f30512a, aVar.f30512a) && C19383o.m32792b(this.f30513b, aVar.f30513b) && C19383o.m32792b(this.f30514c, aVar.f30514c) && C19383o.m32792b(this.f30515d, aVar.f30515d) && C19383o.m32792b(this.f30516e, aVar.f30516e) && C19383o.m32792b(this.f30517f, aVar.f30517f) && C19383o.m32792b(this.f30518g, aVar.f30518g) && C19383o.m32792b(this.f30519h, aVar.f30519h) && C19383o.m32792b(this.f30520i, aVar.f30520i);
    }

    public final int hashCode() {
        return this.f30520i.hashCode() + C0023f.m105e(this.f30519h, C0023f.m105e(this.f30518g, C0023f.m105e(this.f30517f, C0023f.m105e(this.f30516e, C0023f.m105e(this.f30515d, C0023f.m105e(this.f30514c, C0023f.m105e(this.f30513b, this.f30512a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BillingAddress(name=");
        h.append(this.f30512a);
        h.append(", address1=");
        h.append(this.f30513b);
        h.append(", address2=");
        h.append(this.f30514c);
        h.append(", address3=");
        h.append(this.f30515d);
        h.append(", postalCode=");
        h.append(this.f30516e);
        h.append(", sortingCode=");
        h.append(this.f30517f);
        h.append(", locality=");
        h.append(this.f30518g);
        h.append(", administrativeArea=");
        h.append(this.f30519h);
        h.append(", countryCode=");
        return C0391c.m1057c(h, this.f30520i, ')');
    }
}
