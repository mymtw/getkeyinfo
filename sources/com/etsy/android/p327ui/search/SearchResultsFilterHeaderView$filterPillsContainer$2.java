package com.etsy.android.p327ui.search;

import android.widget.LinearLayout;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$filterPillsContainer$2 */
public final class SearchResultsFilterHeaderView$filterPillsContainer$2 extends Lambda implements C19846a<LinearLayout> {
    public final /* synthetic */ SearchResultsFilterHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$filterPillsContainer$2(SearchResultsFilterHeaderView searchResultsFilterHeaderView) {
        super(0);
        this.this$0 = searchResultsFilterHeaderView;
    }

    public final LinearLayout invoke() {
        return (LinearLayout) this.this$0.findViewById(R.id.filter_pills_container);
    }
}
