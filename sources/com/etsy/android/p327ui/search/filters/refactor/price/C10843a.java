package com.etsy.android.p327ui.search.filters.refactor.price;

import android.view.View;
import com.etsy.android.p327ui.search.filters.refactor.C10803g;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import com.etsy.android.p327ui.search.filters.refactor.SearchFiltersUiGroupItem;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.price.a */
public final /* synthetic */ class C10843a implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ PriceSearchFilterViewHolder f24034b;

    /* renamed from: c */
    public final /* synthetic */ SearchFiltersUiGroupItem f24035c;

    public /* synthetic */ C10843a(PriceSearchFilterViewHolder priceSearchFilterViewHolder, SearchFiltersUiGroupItem searchFiltersUiGroupItem) {
        this.f24034b = priceSearchFilterViewHolder;
        this.f24035c = searchFiltersUiGroupItem;
    }

    public final void onFocusChange(View view, boolean z) {
        PriceSearchFilterViewHolder priceSearchFilterViewHolder = this.f24034b;
        SearchFiltersUiGroupItem searchFiltersUiGroupItem = this.f24035c;
        C19383o.m32797g(priceSearchFilterViewHolder, "this$0");
        C19383o.m32797g(searchFiltersUiGroupItem, "$groupItem");
        if (z) {
            priceSearchFilterViewHolder.f24022b.invoke(new C10813l.C10821h((C10803g) C19327t.m32645a1(((SearchFiltersUiGroupItem.C10783d) searchFiltersUiGroupItem).f23861e)));
        }
    }
}
