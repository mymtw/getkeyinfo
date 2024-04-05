package com.etsy.android.p327ui.search.filters;

import com.etsy.android.lib.models.apiv3.SearchWithAds;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$initObservers$4 */
public final class SearchFiltersV2Fragment$initObservers$4 extends Lambda implements C19857l<SearchWithAds, C19394m> {
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$initObservers$4(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        super(1);
        this.this$0 = searchFiltersV2Fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SearchWithAds) obj);
        return C19394m.f43287a;
    }

    public final void invoke(SearchWithAds searchWithAds) {
        C19383o.m32797g(searchWithAds, "it");
        this.this$0.showNewFilters(searchWithAds);
    }
}
