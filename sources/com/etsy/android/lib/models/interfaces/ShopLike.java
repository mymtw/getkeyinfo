package com.etsy.android.lib.models.interfaces;

import java.util.List;

public interface ShopLike extends BasicShopLike {
    String getAvatarUrl();

    List<? extends ListingLike> getCardListings();

    String getHeadline();

    String getIconUrl(int i);

    String getLocation();

    String getUrl();

    boolean hasRatings();
}
