package p375jd;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: jd.d */
public final class C12974d extends C10423j {

    /* renamed from: a */
    public final String f28564a;

    /* renamed from: b */
    public final String f28565b;

    /* renamed from: c */
    public final C10563f f28566c;

    /* renamed from: d */
    public final boolean f28567d;

    /* renamed from: e */
    public final String f28568e;

    /* renamed from: f */
    public final boolean f28569f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12974d(String str, String str2, C10563f fVar, boolean z, String str3, int i) {
        this(str, str2, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str3, false);
    }

    /* renamed from: b */
    public static C12974d m20657b(C12974d dVar, C10563f fVar, boolean z, int i) {
        String str = null;
        String str2 = (i & 1) != 0 ? dVar.f28564a : null;
        String str3 = (i & 2) != 0 ? dVar.f28565b : null;
        if ((i & 4) != 0) {
            fVar = dVar.f28566c;
        }
        C10563f fVar2 = fVar;
        boolean z2 = (i & 8) != 0 ? dVar.f28567d : false;
        if ((i & 16) != 0) {
            str = dVar.f28568e;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            z = dVar.f28569f;
        }
        C19383o.m32797g(str2, "discountPrice");
        C19383o.m32797g(str3, "originalPrice");
        return new C12974d(str2, str3, fVar2, z2, str4, z);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.PRICE_WITH_DISCOUNT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12974d)) {
            return false;
        }
        C12974d dVar = (C12974d) obj;
        return C19383o.m32792b(this.f28564a, dVar.f28564a) && C19383o.m32792b(this.f28565b, dVar.f28565b) && C19383o.m32792b(this.f28566c, dVar.f28566c) && this.f28567d == dVar.f28567d && C19383o.m32792b(this.f28568e, dVar.f28568e) && this.f28569f == dVar.f28569f;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f28565b, this.f28564a.hashCode() * 31, 31);
        C10563f fVar = this.f28566c;
        int i = 0;
        int hashCode = (e + (fVar == null ? 0 : fVar.hashCode())) * 31;
        boolean z = this.f28567d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f28568e;
        if (str != null) {
            i = str.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.f28569f;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PriceWithDiscount(discountPrice=");
        h.append(this.f28564a);
        h.append(", originalPrice=");
        h.append(this.f28565b);
        h.append(", shippingPrice=");
        h.append(this.f28566c);
        h.append(", hasFreeShipping=");
        h.append(this.f28567d);
        h.append(", discountDescription=");
        h.append(this.f28568e);
        h.append(", isPriceLoading=");
        return C0391c.m1058d(h, this.f28569f, ')');
    }

    public C12974d(String str, String str2, C10563f fVar, boolean z, String str3, boolean z2) {
        C19383o.m32797g(str, "discountPrice");
        C19383o.m32797g(str2, "originalPrice");
        this.f28564a = str;
        this.f28565b = str2;
        this.f28566c = fVar;
        this.f28567d = z;
        this.f28568e = str3;
        this.f28569f = z2;
    }
}
