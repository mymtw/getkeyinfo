package com.etsy.android.p327ui.user;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.c */
public final class C11490c {

    /* renamed from: a */
    public final String f25349a;

    /* renamed from: b */
    public final String f25350b;

    /* renamed from: c */
    public final boolean f25351c;

    /* renamed from: d */
    public final Integer f25352d;

    /* renamed from: e */
    public final String f25353e;

    /* renamed from: f */
    public final String f25354f;

    /* renamed from: g */
    public final Long f25355g;

    /* renamed from: h */
    public final List<Pair<Variation, VariationValue>> f25356h;

    /* renamed from: i */
    public final boolean f25357i;

    /* renamed from: j */
    public final boolean f25358j;

    public C11490c(String str, String str2, boolean z, Integer num, String str3, String str4, Long l, List<Pair<Variation, VariationValue>> list, boolean z2, boolean z3) {
        C19383o.m32797g(str, "listingId");
        C19383o.m32797g(str2, "guid");
        this.f25349a = str;
        this.f25350b = str2;
        this.f25351c = z;
        this.f25352d = num;
        this.f25353e = str3;
        this.f25354f = str4;
        this.f25355g = l;
        this.f25356h = list;
        this.f25357i = z2;
        this.f25358j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11490c)) {
            return false;
        }
        C11490c cVar = (C11490c) obj;
        return C19383o.m32792b(this.f25349a, cVar.f25349a) && C19383o.m32792b(this.f25350b, cVar.f25350b) && this.f25351c == cVar.f25351c && C19383o.m32792b(this.f25352d, cVar.f25352d) && C19383o.m32792b(this.f25353e, cVar.f25353e) && C19383o.m32792b(this.f25354f, cVar.f25354f) && C19383o.m32792b(this.f25355g, cVar.f25355g) && C19383o.m32792b(this.f25356h, cVar.f25356h) && this.f25357i == cVar.f25357i && this.f25358j == cVar.f25358j;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f25350b, this.f25349a.hashCode() * 31, 31);
        boolean z = this.f25351c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        Integer num = this.f25352d;
        int i2 = 0;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f25353e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25354f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f25355g;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        List<Pair<Variation, VariationValue>> list = this.f25356h;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (hashCode4 + i2) * 31;
        boolean z3 = this.f25357i;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f25358j;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddToCartSpecs(listingId=");
        h.append(this.f25349a);
        h.append(", guid=");
        h.append(this.f25350b);
        h.append(", isSignedIn=");
        h.append(this.f25351c);
        h.append(", selectedQuantity=");
        h.append(this.f25352d);
        h.append(", guestId=");
        h.append(this.f25353e);
        h.append(", personalization=");
        h.append(this.f25354f);
        h.append(", inventoryId=");
        h.append(this.f25355g);
        h.append(", variationValues=");
        h.append(this.f25356h);
        h.append(", includeRecommendations=");
        h.append(this.f25357i);
        h.append(", includeMultipleListingImages=");
        return C0391c.m1058d(h, this.f25358j, ')');
    }
}
