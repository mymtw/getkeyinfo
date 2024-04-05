package com.etsy.android.p327ui.favorites.search;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$clustersRecyclerView$2 */
public final class SearchView$clustersRecyclerView$2 extends Lambda implements C19846a<RecyclerView> {
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$clustersRecyclerView$2(SearchView searchView) {
        super(0);
        this.this$0 = searchView;
    }

    public final RecyclerView invoke() {
        return (RecyclerView) this.this$0.findViewById(R.id.list_item_search_in_favorites_clusters_recycler_view);
    }
}
