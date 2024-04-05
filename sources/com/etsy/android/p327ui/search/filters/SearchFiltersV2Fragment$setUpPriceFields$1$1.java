package com.etsy.android.p327ui.search.filters;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$setUpPriceFields$1$1 */
public final class SearchFiltersV2Fragment$setUpPriceFields$1$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ int $customFieldsRadioIndex;
    public final /* synthetic */ Ref$ObjectRef<String> $max;
    public final /* synthetic */ Ref$ObjectRef<String> $min;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$setUpPriceFields$1$1(Ref$ObjectRef<String> ref$ObjectRef, SearchFiltersV2Fragment searchFiltersV2Fragment, Ref$ObjectRef<String> ref$ObjectRef2, int i) {
        super(1);
        this.$min = ref$ObjectRef;
        this.this$0 = searchFiltersV2Fragment;
        this.$max = ref$ObjectRef2;
        this.$customFieldsRadioIndex = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "minText");
        this.$min.element = str;
        this.this$0.getViewModel().mo35755u(this.$customFieldsRadioIndex, (String) this.$min.element, (String) this.$max.element);
        this.this$0.customPriceTracked = false;
    }
}
