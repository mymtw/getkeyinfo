package com.etsy.android.p327ui.search.listingresults;

import android.view.ViewTreeObserver;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.search.SearchResultsHeaderView;
import com.etsy.android.uikit.util.C11914o;

/* renamed from: com.etsy.android.ui.search.listingresults.SearchResultsListingsFragment$onViewCreated$3 */
public final class SearchResultsListingsFragment$onViewCreated$3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SearchResultsListingsFragment this$0;

    public SearchResultsListingsFragment$onViewCreated$3(SearchResultsListingsFragment searchResultsListingsFragment) {
        this.this$0 = searchResultsListingsFragment;
    }

    public void onGlobalLayout() {
        if (this.this$0.recyclerView != null && this.this$0.recyclerView.getChildCount() > 0) {
            C11914o.m19630b(this.this$0.recyclerView.getViewTreeObserver(), this);
            SearchResultsHeaderView access$getStickyHeaderView$p = this.this$0.stickyHeaderView;
            if (access$getStickyHeaderView$p != null) {
                ViewExtensions.m12869m(access$getStickyHeaderView$p);
            }
            ViewExtensions.m12869m(this.this$0.relatedCategoriesHeaderView);
            this.this$0.recyclerView.setVerticalScrollBarEnabled(false);
        }
    }
}
