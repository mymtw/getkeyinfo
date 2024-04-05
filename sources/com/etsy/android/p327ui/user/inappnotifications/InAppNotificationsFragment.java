package com.etsy.android.p327ui.user.inappnotifications;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationAbandonedCartOffer;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCoupon;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationThankYouCouponReminder;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS;
import com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.C9090a;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.C9293d;
import com.etsy.android.p327ui.cart.C9296f;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.cart.C9332q;
import com.etsy.android.p327ui.conversation.details.ccm.C9498g;
import com.etsy.android.p327ui.favorites.C9859l;
import com.etsy.android.p327ui.favorites.C9876s;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.CartWithSavedKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.LandingPageKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ShopHomeKey;
import com.etsy.android.p327ui.search.p330v2.C11027h;
import com.etsy.android.p327ui.shop.ShopHomeConfig;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.user.inappnotifications.C11544b0;
import com.etsy.android.p327ui.user.inappnotifications.C11564q;
import com.etsy.android.p327ui.util.C11782j;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.shophome.C8993g;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19324q;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19543e0;
import p119g9.C6897b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19150c;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.internal.operators.observable.C19178p;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p248tp.C8061n;
import p356ge.C12788a;
import p356ge.C12790b;
import p400mf.C13074b;
import p425q9.C13250b;
import p425q9.C13265p;
import p440s9.C13366a;
import p456ua.C13461f;
import p464va.C13547b;
import p483xe.C13880a;
import p483xe.C13881b;
import p486y9.C13888d;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.inappnotifications.InAppNotificationsFragment */
public final class InAppNotificationsFragment extends BaseRecyclerViewListFragment<InAppNotification> implements C11559l, C13366a, C9731e0.C9733b, C9090a.C9096b, C11321e {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C9293d cartCouponCache;
    public C9332q cartEligibility;
    public C9323l cartRefreshEventManager;
    public C8618c configMap;
    public C13888d currentLocale;
    private C7091a disposables = new C7091a();
    public UpdatesEligibility eligibility;
    public C9859l favoriteTabsSelectedState;
    public C11553g presenter;
    public C8951c qualtricsWrapper;
    public C13461f schedulers;
    public C13265p session;
    public C11541a0 updatesNativeEligibility;
    public C11562o viewmodel;

    /* access modifiers changed from: private */
    public final View getEmptyView(LayoutInflater layoutInflater) {
        if (!getSession().mo45960e()) {
            View inflate = layoutInflater.inflate(R.layout.fragment_updates_sign_in, (ViewGroup) null);
            Button button = (Button) inflate.findViewById(R.id.signin_button);
            C19383o.m32796f(button, "view.signin_button");
            ViewExtensions.m12866j(button, new InAppNotificationsFragment$getEmptyView$1(this));
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.partial_in_app_notifications_empty, (ViewGroup) null);
        C19383o.m32796f(inflate2, "layoutInflater.inflate(R…otifications_empty, null)");
        return inflate2;
    }

