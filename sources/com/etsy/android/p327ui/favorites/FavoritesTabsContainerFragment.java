package com.etsy.android.p327ui.favorites;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8707d;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.TimedMetric;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.homescreen.HomeTab;
import com.etsy.android.lib.models.homescreen.Icon;
import com.etsy.android.lib.push.registration.C8840m;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.C11819z;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.favorites.C9876s;
import com.etsy.android.p327ui.favorites.recommendations.C9875e;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.singleactivity.C11322f;
import com.etsy.android.p327ui.user.inappnotifications.C11541a0;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.BaseActivity;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.SignInView;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p248tp.C8071s;
import p260v0.C8184a;
import p357gf.C12792a;
import p402n9.C13094n;
import p425q9.C13265p;
import p435rb.C13350a;
import p440s9.C13366a;
import p456ua.C13461f;
import p568fn.C17782b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment */
public final class FavoritesTabsContainerFragment extends TrackingBaseFragment implements C9731e0.C9732a, C11819z, C9090a.C9096b, C13366a, C11322f, C9896u {
    public static final int $stable = 8;
    public static final C9740a Companion = new C9740a();
    public static final int TAB_LISTING = 0;
    public static final int TAB_LISTING_MERGED = 1;
    public static final int TAB_SEARCHES = 2;
    public static final int TAB_SEARCHES_MERGED = 3;
    public static final String TAB_SELECTED_EVENT_NAME = "favorites_and_lists";
    public static final int TAB_SHOPS = 1;
    public static final int TAB_SHOPS_MERGED = 2;
    public static final int TAB_UPDATES_MERGED = 0;
    public static final String TRACKING_PAGE_IN_VIEW_PREFIX = "favorites_";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final C7091a disposables = new C7091a();
    public C8709f favPerformanceTracker;
    public C9855j favoriteTabsRepository;
    public C9859l favoriteTabsSelectedState;
    /* access modifiers changed from: private */
    public FavoritesHeaderView favoritesHeaderView;
    private int initialTab;
    private boolean isStarted;
    private View loadingErrorView;
    private View loadingView;
    public C9875e recommendationsOnFavoritesEligibility;
    public C11786n resourceProvider;
    public C13461f rxSchedulers;
    public C13265p session;
    private SignInView signInView;
    /* access modifiers changed from: private */
    public ArrayList<HomeTab> tabData = new ArrayList<>();
    /* access modifiers changed from: private */
    public C9866r tabsAdapter;
    public C9899x tabsWithIconsEligibility;
    private C8707d timeToFirstContent;
    public C11541a0 updatesNativeEligibility;
    private String userId;
    private String username;
    /* access modifiers changed from: private */
    public ToggleableSwipeViewPager viewPager;
    private boolean wasSignedIn;

    /* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$a */
    public static final class C9740a {
    }

    /* renamed from: com.etsy.android.ui.favorites.FavoritesTabsContainerFragment$b */
    public static final class C9741b implements ViewPager.C3334i {

        /* renamed from: b */
        public final /* synthetic */ FavoritesTabsContainerFragment f21536b;

