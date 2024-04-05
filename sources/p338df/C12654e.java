package p338df;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: df.e */
public final class C12654e {

    /* renamed from: a */
    public final long f27908a;

    /* renamed from: b */
    public final long f27909b;

    /* renamed from: c */
    public final String f27910c;

    /* renamed from: d */
    public final String f27911d;

    /* renamed from: e */
    public final boolean f27912e;

    /* renamed from: f */
    public final boolean f27913f;

    public C12654e(long j, long j2, String str, String str2, boolean z, boolean z2) {
        C19383o.m32797g(str2, "listingUrl");
        this.f27908a = j;
        this.f27909b = j2;
        this.f27910c = str;
        this.f27911d = str2;
        this.f27912e = z;
        this.f27913f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12654e)) {
            return false;
        }
        C12654e eVar = (C12654e) obj;
        return this.f27908a == eVar.f27908a && this.f27909b == eVar.f27909b && C19383o.m32792b(this.f27910c, eVar.f27910c) && C19383o.m32792b(this.f27911d, eVar.f27911d) && this.f27912e == eVar.f27912e && this.f27913f == eVar.f27913f;
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f27909b, Long.hashCode(this.f27908a) * 31, 31);
        String str = this.f27910c;
        int e = C0023f.m105e(this.f27911d, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.f27912e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        boolean z3 = this.f27913f;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingCardActionUiModel(listingId=");
        h.append(this.f27908a);
        h.append(", shopId=");
        h.append(this.f27909b);
        h.append(", contentSource=");
        h.append(this.f27910c);
        h.append(", listingUrl=");
        h.append(this.f27911d);
        h.append(", isFav=");
        h.append(this.f27912e);
        h.append(", isInCollections=");
        return C0391c.m1058d(h, this.f27913f, ')');
    }
}
