package com.etsy.android.p327ui.search.p330v2;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;

/* renamed from: com.etsy.android.ui.search.v2.SearchOptionsParams */
public enum SearchOptionsParams {
    MAX_PRICE_LEGACY(ResponseConstants.MAX_PRICE),
    MAX_PRICE(ResponseConstants.MAX),
    MIN_PRICE_LEGACY(ResponseConstants.MIN_PRICE),
    MIN_PRICE(ResponseConstants.MIN),
    LOCATION("location"),
    SHIP_TO("ship_to"),
    MARKETPLACE("marketplace"),
    FREE_SHIPPING("free_shipping"),
    MAX_PROCESSING_DAYS("max_processing_days"),
    IS_DISCOUNTED("is_discounted"),
    CUSTOMIZABLE("customizable"),
    GIFT_WRAP("gift_wrap"),
    SPELLING_CORRECTION_SHOW_ORIGINAL("spelling_correction_show_original"),
    ACCEPTS_GIFT_CARDS("accepts_gift_cards"),
    CATEGORY_PROLIST("category_prolist"),
    PCT_DISCOUNT_MAX("pct_discount_max"),
    PCT_DISCOUNT_MIN("pct_discount_min"),
    QUERY(SearchCategoryRedirectPage.PARAM_QUERY),
    CATEGORY(ResponseConstants.CATEGORY),
    SORT_ON("sort_on"),
    SORT_ORDER(ResponseConstants.SORT_ORDER),
    IS_MERCH_LIBRARY("is_merch_library"),
    MERCH_ON_SEARCH_VARIANT("mosv"),
    MERCH_COLLECTION_ID("moci"),
    MERCH_SECTION_ID("mosi");
    
    private final String searchParam;

    private SearchOptionsParams(String str) {
        this.searchParam = str;
    }

    public final String getSearchParam() {
        return this.searchParam;
    }

    public String toString() {
        return this.searchParam;
    }
}
