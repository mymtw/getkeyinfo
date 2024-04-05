package com.etsy.android.p327ui.home.tabs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.activity.result.C0120c;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.config.bucketing.C8617e;
import com.etsy.android.lib.dagger.C8656o;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.ViewPerformanceTracker;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.TimedMetric;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.C11819z;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9113c0;
import com.etsy.android.p327ui.conversation.list.ccm.C9581e;
import com.etsy.android.p327ui.core.C9622j;
import com.etsy.android.p327ui.home.etsylens.C9974e;
import com.etsy.android.p327ui.home.etsylens.EtsyLensPresenter;
import com.etsy.android.p327ui.home.home.C9991b;
import com.etsy.android.p327ui.home.home.HomeFragment;
import com.etsy.android.p327ui.home.tabs.C10065l;
import com.etsy.android.p327ui.home.tabs.C10070p;
import com.etsy.android.p327ui.homescreen.purchaseclaim.PurchaseClaimSpec;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.SearchContainerKey;
import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import com.etsy.android.p327ui.search.C10866i;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.singleactivity.C11322f;
import com.etsy.android.stylekit.views.C9053d;
import com.etsy.android.stylekit.views.C9054e;
import com.etsy.android.stylekit.views.ratings.C9072a;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import com.etsy.android.util.C12060q;
import com.etsy.android.util.C12061r;
import com.squareup.moshi.C17414y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p084d9.C6671a;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19150c;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p320cb.C8565b;
import p320cb.C8566c;
import p337de.C12647a;
import p337de.C12649c;
import p346fa.C12703a;
import p350fe.C12736j;
import p350fe.C12741o;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12948h;
import p377jf.C12979a;
import p389lc.C13011b;
import p425q9.C13265p;
import p428qc.C13286d;
import p428qc.C13294e;
import p456ua.C13461f;
import p458uc.C13468c;
import p458uc.C13472e;
import p487ya.C13895a;
import p496za.C13943a;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment */
public final class HomePagerFragment extends TrackingBaseFragment implements C9090a.C9096b, C9113c0.C9115b, C11819z, C11322f {
    public static final int $stable = 8;
    public static final C10049a Companion = new C10049a();
    public static final String IS_EXPLORE = "is_explore";
    public static final String ONBOARDING_SIGN_IN_MODE_ENABLED = "host_sign_in_mode";
    public static final String SIGN_IN_SCREEN_HIDDEN = "sign_in_screen_hidden";
    public static final String TRACKING_PAGE_VIEW_PREFIX = "homescreen";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C6671a button;
    public C8886e cameraHelper;
    /* access modifiers changed from: private */
    public final C13011b darkModeTracker;
    private final C12736j deepLinkRouter;
    private final C7091a disposables;
    /* access modifiers changed from: private */
    public EtsyLensPresenter etsyLensPresenter;
    private final C19285c etsyLensViewModel$delegate;
    /* access modifiers changed from: private */
    public final C8656o factory;
    public C13895a fileSupport;
    private final C12703a grafana;
    public C13294e homeScreenEventManager;
    private final C9622j listingUriParser;
    private View loadingErrorView;
    private View loadingView;
    private final C8694h log;
    public C17414y moshi;
    private final ViewPerformanceTracker performanceTrackerFrag;
    public C13468c purchaseClaimRepository;
    private C8566c referralMarketingDelegate;
    private final C12741o routeInspector;
    public C13461f schedulers;
    /* access modifiers changed from: private */
    public C10866i searchViewHelper;
    private final C13265p session;
    /* access modifiers changed from: private */
    public final C13943a sharedPrefsProvider;
    private final C0120c<C12948h> signInResult;
    /* access modifiers changed from: private */
    public C10052b tabsAdapter;
    private C8707d timeToFirstContent;
    private final C19285c viewModel$delegate;
    /* access modifiers changed from: private */
    public ToggleableSwipeViewPager viewPager;
    private boolean wasSignedIn;

    /* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$a */
    public static final class C10049a {
    }

