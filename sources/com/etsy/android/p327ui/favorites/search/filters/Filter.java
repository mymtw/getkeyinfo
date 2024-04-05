package com.etsy.android.p327ui.favorites.search.filters;

import com.etsy.android.R;
import com.etsy.android.p327ui.favorites.search.FavoriteSearchAnalytics;

/* renamed from: com.etsy.android.ui.favorites.search.filters.Filter */
public enum Filter {
    ON_SALE(R.string.filter_on_sale, FavoriteSearchAnalytics.COLLECTION_FILTER_BY_SALE.getAnalyticsId()),
    AVAILABLE(R.string.filter_available, FavoriteSearchAnalytics.COLLECTION_FILTER_BY_AVAILABLE.getAnalyticsId());
    
    private final String analyticsId;
    private final int nameId;

    private Filter(int i, String str) {
        this.nameId = i;
        this.analyticsId = str;
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final int getNameId() {
        return this.nameId;
    }
}