    /* access modifiers changed from: private */
    public final void handleClick(C11564q qVar) {
        List<InAppNotification> list;
        if (qVar instanceof C11564q.C11571g) {
            navToListing(((C11564q.C11571g) qVar).f25634a);
        } else if (qVar instanceof C11564q.C11572h) {
            C11564q.C11572h hVar = (C11564q.C11572h) qVar;
            navToShop(hVar.f25635a, hVar.f25636b);
        } else {
            boolean z = false;
            if (qVar instanceof C11564q.C11568d) {
                C11553g presenter2 = getPresenter();
                C11564q.C11568d dVar = (C11564q.C11568d) qVar;
                IANListingCard iANListingCard = dVar.f25626a;
                String str = dVar.f25628c;
                Long l = dVar.f25629d;
                presenter2.getClass();
                C19383o.m32797g(iANListingCard, ResponseConstants.LISTING);
                C19383o.m32797g(str, "feedId");
                boolean z2 = !iANListingCard.isInCollections() && !iANListingCard.isFav();
                if (iANListingCard.isFav() && !iANListingCard.isInCollections()) {
                    z = true;
                }
                FragmentActivity activity = presenter2.f25580a.getActivity();
                if (!(activity instanceof C6897b)) {
                    return;
                }
                if (z2 || z) {
                    ((C6897b) activity).getFavoriteHandler().mo19010a(iANListingCard, activity, new C11551e(iANListingCard, presenter2, str, l));
                } else {
                    ((C6897b) activity).getFavoriteHandler().mo19011b(iANListingCard, activity);
                }
            } else if (qVar instanceof C11564q.C11569e) {
                C11562o viewmodel2 = getViewmodel();
                C11564q.C11569e eVar = (C11564q.C11569e) qVar;
                long j = eVar.f25630a;
                String str2 = eVar.f25631b;
                boolean z3 = eVar.f25632c;
                viewmodel2.getClass();
                C19383o.m32797g(str2, "shopName");
                ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(viewmodel2.f25609c, C0072d.m199f(viewmodel2.f25609c, viewmodel2.f25611e.mo38047a(new C11782j(new EtsyId(j), str2, z3), viewmodel2.f25608b))), IANViewModel$favoriteShop$1.INSTANCE, IANViewModel$favoriteShop$2.INSTANCE);
                C7091a aVar = viewmodel2.f25613g;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            } else if (qVar instanceof C11564q.C11566b) {
                navToCart();
            } else if (qVar instanceof C11564q.C11567c) {
                navToCartWithPromo(((C11564q.C11567c) qVar).f25625a);
            } else if (qVar instanceof C11564q.C11570f) {
                navToLandingPage(((C11564q.C11570f) qVar).f25633a);
            } else if (qVar instanceof C11564q.C11565a) {
                C11553g presenter3 = getPresenter();
                C11564q.C11565a aVar2 = (C11564q.C11565a) qVar;
                C13547b bVar = aVar2.f25624b;
                presenter3.getClass();
                C19383o.m32797g(bVar, "performActionSpec");
                presenter3.f25586g.mo19403b(SubscribersKt.m32500e(C0391c.m1056b(presenter3.f25583d, C0326j.m860e(presenter3.f25583d, presenter3.f25585f.mo46215b(bVar))), IANPresenter$dismiss$1.INSTANCE, IANPresenter$dismiss$2.INSTANCE));
                C11562o viewmodel3 = getViewmodel();
                int i = aVar2.f25623a;
                C11554h hVar2 = viewmodel3.f25610d;
                List<InAppNotification> list2 = hVar2.f25590b;
                int size = list2 != null ? list2.size() : 0;
                if (C19543e0.m33306Y(hVar2.f25590b) && i < size && (list = hVar2.f25590b) != null) {
                    InAppNotification remove = list.remove(i);
                }
                this.adapter.getItems().remove(aVar2.f25623a);
                this.adapter.notifyItemRemoved(0);
                this.adapter.notifyItemChanged(0);
            }
        }
    }

    private final void navToCart() {
        C12788a.m20424c(getActivity(), new CartWithSavedKey(C19421p.m32935c0(getActivity()), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
    }

    private final void navToCartWithPromo(C9296f.C9301e eVar) {
        C9293d cartCouponCache2 = getCartCouponCache();
        cartCouponCache2.getClass();
        C19383o.m32797g(eVar, "coupon");
        cartCouponCache2.f20508a.add(eVar);
        getCartRefreshEventManager().f20595a.onNext(C9315k.C9321f.f20593a);
        C12788a.m20424c(getActivity(), new CartWithSavedKey(C19421p.m32935c0(getActivity()), (String) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
    }

    private final void navToLandingPage(LandingPageLink landingPageLink) {
        if (C19383o.m32792b(landingPageLink.getPageType(), "shops")) {
            C12788a.m20424c(getActivity(), new LandingPageKey(C19421p.m32935c0(getActivity()), landingPageLink, (Bundle) null, 4, (DefaultConstructorMarker) null));
        }
    }

    private final void navToListing(ListingLike listingLike) {
        FragmentActivity activity = getActivity();
        String c0 = C19421p.m32935c0(getActivity());
        EtsyId listingId = listingLike.getListingId();
        C19383o.m32796f(listingId, "listing.listingId");
        C12788a.m20424c(activity, new ListingKey(c0, listingId, false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }

    private final void navToSavedForLater() {
        getCartRefreshEventManager().f20595a.onNext(C9315k.C9322g.f20594a);
        C12790b.m20430b(this, new CartWithSavedKey(C12790b.m20432d(this), CartWithSavedKey.SAVED_TAB, (Bundle) null, 4, (DefaultConstructorMarker) null));
    }

    private final void navToShop(long j, String str) {
        C12790b.m20430b(this, new ShopHomeKey(C12790b.m20432d(this), new EtsyId(j), (ShopHomeConfig) null, (Map) null, (String) null, (String) null, (EtsyId) null, false, str, (Bundle) null, 764, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: onStart$lambda-0  reason: not valid java name */
    public static final void m35063onStart$lambda0(InAppNotificationsFragment inAppNotificationsFragment, C11544b0 b0Var) {
        C19383o.m32797g(inAppNotificationsFragment, "this$0");
        if (b0Var instanceof C11544b0.C11546b) {
            inAppNotificationsFragment.adapter.clear();
            C11553g presenter2 = inAppNotificationsFragment.getPresenter();
            List<InAppNotification> list = ((C11544b0.C11546b) b0Var).f25543a;
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification>");
            List b = C19389t.m32908b(list);
            presenter2.getClass();
            C19383o.m32797g(b, "inAppNotificationList");
            presenter2.f25580a.refreshComplete();
            presenter2.f25580a.getRecyclerView().addOnLayoutChangeListener(new IANPresenter$handleUpdatesFeed$$inlined$doOnNextLayout$1(presenter2));
            C19324q.m32631M0(UpdatesFeedParserKt$removeUnknown$1.INSTANCE, b);
            if (b.isEmpty()) {
                presenter2.f25580a.showEmptyView();
            } else {
                presenter2.f25580a.addNotificationsToAdapter(b);
                presenter2.f25580a.showListView();
                presenter2.f25584e.f25045i.onNext(C19394m.f43287a);
            }
            inAppNotificationsFragment.adapter.notifyDataSetChanged();
        } else if (b0Var instanceof C11544b0.C11545a) {
            inAppNotificationsFragment.refreshComplete();
            inAppNotificationsFragment.showErrorView();
        } else if (!(b0Var instanceof C11544b0.C11547c)) {
        } else {
            if (inAppNotificationsFragment.isEmpty()) {
                inAppNotificationsFragment.loadContent();
            } else {
                inAppNotificationsFragment.showListView();
            }
        }
    }

    private final void setupSigninListener() {
        this.disposables = new C7091a();
        C19150c cVar = new C19150c(getSession().mo45957b());
        getSchedulers().getClass();
        LambdaObserver f = SubscribersKt.m32501f(cVar.mo20635e(C13461f.m21236c()), (C19857l) null, new InAppNotificationsFragment$setupSigninListener$1(this), 3);
        C7091a aVar = this.disposables;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
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

    public void addNotificationsToAdapter(List<? extends InAppNotification> list) {
        C19383o.m32797g(list, "inAppNotificationList");
        this.adapter.addItems(list);
    }

    public void addOnScrollStateListener(RecyclerView.C3108s sVar) {
        C19383o.m32797g(sVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.recyclerView.addOnScrollListener(sVar);
    }

    public boolean canScrollUp() {
        return true;
    }

    public void clearOnScrollListener() {
        this.recyclerView.clearOnScrollListeners();
    }

    public C9090a.C9091a getActionBarOverrides() {
        return C9090a.C9091a.C9093b.f19991c;
    }

    public final C9293d getCartCouponCache() {
        C9293d dVar = this.cartCouponCache;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("cartCouponCache");
        throw null;
    }

    public final C9332q getCartEligibility() {
        C9332q qVar = this.cartEligibility;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("cartEligibility");
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

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
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

    public final UpdatesEligibility getEligibility() {
        UpdatesEligibility updatesEligibility = this.eligibility;
        if (updatesEligibility != null) {
            return updatesEligibility;
        }
        C19383o.m32805o("eligibility");
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

    public int getFragmentTitle() {
        return R.string.nav_updates;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C11553g getPresenter() {
        C11553g gVar = this.presenter;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public final C8951c getQualtricsWrapper() {
        C8951c cVar = this.qualtricsWrapper;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("qualtricsWrapper");
        throw null;
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        return recyclerView;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
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
        return getUpdatesNativeEligibility().mo37551a() ? R.id.menu_bottom_nav_favorites : R.id.menu_bottom_nav_updates;
    }

    public String getTrackingName() {
        return "in_app_notifications";
    }

    public final C11541a0 getUpdatesNativeEligibility() {
        C11541a0 a0Var = this.updatesNativeEligibility;
        if (a0Var != null) {
            return a0Var;
        }
        C19383o.m32805o("updatesNativeEligibility");
        throw null;
    }

    public final C11562o getViewmodel() {
        C11562o oVar = this.viewmodel;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("viewmodel");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        C8703p analyticsContext = getAnalyticsContext();
        C19383o.m32796f(analyticsContext, "analyticsContext");
        this.adapter = new C11542b(activity, analyticsContext, new InAppNotificationsFragment$onCreate$1(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        C8951c qualtricsWrapper2 = getQualtricsWrapper();
        String locale = getCurrentLocale().mo46719c().toString();
        C19383o.m32796f(locale, "currentLocale.getSystemLocale().toString()");
        qualtricsWrapper2.mo30561a(C17782b.m29865e0(new C8952d.C8961i(locale, 0), C8952d.C8956d.f19754c));
        getQualtricsWrapper().mo30562b(new InAppNotificationsFragment$onCreateView$1(this));
        setEmptyView(getEmptyView(layoutInflater));
        RecyclerView.C3094l itemAnimator = this.recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f7067f = 0;
        }
        return onCreateView;
    }

    public void onLoadContent() {
        C8061n nVar;
        C11562o viewmodel2 = getViewmodel();
        C11554h hVar = viewmodel2.f25610d;
        List<InAppNotification> list = hVar.f25590b;
        if (list == null) {
            C8061n<UpdatesFeed> a = hVar.f25589a.mo37616a(true);
            C13250b bVar = new C13250b(6);
            a.getClass();
            nVar = new C19179q(new C19179q(a, bVar), new C11027h(hVar, 3));
        } else {
            nVar = new C19178p(list);
        }
        viewmodel2.f25609c.getClass();
        ObservableSubscribeOn i = nVar.mo20639i(C13461f.m21235b());
        viewmodel2.f25609c.getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new IANViewModel$loadData$1(viewmodel2), new IANViewModel$loadData$2(viewmodel2), 2);
        C7091a aVar = viewmodel2.f25613g;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    public void onPause() {
        super.onPause();
        C11553g presenter2 = getPresenter();
        C8672b bVar = presenter2.f25582c;
        Pair[] pairArr = new Pair[2];
        PredefinedAnalyticsProperty predefinedAnalyticsProperty = PredefinedAnalyticsProperty.NOTIFICATION_FEED_ID;
        InAppNotification inAppNotification = presenter2.f25588i;
        pairArr[0] = new Pair(predefinedAnalyticsProperty, inAppNotification instanceof InAppNotificationListRec ? ((InAppNotificationListRec) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationNFYFS ? ((InAppNotificationNFYFS) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationYFNOS ? ((InAppNotificationYFNOS) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationShopSale ? ((InAppNotificationShopSale) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationCLOS ? ((InAppNotificationCLOS) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationFBIS ? ((InAppNotificationFBIS) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationRFC ? ((InAppNotificationRFC) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationOneFavoriteLeft ? ((InAppNotificationOneFavoriteLeft) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationFavoriteShopsPromo ? ((InAppNotificationFavoriteShopsPromo) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationThankYouCoupon ? ((InAppNotificationThankYouCoupon) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationThankYouCouponReminder ? ((InAppNotificationThankYouCouponReminder) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationRecommendedShopsStandard ? ((InAppNotificationRecommendedShopsStandard) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationRecommendedShopsHighlighted ? ((InAppNotificationRecommendedShopsHighlighted) inAppNotification).getFeedId() : inAppNotification instanceof InAppNotificationAbandonedCartOffer ? ((InAppNotificationAbandonedCartOffer) inAppNotification).getFeedId() : "");
        PredefinedAnalyticsProperty predefinedAnalyticsProperty2 = PredefinedAnalyticsProperty.NOTIFICATION_FEED_INDEX;
        InAppNotification inAppNotification2 = presenter2.f25588i;
        pairArr[1] = new Pair(predefinedAnalyticsProperty2, inAppNotification2 instanceof InAppNotificationListRec ? ((InAppNotificationListRec) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationNFYFS ? ((InAppNotificationNFYFS) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationYFNOS ? ((InAppNotificationYFNOS) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationShopSale ? ((InAppNotificationShopSale) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationCLOS ? ((InAppNotificationCLOS) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationFBIS ? ((InAppNotificationFBIS) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationRFC ? ((InAppNotificationRFC) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationOneFavoriteLeft ? ((InAppNotificationOneFavoriteLeft) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationFavoriteShopsPromo ? ((InAppNotificationFavoriteShopsPromo) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationThankYouCoupon ? ((InAppNotificationThankYouCoupon) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationThankYouCouponReminder ? ((InAppNotificationThankYouCouponReminder) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationRecommendedShopsStandard ? ((InAppNotificationRecommendedShopsStandard) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationRecommendedShopsHighlighted ? ((InAppNotificationRecommendedShopsHighlighted) inAppNotification2).getFeedIndex() : inAppNotification2 instanceof InAppNotificationAbandonedCartOffer ? ((InAppNotificationAbandonedCartOffer) inAppNotification2).getFeedIndex() : Long.valueOf((long) presenter2.f25587h));
        bVar.mo21333d("notification_last_seen", C19294b0.m32562s0(pairArr));
    }

    public void onResume() {
        super.onResume();
        getViewmodel().getClass();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void onStart() {
        super.onStart();
        setupSigninListener();
        getViewmodel().f25614h.observe(getViewLifecycleOwner(), new C9498g(this, 4));
        if (getUpdatesNativeEligibility().mo37551a()) {
            C11562o viewmodel2 = getViewmodel();
            C19254a<C9876s> aVar = viewmodel2.f25612f.f21763a;
            C19172m b = C0472h.m1241b(aVar, aVar);
            viewmodel2.f25609c.getClass();
            LambdaObserver f = SubscribersKt.m32501f(b.mo20639i(C13461f.m21235b()), IANViewModel$monitorFavoritesTabState$1.INSTANCE, new IANViewModel$monitorFavoritesTabState$2(viewmodel2), 2);
            C7091a aVar2 = viewmodel2.f25613g;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(f);
        } else if (!getSession().mo45960e()) {
            showEmptyView();
        } else if (isEmpty()) {
            loadContent();
        } else {
            showListView();
        }
    }

    public void onStop() {
        super.onStop();
        this.disposables.mo19405d();
        setLoading(false);
        C11553g presenter2 = getPresenter();
        presenter2.f25586g.mo19405d();
        presenter2.mo37562b(presenter2.f25580a.getRecyclerView());
        presenter2.f25580a.clearOnScrollListener();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        C11553g presenter2 = getPresenter();
        new HeartMonitor(presenter2.f25580a.getLifecycle(), new C11550d(presenter2));
        presenter2.f25587h = 0;
        presenter2.f25580a.addOnScrollStateListener(new C11552f(presenter2));
        presenter2.f25580a.getRecyclerView().addOnLayoutChangeListener(new IANPresenter$attach$$inlined$doOnNextLayout$1(presenter2));
    }

    public void refreshComplete() {
        this.swipeRefreshLayout.setRefreshing(false);
        setLoading(false);
        setRefreshing(false);
    }

    public void refreshContent() {
        this.adapter.clear();
        setRefreshing(true);
        getPresenter().f25587h = 0;
        C11562o viewmodel2 = getViewmodel();
        C11554h hVar = viewmodel2.f25610d;
        hVar.f25590b = null;
        C8061n<UpdatesFeed> a = hVar.f25589a.mo37616a(true);
        C8993g gVar = new C8993g(2);
        a.getClass();
        C19179q qVar = new C19179q(a, gVar);
        viewmodel2.f25609c.getClass();
        ObservableSubscribeOn i = qVar.mo20639i(C13461f.m21235b());
        viewmodel2.f25609c.getClass();
        LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new IANViewModel$refreshData$1(viewmodel2), new IANViewModel$refreshData$2(viewmodel2), 2);
        C7091a aVar = viewmodel2.f25613g;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    public void scrollToTop() {
        this.recyclerView.smoothScrollToPosition(0);
    }

    public final void setCartCouponCache(C9293d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.cartCouponCache = dVar;
    }

    public final void setCartEligibility(C9332q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.cartEligibility = qVar;
    }

    public final void setCartRefreshEventManager(C9323l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.cartRefreshEventManager = lVar;
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setEligibility(UpdatesEligibility updatesEligibility) {
        C19383o.m32797g(updatesEligibility, "<set-?>");
        this.eligibility = updatesEligibility;
    }

    public final void setFavoriteTabsSelectedState(C9859l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.favoriteTabsSelectedState = lVar;
    }

    public final void setPresenter(C11553g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.presenter = gVar;
    }

    public final void setQualtricsWrapper(C8951c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.qualtricsWrapper = cVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setUpdatesNativeEligibility(C11541a0 a0Var) {
        C19383o.m32797g(a0Var, "<set-?>");
        this.updatesNativeEligibility = a0Var;
    }

    public final void setViewmodel(C11562o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.viewmodel = oVar;
    }

    public void updateViews() {
        this.adapter.notifyDataSetChanged();
    }

    public void updateViews(C13074b bVar) {
        IANShopCard iANShopCard;
        IANListingCard iANListingCard;
        IANListingCard iANListingCard2;
        C19383o.m32797g(bVar, "update");
        int i = 0;
        if (bVar instanceof C13074b.C13076b) {
            C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
            List<T> items = this.adapter.getItems();
            C19383o.m32796f(items, "adapter.items");
            RecyclerView recyclerView = this.recyclerView;
            int size = items.size();
            while (i < size) {
                InAppNotification inAppNotification = (InAppNotification) items.get(i);
                RecyclerView.C3084b0 findViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(i) : null;
                if (inAppNotification instanceof InAppNotificationRFC) {
                    iANListingCard2 = ((InAppNotificationRFC) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationAbandonedCartOffer) {
                    iANListingCard2 = ((InAppNotificationAbandonedCartOffer) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationNFYFS) {
                    iANListingCard2 = ((InAppNotificationNFYFS) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationYFNOS) {
                    iANListingCard2 = ((InAppNotificationYFNOS) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationCLOS) {
                    iANListingCard2 = ((InAppNotificationCLOS) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationFBIS) {
                    iANListingCard2 = ((InAppNotificationFBIS) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationShopSale) {
                    iANListingCard2 = ((InAppNotificationShopSale) inAppNotification).findListing(bVar2.f28749a);
                } else if (inAppNotification instanceof InAppNotificationOneFavoriteLeft) {
                    iANListingCard2 = ((InAppNotificationOneFavoriteLeft) inAppNotification).findListing(bVar2.f28749a);
                } else {
                    iANListingCard2 = inAppNotification instanceof InAppNotificationListRec ? ((InAppNotificationListRec) inAppNotification).findListing(bVar2.f28749a) : null;
                }
                if (iANListingCard2 != null) {
                    iANListingCard2.setFav(bVar2.f28750b);
                    if (findViewHolderForAdapterPosition instanceof C13880a) {
                        ((C13880a) findViewHolderForAdapterPosition).mo37492c(iANListingCard2);
                    }
                }
                i++;
            }
        } else if (bVar instanceof C13074b.C13075a) {
            C13074b.C13075a aVar = (C13074b.C13075a) bVar;
            List<T> items2 = this.adapter.getItems();
            C19383o.m32796f(items2, "adapter.items");
            RecyclerView recyclerView2 = this.recyclerView;
            int size2 = items2.size();
            while (i < size2) {
                InAppNotification inAppNotification2 = (InAppNotification) items2.get(i);
                RecyclerView.C3084b0 findViewHolderForAdapterPosition2 = recyclerView2 != null ? recyclerView2.findViewHolderForAdapterPosition(i) : null;
                if (inAppNotification2 instanceof InAppNotificationRFC) {
                    iANListingCard = ((InAppNotificationRFC) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationAbandonedCartOffer) {
                    iANListingCard = ((InAppNotificationAbandonedCartOffer) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationNFYFS) {
                    iANListingCard = ((InAppNotificationNFYFS) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationYFNOS) {
                    iANListingCard = ((InAppNotificationYFNOS) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationCLOS) {
                    iANListingCard = ((InAppNotificationCLOS) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationFBIS) {
                    iANListingCard = ((InAppNotificationFBIS) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationShopSale) {
                    iANListingCard = ((InAppNotificationShopSale) inAppNotification2).findListing(aVar.f28745a);
                } else if (inAppNotification2 instanceof InAppNotificationOneFavoriteLeft) {
                    iANListingCard = ((InAppNotificationOneFavoriteLeft) inAppNotification2).findListing(aVar.f28745a);
                } else {
                    iANListingCard = inAppNotification2 instanceof InAppNotificationListRec ? ((InAppNotificationListRec) inAppNotification2).findListing(aVar.f28745a) : null;
                }
                if (iANListingCard != null) {
                    iANListingCard.setInCollections(aVar.f28746b);
                    if (findViewHolderForAdapterPosition2 instanceof C13880a) {
                        ((C13880a) findViewHolderForAdapterPosition2).mo37492c(iANListingCard);
                    }
                }
                i++;
            }
        } else if (bVar instanceof C13074b.C13077c) {
            C13074b.C13077c cVar = (C13074b.C13077c) bVar;
            List<T> items3 = this.adapter.getItems();
            C19383o.m32796f(items3, "adapter.items");
            RecyclerView recyclerView3 = this.recyclerView;
            int size3 = items3.size();
            while (i < size3) {
                InAppNotification inAppNotification3 = (InAppNotification) items3.get(i);
                RecyclerView.C3084b0 findViewHolderForAdapterPosition3 = recyclerView3 != null ? recyclerView3.findViewHolderForAdapterPosition(i) : null;
                RecyclerView.Adapter adapter = recyclerView3 != null ? recyclerView3.getAdapter() : null;
                C11542b bVar3 = adapter instanceof C11542b ? (C11542b) adapter : null;
                if (inAppNotification3 instanceof InAppNotificationRecommendedShopsStandard) {
                    iANShopCard = ((InAppNotificationRecommendedShopsStandard) inAppNotification3).findShopByUserId(cVar.f28752a);
                } else {
                    iANShopCard = inAppNotification3 instanceof InAppNotificationRecommendedShopsHighlighted ? ((InAppNotificationRecommendedShopsHighlighted) inAppNotification3).findShopByUserId(cVar.f28752a) : null;
                }
                if (iANShopCard != null) {
                    iANShopCard.setFavorite(cVar.f28753b);
                    if (findViewHolderForAdapterPosition3 instanceof C13881b) {
                        ((C13881b) findViewHolderForAdapterPosition3).mo37518d(iANShopCard);
                    } else if (!(bVar3 == null || findViewHolderForAdapterPosition3 == null || !(inAppNotification3 instanceof InAppNotificationRecommendedShopsHighlighted))) {
                        bVar3.notifyItemChanged(findViewHolderForAdapterPosition3.getBindingAdapterPosition());
                    }
                }
                i++;
            }
        }
    }
}
