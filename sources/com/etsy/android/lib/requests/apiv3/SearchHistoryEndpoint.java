package com.etsy.android.lib.requests.apiv3;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import p771sr.C20179b;
import p771sr.C20196s;
import retrofit2.C20145v;

public interface SearchHistoryEndpoint {
    @C20179b("/etsyapps/v3/member/search-history")
    Object deleteAllItemSearchHistory(C19340c<? super C20145v<C19394m>> cVar);

    @C20179b("/etsyapps/v3/member/search-history/listings/{query}")
    Object deleteSearchHistoryQuery(@C20196s("query") String str, C19340c<? super C20145v<C19394m>> cVar);
}
