package com.etsy.android.p327ui.search.filters;

import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$setUpPriceFields$2$3 */
public final class SearchFiltersV2Fragment$setUpPriceFields$2$3 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ CollageTextInput $customMaxPrice;
    public final /* synthetic */ CollageTextInput $customMinPrice;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$setUpPriceFields$2$3(SearchFiltersV2Fragment searchFiltersV2Fragment, CollageTextInput collageTextInput, CollageTextInput collageTextInput2) {
        super(0);
        this.this$0 = searchFiltersV2Fragment;
        this.$customMinPrice = collageTextInput;
        this.$customMaxPrice = collageTextInput2;
    }

    public final void invoke() {
        this.this$0.getViewModel().mo35751o((String) null, true);
        this.this$0.clearFocus(this.$customMinPrice);
        this.this$0.clearFocus(this.$customMaxPrice);
        this.this$0.customPriceTracked = true;
    }
}
