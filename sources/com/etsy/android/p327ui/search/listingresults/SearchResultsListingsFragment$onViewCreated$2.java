package com.etsy.android.p327ui.search.listingresults;

import android.view.ViewTreeObserver;
import com.etsy.android.uikit.util.C11914o;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onViewCreated$2 */
public final class SearchResultsListingsFragment$onViewCreated$2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    public SearchResultsListingsFragment$onViewCreated$2(SearchResultsListingsFragment searchResultsListingsFragment) {
        this.this$0 = searchResultsListingsFragment;
    }

    public void onGlobalLayout() {
        boolean e = this.this$0.getViewModel().f24180j.mo21373e();
        if (this.this$0.recyclerView != null && e) {
            C11914o.m19630b(this.this$0.recyclerView.getViewTreeObserver(), this);
        }
    }
}
