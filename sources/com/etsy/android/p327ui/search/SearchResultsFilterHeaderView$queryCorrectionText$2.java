package com.etsy.android.p327ui.search;

import android.widget.TextView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$queryCorrectionText$2 */
public final class SearchResultsFilterHeaderView$queryCorrectionText$2 extends Lambda implements C19846a<TextView> {
    public final /* synthetic */ SearchResultsFilterHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$queryCorrectionText$2(SearchResultsFilterHeaderView searchResultsFilterHeaderView) {
        super(0);
        this.this$0 = searchResultsFilterHeaderView;
    }

    public final TextView invoke() {
        return (TextView) this.this$0.findViewById(R.id.query_correction);
    }
}
