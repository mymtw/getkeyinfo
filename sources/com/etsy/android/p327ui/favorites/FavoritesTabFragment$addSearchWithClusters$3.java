package com.etsy.android.p327ui.favorites;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.p327ui.favorites.createalist.C9798xa08d92;
import com.etsy.android.p327ui.favorites.createalist.C9817i;
import com.etsy.android.p327ui.favorites.search.SearchView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p412oc.C13151c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$addSearchWithClusters$3 */
public final class FavoritesTabFragment$addSearchWithClusters$3 extends Lambda implements C19857l<C13151c, C19394m> {
    public final /* synthetic */ FavoritesTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritesTabFragment$addSearchWithClusters$3(FavoritesTabFragment favoritesTabFragment) {
        super(1);
        this.this$0 = favoritesTabFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13151c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13151c cVar) {
        View view = this.this$0.getView();
        if (view != null) {
            C9817i access$getCreateNewCollectionButton$p = this.this$0.createNewCollectionButton;
            ViewGroup viewGroup = (ViewGroup) view;
            access$getCreateNewCollectionButton$p.getClass();
            View view2 = access$getCreateNewCollectionButton$p.f21715a;
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
            View view3 = access$getCreateNewCollectionButton$p.f21715a;
            if (view3 != null) {
                view3.addOnLayoutChangeListener(new C9798xa08d92(viewGroup));
            }
        }
        SearchView access$getSearchView = this.this$0.getSearchView();
        if (access$getSearchView != null) {
            FavoritesTabFragment favoritesTabFragment = this.this$0;
            C19383o.m32795e(cVar, "null cannot be cast to non-null type com.etsy.android.ui.favorites.search.clusters.domain.ClustersResult.Success");
            access$getSearchView.setClusters(((C13151c.C13153b) cVar).f28929a);
            RecyclerView r4 = favoritesTabFragment.recyclerView;
            if (r4 != null) {
                r4.addOnScrollListener(access$getSearchView.getSearchWithClustersOnScrollListener());
            }
        }
    }
}
