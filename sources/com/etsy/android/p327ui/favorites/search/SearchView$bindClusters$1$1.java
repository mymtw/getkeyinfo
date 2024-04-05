package com.etsy.android.p327ui.favorites.search;

import com.etsy.android.p327ui.favorites.search.clusters.ClusterItem;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.search.SearchView$bindClusters$1$1 */
public final class SearchView$bindClusters$1$1 extends Lambda implements C19857l<ClusterItem, C19394m> {
    public final /* synthetic */ SearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView$bindClusters$1$1(SearchView searchView) {
        super(1);
        this.this$0 = searchView;
    }

    public final void invoke(ClusterItem clusterItem) {
        C19383o.m32797g(clusterItem, "cluster");
        C19394m unused = this.this$0.trackClusterTapped();
        String str = clusterItem.f21811a;
        if (str != null) {
            SearchView searchView = this.this$0;
            C9891e access$getSearchInFavoritesListItem$p = searchView.searchInFavoritesListItem;
            searchView.performSearch(str, access$getSearchInFavoritesListItem$p != null ? access$getSearchInFavoritesListItem$p.f21819b : null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ClusterItem) obj);
        return C19394m.f43287a;
    }
}
