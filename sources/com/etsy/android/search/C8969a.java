package com.etsy.android.search;

import kotlin.coroutines.C19340c;
import p771sr.C20183f;
import p771sr.C20197t;

/* renamed from: com.etsy.android.search.a */
public interface C8969a {
    @C20183f("/etsyapps/v3/bespoke/public/search/composite-suggestions")
    /* renamed from: a */
    Object mo30606a(@C20197t("query") String str, @C20197t("expt") String str2, @C20197t("limit") int i, @C20197t("include_recently_viewed") Integer num, C19340c<? super CompositeSuggestions> cVar);
}
