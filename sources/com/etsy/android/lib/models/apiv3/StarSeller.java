package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class StarSeller {
    public static final int $stable = 0;
    private final StarSellerAboutCard aboutCard;
    private final StarSellerBadge badge;

    public StarSeller(@C17402n(name = "shop_header") StarSellerBadge starSellerBadge, @C17402n(name = "about_module") StarSellerAboutCard starSellerAboutCard) {
        this.badge = starSellerBadge;
        this.aboutCard = starSellerAboutCard;
    }

    public static /* synthetic */ StarSeller copy$default(StarSeller starSeller, StarSellerBadge starSellerBadge, StarSellerAboutCard starSellerAboutCard, int i, Object obj) {
        if ((i & 1) != 0) {
            starSellerBadge = starSeller.badge;
        }
        if ((i & 2) != 0) {
            starSellerAboutCard = starSeller.aboutCard;
        }
        return starSeller.copy(starSellerBadge, starSellerAboutCard);
    }

    public final StarSellerBadge component1() {
        return this.badge;
    }

    public final StarSellerAboutCard component2() {
        return this.aboutCard;
    }

    public final StarSeller copy(@C17402n(name = "shop_header") StarSellerBadge starSellerBadge, @C17402n(name = "about_module") StarSellerAboutCard starSellerAboutCard) {
        return new StarSeller(starSellerBadge, starSellerAboutCard);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarSeller)) {
            return false;
        }
        StarSeller starSeller = (StarSeller) obj;
        return C19383o.m32792b(this.badge, starSeller.badge) && C19383o.m32792b(this.aboutCard, starSeller.aboutCard);
    }

    public final StarSellerAboutCard getAboutCard() {
        return this.aboutCard;
    }

    public final StarSellerBadge getBadge() {
        return this.badge;
    }

    public int hashCode() {
        StarSellerBadge starSellerBadge = this.badge;
        int i = 0;
        int hashCode = (starSellerBadge == null ? 0 : starSellerBadge.hashCode()) * 31;
        StarSellerAboutCard starSellerAboutCard = this.aboutCard;
        if (starSellerAboutCard != null) {
            i = starSellerAboutCard.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("StarSeller(badge=");
        h.append(this.badge);
        h.append(", aboutCard=");
        h.append(this.aboutCard);
        h.append(')');
        return h.toString();
    }
}
