package com.etsy.android.p327ui.search.interstitial;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11064o;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.interstitial.a */
public final class C10875a {

    /* renamed from: a */
    public final C10876b f24131a;

    public C10875a(C10876b bVar) {
        C19383o.m32797g(bVar, "searchInterstitialEligibility");
        this.f24131a = bVar;
    }

    /* renamed from: a */
    public final C11083w.C11089f mo36107a(SearchLandingSuggestions.SavableSearchQuery savableSearchQuery, int i) {
        return new C11083w.C11089f(new C11064o.C11069e(savableSearchQuery.getQuery(), i, savableSearchQuery.getFiltersDisplayValue(), savableSearchQuery.getSavedSearchId(), savableSearchQuery.getFilters(), savableSearchQuery.getNewResultsCount() > 0 && this.f24131a.f24132a.mo21132b(C8592b.f18770Y0)));
    }
}
