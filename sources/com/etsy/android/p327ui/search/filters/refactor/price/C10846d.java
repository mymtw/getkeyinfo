package com.etsy.android.p327ui.search.filters.refactor.price;

import android.view.View;
import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.d */
public final /* synthetic */ class C10846d implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ SearchFilterPriceMultiSelectViewHolder f24039b;

    /* renamed from: c */
    public final /* synthetic */ SearchFiltersUiGroupItem f24040c;

    public /* synthetic */ C10846d(SearchFilterPriceMultiSelectViewHolder searchFilterPriceMultiSelectViewHolder, SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        this.f24039b = searchFilterPriceMultiSelectViewHolder;
        this.f24040c = searchFiltersUiGroupItem;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchFilterPriceMultiSelectViewHolder searchFilterPriceMultiSelectViewHolder = this.f24039b;
        SearchFiltersUiGroupItem searchFiltersUiGroupItem = this.f24040c;
        C19383o.m32797g(searchFilterPriceMultiSelectViewHolder, "this$0");
        C19383o.m32797g(searchFiltersUiGroupItem, "$groupItem");
        if (z) {
            searchFilterPriceMultiSelectViewHolder.f24029b.invoke(new C10813l.C10823j((C10803g) C19327t.m32645a1(((SearchFiltersUiGroupItem.C10782c) searchFiltersUiGroupItem).f23852e), true));
        }
    }
}
