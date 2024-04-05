package com.etsy.android.p327ui.search.filters.refactor;

import com.etsy.android.p327ui.search.SortOrder;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.refactor.SearchFiltersRefactorViewModel$defaultSelectionSpec$2 */
public final class SearchFiltersRefactorViewModel$defaultSelectionSpec$2 extends Lambda implements C19846a<C10841p> {
    public final /* synthetic */ SearchFiltersRefactorViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersRefactorViewModel$defaultSelectionSpec$2(SearchFiltersRefactorViewModel searchFiltersRefactorViewModel) {
        super(0);
        this.this$0 = searchFiltersRefactorViewModel;
    }

    public final C10841p invoke() {
        SearchFiltersRefactorViewModel searchFiltersRefactorViewModel = this.this$0;
        int i = SearchFiltersRefactorViewModel.f23788n;
        SearchOptions searchOptions = r3;
        SearchOptions searchOptions2 = new SearchOptions((List) null, false, false, false, false, false, false, false, (SearchOptions.Location) null, (BigDecimal) null, (BigDecimal) null, false, false, (String) null, (String) null, (SortOrder) null, (SearchOptions.MarketPlace) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        return searchFiltersRefactorViewModel.mo35783c((C10856t) searchFiltersRefactorViewModel.f23796i.getValue(), searchOptions);
    }
}
