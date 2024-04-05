package com.etsy.android.p327ui.search.listingresults;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsViewModel$loadSimplifiedQueries$2 */
final class SearchResultsListingsViewModel$loadSimplifiedQueries$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ SearchResultsListingsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsViewModel$loadSimplifiedQueries$2(SearchResultsListingsViewModel searchResultsListingsViewModel) {
        super(1);
        this.this$0 = searchResultsListingsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "error");
        this.this$0.f24187q.mo21309d("Error getting simplified queries", th);
    }
}
