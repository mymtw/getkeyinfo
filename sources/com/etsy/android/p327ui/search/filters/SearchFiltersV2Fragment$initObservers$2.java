package com.etsy.android.p327ui.search.filters;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$initObservers$2 */
public final class SearchFiltersV2Fragment$initObservers$2 extends Lambda implements C19857l<Boolean, C19394m> {
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$initObservers$2(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        super(1);
        this.this$0 = searchFiltersV2Fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C19394m.f43287a;
    }

    public final void invoke(boolean z) {
        this.this$0.showLoader(z);
    }
}
