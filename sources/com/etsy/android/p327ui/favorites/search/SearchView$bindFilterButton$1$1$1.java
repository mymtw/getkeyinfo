package com.etsy.android.p327ui.favorites.search;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8672b;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$bindFilterButton$1$1$1 */
public final class SearchView$bindFilterButton$1$1$1 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ C9891e $item;
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$bindFilterButton$1$1$1(SearchView searchView, C9891e eVar) {
        super(1);
        this.this$0 = searchView;
        this.$item = eVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C8672b access$getAnalyticsTracker$p = this.this$0.analyticsTracker;
        if (access$getAnalyticsTracker$p != null) {
            access$getAnalyticsTracker$p.mo21333d(FavoriteSearchAnalytics.COLLECTION_FILTER_TAPPED.getAnalyticsId(), (Map<? extends AnalyticsProperty, Object>) null);
        }
        C9885a aVar = this.$item.f21824g;
        if (aVar != null) {
            aVar.onFiltersClicked();
        }
    }
}
