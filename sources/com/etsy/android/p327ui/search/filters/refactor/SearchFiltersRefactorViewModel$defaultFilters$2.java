package com.etsy.android.p327ui.search.filters.refactor;

import com.etsy.android.lib.models.apiv3.FacetCount;
import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterParams;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$defaultFilters$2 */
public final class SearchFiltersRefactorViewModel$defaultFilters$2 extends Lambda implements C19846a<C10856t> {
    public final /* synthetic */ SearchFiltersRefactorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersRefactorViewModel$defaultFilters$2(SearchFiltersRefactorViewModel searchFiltersRefactorViewModel) {
        super(0);
        this.this$0 = searchFiltersRefactorViewModel;
    }

    public final C10856t invoke() {
        SearchFiltersRefactorViewModel searchFiltersRefactorViewModel = this.this$0;
        C10857u uVar = searchFiltersRefactorViewModel.f23794g;
        FacetCount facetCount = ((C10855s) searchFiltersRefactorViewModel.f23798k.getValue()).f24060c;
        FilterParams filterParams = ((C10855s) this.this$0.f23798k.getValue()).f24059b;
        List<Integer> priceBuckets = filterParams != null ? filterParams.getPriceBuckets() : null;
        uVar.getClass();
        SortOrder.Companion.getClass();
        SearchFiltersUiGroupItem.SortBy m = uVar.mo36058m(SortOrder.DEFAULT);
        SearchFiltersUiGroupItem.C10781b c = uVar.mo36048c(facetCount, (String) null);
        SearchFiltersUiGroupItem.ItemType e = uVar.mo36050e(SearchOptions.MarketPlace.MARKETPLACE_ALL_ITEMS);
        C10857u uVar2 = uVar;
        List<Integer> list = priceBuckets;
        SearchFiltersUiGroupItem.C10783d g = uVar2.mo36052g(list, (BigDecimal) null, (BigDecimal) null, false, true, false);
        SearchFiltersUiGroupItem.C10782c h = uVar2.mo36053h(list, (BigDecimal) null, (BigDecimal) null, false, true, false);
        SearchFiltersUiGroupItem.Shipping j = uVar.mo36055j(false, false, false);
        String displayCountry = uVar.f24081d.mo46719c().getDisplayCountry();
        C19383o.m32796f(displayCountry, "currentLocale.getSystemLocale().displayCountry");
        String country = uVar.f24081d.mo46719c().getCountry();
        C19383o.m32796f(country, "currentLocale.getSystemLocale().country");
        return new C10856t(m, c, e, h, g, j, uVar.mo36056k(new FilterCountry(displayCountry, country)), uVar.mo36057l(new SearchOptions.Location((String) null, SearchOptions.Location.LocationType.ANYWHERE, 1, (DefaultConstructorMarker) null)), EmptyList.INSTANCE, uVar.mo36051f(false, false, false, false), (EmptyList) null, 31744);
    }
}
