package com.etsy.android.p327ui.favorites.search;

import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageButton;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$createCollectionButton$2 */
public final class SearchView$createCollectionButton$2 extends Lambda implements C19846a<CollageButton> {
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$createCollectionButton$2(SearchView searchView) {
        super(0);
        this.this$0 = searchView;
    }

    public final CollageButton invoke() {
        return (CollageButton) this.this$0.findViewById(R.id.list_item_search_in_favorites_create_collection_button);
    }
}
