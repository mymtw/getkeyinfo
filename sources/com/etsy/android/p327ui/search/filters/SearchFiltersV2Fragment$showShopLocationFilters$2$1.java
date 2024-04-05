package com.etsy.android.p327ui.search.filters;

import com.etsy.android.stylekit.views.CollageContentToggle;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShopLocationFilters$2$1 */
public final class SearchFiltersV2Fragment$showShopLocationFilters$2$1 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ CollageContentToggle $contentToggle;
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showShopLocationFilters$2$1(SearchFiltersV2Fragment searchFiltersV2Fragment, CollageContentToggle collageContentToggle) {
        super(1);
        this.this$0 = searchFiltersV2Fragment;
        this.$contentToggle = collageContentToggle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        C19383o.m32797g(str, "text");
        this.this$0.updateCustomShopLocation(this.$contentToggle, str);
    }
}
