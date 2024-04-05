package com.etsy.android.p327ui.listing;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.result.C0120c;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2364y;
import androidx.emoji2.text.C2675f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.feedback.C6456a;
import com.etsy.android.feedback.C6457b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.logger.perf.C8710g;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.TrackedEtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.persistviewed.PersistViewedBus;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.C10082l0;
import com.etsy.android.p327ui.C10674m0;
import com.etsy.android.p327ui.cart.clicklisteners.C9272c;
import com.etsy.android.p327ui.cart.googlepay.C9303a;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.AddToCartInterstitialHelper;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10208h;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10210j;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10211k;
import com.etsy.android.p327ui.listing.p329ui.listingimages.ListingVideoStateObserver;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10553c;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10554d;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10562e;
import com.etsy.android.p327ui.listing.p329ui.toppanel.C10661g;
import com.etsy.android.p327ui.listing.screenshots.ListingScreenScreenshotObserver;
import com.etsy.android.p327ui.listing.util.ListingGlobalLayoutListener;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.qualtrics.C8951c;
import com.etsy.android.qualtrics.C8952d;
import com.etsy.android.qualtrics.QualtricsConfiguration;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.util.C12059p;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.play.core.assetpacks.C15588c1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p119g9.C6896a;
import p186n2.C7390d;
import p186n2.C7426q;
import p251u1.C8115a;
import p337de.C12647a;
import p337de.C12649c;
import p356ge.C12788a;
import p356ge.C12790b;
import p370ie.C12948h;
import p377jf.C12979a;
import p400mf.C13073a;
import p411ob.C13147a;
import p413od.C13161e;
import p440s9.C13366a;
import p466vc.C13558a;
import p466vc.C13574d;
import p466vc.C13597g;
import p486y9.C13888d;
import p490yd.C13913a;
import p498zc.C13946a;
import p498zc.C13947b;
import p498zc.C13948c;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.listing.ListingFragment */
public final class ListingFragment extends TrackingBaseFragment implements C10674m0.C10675a, C13366a, C10082l0.C10086b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public AddToCartInterstitialHelper addToCartInterstitialHelper;
    private final C19285c appBarHelper$delegate = C19350d.m32677b(new ListingFragment$appBarHelper$2(this));
    public C19011a<AppBarHelper> appBarHelperProvider;
    public C10554d calculateShippingWorkflow;
    private View customNavigationView;
    public C10156h eligibility;
    public C6896a favoriteHandler;
    public C9303a googlePayHelper;
    public IntentFilter googlePayUpdatesFilter;
    private final BroadcastReceiver googlePayUpdatesReceiver = new ListingFragment$googlePayUpdatesReceiver$1(this);
    public MovementMethod linkMovementMethod;
    public C10097b listingAdapter;
    public C10211k listingBottomSheetHelper;
    public ListingGlobalLayoutListener listingGlobalLayoutListener;
    public C13946a listingItemAnimator;
    public C13947b listingItemDecoration;
    public C13948c listingOnScrollEvent;
    public ListingScreenScreenshotObserver listingScreenScreenshotObserver;
    public C10189i listingViewModelFactory;
    private View loadingView;
    public C8115a localBroadcastManager;
    private View noInternetView;
    public PersistViewedBus persistViewedBus;
    public C13913a qualtricsForListingScreen;
    private RecyclerView recyclerViewListing;
    public C11786n resourceProvider;
    private boolean shouldTrackListing = true;
    private C0120c<C12948h> signInForActionResult;
    public C10661g topPanelHelper;
    public C8710g trackerAdapter;
    private View unavailableView;
    public C13161e variationSelectionBottomSheetHelper;
    private final C19285c viewModel$delegate;

    /* renamed from: com.etsy.android.ui.listing.ListingFragment$a */
    public static final class C10087a implements C13073a {

        /* renamed from: a */
        public final /* synthetic */ ListingFragment f22219a;

        /* renamed from: b */
        public final /* synthetic */ C13574d.C13576b f22220b;

        public C10087a(ListingFragment listingFragment, C13574d.C13576b bVar) {
            this.f22219a = listingFragment;
            this.f22220b = bVar;
        }

        /* renamed from: a */
        public final void mo31346a() {
            this.f22219a.getViewModel().mo33464b(new C13597g.C13671k2(((C13574d.C13576b.C13578b) this.f22220b).f29665a.getListingId().getIdAsLongDeprecated(), ((C13574d.C13576b.C13578b) this.f22220b).f29666b));
        }

        /* renamed from: b */
        public final void mo31347b() {
            this.f22219a.getViewModel().mo33464b(new C13597g.C13678l2(((C13574d.C13576b.C13578b) this.f22220b).f29665a.getListingId().getIdAsLongDeprecated()));
        }
    }

    public ListingFragment() {
        C0120c<C12948h> registerForActivityResult = registerForActivityResult(new C12649c(), new C10102e(this));
        C19383o.m32796f(registerForActivityResult, "registerForActivityResul…esultCode, intent))\n    }");
        this.signInForActionResult = registerForActivityResult;
        this.viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(ListingViewModel.class), new ListingFragment$special$$inlined$viewModels$default$2(new ListingFragment$special$$inlined$viewModels$default$1(this)), new ListingFragment$viewModel$2(this));
    }

    private final void beginDelayedNavigationBarTransition() {
        C7390d dVar = new C7390d();
        View view = this.customNavigationView;
        if (view != null) {
            C7426q.m14342a((ViewGroup) view, dVar);
        } else {
            C19383o.m32805o("customNavigationView");
            throw null;
        }
    }

    private final void clearTitle() {
        getAppBarHelper().setTitle((CharSequence) "");
    }

    private final AppBarHelper getAppBarHelper() {
        return (AppBarHelper) this.appBarHelper$delegate.getValue();
    }

    public static /* synthetic */ void getViewModel$annotations() {
    }

    /* access modifiers changed from: private */
    public final void handleSideEffect(C12059p<C13574d.C13576b> pVar) {
        C13574d.C13576b a = pVar.mo38935a();
        if (a == null) {
            return;
        }
        if (a instanceof C13574d.C13576b.C13591o) {
            this.signInForActionResult.mo1157b(((C13574d.C13576b.C13591o) a).f29680a);
        } else if (a instanceof C13574d.C13576b.C13587k) {
            RecyclerView recyclerView = this.recyclerViewListing;
            if (recyclerView != null) {
                recyclerView.post(new C9272c(1, this, a));
            } else {
                C19383o.m32805o("recyclerViewListing");
                throw null;
            }
        } else if (a instanceof C13574d.C13576b.C13590n) {
            FragmentActivity requireActivity = requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C12979a a2 = C12979a.C12980a.m20683a(requireActivity);
            a2.f28588b.setTitleText(requireActivity.getString(R.string.social_organic_send_friends));
            a2.f28588b.setBodyText(requireActivity.getString(R.string.social_organic_share_screenshot), (Drawable) null);
            a2.mo45781a(CollageAlert.AlertType.INFO_SUBTLE);
            a2.f28588b.setIconDrawableRes(R.drawable.clg_icon_core_image_v1);
            a2.f28591e = 6000;
            a2.mo45784d(new ListingFragment$handleSideEffect$1$2(this, a, a2));
            a2.mo45786f();
            getListingScreenScreenshotObserver().f22353e.dispose();
        } else if (a instanceof C13574d.C13576b.C13585i) {
            C12790b.m20430b(this, ((C13574d.C13576b.C13585i) a).f29672a);
        } else if (a instanceof C13574d.C13576b.C13582f) {
            C12788a.m20426e(getActivity());
        } else if (a instanceof C13574d.C13576b.C13589m) {
            FragmentActivity requireActivity2 = requireActivity();
            C19383o.m32796f(requireActivity2, "requireActivity()");
            C1993m.m4365Z(requireActivity2, ((C13574d.C13576b.C13589m) a).f29676a);
        } else if (a instanceof C13574d.C13576b.C13592p) {
            C6896a favoriteHandler2 = getFavoriteHandler();
            ListingLike listingLike = ((C13574d.C13576b.C13592p) a).f29681a;
            FragmentActivity requireActivity3 = requireActivity();
            C19383o.m32796f(requireActivity3, "requireActivity()");
            favoriteHandler2.mo19011b(listingLike, requireActivity3);
        } else if (a instanceof C13574d.C13576b.C13578b) {
            C6896a favoriteHandler3 = getFavoriteHandler();
            ListingLike listingLike2 = ((C13574d.C13576b.C13578b) a).f29665a;
            FragmentActivity requireActivity4 = requireActivity();
            C19383o.m32796f(requireActivity4, "requireActivity()");
            favoriteHandler3.mo19010a(listingLike2, requireActivity4, new C10087a(this, a));
        } else if (a instanceof C13574d.C13576b.C13583g) {
            C9303a googlePayHelper2 = getGooglePayHelper();
            FragmentActivity requireActivity5 = requireActivity();
            C19383o.m32796f(requireActivity5, "requireActivity()");
            C9303a.m17696d(googlePayHelper2, requireActivity5, ((C13574d.C13576b.C13583g) a).f29670a);
        } else if (a instanceof C13574d.C13576b.C13580d) {
            FragmentActivity requireActivity6 = requireActivity();
            C19383o.m32796f(requireActivity6, "requireActivity()");
            if (C15588c1.m25344r0(requireActivity6)) {
                FragmentActivity requireActivity7 = requireActivity();
                C19383o.m32796f(requireActivity7, "requireActivity()");
                ViewExtensions.m12861e(C15588c1.m25334l0(requireActivity7));
            }
        } else if (C19383o.m32792b(a, C13574d.C13576b.C13579c.f29667a)) {
            if (getTrackerAdapter().mo21373e()) {
                RecyclerView recyclerView2 = this.recyclerViewListing;
                if (recyclerView2 != null) {
                    recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(getListingGlobalLayoutListener());
                } else {
                    C19383o.m32805o("recyclerViewListing");
                    throw null;
                }
            }
        } else if (a instanceof C13574d.C13576b.C13593q) {
            C10554d calculateShippingWorkflow2 = getCalculateShippingWorkflow();
            FragmentActivity requireActivity8 = requireActivity();
            C19383o.m32795e(requireActivity8, "null cannot be cast to non-null type com.etsy.android.ui.BOEActivity");
            List<Country> list = ((C13574d.C13576b.C13593q) a).f29682a;
            ListingFragment$handleSideEffect$1$4 listingFragment$handleSideEffect$1$4 = new ListingFragment$handleSideEffect$1$4(this);
            calculateShippingWorkflow2.getClass();
            C19383o.m32797g(list, "availableCountries");
            calculateShippingWorkflow2.f23142d = listingFragment$handleSideEffect$1$4;
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog((BOEActivity) requireActivity8, R.style.BottomSheetNoFloating);
            bottomSheetDialog.setOnDismissListener(new C10553c(calculateShippingWorkflow2));
            calculateShippingWorkflow2.f23141c = bottomSheetDialog;
            List l1 = C19327t.m32656l1(list, new C10562e());
            ArrayList arrayList = new ArrayList();
            Country country = new Country(-1, "--------------------", "--------------------", "--------------------", (String) null, 16, (DefaultConstructorMarker) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : l1) {
                if (Country.Companion.getPRIMARY_ISO_CODES().contains(((Country) next).getIsoCountryCode())) {
                    arrayList2.add(next);
                }
            }
            if (true ^ arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
                arrayList.add(country);
            }
            arrayList.addAll(l1);
            C10554d.C10557c cVar = calculateShippingWorkflow2.f23140b;
            if (cVar instanceof C10554d.C10557c.C10559b) {
                ((C10554d.C10557c.C10559b) cVar).getClass();
                calculateShippingWorkflow2.mo34147c(new C10554d.C10557c.C10560c(arrayList));
            }
        } else if (a instanceof C13574d.C13576b.C13588l) {
            C10661g topPanelHelper2 = getTopPanelHelper();
            ViewPager viewPager = ((C13574d.C13576b.C13588l) a).f29675a;
            topPanelHelper2.getClass();
            C19383o.m32797g(viewPager, "viewPager");
            View view = topPanelHelper2.f23441b;
            C19383o.m32797g(view, "<this>");
            C2364y.m5201p(view, new C13147a(viewPager, C2364y.m5189d(view)));
            if (!view.isFocusable()) {
                view.setFocusable(true);
            }
            if (!viewPager.isFocusable()) {
                viewPager.setFocusable(true);
            }
        } else if (a instanceof C13574d.C13576b.C13577a) {
            C13574d.C13576b.C13577a aVar = (C13574d.C13576b.C13577a) a;
            getAnalyticsContext().mo21333d(aVar.f29663a, aVar.f29664b);
        } else if (a instanceof C13574d.C13576b.C13586j) {
            getAnalyticsContext().mo21358f(PredefinedAnalyticsProperty.SHOP_ID, ((C13574d.C13576b.C13586j) a).f29673a);
        } else if (a instanceof C13574d.C13576b.C13581e) {
            C13574d.C13576b.C13581e eVar = (C13574d.C13576b.C13581e) a;
            C8901g0.m17338d(requireActivity(), (String) null);
        } else if (a instanceof C13574d.C13576b.C13584h) {
            getPersistViewedBus().mo30136b(((C13574d.C13576b.C13584h) a).f29671a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: handleSideEffect$lambda-4$lambda-3  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m35007handleSideEffect$lambda4$lambda3(com.etsy.android.p327ui.listing.ListingFragment r3, p466vc.C13574d.C13576b r4) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "$sideEffect"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.recyclerViewListing
            r1 = 0
            if (r0 == 0) goto L_0x0035
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x001a
            r1 = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x001a:
            if (r1 == 0) goto L_0x0034
            vc.d$b$k r4 = (p466vc.C13574d.C13576b.C13587k) r4
            int r4 = r4.f29674a
            com.etsy.android.ui.util.n r3 = r3.getResourceProvider()
            r0 = 2131165267(0x7f070053, float:1.7944746E38)
            android.app.Application r3 = r3.f26257a
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getDimensionPixelOffset(r0)
            r1.mo11307k1(r4, r3)
        L_0x0034:
            return
        L_0x0035:
            java.lang.String r3 = "recyclerViewListing"
            kotlin.jvm.internal.C19383o.m32805o(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.ListingFragment.m35007handleSideEffect$lambda4$lambda3(com.etsy.android.ui.listing.ListingFragment, vc.d$b):void");
    }

    /* access modifiers changed from: private */
    public final void handleState(ListingViewState listingViewState) {
        showAppBar(listingViewState.mo33468c());
        if (listingViewState instanceof ListingViewState.C10091c) {
            showInitialState();
        } else if (listingViewState instanceof ListingViewState.C10093e) {
            showLoadingState();
        } else if (listingViewState instanceof ListingViewState.C10089a) {
            showErrorNoInternetState();
        } else if (listingViewState instanceof ListingViewState.C10090b) {
            showErrorListingUnavailableState((ListingViewState.C10090b) listingViewState);
        } else if (listingViewState instanceof ListingViewState.C10092d) {
            showListing((ListingViewState.C10092d) listingViewState);
        }
    }

    private final void setTitle(int i) {
        getAppBarHelper().setTitle(i);
    }

    private final void showAppBar(boolean z) {
        if (z) {
            getAppBarHelper().showAppBar();
        } else {
            getAppBarHelper().hideAppBar();
        }
    }

    private final void showBottomSheet(C10208h hVar) {
        C10211k listingBottomSheetHelper2 = getListingBottomSheetHelper();
        listingBottomSheetHelper2.mo33591a(hVar);
        listingBottomSheetHelper2.f22455c.setOnDismissListener(new C10210j(listingBottomSheetHelper2, new ListingFragment$showBottomSheet$1$1(this)));
    }

    private final void showErrorListingUnavailableState(ListingViewState.C10090b bVar) {
        setTitle(R.string.unavailable);
        View view = this.customNavigationView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.noInternetView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                RecyclerView recyclerView = this.recyclerViewListing;
                if (recyclerView != null) {
                    ViewExtensions.m12860d(recyclerView);
                    View view3 = this.loadingView;
                    if (view3 != null) {
                        ViewExtensions.m12860d(view3);
                        View view4 = this.unavailableView;
                        if (view4 != null) {
                            ViewExtensions.m12869m(view4);
                            View view5 = this.unavailableView;
                            if (view5 != null) {
                                View findViewById = view5.findViewById(R.id.subtitle);
                                C19383o.m32796f(findViewById, "unavailableView.findViewById(R.id.subtitle)");
                                TextView textView = (TextView) findViewById;
                                if (C18263b.m30837c0(bVar.f22232c)) {
                                    ViewExtensions.m12869m(textView);
                                    textView.setText(bVar.f22232c);
                                    return;
                                }
                                ViewExtensions.m12860d(textView);
                                return;
                            }
                            C19383o.m32805o("unavailableView");
                            throw null;
                        }
                        C19383o.m32805o("unavailableView");
                        throw null;
                    }
                    C19383o.m32805o("loadingView");
                    throw null;
                }
                C19383o.m32805o("recyclerViewListing");
                throw null;
            }
            C19383o.m32805o("noInternetView");
            throw null;
        }
        C19383o.m32805o("customNavigationView");
        throw null;
    }

    private final void showErrorNoInternetState() {
        setTitle(R.string.network_unavailable);
        View view = this.customNavigationView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.unavailableView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                RecyclerView recyclerView = this.recyclerViewListing;
                if (recyclerView != null) {
                    ViewExtensions.m12860d(recyclerView);
                    View view3 = this.loadingView;
                    if (view3 != null) {
                        ViewExtensions.m12860d(view3);
                        View view4 = this.noInternetView;
                        if (view4 != null) {
                            ViewExtensions.m12869m(view4);
                        } else {
                            C19383o.m32805o("noInternetView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("loadingView");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("recyclerViewListing");
                    throw null;
                }
            } else {
                C19383o.m32805o("unavailableView");
                throw null;
            }
        } else {
            C19383o.m32805o("customNavigationView");
            throw null;
        }
    }

    private final void showInitialState() {
        clearTitle();
        View view = this.customNavigationView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.unavailableView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                View view3 = this.noInternetView;
                if (view3 != null) {
                    ViewExtensions.m12860d(view3);
                    RecyclerView recyclerView = this.recyclerViewListing;
                    if (recyclerView != null) {
                        ViewExtensions.m12860d(recyclerView);
                        View view4 = this.loadingView;
                        if (view4 != null) {
                            ViewExtensions.m12860d(view4);
                        } else {
                            C19383o.m32805o("loadingView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("recyclerViewListing");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("noInternetView");
                    throw null;
                }
            } else {
                C19383o.m32805o("unavailableView");
                throw null;
            }
        } else {
            C19383o.m32805o("customNavigationView");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: com.etsy.android.ui.core.listingnomapper.listingvariations.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: com.etsy.android.ui.core.listingnomapper.listingvariations.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.etsy.android.ui.core.listingnomapper.listingvariations.i} */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Throwable, java.util.Map] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r6v11, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        if ((r3.getState() == 5) != false) goto L_0x0122;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showListing(com.etsy.android.p327ui.listing.ListingViewState.C10092d r29) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            r28.clearTitle()
            android.view.View r2 = r1.customNavigationView
            r13 = 0
            if (r2 == 0) goto L_0x037a
            com.etsy.android.extensions.ViewExtensions.m12869m(r2)
            r28.beginDelayedNavigationBarTransition()
            com.etsy.android.ui.listing.ui.toppanel.g r2 = r28.getTopPanelHelper()
            com.etsy.android.ui.listing.ui.f r3 = r0.f22238f
            com.etsy.android.ui.listing.ui.toppanel.e r3 = r3.f22800c
            boolean r4 = r0.f22237e
            r2.mo34338a(r3, r4)
            android.view.View r2 = r1.noInternetView
            if (r2 == 0) goto L_0x0372
            com.etsy.android.extensions.ViewExtensions.m12860d(r2)
            android.view.View r2 = r1.loadingView
            if (r2 == 0) goto L_0x036a
            com.etsy.android.extensions.ViewExtensions.m12860d(r2)
            android.view.View r2 = r1.unavailableView
            if (r2 == 0) goto L_0x0362
            com.etsy.android.extensions.ViewExtensions.m12860d(r2)
            androidx.recyclerview.widget.RecyclerView r2 = r1.recyclerViewListing
            if (r2 == 0) goto L_0x035a
            com.etsy.android.extensions.ViewExtensions.m12869m(r2)
            od.e r2 = r28.getVariationSelectionBottomSheetHelper()
            com.etsy.android.ui.listing.ui.f r3 = r0.f22238f
            od.a r3 = r3.f22814q
            od.a r4 = r2.f28948g
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            r11 = 1
            if (r4 == 0) goto L_0x004e
            goto L_0x00c2
        L_0x004e:
            if (r3 != 0) goto L_0x0058
            r2.f28948g = r13
            com.etsy.android.stylekit.views.CollageBottomSheet r2 = r2.f28944c
            r2.dismiss()
            goto L_0x00c2
        L_0x0058:
            r2.f28948g = r3
            com.etsy.android.stylekit.views.CollageTextView r4 = r2.f28946e
            if (r4 == 0) goto L_0x0063
            java.lang.String r5 = r3.f28930a
            r4.setText(r5)
        L_0x0063:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f28947f
            if (r4 == 0) goto L_0x00b2
            od.a$a r5 = r3.f28932c
            boolean r6 = r5 instanceof p413od.C13154a.C13155a.C13156a
            if (r6 == 0) goto L_0x0091
            com.etsy.android.ui.core.listingnomapper.listingvariations.i r6 = new com.etsy.android.ui.core.listingnomapper.listingvariations.i
            od.a$a$a r5 = (p413od.C13154a.C13155a.C13156a) r5
            java.util.List<com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption> r15 = r5.f28933a
            java.util.Map<java.lang.Long, com.etsy.android.lib.models.apiv3.listing.ListingImage> r5 = r5.f28934b
            if (r5 != 0) goto L_0x007b
            java.util.Map r5 = kotlin.collections.C19294b0.m32559p0()
        L_0x007b:
            r16 = r5
            com.etsy.android.ui.listing.ui.VariationType r5 = r3.f28931b
            od.c r7 = new od.c
            r7.<init>(r2, r3)
            com.etsy.android.ui.listing.h r8 = r2.f28943b
            r14 = r6
            r17 = r5
            r18 = r7
            r19 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x00a3
        L_0x0091:
            boolean r6 = r5 instanceof p413od.C13154a.C13155a.C13157b
            if (r6 == 0) goto L_0x00ac
            com.etsy.android.ui.core.listingnomapper.listingvariations.c r6 = new com.etsy.android.ui.core.listingnomapper.listingvariations.c
            od.a$a$b r5 = (p413od.C13154a.C13155a.C13157b) r5
            java.util.List<com.etsy.android.lib.models.apiv3.listing.VariationValue> r5 = r5.f28935a
            od.d r7 = new od.d
            r7.<init>(r2, r3)
            r6.<init>(r5, r7)
        L_0x00a3:
            r4.setAdapter(r6)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r2.f28945d
            r4.setLayoutManager(r5)
            goto L_0x00b2
        L_0x00ac:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b2:
            com.etsy.android.stylekit.views.CollageBottomSheet r4 = r2.f28944c
            r4.setPopover(r11)
            od.b r5 = new od.b
            r5.<init>(r2, r3)
            r4.setOnDismissListener(r5)
            r4.show()
        L_0x00c2:
            com.etsy.android.ui.listing.b r2 = r28.getListingAdapter()
            java.util.ArrayList r3 = r29.mo33485m()
            r2.mo11950j(r3)
            com.etsy.android.ui.listing.ui.f r2 = r0.f22238f
            com.etsy.android.ui.listing.ui.bottomsheet.h r2 = r2.f22813p
            if (r2 == 0) goto L_0x00d6
            r1.showBottomSheet(r2)
        L_0x00d6:
            com.etsy.android.ui.listing.ui.f r2 = r0.f22238f
            com.etsy.android.ui.listing.ui.bottomsheet.g r2 = r2.f22815r
            r15 = 0
            if (r2 == 0) goto L_0x0348
            com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper r14 = r28.getAddToCartInterstitialHelper()
            android.view.View r2 = r28.requireView()
            r3 = 2131429530(0x7f0b089a, float:1.8480735E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "requireView().findViewById(R.id.root_content_view)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r3 = r28.requireView()
            r4 = 2131428081(0x7f0b02f1, float:1.8477796E38)
            android.view.View r3 = r3.findViewById(r4)
            java.lang.String r4 = "requireView().findViewBy…(R.id.coordinator_layout)"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            r6 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r6
            com.etsy.android.ui.listing.ui.f r0 = r0.f22238f
            com.etsy.android.ui.listing.ui.bottomsheet.g r0 = r0.f22815r
            r14.getClass()
            java.lang.String r3 = "uiModel"
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> r3 = r14.f22426s
            if (r3 == 0) goto L_0x0122
            int r3 = r3.getState()
            r4 = 5
            if (r3 != r4) goto L_0x011f
            r3 = r11
            goto L_0x0120
        L_0x011f:
            r3 = r15
        L_0x0120:
            if (r3 == 0) goto L_0x0348
        L_0x0122:
            r14.f22419l = r2
            r14.f22420m = r6
            android.content.Context r2 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131623990(0x7f0e0036, float:1.8875147E38)
            android.view.View r2 = r2.inflate(r3, r6, r15)
            r14.f22422o = r2
            android.content.Context r2 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131623989(0x7f0e0035, float:1.8875145E38)
            android.view.View r2 = r2.inflate(r3, r6, r15)
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.C19383o.m32795e(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r14.f22421n = r2
            android.view.View r2 = r14.f22422o
            r6.addView(r2)
            android.view.ViewGroup r2 = r14.f22421n
            r6.addView(r2)
            android.view.ViewGroup r4 = r14.f22421n
            if (r4 == 0) goto L_0x0348
            java.util.List<of.o> r10 = r0.f22440b
            wb.f r2 = r14.f22425r
            java.lang.String r18 = "listingCardAdapter"
            if (r2 != 0) goto L_0x0214
            wb.f r3 = new wb.f
            r2 = r3
            com.etsy.android.lib.logger.p r5 = r14.f22418k
            r3.<init>(r1, r5, r13)
            r14.f22425r = r3
            of.b r8 = r3.f28991c
            wb.b r9 = new wb.b
            com.etsy.android.lib.logger.p r5 = r14.f22418k
            r3 = r5
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$a r7 = new com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$a
            r12 = r7
            com.etsy.android.lib.config.e r5 = r5.f19116n
            java.lang.String r11 = "analyticsTracker.configMap"
            kotlin.jvm.internal.C19383o.m32796f(r5, r11)
            r7.<init>(r5)
            ua.f r5 = r14.f22411d
            fe.a r7 = r14.f22413f
            x9.a r11 = r14.f22415h
            r20 = r9
            r9 = r11
            fe.o r11 = r14.f22414g
            r21 = r8
            r8 = r11
            com.etsy.android.ui.search.h r11 = r14.f22416i
            r22 = r10
            r10 = r11
            com.etsy.android.ui.util.h r11 = r14.f22410c
            r23 = r4
            r4 = r11
            w8.e r11 = r14.f22412e
            r24 = r6
            r6 = r11
            gf.e r11 = r14.f22417j
            r25 = r14
            r14 = r11
            wb.a r11 = new wb.a
            r26 = r0
            r0 = r11
            r17 = 0
            r15 = r17
            r27 = r11
            r11 = r17
            r13 = r17
            r16 = 0
            r17 = 54272(0xd400, float:7.6051E-41)
            r1 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r20
            r1 = r27
            r0.<init>(r1)
            r1 = r21
            r1.mo45890a(r0)
            com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$a r6 = new com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$a
            r7 = r25
            wb.f r2 = r7.f22425r
            if (r2 == 0) goto L_0x020f
            com.etsy.android.lib.logger.p r5 = r7.f22418k
            w8.e r4 = r7.f22412e
            r0 = r6
            r1 = r28
            r3 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            wb.f r0 = r7.f22425r
            if (r0 == 0) goto L_0x020a
            of.b r0 = r0.f28991c
            r1 = 2131430481(0x7f0b0c51, float:1.8482664E38)
            r0.mo45894i(r1, r6)
            wb.f r0 = r7.f22425r
            if (r0 == 0) goto L_0x0205
            of.b r0 = r0.f28991c
            r1 = 2131430454(0x7f0b0c36, float:1.848261E38)
            r0.mo45894i(r1, r6)
            wb.f r0 = r7.f22425r
            if (r0 == 0) goto L_0x0200
            r1 = r22
            r0.addItems(r1)
            r0 = 0
            goto L_0x021c
        L_0x0200:
            kotlin.jvm.internal.C19383o.m32805o(r18)
            r0 = 0
            throw r0
        L_0x0205:
            r0 = 0
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x020a:
            r0 = 0
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x020f:
            r0 = 0
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x0214:
            r26 = r0
            r23 = r4
            r24 = r6
            r0 = r13
            r7 = r14
        L_0x021c:
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r28.requireActivity()
            wb.f r2 = r7.f22425r
            if (r2 == 0) goto L_0x0342
            of.b r2 = r2.f28991c
            int r2 = r2.f28990i
            r1.<init>(r2)
            wb.f r2 = r7.f22425r
            if (r2 == 0) goto L_0x033c
            wb.f$a r2 = r2.f30419i
            r1.f7008K = r2
            r2 = 2131429440(0x7f0b0840, float:1.8480553E38)
            r3 = r23
            android.view.View r2 = r3.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r7.f22424q = r2
            if (r2 != 0) goto L_0x0244
            goto L_0x0247
        L_0x0244:
            r2.setLayoutManager(r1)
        L_0x0247:
            androidx.recyclerview.widget.RecyclerView r1 = r7.f22424q
            if (r1 == 0) goto L_0x0268
            com.etsy.android.ui.search.v2.a r2 = new com.etsy.android.ui.search.v2.a
            android.content.res.Resources r4 = r28.getResources()
            r5 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r4 = r4.getDimensionPixelSize(r5)
            android.content.res.Resources r6 = r28.getResources()
            int r5 = r6.getDimensionPixelSize(r5)
            r6 = 0
            r2.<init>(r4, r5, r6)
            r1.addItemDecoration(r2)
            goto L_0x0269
        L_0x0268:
            r6 = 0
        L_0x0269:
            androidx.recyclerview.widget.RecyclerView r1 = r7.f22424q
            if (r1 == 0) goto L_0x0278
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            if (r1 == 0) goto L_0x0278
            com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$recyclerViewGlobalLayoutListener$1 r2 = r7.f22431x
            r1.addOnGlobalLayoutListener(r2)
        L_0x0278:
            androidx.recyclerview.widget.RecyclerView r1 = r7.f22424q
            if (r1 != 0) goto L_0x027d
            goto L_0x0284
        L_0x027d:
            wb.f r2 = r7.f22425r
            if (r2 == 0) goto L_0x0336
            r1.setAdapter(r2)
        L_0x0284:
            r1 = r26
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = r1.f22439a
            r2 = 2131428832(0x7f0b05e0, float:1.847932E38)
            android.view.View r2 = r3.findViewById(r2)
            java.lang.String r4 = "bottomSheet.findViewById(R.id.listing_image)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r4)
            com.etsy.android.uikit.view.ListingFullImageView r2 = (com.etsy.android.uikit.view.ListingFullImageView) r2
            r4 = 2131430403(0x7f0b0c03, float:1.8482506E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r7.f22423p = r4
            r4 = 1
            r2.setUseStandardRatio(r4)
            r2.setImageInfo(r1)
            android.widget.Button r1 = r7.f22423p
            if (r1 == 0) goto L_0x02b7
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            if (r1 == 0) goto L_0x02b7
            com.etsy.android.ui.listing.ui.bottomsheet.AddToCartInterstitialHelper$viewCartButtonGlobalLayoutListener$1 r2 = r7.f22430w
            r1.addOnGlobalLayoutListener(r2)
        L_0x02b7:
            android.widget.Button r1 = r7.f22423p
            if (r1 == 0) goto L_0x02c6
            com.etsy.android.ui.listing.ui.bottomsheet.c r2 = new com.etsy.android.ui.listing.ui.bottomsheet.c
            r5 = r28
            r2.<init>(r7, r3, r5)
            r1.setOnClickListener(r2)
            goto L_0x02c8
        L_0x02c6:
            r5 = r28
        L_0x02c8:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r3)
            r7.f22426s = r1
            if (r1 == 0) goto L_0x034a
            android.content.Context r2 = r3.getContext()
            java.lang.String r8 = "bottomSheet.context"
            kotlin.jvm.internal.C19383o.m32796f(r2, r8)
            int r2 = androidx.compose.p015ui.text.font.C1948d.m4272d(r2)
            double r8 = (double) r2
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 * r10
            int r2 = (int) r8
            r1.setPeekHeight(r2)
            r1.setHideable(r4)
            r1.setFitToContents(r6)
            android.content.res.Resources r2 = r3.getResources()
            int r2 = com.etsy.android.lib.util.C8914m.m17344b(r2)
            r1.setExpandedOffset(r2)
            r1.setUpdateImportantForAccessibilityOnSiblings(r4)
            com.etsy.android.ui.listing.ui.bottomsheet.d r2 = new com.etsy.android.ui.listing.ui.bottomsheet.d
            r2.<init>(r7)
            r1.addBottomSheetCallback(r2)
            android.view.View r2 = r7.f22422o
            com.etsy.android.extensions.ViewExtensions.m12869m(r2)
            n2.l r2 = new n2.l
            r2.<init>(r6)
            java.util.ArrayList<android.view.View> r4 = r2.f16565g
            r4.add(r3)
            r4 = r24
            p186n2.C7426q.m14342a(r4, r2)
            com.etsy.android.extensions.ViewExtensions.m12869m(r3)
            java.lang.Integer r2 = r7.f22429v
            r3 = 4
            if (r2 == 0) goto L_0x0322
            int r2 = r2.intValue()
            goto L_0x0323
        L_0x0322:
            r2 = r3
        L_0x0323:
            r1.setState(r2)
            android.view.ViewGroup r1 = r7.f22419l
            if (r1 != 0) goto L_0x032b
            goto L_0x032e
        L_0x032b:
            r1.setImportantForAccessibility(r3)
        L_0x032e:
            com.etsy.android.lib.logger.p r1 = r7.f22418k
            java.lang.String r2 = "add_to_cart_interstitial_shown"
            r1.mo21333d(r2, r0)
            goto L_0x034a
        L_0x0336:
            r5 = r28
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x033c:
            r5 = r28
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x0342:
            r5 = r28
            kotlin.jvm.internal.C19383o.m32805o(r18)
            throw r0
        L_0x0348:
            r5 = r1
            r6 = r15
        L_0x034a:
            boolean r0 = r5.shouldTrackListing
            if (r0 == 0) goto L_0x0359
            r5.shouldTrackListing = r6
            com.etsy.android.ui.listing.ListingViewModel r0 = r28.getViewModel()
            vc.g$u4 r1 = p466vc.C13597g.C13743u4.f30267a
            r0.mo33464b(r1)
        L_0x0359:
            return
        L_0x035a:
            r5 = r1
            r0 = r13
            java.lang.String r1 = "recyclerViewListing"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r0
        L_0x0362:
            r5 = r1
            r0 = r13
            java.lang.String r1 = "unavailableView"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r0
        L_0x036a:
            r5 = r1
            r0 = r13
            java.lang.String r1 = "loadingView"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r0
        L_0x0372:
            r5 = r1
            r0 = r13
            java.lang.String r1 = "noInternetView"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r0
        L_0x037a:
            r5 = r1
            r0 = r13
            java.lang.String r1 = "customNavigationView"
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.ListingFragment.showListing(com.etsy.android.ui.listing.ListingViewState$d):void");
    }

    private final void showLoadingState() {
        clearTitle();
        View view = this.customNavigationView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.unavailableView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                View view3 = this.noInternetView;
                if (view3 != null) {
                    ViewExtensions.m12860d(view3);
                    RecyclerView recyclerView = this.recyclerViewListing;
                    if (recyclerView != null) {
                        ViewExtensions.m12860d(recyclerView);
                        View view4 = this.loadingView;
                        if (view4 != null) {
                            ViewExtensions.m12869m(view4);
                        } else {
                            C19383o.m32805o("loadingView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("recyclerViewListing");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("noInternetView");
                    throw null;
                }
            } else {
                C19383o.m32805o("unavailableView");
                throw null;
            }
        } else {
            C19383o.m32805o("customNavigationView");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: signInForActionResult$lambda-0  reason: not valid java name */
    public static final void m35008signInForActionResult$lambda0(ListingFragment listingFragment, C12647a aVar) {
        C19383o.m32797g(listingFragment, "this$0");
        Intent intent = aVar.f27896b;
        if (intent != null) {
            listingFragment.getViewModel().mo33464b(new C13597g.C13659i4(aVar.f27895a, intent));
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

    public final AddToCartInterstitialHelper getAddToCartInterstitialHelper() {
        AddToCartInterstitialHelper addToCartInterstitialHelper2 = this.addToCartInterstitialHelper;
        if (addToCartInterstitialHelper2 != null) {
            return addToCartInterstitialHelper2;
        }
        C19383o.m32805o("addToCartInterstitialHelper");
        throw null;
    }

    public final C19011a<AppBarHelper> getAppBarHelperProvider() {
        C19011a<AppBarHelper> aVar = this.appBarHelperProvider;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("appBarHelperProvider");
        throw null;
    }

    public final C10554d getCalculateShippingWorkflow() {
        C10554d dVar = this.calculateShippingWorkflow;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("calculateShippingWorkflow");
        throw null;
    }

    public final C10156h getEligibility() {
        C10156h hVar = this.eligibility;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("eligibility");
        throw null;
    }

    public final C6896a getFavoriteHandler() {
        C6896a aVar = this.favoriteHandler;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("favoriteHandler");
        throw null;
    }

    public final C9303a getGooglePayHelper() {
        C9303a aVar = this.googlePayHelper;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("googlePayHelper");
        throw null;
    }

    public final IntentFilter getGooglePayUpdatesFilter() {
        IntentFilter intentFilter = this.googlePayUpdatesFilter;
        if (intentFilter != null) {
            return intentFilter;
        }
        C19383o.m32805o("googlePayUpdatesFilter");
        throw null;
    }

    public final MovementMethod getLinkMovementMethod() {
        MovementMethod movementMethod = this.linkMovementMethod;
        if (movementMethod != null) {
            return movementMethod;
        }
        C19383o.m32805o("linkMovementMethod");
        throw null;
    }

    public final C10097b getListingAdapter() {
        C10097b bVar = this.listingAdapter;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("listingAdapter");
        throw null;
    }

    public final C10211k getListingBottomSheetHelper() {
        C10211k kVar = this.listingBottomSheetHelper;
        if (kVar != null) {
            return kVar;
        }
        C19383o.m32805o("listingBottomSheetHelper");
        throw null;
    }

    public final ListingGlobalLayoutListener getListingGlobalLayoutListener() {
        ListingGlobalLayoutListener listingGlobalLayoutListener2 = this.listingGlobalLayoutListener;
        if (listingGlobalLayoutListener2 != null) {
            return listingGlobalLayoutListener2;
        }
        C19383o.m32805o("listingGlobalLayoutListener");
        throw null;
    }

    public final C13946a getListingItemAnimator() {
        C13946a aVar = this.listingItemAnimator;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("listingItemAnimator");
        throw null;
    }

    public final C13947b getListingItemDecoration() {
        C13947b bVar = this.listingItemDecoration;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("listingItemDecoration");
        throw null;
    }

    public final C13948c getListingOnScrollEvent() {
        C13948c cVar = this.listingOnScrollEvent;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("listingOnScrollEvent");
        throw null;
    }

    public final ListingScreenScreenshotObserver getListingScreenScreenshotObserver() {
        ListingScreenScreenshotObserver listingScreenScreenshotObserver2 = this.listingScreenScreenshotObserver;
        if (listingScreenScreenshotObserver2 != null) {
            return listingScreenScreenshotObserver2;
        }
        C19383o.m32805o("listingScreenScreenshotObserver");
        throw null;
    }

    public final C10189i getListingViewModelFactory() {
        C10189i iVar = this.listingViewModelFactory;
        if (iVar != null) {
            return iVar;
        }
        C19383o.m32805o("listingViewModelFactory");
        throw null;
    }

    public final C8115a getLocalBroadcastManager() {
        C8115a aVar = this.localBroadcastManager;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("localBroadcastManager");
        throw null;
    }

    public C8709f getPerformanceTracker() {
        return getTrackerAdapter().getPerformanceTracker();
    }

    public final PersistViewedBus getPersistViewedBus() {
        PersistViewedBus persistViewedBus2 = this.persistViewedBus;
        if (persistViewedBus2 != null) {
            return persistViewedBus2;
        }
        C19383o.m32805o("persistViewedBus");
        throw null;
    }

    public final C13913a getQualtricsForListingScreen() {
        C13913a aVar = this.qualtricsForListingScreen;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("qualtricsForListingScreen");
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

    public final C0120c<C12948h> getSignInForActionResult() {
        return this.signInForActionResult;
    }

    public final C10661g getTopPanelHelper() {
        C10661g gVar = this.topPanelHelper;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("topPanelHelper");
        throw null;
    }

    public final C8710g getTrackerAdapter() {
        C8710g gVar = this.trackerAdapter;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("trackerAdapter");
        throw null;
    }

    public String getTrackingName() {
        return "view_listing";
    }

    public final C13161e getVariationSelectionBottomSheetHelper() {
        C13161e eVar = this.variationSelectionBottomSheetHelper;
        if (eVar != null) {
            return eVar;
        }
        C19383o.m32805o("variationSelectionBottomSheetHelper");
        throw null;
    }

    public final ListingViewModel getViewModel() {
        return (ListingViewModel) this.viewModel$delegate.getValue();
    }

    public boolean handleBackPressed() {
        AddToCartInterstitialHelper addToCartInterstitialHelper2 = getAddToCartInterstitialHelper();
        BottomSheetBehavior<View> bottomSheetBehavior = addToCartInterstitialHelper2.f22426s;
        boolean z = false;
        if (bottomSheetBehavior != null) {
            if (!(bottomSheetBehavior.getState() == 5)) {
                BottomSheetBehavior<View> bottomSheetBehavior2 = addToCartInterstitialHelper2.f22426s;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(5);
                }
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return super.handleBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTrackerAdapter(getViewModel().f22224e);
        getTrackerAdapter().mo21372d(bundle == null);
        getLocalBroadcastManager().mo20708b(this.googlePayUpdatesReceiver, getGooglePayUpdatesFilter());
        ListingViewModel viewModel = getViewModel();
        String str = getAnalyticsContext().f19059a;
        C19383o.m32796f(str, "analyticsContext.guid");
        viewModel.mo33464b(new C13558a.C13559a(str));
        getViewModel().mo33464b(new C13558a.C13570l(C12790b.m20432d(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_listing, viewGroup, false);
    }

    public void onDestroy() {
        getLocalBroadcastManager().mo20710d(this.googlePayUpdatesReceiver);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.shouldTrackListing = true;
        C10097b listingAdapter2 = getListingAdapter();
        listingAdapter2.f22259j.removeCallbacksAndMessages((Object) null);
        listingAdapter2.f22263n.clear();
        RecyclerView recyclerView = this.recyclerViewListing;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(getListingGlobalLayoutListener());
            RecyclerView recyclerView2 = this.recyclerViewListing;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter((RecyclerView.Adapter) null);
                super.onDestroyView();
                return;
            }
            C19383o.m32805o("recyclerViewListing");
            throw null;
        }
        C19383o.m32805o("recyclerViewListing");
        throw null;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        getViewModel().mo33464b(new C13597g.C13664j2(z));
    }

    public void onResume() {
        super.onResume();
        ListingViewState listingViewState = (ListingViewState) getViewModel().f22226g.getValue();
        showAppBar(listingViewState != null ? listingViewState.mo33468c() : true);
        ListingViewState listingViewState2 = (ListingViewState) getViewModel().f22226g.getValue();
        if (listingViewState2 != null && (listingViewState2 instanceof ListingViewState.C10092d)) {
            beginDelayedNavigationBarTransition();
            ListingViewState.C10092d dVar = (ListingViewState.C10092d) listingViewState2;
            getTopPanelHelper().mo34338a(dVar.f22238f.f22800c, dVar.f22237e);
        }
    }

    public void onStop() {
        getAppBarHelper().cancelAnimations();
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        getViewModel().mo33464b(new C13558a.C13571m(getAppBarHelper().getStatusBarHeight(requireActivity())));
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("listing_id") : null;
        EtsyId etsyId = serializable instanceof EtsyId ? (EtsyId) serializable : null;
        if (etsyId != null) {
            long idAsLongDeprecated = etsyId.getIdAsLongDeprecated();
            getViewModel().mo33464b(new C13558a.C13568j(requireArguments().getBoolean(ListingKey.PARAM_INCLUDE_RELATED_LISTINGS), requireArguments().getBoolean(ListingKey.PARAM_SHOULD_SHOW_ADD_TO_CART_INTERSTITIAL)));
            int i = C8860a.f19556m;
            EtsyId etsyId2 = new EtsyId(idAsLongDeprecated);
            if (C8860a.C8861a.m17264a()) {
                C8860a aVar = C8860a.f19558o;
                C19383o.m32794d(aVar);
                String d = C8915n.m17352d(ResponseConstants.LISTING, etsyId2.getId(), (String) null);
                C19383o.m32796f(d, "createWebLinkForCurrentE…ull\n                    )");
                aVar.f19566g = d;
            }
            View findViewById = view.findViewById(R.id.listing_top_panel_navigation_bar);
            C19383o.m32796f(findViewById, "view.findViewById(R.id.l…top_panel_navigation_bar)");
            this.customNavigationView = findViewById;
            View findViewById2 = view.findViewById(R.id.loading_view);
            C19383o.m32796f(findViewById2, "view.findViewById(R.id.loading_view)");
            this.loadingView = findViewById2;
            View findViewById3 = view.findViewById(R.id.listing_unavailable);
            C19383o.m32796f(findViewById3, "view.findViewById(R.id.listing_unavailable)");
            this.unavailableView = findViewById3;
            View findViewById4 = view.findViewById(R.id.no_internet);
            C19383o.m32796f(findViewById4, "view.findViewById(R.id.no_internet)");
            this.noInternetView = findViewById4;
            ((Button) findViewById4.findViewById(R.id.btn_retry_internet)).setOnClickListener(new ListingFragment$onViewCreated$1(this, idAsLongDeprecated, new C8698l[]{new TrackedEtsyId((AnalyticsProperty) PredefinedAnalyticsProperty.LISTING_ID, Long.valueOf(idAsLongDeprecated))}));
            View view2 = this.customNavigationView;
            if (view2 != null) {
                setTopPanelHelper(new C10661g(view2, getViewModel().f22222c, getAppBarHelper().getStatusBarHeight(requireActivity()), getResourceProvider()));
                View findViewById5 = view.findViewById(R.id.recycler_view_listing);
                C19383o.m32796f(findViewById5, "view.findViewById(R.id.recycler_view_listing)");
                RecyclerView recyclerView = (RecyclerView) findViewById5;
                this.recyclerViewListing = recyclerView;
                recyclerView.setAdapter(getListingAdapter());
                RecyclerView recyclerView2 = this.recyclerViewListing;
                if (recyclerView2 != null) {
                    recyclerView2.addItemDecoration(getListingItemDecoration());
                    RecyclerView recyclerView3 = this.recyclerViewListing;
                    if (recyclerView3 != null) {
                        recyclerView3.addOnScrollListener(getListingOnScrollEvent());
                        RecyclerView recyclerView4 = this.recyclerViewListing;
                        if (recyclerView4 != null) {
                            recyclerView4.getViewTreeObserver().addOnGlobalLayoutListener(getListingGlobalLayoutListener());
                            RecyclerView recyclerView5 = this.recyclerViewListing;
                            if (recyclerView5 != null) {
                                recyclerView5.setItemAnimator(getListingItemAnimator());
                                C10097b listingAdapter2 = getListingAdapter();
                                RecyclerView recyclerView6 = this.recyclerViewListing;
                                if (recyclerView6 != null) {
                                    listingAdapter2.getClass();
                                    LayoutInflater from = LayoutInflater.from(recyclerView6.getContext());
                                    for (int i2 = 0; i2 < 9; i2++) {
                                        listingAdapter2.f22259j.postDelayed(new C2675f(from, 1, recyclerView6, listingAdapter2), ((long) i2) * 160);
                                    }
                                    Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
                                    RecyclerView recyclerView7 = this.recyclerViewListing;
                                    if (recyclerView7 != null) {
                                        lifecycle.mo10733a(new ListingVideoStateObserver(recyclerView7));
                                        getViewLifecycleOwner().getLifecycle().mo10733a(getListingScreenScreenshotObserver());
                                        getViewLifecycleOwner().getLifecycle().mo10733a(getAddToCartInterstitialHelper());
                                        getViewModel().f22226g.observe(getViewLifecycleOwner(), new C6456a(this, 3));
                                        getViewModel().f22228i.observe(getViewLifecycleOwner(), new C6457b(this, 3));
                                        C19388s.m32894x0(this, "DETAIL_IMAGE_SELECTED", new ListingFragment$onViewCreated$4(this));
                                        C19388s.m32894x0(this, ConversationComposeFragment.LISTING_CONVO_SENT, new ListingFragment$onViewCreated$5(this));
                                        C13913a qualtricsForListingScreen2 = getQualtricsForListingScreen();
                                        QualtricsConfiguration qualtricsConfiguration = qualtricsForListingScreen2.f30573d;
                                        BOEActivity bOEActivity = qualtricsForListingScreen2.f30570a;
                                        C8951c cVar = qualtricsForListingScreen2.f30571b;
                                        C13888d dVar = qualtricsForListingScreen2.f30572c;
                                        C8952d.C8955c cVar2 = C8952d.C8955c.f19753c;
                                        qualtricsConfiguration.getClass();
                                        QualtricsConfiguration.m17374a(bOEActivity, cVar, dVar, cVar2);
                                        getViewModel().mo33464b(new C13558a.C13561c(idAsLongDeprecated));
                                        return;
                                    }
                                    C19383o.m32805o("recyclerViewListing");
                                    throw null;
                                }
                                C19383o.m32805o("recyclerViewListing");
                                throw null;
                            }
                            C19383o.m32805o("recyclerViewListing");
                            throw null;
                        }
                        C19383o.m32805o("recyclerViewListing");
                        throw null;
                    }
                    C19383o.m32805o("recyclerViewListing");
                    throw null;
                }
                C19383o.m32805o("recyclerViewListing");
                throw null;
            }
            C19383o.m32805o("customNavigationView");
            throw null;
        }
        throw new IllegalStateException();
    }

    public final void setAddToCartInterstitialHelper(AddToCartInterstitialHelper addToCartInterstitialHelper2) {
        C19383o.m32797g(addToCartInterstitialHelper2, "<set-?>");
        this.addToCartInterstitialHelper = addToCartInterstitialHelper2;
    }

    public final void setAppBarHelperProvider(C19011a<AppBarHelper> aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.appBarHelperProvider = aVar;
    }

    public final void setCalculateShippingWorkflow(C10554d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.calculateShippingWorkflow = dVar;
    }

    public final void setEligibility(C10156h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.eligibility = hVar;
    }

    public final void setFavoriteHandler(C6896a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.favoriteHandler = aVar;
    }

    public final void setGooglePayHelper(C9303a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.googlePayHelper = aVar;
    }

    public final void setGooglePayUpdatesFilter(IntentFilter intentFilter) {
        C19383o.m32797g(intentFilter, "<set-?>");
        this.googlePayUpdatesFilter = intentFilter;
    }

    public final void setLinkMovementMethod(MovementMethod movementMethod) {
        C19383o.m32797g(movementMethod, "<set-?>");
        this.linkMovementMethod = movementMethod;
    }

    public final void setListingAdapter(C10097b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.listingAdapter = bVar;
    }

    public final void setListingBottomSheetHelper(C10211k kVar) {
        C19383o.m32797g(kVar, "<set-?>");
        this.listingBottomSheetHelper = kVar;
    }

    public final void setListingGlobalLayoutListener(ListingGlobalLayoutListener listingGlobalLayoutListener2) {
        C19383o.m32797g(listingGlobalLayoutListener2, "<set-?>");
        this.listingGlobalLayoutListener = listingGlobalLayoutListener2;
    }

    public final void setListingItemAnimator(C13946a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.listingItemAnimator = aVar;
    }

    public final void setListingItemDecoration(C13947b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.listingItemDecoration = bVar;
    }

    public final void setListingOnScrollEvent(C13948c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.listingOnScrollEvent = cVar;
    }

    public final void setListingScreenScreenshotObserver(ListingScreenScreenshotObserver listingScreenScreenshotObserver2) {
        C19383o.m32797g(listingScreenScreenshotObserver2, "<set-?>");
        this.listingScreenScreenshotObserver = listingScreenScreenshotObserver2;
    }

    public final void setListingViewModelFactory(C10189i iVar) {
        C19383o.m32797g(iVar, "<set-?>");
        this.listingViewModelFactory = iVar;
    }

    public final void setLocalBroadcastManager(C8115a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.localBroadcastManager = aVar;
    }

    public final void setPersistViewedBus(PersistViewedBus persistViewedBus2) {
        C19383o.m32797g(persistViewedBus2, "<set-?>");
        this.persistViewedBus = persistViewedBus2;
    }

    public final void setQualtricsForListingScreen(C13913a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.qualtricsForListingScreen = aVar;
    }

    public final void setResourceProvider(C11786n nVar) {
        C19383o.m32797g(nVar, "<set-?>");
        this.resourceProvider = nVar;
    }

    public final void setSignInForActionResult(C0120c<C12948h> cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.signInForActionResult = cVar;
    }

    public final void setTopPanelHelper(C10661g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.topPanelHelper = gVar;
    }

    public final void setTrackerAdapter(C8710g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.trackerAdapter = gVar;
    }

    public final void setVariationSelectionBottomSheetHelper(C13161e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.variationSelectionBottomSheetHelper = eVar;
    }

    public int softInputMode() {
        return 32;
    }

    public C10082l0.C10083a.C10085b getWindowInsetsOverrides() {
        return C10082l0.C10083a.C10085b.f22218a;
    }
}
