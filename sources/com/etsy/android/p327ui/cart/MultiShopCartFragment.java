package com.etsy.android.p327ui.cart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0120c;
import androidx.compose.animation.C0391c;
import androidx.compose.foundation.layout.C0761x;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.C5380a;
import com.etsy.android.C6487g;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.logger.C8692f;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.EtsyAssociativeArray;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.cart.ApplyCoupon;
import com.etsy.android.lib.models.apiv3.cart.CartErrorResolution;
import com.etsy.android.lib.models.apiv3.cart.CartGroup;
import com.etsy.android.lib.models.apiv3.cart.CartGroupDivider;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.lib.models.apiv3.cart.CartReceipt;
import com.etsy.android.lib.models.apiv3.cart.CheckoutSection;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.cart.HTMLText;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelable;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenActionParcelableKt;
import com.etsy.android.lib.models.cardviewelement.ListSection;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8902h;
import com.etsy.android.lib.util.C8905i;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.EtsyWebFragment;
import com.etsy.android.p327ui.cart.C9296f;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9326n;
import com.etsy.android.p327ui.cart.CartWithSavedFragment;
import com.etsy.android.p327ui.cart.bottomsheets.SelectVariationWorkflow;
import com.etsy.android.p327ui.cart.clicklisteners.C9274e;
import com.etsy.android.p327ui.cart.clicklisteners.C9281f;
import com.etsy.android.p327ui.cart.clicklisteners.C9289n;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.cart.pushoptin.C9331a;
import com.etsy.android.p327ui.cart.viewholders.C9374e;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.ApplyCouponBottomSheetNavigationKey;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.PushOptInBottomSheetKey;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.MultishopCheckoutKey;
import com.etsy.android.p327ui.sdl.C10715a;
import com.etsy.android.p327ui.search.C10865h;
import com.etsy.android.p327ui.singleactivity.C11321e;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.push.CartRefreshDelegate;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.uikit.adapter.C11829a;
import com.etsy.android.uikit.p331ui.favorites.HeartMonitor;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.PositionList;
import com.etsy.android.vespa.VespaBaseFragment;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.C14609d1;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.android.play.core.review.C15736c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.logging.type.LogSeverity;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19380l;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import kotlin.text.C19460n;
import okhttp3.C19928a0;
import okhttp3.C19997p;
import org.apache.commons.lang3.ClassUtils;
import p001a0.C0005b;
import p030bo.app.C4237u6;
import p143i9.C7003e;
import p143i9.C7007f;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p248tp.C8071s;
import p251u1.C8115a;
import p277w8.C8264b;
import p277w8.C8267e;
import p312ag.C8528e;
import p337de.C12647a;
import p337de.C12649c;
import p340ea.C12673n;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12741o;
import p356ge.C12788a;
import p356ge.C12790b;
import p357gf.C12796e;
import p359ha.C12799a;
import p359ha.C12800b;
import p363he.C12821d;
import p370ie.C12948h;
import p370ie.C12949i;
import p377jf.C12979a;
import p400mf.C13074b;
import p400mf.C13078c;
import p401mg.C13080a;
import p402n9.C13083c;
import p402n9.C13095o;
import p409o9.C13138q;
import p415of.C13173c;
import p415of.C13185n;
import p415of.C13186o;
import p425q9.C13258i;
import p425q9.C13265p;
import p440s9.C13366a;
import p445sf.C13379a;
import p445sf.C13380b;
import p456ua.C13459d;
import p456ua.C13461f;
import p461uf.C13511h;
import p470w9.C13793a;
import p472wb.C13799a;
import p472wb.C13801b;
import p478x9.C13851a;
import p605kk.C18123g;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment */
public final class MultiShopCartFragment extends VespaBaseFragment<CartPage> implements CartWithSavedFragment.C9231b, C9333r, CartRefreshDelegate.C8937a, C13366a, C11321e {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public C8267e adImpressionRepository;
    public C9274e addShopCouponWorkflow;
    public CartBadgeCountRepo cartBadgeCountRepo;
    public C9293d cartCouponCache;
    private final C9281f cartEmptyMessageClickListener = new C9281f(this);
    public C9323l cartRefreshEventManager;
    public C9329o cartScrollEventDelegate;
    public C9330p cartUriParser;
    public C9332q cartViewEligibility;
    private final BroadcastReceiver checkoutCanceledReceiver = new MultiShopCartFragment$checkoutCanceledReceiver$1(this);
    private final C7091a compositeDisposable = new C7091a();
    public C8731g configuredV3MoshiRetrofit;
    public C12724a deepLinkEligibility;
    public C13851a deepLinkEntityChecker;
    public C12673n elkLogger;
    public C11780h favoriteRepository;
    private Disposable fetchCartDisposable;
    public C12799a firebaseAnalyticsTracker;
    private final BroadcastReceiver googlePayUpdatesReceiver = new MultiShopCartFragment$googlePayUpdatesReceiver$1(this);
    public C12703a grafana;
    public C13138q installInfo;
    private CartRefreshDelegate mCartRefreshDelegate;
    public C9303a mGooglePayHelper;
    private boolean mIsGooglePayAvailable;
    private boolean mIsGooglePayEnabled;
    private final C13380b mPaginator = new C13380b();
    private EtsyId mThankYouReceiptId;
    public C9420x multiShopCartRepository;
    /* access modifiers changed from: private */
    public boolean needsRefresh;
    public C8704a performanceTrackerAdapter;
    public C9331a postPurchasePushOptInEligibility;
    /* access modifiers changed from: private */
    public final Rect rect = new Rect();
    public C7007f reviewPromptEligibility;
    public C12741o routeInspector;
    public C13461f rxSchedulers;
    public C10865h searchUriParser;
    public SelectVariationWorkflow selectVariationWorkflow;
    public C13265p session;
    /* access modifiers changed from: private */
    public final C0120c<C12948h> signInForCouponApplyResult;

    /* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$a */
    public /* synthetic */ class C9235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20407a;

