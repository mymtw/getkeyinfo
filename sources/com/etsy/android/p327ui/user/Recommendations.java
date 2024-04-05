package com.etsy.android.p327ui.user;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.user.Recommendations */
public final class Recommendations {

    /* renamed from: a */
    public final List<ListingCard> f25015a;

    public Recommendations(@C17402n(name = "complementary_listing_cards") List<? extends ListingCard> list) {
        this.f25015a = list;
    }

    public final Recommendations copy(@C17402n(name = "complementary_listing_cards") List<? extends ListingCard> list) {
        return new Recommendations(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Recommendations) && C19383o.m32792b(this.f25015a, ((Recommendations) obj).f25015a);
    }

    public final int hashCode() {
        List<ListingCard> list = this.f25015a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("Recommendations(complementaryListings="), this.f25015a, ')');
    }
}
