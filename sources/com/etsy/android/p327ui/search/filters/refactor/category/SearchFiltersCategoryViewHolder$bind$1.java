package com.etsy.android.p327ui.search.filters.refactor.category;

import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.refactor.category.SearchFiltersCategoryViewHolder$bind$1 */
public final class SearchFiltersCategoryViewHolder$bind$1 extends Lambda implements C19846a<Boolean> {
    public final /* synthetic */ SearchFiltersUiGroupItem $groupItem;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersCategoryViewHolder$bind$1(SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        super(0);
        this.$groupItem = searchFiltersUiGroupItem;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(!((SearchFiltersUiGroupItem.C10781b) this.$groupItem).f23847d.isEmpty());
    }
}
