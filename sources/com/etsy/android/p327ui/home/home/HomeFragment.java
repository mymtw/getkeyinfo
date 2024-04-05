package com.etsy.android.p327ui.home.home;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0120c;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.TimedMetric;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.p072ad.impressions.AdImpressionScrollListener;
import com.etsy.android.p327ui.cardview.CardRecyclerViewBaseFragment;
import com.etsy.android.p327ui.home.home.C10002i;
import com.etsy.android.p327ui.home.home.C9998g;
import com.etsy.android.p327ui.home.tabs.HomePagerFragment;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.sdl.C10723f;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.user.auth.C11487l;
import com.etsy.android.p327ui.user.review.C11714m;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.view.EmptyMessageView;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.PositionList;
import com.google.android.play.core.assetpacks.C15588c1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19669s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p277w8.C8267e;
import p337de.C12647a;
import p337de.C12648b;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12790b;
import p357gf.C12796e;
import p370ie.C12942b;
import p370ie.C12948h;
import p415of.C13173c;
import p415of.C13185n;
import p415of.C13186o;
import p425q9.C13265p;
import p428qc.C13294e;
import p439rf.C13364c;
import p445sf.C13380b;
import p456ua.C13461f;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.home.home.HomeFragment */
public class HomeFragment extends CardRecyclerViewBaseFragment implements C11321e, C11714m {
    public static final int $stable = 8;
    public static final String API_URL = "api_url";
    public static final C9986a Companion = new C9986a();
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private AdImpressionScrollListener adImpressionScrollListener;
    public C11780h favoriteRepository;
    public C12703a grafana;
    public C13294e homeScreenEventManager;
    public C8709f homeScreenPerformanceTracker;
    private boolean isExplore;
    public C12796e listingImagesRepository;
    public C8694h logCat;
    private String pageTitle = "";
    private final C0120c<C12942b> reviewActionResult;
    public C13461f rxSchedulers;
    /* access modifiers changed from: private */
    public C13364c scrollEventDelegate;
    public C13265p session;
    private C8707d timeToFirstContent;
    public UserActionBus userActionBus;
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(HomeViewModel.class), new HomeFragment$special$$inlined$viewModels$default$2(new HomeFragment$special$$inlined$viewModels$default$1(this)), new HomeFragment$viewModel$2(this));
    public C8656o viewModelFactory;

    /* renamed from: com.etsy.android.ui.home.home.HomeFragment$a */
    public static final class C9986a {
    }

    /* renamed from: com.etsy.android.ui.home.home.HomeFragment$b */
    public static final class C9987b extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ HomeFragment f21974b;

        /* renamed from: c */
        public final /* synthetic */ C13364c.C13365a<C8698l> f21975c;

        public C9987b(HomeFragment homeFragment, C9988c cVar) {
            this.f21974b = homeFragment;
            this.f21975c = cVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C13364c access$getScrollEventDelegate$p = this.f21974b.scrollEventDelegate;
            if (access$getScrollEventDelegate$p != null) {
                access$getScrollEventDelegate$p.f29296c = i;
            }
        }

        /* JADX WARNING: type inference failed for: r9v1, types: [androidx.recyclerview.widget.RecyclerView$o] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onScrolled(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "recyclerView"
                kotlin.jvm.internal.C19383o.m32797g(r9, r0)
                super.onScrolled(r9, r10, r11)
                com.etsy.android.ui.home.home.HomeFragment r10 = r8.f21974b
                rf.c r10 = r10.scrollEventDelegate
                if (r10 == 0) goto L_0x0091
                rf.c$a<com.etsy.android.lib.logger.l> r11 = r8.f21975c
                int r0 = r10.f29296c
                if (r0 != 0) goto L_0x0018
                goto L_0x0091
            L_0x0018:
                androidx.recyclerview.widget.RecyclerView$Adapter r0 = r9.getAdapter()
                boolean r1 = r0 instanceof p415of.C13173c
                r2 = 0
                if (r1 == 0) goto L_0x0024
                of.c r0 = (p415of.C13173c) r0
                goto L_0x0025
            L_0x0024:
                r0 = r2
            L_0x0025:
                if (r0 != 0) goto L_0x0029
                goto L_0x0091
            L_0x0029:
                androidx.recyclerview.widget.RecyclerView$o r9 = r9.getLayoutManager()
                boolean r1 = r9 instanceof androidx.recyclerview.widget.GridLayoutManager
                if (r1 == 0) goto L_0x0034
                r2 = r9
                androidx.recyclerview.widget.GridLayoutManager r2 = (androidx.recyclerview.widget.GridLayoutManager) r2
            L_0x0034:
                if (r2 != 0) goto L_0x0037
                goto L_0x0091
            L_0x0037:
                int r9 = r2.mo11282S0()
                int r1 = r2.mo11284U0()
                java.util.List r2 = r0.getItems()
                java.lang.String r3 = "adapter.items"
                kotlin.jvm.internal.C19383o.m32796f(r2, r3)
                int r2 = p568fn.C17782b.m29859Y(r2)
                r3 = -1
                if (r9 == r3) goto L_0x0091
                if (r1 == r3) goto L_0x0091
                if (r2 != r3) goto L_0x0054
                goto L_0x0091
            L_0x0054:
                int r4 = r10.f29294a
                r5 = 1
                r6 = 0
                if (r4 != r3) goto L_0x005c
                r7 = r5
                goto L_0x005d
            L_0x005c:
                r7 = r6
            L_0x005d:
                if (r7 != 0) goto L_0x0069
                if (r4 > r2) goto L_0x0069
                java.lang.Object r4 = r0.getItem(r4)
                boolean r4 = r4 instanceof com.etsy.android.lib.logger.C8698l
                if (r4 != 0) goto L_0x006e
            L_0x0069:
                r10.f29294a = r3
                r10.f29295b = r6
                r9 = r6
            L_0x006e:
                int r3 = r10.f29294a
                if (r3 != r2) goto L_0x0073
                goto L_0x0091
            L_0x0073:
                if (r9 > r1) goto L_0x0091
            L_0x0075:
                java.lang.Object r3 = r0.getItem(r9)
                of.o r3 = (p415of.C13186o) r3
                boolean r4 = r3 instanceof com.etsy.android.lib.logger.C8698l
                if (r4 == 0) goto L_0x0088
                int r4 = r10.f29294a
                if (r9 <= r4) goto L_0x0088
                r11.mo33210a(r3)
                r10.f29294a = r9
            L_0x0088:
                if (r9 != r2) goto L_0x008c
                r10.f29295b = r5
            L_0x008c:
                if (r9 == r1) goto L_0x0091
                int r9 = r9 + 1
                goto L_0x0075
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.home.HomeFragment.C9987b.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    /* renamed from: com.etsy.android.ui.home.home.HomeFragment$c */
    public static final class C9988c implements C13364c.C13365a<C8698l> {

        /* renamed from: a */
        public final /* synthetic */ HomeFragment f21976a;

        public C9988c(HomeFragment homeFragment) {
            this.f21976a = homeFragment;
        }

        /* renamed from: a */
        public final void mo33210a(C13186o oVar) {
            C8703p analyticsContext;
            C8698l lVar = (C8698l) oVar;
            C19383o.m32797g(lVar, "item");
            if (C18263b.m30839d0(C19388s.m32863g0(lVar)) && (analyticsContext = this.f21976a.getAnalyticsContext()) != null) {
                StringBuilder h = C0072d.m201h("scrolled_past_");
                h.append(C19388s.m32863g0(lVar));
                analyticsContext.mo21333d(h.toString(), C19388s.m32882r0(lVar));
            }
            List<C8696j> f0 = C19388s.m32861f0(lVar);
            HomeFragment homeFragment = this.f21976a;
            for (C8696j jVar : f0) {
                C8703p analyticsContext2 = homeFragment.getAnalyticsContext();
                if (analyticsContext2 != null) {
                    analyticsContext2.mo21333d(jVar.f19098a, jVar.f19099b);
                }
            }
            C8694h logCat = this.f21976a.getLogCat();
            StringBuilder h2 = C0072d.m201h("Scrolled past ");
            h2.append(C19388s.m32863g0(lVar));
            logCat.mo21310e(h2.toString());
        }
    }

    public HomeFragment() {
        C0120c<C12942b> registerForActivityResult = registerForActivityResult(new C12648b(), new C9991b(this, 0));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.reviewActionResult = registerForActivityResult;
    }

    private final void forceRefresh() {
        this.adapter.clear();
        resetAndLoadContent();
    }

    /* access modifiers changed from: private */
    public final HomeViewModel getViewModel() {
        return (HomeViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleSideEffect(C9998g gVar) {
        Object value;
        C10001h hVar;
        if (gVar instanceof C9998g.C10000b) {
            C9998g.C10000b bVar = (C9998g.C10000b) gVar;
            if (bVar.f22005c) {
                scrollToTop();
            }
            onLoadComplete(bVar.f22003a);
            getPagination().mo46065h(this.adapter.getItemCount(), bVar.f22004b);
            String title = bVar.f22003a.getTitle();
            if (title != null) {
                requireActivity().setTitle(title);
            }
        } else if (gVar instanceof C9998g.C9999a) {
            navigateToSignIn(((C9998g.C9999a) gVar).f22002a);
        }
        HomeViewModel viewModel = getViewModel();
        viewModel.getClass();
        C19383o.m32797g(gVar, "sideEffect");
        StateFlowImpl stateFlowImpl = viewModel.f21986k;
        do {
            value = stateFlowImpl.getValue();
            hVar = (C10001h) value;
            hVar.getClass();
        } while (!stateFlowImpl.mo72337i(value, C10001h.m18179b(hVar, (String) null, C19327t.m32649e1(gVar, hVar.f22007b), (String) null, (HomeTab) null, false, false, (String) null, (C10002i) null, (String) null, 509)));
    }

    /* access modifiers changed from: private */
    public final void handleState(C10001h hVar) {
        showUi(hVar.f22013h);
        C9998g gVar = (C9998g) C19327t.m32640V0(hVar.f22007b);
        if (gVar != null) {
            handleSideEffect(gVar);
        }
        String str = hVar.f22012g;
        if (str != null) {
            this.pageTitle = str;
        }
    }

    private final void initializeViewModelWithArguments(Bundle bundle) {
        Integer num;
        HomeTab homeTab;
        String str;
        Object value;
        String apiUrl;
        Bundle bundle2 = bundle;
        Bundle arguments = getArguments();
        this.isExplore = arguments != null ? arguments.getBoolean(HomePagerFragment.IS_EXPLORE) : false;
        boolean z = true;
        if (bundle2 == null || !bundle2.containsKey("transaction-data")) {
            z = false;
        }
        if (z) {
            num = Integer.valueOf(bundle2.getInt("transaction-data", 0));
        } else {
            Bundle arguments2 = getArguments();
            num = arguments2 != null ? Integer.valueOf(arguments2.getInt("transaction-data")) : null;
        }
        if (num == null || num.intValue() == 0) {
            homeTab = null;
        } else {
            C19285c<TransactionDataRepository> cVar = TransactionDataRepository.f26402b;
            homeTab = (HomeTab) TransactionDataRepository.C11867a.m19552a().mo38342a(num.intValue());
        }
        if (bundle2 == null || (str = bundle2.getString(API_URL, (String) null)) == null) {
            Bundle arguments3 = getArguments();
            str = arguments3 != null ? arguments3.getString(API_URL, (String) null) : null;
        }
        HomeViewModel viewModel = getViewModel();
        String trackingName = getTrackingName();
        boolean z2 = this.isExplore;
        View view = getView();
        boolean z3 = view != null ? view.getContext().getResources().getBoolean(R.bool.width_600) : false;
        C19383o.m32796f(trackingName, "trackingName");
        viewModel.getClass();
        if (C19383o.m32792b(((C10001h) viewModel.f21987l.getValue()).f22013h, C10002i.C10003a.f22015a)) {
            if (!(homeTab == null || (apiUrl = homeTab.getApiUrl()) == null)) {
                str = apiUrl;
            }
            StateFlowImpl stateFlowImpl = viewModel.f21986k;
            while (true) {
                Object value2 = stateFlowImpl.getValue();
                StateFlowImpl stateFlowImpl2 = stateFlowImpl;
                boolean z4 = z2;
                String str2 = trackingName;
                if (stateFlowImpl2.mo72337i(value2, C10001h.m18179b((C10001h) value2, str, (ArrayList) null, trackingName, homeTab, z3, z2, (String) null, (C10002i) null, (String) null, 450))) {
                    break;
                }
                stateFlowImpl = stateFlowImpl2;
                trackingName = str2;
                z2 = z4;
            }
            C13185n page = homeTab != null ? homeTab.getPage() : null;
            if (page != null) {
                StateFlowImpl stateFlowImpl3 = viewModel.f21986k;
                do {
                    value = stateFlowImpl3.getValue();
                } while (!stateFlowImpl3.mo72337i(value, C10001h.m18179b(((C10001h) value).mo33234a(new C9998g.C10000b(page, viewModel.mo33215d(homeTab.getNextPath()), false)), (String) null, (ArrayList) null, (String) null, (HomeTab) null, false, false, (String) null, C10002i.C10006d.f22018a, viewModel.mo33215d(homeTab.getNextPath()), 127)));
                HomeTab homeTab2 = ((C10001h) viewModel.f21987l.getValue()).f22009d;
                if (homeTab2 != null) {
                    homeTab2.clearNextPath();
                    return;
                }
                return;
            }
            viewModel.mo33214c(false);
        }
    }

    private final void navigateToSignIn(C11487l lVar) {
        C12790b.m20430b(this, new C12948h(C12790b.m20432d(this), EtsyAction.VIEW_FEED, (Bundle) null, (String) null, lVar != null ? lVar.f25336a : null, lVar != null ? lVar.f25337b : null, 12));
    }

    public static /* synthetic */ void navigateToSignIn$default(HomeFragment homeFragment, C11487l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            homeFragment.navigateToSignIn(lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToSignIn");
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m34993onViewCreated$lambda0(HomeFragment homeFragment) {
        C19383o.m32797g(homeFragment, "this$0");
        homeFragment.getViewModel().mo33216e(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: reviewActionResult$lambda-5  reason: not valid java name */
    public static final void m34994reviewActionResult$lambda5(HomeFragment homeFragment, C12647a aVar) {
        C19383o.m32797g(homeFragment, "this$0");
        if (aVar.f27895a == 411) {
            homeFragment.forceRefresh();
        }
    }

    private final void showUi(C10002i iVar) {
        if (C19383o.m32792b(iVar, C10002i.C10003a.f22015a)) {
            return;
        }
        if (C19383o.m32792b(iVar, C10002i.C10004b.f22016a)) {
            showEmptyView();
        } else if (C19383o.m32792b(iVar, C10002i.C10005c.f22017a)) {
            onLoadFailure();
        } else if (C19383o.m32792b(iVar, C10002i.C10006d.f22018a)) {
            showListView();
        } else if (C19383o.m32792b(iVar, C10002i.C10007e.f22019a)) {
            ViewExtensions.m12869m(this.loadingView);
        } else if (C19383o.m32792b(iVar, C10002i.C10008f.f22020a)) {
            this.swipeRefreshLayout.setRefreshing(true);
            C13364c cVar = this.scrollEventDelegate;
            if (cVar != null) {
                cVar.f29294a = -1;
                cVar.f29295b = false;
            }
        } else if (C19383o.m32792b(iVar, C10002i.C10009g.f22021a)) {
            showSignInView();
        }
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

    public boolean canScrollUp() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView.canScrollVertically(-1);
        }
        return false;
    }

    public String getApiUrl() {
        return "";
    }

    public C13801b getCardViewHolderFactory() {
        C13173c adapter = getAdapter();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C8703p analyticsContext = getAnalyticsContext();
        C13461f rxSchedulers2 = getRxSchedulers();
        ListingCardViewHolderOptions.C11971e eVar = r6;
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(R.dimen.clg_space_8);
        C8623e configMap = getConfigMap();
        C19383o.m32796f(configMap, "configMap");
        ListingCardViewHolderOptions.C11971e eVar2 = new ListingCardViewHolderOptions.C11971e(dimensionPixelSize, configMap);
        C8267e adImpressionRepository = getAdImpressionRepository();
        C12724a deepLinkEligibility = getDeepLinkEligibility();
        C12741o routeInspector = getRouteInspector();
        C13851a deepLinkEntityChecker = getDeepLinkEntityChecker();
        C10865h searchUriParser = getSearchUriParser();
        C12796e listingImagesRepository2 = getListingImagesRepository();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        return new C13801b(new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository, deepLinkEligibility, routeInspector, deepLinkEntityChecker, searchUriParser, this, eVar, (C10715a) null, listingImagesRepository2, (C8630b) null, (WeakReference) null, 53248));
    }

    public final C11780h getFavoriteRepository() {
        C11780h hVar = this.favoriteRepository;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("favoriteRepository");
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

    public final C13294e getHomeScreenEventManager() {
        C13294e eVar = this.homeScreenEventManager;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("homeScreenEventManager");
        throw null;
    }

    public final C8709f getHomeScreenPerformanceTracker() {
        C8709f fVar = this.homeScreenPerformanceTracker;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("homeScreenPerformanceTracker");
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

    public final C8694h getLogCat() {
        C8694h hVar = this.logCat;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("logCat");
        throw null;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public C8709f getPerformanceTracker() {
        return getHomeScreenPerformanceTracker();
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

    public final C8707d getTimeToFirstContent() {
        return this.timeToFirstContent;
    }

    public final UserActionBus getUserActionBus() {
        UserActionBus userActionBus2 = this.userActionBus;
        if (userActionBus2 != null) {
            return userActionBus2;
        }
        C19383o.m32805o("userActionBus");
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

    public final boolean isScrollPositionAtTopOfScreen() {
        return this.recyclerView.computeVerticalScrollOffset() == 0;
    }

    public void launchReviewFlow(C12942b bVar) {
        C19383o.m32797g(bVar, "navigationKey");
        this.reviewActionResult.mo1157b(bVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13173c adapter = getAdapter();
        C19383o.m32796f(adapter, "getAdapter()");
        this.adImpressionScrollListener = new AdImpressionScrollListener(adapter, new HomeFragment$onCreate$1(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        initializeViewModelWithArguments(bundle);
        this.scrollEventDelegate = new C13364c();
        this.recyclerView.addOnScrollListener(new C9987b(this, new C9988c(this)));
        RecyclerView recyclerView = this.recyclerView;
        AdImpressionScrollListener adImpressionScrollListener2 = this.adImpressionScrollListener;
        if (adImpressionScrollListener2 != null) {
            recyclerView.addOnScrollListener(adImpressionScrollListener2);
            return onCreateView;
        }
        C19383o.m32805o("adImpressionScrollListener");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.scrollEventDelegate = null;
    }

    public void onLoadContent() {
        getViewModel().mo33214c(false);
    }

    public void onRefresh() {
    }

    public void onResume() {
        super.onResume();
        if (this.timeToFirstContent == null) {
            this.timeToFirstContent = getHomeScreenPerformanceTracker().mo21328a(TimedMetric.TIME_TO_FIRST_CONTENT);
        }
    }

    public void onRetry() {
        getViewModel().mo33216e(false);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C13364c cVar = this.scrollEventDelegate;
        if (cVar != null) {
            bundle.putInt("lastHeaderPos", cVar.f29294a);
            bundle.putBoolean("scrolledToEnd", cVar.f29295b);
        }
        HomeTab homeTab = ((C10001h) getViewModel().f21987l.getValue()).f22009d;
        if (homeTab != null) {
            C19285c<TransactionDataRepository> cVar2 = TransactionDataRepository.f26402b;
            bundle.putInt("transaction-data", TransactionDataRepository.C11867a.m19552a().mo38343b(homeTab));
        }
        C10001h hVar = (C10001h) getViewModel().f21987l.getValue();
        String str = hVar.f22014i;
        if (str == null) {
            str = hVar.f22006a;
        }
        bundle.putString(API_URL, str);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        this.swipeRefreshLayout.setOnRefreshListener(new C9992c(this));
        C11914o.m19629a(this.recyclerView.getViewTreeObserver(), new HomeFragment$onViewCreated$2(this));
        this.recyclerView.addItemDecoration(new C10723f(getResources().getDimensionPixelSize(R.dimen.clg_space_8)));
        getLifecycle().mo10733a(getViewModel());
        C19662p1 p1Var = getViewModel().f21987l;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        C19383o.m32796f(lifecycle, "viewLifecycleOwner.lifecycle");
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(C2869k.m6799a(p1Var, lifecycle, Lifecycle.State.STARTED), new HomeFragment$onViewCreated$3(this, (C19340c<? super HomeFragment$onViewCreated$3>) null));
        C2887s viewLifecycleOwner = getViewLifecycleOwner();
        C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
        C19669s.m33429a(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, C15588c1.m25329i0(viewLifecycleOwner));
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        C13364c cVar = this.scrollEventDelegate;
        if (cVar != null) {
            cVar.f29294a = bundle != null ? bundle.getInt("lastHeaderPos") : -1;
            cVar.f29295b = bundle != null ? bundle.getBoolean("scrolledToEnd") : false;
        }
    }

    public void performAction(PositionList positionList, IServerDrivenAction iServerDrivenAction) {
        C19383o.m32797g(positionList, "positions");
        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
        if (C19383o.m32792b(iServerDrivenAction.getType(), ServerDrivenAction.TYPE_DISMISS_ETSY_COUPON_BANNER)) {
            getHomeScreenEventManager().f29199c = null;
        }
        getViewModel().mo33216e(false);
    }

    public void scrollToTop() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }

    public final void scrollToTopAndRefresh() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
        getViewModel().mo33216e(false);
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setHomeScreenEventManager(C13294e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.homeScreenEventManager = eVar;
    }

    public final void setHomeScreenPerformanceTracker(C8709f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.homeScreenPerformanceTracker = fVar;
    }

    public final void setListingImagesRepository(C12796e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.listingImagesRepository = eVar;
    }

    public final void setLogCat(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.logCat = hVar;
    }

    public final void setPageTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.pageTitle = str;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public void setServerMessage(MessageCard messageCard) {
        EmptyMessageView emptyMessageView;
        if (messageCard != null && (emptyMessageView = this.emptyMessageView) != null) {
            emptyMessageView.bind(messageCard);
            if (messageCard.isTryAgain()) {
                this.emptyMessageView.setButtonClickListener(new HomeFragment$setServerMessage$1(this));
            } else if (C18263b.m30839d0(messageCard.getDeepLinkUrl())) {
                this.emptyMessageView.setButtonClickListener(new HomeFragment$setServerMessage$2(this, messageCard));
            }
        }
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setTimeToFirstContent(C8707d dVar) {
        this.timeToFirstContent = dVar;
    }

    public final void setUserActionBus(UserActionBus userActionBus2) {
        C19383o.m32797g(userActionBus2, "<set-?>");
        this.userActionBus = userActionBus2;
    }

    public final void setViewModelFactory(C8656o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewModelFactory = oVar;
    }

    public void showSignInView() {
        setLoading(false);
        setRefreshing(false);
        getAdapter().clear();
        this.signinView.setTitle((int) R.string.home_signin_heading);
        this.signinView.setSubtitle((int) R.string.home_signin_body);
        this.signinView.setImage(R.drawable.clg_icon_brand_search_v2);
        this.signinView.setButtonText((int) R.string.home_cta);
        this.signinView.setButtonClickListener(new HomeFragment$showSignInView$1(this));
        super.showSignInView();
    }

    public C13380b getPagination() {
        return getViewModel().f21988m;
    }
}
