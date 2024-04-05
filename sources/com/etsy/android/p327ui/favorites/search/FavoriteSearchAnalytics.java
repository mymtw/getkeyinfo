package com.etsy.android.p327ui.favorites.search;

/* renamed from: com.etsy.android.ui.favorites.search.FavoriteSearchAnalytics */
public enum FavoriteSearchAnalytics {
    COLLECTION_SEARCH("collections_search"),
    COLLECTION_SEARCH_TAPPED("collections_search_tapped"),
    COLLECTION_SEARCH_CLEARED("collections_search_cleared"),
    COLLECTION_FILTER_TAPPED("collections_filter_tapped"),
    COLLECTION_FILTER_BY_SALE("collections_filter_by_sale"),
    COLLECTION_FILTER_BY_AVAILABLE("collections_filter_by_available"),
    FAVORITES_SEARCH("favorites_search"),
    FAVORITES_SEARCH_TAPPED("favorites_search_tapped"),
    FAVORITES_SEARCH_CLEARED("favorites_search_cleared"),
    CLUSTER_TAPPED("cluster_tapped"),
    CLUSTER_SHOWN("cluster_shown"),
    CLUSTER_SCROLLED_RIGHT("cluster_scrolled_right"),
    CLUSTER_FROM_FAVS_LANDING("favorites_landing"),
    CLUSTER_FROM_FAVS_COLLECTION("all_items_collection");
    
    private final String analyticsId;

    private FavoriteSearchAnalytics(String str) {
        this.analyticsId = str;
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }
}
