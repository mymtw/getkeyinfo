package com.etsy.android.p327ui.favorites.search;

import android.widget.Button;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$filterButton$2 */
public final class SearchView$filterButton$2 extends Lambda implements C19846a<Button> {
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$filterButton$2(SearchView searchView) {
        super(0);
        this.this$0 = searchView;
    }

    public final Button invoke() {
        return (Button) this.this$0.findViewById(R.id.list_item_search_in_favorites_filter_button);
    }
}
