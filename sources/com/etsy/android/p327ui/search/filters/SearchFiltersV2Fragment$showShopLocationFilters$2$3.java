package com.etsy.android.p327ui.search.filters;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$3 */
public final class SearchFiltersV2Fragment$showShopLocationFilters$2$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ CollageRadioGroup $radioGroup;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showShopLocationFilters$2$3(CollageRadioGroup collageRadioGroup) {
        super(0);
        this.$radioGroup = collageRadioGroup;
    }

    public final void invoke() {
        this.$radioGroup.check((int) R.string.new_search_filter_shop_location_custom_title);
    }
}
