package com.etsy.android.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.VespaBaseFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p415of.C13173c;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13382d;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;

public final class VespaArbitraryEndpointFragment extends VespaBaseFragment<Page> implements C9731e0.C9732a, C13366a {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    public C11780h favoriteRepository;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
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

    public String getApiUrl() {
        return "bespoke/public/search-home";
    }

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

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
        throw null;
    }

    public String getFragmentTitleString() {
        return "BOE Arbitrary Vespa Demo";
    }

    public C13379a getPagination() {
        return new C13382d();
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

    public final C13461f getRxSchedulers() {
        C13461f fVar = this.rxSchedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("rxSchedulers");
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        C13173c adapter = getAdapter();
        C8703p analyticsContext = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository2 = getAdImpressionRepository();
        C12724a deepLinkEligibility2 = getDeepLinkEligibility();
        C12741o routeInspector2 = getRouteInspector();
        C13851a deepLinkEntityChecker2 = getDeepLinkEntityChecker();
        C10865h searchUriParser2 = getSearchUriParser();
        C13799a aVar = r0;
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        View view = onCreateView;
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository2, deepLinkEligibility2, routeInspector2, deepLinkEntityChecker2, searchUriParser2, this, (ListingCardViewHolderOptions) null, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 63488);
        addDelegateViewHolderFactory(new C13801b(aVar));
        return view;
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

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setRouteInspector(C12741o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.routeInspector = oVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSearchUriParser(C10865h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.searchUriParser = hVar;
    }
}
