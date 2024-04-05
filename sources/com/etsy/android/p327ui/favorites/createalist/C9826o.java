package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.createalist.o */
public final class C9826o {

    /* renamed from: a */
    public final ListingImage f21723a;

    public C9826o(ListingImage listingImage) {
        this.f21723a = listingImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9826o) && C19383o.m32792b(this.f21723a, ((C9826o) obj).f21723a);
    }

    public final int hashCode() {
        ListingImage listingImage = this.f21723a;
        if (listingImage == null) {
            return 0;
        }
        return listingImage.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListCoverImage(listingImage=");
        h.append(this.f21723a);
        h.append(')');
        return h.toString();
    }
}
