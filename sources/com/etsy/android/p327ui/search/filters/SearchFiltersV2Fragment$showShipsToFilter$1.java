package com.etsy.android.p327ui.search.filters;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.filters.SearchFiltersV2Fragment$showShipsToFilter$1 */
public final class SearchFiltersV2Fragment$showShipsToFilter$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ SearchFiltersV2Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFiltersV2Fragment$showShipsToFilter$1(SearchFiltersV2Fragment searchFiltersV2Fragment) {
        super(1);
        this.this$0 = searchFiltersV2Fragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        this.this$0.onCountrySelectorClicked();
        this.this$0.trackAdHocEvent("filter_ships_to_update_tapped");
    }
}
