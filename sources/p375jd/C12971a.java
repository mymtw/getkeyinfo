package p375jd;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import kotlin.jvm.internal.C19383o;

/* renamed from: jd.a */
public final class C12971a extends C10423j {

    /* renamed from: a */
    public final String f28554a;

    /* renamed from: b */
    public final C10563f f28555b;

    /* renamed from: c */
    public final boolean f28556c;

    /* renamed from: d */
    public final boolean f28557d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12971a(String str, C10563f fVar, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? false : z, false);
    }

    /* renamed from: b */
    public static C12971a m20653b(C12971a aVar, C10563f fVar, boolean z, int i) {
        String str = (i & 1) != 0 ? aVar.f28554a : null;
        if ((i & 2) != 0) {
            fVar = aVar.f28555b;
        }
        boolean z2 = (i & 4) != 0 ? aVar.f28556c : false;
        if ((i & 8) != 0) {
            z = aVar.f28557d;
        }
        C19383o.m32797g(str, ResponseConstants.PRICE);
        return new C12971a(str, fVar, z2, z);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.PRICE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12971a)) {
            return false;
        }
        C12971a aVar = (C12971a) obj;
        return C19383o.m32792b(this.f28554a, aVar.f28554a) && C19383o.m32792b(this.f28555b, aVar.f28555b) && this.f28556c == aVar.f28556c && this.f28557d == aVar.f28557d;
    }

    public final int hashCode() {
        int hashCode = this.f28554a.hashCode() * 31;
        C10563f fVar = this.f28555b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        boolean z = this.f28556c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f28557d;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Price(price=");
        h.append(this.f28554a);
        h.append(", shippingPrice=");
        h.append(this.f28555b);
        h.append(", hasFreeShipping=");
        h.append(this.f28556c);
        h.append(", isPriceLoading=");
        return C0391c.m1058d(h, this.f28557d, ')');
    }

    public C12971a(String str, C10563f fVar, boolean z, boolean z2) {
        C19383o.m32797g(str, ResponseConstants.PRICE);
        this.f28554a = str;
        this.f28555b = fVar;
        this.f28556c = z;
        this.f28557d = z2;
    }
}
