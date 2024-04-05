package com.etsy.android.p327ui.favorites;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.TimedMetric;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.cardviewelement.Page;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.p327ui.cardview.CardRecyclerViewBaseFragment;
import com.etsy.android.p327ui.cardview.clickhandlers.C9121f;
import com.etsy.android.p327ui.cardview.viewholders.C9168d0;
import com.etsy.android.p327ui.favorites.createalist.C9800b;
import com.etsy.android.p327ui.favorites.createalist.C9817i;
import com.etsy.android.p327ui.favorites.recommendations.C9875e;
import com.etsy.android.p327ui.favorites.search.C9886b;
import com.etsy.android.p327ui.favorites.search.C9890d;
import com.etsy.android.p327ui.favorites.search.C9891e;
import com.etsy.android.p327ui.favorites.search.SearchView;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10744d;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.viewholders.C12086e;
import com.etsy.android.vespa.viewholders.C12090g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import p001a0.C0005b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.C12965a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.observable.C19156d0;
import p145io.reactivex.internal.operators.observable.C19168j;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p251u1.C8115a;
import p277w8.C8267e;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p412oc.C13149a;
import p412oc.C13150b;
import p412oc.C13151c;
import p415of.C13173c;
import p415of.C13184m;
import p415of.C13185n;
import p415of.C13186o;
import p423pf.C13231b;
import p425q9.C13261l;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13461f;
import p464va.C13554f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p486y9.C13888d;
import p568fn.C17782b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment */
public final class FavoritesTabFragment extends CardRecyclerViewBaseFragment implements C11321e, C9890d {
    public static final int $stable = 8;
    public static final C9738a Companion = new C9738a();
    private static final int DEFAULT_TOP_PADDING_RES = 2131165386;
    private static final String FAVORITES_TAB_NAME = "favorite-listings";
    private static final String QUERY = "&query=";
    private static final int SEARCH_INDEX = 0;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8672b analyticsTracker;
    private final FavoritesTabFragment$broadcastReceiver$1 broadcastReceiver = new FavoritesTabFragment$broadcastReceiver$1(this);
    public C13150b clusterRepository;
    public C13149a clustersEligibility;
    private final C7091a compositeDisposable = new C7091a();
    /* access modifiers changed from: private */
    public C9800b createACollectionState;
    /* access modifiers changed from: private */
    public final C9817i createNewCollectionButton = new C9817i();
    public C13888d currentLocale;
    public C9863o eligibility;
    public C11780h favoriteRepository;
    public C8709f favoritesPerformanceTracker;
    public C12703a grafana;
    private ListingCardViewHolderOptions listingCardOptions;
    public C8694h logCat;
    /* access modifiers changed from: private */
    public boolean needsRefresh;
    private Page page;
    private final C13380b pagination = new C13380b();
    public C8951c qualtricsWrapper;
    private String query;
    public C9875e recommendationsOnFavoritesEligibility;
    public C13461f rxSchedulers;
    private C9891e searchInFavoritesListItem;
    private final C19285c searchView$delegate = C19350d.m32677b(new FavoritesTabFragment$searchView$2(this));
    private HomeTab tabData;
    private boolean tabIsFavorites;
    private C8707d timeToFirstContent;
    private int verticalPadding;

    /* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$a */
    public static final class C9738a {
    }

    /* renamed from: com.etsy.android.ui.favorites.FavoritesTabFragment$b */
    public static final class C9739b extends C13801b {

        /* renamed from: I */
        public final /* synthetic */ FavoritesTabFragment f21535I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9739b(FavoritesTabFragment favoritesTabFragment, C13799a aVar) {
            super(aVar);
            this.f21535I = favoritesTabFragment;
        }

