package com.etsy.android.p327ui.util;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.ListingLike;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.util.e */
public final class C11777e {

    /* renamed from: a */
    public final ListingLike f26241a;

    /* renamed from: b */
    public final boolean f26242b;

    /* renamed from: c */
    public final boolean f26243c;

    public C11777e(ListingLike listingLike, boolean z, boolean z2) {
        C19383o.m32797g(listingLike, ResponseConstants.LISTING);
        this.f26241a = listingLike;
        this.f26242b = z;
        this.f26243c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11777e)) {
            return false;
        }
        C11777e eVar = (C11777e) obj;
        return C19383o.m32792b(this.f26241a, eVar.f26241a) && this.f26242b == eVar.f26242b && this.f26243c == eVar.f26243c;
    }

    public final int hashCode() {
        int hashCode = this.f26241a.hashCode() * 31;
        boolean z = this.f26242b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f26243c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("FavoriteListingSpecs(listing=");
        h.append(this.f26241a);
        h.append(", isFavorite=");
        h.append(this.f26242b);
        h.append(", isSignedIn=");
        return C0391c.m1058d(h, this.f26243c, ')');
    }
}