        static {
            int[] iArr = new int[EtsyAction.values().length];
            iArr[EtsyAction.CART_ACTION.ordinal()] = 1;
            iArr[EtsyAction.PURCHASE.ordinal()] = 2;
            iArr[EtsyAction.PURCHASE_GPAY.ordinal()] = 3;
            iArr[EtsyAction.APPLY_COUPON.ordinal()] = 4;
            f20407a = iArr;
        }
    }

    /* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$b */
    public static final class C9236b implements C8902h.C8903a {

        /* renamed from: a */
        public final WeakReference<MultiShopCartFragment> f20408a;

        /* renamed from: b */
        public final /* synthetic */ MultiShopCartFragment f20409b;

        public C9236b(MultiShopCartFragment multiShopCartFragment) {
            this.f20409b = multiShopCartFragment;
            this.f20408a = new WeakReference<>(multiShopCartFragment);
        }

        /* renamed from: a */
        public final void mo30490a() {
            this.f20409b.getPerformanceTrackerAdapter().mo21370b();
            MultiShopCartFragment multiShopCartFragment = this.f20408a.get();
            if (multiShopCartFragment != null) {
                multiShopCartFragment.onLoadFailure();
            }
            this.f20409b.getPerformanceTrackerAdapter().f19123e = true;
        }

        /* renamed from: b */
        public final void mo30491b(ArrayList<Country> arrayList) {
            MultiShopCartFragment multiShopCartFragment = this.f20408a.get();
            if (multiShopCartFragment != null) {
                multiShopCartFragment.loadCartPage();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$c */
    public /* synthetic */ class C9237c implements C13078c, C19380l {
        public C9237c() {
        }

        /* renamed from: a */
        public final void mo31411a(C13074b bVar) {
            C19383o.m32797g(bVar, "p0");
            MultiShopCartFragment.this.onUpdateReceived(bVar);
        }

        /* renamed from: b */
        public final FunctionReferenceImpl mo31531b() {
            return new FunctionReferenceImpl(1, MultiShopCartFragment.this, MultiShopCartFragment.class, "onUpdateReceived", "onUpdateReceived(Lcom/etsy/android/uikit/ui/favorites/HeartUpdate;)V", 0);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C13078c) || !(obj instanceof C19380l)) {
                return false;
            }
            return C19383o.m32792b(mo31531b(), ((C19380l) obj).mo31531b());
        }

        public final int hashCode() {
            return mo31531b().hashCode();
        }
    }

    /* renamed from: com.etsy.android.ui.cart.MultiShopCartFragment$d */
    public static final class C9238d extends RecyclerView.C3108s {

        /* renamed from: b */
        public final /* synthetic */ MultiShopCartFragment f20411b;

        public C9238d(MultiShopCartFragment multiShopCartFragment) {
            this.f20411b = multiShopCartFragment;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C19383o.m32797g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            this.f20411b.rect.setEmpty();
            recyclerView.getDrawingRect(this.f20411b.rect);
            C9329o cartScrollEventDelegate = this.f20411b.getCartScrollEventDelegate();
            Rect access$getRect$p = this.f20411b.rect;
            cartScrollEventDelegate.getClass();
            C19383o.m32797g(access$getRect$p, "drawingRect");
            cartScrollEventDelegate.f20600a.onNext(access$getRect$p);
        }
    }

    public MultiShopCartFragment() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C9364u(this));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.signInForCouponApplyResult = registerForActivityResult;
    }

    private final void checkGooglePayReady() {
        C9303a.m17695c(getMGooglePayHelper(), new C5380a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: checkGooglePayReady$lambda-7  reason: not valid java name */
    public static final void m34913checkGooglePayReady$lambda7(MultiShopCartFragment multiShopCartFragment, C18123g gVar) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(gVar, "task");
        multiShopCartFragment.mIsGooglePayAvailable = false;
        if (gVar.mo69668o()) {
            multiShopCartFragment.mIsGooglePayAvailable = C19383o.m32792b(gVar.mo69664k(), Boolean.TRUE);
        }
        multiShopCartFragment.loadCart();
    }

    private final C9334s getActionSpecs(IServerDrivenAction iServerDrivenAction) {
        Object obj;
        EtsyAssociativeArray params = iServerDrivenAction.getParams();
        if (params == null) {
            params = new EtsyAssociativeArray();
        }
        EtsyAssociativeArray etsyAssociativeArray = params;
        C9293d cartCouponCache2 = getCartCouponCache();
        List p1 = C19327t.m32660p1(cartCouponCache2.f20508a);
        LinkedHashSet linkedHashSet = cartCouponCache2.f20508a;
        CartCouponCache$readAndFilter$1 cartCouponCache$readAndFilter$1 = CartCouponCache$readAndFilter$1.INSTANCE;
        C19383o.m32797g(linkedHashSet, "<this>");
        C19383o.m32797g(cartCouponCache$readAndFilter$1, "predicate");
        C19324q.m32630L0(linkedHashSet, cartCouponCache$readAndFilter$1, true);
        C19383o.m32797g(p1, "coupons");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object next : p1) {
            if (next instanceof C9296f.C9297a) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            String valueOf = String.valueOf(((C9296f.C9297a) next2).getShopId());
            Object obj2 = linkedHashMap2.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(valueOf, obj2);
            }
            ((List) obj2).add(next2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C19421p.m32930T(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(C0391c.m1057c(C0072d.m201h("coupons["), (String) entry.getKey(), ']'), entry.getValue());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C19421p.m32930T(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            Object key = entry2.getKey();
            if (((List) entry2.getValue()).size() == 1) {
                obj = ((C9296f.C9297a) C19327t.m32638T0((List) entry2.getValue())).mo31626c();
            } else {
                Iterable<C9296f.C9297a> iterable = (Iterable) entry2.getValue();
                ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(iterable));
                for (C9296f.C9297a c : iterable) {
                    arrayList2.add(c.mo31626c());
                }
                obj = C19327t.m32660p1(C19327t.m32663s1(arrayList2));
            }
            linkedHashMap4.put(key, obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : p1) {
            if (next3 instanceof C9296f.C9298b) {
                arrayList3.add(next3);
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            String valueOf2 = String.valueOf(((C9296f.C9298b) next4).mo31628a());
            Object obj3 = linkedHashMap5.get(valueOf2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap5.put(valueOf2, obj3);
            }
            ((List) obj3).add(next4);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(C19421p.m32930T(linkedHashMap5.size()));
        for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
            linkedHashMap6.put(C0391c.m1057c(C0072d.m201h("promoted_offer_listings_to_add["), (String) entry3.getKey(), ']'), entry3.getValue());
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(C19421p.m32930T(linkedHashMap6.size()));
        for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
            Object key2 = entry4.getKey();
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object next5 : (Iterable) entry4.getValue()) {
                if (hashSet.add(((C9296f.C9298b) next5).mo31629b())) {
                    arrayList4.add(next5);
                }
            }
            ArrayList arrayList5 = new ArrayList(C19322o.m32624F0(arrayList4));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(String.valueOf(((C9296f.C9298b) it3.next()).mo31629b()));
            }
            linkedHashMap7.put(key2, arrayList5);
        }
        linkedHashMap.putAll(linkedHashMap4);
        linkedHashMap.putAll(linkedHashMap7);
        etsyAssociativeArray.putAll(linkedHashMap);
        return new C9334s(iServerDrivenAction.getPath(), isGooglePaySupported(), getSession().mo45960e(), etsyAssociativeArray, iServerDrivenAction.getRequestMethod());
    }

    private final void handleCartVariationSelectResult(Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("cart_action");
            ServerDrivenActionParcelable serverDrivenActionParcelable = parcelableExtra instanceof ServerDrivenActionParcelable ? (ServerDrivenActionParcelable) parcelableExtra : null;
            if (serverDrivenActionParcelable != null) {
                PositionList withParentPosition = new PositionList().withParentPosition(intent.getIntExtra("cart_action_position", -1));
                C19383o.m32796f(withParentPosition, "PositionList().withParen…  )\n                    )");
                performAction(withParentPosition, ServerDrivenActionParcelableKt.toServerDrivenAction(serverDrivenActionParcelable));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleCheckoutCanceled(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra(ResponseConstants.CART_ID);
            boolean booleanExtra = intent.getBooleanExtra("is_paypal", false);
            C8703p analyticsContext = getAnalyticsContext();
            HashMap hashMap = new HashMap();
            hashMap.put(PredefinedAnalyticsProperty.IS_PAYPAL, Boolean.valueOf(booleanExtra));
            if (C18263b.m30839d0(stringExtra)) {
                hashMap.put(PredefinedAnalyticsProperty.CART_ID, stringExtra);
            }
            if (analyticsContext != null) {
                analyticsContext.mo21333d("canceled_checkout_webview", hashMap);
            }
        }
    }

    private final void handleDeepLink(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getPathSegments().size() <= 1 || !C19383o.m32792b(parse.getPathSegments().get(1), CartGroupItem.ELEMENT_PAYMENT_CHECKOUT)) {
            C19421p.m32933W(getContext(), new C12821d(str));
            return;
        }
        String queryParameter = parse.getQueryParameter("payment_method");
        if (queryParameter != null) {
            String str2 = parse.getPathSegments().get(0);
            C19383o.m32796f(str2, "uri.pathSegments[0]");
            proceedToCheckout(str2, queryParameter);
        }
    }

    private final void handlePerformActionWithToastFailure(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C8901g0.m17338d(activity, str);
        }
        showActionLoading(false);
    }

    /* access modifiers changed from: private */
    public final void handlePerformActionWithToastSuccess(int i, IServerDrivenAction iServerDrivenAction, CartPage cartPage, int i2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (iServerDrivenAction.getRefreshNeeded()) {
                C11829a<T> aVar = this.adapter;
                C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
                C9363t tVar = (C9363t) aVar;
                if (cartPage == null) {
                    C8694h.f19097a.mo21306a("Attempt to update the page with a null page");
                } else if (i < 0 || i >= tVar.mItems.size()) {
                    C8694h hVar = C8694h.f19097a;
                    StringBuilder h = C0069a.m177h("Attempt to update item at an invalid position ", i, " of ");
                    h.append(tVar.mItems.size());
                    hVar.mo21306a(h.toString());
                } else if (cartPage.getListSections().size() > 0) {
                    boolean z = false;
                    for (ListSection next : cartPage.getListSections()) {
                        if (!z) {
                            Iterator<C13186o> it = next.getItems().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C13186o next2 = it.next();
                                if (!z) {
                                    String resourceEntryName = tVar.mContext.getResources().getResourceEntryName(((C13186o) tVar.mItems.get(i)).getViewType());
                                    C8694h.f19097a.mo21310e("Replacing " + resourceEntryName + " at position " + i);
                                    tVar.replaceItem(i, next2);
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    String resourceEntryName2 = tVar.mContext.getResources().getResourceEntryName(((C13186o) tVar.mItems.get(i)).getViewType());
                    C8694h.f19097a.mo21310e("Removing " + resourceEntryName2 + " at position " + i + " in " + tVar.mItems.size());
                    int i3 = tVar.f20678i;
                    if (i < i3) {
                        tVar.f20678i = i3 - 1;
                    }
                    tVar.removeItem(i);
                    if (tVar.getItems().size() >= i + 1) {
                        if (((C13186o) tVar.getItem(i)) instanceof CartGroupDivider) {
                            tVar.removeItem(i);
                        } else {
                            int i4 = i - 1;
                            if (i4 > 0 && (tVar.getItem(i4) instanceof CartGroupDivider)) {
                                tVar.removeItem(i4);
                            }
                        }
                    }
                    if (tVar.getItems().size() == 1 && (tVar.getItem(0) instanceof HTMLText)) {
                        tVar.removeItem(0);
                    }
                }
                if (C19383o.m32792b(iServerDrivenAction.getType(), ServerDrivenAction.TYPE_SAVE_CART_LISTING)) {
                    getCartRefreshEventManager().f20595a.onNext(C9315k.C9320e.f20592a);
                }
                if (cartPage != null) {
                    CartRefreshDelegate.sendBroadcast(activity, cartPage.getCartCount(), cartPage.getSavedCount(), true, 1);
                }
            }
            if (i2 != -1) {
                C8901g0.m17337c(activity, i2);
            }
            if (cartPage != null) {
                showCartAlert(cartPage.getCartAlert());
            }
            showActionLoading(false);
            if (iServerDrivenAction.isFromSignIn()) {
                iServerDrivenAction.setFromSignIn(false);
                onRefresh();
            }
        }
    }

    private final void handleUpdateQuantityResult(Bundle bundle) {
        int i = bundle.getInt("cart_action_position", -1);
        PositionList positionList = new PositionList();
        positionList.setParentPosition(i);
        Parcelable parcelable = bundle.getParcelable("cart_action");
        ServerDrivenAction serverDrivenAction = null;
        ServerDrivenActionParcelable serverDrivenActionParcelable = parcelable instanceof ServerDrivenActionParcelable ? (ServerDrivenActionParcelable) parcelable : null;
        if (serverDrivenActionParcelable != null) {
            serverDrivenAction = ServerDrivenActionParcelableKt.toServerDrivenAction(serverDrivenActionParcelable);
        }
        int i2 = bundle.getInt("cart_update_quantity_selected_quantity", 1);
        if (serverDrivenAction != null) {
            serverDrivenAction.addParam(ResponseConstants.QUANTITY, String.valueOf(i2));
            performAction(positionList, serverDrivenAction);
        }
    }

    private final boolean isGooglePaySupported() {
        return this.mIsGooglePayEnabled && this.mIsGooglePayAvailable;
    }

    private final void loadCart() {
        boolean z;
        getPerformanceTrackerAdapter().mo21369a();
        C9236b bVar = new C9236b(this);
        synchronized (C8902h.f19658a) {
            z = C8902h.f19659b.mo19995i() > 0;
        }
        if (!z) {
            C8902h.C8904b bVar2 = new C8902h.C8904b(bVar);
            C13461f rxSchedulers2 = EtsyApplication.get().getRxSchedulers();
            C8071s<C20145v<C19928a0>> a = EtsyApplication.get().getCountriesRepository().f30357a.mo46655a();
            C13793a aVar = new C13793a(0);
            a.getClass();
            C19208j jVar = new C19208j(a, aVar);
            rxSchedulers2.getClass();
            jVar.mo20660i(C13461f.m21235b()).mo20657f(C13461f.m21236c()).mo20658g(new C6487g(bVar2, 2), new C8905i(bVar2, 0));
            return;
        }
        bVar.mo30491b(C8902h.m17339a());
    }

    /* access modifiers changed from: private */
    public final void loadCartPage() {
        Disposable disposable = this.fetchCartDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        boolean z = this.adapter.getItemCount() == 0;
        String apiUrl = getApiUrl();
        boolean isGooglePaySupported = isGooglePaySupported();
        EtsyId etsyId = this.mThankYouReceiptId;
        boolean e = getSession().mo45960e();
        String str = getInstallInfo().f28895a;
        C19383o.m32796f(str, "installInfo.guestId");
        C19383o.m32797g(apiUrl, "apiUrl");
        C9420x multiShopCartRepository2 = getMultiShopCartRepository();
        multiShopCartRepository2.getClass();
        C9421y yVar = multiShopCartRepository2.f20898b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isGooglePaySupported) {
            linkedHashMap.put("supports_google_pay", "true");
        }
        if (!e) {
            linkedHashMap.put("guest_id", str);
        } else if (etsyId != null && etsyId.hasId() && z) {
            linkedHashMap.put("thank_you_receipt_id", etsyId.getId());
        }
        linkedHashMap.put("remove_payment_methods", "true");
        linkedHashMap.put("remove_shipping_options", "true");
        linkedHashMap.put("cart_info_hierarchy_updates", "true");
        C8071s<C20145v<C19928a0>> b = yVar.mo31852b(apiUrl, linkedHashMap);
        C13459d dVar = new C13459d(multiShopCartRepository2, 1);
        b.getClass();
        C19208j jVar = new C19208j(b, dVar);
        getRxSchedulers().getClass();
        SingleSubscribeOn i = jVar.mo20660i(C13461f.m21235b());
        getRxSchedulers().getClass();
        this.fetchCartDisposable = i.mo20657f(C13461f.m21236c()).mo20658g(new C13083c(this, 2), new C8264b(this, 5));
    }

    /* access modifiers changed from: private */
    /* renamed from: loadCartPage$lambda-8  reason: not valid java name */
    public static final void m34914loadCartPage$lambda8(MultiShopCartFragment multiShopCartFragment, C9326n nVar) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(nVar, "result");
        if (nVar instanceof C9326n.C9328b) {
            multiShopCartFragment.onLoadCartPageSuccess((C9326n.C9328b) nVar);
        } else if (nVar instanceof C9326n.C9327a) {
            multiShopCartFragment.onLoadCartPageError(((C9326n.C9327a) nVar).f20597a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: loadCartPage$lambda-9  reason: not valid java name */
    public static final void m34915loadCartPage$lambda9(MultiShopCartFragment multiShopCartFragment, Throwable th) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(th, "error");
        multiShopCartFragment.onLoadCartPageError(th);
    }

    private final void onLoadCartPageError(Throwable th) {
        String message;
        getPerformanceTrackerAdapter().mo21370b();
        if (!(th == null || (message = th.getMessage()) == null)) {
            getElkLogger().mo45450b("boe_android_multicart_api", message);
        }
        getGrafana().mo45474a("cart_load_error.android");
        onLoadFailure();
        getPerformanceTrackerAdapter().f19123e = true;
    }

    private final void onLoadCartPageSuccess(C9326n.C9328b bVar) {
        boolean z;
        BigDecimal bigDecimal;
        List<ListSection> listSections;
        ApplyCoupon applyCoupon;
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        C9363t tVar = (C9363t) aVar;
        getPerformanceTrackerAdapter().mo21370b();
        CartPage cartPage = bVar.f20599a;
        C9315k m = getCartRefreshEventManager().f20595a.mo71420m();
        C9315k.C9316a aVar2 = m instanceof C9315k.C9316a ? (C9315k.C9316a) m : null;
        if (!(aVar2 == null || (listSections = cartPage.getListSections()) == null)) {
            for (ListSection items : listSections) {
                List<C13186o> items2 = items.getItems();
                C19383o.m32796f(items2, "listSection.items");
                Iterator<T> it = items2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C13186o oVar = (C13186o) it.next();
                        CartGroup cartGroup = oVar instanceof CartGroup ? (CartGroup) oVar : null;
                        if (cartGroup != null) {
                            List<CartGroupItem> paymentItems = cartGroup.getPaymentItems();
                            C19383o.m32796f(paymentItems, "cartGroup.paymentItems");
                            for (CartGroupItem cartGroupItem : paymentItems) {
                                BaseModel data = cartGroupItem.getData();
                                if (data instanceof ApplyCoupon) {
                                    applyCoupon = (ApplyCoupon) data;
                                    continue;
                                } else {
                                    applyCoupon = null;
                                    continue;
                                }
                                if (applyCoupon != null) {
                                    reapplyEtsyCoupon(cartGroupItem, aVar2.f20588a);
                                    return;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
        }
        List<C12800b> purchaseAnalyticsData = cartPage.getPurchaseAnalyticsData();
        boolean z2 = this.adapter.getItemCount() == 0;
        C12799a firebaseAnalyticsTracker2 = getFirebaseAnalyticsTracker();
        C19383o.m32796f(purchaseAnalyticsData, "purchaseAnalyticsData");
        firebaseAnalyticsTracker2.getClass();
        for (C12800b bVar2 : purchaseAnalyticsData) {
            if (bVar2 instanceof C12800b.C12801a) {
                FirebaseAnalytics firebaseAnalytics = firebaseAnalyticsTracker2.f28272a;
                Bundle a = bVar2.mo45574a();
                C14726m1 m1Var = firebaseAnalytics.f36720a;
                m1Var.getClass();
                m1Var.mo50666b(new C14609d1(m1Var, (String) null, "purchase", a, false));
            } else if (bVar2 instanceof C12800b.C12802b) {
                FirebaseAnalytics firebaseAnalytics2 = firebaseAnalyticsTracker2.f28272a;
                Bundle a2 = bVar2.mo45574a();
                C14726m1 m1Var2 = firebaseAnalytics2.f36720a;
                m1Var2.getClass();
                m1Var2.mo50666b(new C14609d1(m1Var2, (String) null, "test_transaction", a2, false));
            }
        }
        if (z2) {
            C8692f fVar = C8692f.f19096a;
            List<CartReceipt> r = tVar.mo31812r();
            C19383o.m32796f(r, "multiShopCartAdapter.cartReceipts");
            fVar.getClass();
            Class<C8692f> cls = C8692f.class;
            if (C8692f.m17099a()) {
                int size = r.size();
                for (int i = 0; i < size; i++) {
                    CartReceipt cartReceipt = r.get(i);
                    Bundle bundle = new Bundle();
                    bundle.putString("fb_content_type", "product");
                    bundle.putString("fb_order_id", cartReceipt.getReceiptId().getId());
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (String str : cartReceipt.getListingIds()) {
                            arrayList.add(cartReceipt.getShopId() + ClassUtils.PACKAGE_SEPARATOR_CHAR + str);
                        }
                        bundle.putString("fb_content_id", C13258i.f29122d.f29123a.writeValueAsString(arrayList));
                    } catch (JsonProcessingException unused) {
                        C12673n nVar = C18263b.f40052P;
                        if (nVar != null) {
                            nVar.mo45450b(cls.getSimpleName(), "Error parsing listing ids from cart");
                        } else {
                            C19383o.m32805o("elkLogger");
                            throw null;
                        }
                    }
                    try {
                        bigDecimal = new BigDecimal(purchaseAnalyticsData.get(i).mo45573b());
                    } catch (IndexOutOfBoundsException e) {
                        C12673n nVar2 = C18263b.f40052P;
                        if (nVar2 != null) {
                            nVar2.mo45450b(cls.getSimpleName(), e.toString());
                            bigDecimal = new BigDecimal("0.0");
                        } else {
                            C19383o.m32805o("elkLogger");
                            throw null;
                        }
                    }
                    EtsyApplication etsyApplication = EtsyApplication.get();
                    C19383o.m32796f(etsyApplication, "get()");
                    C13511h hVar = new C13511h((Context) etsyApplication, (String) null);
                    Currency currency = cartReceipt.getReceiptTotal().asEtsyMoney().getCurrency();
                    if (!C13080a.m20762b(hVar)) {
                        try {
                            if (C8528e.m16933a()) {
                                Log.w(C13511h.f29561c, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
                            }
                            hVar.mo46171g(bigDecimal, currency, bundle, false);
                        } catch (Throwable th) {
                            C13080a.m20761a(hVar, th);
                        }
                    }
                }
            }
        }
        SwipeRefreshLayout swipeRefreshLayout = this.swipeRefreshLayout;
        if (swipeRefreshLayout != null && swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setRefreshing(false);
            tVar.clear();
        }
        if (this.mThankYouReceiptId != null) {
            this.mThankYouReceiptId = null;
            C9331a postPurchasePushOptInEligibility2 = getPostPurchasePushOptInEligibility();
            boolean a3 = (!NotificationManagerCompat.from(postPurchasePushOptInEligibility2.f20603a.f19730a).areNotificationsEnabled() && postPurchasePushOptInEligibility2.f20604b.mo46761a().getBoolean("next_prompt_opt_in", true)) ? postPurchasePushOptInEligibility2.f20605c.mo30551a() : false;
            postPurchasePushOptInEligibility2.f20604b.mo46761a().edit().putBoolean("next_prompt_opt_in", !a3).apply();
            if (a3) {
                postPurchasePushOptInEligibility2.f20605c.mo30552b();
            }
            if (a3) {
                C12790b.m20430b(this, new PushOptInBottomSheetKey(C12790b.m20432d(this)));
            } else if (getReviewPromptEligibility().f15562b.mo21132b(C8592b.f18781c1)) {
                C15736c V = C0005b.m28V(requireContext());
                C7007f reviewPromptEligibility2 = getReviewPromptEligibility();
                C8703p analyticsContext = getAnalyticsContext();
                C19383o.m32796f(analyticsContext, "analyticsContext");
                C7003e eVar = new C7003e(reviewPromptEligibility2, analyticsContext, V);
                C7091a aVar3 = this.compositeDisposable;
                FragmentActivity requireActivity = requireActivity();
                C19383o.m32796f(requireActivity, "requireActivity()");
                aVar3.mo19403b(eVar.mo19183a(requireActivity).mo20658g(Functions.f28540d, Functions.f28541e));
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            z = true;
            CartRefreshDelegate.sendBroadcast(activity, cartPage.getCartCount(), cartPage.getSavedCount(), false, 1);
        } else {
            z = true;
        }
        onLoadSuccess((C13185n) cartPage);
        C0761x.m1716d1(getAnalyticsContext(), tVar.mo31813s(z), tVar.mo31811q());
        getPerformanceTrackerAdapter().f19123e = z;
    }

    /* access modifiers changed from: private */
    public final void onUpdateReceived(C13074b bVar) {
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        C9363t tVar = (C9363t) aVar;
        List<CartReceipt> r = tVar.mo31812r();
        C19383o.m32796f(r, "multiShopCartAdapter.cartReceipts");
        if ((bVar instanceof C13074b.C13077c) && (!r.isEmpty())) {
            for (CartReceipt next : r) {
                C13074b.C13077c cVar = (C13074b.C13077c) bVar;
                if (cVar.f28752a == next.getShopUserId().getIdAsLongDeprecated()) {
                    next.setFavorite(cVar.f28753b);
                    List items = tVar.getItems();
                    for (int i = 0; i < items.size(); i++) {
                        if (R.id.view_type_multishop_cart_thank_you_group == ((C13186o) items.get(i)).getViewType()) {
                            tVar.notifyItemChanged(i, next);
                        }
                    }
                }
            }
        }
    }

    private final void onUserSignedIn(C12647a aVar) {
        Bundle bundleExtra;
        String string;
        Intent intent = aVar.f27896b;
        if (intent != null && (bundleExtra = intent.getBundleExtra(ServerDrivenAction.TYPE_APPLY_COUPON)) != null && (string = bundleExtra.getString("coupon_code")) != null) {
            getCartRefreshEventManager().f20595a.onNext(new C9315k.C9316a(string));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m34916onViewCreated$lambda0(MultiShopCartFragment multiShopCartFragment, String str, Bundle bundle) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(bundle, "bundle");
        multiShopCartFragment.mThankYouReceiptId = (EtsyId) bundle.getSerializable(CartWithSavedFragment.LAST_ORDER_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m34917onViewCreated$lambda1(MultiShopCartFragment multiShopCartFragment, String str, Bundle bundle) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(str, "<anonymous parameter 0>");
        C19383o.m32797g(bundle, "bundle");
        multiShopCartFragment.handleUpdateQuantityResult(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m34918onViewCreated$lambda2(MultiShopCartFragment multiShopCartFragment, C9315k kVar) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(kVar, "cartRefreshEvent");
        multiShopCartFragment.processRefreshEvent(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: performActionWithToast$lambda-19  reason: not valid java name */
    public static final void m34919performActionWithToast$lambda19(MultiShopCartFragment multiShopCartFragment, int i, IServerDrivenAction iServerDrivenAction, int i2, C9326n nVar) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(iServerDrivenAction, "$action");
        C19383o.m32797g(nVar, "result");
        if (nVar instanceof C9326n.C9328b) {
            multiShopCartFragment.handlePerformActionWithToastSuccess(i, iServerDrivenAction, ((C9326n.C9328b) nVar).f20599a, i2);
        } else if (nVar instanceof C9326n.C9327a) {
            C9326n.C9327a aVar = (C9326n.C9327a) nVar;
            String str = aVar.f20598b;
            if (str == null) {
                Throwable th = aVar.f20597a;
                str = th != null ? th.getMessage() : null;
            }
            multiShopCartFragment.handlePerformActionWithToastFailure(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: performActionWithToast$lambda-20  reason: not valid java name */
    public static final void m34920performActionWithToast$lambda20(MultiShopCartFragment multiShopCartFragment, Throwable th) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        C19383o.m32797g(th, "error");
        multiShopCartFragment.handlePerformActionWithToastFailure(th.getMessage());
    }

    /* access modifiers changed from: private */
    public final void processGooglePayRequest(int i, int i2, Intent intent) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i3 = i & 255;
            if (i3 < 0 || i3 >= this.adapter.getItemCount()) {
                C8901g0.m17337c(activity, R.string.whoops_somethings_wrong);
                return;
            }
            GooglePayData googlePayData = null;
            int itemCount = this.adapter.getItemCount();
            for (int i4 = 0; i4 < itemCount; i4++) {
                if (this.adapter.getItem(i4) instanceof CartGroup) {
                    T item = this.adapter.getItem(i4);
                    C19383o.m32795e(item, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.CartGroup");
                    CartGroup cartGroup = (CartGroup) item;
                    int size = cartGroup.getPaymentItems().size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        CartGroupItem cartGroupItem = cartGroup.getPaymentItems().get(i5);
                        if (cartGroupItem.getData() instanceof CheckoutSection) {
                            CheckoutSection checkoutSection = (CheckoutSection) cartGroupItem.getData();
                            C19383o.m32794d(checkoutSection);
                            googlePayData = checkoutSection.getGooglePayData();
                            break;
                        }
                        i5++;
                    }
                    if (googlePayData != null) {
                        break;
                    }
                }
            }
            GooglePayData googlePayData2 = googlePayData;
            if (googlePayData2 != null) {
                if (intent == null) {
                    intent = new Intent();
                }
                Intent intent2 = intent;
                intent2.putExtra(CartWithSavedFragment.CHECKED_OUT_IS_MSCO, true);
                if (!isDetached()) {
                    getMGooglePayHelper().mo31652a(activity, googlePayData2, i, i2, intent2, new MultiShopCartFragment$processGooglePayRequest$1(intent2, this, googlePayData2));
                    return;
                }
                return;
            }
            C8901g0.m17337c(activity, R.string.whoops_somethings_wrong);
        }
    }

    private final void processRefreshEvent(C9315k kVar) {
        if (kVar instanceof C9315k.C9316a) {
            this.adapter.clear();
            onRefresh();
        } else if (kVar instanceof C9315k.C9321f) {
            this.adapter.clear();
            onRefresh();
            getCartRefreshEventManager().mo31715a();
        } else if (kVar instanceof C9315k.C9318c) {
            this.mThankYouReceiptId = ((C9315k.C9318c) kVar).f20590a;
            this.adapter.clear();
            onRefresh();
            getCartRefreshEventManager().mo31715a();
        } else if (kVar instanceof C9315k.C9319d) {
            this.adapter.clear();
            onRefresh();
            getCartRefreshEventManager().mo31715a();
        }
    }

    private final void reapplyEtsyCoupon(CartGroupItem cartGroupItem, String str) {
        ServerDrivenAction action = cartGroupItem.getAction(ServerDrivenAction.TYPE_APPLY_ETSY_COUPON);
        if (action != null) {
            if (str != null) {
                action.addParam("coupon_code", str);
            }
            C19208j b = getMultiShopCartRepository().mo31850b(getActionSpecs(action));
            getRxSchedulers().getClass();
            SingleSubscribeOn i = b.mo20660i(C13461f.m21235b());
            getRxSchedulers().getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(i.mo20657f(C13461f.m21236c()), new MultiShopCartFragment$reapplyEtsyCoupon$1$2(this), new MultiShopCartFragment$reapplyEtsyCoupon$1$3(this));
            C7091a aVar = this.compositeDisposable;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
    }

    /* access modifiers changed from: private */
    public final void refreshAfterEtsyCouponApply() {
        setLoading(false);
        getCartRefreshEventManager().f20595a.onNext(C9315k.C9321f.f20593a);
    }

    /* access modifiers changed from: private */
    public final void showCartAlert(Alert alert) {
        FragmentActivity activity = getActivity();
        if (activity != null && alert != null) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C12979a a = C12979a.C12980a.m20683a(requireActivity);
            a.f28588b.setTitleText(alert.getTitle());
            a.mo45781a(alert.getCollageType());
            String iconId = alert.getIconId();
            if (iconId != null) {
                try {
                    a.mo45783c(getResources().getIdentifier(iconId, "drawable", activity.getPackageName()));
                } catch (Resources.NotFoundException e) {
                    getElkLogger().mo45449a(e.toString());
                    C19394m mVar = C19394m.f43287a;
                }
            }
            a.mo45786f();
        }
    }

    /* access modifiers changed from: private */
    public final void showWarningAlert(String str) {
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C12979a a = C12979a.C12980a.m20683a(requireActivity);
        a.f28588b.setTitleText(str);
        a.mo45781a(CollageAlert.AlertType.WARNING);
        a.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_check_v1);
        a.mo45786f();
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForCouponApplyResult$lambda-23  reason: not valid java name */
    public static final void m34921signInForCouponApplyResult$lambda23(MultiShopCartFragment multiShopCartFragment, C12647a aVar) {
        C19383o.m32797g(multiShopCartFragment, "this$0");
        if (aVar.f27895a == 311) {
            multiShopCartFragment.onUserSignedIn(aVar);
        }
    }

    private final void startCheckout(String str, String str2) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                String c0 = C19421p.m32935c0(getActivity());
                C19383o.m32797g(str, "cartGroupId");
                C19383o.m32797g(str2, "paymentMethod");
                C12788a.m20424c(getActivity(), new MultishopCheckoutKey(c0, str, str2));
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

    public boolean canScrollUp() {
        RecyclerView recyclerView = this.recyclerView;
        C19383o.m32796f(recyclerView, "recyclerView");
        return recyclerView.canScrollVertically(-1);
    }

    public final C8267e getAdImpressionRepository() {
        C8267e eVar = this.adImpressionRepository;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("adImpressionRepository");
        throw null;
    }

    public final C9274e getAddShopCouponWorkflow() {
        C9274e eVar = this.addShopCouponWorkflow;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("addShopCouponWorkflow");
        throw null;
    }

    public String getApiUrl() {
        C19997p.C19998a aVar;
        String str = getPagination().f29305a;
        C9293d cartCouponCache2 = getCartCouponCache();
        List p1 = C19327t.m32660p1(cartCouponCache2.f20508a);
        LinkedHashSet linkedHashSet = cartCouponCache2.f20508a;
        CartCouponCache$readAndFilter$1 cartCouponCache$readAndFilter$1 = CartCouponCache$readAndFilter$1.INSTANCE;
        C19383o.m32797g(linkedHashSet, "<this>");
        C19383o.m32797g(cartCouponCache$readAndFilter$1, "predicate");
        boolean z = true;
        C19324q.m32630L0(linkedHashSet, cartCouponCache$readAndFilter$1, true);
        C19383o.m32797g(p1, "coupons");
        if (!C18263b.m30837c0(str)) {
            aVar = new C19997p.C19998a();
        } else if (C19457k.m33025c1(str, "http://", false) || C19457k.m33025c1(str, "https://", false)) {
            C19997p.f44238l.getClass();
            aVar = C19997p.C19999b.m34234c(str).mo72970f();
        } else {
            aVar = new C19997p.C19998a();
            aVar.mo72976b(str);
        }
        if (str != null && !C19457k.m33020X0(str)) {
            z = false;
        }
        if (z) {
            aVar.mo72976b("/etsyapps/v3/bespoke/member/carts");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object next : p1) {
            if (next instanceof C9296f.C9297a) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            String valueOf = String.valueOf(((C9296f.C9297a) next2).getShopId());
            Object obj = linkedHashMap2.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap2.put(valueOf, obj);
            }
            ((List) obj).add(next2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C19421p.m32930T(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(C0391c.m1057c(C0072d.m201h("coupons["), (String) entry.getKey(), ']'), entry.getValue());
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(C19421p.m32930T(linkedHashMap3.size()));
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            Object key = entry2.getKey();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next3 : (Iterable) entry2.getValue()) {
                if (hashSet.add(((C9296f.C9297a) next3).mo31626c())) {
                    arrayList2.add(next3);
                }
            }
            linkedHashMap4.put(key, C19327t.m32644Z0(arrayList2, ",", (String) null, (String) null, CartUrlBuilder$asMapWithStringValues$allCouponMap$3$2.INSTANCE, 30));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next4 : p1) {
            if (next4 instanceof C9296f.C9298b) {
                arrayList3.add(next4);
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next5 = it2.next();
            Long valueOf2 = Long.valueOf(((C9296f.C9298b) next5).mo31628a());
            Object obj2 = linkedHashMap5.get(valueOf2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap5.put(valueOf2, obj2);
            }
            ((List) obj2).add(next5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(C19421p.m32930T(linkedHashMap5.size()));
        for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
            StringBuilder h = C0072d.m201h("promoted_offer_listings_to_add[");
            h.append(((Number) entry3.getKey()).longValue());
            h.append(']');
            linkedHashMap6.put(h.toString(), entry3.getValue());
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(C19421p.m32930T(linkedHashMap6.size()));
        for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
            Object key2 = entry4.getKey();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object next6 : (Iterable) entry4.getValue()) {
                if (hashSet2.add(((C9296f.C9298b) next6).mo31629b())) {
                    arrayList4.add(next6);
                }
            }
            linkedHashMap7.put(key2, C19327t.m32644Z0(arrayList4, ",", (String) null, (String) null, CartUrlBuilder$asMapWithStringValues$rfcOfferMap$3$2.INSTANCE, 30));
        }
        linkedHashMap.putAll(linkedHashMap4);
        linkedHashMap.putAll(linkedHashMap7);
        for (Map.Entry entry5 : linkedHashMap.entrySet()) {
            aVar.mo72977c((String) entry5.getKey(), entry5.getValue().toString());
        }
        return C18263b.m30837c0(str) ? (C19457k.m33025c1(str, "http://", false) || C19457k.m33025c1(str, "https://", false)) ? C18263b.m30813H((C8694h) null, aVar.toString()) : C18263b.m30813H((C8694h) null, C19460n.m33058I1(3, aVar.toString())) : C18263b.m30813H((C8694h) null, C19460n.m33058I1(3, aVar.toString()));
    }

    public final CartBadgeCountRepo getCartBadgeCountRepo() {
        CartBadgeCountRepo cartBadgeCountRepo2 = this.cartBadgeCountRepo;
        if (cartBadgeCountRepo2 != null) {
            return cartBadgeCountRepo2;
        }
        C19383o.m32805o("cartBadgeCountRepo");
        throw null;
    }

    public final C9293d getCartCouponCache() {
        C9293d dVar = this.cartCouponCache;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("cartCouponCache");
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

    public final C9329o getCartScrollEventDelegate() {
        C9329o oVar = this.cartScrollEventDelegate;
        if (oVar != null) {
            return oVar;
        }
        C19383o.m32805o("cartScrollEventDelegate");
        throw null;
    }

    public final C9330p getCartUriParser() {
        C9330p pVar = this.cartUriParser;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("cartUriParser");
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

    public final C8731g getConfiguredV3MoshiRetrofit() {
        C8731g gVar = this.configuredV3MoshiRetrofit;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("configuredV3MoshiRetrofit");
        throw null;
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

    public final C12673n getElkLogger() {
        C12673n nVar = this.elkLogger;
        if (nVar != null) {
            return nVar;
        }
        C19383o.m32805o("elkLogger");
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

    public final C12799a getFirebaseAnalyticsTracker() {
        C12799a aVar = this.firebaseAnalyticsTracker;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("firebaseAnalyticsTracker");
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

    public final C13138q getInstallInfo() {
        C13138q qVar = this.installInfo;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("installInfo");
        throw null;
    }

    public final C9303a getMGooglePayHelper() {
        C9303a aVar = this.mGooglePayHelper;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("mGooglePayHelper");
        throw null;
    }

    public final C9420x getMultiShopCartRepository() {
        C9420x xVar = this.multiShopCartRepository;
        if (xVar != null) {
            return xVar;
        }
        C19383o.m32805o("multiShopCartRepository");
        throw null;
    }

    public C13379a getPagination() {
        return this.mPaginator;
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

    public final C9331a getPostPurchasePushOptInEligibility() {
        C9331a aVar = this.postPurchasePushOptInEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("postPurchasePushOptInEligibility");
        throw null;
    }

    public final C7007f getReviewPromptEligibility() {
        C7007f fVar = this.reviewPromptEligibility;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("reviewPromptEligibility");
        throw null;
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

    public final SelectVariationWorkflow getSelectVariationWorkflow() {
        SelectVariationWorkflow selectVariationWorkflow2 = this.selectVariationWorkflow;
        if (selectVariationWorkflow2 != null) {
            return selectVariationWorkflow2;
        }
        C19383o.m32805o("selectVariationWorkflow");
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
        return "cart_view";
    }

    public void handleEmptyMessageClick(MessageCard messageCard) {
        if (messageCard != null && !this.cartEmptyMessageClickListener.mo31623a(messageCard, getCartUriParser())) {
            super.handleEmptyMessageClick(messageCard);
        }
    }

    public boolean hasRecyclerViewPadding() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundleExtra;
        String string;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i == 300 && i2 == 311) {
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            C19383o.m32794d(intent);
            String action = intent.getAction();
            aVar.getClass();
            EtsyAction etsyAction = (EtsyAction) EtsyAction.intentActions.get(action);
            if (etsyAction != null) {
                int i3 = C9235a.f20407a[etsyAction.ordinal()];
                if (i3 == 1) {
                    Bundle bundleExtra2 = intent.getBundleExtra(etsyAction.getType());
                    if (bundleExtra2 != null) {
                        Parcelable parcelable = bundleExtra2.getParcelable("cart_action");
                        ServerDrivenAction serverDrivenAction = null;
                        ServerDrivenActionParcelable serverDrivenActionParcelable = parcelable instanceof ServerDrivenActionParcelable ? (ServerDrivenActionParcelable) parcelable : null;
                        if (serverDrivenActionParcelable != null) {
                            serverDrivenAction = ServerDrivenActionParcelableKt.toServerDrivenAction(serverDrivenActionParcelable);
                        }
                        if (serverDrivenAction != null) {
                            serverDrivenAction.setFromSignIn(true);
                            PositionList withParentPosition = new PositionList().withParentPosition(bundleExtra2.getInt("cart_action_position"));
                            C19383o.m32796f(withParentPosition, "PositionList().withParen…av.CART_ACTION_POSITION))");
                            performAction(withParentPosition, serverDrivenAction);
                        }
                    }
                } else if (i3 == 2) {
                    Bundle bundleExtra3 = intent.getBundleExtra(etsyAction.getType());
                    if (bundleExtra3 != null) {
                        startCheckout(bundleExtra3.getString(CartWithSavedFragment.CHECKED_OUT_CART_GROUP_ID, ""), bundleExtra3.getString(CartWithSavedFragment.CHECKED_OUT_PAYMENT_METHOD, ""));
                    }
                } else if (i3 == 3) {
                    Bundle bundleExtra4 = intent.getBundleExtra(etsyAction.getType());
                    if (bundleExtra4 != null) {
                        requestGPay((GooglePayData) bundleExtra4.getParcelable(CartWithSavedFragment.CHECKED_OUT_GPAY_DATA));
                    }
                } else if (i3 == 4 && (bundleExtra = intent.getBundleExtra(etsyAction.getType())) != null && (string = bundleExtra.getString("coupon_code")) != null) {
                    getCartRefreshEventManager().f20595a.onNext(new C9315k.C9316a(string));
                }
            }
        } else if (i == 800 && i2 == 810) {
            handleCartVariationSelectResult(intent);
        } else if (i == 700 && i2 == 0) {
            handleCheckoutCanceled(intent);
            onRefresh();
        } else {
            if (i != 45056) {
                z = false;
            }
            if (z) {
                processGooglePayRequest(i, i2, intent);
            }
        }
    }

    public void onCartCountsUpdated(int i, int i2, boolean z, int i3) {
        if (!z) {
            return;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                onRefresh();
            }
        } else if (i == 0) {
            onRefresh();
        } else if (C18263b.m30839d0(getPagination().f29305a)) {
            onLoadContent();
        }
    }

    public void onCartPageSelected() {
        C8703p analyticsContext = getAnalyticsContext();
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        ArrayList s = ((C9363t) aVar).mo31813s(false);
        C11829a<T> aVar2 = this.adapter;
        C19383o.m32795e(aVar2, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        C0761x.m1716d1(analyticsContext, s, ((C9363t) aVar2).mo31811q());
    }

    public void onCreate(Bundle bundle) {
        this.isEndless = false;
        super.onCreate(bundle);
        getPerformanceTrackerAdapter().mo21372d(bundle == null);
        this.mCartRefreshDelegate = new CartRefreshDelegate(requireContext(), this, getCartBadgeCountRepo());
        this.adapter = new C9363t(this, getAnalyticsContext(), this);
        C13173c adapter = getAdapter();
        C11780h favoriteRepository2 = getFavoriteRepository();
        C8703p analyticsContext = getAnalyticsContext();
        ListingCardViewHolderOptions.C11971e eVar = r5;
        C8623e eVar2 = getAnalyticsContext().f19116n;
        C19383o.m32796f(eVar2, "analyticsContext.configMap");
        ListingCardViewHolderOptions.C11971e eVar3 = new ListingCardViewHolderOptions.C11971e(0, eVar2);
        C13461f rxSchedulers2 = getRxSchedulers();
        C8267e adImpressionRepository2 = getAdImpressionRepository();
        C12724a deepLinkEligibility2 = getDeepLinkEligibility();
        C12741o routeInspector2 = getRouteInspector();
        C13851a deepLinkEntityChecker2 = getDeepLinkEntityChecker();
        C10865h searchUriParser2 = getSearchUriParser();
        C19383o.m32796f(adapter, "getAdapter()");
        C19383o.m32796f(analyticsContext, "analyticsContext");
        addDelegateViewHolderFactory(new C9422z(this, getAnalyticsContext(), getCartScrollEventDelegate(), this, getCartViewEligibility(), getFavoriteRepository(), getRxSchedulers(), new C13801b(new C13799a(this, adapter, analyticsContext, favoriteRepository2, rxSchedulers2, adImpressionRepository2, deepLinkEligibility2, routeInspector2, deepLinkEntityChecker2, searchUriParser2, this, eVar, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 61440)), getAdImpressionRepository(), getDeepLinkEligibility(), getRouteInspector(), getDeepLinkEntityChecker(), getSearchUriParser()));
        C13173c adapter2 = getAdapter();
        C8703p analyticsContext2 = getAnalyticsContext();
        C11780h favoriteRepository3 = getFavoriteRepository();
        C13461f rxSchedulers3 = getRxSchedulers();
        C8267e adImpressionRepository3 = getAdImpressionRepository();
        C12724a deepLinkEligibility3 = getDeepLinkEligibility();
        C12741o routeInspector3 = getRouteInspector();
        C13851a deepLinkEntityChecker3 = getDeepLinkEntityChecker();
        C10865h searchUriParser3 = getSearchUriParser();
        C19383o.m32796f(adapter2, "getAdapter()");
        C19383o.m32796f(analyticsContext2, "analyticsContext");
        addDelegateViewHolderFactory(new C13801b(new C13799a(this, adapter2, analyticsContext2, favoriteRepository3, rxSchedulers3, adImpressionRepository3, deepLinkEligibility3, routeInspector3, deepLinkEntityChecker3, searchUriParser3, this, (ListingCardViewHolderOptions) null, (C10715a) null, (C12796e) null, (C8630b) null, (WeakReference) null, 63488)));
        C8115a.m16322a(requireActivity()).mo20708b(this.checkoutCanceledReceiver, new IntentFilter(EtsyWebFragment.ACTION_RESULT_CANCELED));
        Lifecycle lifecycle = getLifecycle();
        C19383o.m32796f(lifecycle, "lifecycle");
        new HeartMonitor(lifecycle, new C9237c());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19383o.m32796f(onCreateView, "super.onCreateView(infla…iner, savedInstanceState)");
        this.recyclerView.addItemDecoration(new C9374e(requireActivity()));
        this.recyclerView.setDescendantFocusability(131072);
        this.recyclerView.addOnScrollListener(new C9238d(this));
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        if (context != null && !isDetached()) {
            C8115a.m16322a(context).mo20710d(this.checkoutCanceledReceiver);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.compositeDisposable.mo19405d();
        Disposable disposable = this.fetchCartDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        getSelectVariationWorkflow().mo31553a();
        getAddShopCouponWorkflow().mo31606a();
        Context context = getContext();
        if (context != null && !isDetached()) {
            C8115a.m16322a(context).mo20710d(this.googlePayUpdatesReceiver);
        }
        setLoading(false);
    }

    public void onLoadContent() {
        if (!(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(requireActivity().getApplicationContext()) == 0) || !this.mIsGooglePayEnabled) {
            loadCart();
        } else {
            checkGooglePayReady();
        }
    }

    public void onPause() {
        super.onPause();
        CartRefreshDelegate cartRefreshDelegate = this.mCartRefreshDelegate;
        if (cartRefreshDelegate != null) {
            cartRefreshDelegate.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        CartRefreshDelegate cartRefreshDelegate = this.mCartRefreshDelegate;
        if (cartRefreshDelegate != null) {
            cartRefreshDelegate.onResume();
        }
    }

    public void onRetry() {
        onRefresh();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        EtsyId etsyId = this.mThankYouReceiptId;
        if (etsyId != null) {
            bundle.putSerializable(CartWithSavedFragment.LAST_ORDER_ID, etsyId);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.needsRefresh) {
            this.needsRefresh = false;
            onRefresh();
        }
        C8703p analyticsContext = getAnalyticsContext();
        C11829a<T> aVar = this.adapter;
        C19383o.m32795e(aVar, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        ArrayList s = ((C9363t) aVar).mo31813s(false);
        C11829a<T> aVar2 = this.adapter;
        C19383o.m32795e(aVar2, "null cannot be cast to non-null type com.etsy.android.ui.cart.MultiShopCartAdapter");
        C0761x.m1716d1(analyticsContext, s, ((C9363t) aVar2).mo31811q());
    }

    public void onViewCreated(View view, Bundle bundle) {
        FragmentManager parentFragmentManager;
        FragmentManager parentFragmentManager2;
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new MultiShopCartFragment$onViewCreated$1(this));
        C8115a a = C8115a.m16322a(requireContext());
        C19383o.m32796f(a, "getInstance(requireContext())");
        a.mo20708b(this.googlePayUpdatesReceiver, new IntentFilter(EtsyAction.GOOGLE_PAY_RESULT.getIntentAction()));
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment == null || (parentFragmentManager2 = parentFragment.getParentFragmentManager()) == null)) {
            parentFragmentManager2.mo10375a0("to_cart_after_purchase", getViewLifecycleOwner(), new C4237u6(this, 4));
        }
        Fragment parentFragment2 = getParentFragment();
        if (!(parentFragment2 == null || (parentFragmentManager = parentFragment2.getParentFragmentManager()) == null)) {
            parentFragmentManager.mo10375a0("cart_update_quantity", getViewLifecycleOwner(), new C2783s(this, 2));
        }
        C19254a<C9315k> aVar = getCartRefreshEventManager().f20595a;
        getRxSchedulers().getClass();
        ObservableSubscribeOn i = aVar.mo20639i(C13461f.m21235b());
        getRxSchedulers().getClass();
        LambdaObserver g = i.mo20635e(C13461f.m21236c()).mo20637g(new C10673m(this, 1));
        C7091a aVar2 = this.compositeDisposable;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(g);
        this.mIsGooglePayEnabled = getConfigMap().mo21132b(C8592b.C8604l.f18906b);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.mThankYouReceiptId = (EtsyId) bundle.getSerializable(CartWithSavedFragment.LAST_ORDER_ID);
        }
    }

    public void performAction(PositionList positionList, IServerDrivenAction iServerDrivenAction) {
        C19383o.m32797g(positionList, "position");
        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
        performActionWithToast(positionList, iServerDrivenAction, -1);
    }

    public void performActionWithToast(PositionList positionList, IServerDrivenAction iServerDrivenAction, int i) {
        C19383o.m32797g(positionList, "positions");
        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
        int parentPosition = positionList.getParentPosition();
        if (!iServerDrivenAction.getAuthNeeded() || getSession().mo45960e()) {
            if (iServerDrivenAction.getDeepLink().length() > 0) {
                handleDeepLink(iServerDrivenAction.getDeepLink());
                return;
            }
            C19208j b = getMultiShopCartRepository().mo31850b(getActionSpecs(iServerDrivenAction));
            getRxSchedulers().getClass();
            SingleSubscribeOn i2 = b.mo20660i(C13461f.m21235b());
            getRxSchedulers().getClass();
            ConsumerSingleObserver g = i2.mo20657f(C13461f.m21236c()).mo20658g(new C9365v(this, parentPosition, iServerDrivenAction, i), new C13095o(this, 1));
            C7091a aVar = this.compositeDisposable;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(g);
            if (iServerDrivenAction.isImmediatelyRemovable()) {
                C13186o oVar = (C13186o) this.adapter.getItem(positionList.getParentPosition());
                if (oVar instanceof CartGroup) {
                    ((CartGroup) oVar).getItems().remove(positionList.getChildPosition());
                    C11829a<T> aVar2 = this.adapter;
                    aVar2.notifyItemChanged(positionList.getParentPosition() + aVar2.getHeaderCount());
                } else {
                    this.adapter.removeItem(parentPosition);
                }
            }
            if (iServerDrivenAction.getRefreshNeeded()) {
                showActionLoading(true);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("cart_action", ServerDrivenActionParcelableKt.toServerDrivenActionParcelable(iServerDrivenAction));
        bundle.putInt("cart_action_position", parentPosition);
        EtsyAction.C8658a aVar3 = EtsyAction.Companion;
        String c0 = C19421p.m32935c0(getActivity());
        EtsyAction etsyAction = EtsyAction.CART_ACTION;
        C19383o.m32797g(etsyAction, "signInAction");
        C12788a.m20424c(getActivity(), new C12949i(new C12948h(c0, etsyAction, bundle, (String) null, (String) null, (String) null, 32), (Fragment) this, (int) LogSeverity.NOTICE_VALUE));
    }

    public void proceedToCheckout(String str, String str2) {
        C19383o.m32797g(str, "cartGroupId");
        C19383o.m32797g(str2, "paymentMethod");
        if (!getSession().mo45960e()) {
            Bundle bundle = new Bundle();
            bundle.putString(CartWithSavedFragment.CHECKED_OUT_CART_GROUP_ID, str);
            bundle.putString(CartWithSavedFragment.CHECKED_OUT_PAYMENT_METHOD, str2);
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String c0 = C19421p.m32935c0(getActivity());
            EtsyAction etsyAction = EtsyAction.PURCHASE;
            C19383o.m32797g(etsyAction, "signInAction");
            C12788a.m20424c(getActivity(), new C12949i(new C12948h(c0, etsyAction, bundle, (String) null, (String) null, (String) null, 32), (Fragment) this, (int) LogSeverity.NOTICE_VALUE));
            return;
        }
        startCheckout(str, str2);
    }

    public void requestGPay(GooglePayData googlePayData) {
        if (googlePayData == null) {
            return;
        }
        if (!getSession().mo45960e()) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(CartWithSavedFragment.CHECKED_OUT_GPAY_DATA, googlePayData);
            EtsyAction.C8658a aVar = EtsyAction.Companion;
            String d = C12790b.m20432d(this);
            EtsyAction etsyAction = EtsyAction.PURCHASE_GPAY;
            C19383o.m32797g(etsyAction, "signInAction");
            C12790b.m20430b(this, new C12949i(new C12948h(d, etsyAction, bundle, (String) null, (String) null, (String) null, 32), (Fragment) this, (int) LogSeverity.NOTICE_VALUE));
            return;
        }
        C9303a mGooglePayHelper2 = getMGooglePayHelper();
        FragmentActivity requireActivity = requireActivity();
        C19383o.m32796f(requireActivity, "requireActivity()");
        C9303a.m17696d(mGooglePayHelper2, requireActivity, googlePayData);
    }

    public void scrollToTop() {
        this.recyclerView.smoothScrollToPosition(0);
    }

    public final void setAdImpressionRepository(C8267e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.adImpressionRepository = eVar;
    }

    public final void setAddShopCouponWorkflow(C9274e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.addShopCouponWorkflow = eVar;
    }

    public final void setCartBadgeCountRepo(CartBadgeCountRepo cartBadgeCountRepo2) {
        C19383o.m32797g(cartBadgeCountRepo2, "<set-?>");
        this.cartBadgeCountRepo = cartBadgeCountRepo2;
    }

    public final void setCartCouponCache(C9293d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.cartCouponCache = dVar;
    }

    public final void setCartRefreshEventManager(C9323l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.cartRefreshEventManager = lVar;
    }

    public final void setCartScrollEventDelegate(C9329o oVar) {
        C19383o.m32797g(oVar, "<set-?>");
        this.cartScrollEventDelegate = oVar;
    }

    public final void setCartUriParser(C9330p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.cartUriParser = pVar;
    }

    public final void setCartViewEligibility(C9332q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.cartViewEligibility = qVar;
    }

    public final void setConfiguredV3MoshiRetrofit(C8731g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.configuredV3MoshiRetrofit = gVar;
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkEntityChecker(C13851a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEntityChecker = aVar;
    }

    public final void setElkLogger(C12673n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.elkLogger = nVar;
    }

    public final void setFavoriteRepository(C11780h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.favoriteRepository = hVar;
    }

    public final void setFirebaseAnalyticsTracker(C12799a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.firebaseAnalyticsTracker = aVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setInstallInfo(C13138q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.installInfo = qVar;
    }

    public final void setMGooglePayHelper(C9303a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.mGooglePayHelper = aVar;
    }

    public final void setMultiShopCartRepository(C9420x xVar) {
        C19383o.m32797g(xVar, "<set-?>");
        this.multiShopCartRepository = xVar;
    }

    public final void setPerformanceTrackerAdapter(C8704a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.performanceTrackerAdapter = aVar;
    }

    public final void setPostPurchasePushOptInEligibility(C9331a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.postPurchasePushOptInEligibility = aVar;
    }

    public final void setReviewPromptEligibility(C7007f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.reviewPromptEligibility = fVar;
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

    public final void setSelectVariationWorkflow(SelectVariationWorkflow selectVariationWorkflow2) {
        C19383o.m32797g(selectVariationWorkflow2, "<set-?>");
        this.selectVariationWorkflow = selectVariationWorkflow2;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public void showAddShopCouponDialog(PositionList positionList, ServerDrivenAction serverDrivenAction) {
        C19383o.m32797g(positionList, "positionList");
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int parentPosition = positionList.getParentPosition();
            String path = serverDrivenAction.getPath();
            C19383o.m32796f(path, "action.path");
            boolean isGooglePaySupported = isGooglePaySupported();
            boolean e = getSession().mo45960e();
            EtsyAssociativeArray params = serverDrivenAction.getParams();
            String requestMethod = serverDrivenAction.getRequestMethod();
            C19383o.m32796f(requestMethod, "action.requestMethod");
            getAddShopCouponWorkflow().mo31610e(activity, new C9274e.C9275a(serverDrivenAction, new C9334s(path, isGooglePaySupported, e, params, requestMethod)), new MultiShopCartFragment$showAddShopCouponDialog$1(this, parentPosition, serverDrivenAction));
        }
    }

    public void showApplyCouponDialog(CartGroupItem cartGroupItem, PositionList positionList) {
        ApplyCoupon applyCoupon;
        ServerDrivenAction action;
        C19383o.m32797g(cartGroupItem, "cartGroupItem");
        C19383o.m32797g(positionList, "positions");
        FragmentActivity activity = getActivity();
        if (activity != null && (applyCoupon = (ApplyCoupon) cartGroupItem.getData()) != null && (action = cartGroupItem.getAction(ServerDrivenAction.TYPE_APPLY_ETSY_COUPON)) != null) {
            ApplyCouponBottomSheetNavigationKey applyCouponBottomSheetNavigationKey = new ApplyCouponBottomSheetNavigationKey(C19421p.m32935c0(activity), applyCoupon.getModalTitleText(), applyCoupon.getModalInputLabelText(), applyCoupon.getModalInputHelperText(), applyCoupon.getModalApplyButtonText());
            applyCouponBottomSheetNavigationKey.getFragment().setActionParams(action, getActionSpecs(action));
            applyCouponBottomSheetNavigationKey.getFragment().setOnCouponAppliedListener(new MultiShopCartFragment$showApplyCouponDialog$1(this, positionList, action));
            applyCouponBottomSheetNavigationKey.getFragment().setOnRequestSignInForCouponApplyListener(new MultiShopCartFragment$showApplyCouponDialog$2(this));
            C12788a.m20424c(activity, applyCouponBottomSheetNavigationKey);
        }
    }

    public void showSelectShippingDestinationDialog(PositionList positionList, ServerDrivenAction serverDrivenAction, CartErrorResolution cartErrorResolution) {
        C19383o.m32797g(positionList, "positionList");
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        C19383o.m32797g(cartErrorResolution, "resolution");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C9289n.m17683a(activity, cartErrorResolution, new MultiShopCartFragment$showSelectShippingDestinationDialog$1(serverDrivenAction, this, positionList));
        }
    }

    public void showVariationSelectDialog(PositionList positionList, ServerDrivenAction serverDrivenAction) {
        C19383o.m32797g(positionList, "positions");
        C19383o.m32797g(serverDrivenAction, ResponseConstants.ACTION);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (!getSession().mo45960e()) {
                serverDrivenAction.addParam("guest_id", getInstallInfo().f28895a);
            }
            SelectVariationWorkflow selectVariationWorkflow2 = getSelectVariationWorkflow();
            MultiShopCartFragment$showVariationSelectDialog$1 multiShopCartFragment$showVariationSelectDialog$1 = new MultiShopCartFragment$showVariationSelectDialog$1(this, positionList, activity);
            selectVariationWorkflow2.getClass();
            selectVariationWorkflow2.f20427i = multiShopCartFragment$showVariationSelectDialog$1;
            CollageBottomSheet collageBottomSheet = new CollageBottomSheet(activity);
            collageBottomSheet.setPopover(true);
            selectVariationWorkflow2.f20424f = collageBottomSheet;
            selectVariationWorkflow2.f20425g = SelectVariationWorkflow.C9248b.C9251c.f20434a;
            selectVariationWorkflow2.mo31554b(serverDrivenAction);
        }
    }
}
