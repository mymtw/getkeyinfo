package com.etsy.android.p327ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayDataContract;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.C11819z;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.OnCartPageChangedListener;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.singleactivity.C11322f;
import com.etsy.android.push.CartRefreshDelegate;
import com.etsy.android.stylekit.views.CollageTabLayout;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.FragmentViewPager;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p357gf.C12792a;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.cart.CartWithSavedFragment */
public final class CartWithSavedFragment extends TrackingBaseFragment implements C13366a, C9731e0.C9733b, C9090a.C9096b, ViewPager.C3334i, CartRefreshDelegate.C8937a, C11819z, OnCartPageChangedListener, C11322f {
    public static final int $stable = 8;
    public static final String CART_IDS = "cart_ids";
    public static final String CHECKED_OUT_CART = "checked_out_cart";
    public static final String CHECKED_OUT_CART_GROUP_ID = "checked_out_cart_group_id";
    public static final String CHECKED_OUT_GPAY_DATA = "cart_gpay_data";
    public static final String CHECKED_OUT_IS_MSCO = "checkout_out_is_msco";
    public static final String CHECKED_OUT_PAYMENT_METHOD = "checked_out_payment_method";
    public static final C9230a Companion = new C9230a();
    public static final String KEY_COUNT_CART = "cart_count";
    public static final String KEY_COUNT_SAVED = "saved_count";
    public static final String LAST_ORDER_ID = "last_order_id";
    public static final String NAV_TO_SAVED = "nav_to_saved";
    public static final String PAYMENT_METHOD = "payment_method";
    public static final int POS_CART = 0;
    public static final int POS_SAVED = 1;
    public static final String SHOP_ID = "promotion_id";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private C9314j adapter;
    public CartBadgeCountRepo cartBadgeCountRepo;
    private int cartCount;
    public C9323l cartRefreshEventManager;
    public C9332q cartViewEligibility;
    private final C7091a compositeDisposable = new C7091a();
    private CartRefreshDelegate refreshDelegate;
    public C13461f rxSchedulers;
    private int savedCount;
    public C13265p session;
    private CollageTabLayout slidingTabLayout;
    private FragmentViewPager viewPager;

    /* renamed from: com.etsy.android.ui.cart.CartWithSavedFragment$a */
    public static final class C9230a {
    }

    /* renamed from: com.etsy.android.ui.cart.CartWithSavedFragment$b */
    public interface C9231b {
        void onCartPageSelected();
    }

    /* renamed from: com.etsy.android.ui.cart.CartWithSavedFragment$c */
    public /* synthetic */ class C9232c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20400a;

