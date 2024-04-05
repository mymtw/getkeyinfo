package com.etsy.android.p327ui.listing.p329ui.listingpromotion;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.listingpromotion.a */
public final class C10447a extends C10423j {

    /* renamed from: a */
    public final long f22917a;

    /* renamed from: b */
    public final long f22918b;

    /* renamed from: c */
    public final long f22919c;

    /* renamed from: d */
    public final String f22920d;

    /* renamed from: e */
    public final String f22921e;

    public C10447a(long j, long j2, long j3, String str, String str2) {
        this.f22917a = j;
        this.f22918b = j2;
        this.f22919c = j3;
        this.f22920d = str;
        this.f22921e = str2;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.LISTING_PROMOTION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10447a)) {
            return false;
        }
        C10447a aVar = (C10447a) obj;
        return this.f22917a == aVar.f22917a && this.f22918b == aVar.f22918b && this.f22919c == aVar.f22919c && C19383o.m32792b(this.f22920d, aVar.f22920d) && C19383o.m32792b(this.f22921e, aVar.f22921e);
    }

    public final int hashCode() {
        return this.f22921e.hashCode() + C0023f.m105e(this.f22920d, C0071c.m190b(this.f22919c, C0071c.m190b(this.f22918b, Long.hashCode(this.f22917a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingPromotion(shopId=");
        h.append(this.f22917a);
        h.append(", sellerId=");
        h.append(this.f22918b);
        h.append(", listingId=");
        h.append(this.f22919c);
        h.append(", description=");
        h.append(this.f22920d);
        h.append(", disclaimer=");
        return C0391c.m1057c(h, this.f22921e, ')');
    }
}