        /* renamed from: b */
        public final C12086e<? extends Object> mo31854b(ViewGroup viewGroup, int i) {
            C12086e<? extends Object> eVar;
            C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
            if (i == R.id.view_type_button) {
                Object f = this.f28982a.mo19993f(i, (Integer) null);
                C19383o.m32795e(f, "null cannot be cast to non-null type com.etsy.android.vespa.clickhandlers.ButtonClickHandler");
                eVar = new C12090g(viewGroup, (C13231b) f, R.dimen.card_view_top_margin, R.dimen.clg_space_8);
            } else if (i != R.id.view_type_section_header_with_page_link) {
                return super.mo31854b(viewGroup, i);
            } else {
                Object f2 = this.f28982a.mo19993f(i, (Integer) null);
                C19383o.m32795e(f2, "null cannot be cast to non-null type com.etsy.android.ui.cardview.clickhandlers.ListSectionHeaderClickHandler");
                eVar = new C9168d0(viewGroup, (C9121f) f2);
                int dimensionPixelSize = this.f21535I.getResources().getDimensionPixelSize(R.dimen.clg_space_12);
                View view = eVar.itemView;
                C19383o.m32796f(view, "itemView");
                view.setPadding(dimensionPixelSize, view.getPaddingTop(), dimensionPixelSize, view.getPaddingBottom());
            }
            return eVar;
        }
    }

    private final C13185n addSearchToPage(C13185n nVar) {
        return isSearchEnabled() ? mapResultWithSearch(nVar.getListSections()).mo20656d() : nVar;
    }