        public C9741b(FavoritesTabsContainerFragment favoritesTabsContainerFragment) {
            this.f21536b = favoritesTabsContainerFragment;
        }

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            this.f21536b.trackSelectedTab(i);
            this.f21536b.updateStateForTab(i);
            FavoritesHeaderView access$getFavoritesHeaderView$p = this.f21536b.favoritesHeaderView;
            if (access$getFavoritesHeaderView$p != null) {
                access$getFavoritesHeaderView$p.updateSelectedTab(i);
            }
        }
    }

    private final void addFavoritesHeaderView() {
        Context context = getContext();
        FavoritesHeaderView favoritesHeaderView2 = context != null ? new FavoritesHeaderView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null) : null;
        this.favoritesHeaderView = favoritesHeaderView2;
        if (favoritesHeaderView2 != null) {
            ArrayList<HomeTab> arrayList = this.tabData;
            ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
            for (HomeTab title : arrayList) {
                arrayList2.add(title.getTitle());
            }
            favoritesHeaderView2.setUpTabs(arrayList2, this.initialTab, this);
        }
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
        ((C12792a) activity).removeTabLayout();
        FragmentActivity activity2 = getActivity();
        C19383o.m32795e(activity2, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity2).getAppBarHelper().addViewBelowAppBar((View) this.favoritesHeaderView, true);
    }

    private final Drawable getDrawable(String str, int i) {
        Context context = getContext();
        if (context == null || str == null) {
            return null;
        }
        int b = getResourceProvider().mo38058b(str);
        Object obj = C8184a.f17966a;
        Drawable b2 = C8184a.C8187c.m16466b(context, b);
        if (b2 == null) {
            return null;
        }
        b2.setTint(C13350a.m21013d(context, i));
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (kotlin.jvm.internal.C19383o.m32792b(r5, com.etsy.android.p327ui.favorites.C9876s.C9879c.f21804a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getTabForState(com.etsy.android.p327ui.favorites.C9876s r5) {
        /*
            r4 = this;
            com.etsy.android.ui.user.inappnotifications.a0 r0 = r4.getUpdatesNativeEligibility()
            boolean r0 = r0.mo37551a()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            com.etsy.android.ui.favorites.s$a r0 = com.etsy.android.p327ui.favorites.C9876s.C9877a.f21802a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r0 == 0) goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x0055
        L_0x0017:
            com.etsy.android.ui.favorites.s$b r0 = com.etsy.android.p327ui.favorites.C9876s.C9878b.f21803a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r0 == 0) goto L_0x0021
            r1 = 3
            goto L_0x0055
        L_0x0021:
            com.etsy.android.ui.favorites.s$c r0 = com.etsy.android.p327ui.favorites.C9876s.C9879c.f21804a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r0 == 0) goto L_0x002a
            goto L_0x0055
        L_0x002a:
            com.etsy.android.ui.favorites.s$d r0 = com.etsy.android.p327ui.favorites.C9876s.C9880d.f21805a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r5 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x0039:
            com.etsy.android.ui.favorites.s$a r0 = com.etsy.android.p327ui.favorites.C9876s.C9877a.f21802a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0041:
            r1 = r3
            goto L_0x0055
        L_0x0043:
            com.etsy.android.ui.favorites.s$b r0 = com.etsy.android.p327ui.favorites.C9876s.C9878b.f21803a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r0 == 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            com.etsy.android.ui.favorites.s$c r0 = com.etsy.android.p327ui.favorites.C9876s.C9879c.f21804a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r0)
            if (r5 == 0) goto L_0x0041
            goto L_0x0015
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment.getTabForState(com.etsy.android.ui.favorites.s):int");
    }

    /* access modifiers changed from: private */
    public final void initTabs() {
        ToggleableSwipeViewPager toggleableSwipeViewPager;
        if (this.isStarted) {
            ViewExtensions.m12860d(this.loadingView);
            C9859l favoriteTabsSelectedState2 = getFavoriteTabsSelectedState();
            boolean a = getUpdatesNativeEligibility().mo37551a();
            C9876s m = favoriteTabsSelectedState2.f21763a.mo71420m();
            if (m == null) {
                m = a ? C9876s.C9880d.f21805a : C9876s.C9877a.f21802a;
            }
            int tabForState = getTabForState(m);
            this.initialTab = tabForState;
            updateStateForTab(tabForState);
            if (this.tabsAdapter == null) {
                FragmentManager childFragmentManager = getChildFragmentManager();
                C19383o.m32796f(childFragmentManager, "childFragmentManager");
                C11541a0 updatesNativeEligibility2 = getUpdatesNativeEligibility();
                ArrayList<HomeTab> arrayList = this.tabData;
                C8707d dVar = this.timeToFirstContent;
                int i = this.initialTab;
                C19285c<String> cVar = Referrer.f19131c;
                this.tabsAdapter = new C9866r(childFragmentManager, updatesNativeEligibility2, arrayList, dVar, i, Referrer.C8712a.m17143c(getArguments()));
            }
            ToggleableSwipeViewPager toggleableSwipeViewPager2 = this.viewPager;
            if (toggleableSwipeViewPager2 != null) {
                toggleableSwipeViewPager2.setAdapter(this.tabsAdapter);
            }
            Integer num = null;
            if (isNewNavigationEnabled()) {
                addFavoritesHeaderView();
            } else {
                FragmentActivity activity = getActivity();
                C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
                CollageTabLayout tabLayout = ((C12792a) activity).getTabLayout();
                tabLayout.setTabMode(2);
                tabLayout.setBadgeStyle(CollageTabLayout.BadgeStyle.Icon);
                tabLayout.setupWithViewPager(this.viewPager);
                if (C19383o.m32792b(getTabsWithIconsEligibility().f21838a.mo21136f(C8592b.C8593a.f18851a), "on")) {
                    int i2 = 0;
                    for (T next : this.tabData) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            Icon icons = ((HomeTab) next).getIcons();
                            tabLayout.setTabBadgeIcon(i2, icons != null ? toStateListDrawable(icons) : null);
                            i2 = i3;
                        } else {
                            C17782b.m29877o0();
                            throw null;
                        }
                    }
                    tabLayout.setSelectedTabIndicatorColor(tabLayout.getContext().getColor(R.color.clg_color_orange));
                }
            }
            C9866r rVar = this.tabsAdapter;
            if (rVar != null) {
                num = Integer.valueOf(rVar.mo20184j());
            }
            int C0 = C15588c1.m25273C0(num);
            int i4 = this.initialTab;
            if (C0 > i4 && (toggleableSwipeViewPager = this.viewPager) != null) {
                toggleableSwipeViewPager.setCurrentItem(i4, false);
            }
            ToggleableSwipeViewPager toggleableSwipeViewPager3 = this.viewPager;
            if (toggleableSwipeViewPager3 != null) {
                toggleableSwipeViewPager3.addOnPageChangeListener(new C9741b(this));
            }
            ViewExtensions.m12869m(this.viewPager);
        }
    }

    private final boolean isNewNavigationEnabled() {
        return getConfigMap().mo21132b(C8592b.C8598f.f18876f);
    }

    /* access modifiers changed from: private */
    public final void loadTabs() {
        ViewExtensions.m12860d(this.loadingErrorView);
        ViewExtensions.m12860d(this.signInView);
        if (!getSession().mo45960e()) {
            showSignInView();
            return;
        }
        ViewExtensions.m12869m(this.loadingView);
        C9855j favoriteTabsRepository2 = getFavoriteTabsRepository();
        String str = this.userId;
        String valueOf = String.valueOf(C19383o.m32792b(getTabsWithIconsEligibility().f21838a.mo21136f(C8592b.C8593a.f18851a), "on"));
        boolean b = getRecommendationsOnFavoritesEligibility().f21801a.mo21132b(C8592b.C8593a.f18852b);
        boolean a = getUpdatesNativeEligibility().mo37551a();
        C19383o.m32797g(valueOf, "includeIcons");
        favoriteTabsRepository2.getClass();
        C8071s<C20145v<C19928a0>> a2 = favoriteTabsRepository2.f21757a.mo32911a("true", valueOf, b, str, a ? 1 : 0);
        C8840m mVar = new C8840m(favoriteTabsRepository2, 3);
        a2.getClass();
        C19211l lVar = new C19211l(new C19208j(a2, mVar), new C13094n(favoriteTabsRepository2, 3));
        getRxSchedulers().getClass();
        SingleSubscribeOn i = lVar.mo20660i(C13461f.m21235b());
        getRxSchedulers().getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new FavoritesTabsContainerFragment$loadTabs$1(this), new FavoritesTabsContainerFragment$loadTabs$2(this));
        C7091a aVar = this.disposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    /* access modifiers changed from: private */
    public final void onLoadingTabsError() {
        Button button;
        ViewExtensions.m12869m(this.loadingErrorView);
        View view = this.loadingErrorView;
        if (!(view == null || (button = (Button) view.findViewById(R.id.btn_retry_internet)) == null)) {
            ViewExtensions.m12866j(button, new FavoritesTabsContainerFragment$onLoadingTabsError$1(this));
        }
        ViewExtensions.m12860d(this.loadingView);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if ((r1 != null && r0 == r1.getCurrentItem()) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void processSelectedTabState(com.etsy.android.p327ui.favorites.C9876s r5) {
        /*
            r4 = this;
            int r0 = r4.getTabForState(r5)
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r1 = r4.viewPager
            if (r1 == 0) goto L_0x000d
            q2.a r1 = r1.getAdapter()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0022
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r1 = r4.viewPager
            if (r1 == 0) goto L_0x001e
            int r1 = r1.getCurrentItem()
            if (r0 != r1) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r3
        L_0x001f:
            if (r0 != 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            if (r2 == 0) goto L_0x0030
            com.etsy.android.uikit.view.ToggleableSwipeViewPager r0 = r4.viewPager
            if (r0 == 0) goto L_0x0030
            int r5 = r4.getTabForState(r5)
            r0.setCurrentItem(r5, r3)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.FavoritesTabsContainerFragment.processSelectedTabState(com.etsy.android.ui.favorites.s):void");
    }

    private final boolean showNameInTitle() {
        return C8914m.m17345c(requireActivity()) && C8885d0.m17324h(this.username);
    }

    private final void showSignInView() {
        SignInView signInView2 = this.signInView;
        if (signInView2 != null) {
            signInView2.setTitle((int) R.string.favorites_signin_heading);
            signInView2.setSubtitle((int) R.string.favorites_signin_body);
            signInView2.setImage(R.drawable.clg_icon_brand_socialimpact_v2);
            signInView2.setButtonText((int) R.string.tab_signin_button);
            signInView2.setButtonClickListener(new FavoritesTabsContainerFragment$showSignInView$1$1(this));
            ViewExtensions.m12869m(signInView2);
        }
    }

    private final void subscribeToTabStateChanges() {
        C19254a<C9876s> aVar = getFavoriteTabsSelectedState().f21763a;
        C19172m b = C0472h.m1241b(aVar, aVar);
        getRxSchedulers().getClass();
        ObservableSubscribeOn i = b.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), FavoritesTabsContainerFragment$subscribeToTabStateChanges$2.INSTANCE, new FavoritesTabsContainerFragment$subscribeToTabStateChanges$1(this), 2);
        C7091a aVar2 = this.disposables;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(f);
    }

    private final StateListDrawable toStateListDrawable(Icon icon) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (getContext() != null) {
            stateListDrawable.addState(new int[]{16842913}, getDrawable(icon.getActive(), R.attr.clg_color_text_primary));
            stateListDrawable.addState(new int[]{-16842913}, getDrawable(icon.getInactive(), R.attr.clg_color_text_tertiary));
        }
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    public final void trackSelectedTab(int i) {
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.TAB_NAME;
        HomeTab homeTab = this.tabData.get(i);
        C19383o.m32796f(homeTab, "tabData[selectedTab]");
        getAnalyticsContext().mo21333d(TAB_SELECTED_EVENT_NAME, C19294b0.m32561r0(new Pair(predefinedAnalyticsProperty, C19388s.m32863g0(homeTab))));
    }

    /* access modifiers changed from: private */
    public final void updateStateForTab(int i) {
        if (getUpdatesNativeEligibility().mo37551a()) {
            if (i == 0) {
                getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9880d.f21805a);
            } else if (i == 1) {
                getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9877a.f21802a);
            } else if (i == 2) {
                getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9879c.f21804a);
            } else if (i == 3) {
                getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9878b.f21803a);
            }
        } else if (i == 0) {
            getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9877a.f21802a);
        } else if (i == 1) {
            getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9879c.f21804a);
        } else if (i != 2) {
            getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9877a.f21802a);
        } else {
            getFavoriteTabsSelectedState().f21763a.onNext(C9876s.C9878b.f21803a);
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
        C9866r rVar = this.tabsAdapter;
        C11321e eVar = null;
        Fragment fragment = rVar != null ? rVar.f26553j : null;
        if (fragment instanceof C11321e) {
            eVar = (C11321e) fragment;
        }
        if (eVar != null) {
            return eVar.canScrollUp();
        }
        return true;
    }

    public boolean displayTabs() {
        return getSession().mo45960e();
    }

    public void focusMainScreen() {
        ToggleableSwipeViewPager toggleableSwipeViewPager;
        getUpdatesNativeEligibility().mo37551a();
        this.initialTab = 0;
        C9866r rVar = this.tabsAdapter;
        int C0 = C15588c1.m25273C0(rVar != null ? Integer.valueOf(rVar.mo20184j()) : null);
        int i = this.initialTab;
        if (C0 > i && (toggleableSwipeViewPager = this.viewPager) != null) {
            toggleableSwipeViewPager.setCurrentItem(i, false);
        }
    }

    public C9090a.C9091a getActionBarOverrides() {
        return !requireArguments().getBoolean("frag_force_add_current_stack", false) ? C9090a.C9091a.C9093b.f19991c : C9090a.C9091a.C9092a.f19990c;
    }

    public final C8709f getFavPerformanceTracker() {
        C8709f fVar = this.favPerformanceTracker;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("favPerformanceTracker");
        throw null;
    }

    public final C9855j getFavoriteTabsRepository() {
        C9855j jVar = this.favoriteTabsRepository;
        if (jVar != null) {
            return jVar;
        }
        C19383o.m32805o("favoriteTabsRepository");
        throw null;
    }

    public final C9859l getFavoriteTabsSelectedState() {
        C9859l lVar = this.favoriteTabsSelectedState;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("favoriteTabsSelectedState");
        throw null;
    }

    public String getFragmentTitleString() {
        if (isNewNavigationEnabled()) {
            String string = requireContext().getString(R.string.my_favorites_title);
            C19383o.m32796f(string, "requireContext().getStri…tring.my_favorites_title)");
            return string;
        } else if (showNameInTitle()) {
            String string2 = requireContext().getString(R.string.user_s_favorites, new Object[]{this.username});
            C19383o.m32796f(string2, "requireContext().getStri…er_s_favorites, username)");
            return string2;
        } else {
            String string3 = requireContext().getString(R.string.favorites);
            C19383o.m32796f(string3, "requireContext().getString(R.string.favorites)");
            return string3;
        }
    }

    public C8709f getPerformanceTracker() {
        return getFavPerformanceTracker();
    }

    public final C9875e getRecommendationsOnFavoritesEligibility() {
        C9875e eVar = this.recommendationsOnFavoritesEligibility;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("recommendationsOnFavoritesEligibility");
        throw null;
    }

    public final C11786n getResourceProvider() {
        C11786n nVar = this.resourceProvider;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("resourceProvider");
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

    public int getTab() {
        return R.id.menu_bottom_nav_favorites;
    }

    public final C9899x getTabsWithIconsEligibility() {
        C9899x xVar = this.tabsWithIconsEligibility;
        if (xVar != null) {
            return xVar;
        }
        C19383o.m32805o("tabsWithIconsEligibility");
        throw null;
    }

    public String getTrackingName() {
        return Collection.TYPE_FAVORITES;
    }

    public final C11541a0 getUpdatesNativeEligibility() {
        C11541a0 a0Var = this.updatesNativeEligibility;
        if (a0Var != null) {
            return a0Var;
        }
        C19383o.m32805o("updatesNativeEligibility");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.timeToFirstContent = getPerformanceTracker().mo21328a(TimedMetric.TIME_TO_FIRST_CONTENT);
        this.wasSignedIn = getSession().mo45960e();
        Bundle arguments = getArguments();
        String str = null;
        this.username = arguments != null ? arguments.getString(ResponseConstants.USERNAME) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("user_id");
        }
        this.userId = str;
        Bundle arguments3 = getArguments();
        int i = 0;
        if (arguments3 != null) {
            i = arguments3.getInt("type");
        } else {
            getUpdatesNativeEligibility().mo37551a();
        }
        this.initialTab = i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.favorites_viewpager, viewGroup, false);
        this.viewPager = (ToggleableSwipeViewPager) inflate.findViewById(R.id.view_pager);
        this.loadingView = inflate.findViewById(R.id.loading_view);
        this.loadingErrorView = inflate.findViewById(R.id.no_internet);
        this.signInView = (SignInView) inflate.findViewById(R.id.signin_view);
        subscribeToTabStateChanges();
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.viewPager = null;
        this.tabsAdapter = null;
        this.loadingView = null;
        this.loadingErrorView = null;
        this.signInView = null;
        this.disposables.mo19405d();
    }

    public void onResume() {
        super.onResume();
        if (this.tabData.isEmpty() && !this.wasSignedIn && getSession().mo45960e()) {
            loadTabs();
        }
    }

    public void onStart() {
        this.isStarted = true;
        loadTabs();
        super.onStart();
    }

    public void onStop() {
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.BaseActivity");
        ((BaseActivity) activity).getAppBarHelper().removeViewBelowAppBar(this.favoritesHeaderView, false);
        super.onStop();
        this.isStarted = false;
    }

    public void scrollFocusedScreenToTop() {
        C9866r rVar = this.tabsAdapter;
        Fragment fragment = rVar != null ? rVar.f26553j : null;
        if (fragment instanceof C11321e) {
            ((C11321e) fragment).scrollToTop();
        }
    }

    public final void setFavPerformanceTracker(C8709f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.favPerformanceTracker = fVar;
    }

    public final void setFavoriteTabsRepository(C9855j jVar) {
        C19383o.m32797g(jVar, "<set-?>");
        this.favoriteTabsRepository = jVar;
    }

    public final void setFavoriteTabsSelectedState(C9859l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.favoriteTabsSelectedState = lVar;
    }

    public final void setRecommendationsOnFavoritesEligibility(C9875e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.recommendationsOnFavoritesEligibility = eVar;
    }

    public final void setResourceProvider(C11786n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.resourceProvider = nVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setTabsWithIconsEligibility(C9899x xVar) {
        C19383o.m32797g(xVar, "<set-?>");
        this.tabsWithIconsEligibility = xVar;
    }

    public final void setUpdatesNativeEligibility(C11541a0 a0Var) {
        C19383o.m32797g(a0Var, "<set-?>");
        this.updatesNativeEligibility = a0Var;
    }

    public void updateSelectedPage(int i) {
        C9866r rVar = this.tabsAdapter;
        if ((rVar != null ? rVar.mo20184j() : 0) > i) {
            ToggleableSwipeViewPager toggleableSwipeViewPager = this.viewPager;
            if (toggleableSwipeViewPager != null) {
                toggleableSwipeViewPager.setCurrentItem(i, true);
            }
            trackSelectedTab(i);
        }
    }
}
