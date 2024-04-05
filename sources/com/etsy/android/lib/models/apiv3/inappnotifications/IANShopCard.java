package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.apiv3.listing.ShopIcon;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class IANShopCard {
    public static final int $stable = 8;
    private final List<IANListingCard> displayListings;
    private boolean isFavorite;
    private final IANShopRating rating;
    private final String sellerAvatarUrl;
    private final ShopIcon shopIcon;
    private final long shopId;
    private final String shopName;
    private final long userId;

    public IANShopCard(@C17402n(name = "shop_id") long j, @C17402n(name = "user_id") long j2, @C17402n(name = "shop_name") String str, @C17402n(name = "seller_avatar") String str2, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "icon") ShopIcon shopIcon2, @C17402n(name = "rating") IANShopRating iANShopRating, @C17402n(name = "display_listings") List<IANListingCard> list) {
        C19383o.m32797g(str, "shopName");
        C19383o.m32797g(list, "displayListings");
        this.shopId = j;
        this.userId = j2;
        this.shopName = str;
        this.sellerAvatarUrl = str2;
        this.isFavorite = z;
        this.shopIcon = shopIcon2;
        this.rating = iANShopRating;
        this.displayListings = list;
    }

    public final List<IANListingCard> getDisplayListings() {
        return this.displayListings;
    }

    public final IANShopRating getRating() {
        return this.rating;
    }

    public final String getSellerAvatarUrl() {
        return this.sellerAvatarUrl;
    }

    public final ShopIcon getShopIcon() {
        return this.shopIcon;
    }

    public final long getShopId() {
        return this.shopId;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IANShopCard(long j, long j2, String str, String str2, boolean z, ShopIcon shopIcon2, IANShopRating iANShopRating, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, (i & 8) != 0 ? null : str2, z, (i & 32) != 0 ? null : shopIcon2, (i & 64) != 0 ? null : iANShopRating, list);
    }
}
