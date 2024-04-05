package com.etsy.android.p327ui.home.landingpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2895z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.core.HttpMethod;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.homescreen.LandingPageInfo;
import com.etsy.android.lib.models.homescreen.LandingPageInfoKt;
import com.etsy.android.lib.models.homescreen.LandingPageLink;
import com.etsy.android.lib.push.registration.C8834g;
import com.etsy.android.p072ad.impressions.AdImpressionScrollListener;
import com.etsy.android.p327ui.cardview.CardRecyclerViewBaseFragment;
import com.etsy.android.p327ui.conversation.details.ccm.C9499h;
import com.etsy.android.p327ui.home.landingpage.C10027f;
import com.etsy.android.p327ui.home.landingpage.LandingPageViewModel;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.HomePagerKey;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10744d;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.view.EmptyMessageView;
import com.etsy.android.uikit.view.SignInView;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import okhttp3.C19928a0;
import p030bo.app.C3673f7;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p357gf.C12796e;
import p370ie.C12948h;
import p402n9.C13087g;
import p409o9.C13127g;
import p415of.C13173c;
import p425q9.C13265p;
import p439rf.C13364c;
import p445sf.C13379a;
import p445sf.C13380b;
import p445sf.C13381c;
import p456ua.C13458c;
import p456ua.C13459d;
import p456ua.C13461f;
import p464va.C13546a;
import p464va.C13554f;
import p472wb.C13799a;
import p472wb.C13801b;
import p472wb.C13805c;
import p472wb.C13806d;
import p478x9.C13851a;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.landingpage.LandingPageFragment */
public class LandingPageFragment extends CardRecyclerViewBaseFragment {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private AdImpressionScrollListener adImpressionScrollListener;
    public C11780h favoriteRepository;
    private ListingCardViewHolderOptions listingCardOptions;
    public C12796e listingImagesRepository;
    public C8704a performanceTrackerAdapter;
    private final C7091a requestDisposables = new C7091a();
    public C13461f rxSchedulers;
    public C13265p session;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(LandingPageViewModel.class), new LandingPageFragment$special$$inlined$viewModels$default$2(new LandingPageFragment$special$$inlined$viewModels$default$1(this)), new LandingPageFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    private final boolean doPromptSignIn() {
        return !getSession().mo45960e() && !isSimilarItemsOnEtsy() && !isVisuallySimilarListings() && !isEtsyLens();
    }

