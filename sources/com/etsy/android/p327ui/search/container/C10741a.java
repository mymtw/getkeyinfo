package com.etsy.android.p327ui.search.container;

import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;

/* renamed from: com.etsy.android.ui.search.container.a */
public interface C10741a {
    void clearFocus();

    void navigateToCategoryPageFragment(long j, String str);

    void navigateToSearchResults(Long l);

    void navigateToSearchResults(String str, SearchOptions searchOptions);

    void navigateToSearchResults(String str, SearchOptions searchOptions, String str2, Long l);

    void onFiltersClicked(FilterParams filterParams);

    void setQueryQuietly(String str);
}
