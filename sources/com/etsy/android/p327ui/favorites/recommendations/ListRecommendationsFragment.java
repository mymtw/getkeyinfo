package com.etsy.android.p327ui.favorites.recommendations;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0388a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10744d;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.VespaBaseFragment;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p400mf.C13074b;
import p400mf.C13078c;
import p415of.C13173c;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.recommendations.ListRecommendationsFragment */
public final class ListRecommendationsFragment extends VespaBaseFragment<Page> implements C13366a {
    public static final int $stable = 8;
    public static final String COLLECTION_KEY = "collection_key";
    public static final C9869a Companion = new C9869a();
    public static final String SLUG = "slug";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    /* access modifiers changed from: private */
    public Collection collection;
    private String collectionId;
    /* access modifiers changed from: private */
    public String collectionKey;
    private int count = -1;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    public C11780h favoriteRepository;
    private ListingCardViewHolderOptions listingCardOptions;
    private RecyclerView.C3108s onScrollListener;
    private final C13380b pagination = new C13380b();
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    public C10865h searchUriParser;
    private String slug;

    /* renamed from: com.etsy.android.ui.favorites.recommendations.ListRecommendationsFragment$a */
    public static final class C9869a {
    }

    /* renamed from: com.etsy.android.ui.favorites.recommendations.ListRecommendationsFragment$b */
    public static final class C9870b implements C13078c {

        /* renamed from: a */
        public final /* synthetic */ ListRecommendationsFragment f21780a;

        public C9870b(ListRecommendationsFragment listRecommendationsFragment) {
            this.f21780a = listRecommendationsFragment;
        }

        /* renamed from: a */
        public final void mo31411a(C13074b bVar) {
            String str;
            C19383o.m32797g(bVar, "update");
            if (bVar instanceof C13074b.C13075a) {
                Collection access$getCollection$p = this.f21780a.collection;
                if (access$getCollection$p == null || (str = access$getCollection$p.getKey()) == null) {
                    str = this.f21780a.collectionKey;
                }
                C13074b.C13075a aVar = (C13074b.C13075a) bVar;
                List<String> list = aVar.f28747c;
                boolean z = true;
                if (list == null || !C19327t.m32634P0(str, list)) {
                    z = false;
                }
                if (z) {
                    this.f21780a.handleAddToCollection(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleAddToCollection(C13074b.C13075a aVar) {
        removeListingFromSuggestions(aVar.f28748d);
    }

    private final void removeListingFromSuggestions(ListingLike listingLike) {
        int indexOf = this.adapter.getItems().indexOf(listingLike);
        if (indexOf >= 0 && indexOf < this.adapter.getItemCount()) {
            removeItemAtPosition(indexOf);
        }
    }

    private final void setSlugAndKeyFromDeepLink(String str) {
        Uri parse = Uri.parse(str);
        C12741o routeInspector2 = getRouteInspector();
        C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        routeInspector2.getClass();
        this.collectionKey = parse.getQueryParameter(COLLECTION_KEY);
        getRouteInspector().getClass();
        this.slug = parse.getQueryParameter("slug");
    }

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

    public final void addOnScrollListener(RecyclerView.C3108s sVar) {
        this.onScrollListener = sVar;
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
        Collection collection2 = this.collection;
        if (collection2 == null) {
            return C0388a.m1049e(new Object[]{this.slug}, 1, "/etsyapps/v3/bespoke/member/collections/recommendations-page?slug=%s", "format(format, *args)");
        }
        C19383o.m32794d(collection2);
        return C0388a.m1049e(new Object[]{collection2.getSlug()}, 1, "/etsyapps/v3/bespoke/member/collections/recommendations-page?slug=%s", "format(format, *args)");
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

    public int getLayoutId() {
        return R.layout.fragment_vespa_recyclerview;
    }

    public C13379a getPagination() {
        return this.pagination;
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

    public String getTrackingName() {
        return "lists_suggestions";
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Lifecycle lifecycle = getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        new HeartMonitor(lifecycle, new C9870b(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable(Collection.TYPE_COLLECTION);
        this.collection = serializable instanceof Collection ? (Collection) serializable : null;
        this.collectionKey = requireArguments().getString(COLLECTION_KEY);
        this.slug = requireArguments().getString("slug");
        this.collectionId = requireArguments().getString(ResponseConstants.COLLECTION_ID);
        this.count = requireArguments().getInt(ResponseConstants.COUNT);
        String string = requireArguments().getString("deepLink");
        if (C18263b.m30839d0(string)) {
            setSlugAndKeyFromDeepLink(string);
        }
        ListingCardViewHolderOptions.C11970d dVar = r0;
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        ListingCardViewHolderOptions.C11970d dVar2 = new ListingCardViewHolderOptions.C11970d(configMap);
        C13173c adapter = getAdapter();
        C8703p analyticsContext = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository2 = getAdImpressionRepository();
        C12724a deepLinkEligibility2 = getDeepLinkEligibility();
        C12741o routeInspector2 = getRouteInspector();
        C13851a deepLinkEntityChecker2 = getDeepLinkEntityChecker();
        C10865h searchUriParser2 = getSearchUriParser();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13799a aVar = r0;
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository2, deepLinkEligibility2, routeInspector2, deepLinkEntityChecker2, searchUriParser2, this, dVar, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440);
        addDelegateViewHolderFactory(new C13801b(aVar));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19394m mVar;
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_16);
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "");
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
        RecyclerView.C3108s sVar = this.onScrollListener;
        if (sVar != null) {
            recyclerView.addOnScrollListener(sVar);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), dimensionPixelSize, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        }
        if (this.listingCardOptions == null) {
            C8623e configMap = getConfigMap();
            C19383o.m32796f(configMap, "configMap");
            this.listingCardOptions = new ListingCardViewHolderOptions.C11970d(configMap);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.edge_edge_listing_spacing);
        this.recyclerView.addItemDecoration(new C10744d(dimensionPixelSize2, dimensionPixelSize2, true));
        return onCreateView;
    }

    public void onRefresh() {
        this.adapter.clear();
        super.onRefresh();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        AppBarHelper appBarHelper = ((BaseActivity) activity).getAppBarHelper();
        if (appBarHelper != null) {
            appBarHelper.removeViewBelowAppBar(false);
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
