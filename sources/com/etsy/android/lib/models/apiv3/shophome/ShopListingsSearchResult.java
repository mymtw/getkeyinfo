package com.etsy.android.lib.models.apiv3.shophome;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopListingsSearchResult {
    public static final int $stable = 8;
    private final List<ListingCard> listings;
    private final String sortOrder;

    public ShopListingsSearchResult(@C17402n(name = "listing_cards") List<? extends ListingCard> list, @C17402n(name = "sort_order") String str) {
        C19383o.m32797g(str, "sortOrder");
        this.listings = list;
        this.sortOrder = str;
    }

    public static /* synthetic */ ShopListingsSearchResult copy$default(ShopListingsSearchResult shopListingsSearchResult, List<ListingCard> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shopListingsSearchResult.listings;
        }
        if ((i & 2) != 0) {
            str = shopListingsSearchResult.sortOrder;
        }
        return shopListingsSearchResult.copy(list, str);
    }

    public final List<ListingCard> component1() {
        return this.listings;
    }

    public final String component2() {
        return this.sortOrder;
    }

    public final ShopListingsSearchResult copy(@C17402n(name = "listing_cards") List<? extends ListingCard> list, @C17402n(name = "sort_order") String str) {
        C19383o.m32797g(str, "sortOrder");
        return new ShopListingsSearchResult(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopListingsSearchResult)) {
            return false;
        }
        ShopListingsSearchResult shopListingsSearchResult = (ShopListingsSearchResult) obj;
        return C19383o.m32792b(this.listings, shopListingsSearchResult.listings) && C19383o.m32792b(this.sortOrder, shopListingsSearchResult.sortOrder);
    }

    public final List<ListingCard> getListings() {
        return this.listings;
    }

    public final String getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        List<ListingCard> list = this.listings;
        return this.sortOrder.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopListingsSearchResult(listings=");
        h.append(this.listings);
        h.append(", sortOrder=");
        return C0391c.m1057c(h, this.sortOrder, ')');
    }
}
