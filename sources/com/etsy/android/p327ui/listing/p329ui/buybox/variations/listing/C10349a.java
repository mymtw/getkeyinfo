package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.a */
public final class C10349a extends C10423j {

    /* renamed from: a */
    public final Variation f22709a;

    /* renamed from: b */
    public final VariationValue f22710b;

    /* renamed from: c */
    public final String f22711c;

    public C10349a(Variation variation, VariationValue variationValue, String str) {
        this.f22709a = variation;
        this.f22710b = variationValue;
        this.f22711c = str;
    }

    /* renamed from: b */
    public static C10349a m18393b(C10349a aVar, VariationValue variationValue, String str, int i) {
        Variation variation = (i & 1) != 0 ? aVar.f22709a : null;
        if ((i & 2) != 0) {
            variationValue = aVar.f22710b;
        }
        if ((i & 4) != 0) {
            str = aVar.f22711c;
        }
        aVar.getClass();
        C19383o.m32797g(variation, "variation");
        return new C10349a(variation, variationValue, str);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.VARIATION_ONE_FROM_LISTING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10349a)) {
            return false;
        }
        C10349a aVar = (C10349a) obj;
        return C19383o.m32792b(this.f22709a, aVar.f22709a) && C19383o.m32792b(this.f22710b, aVar.f22710b) && C19383o.m32792b(this.f22711c, aVar.f22711c);
    }

    public final int hashCode() {
        int hashCode = this.f22709a.hashCode() * 31;
        VariationValue variationValue = this.f22710b;
        int i = 0;
        int hashCode2 = (hashCode + (variationValue == null ? 0 : variationValue.hashCode())) * 31;
        String str = this.f22711c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VariationOneFromListing(variation=");
        h.append(this.f22709a);
        h.append(", selectedValue=");
        h.append(this.f22710b);
        h.append(", errorMessage=");
        return C0391c.m1057c(h, this.f22711c, ')');
    }
}
