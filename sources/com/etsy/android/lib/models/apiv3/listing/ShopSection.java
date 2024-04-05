package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopSection {
    public static final int $stable = 8;
    private final Integer activeListingCount;
    private final List<ListingCard> listings;
    private final Integer rank;
    private final Long shopSectionId;
    private final String title;

    public ShopSection(@C17402n(name = "active_listing_count") Integer num, @C17402n(name = "listings") List<ListingCard> list, @C17402n(name = "rank") Integer num2, @C17402n(name = "shop_section_id") Long l, @C17402n(name = "title") String str) {
        this.activeListingCount = num;
        this.listings = list;
        this.rank = num2;
        this.shopSectionId = l;
        this.title = str;
    }

    public static /* synthetic */ ShopSection copy$default(ShopSection shopSection, Integer num, List<ListingCard> list, Integer num2, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shopSection.activeListingCount;
        }
        if ((i & 2) != 0) {
            list = shopSection.listings;
        }
        List<ListingCard> list2 = list;
        if ((i & 4) != 0) {
            num2 = shopSection.rank;
        }
        Integer num3 = num2;
        if ((i & 8) != 0) {
            l = shopSection.shopSectionId;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str = shopSection.title;
        }
        return shopSection.copy(num, list2, num3, l2, str);
    }

    public final Integer component1() {
        return this.activeListingCount;
    }

    public final List<ListingCard> component2() {
        return this.listings;
    }

    public final Integer component3() {
        return this.rank;
    }

    public final Long component4() {
        return this.shopSectionId;
    }

    public final String component5() {
        return this.title;
    }

    public final ShopSection copy(@C17402n(name = "active_listing_count") Integer num, @C17402n(name = "listings") List<ListingCard> list, @C17402n(name = "rank") Integer num2, @C17402n(name = "shop_section_id") Long l, @C17402n(name = "title") String str) {
        return new ShopSection(num, list, num2, l, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopSection)) {
            return false;
        }
        ShopSection shopSection = (ShopSection) obj;
        return C19383o.m32792b(this.activeListingCount, shopSection.activeListingCount) && C19383o.m32792b(this.listings, shopSection.listings) && C19383o.m32792b(this.rank, shopSection.rank) && C19383o.m32792b(this.shopSectionId, shopSection.shopSectionId) && C19383o.m32792b(this.title, shopSection.title);
    }

    public final Integer getActiveListingCount() {
        return this.activeListingCount;
    }

    public final List<ListingCard> getListings() {
        return this.listings;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final Long getShopSectionId() {
        return this.shopSectionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.activeListingCount;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<ListingCard> list = this.listings;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.rank;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.shopSectionId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.title;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopSection(activeListingCount=");
        h.append(this.activeListingCount);
        h.append(", listings=");
        h.append(this.listings);
        h.append(", rank=");
        h.append(this.rank);
        h.append(", shopSectionId=");
        h.append(this.shopSectionId);
        h.append(", title=");
        return C0391c.m1057c(h, this.title, ')');
    }
}
