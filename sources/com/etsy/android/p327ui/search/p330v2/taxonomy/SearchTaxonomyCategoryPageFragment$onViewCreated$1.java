package com.etsy.android.p327ui.search.p330v2.taxonomy;

import android.view.ViewTreeObserver;
import com.etsy.android.uikit.util.C11914o;

/* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$onViewCreated$1 */
public final class SearchTaxonomyCategoryPageFragment$onViewCreated$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ SearchTaxonomyCategoryPageFragment this$0;

    public SearchTaxonomyCategoryPageFragment$onViewCreated$1(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment) {
        this.this$0 = searchTaxonomyCategoryPageFragment;
    }

    public void onGlobalLayout() {
        if (this.this$0.recyclerView != null && this.this$0.getPerformanceTrackerAdapter().mo21373e()) {
            C11914o.m19630b(this.this$0.recyclerView.getViewTreeObserver(), this);
        }
    }
}
