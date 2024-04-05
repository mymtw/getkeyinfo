package com.etsy.android.p327ui.core;

import android.content.Context;
import com.etsy.android.p327ui.favorites.search.SearchView;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$searchView$2 */
public final class CollectionFragment$searchView$2 extends Lambda implements C19846a<SearchView> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$searchView$2(CollectionFragment collectionFragment) {
        super(0);
        this.this$0 = collectionFragment;
    }

    public final SearchView invoke() {
        Context context = this.this$0.getContext();
        if (context != null) {
            return new SearchView(this.this$0.getAnalyticsTracker(), context);
        }
        return null;
    }
}
