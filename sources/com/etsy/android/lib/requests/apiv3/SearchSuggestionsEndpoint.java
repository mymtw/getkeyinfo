package com.etsy.android.lib.requests.apiv3;

import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import kotlin.coroutines.C19340c;
import p771sr.C20183f;
import p771sr.C20197t;
import retrofit2.C20145v;

public interface SearchSuggestionsEndpoint {
    @C20183f("/etsyapps/v3/bespoke/member/search-with-ads/interstitial")
    Object getSearchLandingSuggestions(@C20197t("include_recent_searches") Boolean bool, @C20197t("include_recently_viewed") Boolean bool2, C19340c<? super C20145v<SearchLandingSuggestions>> cVar);
}
