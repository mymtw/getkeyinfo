package com.etsy.android.p327ui.favorites;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$addSearchWithClusters$1$1 */
public final class FavoritesTabFragment$addSearchWithClusters$1$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ FavoritesTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabFragment$addSearchWithClusters$1$1(FavoritesTabFragment favoritesTabFragment) {
        super(0);
        this.this$0 = favoritesTabFragment;
    }

    public final void invoke() {
        new CreateACollectionClickHandler().onClick(this.this$0.getView());
    }
}