    /* access modifiers changed from: private */
    public final LandingPageViewModel getViewModel() {
        return (LandingPageViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C10027f fVar) {
        if (fVar instanceof C10027f.C10030c) {
            onLoadContentSuccess((C10027f.C10030c) fVar);
        } else if (fVar instanceof C10027f.C10028a) {
            onLoadContentError();
        } else if (fVar instanceof C10027f.C10029b) {
            onLoadFailure();
        } else if (fVar instanceof C10027f.C10031d) {
            onEmptyResults();
        } else if (fVar instanceof C10027f.C10032e) {
            getPerformanceTrackerAdapter().mo21370b();
        } else if (fVar instanceof C10027f.C10033f) {
            C10027f.C10033f fVar2 = (C10027f.C10033f) fVar;
            getViewModel().mo33264f(fVar2.f22083a, getAdapter().getItemCount(), fVar2.f22084b);
        }
        LandingPageViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(fVar, "event");
        C2895z<C10035h> zVar = viewModel.f22050h;
        C10035h value = zVar.getValue();
        C19383o.m32794d(value);
        zVar.setValue(new C10035h(C19327t.m32649e1(fVar, value.f22091a)));
    }

    private final void handleState(C10035h hVar) {
        C10027f fVar = (C10027f) C19327t.m32640V0(hVar.f22091a);
        if (fVar != null) {
            handleSideEffect(fVar);
        }
    }

    private final boolean isEtsyLens() {
        LandingPageInfo landingPageInfo = getViewModel().f22052j;
        return C19383o.m32792b("etsy_lens", landingPageInfo != null ? landingPageInfo.getPageType() : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getApiPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isSimilarItemsOnEtsy() {
        /*
            r4 = this;
            com.etsy.android.ui.home.landingpage.LandingPageViewModel r0 = r4.getViewModel()
            com.etsy.android.lib.models.homescreen.LandingPageInfo r0 = r0.f22052j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.getApiPath()
            if (r0 == 0) goto L_0x0019
            java.lang.String r3 = "spec=SimilarListingsListingScreen"
            boolean r0 = kotlin.text.C19459m.m33036e1(r0, r3, r2)
            if (r0 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.landingpage.LandingPageFragment.isSimilarItemsOnEtsy():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.getApiPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isVisuallySimilarListings() {
        /*
            r4 = this;
            com.etsy.android.ui.home.landingpage.LandingPageViewModel r0 = r4.getViewModel()
            com.etsy.android.lib.models.homescreen.LandingPageInfo r0 = r0.f22052j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.getApiPath()
            if (r0 == 0) goto L_0x0019
            java.lang.String r3 = "spec=VisuallySimilarListings"
            boolean r0 = kotlin.text.C19459m.m33036e1(r0, r3, r2)
            if (r0 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.landingpage.LandingPageFragment.isVisuallySimilarListings():boolean");
    }

    /* access modifiers changed from: private */
    public final void navigateHome() {
        C12788a.m20424c(getActivity(), new HomePagerKey(C19421p.m32935c0(getActivity()), (Bundle) null, true, 2, (DefaultConstructorMarker) null));
    }

    private final void onEmptyResults() {
        stopEndless();
        setLoading(false);
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null && swipeRefreshLayout.isRefreshing()) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
        if (!this.adapter.getItems().isEmpty()) {
            return;
        }
        if (getSession().mo45960e()) {
            showEmptyResults();
        } else {
            showSignInView();
        }
    }

    private final void onLoadContentError() {
        getPerformanceTrackerAdapter().mo21370b();
        onLoadFailure();
        getPerformanceTrackerAdapter().f19123e = true;
    }

    private final void onLoadContentSuccess(C10027f.C10030c cVar) {
        onLoadComplete(cVar.f22080a);
        getPerformanceTrackerAdapter().f19123e = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m34995onViewCreated$lambda1(LandingPageFragment landingPageFragment, C10035h hVar) {
        C19383o.m32797g(landingPageFragment, "this$0");
        C19383o.m32796f(hVar, "state");
        landingPageFragment.handleState(hVar);
    }

    /* access modifiers changed from: private */
    public final void promptSignIn() {
        C12788a.m20424c(getActivity(), new C12948h(C19421p.m32935c0(getActivity()), (EtsyAction) null, (Bundle) null, (String) null, (String) null, (String) null, 62));
    }

    private final void setUpWithPageLink(LandingPageInfo landingPageInfo) {
        if (landingPageInfo != null) {
            if (C19383o.m32792b(landingPageInfo.getEventName(), "similar_listings")) {
                landingPageInfo.getParams().put("target_recs_to_generate", "200");
            }
            if (landingPageInfo.getPageTitle().length() > 0) {
                requireActivity().setTitle(landingPageInfo.getPageTitle());
            } else if (landingPageInfo instanceof LandingPageLink) {
                requireActivity().setTitle(((LandingPageLink) landingPageInfo).getTitle());
            }
            landingPageInfo.getParams().put("include_additional_listing_images", "true");
            int layout = landingPageInfo.getLayout();
            if (layout == 0) {
                setLayoutManager(StaggeredGridLayoutManager.class);
            } else if (layout == 1) {
                setLayoutManager(LinearLayoutManager.class);
            } else if (layout == 2) {
                setLayoutManager(GridLayoutManager.class);
                RecyclerView recyclerView = this.recyclerView;
                AdImpressionScrollListener adImpressionScrollListener2 = this.adImpressionScrollListener;
                if (adImpressionScrollListener2 != null) {
                    recyclerView.addOnScrollListener(adImpressionScrollListener2);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.clg_space_8);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.edge_edge_listing_spacing);
                    C10744d dVar = new C10744d(dimensionPixelSize2, dimensionPixelSize2, true);
                    this.recyclerView.setPadding(0, 0, 0, dimensionPixelSize);
                    this.recyclerView.addItemDecoration(dVar);
                    return;
                }
                C19383o.m32805o("adImpressionScrollListener");
                throw null;
            }
        }
    }

    private final void showEmptyResults() {
        View view = this.emptyView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.uikit.view.EmptyMessageView");
        EmptyMessageView emptyMessageView = (EmptyMessageView) view;
        emptyMessageView.setImage(R.drawable.empty_generic);
        emptyMessageView.setTitle((int) R.string.no_items_found);
        emptyMessageView.setSubtitle((int) R.string.new_search_empty_view_title_for_no_query);
        emptyMessageView.setButtonText((int) R.string.feed_empty_landing_page_subtext);
        emptyMessageView.setButtonContentDescription(emptyMessageView.getResources().getString(R.string.feed_empty_landing_page_subtext));
        emptyMessageView.setButtonClickListener(new LandingPageFragment$showEmptyResults$1$1(this));
        super.showEmptyView();
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

    public boolean canLoadContent() {
        return getViewModel().f22052j != null && super.canLoadContent();
    }

    public String getApiUrl() {
        LandingPageInfo landingPageInfo = getViewModel().f22052j;
        C19383o.m32794d(landingPageInfo);
        String apiPath = landingPageInfo.getApiPath();
        C19383o.m32794d(apiPath);
        return apiPath;
    }

    public C13801b getCardViewHolderFactory() {
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        this.listingCardOptions = new ListingCardViewHolderOptions.C11972f(configMap);
        C13173c adapter = getAdapter();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C8703p analyticsContext = getAnalyticsContext();
        C8703p pVar = analyticsContext;
        ListingCardViewHolderOptions listingCardViewHolderOptions = this.listingCardOptions;
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C8703p pVar2 = analyticsContext;
        C12796e listingImagesRepository2 = getListingImagesRepository();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(pVar2, "analyticsContext");
        return new C13801b(new C13799a(this, adapter, pVar, favoriteRepository2, rxSchedulers2, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, listingCardViewHolderOptions, (C10715a) null, listingImagesRepository2, (C8630b) null, (WeakReference) null, 53248));
    }

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
        throw null;
    }

    public final C12796e getListingImagesRepository() {
        C12796e eVar = this.listingImagesRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("listingImagesRepository");
        throw null;
    }

    public C13379a getPagination() {
        return getViewModel().mo33263e();
    }

    public C8709f getPerformanceTracker() {
        return getPerformanceTrackerAdapter().f19119a;
    }

    public final C8704a getPerformanceTrackerAdapter() {
        C8704a aVar = this.performanceTrackerAdapter;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("performanceTrackerAdapter");
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

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public String getTrackingName() {
        String eventName;
        LandingPageInfo landingPageInfo = getViewModel().f22052j;
        if (landingPageInfo != null && (eventName = landingPageInfo.getEventName()) != null) {
            return eventName;
        }
        String trackingName = super.getTrackingName();
        C19383o.m32796f(trackingName, "super.getTrackingName()");
        return trackingName;
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
        LandingPageViewModel viewModel = getViewModel();
        Object obj = requireArguments().get(ResponseConstants.PAGE_LINK);
        LandingPageInfo.TypedPageType typedPageType = null;
        LandingPageInfo landingPageInfo = obj instanceof LandingPageInfo ? (LandingPageInfo) obj : null;
        boolean z = false;
        if (!C19383o.m32792b(viewModel.f22052j, landingPageInfo)) {
            viewModel.f22052j = landingPageInfo;
            if (landingPageInfo != null) {
                typedPageType = LandingPageInfoKt.toTypedPageType(landingPageInfo);
            }
            viewModel.f22053k = ((landingPageInfo != null && landingPageInfo.isPaginateForNext()) || typedPageType == LandingPageInfo.TypedPageType.SHOP) ? new C13380b() : new C13381c();
        }
        super.onCreate(bundle);
        C8704a performanceTrackerAdapter2 = getPerformanceTrackerAdapter();
        if (bundle == null) {
            z = true;
        }
        performanceTrackerAdapter2.mo21372d(z);
        C13173c adapter = getAdapter();
        C19383o.m32796f(adapter, "getAdapter()");
        this.adImpressionScrollListener = new AdImpressionScrollListener(adapter, new LandingPageFragment$onCreate$1(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        setUpWithPageLink(getViewModel().f22052j);
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        recyclerView.addOnScrollListener(new C13805c(new C13364c(), new C13806d(analyticsContext)));
        if (doPromptSignIn()) {
            promptSignIn();
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.requestDisposables.mo19405d();
        super.onDestroyView();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            FragmentActivity requireActivity = requireActivity();
            LandingPageInfo landingPageInfo = getViewModel().f22052j;
            requireActivity.setTitle(landingPageInfo != null ? landingPageInfo.getPageTitle() : null);
        }
    }

    public void onLoadContent() {
        LandingPageViewModel viewModel = getViewModel();
        C8704a performanceTrackerAdapter2 = getPerformanceTrackerAdapter();
        viewModel.getClass();
        C19383o.m32797g(performanceTrackerAdapter2, "performanceTrackerAdapter");
        LandingPageInfo landingPageInfo = viewModel.f22052j;
        LandingPageInfo.TypedPageType typedPageType = landingPageInfo != null ? LandingPageInfoKt.toTypedPageType(landingPageInfo) : null;
        int i = typedPageType == null ? -1 : LandingPageViewModel.C10012a.f22054a[typedPageType.ordinal()];
        if (i == -1) {
            viewModel.f22047e.mo45474a("cbf.home.landing_page.error.null_page_type");
            LandingPageViewModel.m18183b(viewModel.f22050h, C10027f.C10029b.f22079a);
        } else if (i == 1) {
            performanceTrackerAdapter2.mo21369a();
            LandingPageInfo landingPageInfo2 = viewModel.f22052j;
            if (landingPageInfo2 != null) {
                String d = viewModel.mo33262d(landingPageInfo2);
                Map<String, String> a = viewModel.mo33263e().mo46058a();
                if (a == null) {
                    a = C19294b0.m32559p0();
                }
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f22045c, C0326j.m860e(viewModel.f22045c, viewModel.f22049g.mo46214a(new C13546a(d, a, HttpMethod.GET)))), new LandingPageViewModel$loadPage$1(viewModel), new LandingPageViewModel$loadPage$2(viewModel));
                C7091a aVar = viewModel.f22046d;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            }
        } else if (i == 2) {
            performanceTrackerAdapter2.mo21369a();
            LandingPageInfo landingPageInfo3 = viewModel.f22052j;
            if (landingPageInfo3 != null) {
                C10021c cVar = viewModel.f22044b;
                C10034g c = viewModel.mo33261c(landingPageInfo3);
                cVar.getClass();
                C8071s<C20145v<C19928a0>> a2 = cVar.mo33285a(c);
                C8834g gVar = new C8834g(cVar, 5);
                a2.getClass();
                ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f22045c, C0472h.m1243e(viewModel.f22045c, new C19211l(new C19208j(a2, gVar), new C13458c(cVar, 5)))), new LandingPageViewModel$loadListings$1(viewModel), new LandingPageViewModel$loadListings$2(viewModel));
                C7091a aVar2 = viewModel.f22046d;
                C19383o.m32798h(aVar2, "compositeDisposable");
                aVar2.mo19403b(e2);
            }
        } else if (i == 3) {
            performanceTrackerAdapter2.mo21369a();
            LandingPageInfo landingPageInfo4 = viewModel.f22052j;
            if (landingPageInfo4 != null) {
                C10021c cVar2 = viewModel.f22044b;
                C10034g c2 = viewModel.mo33261c(landingPageInfo4);
                cVar2.getClass();
                C8071s<C20145v<C19928a0>> a3 = cVar2.mo33285a(c2);
                C13459d dVar = new C13459d(cVar2, 4);
                a3.getClass();
                ConsumerSingleObserver e3 = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f22045c, C0472h.m1243e(viewModel.f22045c, new C19211l(new C19208j(a3, dVar), new C3673f7(cVar2, 2)))), new LandingPageViewModel$loadEtsyLensResults$1(viewModel), new LandingPageViewModel$loadEtsyLensResults$2(viewModel));
                C7091a aVar3 = viewModel.f22046d;
                C19383o.m32798h(aVar3, "compositeDisposable");
                aVar3.mo19403b(e3);
            }
        } else if (i != 4) {
            viewModel.f22047e.mo45474a("cbf.home.landing_page.error.unexpected_page_type");
        } else {
            performanceTrackerAdapter2.mo21369a();
            LandingPageInfo landingPageInfo5 = viewModel.f22052j;
            if (landingPageInfo5 != null) {
                C10034g c3 = viewModel.mo33261c(landingPageInfo5);
                C10021c cVar3 = viewModel.f22044b;
                cVar3.getClass();
                C8071s<C20145v<C19928a0>> a4 = cVar3.mo33285a(c3);
                C13087g gVar2 = new C13087g(cVar3, 3);
                a4.getClass();
                ConsumerSingleObserver e4 = SubscribersKt.m32500e(C0391c.m1056b(viewModel.f22045c, C0472h.m1243e(viewModel.f22045c, new C19211l(new C19208j(a4, gVar2), new C13127g(cVar3, 4)))), new LandingPageViewModel$loadShops$1(viewModel), new LandingPageViewModel$loadShops$2(viewModel));
                C7091a aVar4 = viewModel.f22046d;
                C19383o.m32798h(aVar4, "compositeDisposable");
                aVar4.mo19403b(e4);
            }
        }
    }

    public void onLoadSuccess(C13554f.C13556b bVar) {
        C19383o.m32797g(bVar, "result");
        if (bVar.f29640a == null) {
            stopEndless();
            setLoading(false);
            SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
            if (swipeRefreshLayout != null && swipeRefreshLayout.isRefreshing()) {
                this.swipeRefreshLayout.setRefreshing(false);
            }
            getViewModel().mo33263e().f29307c = true;
            if (!this.adapter.getItems().isEmpty()) {
                return;
            }
            if (getSession().mo45960e()) {
                showEmptyResults();
            } else {
                showSignInView();
            }
        } else {
            super.onLoadSuccess(bVar);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        LandingPageFragment$onViewCreated$performanceTracker$1 landingPageFragment$onViewCreated$performanceTracker$1 = new LandingPageFragment$onViewCreated$performanceTracker$1(this);
        this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(landingPageFragment$onViewCreated$performanceTracker$1);
        this.recyclerView.addOnAttachStateChangeListener(new LandingPageFragment$onViewCreated$1(landingPageFragment$onViewCreated$performanceTracker$1));
        getLifecycle().mo10733a(getViewModel());
        getViewModel().f22051i.observe(getViewLifecycleOwner(), new C9499h(this, 1));
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setListingImagesRepository(C12796e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.listingImagesRepository = eVar;
    }

    public final void setPerformanceTrackerAdapter(C8704a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.performanceTrackerAdapter = aVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public void showErrorView() {
        this.emptyMessageView.setButtonContentDescription(getResources().getString(R.string.please_try_again));
        EmptyMessageView emptyMessageView = this.emptyMessageView;
        C19383o.m32796f(emptyMessageView, "emptyMessageView");
        ViewExtensions.m12866j(emptyMessageView, new LandingPageFragment$showErrorView$1(this));
        super.showErrorView();
    }

    public void showSignInView() {
        SignInView signInView = this.signinView;
        signInView.setTitle((int) R.string.landing_signin_heading);
        signInView.setSubtitle((int) R.string.landing_signin_body);
        signInView.setImage(R.drawable.clg_icon_brand_search_v2);
        signInView.setButtonText((int) R.string.tab_signin_button);
        ViewExtensions.m12866j(signInView, new LandingPageFragment$showSignInView$1$1(this));
        super.showSignInView();
    }
}