    private final void addSearchWithClusters() {
        if (isSearchEnabled()) {
            SearchView searchView = getSearchView();
            if (searchView != null) {
                searchView.bind(getSearchInFavoritesListItem());
                searchView.setOnCollectionMenuButtonClickedListener(new FavoritesTabFragment$addSearchWithClusters$1$1(this));
            }
            AppBarHelper appBarHelper = getAppBarHelper();
            if (appBarHelper != null) {
                appBarHelper.addViewBelowAppBar((View) getSearchView(), true);
            }
            if (shouldShowClusters()) {
                C8071s<C13151c> a = getClusterRepository().mo45858a();
                getRxSchedulers().getClass();
                SingleSubscribeOn i = a.mo20660i(C13461f.m21235b());
                getRxSchedulers().getClass();
                ConsumerSingleObserver e = SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new FavoritesTabFragment$addSearchWithClusters$2(this), new FavoritesTabFragment$addSearchWithClusters$3(this));
                C7091a aVar = this.compositeDisposable;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            }
        }
    }

    private final boolean areListingCardsOnly() {
        C13185n page2;
        Page page3 = this.page;
        if (page3 != null) {
            return C0005b.m17K(page3);
        }
        HomeTab homeTab = this.tabData;
        Boolean bool = null;
        if (!(homeTab == null || (page2 = homeTab.getPage()) == null)) {
            bool = Boolean.valueOf(C0005b.m17K(page2));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final AppBarHelper getAppBarHelper() {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        return ((BaseActivity) activity).getAppBarHelper();
    }

    private final C9891e getSearchInFavoritesListItem() {
        String string = getResources().getString(R.string.hint_search_in_your_favorites);
        String str = this.query;
        boolean shouldShowClusters = shouldShowClusters();
        boolean b = getRecommendationsOnFavoritesEligibility().f21801a.mo21132b(C8592b.C8593a.f18852b);
        C19383o.m32796f(string, "getString(R.string.hint_search_in_your_favorites)");
        C9891e eVar = new C9891e(string, this, false, shouldShowClusters, b, str, 64);
        this.searchInFavoritesListItem = eVar;
        return eVar;
    }

    /* access modifiers changed from: private */
    public final SearchView getSearchView() {
        return (SearchView) this.searchView$delegate.getValue();
    }

    private final String getUrlWithQueryAndParams(String str) {
        if (isSearchEnabled() && C18263b.m30839d0(this.query)) {
            StringBuilder k = C0073e.m211k(str, QUERY);
            k.append(this.query);
            str = k.toString();
        }
        StringBuilder k2 = C0073e.m211k(str, "&include_recs_on_landing=");
        k2.append(getRecommendationsOnFavoritesEligibility().f21801a.mo21132b(C8592b.C8593a.f18852b));
        String sb = k2.toString();
        return sb == null ? "" : sb;
    }

    private final boolean hasCollections() {
        C13185n page2;
        Page page3 = this.page;
        if (page3 != null) {
            return C0005b.m43i0(page3);
        }
        HomeTab homeTab = this.tabData;
        Boolean bool = null;
        if (!(homeTab == null || (page2 = homeTab.getPage()) == null)) {
            bool = Boolean.valueOf(C0005b.m43i0(page2));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean isSearchEnabled() {
        return this.tabIsFavorites && getConfigMap().mo21132b(C8592b.C8598f.f18872b) && areListingCardsOnly();
    }

    private final boolean isSearching() {
        return C18263b.m30839d0(this.query);
    }

    private final C8071s<Page> mapResultWithSearch(List<? extends C13184m> list) {
        if (list != null) {
            C19168j jVar = new C19168j(list);
            C12965a.m20651c(16, "capacityHint");
            return new C19208j(new C19156d0(jVar), new C13261l(this, 4));
        }
        throw new NullPointerException("source is null");
    }

    /* access modifiers changed from: private */
    /* renamed from: mapResultWithSearch$lambda-4  reason: not valid java name */
    public static final Page m34972mapResultWithSearch$lambda4(FavoritesTabFragment favoritesTabFragment, List list) {
        boolean z;
        C19394m mVar;
        List<C13186o> items;
        C19383o.m32797g(favoritesTabFragment, "this$0");
        C19383o.m32797g(list, "it");
        Page page2 = new Page();
        ListSection listSection = new ListSection();
        ArrayList arrayList = new ArrayList();
        C13184m mVar2 = (C13184m) C19327t.m32640V0(list);
        boolean z2 = true;
        if (mVar2 == null || (items = mVar2.getItems()) == null) {
            mVar = null;
            z = false;
        } else {
            Iterator<T> it = items.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else if (((C13186o) it.next()).getViewType() == R.id.view_type_listing_card) {
                        z = true;
                    }
                }
            }
            mVar = C19394m.f43287a;
        }
        if (mVar != null || !favoritesTabFragment.isSearching()) {
            z2 = z;
        } else {
            arrayList.add(new C9886b(favoritesTabFragment.query));
        }
        if (z2 && !favoritesTabFragment.shouldShowClusters()) {
            arrayList.add(0, favoritesTabFragment.getSearchInFavoritesListItem());
        }
        listSection.setItems(arrayList);
        page2.addListSection(listSection);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C13184m mVar3 = (C13184m) it2.next();
            C19383o.m32795e(mVar3, "null cannot be cast to non-null type com.etsy.android.lib.models.cardviewelement.ListSection");
            page2.addListSection((ListSection) mVar3);
        }
        return page2;
    }

    private final boolean noResults(C13554f.C13556b bVar) {
        Page page2 = bVar.f29640a;
        return (page2 != null ? page2.getMessageCard() : null) == null || isSearching();
    }

    private final void removeSearchWithClusters() {
        RecyclerView.C3108s searchWithClustersOnScrollListener;
        RecyclerView recyclerView;
        AppBarHelper appBarHelper = getAppBarHelper();
        if (appBarHelper != null) {
            appBarHelper.removeViewBelowAppBar(false);
        }
        SearchView searchView = getSearchView();
        if (!(searchView == null || (searchWithClustersOnScrollListener = searchView.getSearchWithClustersOnScrollListener()) == null || (recyclerView = this.recyclerView) == null)) {
            recyclerView.removeOnScrollListener(searchWithClustersOnScrollListener);
        }
        C9800b bVar = this.createACollectionState;
        if (bVar != null && shouldShowCreateACollectionButton(bVar.f21687a)) {
            C9817i iVar = this.createNewCollectionButton;
            LayoutInflater layoutInflater = getLayoutInflater();
            C19383o.m32796f(layoutInflater, "layoutInflater");
            View view = getView();
            C19383o.m32795e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
            C19383o.m32796f(swipeRefreshLayout, "swipeRefreshLayout");
            iVar.mo32870a(layoutInflater, (ViewGroup) view, swipeRefreshLayout, new CreateACollectionClickHandler());
        }
    }

    /* access modifiers changed from: private */
    public final void setUpPagination(String str) {
        if (C18263b.m30839d0(str)) {
            this.pagination.mo46065h(this.adapter.getItemCount(), str);
        } else {
            this.pagination.mo46065h(this.adapter.getItemCount(), (String) null);
        }
    }

    private final boolean shouldShowClusters() {
        return getClustersEligibility().mo45857a();
    }

    private final boolean shouldShowCreateACollectionButton(boolean z) {
        return z && getView() != null && (!getRecommendationsOnFavoritesEligibility().f21801a.mo21132b(C8592b.C8593a.f18852b) || hasCollections());
    }

    private final void updateQuery(String str) {
        this.query = str;
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

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r8 = r8.getDeepLinkPath();
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addPage(p415of.C13185n r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "page"
            kotlin.jvm.internal.C19383o.m32797g(r7, r0)
            super.addPage(r7, r8)
            com.etsy.android.lib.models.homescreen.HomeTab r8 = r6.tabData
            r0 = 0
            if (r8 == 0) goto L_0x001a
            java.lang.String r8 = r8.getDeepLinkPath()
            if (r8 == 0) goto L_0x001a
            java.lang.String r1 = "saved-searches"
            boolean r8 = kotlin.text.C19459m.m33036e1(r8, r1, r0)
            goto L_0x001b
        L_0x001a:
            r8 = r0
        L_0x001b:
            java.util.List r1 = r7.getListSections()
            java.lang.String r2 = "page.listSections"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.lang.Object r1 = kotlin.collections.C19327t.m32640V0(r1)
            of.m r1 = (p415of.C13184m) r1
            if (r1 == 0) goto L_0x0039
            java.util.List r1 = r1.getItems()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = kotlin.collections.C19327t.m32640V0(r1)
            of.o r1 = (p415of.C13186o) r1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            boolean r1 = r1 instanceof com.etsy.android.lib.models.StyledBannerModel
            if (r8 == 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            r8 = r0
            goto L_0x004d
        L_0x0042:
            android.content.res.Resources r8 = r6.getResources()
            r1 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r8 = r8.getDimensionPixelSize(r1)
        L_0x004d:
            r6.verticalPadding = r8
            androidx.recyclerview.widget.RecyclerView r1 = r6.recyclerView
            if (r1 == 0) goto L_0x0062
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingRight()
            int r4 = r1.getPaddingBottom()
            r1.setPadding(r2, r8, r3, r4)
        L_0x0062:
            com.etsy.android.ui.favorites.createalist.b r8 = r6.createACollectionState
            if (r8 != 0) goto L_0x00ff
            com.etsy.android.ui.favorites.createalist.i r8 = r6.createNewCollectionButton
            java.lang.String r1 = r6.getTrackingName()
            java.lang.String r2 = "trackingName"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            r8.getClass()
            java.lang.String r8 = "favorites_items"
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r1, r8)
            r1 = 1
            if (r8 != r1) goto L_0x00ef
            java.util.List r7 = r7.getListSections()
            java.lang.String r2 = "listSections"
            kotlin.jvm.internal.C19383o.m32796f(r7, r2)
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x008d
            goto L_0x00ea
        L_0x008d:
            java.util.Iterator r7 = r7.iterator()
        L_0x0091:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00ea
            java.lang.Object r2 = r7.next()
            of.m r2 = (p415of.C13184m) r2
            java.lang.String r3 = "it"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.util.List r2 = r2.getItems()
            java.lang.String r3 = "this.items"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r4 = r2.next()
            boolean r5 = r4 instanceof com.etsy.android.lib.models.apiv3.Collection
            if (r5 == 0) goto L_0x00b4
            r3.add(r4)
            goto L_0x00b4
        L_0x00c6:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x00cd
            goto L_0x00e5
        L_0x00cd:
            java.util.Iterator r2 = r3.iterator()
        L_0x00d1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r2.next()
            com.etsy.android.lib.models.apiv3.Collection r3 = (com.etsy.android.lib.models.apiv3.Collection) r3
            boolean r3 = r3.isTypeFavorites()
            if (r3 == 0) goto L_0x00d1
            r2 = r1
            goto L_0x00e6
        L_0x00e5:
            r2 = r0
        L_0x00e6:
            if (r2 == 0) goto L_0x0091
            r7 = r1
            goto L_0x00eb
        L_0x00ea:
            r7 = r0
        L_0x00eb:
            if (r7 != 0) goto L_0x00f1
            r0 = r1
            goto L_0x00f1
        L_0x00ef:
            if (r8 != 0) goto L_0x00f9
        L_0x00f1:
            com.etsy.android.ui.favorites.createalist.b r7 = new com.etsy.android.ui.favorites.createalist.b
            r7.<init>(r8, r0)
            r6.createACollectionState = r7
            goto L_0x00ff
        L_0x00f9:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.FavoritesTabFragment.addPage(of.n, boolean):void");
    }

    public boolean canScrollUp() {
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        return recyclerView.canScrollVertically(-1);
    }

    public final C8672b getAnalyticsTracker() {
        C8672b bVar = this.analyticsTracker;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("analyticsTracker");
        throw null;
    }

    public String getApiUrl() {
        HomeTab homeTab = this.tabData;
        String apiUrl = homeTab != null ? homeTab.getApiUrl() : null;
        if (apiUrl == null) {
            apiUrl = "";
        }
        if (apiUrl.length() == 0) {
            C12703a grafana2 = getGrafana();
            StringBuilder h = C0072d.m201h("FavoritesTab.");
            h.append(getTrackingName());
            h.append(".error.missing_api_path");
            grafana2.mo45475b(h.toString(), 1.0d);
        }
        return getUrlWithQueryAndParams(apiUrl);
    }

    public C13801b getCardViewHolderFactory() {
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        this.listingCardOptions = new ListingCardViewHolderOptions.C11969c(requireContext().getResources().getDimensionPixelSize(R.dimen.clg_space_8), configMap);
        C13173c adapter = getAdapter();
        C8703p analyticsContext = getAnalyticsContext();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C13461f rxSchedulers2 = getRxSchedulers();
        ListingCardViewHolderOptions listingCardViewHolderOptions = this.listingCardOptions;
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C13799a aVar = r0;
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        C13799a aVar2 = new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, listingCardViewHolderOptions, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440);
        C9739b bVar = new C9739b(this, aVar);
        C8703p analyticsContext2 = getAnalyticsContext();
        C19383o.m32796f(analyticsContext2, "analyticsContext");
        bVar.mo45894i(R.id.view_type_listing_collection, new C9865q(this, analyticsContext2));
        return bVar;
    }

    public final C13150b getClusterRepository() {
        C13150b bVar = this.clusterRepository;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("clusterRepository");
        throw null;
    }

    public final C13149a getClustersEligibility() {
        C13149a aVar = this.clustersEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("clustersEligibility");
        throw null;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C9863o getEligibility() {
        C9863o oVar = this.eligibility;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("eligibility");
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

    public final C8709f getFavoritesPerformanceTracker() {
        C8709f fVar = this.favoritesPerformanceTracker;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("favoritesPerformanceTracker");
        throw null;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public C13379a getPagination() {
        return this.pagination;
    }

    public C8709f getPerformanceTracker() {
        return getFavoritesPerformanceTracker();
    }

    public final C8951c getQualtricsWrapper() {
        C8951c cVar = this.qualtricsWrapper;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("qualtricsWrapper");
        throw null;
    }

    public final C9875e getRecommendationsOnFavoritesEligibility() {
        C9875e eVar = this.recommendationsOnFavoritesEligibility;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("recommendationsOnFavoritesEligibility");
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

    public final C8707d getTimeToFirstContent() {
        return this.timeToFirstContent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != 0 && i == 600) {
            onRefresh();
        }
    }

    public void onCreate(Bundle bundle) {
        String deepLinkPath;
        Bundle arguments = getArguments();
        Integer num = null;
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("transaction-data")) : null;
        boolean z = false;
        if (valueOf != null) {
            num = valueOf;
        } else if (bundle != null) {
            num = Integer.valueOf(bundle.getInt("transaction-data", 0));
        }
        if (!(num == null || num.intValue() == 0)) {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            this.tabData = (HomeTab) TransactionDataRepository.C11867a.m19552a().mo38342a(num.intValue());
        }
        super.onCreate(bundle);
        HomeTab homeTab = this.tabData;
        if ((homeTab == null || homeTab.getPage() == null) ? false : true) {
            HomeTab homeTab2 = this.tabData;
            if (!(homeTab2 == null || (deepLinkPath = homeTab2.getDeepLinkPath()) == null)) {
                z = C19459m.m33036e1(deepLinkPath, FAVORITES_TAB_NAME, false);
            }
            this.tabIsFavorites = z;
            HomeTab homeTab3 = this.tabData;
            C19383o.m32794d(homeTab3);
            C13185n page2 = homeTab3.getPage();
            C19383o.m32794d(page2);
            onLoadComplete(addSearchToPage(page2));
            HomeTab homeTab4 = this.tabData;
            C19383o.m32794d(homeTab4);
            setUpPagination(homeTab4.getNextPath());
        } else {
            C12703a grafana2 = getGrafana();
            StringBuilder h = C0072d.m201h("FavoritesTab.");
            h.append(getTrackingName());
            h.append(".error.missing_tab_data");
            grafana2.mo45474a(h.toString());
        }
        this.verticalPadding = getResources().getDimensionPixelSize(R.dimen.clg_space_12);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(EtsyAction.COLLECTION_EDITED.getIntentAction());
        intentFilter.addAction(EtsyAction.COLLECTION_DELETED.getIntentAction());
        C8115a.m16322a(requireActivity()).mo20708b(this.broadcastReceiver, intentFilter);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.edge_edge_listing_spacing);
        this.recyclerView.addItemDecoration(new C10744d(dimensionPixelSize, dimensionPixelSize, true));
        C8951c qualtricsWrapper2 = getQualtricsWrapper();
        String locale = getCurrentLocale().mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        qualtricsWrapper2.mo30561a(C17782b.m29865e0(new C8952d.C8961i(locale, 0), C8952d.C8954b.f19752c));
        getQualtricsWrapper().mo30562b(new FavoritesTabFragment$onCreateView$1(this));
        return onCreateView;
    }

    public void onDestroy() {
        C8115a.m16322a(requireActivity()).mo20710d(this.broadcastReceiver);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.compositeDisposable.mo19405d();
        super.onDestroyView();
        setLoading(false);
    }

    public void onLoadContent() {
        if (this.tabData == null) {
            getLogCat().mo21310e("Page ID has not been set for this tab yet.");
            return;
        }
        this.needsRefresh = false;
        super.onLoadContent();
    }

    public void onLoadSuccess(C13554f.C13556b bVar) {
        C19383o.m32797g(bVar, "result");
        this.page = bVar.f29640a;
        if (!isSearchEnabled() || !noResults(bVar) || !this.pagination.mo46059b()) {
            super.onLoadSuccess(bVar);
            return;
        }
        Page page2 = bVar.f29640a;
        C8071s<Page> mapResultWithSearch = mapResultWithSearch(page2 != null ? page2.getListSections() : null);
        getRxSchedulers().getClass();
        SingleSubscribeOn i = mapResultWithSearch.mo20660i(C13461f.m21234a());
        getRxSchedulers().getClass();
        SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new FavoritesTabFragment$onLoadSuccess$1(this), new FavoritesTabFragment$onLoadSuccess$2(this, bVar));
    }

    public void onRefresh() {
        this.adapter.clear();
        super.onRefresh();
    }

    public void onResume() {
        super.onResume();
        if (this.timeToFirstContent == null) {
            this.timeToFirstContent = getFavoritesPerformanceTracker().mo21328a(TimedMetric.TIME_TO_FIRST_CONTENT);
        }
        if (this.needsRefresh) {
            this.needsRefresh = false;
            onRefresh();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        HomeTab homeTab = this.tabData;
        if (homeTab != null) {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            bundle.putInt("transaction-data", TransactionDataRepository.C11867a.m19552a().mo38343b(homeTab));
        }
    }

    public void onSearch(String str) {
        updateQuery(str);
        this.adapter.clear();
        resetAndLoadContent();
    }

    public void onSearchCleared() {
        onSearch((String) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C11914o.m19629a(this.recyclerView.getViewTreeObserver(), new FavoritesTabFragment$onViewCreated$1(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.getDeepLinkPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void removeItemAtPosition(int r5) {
        /*
            r4 = this;
            super.removeItemAtPosition(r5)
            com.etsy.android.lib.models.homescreen.HomeTab r0 = r4.tabData
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = r0.getDeepLinkPath()
            if (r0 == 0) goto L_0x0015
            java.lang.String r2 = "saved-searches"
            boolean r0 = kotlin.text.C19459m.m33036e1(r0, r2, r1)
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r5 != 0) goto L_0x0023
            com.etsy.android.uikit.adapter.a<T> r5 = r4.adapter
            java.lang.Object r5 = r5.getItem(r1)
            boolean r5 = r5 instanceof com.etsy.android.lib.models.StyledBannerModel
            if (r5 != 0) goto L_0x0023
            r1 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x0047
            if (r1 == 0) goto L_0x0047
            android.content.res.Resources r5 = r4.getResources()
            r0 = 2131165386(0x7f0700ca, float:1.7944988E38)
            int r5 = r5.getDimensionPixelSize(r0)
            r4.verticalPadding = r5
            androidx.recyclerview.widget.RecyclerView r0 = r4.recyclerView
            if (r0 == 0) goto L_0x0047
            int r1 = r0.getPaddingLeft()
            int r2 = r0.getPaddingRight()
            int r3 = r0.getPaddingBottom()
            r0.setPadding(r1, r5, r2, r3)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.FavoritesTabFragment.removeItemAtPosition(int):void");
    }

    public void scrollToTop() {
        this.recyclerView.smoothScrollToPosition(0);
    }

    public final void setAnalyticsTracker(C8672b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.analyticsTracker = bVar;
    }

    public final void setClusterRepository(C13150b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.clusterRepository = bVar;
    }

    public final void setClustersEligibility(C13149a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.clustersEligibility = aVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setEligibility(C9863o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.eligibility = oVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setFavoritesPerformanceTracker(C8709f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.favoritesPerformanceTracker = fVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setQualtricsWrapper(C8951c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.qualtricsWrapper = cVar;
    }

    public final void setRecommendationsOnFavoritesEligibility(C9875e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.recommendationsOnFavoritesEligibility = eVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setTimeToFirstContent(C8707d dVar) {
        this.timeToFirstContent = dVar;
    }

    public void showListView() {
        if (shouldShowClusters()) {
            if (this.tabIsFavorites) {
                String str = this.query;
                if (str == null || str.length() == 0) {
                    addSearchWithClusters();
                }
            }
            if (!this.tabIsFavorites) {
                removeSearchWithClusters();
            }
        } else {
            removeSearchWithClusters();
        }
        super.showListView();
    }

    public boolean useConsistentRecyclerViewPadding() {
        return true;
    }
}
