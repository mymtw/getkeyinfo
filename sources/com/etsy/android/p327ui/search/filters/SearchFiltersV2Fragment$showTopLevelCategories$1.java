package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FacetCount;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showTopLevelCategories$1 */
public final class SearchFiltersV2Fragment$showTopLevelCategories$1 extends Lambda implements C19861p<FacetCount, List<FacetCount>, Boolean> {
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showTopLevelCategories$1(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        super(2);
        this.this$0 = searchFiltersV2Fragment;
    }

    public final Boolean invoke(FacetCount facetCount, List<FacetCount> list) {
        C19383o.m32797g(facetCount, "selectedCategory");
        C19383o.m32797g(list, ResponseConstants.PATH);
        C10767e viewModel = this.this$0.getViewModel();
        FacetCount facetCount2 = this.this$0.getViewModel().f23749n;
        viewModel.getClass();
        return Boolean.valueOf(C10767e.m18650r(facetCount2, list, facetCount));
    }
}
