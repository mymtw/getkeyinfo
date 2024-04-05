package com.etsy.android.p327ui.search.filters;

import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11005m;
import com.etsy.android.stylekit.views.CollageRadioGroup;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$setUpPriceFields$1$2 */
public final class SearchFiltersV2Fragment$setUpPriceFields$1$2 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ int $customFieldsRadioIndex;
    public final /* synthetic */ CollageTextInput $customMaxPrice;
    public final /* synthetic */ CollageTextInput $customMinPrice;
    public final /* synthetic */ C11005m.C11006a $priceFilterUi;
    public final /* synthetic */ CollageRadioGroup $radioGroup;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$setUpPriceFields$1$2(CollageRadioGroup collageRadioGroup, SearchFiltersV2Fragment searchFiltersV2Fragment, C11005m.C11006a aVar, int i, CollageTextInput collageTextInput, CollageTextInput collageTextInput2) {
        super(0);
        this.$radioGroup = collageRadioGroup;
        this.this$0 = searchFiltersV2Fragment;
        this.$priceFilterUi = aVar;
        this.$customFieldsRadioIndex = i;
        this.$customMinPrice = collageTextInput;
        this.$customMaxPrice = collageTextInput2;
    }

    public final void invoke() {
        CollageRadioGroup collageRadioGroup = this.$radioGroup;
        if (collageRadioGroup != null) {
            int i = this.$customFieldsRadioIndex;
            SearchFiltersV2Fragment searchFiltersV2Fragment = this.this$0;
            C11005m.C11006a aVar = this.$priceFilterUi;
            CollageTextInput collageTextInput = this.$customMinPrice;
            CollageTextInput collageTextInput2 = this.$customMaxPrice;
            collageRadioGroup.setOnCheckedChangeListener((CollageRadioGroup.C9044a) null);
            collageRadioGroup.check(i);
            collageRadioGroup.setOnCheckedChangeListener(searchFiltersV2Fragment.onPriceChangeListener(aVar, collageTextInput, collageTextInput2));
        }
        this.this$0.selectCustomPriceMultiSelectOption(this.$priceFilterUi);
    }
}
