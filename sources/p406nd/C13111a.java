package p406nd;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: nd.a */
public final class C13111a extends C10423j {

    /* renamed from: a */
    public final String f28832a;

    public C13111a(String str) {
        this.f28832a = str;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.UNIT_PRICING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13111a) && C19383o.m32792b(this.f28832a, ((C13111a) obj).f28832a);
    }

    public final int hashCode() {
        return this.f28832a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("UnitPricing(unitPrice="), this.f28832a, ')');
    }
}