    /* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$b */
    public /* synthetic */ class C10050b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22112a;

        static {
            int[] iArr = new int[EtsyAction.values().length];
            iArr[EtsyAction.CLAIM_PURCHASE.ordinal()] = 1;
            iArr[EtsyAction.VIEW_COUPON_BANNER.ordinal()] = 2;
            f22112a = iArr;
        }
    }

    public HomePagerFragment(C12703a aVar, C13265p pVar, C8694h hVar, C6671a aVar2, ViewPerformanceTracker viewPerformanceTracker, C8656o oVar, C13943a aVar3, C13011b bVar, C12741o oVar2, C9622j jVar, C12736j jVar2) {
        C19383o.m32797g(aVar, "grafana");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(hVar, AnalyticsLogDatabaseHelper.LOG);
        C19383o.m32797g(aVar2, "button");
        C19383o.m32797g(viewPerformanceTracker, "performanceTrackerFrag");
        C19383o.m32797g(oVar, "factory");
        C19383o.m32797g(aVar3, "sharedPrefsProvider");
        C19383o.m32797g(bVar, "darkModeTracker");
        C19383o.m32797g(oVar2, "routeInspector");
        C19383o.m32797g(jVar, "listingUriParser");
        C19383o.m32797g(jVar2, "deepLinkRouter");
        this.grafana = aVar;
        this.session = pVar;
        this.log = hVar;
        this.button = aVar2;
        this.performanceTrackerFrag = viewPerformanceTracker;
        this.factory = oVar;
        this.sharedPrefsProvider = aVar3;
        this.darkModeTracker = bVar;
        this.routeInspector = oVar2;
        this.listingUriParser = jVar;
        this.deepLinkRouter = jVar2;
        this.viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(HomePagerViewModel.class), new HomePagerFragment$special$$inlined$viewModels$default$2(new HomePagerFragment$special$$inlined$viewModels$default$1(this)), new HomePagerFragment$viewModel$2(this));
        this.etsyLensViewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(C9974e.class), new HomePagerFragment$special$$inlined$viewModels$default$5(new HomePagerFragment$special$$inlined$viewModels$default$4(this)), new HomePagerFragment$etsyLensViewModel$2(this));
        this.disposables = new C7091a();
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C9991b(this, 1));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.signInResult = registerForActivityResult;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005e, code lost:
        if ((java.util.concurrent.TimeUnit.HOURS.toMillis(12) + r9) < java.lang.Long.valueOf(java.lang.System.currentTimeMillis()).longValue()) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void checkButtonDeepLink() {
        /*
            r13 = this;
            d9.a r0 = r13.button
            com.braze.a r1 = new com.braze.a
            r1.<init>(r13)
            r0.getClass()
            android.content.Context r0 = r0.f14724a
            com.usebutton.merchant.k r2 = com.usebutton.merchant.C17496l.f38264b
            com.usebutton.merchant.q r3 = com.usebutton.merchant.C17496l.m29340a(r0)
            com.usebutton.merchant.w r4 = com.usebutton.merchant.C17496l.m29341b(r0)
            mm.b r5 = p623mm.C18248b.m30778a()
            java.lang.String r0 = r0.getPackageName()
            r2.getClass()
            com.usebutton.merchant.b r6 = r3.f38271a
            com.usebutton.merchant.c r6 = (com.usebutton.merchant.C17476c) r6
            com.usebutton.merchant.t r6 = r6.f38234a
            com.usebutton.merchant.u r6 = (com.usebutton.merchant.C17507u) r6
            java.lang.String r6 = r6.f38286a
            if (r6 != 0) goto L_0x0038
            java.util.concurrent.Executor r0 = r2.f38260b
            com.usebutton.merchant.d r2 = new com.usebutton.merchant.d
            r2.<init>(r1)
            r0.execute(r2)
            goto L_0x0089
        L_0x0038:
            android.content.pm.PackageInfo r6 = r4.mo68687b()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0061
            long r9 = r6.firstInstallTime
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            r11 = 12
            long r11 = r6.toMillis(r11)
            long r11 = r11 + r9
            com.usebutton.merchant.w$a r6 = r4.f38293c
            r6.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            long r9 = r6.longValue()
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r7 = r8
        L_0x0062:
            if (r7 != 0) goto L_0x007f
            com.usebutton.merchant.c0 r6 = r3.f38274d
            com.usebutton.merchant.d0 r6 = (com.usebutton.merchant.C17479d0) r6
            android.content.SharedPreferences r6 = r6.f38237a
            java.lang.String r7 = "btn_checked_deferred_deep_link"
            boolean r6 = r6.getBoolean(r7, r8)
            if (r6 == 0) goto L_0x0073
            goto L_0x007f
        L_0x0073:
            r3.mo68682g()
            com.usebutton.merchant.j r6 = new com.usebutton.merchant.j
            r6.<init>(r2, r1, r0, r3)
            r3.mo68678c(r4, r5, r6)
            goto L_0x0089
        L_0x007f:
            java.util.concurrent.Executor r0 = r2.f38260b
            com.usebutton.merchant.e r2 = new com.usebutton.merchant.e
            r2.<init>(r1)
            r0.execute(r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.tabs.HomePagerFragment.checkButtonDeepLink():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 != null) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: checkButtonDeepLink$lambda-17  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34999checkButtonDeepLink$lambda17(com.etsy.android.p327ui.home.tabs.HomePagerFragment r9, android.content.Intent r10, java.lang.Throwable r11) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            if (r10 == 0) goto L_0x0067
            android.net.Uri r11 = r10.getData()
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0020
            com.etsy.android.ui.core.j r2 = r9.listingUriParser
            r2.getClass()
            x9.a r2 = r2.f21322b
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = r2.mo46683a(r11)
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING
            if (r2 != r3) goto L_0x0020
            r2 = r0
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r3 = 0
            if (r11 == 0) goto L_0x0036
            com.etsy.android.ui.core.j r4 = r9.listingUriParser
            r4.getClass()
            fe.o r4 = r4.f21321a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r5 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING
            java.lang.String r5 = r5.getEntityName()
            java.lang.String r11 = r4.mo45510e(r11, r5)
            goto L_0x0037
        L_0x0036:
            r11 = r3
        L_0x0037:
            if (r2 == 0) goto L_0x0042
            if (r11 == 0) goto L_0x003f
            java.lang.Long r3 = kotlin.text.C19456j.m33017U0(r11)
        L_0x003f:
            if (r3 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            if (r0 == 0) goto L_0x007a
            android.net.Uri r10 = r10.getData()
            fe.o r0 = r9.routeInspector
            android.os.Bundle r6 = p350fe.C12738l.m20401b(r10, r0)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey r10 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ListingKey
            java.lang.String r2 = p356ge.C12790b.m20432d(r9)
            com.etsy.android.lib.models.datatypes.EtsyId r3 = new com.etsy.android.lib.models.datatypes.EtsyId
            r3.<init>((java.lang.String) r11)
            r4 = 0
            r5 = 0
            r7 = 12
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            p356ge.C12790b.m20430b(r9, r10)
            goto L_0x007a
        L_0x0067:
            if (r11 == 0) goto L_0x007a
            com.etsy.android.lib.logger.h r10 = com.etsy.android.lib.logger.C8694h.f19097a
            r10.error(r11)
            r10 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            fa.a r9 = r9.grafana
            java.lang.String r0 = "branch.error_fetching_post_install_intent"
            r9.mo45475b(r0, r10)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.tabs.HomePagerFragment.m34999checkButtonDeepLink$lambda17(com.etsy.android.ui.home.tabs.HomePagerFragment, android.content.Intent, java.lang.Throwable):void");
    }

    private final C9974e getEtsyLensViewModel() {
        return (C9974e) this.etsyLensViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final HomePagerViewModel getViewModel() {
        return (HomePagerViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleState(C10065l lVar) {
        C19383o.m32795e(lVar, "null cannot be cast to non-null type com.etsy.android.ui.home.tabs.HomePagerSideEffect.GoToSignInForResult");
        C10065l.C10066a aVar = (C10065l.C10066a) lVar;
        if (!this.session.mo45960e()) {
            int i = C10050b.f22112a[aVar.f22182a.ordinal()];
            if (i == 1 || i == 2) {
                navigateToSignIn(aVar.f22182a, aVar.f22183b, aVar.f22184c);
            }
        }
        HomePagerViewModel viewModel = getViewModel();
        viewModel.getClass();
        C2895z<C10067m> zVar = viewModel.f22130p;
        C10067m value = zVar.getValue();
        zVar.setValue(value != null ? new C10067m(C19327t.m32649e1(lVar, value.f22185a)) : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r3 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void initTabs(java.util.List<? extends com.etsy.android.lib.models.homescreen.HomeTab> r11) {
        /*
            r10 = this;
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            if (r0 == 0) goto L_0x0088
            android.view.View r1 = r10.loadingView
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            com.etsy.android.ui.home.tabs.b r1 = r10.tabsAdapter
            r2 = 1
            if (r1 == 0) goto L_0x0022
            r3 = 0
            java.util.List<? extends com.etsy.android.lib.models.homescreen.HomeTab> r1 = r1.f22149k
            if (r1 == 0) goto L_0x0020
            int r1 = r1.size()
            int r4 = r11.size()
            if (r1 != r4) goto L_0x0020
            r3 = r2
        L_0x0020:
            if (r3 != 0) goto L_0x004b
        L_0x0022:
            com.etsy.android.ui.home.tabs.b r1 = new com.etsy.android.ui.home.tabs.b
            androidx.fragment.app.FragmentManager r5 = r10.getChildFragmentManager()
            java.lang.String r3 = "childFragmentManager"
            kotlin.jvm.internal.C19383o.m32796f(r5, r3)
            com.etsy.android.lib.logger.perf.d r7 = r10.timeToFirstContent
            kotlin.jvm.internal.C19383o.m32794d(r7)
            q9.p r8 = r10.session
            qc.e r3 = r10.getHomeScreenEventManager()
            boolean r3 = r3.f29198b
            kotlin.c<java.lang.String> r3 = com.etsy.android.lib.logger.referrers.Referrer.f19131c
            android.os.Bundle r3 = r10.getArguments()
            java.lang.String r9 = com.etsy.android.lib.logger.referrers.Referrer.C8712a.m17143c(r3)
            r4 = r1
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.tabsAdapter = r1
        L_0x004b:
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r1 = r10.viewPager
            if (r1 != 0) goto L_0x0050
            goto L_0x0055
        L_0x0050:
            com.etsy.android.ui.home.tabs.b r3 = r10.tabsAdapter
            r1.setAdapter(r3)
        L_0x0055:
            int r11 = r11.size()
            if (r11 <= r2) goto L_0x007b
            boolean r11 = r0 instanceof com.etsy.android.uikit.BaseActivity
            if (r11 == 0) goto L_0x0075
            com.etsy.android.uikit.BaseActivity r0 = (com.etsy.android.uikit.BaseActivity) r0
            com.etsy.android.uikit.AppBarHelper r11 = r0.getAppBarHelper()
            com.etsy.android.stylekit.views.CollageTabLayout r11 = r11.addTabLayout()
            if (r11 == 0) goto L_0x0075
            r11.setTabMode(r2)
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r0 = r10.viewPager
            if (r0 == 0) goto L_0x0075
            r11.setupWithViewPager(r0)
        L_0x0075:
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r11 = r10.viewPager
            com.etsy.android.extensions.ViewExtensions.m12869m(r11)
            goto L_0x0088
        L_0x007b:
            boolean r11 = r0 instanceof com.etsy.android.uikit.BaseActivity
            if (r11 == 0) goto L_0x0088
            com.etsy.android.uikit.BaseActivity r0 = (com.etsy.android.uikit.BaseActivity) r0
            com.etsy.android.uikit.AppBarHelper r11 = r0.getAppBarHelper()
            r11.removeTabLayout()
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.tabs.HomePagerFragment.initTabs(java.util.List):void");
    }

    private final void initializeSearchBar() {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        if (requireActivity instanceof BOEActivity) {
            C8703p analyticsContext = getAnalyticsContext();
            C19383o.m32796f(analyticsContext, "analyticsContext");
            String string = requireActivity.getString(R.string.search_for_anything_on_etsy_search_field_hint);
            C19383o.m32796f(string, "act.getString(R.string.s…n_etsy_search_field_hint)");
            C10866i iVar = new C10866i(requireActivity, analyticsContext, string, ((BOEActivity) requireActivity).getAppBarHelper(), new C10055e(this, 0), (SearchView.C0283l) null, (C9581e) null, (C9072a) null, new C9053d(this, 2), 456);
            getLifecycle().mo10733a(new HomePagerFragment$initializeSearchBar$3$1(iVar, this));
            this.searchViewHelper = iVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeSearchBar$lambda-12  reason: not valid java name */
    public static final void m35000initializeSearchBar$lambda12(HomePagerFragment homePagerFragment, View view, boolean z) {
        C19383o.m32797g(homePagerFragment, "this$0");
        if (z) {
            C12788a.m20424c(homePagerFragment.getActivity(), new SearchContainerKey(C19421p.m32935c0(homePagerFragment.getActivity()), (SearchSpec) null, (SearchRedirectSpec) null, (Bundle) null, 14, (DefaultConstructorMarker) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initializeSearchBar$lambda-13  reason: not valid java name */
    public static final void m35001initializeSearchBar$lambda13(HomePagerFragment homePagerFragment, View view) {
        C19383o.m32797g(homePagerFragment, "this$0");
        EtsyLensPresenter etsyLensPresenter2 = homePagerFragment.etsyLensPresenter;
        if (etsyLensPresenter2 != null) {
            C9974e eVar = etsyLensPresenter2.f21944c;
            C12060q.m19871b(eVar.f21962d, new C9974e.C9975a.C9976a("image_search_icon_tapped"));
            C12060q.m19871b(eVar.f21962d, C9974e.C9975a.C9982g.f21971a);
        }
    }

    private final void navigateToSignIn(EtsyAction etsyAction, String str, Bundle bundle) {
        this.signInResult.mo1157b(new C12948h(C12790b.m20432d(this), etsyAction, bundle, str, (String) null, (String) null, 48));
    }

    public static /* synthetic */ void navigateToSignIn$default(HomePagerFragment homePagerFragment, EtsyAction etsyAction, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        homePagerFragment.navigateToSignIn(etsyAction, str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-2  reason: not valid java name */
    public static final void m35002onCreateView$lambda2(HomePagerFragment homePagerFragment, View view) {
        C19383o.m32797g(homePagerFragment, "this$0");
        homePagerFragment.getViewModel().mo33342f();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3  reason: not valid java name */
    public static final void m35003onViewCreated$lambda3(HomePagerFragment homePagerFragment, C10070p pVar) {
        C19383o.m32797g(homePagerFragment, "this$0");
        if (C19383o.m32792b(pVar, C10070p.C10071a.f22200a)) {
            ViewExtensions.m12860d(homePagerFragment.viewPager);
            ViewExtensions.m12869m(homePagerFragment.loadingErrorView);
            ViewExtensions.m12860d(homePagerFragment.loadingView);
        } else if (C19383o.m32792b(pVar, C10070p.C10072b.f22201a)) {
            ViewExtensions.m12860d(homePagerFragment.loadingErrorView);
            ViewExtensions.m12869m(homePagerFragment.loadingView);
        } else if (pVar instanceof C10070p.C10073c) {
            ViewExtensions.m12869m(homePagerFragment.viewPager);
            List<HomeTab> list = ((C10070p.C10073c) pVar).f22202a;
            boolean z = false;
            String apiUrl = list.get(0).getApiUrl();
            C19383o.m32796f(apiUrl, "results[0].apiUrl");
            if (apiUrl.length() == 0) {
                z = true;
            }
            if (!z || !homePagerFragment.session.mo45960e()) {
                homePagerFragment.initTabs(list);
            }
        } else {
            ViewExtensions.m12869m(homePagerFragment.viewPager);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5  reason: not valid java name */
    public static final void m35004onViewCreated$lambda5(HomePagerFragment homePagerFragment, C10067m mVar) {
        C19383o.m32797g(homePagerFragment, "this$0");
        C10065l lVar = (C10065l) C19327t.m32640V0(mVar.f22185a);
        if (lVar != null) {
            homePagerFragment.handleState(lVar);
        }
    }

    private final void showNewSignInFlow() {
        C12790b.m20430b(this, new C12948h(C12790b.m20432d(this), EtsyAction.VIEW_FEED, (Bundle) null, (String) null, (String) null, (String) null, 60));
    }

    /* access modifiers changed from: private */
    public final void showPurchaseClaimStatus(C13472e eVar) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getViewModel().f22139y = false;
            C12979a a = C12979a.C12980a.m20683a(activity);
            a.mo45781a(eVar.f29492a);
            a.f28588b.setBodyText(getString(eVar.f29493b), (Drawable) null);
            a.f28590d = true;
            a.f28588b.showDismissButton(false);
            a.f28591e = 3000;
            a.mo45783c(eVar.f29494c);
            a.f28587a.setOnDismissListener(new C10056f(this));
            a.mo45786f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showPurchaseClaimStatus$lambda-9$lambda-8  reason: not valid java name */
    public static final void m35005showPurchaseClaimStatus$lambda9$lambda8(HomePagerFragment homePagerFragment) {
        C19383o.m32797g(homePagerFragment, "this$0");
        homePagerFragment.getViewModel().f22139y = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: signInResult$lambda-1  reason: not valid java name */
    public static final void m35006signInResult$lambda1(HomePagerFragment homePagerFragment, C12647a aVar) {
        C19383o.m32797g(homePagerFragment, "this$0");
        Intent intent = aVar.f27896b;
        if (intent != null) {
            EtsyAction etsyAction = EtsyAction.CLAIM_PURCHASE;
            Bundle bundleExtra = intent.getBundleExtra(etsyAction.getType());
            if (bundleExtra != null) {
                PurchaseClaimSpec purchaseClaimSpec = (PurchaseClaimSpec) bundleExtra.getParcelable(etsyAction.getType());
                if (aVar.f27895a != 311 || purchaseClaimSpec == null) {
                    homePagerFragment.getHomeScreenEventManager().f29197a.onNext(C13286d.C13287a.f29192a);
                } else {
                    homePagerFragment.getViewModel().mo33340d(purchaseClaimSpec);
                }
            }
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

    public boolean canFocusedScreenScrollUp() {
        C10052b bVar = this.tabsAdapter;
        C11321e eVar = null;
        Fragment fragment = bVar != null ? bVar.f26553j : null;
        if (fragment instanceof C11321e) {
            eVar = (C11321e) fragment;
        }
        if (eVar != null) {
            return eVar.canScrollUp();
        }
        return true;
    }

    public boolean displayTabs() {
        return false;
    }

    public void focusMainScreen() {
        ToggleableSwipeViewPager toggleableSwipeViewPager;
        C10052b bVar = this.tabsAdapter;
        if ((bVar != null ? bVar.mo20184j() : 0) > 0 && (toggleableSwipeViewPager = this.viewPager) != null) {
            toggleableSwipeViewPager.setCurrentItem(0, false);
        }
    }

    public final C8886e getCameraHelper() {
        C8886e eVar = this.cameraHelper;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("cameraHelper");
        throw null;
    }

    public final C13895a getFileSupport() {
        C13895a aVar = this.fileSupport;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("fileSupport");
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

    public final C17414y getMoshi() {
        C17414y yVar = this.moshi;
        if (yVar != null) {
            return yVar;
        }
        C19383o.m32805o("moshi");
        throw null;
    }

    public C8709f getPerformanceTracker() {
        return this.performanceTrackerFrag;
    }

    public final C13468c getPurchaseClaimRepository() {
        C13468c cVar = this.purchaseClaimRepository;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("purchaseClaimRepository");
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

    public int getTab() {
        return R.id.menu_bottom_nav_home;
    }

    public String getTrackingName() {
        return "home";
    }

    public C9113c0.C9114a interceptSearchFABClick() {
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        EtsyLensPresenter etsyLensPresenter2 = this.etsyLensPresenter;
        if (etsyLensPresenter2 != null) {
            etsyLensPresenter2.f21945d.mo30479f(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12736j jVar = this.deepLinkRouter;
        C8694h hVar = this.log;
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        this.referralMarketingDelegate = new C8565b(jVar, hVar, analyticsContext);
        checkButtonDeepLink();
        C19150c cVar = new C19150c(this.session.mo45957b());
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(cVar.mo20635e(C13461f.m21236c()), (C19857l) null, new HomePagerFragment$onCreate$1(this), 3);
        C7091a aVar = this.disposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.homescreen_viewpager, viewGroup, false);
        ToggleableSwipeViewPager toggleableSwipeViewPager = (ToggleableSwipeViewPager) inflate.findViewById(R.id.view_pager);
        this.viewPager = toggleableSwipeViewPager;
        if (toggleableSwipeViewPager != null) {
            toggleableSwipeViewPager.setSwipeEnabled(false);
        }
        this.loadingView = inflate.findViewById(R.id.loading_view);
        View findViewById = inflate.findViewById(R.id.no_internet);
        this.loadingErrorView = findViewById;
        View findViewById2 = findViewById != null ? findViewById.findViewById(R.id.btn_retry_internet) : null;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new C9054e(this, 2));
        }
        this.wasSignedIn = this.session.mo45960e();
        initializeSearchBar();
        return inflate;
    }

    public void onDestroy() {
        this.disposables.mo19405d();
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.searchViewHelper = null;
        this.etsyLensPresenter = null;
        this.loadingErrorView = null;
        this.viewPager = null;
        this.loadingView = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C19383o.m32797g(menuItem, "item");
        if (menuItem.getItemId() == R.id.menu_bottom_nav_home && this.viewPager != null) {
            List<Fragment> H = getChildFragmentManager().mo10358H();
            C19383o.m32796f(H, "childFragmentManager.fragments");
            ToggleableSwipeViewPager toggleableSwipeViewPager = this.viewPager;
            C19383o.m32794d(toggleableSwipeViewPager);
            int currentItem = toggleableSwipeViewPager.getCurrentItem();
            if (H.size() > currentItem) {
                Fragment fragment = H.get(currentItem);
                if (fragment instanceof HomeFragment) {
                    ((HomeFragment) fragment).scrollToTopAndRefresh();
                    return true;
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        this.wasSignedIn = this.session.mo45960e();
    }

    public void onResume() {
        super.onResume();
        SharedPreferences a = this.sharedPrefsProvider.mo46761a();
        boolean z = a.getBoolean(ONBOARDING_SIGN_IN_MODE_ENABLED, true);
        boolean z2 = a.getBoolean(SIGN_IN_SCREEN_HIDDEN, true);
        if ((true ^ this.session.mo45960e()) && z2 && z) {
            SharedPreferences.Editor edit = a.edit();
            C19383o.m32796f(edit, "editor");
            edit.putBoolean(SIGN_IN_SCREEN_HIDDEN, false);
            edit.apply();
            showNewSignInFlow();
        }
        HomePagerViewModel viewModel = getViewModel();
        View requireView = requireView();
        C19383o.m32796f(requireView, "requireView()");
        viewModel.f22138x = requireView.getContext().getResources().getBoolean(R.bool.width_600);
        if (this.wasSignedIn != this.session.mo45960e()) {
            ToggleableSwipeViewPager toggleableSwipeViewPager = this.viewPager;
            if (toggleableSwipeViewPager != null) {
                toggleableSwipeViewPager.setVisibility(8);
            }
            getViewModel().mo33342f();
        }
    }

    public void onStart() {
        super.onStart();
        if (this.timeToFirstContent == null) {
            this.timeToFirstContent = getPerformanceTracker().mo21328a(TimedMetric.TIME_TO_FIRST_CONTENT);
        }
        C8566c cVar = this.referralMarketingDelegate;
        if (cVar != null) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            cVar.mo21084a(requireActivity, requireActivity().getIntent());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        HomePagerViewModel viewModel = getViewModel();
        ViewTreeObserver viewTreeObserver = null;
        if (!viewModel.f22115A) {
            viewModel.f22115A = true;
            C19254a<C13286d> aVar = viewModel.f22120f.f29197a;
            viewModel.f22116b.getClass();
            LambdaObserver g = aVar.mo20635e(C13461f.m21236c()).mo20637g(new C10673m(viewModel, 5));
            C7091a aVar2 = viewModel.f22140z;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(g);
            if (viewModel.f22122h.mo45960e()) {
                viewModel.mo33341e();
            } else {
                C19150c cVar = new C19150c(viewModel.f22122h.mo45957b());
                viewModel.f22116b.getClass();
                LambdaObserver f = SubscribersKt.m32501f(cVar.mo20635e(C13461f.m21236c()), (C19857l) null, new HomePagerViewModel$initialize$2(viewModel), 3);
                C7091a aVar3 = viewModel.f22140z;
                C19383o.m32798h(aVar3, "compositeDisposable");
                aVar3.mo19403b(f);
            }
            viewModel.mo33342f();
        }
        ToggleableSwipeViewPager toggleableSwipeViewPager = this.viewPager;
        if (toggleableSwipeViewPager != null) {
            viewTreeObserver = toggleableSwipeViewPager.getViewTreeObserver();
        }
        C11914o.m19629a(viewTreeObserver, new HomePagerFragment$onViewCreated$1(this));
        getViewModel().f22129o.observe(getViewLifecycleOwner(), new C6469n(this, 2));
        getViewModel().f22131q.observe(getViewLifecycleOwner(), new C6346d(this, 1));
        getViewModel().f22133s.observe(getViewLifecycleOwner(), new C12061r(new HomePagerFragment$onViewCreated$4(this)));
        getViewModel().f22135u.observe(getViewLifecycleOwner(), new C12061r(new HomePagerFragment$onViewCreated$5(this)));
        if (isNativeFlagEnabled(C8617e.f18938g)) {
            EtsyLensPresenter etsyLensPresenter2 = new EtsyLensPresenter(this, getEtsyLensViewModel(), getCameraHelper(), getSchedulers());
            getViewLifecycleOwner().getLifecycle().mo10733a(etsyLensPresenter2);
            this.etsyLensPresenter = etsyLensPresenter2;
            getViewModel().f22137w.observe(getViewLifecycleOwner(), new C12061r(new HomePagerFragment$onViewCreated$7(view, this)));
        }
    }

    public void scrollFocusedScreenToTop() {
        C10052b bVar = this.tabsAdapter;
        Fragment fragment = bVar != null ? bVar.f26553j : null;
        if (fragment instanceof C11321e) {
            ((C11321e) fragment).scrollToTop();
        }
    }

    public final void setCameraHelper(C8886e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.cameraHelper = eVar;
    }

    public final void setFileSupport(C13895a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.fileSupport = aVar;
    }

    public final void setHomeScreenEventManager(C13294e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.homeScreenEventManager = eVar;
    }

    public final void setMoshi(C17414y yVar) {
        C19383o.m32797g(yVar, "<set-?>");
        this.moshi = yVar;
    }

    public final void setPurchaseClaimRepository(C13468c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.purchaseClaimRepository = cVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public C9090a.C9091a.C9094c getActionBarOverrides() {
        return C9090a.C9091a.C9094c.f19992c;
    }
}