        static {
            int[] iArr = new int[OnCartPageChangedListener.Page.values().length];
            iArr[OnCartPageChangedListener.Page.CART.ordinal()] = 1;
            iArr[OnCartPageChangedListener.Page.SAVED.ordinal()] = 2;
            f20400a = iArr;
        }
    }

    private final void hideTabLayout() {
        ViewExtensions.m12860d(this.slidingTabLayout);
        FragmentViewPager fragmentViewPager = this.viewPager;
        if (fragmentViewPager != null) {
            fragmentViewPager.setSwipeEnabled(false);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((r3.getVisibility() == 0) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void processRefreshEvent(com.etsy.android.p327ui.cart.C9315k r3) {
        /*
            r2 = this;
            boolean r3 = r3 instanceof com.etsy.android.p327ui.cart.C9315k.C9322g
            r0 = 1
            if (r3 == 0) goto L_0x0014
            com.etsy.android.uikit.view.FragmentViewPager r3 = r2.viewPager
            if (r3 != 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r3.setCurrentItem(r0)
        L_0x000d:
            com.etsy.android.ui.cart.l r3 = r2.getCartRefreshEventManager()
            r3.mo31715a()
        L_0x0014:
            q9.p r3 = r2.getSession()
            boolean r3 = r3.mo45960e()
            if (r3 == 0) goto L_0x003f
            com.etsy.android.stylekit.views.CollageTabLayout r3 = r2.slidingTabLayout
            r1 = 0
            if (r3 == 0) goto L_0x002f
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x002b
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            if (r0 == 0) goto L_0x003f
            com.etsy.android.ui.cart.j r3 = r2.adapter
            if (r3 == 0) goto L_0x003c
            r0 = 2
            r3.f20587p = r0
            r3.mo20188p()
        L_0x003c:
            r2.showTabs()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.CartWithSavedFragment.processRefreshEvent(com.etsy.android.ui.cart.k):void");
    }

    private final void showTabLayout() {
        ViewExtensions.m12869m(this.slidingTabLayout);
        FragmentViewPager fragmentViewPager = this.viewPager;
        if (fragmentViewPager != null) {
            fragmentViewPager.setSwipeEnabled(true);
        }
    }

    private final void showTabs() {
        CollageTabLayout collageTabLayout;
        FragmentViewPager fragmentViewPager = this.viewPager;
        if (!(fragmentViewPager == null || (collageTabLayout = this.slidingTabLayout) == null)) {
            collageTabLayout.setupWithViewPager(fragmentViewPager);
        }
        showTabLayout();
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
        C9314j jVar = this.adapter;
        C11321e eVar = null;
        Fragment fragment = jVar != null ? jVar.f26553j : null;
        if (fragment instanceof C11321e) {
            eVar = (C11321e) fragment;
        }
        if (eVar != null) {
            return eVar.canScrollUp();
        }
        return true;
    }

    public boolean displayTabs() {
        return true;
    }

    public void focusMainScreen() {
        FragmentViewPager fragmentViewPager;
        FragmentViewPager fragmentViewPager2 = this.viewPager;
        if (fragmentViewPager2 != null) {
            fragmentViewPager2.setCurrentItem(0);
        }
        C9314j jVar = this.adapter;
        if ((jVar != null ? jVar.f20587p : 0) > 0 && (fragmentViewPager = this.viewPager) != null) {
            fragmentViewPager.setCurrentItem(0, false);
        }
    }

    public final CartBadgeCountRepo getCartBadgeCountRepo() {
        CartBadgeCountRepo cartBadgeCountRepo2 = this.cartBadgeCountRepo;
        if (cartBadgeCountRepo2 != null) {
            return cartBadgeCountRepo2;
        }
        C19383o.m32805o("cartBadgeCountRepo");
        throw null;
    }

    public final C9323l getCartRefreshEventManager() {
        C9323l lVar = this.cartRefreshEventManager;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("cartRefreshEventManager");
        throw null;
    }

    public final C9332q getCartViewEligibility() {
        C9332q qVar = this.cartViewEligibility;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("cartViewEligibility");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.title_cart;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
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
        return R.id.menu_bottom_nav_cart;
    }

    public void onCartCountsUpdated(int i, int i2, boolean z, int i3) {
        CollageTabLayout collageTabLayout = this.slidingTabLayout;
        if (collageTabLayout != null && collageTabLayout.getTabCount() > 0) {
            String string = getString(R.string.tab_cart);
            C19383o.m32796f(string, "getString(R.string.tab_cart)");
            collageTabLayout.setTabText(0, string);
            collageTabLayout.setTabBadgeCount(0, i);
            if (getSession().mo45960e()) {
                String string2 = getString(R.string.tab_saved);
                C19383o.m32796f(string2, "getString(R.string.tab_saved)");
                collageTabLayout.setTabText(1, string2);
                collageTabLayout.setTabBadgeCount(1, i2);
            }
        }
        this.cartCount = i;
        this.savedCount = i2;
        showTabLayout();
    }

    public void onCartPageChanged(OnCartPageChangedListener.Page page) {
        FragmentViewPager fragmentViewPager;
        C19383o.m32797g(page, "page");
        int i = C9232c.f20400a[page.ordinal()];
        if (i == 1) {
            FragmentViewPager fragmentViewPager2 = this.viewPager;
            if (fragmentViewPager2 != null) {
                fragmentViewPager2.setCurrentItem(0);
            }
        } else if (i == 2 && (fragmentViewPager = this.viewPager) != null) {
            fragmentViewPager.setCurrentItem(1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.refreshDelegate = new CartRefreshDelegate(getContext(), this, getCartBadgeCountRepo());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EtsyId etsyId;
        GooglePayDataContract googlePayDataContract;
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_cart_with_saved, viewGroup, false);
        FragmentViewPager fragmentViewPager = (FragmentViewPager) inflate.findViewById(R.id.cart_view_pager);
        this.viewPager = fragmentViewPager;
        if (fragmentViewPager != null) {
            fragmentViewPager.setOffscreenPageLimit(2);
        }
        FragmentViewPager fragmentViewPager2 = this.viewPager;
        if (fragmentViewPager2 != null) {
            fragmentViewPager2.addOnPageChangeListener(this);
        }
        ViewExtensions.m12869m(this.viewPager);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey(CHECKED_OUT_CART) || !arguments.containsKey(LAST_ORDER_ID)) {
            googlePayDataContract = null;
            etsyId = null;
        } else {
            Serializable serializable = arguments.getSerializable(CHECKED_OUT_CART);
            GooglePayDataContract googlePayDataContract2 = serializable instanceof GooglePayDataContract ? (GooglePayDataContract) serializable : null;
            Serializable serializable2 = arguments.getSerializable(LAST_ORDER_ID);
            googlePayDataContract = googlePayDataContract2;
            etsyId = serializable2 instanceof EtsyId ? (EtsyId) serializable2 : null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        C19383o.m32796f(childFragmentManager, "childFragmentManager");
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C13265p session2 = getSession();
        C9332q cartViewEligibility2 = getCartViewEligibility();
        C19285c<String> cVar = Referrer.f19131c;
        C9314j jVar = new C9314j(childFragmentManager, requireActivity, session2, googlePayDataContract, etsyId, cartViewEligibility2, Referrer.C8712a.m17143c(arguments));
        this.adapter = jVar;
        FragmentViewPager fragmentViewPager3 = this.viewPager;
        if (fragmentViewPager3 != null) {
            fragmentViewPager3.setAdapter(jVar);
        }
        if (bundle != null) {
            this.cartCount = bundle.getInt("cart_count");
            this.savedCount = bundle.getInt("saved_count");
        }
        C19254a<C9315k> aVar = getCartRefreshEventManager().f20595a;
        getRxSchedulers().getClass();
        ObservableSubscribeOn i = aVar.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        this.compositeDisposable.mo19403b(SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), (C19857l) null, new CartWithSavedFragment$onCreateView$updatesDisposable$1(this), 3));
        return inflate;
    }

    public void onDestroyView() {
        this.compositeDisposable.mo19405d();
        FragmentViewPager fragmentViewPager = this.viewPager;
        if (fragmentViewPager != null) {
            fragmentViewPager.removeOnPageChangeListener(this);
        }
        this.adapter = null;
        this.viewPager = null;
        this.slidingTabLayout = null;
        super.onDestroyView();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        Fragment fragment;
        C9314j jVar = this.adapter;
        if (jVar != null) {
            FragmentViewPager fragmentViewPager = this.viewPager;
            C19383o.m32794d(fragmentViewPager);
            FragmentViewPager.C11916a aVar = FragmentViewPager.Companion;
            int id = fragmentViewPager.getId();
            long v = jVar.mo10632v(i);
            aVar.getClass();
            fragment = jVar.f20582k.mo10353C("android:switcher:" + id + ':' + v);
            if (fragment == null) {
                fragment = jVar.mo10631u(i);
            }
        } else {
            fragment = null;
        }
        if (fragment != null && (fragment instanceof C9231b)) {
            ((C9231b) fragment).onCartPageSelected();
        }
    }

    public void onPause() {
        super.onPause();
        CartRefreshDelegate cartRefreshDelegate = this.refreshDelegate;
        if (cartRefreshDelegate != null) {
            cartRefreshDelegate.onPause();
        } else {
            C19383o.m32805o("refreshDelegate");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        CartRefreshDelegate cartRefreshDelegate = this.refreshDelegate;
        if (cartRefreshDelegate != null) {
            cartRefreshDelegate.onResume();
        } else {
            C19383o.m32805o("refreshDelegate");
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("cart_count", this.cartCount);
        bundle.putInt("saved_count", this.savedCount);
    }

    public void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        C19383o.m32795e(activity, "null cannot be cast to non-null type com.etsy.android.uikit.AppBarHelperAssistant");
        CollageTabLayout tabLayout = ((C12792a) activity).getTabLayout();
        this.slidingTabLayout = tabLayout;
        if (tabLayout != null) {
            tabLayout.setTabMode(1);
        }
        hideTabLayout();
        Bundle arguments = getArguments();
        if (getSession().mo45960e()) {
            showTabs();
        }
        if (arguments != null) {
            if (arguments.getBoolean(NAV_TO_SAVED, false)) {
                FragmentViewPager fragmentViewPager = this.viewPager;
                if (fragmentViewPager != null) {
                    fragmentViewPager.setCurrentItem(1);
                }
                arguments.remove(NAV_TO_SAVED);
            } else if (arguments.containsKey(ResponseConstants.PAGE_LINK) && C19383o.m32792b(arguments.getString(ResponseConstants.PAGE_LINK), CartWithSavedKey.SAVED_TAB)) {
                FragmentViewPager fragmentViewPager2 = this.viewPager;
                if (fragmentViewPager2 != null) {
                    fragmentViewPager2.setCurrentItem(1);
                }
                arguments.remove(ResponseConstants.PAGE_LINK);
            }
        }
        onCartCountsUpdated(this.cartCount, this.savedCount, false, 0);
    }

    public void scrollFocusedScreenToTop() {
        C9314j jVar = this.adapter;
        Fragment fragment = jVar != null ? jVar.f26553j : null;
        if (fragment instanceof C11321e) {
            ((C11321e) fragment).scrollToTop();
        }
    }

    public final void setCartBadgeCountRepo(CartBadgeCountRepo cartBadgeCountRepo2) {
        C19383o.m32797g(cartBadgeCountRepo2, "<set-?>");
        this.cartBadgeCountRepo = cartBadgeCountRepo2;
    }

    public final void setCartRefreshEventManager(C9323l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.cartRefreshEventManager = lVar;
    }

    public final void setCartViewEligibility(C9332q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.cartViewEligibility = qVar;
    }

    public final void setRxSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.rxSchedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public C9090a.C9091a.C9093b getActionBarOverrides() {
        return C9090a.C9091a.C9093b.f19991c;
    }
}
