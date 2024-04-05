package com.etsy.android.p327ui.search.listingresults;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p414oe.C13166d;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onCreateView$8 */
public final class SearchResultsListingsFragment$onCreateView$8 extends Lambda implements C19861p<C13166d, Boolean, C19394m> {
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsListingsFragment$onCreateView$8(SearchResultsListingsFragment searchResultsListingsFragment) {
        super(2);
        this.this$0 = searchResultsListingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C13166d) obj, ((Boolean) obj2).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(C13166d dVar, boolean z) {
        C19383o.m32797g(dVar, "priceFilterOption");
        this.this$0.priceFilterClicked(dVar, z);
    }
}
