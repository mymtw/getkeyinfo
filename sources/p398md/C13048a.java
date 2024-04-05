package p398md;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: md.a */
public final class C13048a extends C10423j {

    /* renamed from: a */
    public final String f28696a;

    public C13048a(String str) {
        this.f28696a = str;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.TRANSPARENT_PRICING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13048a) && C19383o.m32792b(this.f28696a, ((C13048a) obj).f28696a);
    }

    public final int hashCode() {
        return this.f28696a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("TransparentPricing(transparentPriceMessage="), this.f28696a, ')');
    }
}
