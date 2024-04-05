package com.etsy.android.p327ui.search.filters.refactor.location;

import com.etsy.android.p327ui.search.filters.refactor.C10813l;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.refactor.location.SearchFiltersShopLocationViewHolder$bind$3 */
public final class SearchFiltersShopLocationViewHolder$bind$3 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ SearchFiltersShopLocationViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersShopLocationViewHolder$bind$3(SearchFiltersShopLocationViewHolder searchFiltersShopLocationViewHolder) {
        super(1);
        this.this$0 = searchFiltersShopLocationViewHolder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "textChanged");
        this.this$0.f23980b.invoke(new C10813l.C10828o(str));
    }
}
