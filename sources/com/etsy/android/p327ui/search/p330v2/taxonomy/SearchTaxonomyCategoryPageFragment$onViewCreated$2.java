package com.etsy.android.p327ui.search.p330v2.taxonomy;

import android.view.View;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.taxonomy.SearchTaxonomyCategoryPageFragment$onViewCreated$2 */
public final class SearchTaxonomyCategoryPageFragment$onViewCreated$2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ SearchTaxonomyCategoryPageFragment this$0;

    public SearchTaxonomyCategoryPageFragment$onViewCreated$2(SearchTaxonomyCategoryPageFragment searchTaxonomyCategoryPageFragment) {
        this.this$0 = searchTaxonomyCategoryPageFragment;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.this$0.recyclerViewOnGlobalLayoutListener);
    }
}
