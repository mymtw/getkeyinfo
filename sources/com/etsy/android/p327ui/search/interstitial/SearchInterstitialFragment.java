package com.etsy.android.p327ui.search.interstitial;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CreateGiftCardKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.search.container.SearchContainerFragment;
import com.etsy.android.p327ui.search.container.SearchNavigationViewModel;
import com.etsy.android.p327ui.search.interstitial.C10877c;
import com.etsy.android.p327ui.search.p330v2.C10974e;
import com.etsy.android.p327ui.search.p330v2.suggestions.SearchSuggestionsLayout;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.search.savedsearch.C8984h;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8061n;
import p346fa.C12703a;
import p356ge.C12790b;
import p363he.C12821d;
import p430qe.C13311c;
import p440s9.C13366a;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.search.interstitial.SearchInterstitialFragment */
public final class SearchInterstitialFragment extends TrackingBaseFragment implements C13366a, C10974e {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a compositeDisposable = new C7091a();
    private boolean firstLoad = true;
    public C12703a grafana;
    public C8694h logCat;
    private SearchNavigationViewModel navigationViewModel;
    private String query;
    public C8984h savedSearchViewDelegate;
    public C13461f schedulers;
    private boolean showRecent = true;
    private SearchSuggestionsLayout view;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(SearchInterstitialViewModel.class), new SearchInterstitialFragment$special$$inlined$viewModels$default$2(new SearchInterstitialFragment$special$$inlined$viewModels$default$1(this)), new SearchInterstitialFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    private final void deleteAllQueries() {
        SearchInterstitialViewModel viewModel = getViewModel();
        String query2 = getQuery();
        viewModel.getClass();
        C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchInterstitialViewModel$clearAllItemSearchHistory$1(viewModel, query2, (C19340c<? super SearchInterstitialViewModel$clearAllItemSearchHistory$1>) null), 3);
    }

    private final void deleteQuery(String str) {
        SearchInterstitialViewModel viewModel = getViewModel();
        String query2 = getQuery();
        viewModel.getClass();
        C19383o.m32797g(str, "queryToDelete");
        C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchInterstitialViewModel$deleteSearchHistoryQuery$1(viewModel, str, query2, (C19340c<? super SearchInterstitialViewModel$deleteSearchHistoryQuery$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final SearchInterstitialViewModel getViewModel() {
        return (SearchInterstitialViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C10877c cVar) {
        Object value;
        C10882d dVar;
        SearchSuggestionsLayout searchSuggestionsLayout;
        if (cVar instanceof C10877c.C10879b) {
            SearchSuggestionsLayout searchSuggestionsLayout2 = this.view;
            if (searchSuggestionsLayout2 != null) {
                C10877c.C10879b bVar = (C10877c.C10879b) cVar;
                searchSuggestionsLayout2.showRemainingSavedSearches(bVar.f24134a, bVar.f24135b);
            }
        } else if (cVar instanceof C10877c.C10878a) {
            processClickType(((C10877c.C10878a) cVar).f24133a);
        } else if (cVar instanceof C10877c.C10881d) {
            SearchSuggestionsLayout searchSuggestionsLayout3 = this.view;
            if (searchSuggestionsLayout3 != null) {
                C10877c.C10881d dVar2 = (C10877c.C10881d) cVar;
                searchSuggestionsLayout3.showSearchSuggestions(dVar2.f24137a, dVar2.f24138b);
            }
        } else if ((cVar instanceof C10877c.C10880c) && (searchSuggestionsLayout = this.view) != null) {
            searchSuggestionsLayout.showDeleteQueryError();
        }
        SearchInterstitialViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(cVar, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f24124k;
        do {
            value = stateFlowImpl.getValue();
            dVar = (C10882d) value;
            dVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, new C10882d((List<? extends C10877c>) C19327t.m32649e1(cVar, dVar.f24139a))));
    }

    /* access modifiers changed from: private */
    public final void handleState(C10882d dVar) {
        C10877c cVar = (C10877c) C19327t.m32640V0(dVar.f24139a);
        if (cVar != null) {
            handleSideEffect(cVar);
        }
    }

    private final void navigateToGiftCards() {
        C12790b.m20430b(this, new CreateGiftCardKey(C19421p.m32935c0(getActivity()), (Bundle) null, 2, (DefaultConstructorMarker) null));
    }

    private final void navigateToGiftGuide(String str) {
        C12790b.m20430b(this, new C12821d(str));
    }

    private final void navigateToListing(String str) {
        C12790b.m20430b(this, new ListingKey(C19421p.m32935c0(getActivity()), new EtsyId(str), false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }

    private final void navigateToShop(String str) {
        C15588c1.m25340p0(this.view);
        C12790b.m20430b(this, new ShopHomeKey(C12790b.m20432d(this), (EtsyId) null, (ShopHomeConfig) null, (Map) null, (String) null, str, (EtsyId) null, false, (String) null, (Bundle) null, 990, (DefaultConstructorMarker) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void processClickType(p430qe.C13311c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p430qe.C13311c.C13325n
            if (r0 == 0) goto L_0x000f
            qe.c$n r8 = (p430qe.C13311c.C13325n) r8
            com.etsy.android.ui.search.v2.suggestions.w$n r8 = r8.f29233a
            java.lang.String r8 = r8.f24569a
            r7.navigateToShop(r8)
            goto L_0x0175
        L_0x000f:
            boolean r0 = r8 instanceof p430qe.C13311c.C13322k
            java.lang.String r1 = "navigationViewModel"
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.etsy.android.ui.search.container.SearchNavigationViewModel r8 = r7.navigationViewModel
            if (r8 == 0) goto L_0x0023
            io.reactivex.subjects.PublishSubject<qe.b> r8 = r8.f23672b
            qe.b$e r0 = p430qe.C13301b.C13306e.f29209a
            r8.onNext(r0)
            goto L_0x0175
        L_0x0023:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x0027:
            boolean r0 = r8 instanceof p430qe.C13311c.C13320i
            if (r0 == 0) goto L_0x0034
            qe.c$i r8 = (p430qe.C13311c.C13320i) r8
            java.lang.String r8 = r8.f29225a
            r7.navigateToGiftGuide(r8)
            goto L_0x0175
        L_0x0034:
            qe.c$h r0 = p430qe.C13311c.C13319h.f29224a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r8, r0)
            if (r0 == 0) goto L_0x0041
            r7.navigateToGiftCards()
            goto L_0x0175
        L_0x0041:
            boolean r0 = r8 instanceof p430qe.C13311c.C13313b
            if (r0 == 0) goto L_0x0062
            com.etsy.android.ui.search.container.SearchNavigationViewModel r0 = r7.navigationViewModel
            if (r0 == 0) goto L_0x005e
            qe.c$b r8 = (p430qe.C13311c.C13313b) r8
            java.lang.String r1 = "click"
            kotlin.jvm.internal.C19383o.m32797g(r8, r1)
            io.reactivex.subjects.PublishSubject<qe.b> r0 = r0.f23672b
            qe.b$c r1 = new qe.b$c
            com.etsy.android.lib.models.TaxonomyNode r8 = r8.f29218a
            r1.<init>(r8)
            r0.onNext(r1)
            goto L_0x0175
        L_0x005e:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x0062:
            qe.c$a r0 = p430qe.C13311c.C13312a.f29217a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r8, r0)
            if (r0 == 0) goto L_0x007b
            com.etsy.android.ui.search.container.SearchNavigationViewModel r8 = r7.navigationViewModel
            if (r8 == 0) goto L_0x0077
            io.reactivex.subjects.PublishSubject<qe.b> r8 = r8.f23672b
            qe.b$b r0 = p430qe.C13301b.C13303b.f29206a
            r8.onNext(r0)
            goto L_0x0175
        L_0x0077:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x007b:
            boolean r0 = r8 instanceof p430qe.C13311c.C13315d
            if (r0 == 0) goto L_0x0088
            qe.c$d r8 = (p430qe.C13311c.C13315d) r8
            java.lang.String r8 = r8.f29220a
            r7.deleteQuery(r8)
            goto L_0x0175
        L_0x0088:
            qe.c$c r0 = p430qe.C13311c.C13314c.f29219a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r8, r0)
            if (r0 == 0) goto L_0x0095
            r7.deleteAllQueries()
            goto L_0x0175
        L_0x0095:
            boolean r0 = r8 instanceof p430qe.C13311c.C13323l
            java.lang.String r3 = "query"
            if (r0 == 0) goto L_0x00b6
            com.etsy.android.ui.search.container.SearchNavigationViewModel r0 = r7.navigationViewModel
            if (r0 == 0) goto L_0x00b2
            qe.c$l r8 = (p430qe.C13311c.C13323l) r8
            java.lang.String r8 = r8.f29228a
            kotlin.jvm.internal.C19383o.m32797g(r8, r3)
            io.reactivex.subjects.PublishSubject<qe.b> r0 = r0.f23672b
            qe.b$g r1 = new qe.b$g
            r1.<init>(r8)
            r0.onNext(r1)
            goto L_0x0175
        L_0x00b2:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x00b6:
            boolean r0 = r8 instanceof p430qe.C13311c.C13324m
            if (r0 == 0) goto L_0x0127
            com.etsy.android.ui.search.container.SearchNavigationViewModel r0 = r7.navigationViewModel
            if (r0 == 0) goto L_0x0123
            qe.c$m r8 = (p430qe.C13311c.C13324m) r8
            java.lang.String r1 = r8.f29229a
            com.etsy.android.ui.search.v2.SearchOptions r4 = r8.f29230b
            java.lang.Long r5 = r8.f29231c
            boolean r6 = r8.f29232d
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            io.reactivex.subjects.PublishSubject<qe.b> r0 = r0.f23672b
            qe.b$i r3 = new qe.b$i
            r3.<init>(r1, r4, r5, r6)
            r0.onNext(r3)
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r0 = r7.getViewModel()
            java.lang.Long r8 = r8.f29231c
            r0.getClass()
            if (r8 == 0) goto L_0x0175
            long r3 = r8.longValue()
            com.etsy.android.ui.search.SearchSuggestionsRepository r8 = r0.f24115b
            com.etsy.android.ui.search.SearchSuggestionsRepository$a$b r8 = r8.f23663c
            if (r8 == 0) goto L_0x0175
            r0 = 0
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions r8 = r8.f23665a
            if (r8 == 0) goto L_0x011c
            java.util.List r8 = r8.getSavedSearches()
            if (r8 == 0) goto L_0x011c
            java.util.Iterator r8 = r8.iterator()
        L_0x00f9:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0114
            java.lang.Object r1 = r8.next()
            r2 = r1
            com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$SavableSearchQuery r2 = (com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.SavableSearchQuery) r2
            long r5 = r2.getSavedSearchId()
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0110
            r1 = 1
            goto L_0x0111
        L_0x0110:
            r1 = r0
        L_0x0111:
            if (r1 == 0) goto L_0x00f9
            goto L_0x011c
        L_0x0114:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)
            throw r8
        L_0x011c:
            if (r2 != 0) goto L_0x011f
            goto L_0x0175
        L_0x011f:
            r2.setNewResultsCount(r0)
            goto L_0x0175
        L_0x0123:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x0127:
            boolean r0 = r8 instanceof p430qe.C13311c.C13321j
            if (r0 == 0) goto L_0x0133
            qe.c$j r8 = (p430qe.C13311c.C13321j) r8
            java.lang.String r8 = r8.f29226a
            r7.navigateToListing(r8)
            goto L_0x0175
        L_0x0133:
            boolean r0 = r8 instanceof p430qe.C13311c.C13317f
            if (r0 == 0) goto L_0x0150
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r0 = r7.getViewModel()
            qe.c$f r8 = (p430qe.C13311c.C13317f) r8
            int r8 = r8.f29222a
            r0.getClass()
            kotlinx.coroutines.d0 r1 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$fetchRemainingSavedSearches$1 r3 = new com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel$fetchRemainingSavedSearches$1
            r3.<init>(r0, r8, r2)
            r8 = 3
            kotlinx.coroutines.C19697g.m33468f(r1, r2, r2, r3, r8)
            goto L_0x0175
        L_0x0150:
            boolean r0 = r8 instanceof p430qe.C13311c.C13316e
            if (r0 == 0) goto L_0x0166
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0175
            com.etsy.android.search.savedsearch.h r1 = r7.getSavedSearchViewDelegate()
            qe.c$e r8 = (p430qe.C13311c.C13316e) r8
            long r2 = r8.f29221a
            r1.mo30633a(r2, r0)
            goto L_0x0175
        L_0x0166:
            boolean r8 = r8 instanceof p430qe.C13311c.C13318g
            if (r8 == 0) goto L_0x0175
            com.etsy.android.ui.search.interstitial.SearchInterstitialViewModel r8 = r7.getViewModel()
            java.lang.String r0 = r7.getQuery()
            r8.mo36097c(r0)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.interstitial.SearchInterstitialFragment.processClickType(qe.c):void");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view2 = map.get(Integer.valueOf(i));
        if (view2 != null) {
            return view2;
        }
        View view3 = getView();
        if (view3 == null || (findViewById = view3.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getQuery() {
        return this.query;
    }

    public final C8984h getSavedSearchViewDelegate() {
        C8984h hVar = this.savedSearchViewDelegate;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("savedSearchViewDelegate");
        throw null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public final C8656o getViewModelFactory() {
        C8656o oVar = this.viewModelFactory;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewModelFactory");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.navigationViewModel = (SearchNavigationViewModel) new C2870k0(parentFragment).mo10829a(SearchNavigationViewModel.class);
            if (bundle == null) {
                Bundle arguments = getArguments();
                setQuery(arguments != null ? arguments.getString("auto_suggest_query") : null);
                Bundle arguments2 = getArguments();
                this.showRecent = arguments2 != null ? arguments2.getBoolean("show_recently_viewed") : false;
                return;
            }
            return;
        }
        throw new Exception("Invalid Parent Fragment");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        SearchSuggestionsLayout searchSuggestionsLayout = new SearchSuggestionsLayout(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        searchSuggestionsLayout.setAnalyticsContext(getAnalyticsContext());
        searchSuggestionsLayout.onQueryTextChange(getQuery());
        C19662p1 p1Var = getViewModel().f24125l;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new SearchInterstitialFragment$onCreateView$1(this, (C19340c<? super SearchInterstitialFragment$onCreateView$1>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
        C8061n<C13311c> clickEvents = searchSuggestionsLayout.clickEvents();
        getSchedulers().getClass();
        ObservableSubscribeOn i = clickEvents.mo20639i(C13461f.m21235b());
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), SearchInterstitialFragment$onCreateView$2.INSTANCE, new SearchInterstitialFragment$onCreateView$3(this), 2);
        C7091a aVar = this.compositeDisposable;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
        this.view = searchSuggestionsLayout;
        return searchSuggestionsLayout;
    }

    public void onDestroy() {
        this.compositeDisposable.mo19405d();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.view = null;
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        if ((getParentFragment() instanceof SearchContainerFragment) && !this.firstLoad) {
            Fragment parentFragment = getParentFragment();
            C19383o.m32795e(parentFragment, "null cannot be cast to non-null type com.etsy.android.ui.search.container.SearchContainerFragment");
            ((SearchContainerFragment) parentFragment).setUpAppBar();
        }
        if (this.firstLoad) {
            this.firstLoad = false;
        }
    }

    public void onViewCreated(View view2, Bundle bundle) {
        C19383o.m32797g(view2, "view");
        super.onViewCreated(view2, bundle);
        SearchInterstitialViewModel viewModel = getViewModel();
        boolean z = this.showRecent;
        String string = viewModel.f24117d.f19792d.getString("AutoSuggest", "off");
        C19697g.m33468f(C19388s.m32866i0(viewModel), (CoroutineContext) null, (CoroutineStart) null, new SearchInterstitialViewModel$setupCompositeAutoComplete$1(viewModel, viewModel.f24122i.f24132a.mo21135e(C8592b.f18752P0), z, string == null ? "off" : string, viewModel.f24122i.f24132a.mo21134d(C8592b.f18742K0), (C19340c<? super SearchInterstitialViewModel$setupCompositeAutoComplete$1>) null), 3);
        SearchInterstitialViewModel viewModel2 = getViewModel();
        String query2 = getQuery();
        if (query2 == null) {
            query2 = "";
        }
        viewModel2.mo36097c(query2);
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public final void setSavedSearchViewDelegate(C8984h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.savedSearchViewDelegate = hVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public final void updateAutoSuggestQuery(String str, boolean z) {
        setQuery(str);
        this.showRecent = z;
        SearchSuggestionsLayout searchSuggestionsLayout = this.view;
        if (searchSuggestionsLayout != null) {
            searchSuggestionsLayout.onQueryTextChange(str);
        }
        getViewModel().mo36097c(getQuery());
    }
}
