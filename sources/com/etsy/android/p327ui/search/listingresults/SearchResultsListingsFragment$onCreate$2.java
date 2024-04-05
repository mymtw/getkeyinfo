package com.etsy.android.p327ui.search.listingresults;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onCreate$2 */
public final class SearchResultsListingsFragment$onCreate$2 extends Lambda implements C19857l<Long, C19394m> {
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsFragment$onCreate$2(SearchResultsListingsFragment searchResultsListingsFragment) {
        super(1);
        this.this$0 = searchResultsListingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Long) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Long l) {
        SearchResultsListingsFragment searchResultsListingsFragment = this.this$0;
        C19383o.m32796f(l, "listingId");
        searchResultsListingsFragment.handleListingRecentlyViewed(l.longValue());
    }
}
