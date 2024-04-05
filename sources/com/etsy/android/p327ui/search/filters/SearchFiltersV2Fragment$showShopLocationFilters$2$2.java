package com.etsy.android.p327ui.search.filters;

import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$2 */
public final class SearchFiltersV2Fragment$showShopLocationFilters$2$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ CollageTextInput $shopLocationInput;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showShopLocationFilters$2$2(SearchFiltersV2Fragment searchFiltersV2Fragment, CollageTextInput collageTextInput) {
        super(0);
        this.this$0 = searchFiltersV2Fragment;
        this.$shopLocationInput = collageTextInput;
    }

    public final void invoke() {
        this.this$0.getViewModel().mo35752p(true);
        SearchFiltersV2Fragment searchFiltersV2Fragment = this.this$0;
        CollageTextInput collageTextInput = this.$shopLocationInput;
        C19383o.m32796f(collageTextInput, "shopLocationInput");
        searchFiltersV2Fragment.clearFocus(collageTextInput);
        this.this$0.customShopLocationTracked = true;
    }
}
