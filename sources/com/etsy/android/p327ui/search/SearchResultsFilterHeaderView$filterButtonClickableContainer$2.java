package com.etsy.android.p327ui.search;

import android.widget.FrameLayout;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.SearchResultsFilterHeaderView$filterButtonClickableContainer$2 */
public final class SearchResultsFilterHeaderView$filterButtonClickableContainer$2 extends Lambda implements C19846a<FrameLayout> {
    public final /* synthetic */ SearchResultsFilterHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultsFilterHeaderView$filterButtonClickableContainer$2(SearchResultsFilterHeaderView searchResultsFilterHeaderView) {
        super(0);
        this.this$0 = searchResultsFilterHeaderView;
    }

    public final FrameLayout invoke() {
        return (FrameLayout) this.this$0.findViewById(R.id.filter_button_clickable_container);
    }
}
