package com.etsy.android.search.savedsearch;

import okhttp3.C19928a0;
import p248tp.C8048a;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20179b;
import p771sr.C20193p;
import p771sr.C20196s;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.search.savedsearch.a */
public interface C8975a {
    @C20193p("/etsyapps/v3/bespoke/member/email-subscriptions/update")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo30624a(@C20178a SignUpEmailRequestBody signUpEmailRequestBody);

    @C20179b("/etsyapps/v3/bespoke/member/search/saved-search/{saved_search_id}")
    /* renamed from: b */
    C8048a mo30625b(@C20196s("saved_search_id") long j);

    @C20193p("/etsyapps/v3/bespoke/member/search/saved-search")
    /* renamed from: c */
    C8071s<SaveSearchPutResponse> mo30626c(@C20178a SavedSearchRequestBody savedSearchRequestBody);
}
