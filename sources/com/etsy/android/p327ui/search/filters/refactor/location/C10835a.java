package com.etsy.android.p327ui.search.filters.refactor.location;

import android.view.View;
import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.location.a */
public final /* synthetic */ class C10835a implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ SearchFiltersShopLocationViewHolder f23988b;

    public /* synthetic */ C10835a(SearchFiltersShopLocationViewHolder searchFiltersShopLocationViewHolder) {
        this.f23988b = searchFiltersShopLocationViewHolder;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchFiltersShopLocationViewHolder searchFiltersShopLocationViewHolder = this.f23988b;
        C19383o.m32797g(searchFiltersShopLocationViewHolder, "this$0");
        if (z) {
            searchFiltersShopLocationViewHolder.f23980b.invoke(C10813l.C10826m.f23970a);
        }
    }
}
