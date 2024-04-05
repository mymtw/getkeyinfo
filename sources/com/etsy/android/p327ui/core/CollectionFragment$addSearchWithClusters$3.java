package com.etsy.android.p327ui.core;

import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.favorites.search.SearchView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p412oc.C13151c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.core.CollectionFragment$addSearchWithClusters$3 */
public final class CollectionFragment$addSearchWithClusters$3 extends Lambda implements C19857l<C13151c, C19394m> {
    public final /* synthetic */ CollectionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFragment$addSearchWithClusters$3(CollectionFragment collectionFragment) {
        super(1);
        this.this$0 = collectionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13151c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13151c cVar) {
        SearchView access$getSearchView = this.this$0.getSearchView();
        if (access$getSearchView != null) {
            CollectionFragment collectionFragment = this.this$0;
            C19383o.m32795e(cVar, "null cannot be cast to non-null type com.etsy.android.ui.favorites.search.clusters.domain.ClustersResult.Success");
            access$getSearchView.setClusters(((C13151c.C13153b) cVar).f28929a);
            RecyclerView r4 = collectionFragment.recyclerView;
            if (r4 != null) {
                r4.addOnScrollListener(access$getSearchView.getSearchWithClustersOnScrollListener());
            }
        }
    }
}
