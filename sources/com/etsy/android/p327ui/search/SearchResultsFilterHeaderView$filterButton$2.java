package com.etsy.android.p327ui.search;

import android.widget.Button;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$filterButton$2 */
public final class SearchResultsFilterHeaderView$filterButton$2 extends Lambda implements C19846a<Button> {
    public final /* synthetic */ SearchResultsFilterHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$filterButton$2(SearchResultsFilterHeaderView searchResultsFilterHeaderView) {
        super(0);
        this.this$0 = searchResultsFilterHeaderView;
    }

    public final Button invoke() {
        return (Button) this.this$0.findViewById(R.id.filter_button);
    }
}
