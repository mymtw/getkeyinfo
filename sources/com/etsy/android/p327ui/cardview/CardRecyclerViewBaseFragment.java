package com.etsy.android.p327ui.cardview;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.vespa.VespaBaseFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p415of.C13171a;
import p439rf.C13363b;
import p440s9.C13366a;
import p472wb.C13801b;
import p472wb.C13808f;
import p478x9.C13851a;

/* renamed from: com.etsy.android.ui.cardview.CardRecyclerViewBaseFragment */
public abstract class CardRecyclerViewBaseFragment extends VespaBaseFragment<Page> implements C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    private C13801b cardViewHolderFactory;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    private C13363b finishedLoadingListener;
    public C12741o routeInspector;
    public C10865h searchUriParser;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public abstract C13801b getCardViewHolderFactory();

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final C13851a getDeepLinkEntityChecker() {
        C13851a aVar = this.deepLinkEntityChecker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEntityChecker");
        throw null;
    }

    public final C13363b getFinishedLoadingListener() {
        return this.finishedLoadingListener;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C12741o getRouteInspector() {
        C12741o oVar = this.routeInspector;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("routeInspector");
        throw null;
    }

    public final C10865h getSearchUriParser() {
        C10865h hVar = this.searchUriParser;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("searchUriParser");
        throw null;
    }

    public void initAdapter() {
        this.adapter = new C13808f(this, getAnalyticsContext(), this);
        C13801b cardViewHolderFactory2 = getCardViewHolderFactory();
        this.cardViewHolderFactory = cardViewHolderFactory2;
        if (cardViewHolderFactory2 != null) {
            cardViewHolderFactory2.getClass();
            if (cardViewHolderFactory2 != null) {
                addDelegateViewHolderFactory(cardViewHolderFactory2);
            } else {
                C19383o.m32805o("cardViewHolderFactory");
                throw null;
            }
        } else {
            C19383o.m32805o("cardViewHolderFactory");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            C9125j jVar = new C9125j(this, getAdapter(), getAnalyticsContext(), (C9126k.C9128b) null, getAdImpressionRepository());
            getAdapter().mo45897p(R.id.view_type_formatted_listing_card, jVar);
            getAdapter().mo45897p(R.id.view_type_listing_card, jVar);
            getAdapter().mo45897p(R.id.view_type_discover_listing_card, jVar);
        }
    }

    public final void registerCardViewFactoryClickHandler(int i, C13171a<?> aVar) {
        C19383o.m32797g(aVar, "clickHandler");
        C13801b bVar = this.cardViewHolderFactory;
        if (bVar != null) {
            bVar.mo45894i(i, aVar);
        } else {
            C19383o.m32805o("cardViewHolderFactory");
            throw null;
        }
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setFinishedLoadingListener(C13363b bVar) {
        this.finishedLoadingListener = bVar;
    }

    public final void setLayoutManager(Class<? extends RecyclerView.C3100o> cls) {
        C19383o.m32797g(cls, "layoutManagerClass");
        if (C19383o.m32792b(cls, StaggeredGridLayoutManager.class)) {
            this.recyclerView.setLayoutManager(new StaggeredGridLayoutManager(getResources().getInteger(R.integer.vespa_staggered_grid_layout_max_span)));
            this.recyclerView.setHasFixedSize(false);
            C13801b bVar = this.cardViewHolderFactory;
            if (bVar != null) {
                bVar.f30397j = true;
            } else {
                C19383o.m32805o("cardViewHolderFactory");
                throw null;
            }
        } else if (C19383o.m32792b(cls, GridLayoutManager.class)) {
            requireActivity();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getAdapter().f28991c.f28990i);
            this.recyclerView.setLayoutManager(gridLayoutManager);
            gridLayoutManager.f7008K = getAdapter().mo45896m();
            C13801b bVar2 = this.cardViewHolderFactory;
            if (bVar2 != null) {
                bVar2.f30397j = false;
            } else {
                C19383o.m32805o("cardViewHolderFactory");
                throw null;
            }
        } else {
            RecyclerView recyclerView = this.recyclerView;
            requireActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            C13801b bVar3 = this.cardViewHolderFactory;
            if (bVar3 != null) {
                bVar3.f30397j = false;
            } else {
                C19383o.m32805o("cardViewHolderFactory");
                throw null;
            }
        }
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setSearchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.searchUriParser = hVar;
    }
}
