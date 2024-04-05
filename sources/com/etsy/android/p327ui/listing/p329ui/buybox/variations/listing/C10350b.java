package com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.listing.b */
public final class C10350b extends C10423j {

    /* renamed from: a */
    public final Variation f22712a;

    /* renamed from: b */
    public final VariationValue f22713b;

    /* renamed from: c */
    public final String f22714c;

    public C10350b(Variation variation, VariationValue variationValue, String str) {
        this.f22712a = variation;
        this.f22713b = variationValue;
        this.f22714c = str;
    }

    /* renamed from: b */
    public static C10350b m18395b(C10350b bVar, VariationValue variationValue, String str, int i) {
        Variation variation = (i & 1) != 0 ? bVar.f22712a : null;
        if ((i & 2) != 0) {
            variationValue = bVar.f22713b;
        }
        if ((i & 4) != 0) {
            str = bVar.f22714c;
        }
        bVar.getClass();
        C19383o.m32797g(variation, "variation");
        return new C10350b(variation, variationValue, str);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.VARIATION_TWO_FROM_LISTING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10350b)) {
            return false;
        }
        C10350b bVar = (C10350b) obj;
        return C19383o.m32792b(this.f22712a, bVar.f22712a) && C19383o.m32792b(this.f22713b, bVar.f22713b) && C19383o.m32792b(this.f22714c, bVar.f22714c);
    }

    public final int hashCode() {
        int hashCode = this.f22712a.hashCode() * 31;
        VariationValue variationValue = this.f22713b;
        int i = 0;
        int hashCode2 = (hashCode + (variationValue == null ? 0 : variationValue.hashCode())) * 31;
        String str = this.f22714c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("VariationTwoFromListing(variation=");
        h.append(this.f22712a);
        h.append(", selectedValue=");
        h.append(this.f22713b);
        h.append(", errorMessage=");
        return C0391c.m1057c(h, this.f22714c, ')');
    }
}
