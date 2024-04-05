package com.etsy.android.p327ui.favorites;

import com.etsy.android.p327ui.favorites.search.SearchView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$addSearchWithClusters$2 */
public final class FavoritesTabFragment$addSearchWithClusters$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ FavoritesTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabFragment$addSearchWithClusters$2(FavoritesTabFragment favoritesTabFragment) {
        super(1);
        this.this$0 = favoritesTabFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        SearchView access$getSearchView = this.this$0.getSearchView();
        if (access$getSearchView != null) {
            access$getSearchView.showClusters(false);
        }
    }
}
