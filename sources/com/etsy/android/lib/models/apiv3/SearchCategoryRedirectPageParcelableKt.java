package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import kotlin.jvm.internal.C19383o;

public final class SearchCategoryRedirectPageParcelableKt {
    public static final SearchCategoryRedirectPage toSearchCategoryRedirectPage(SearchCategoryRedirectPageParcelable searchCategoryRedirectPageParcelable) {
        C19383o.m32797g(searchCategoryRedirectPageParcelable, "<this>");
        SearchCategoryRedirectPage build = new SearchCategoryRedirectPage.SearchCategoryRedirectPageBuilder().searchWithAds(searchCategoryRedirectPageParcelable.getSearchWithAds()).categoryLandingPage(searchCategoryRedirectPageParcelable.getCategoryLandingPage()).taxonomyNode(searchCategoryRedirectPageParcelable.getTaxonomyNode()).filterParams(searchCategoryRedirectPageParcelable.getFilterParams()).build();
        C19383o.m32796f(build, "SearchCategoryRedirectPa…rParams)\n        .build()");
        return build;
    }

    public static final SearchCategoryRedirectPageParcelable toSearchCategoryRedirectPageParcelable(SearchCategoryRedirectPage searchCategoryRedirectPage) {
        C19383o.m32797g(searchCategoryRedirectPage, "<this>");
        return new SearchCategoryRedirectPageParcelable(searchCategoryRedirectPage.mSearchWithAds, searchCategoryRedirectPage.mCategoryLandingPage, searchCategoryRedirectPage.mTaxonomyNode, searchCategoryRedirectPage.mFilterParams);
    }
}
