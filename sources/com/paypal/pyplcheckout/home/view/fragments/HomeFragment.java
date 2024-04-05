package com.paypal.pyplcheckout.home.view.fragments;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.etsy.android.p327ui.user.purchases.C11668n;
import com.etsy.android.p327ui.user.purchases.C11669o;
import com.etsy.android.p327ui.user.review.C11709h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.billingagreements.viewmodel.BillingAgreementsViewModel;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.crypto.viewmodel.CryptoViewModel;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.ActivityInfo;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.extensions.NumberExtensionsKt;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.model.HomeViewContentPageConfig;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.view.customviews.C17247k;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.shippingcallbacks.ShippingCallbackHandler;
import com.paypal.pyplcheckout.threeds.model.ThreeDSTopBanner;
import com.paypal.pyplcheckout.utils.ShippingCallbackBlockingBehaviourObserver;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p753kq.C19846a;

public final class HomeFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "HomeFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private AddCardViewModel addCardViewModel;
    private AddressAutoCompleteViewModel addressAutoCompleteViewModel;
    private BillingAgreementsViewModel baViewModel;
    private CryptoViewModel cryptoViewModel;
    public C2870k0.C2872b factory;
    private LinearLayout homeBodyContainer;
    private final HomeFragment$homeBottomSheetCallback$1 homeBottomSheetCallback = new HomeFragment$homeBottomSheetCallback$1(this);
    private RelativeLayout homeBottomSheetLayout;
    private final HomeFragment$homeBottomSheetSizeListener$1 homeBottomSheetSizeListener = new HomeFragment$homeBottomSheetSizeListener$1(this);
    private LinearLayout homeFooterContainer;
    private LinearLayout homeHeaderContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> homeSheetBottomBehavior;
    private LinearLayout homeTopBannerContainer;
    /* access modifiers changed from: private */
    public HomeViewContentPageConfig mHomeViewContentPageConfig;
    private MainPaysheetViewModel mainPaysheetViewModel;
    private final C19285c screenHeight$delegate = C19350d.m32677b(new HomeFragment$screenHeight$2(this));
    public ShippingCallbackHandler shippingCallbackHandler;
    /* access modifiers changed from: private */
    public MainPaysheetViewModel viewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HomeFragment newInstance() {
            return new HomeFragment();
        }
    }

    static {
        Class<HomeFragment> cls = HomeFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.homeSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(this.homeBottomSheetCallback);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ObjectAnimatorBinding"})
    public final void animatePeekHeight(int i) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.homeSheetBottomBehavior, "peekHeight", new int[]{i});
        ofInt.setInterpolator(new C17254a());
        ofInt.setDuration(1000);
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: animatePeekHeight$lambda-1$lambda-0  reason: not valid java name */
    public static final float m35410animatePeekHeight$lambda1$lambda0(float f) {
        return (f * ((float) 30)) / 0.3f;
    }

    private final void attachContainerViews() {
        HomeViewContentPageConfig homeViewContentPageConfig = this.mHomeViewContentPageConfig;
        if (homeViewContentPageConfig != null) {
            List<ContentView> topBannerContentViewsList = homeViewContentPageConfig.getTopBannerContentViewsList();
            C19383o.m32796f(topBannerContentViewsList, "mHomeViewContentPageConf…topBannerContentViewsList");
            LinearLayout linearLayout = this.homeTopBannerContainer;
            if (linearLayout != null) {
                attachContentViewsToContainer(topBannerContentViewsList, linearLayout);
                HomeViewContentPageConfig homeViewContentPageConfig2 = this.mHomeViewContentPageConfig;
                if (homeViewContentPageConfig2 != null) {
                    List<ContentView> headerContentViewsList = homeViewContentPageConfig2.getHeaderContentViewsList();
                    C19383o.m32796f(headerContentViewsList, "mHomeViewContentPageConfig.headerContentViewsList");
                    LinearLayout linearLayout2 = this.homeHeaderContainer;
                    if (linearLayout2 != null) {
                        attachContentViewsToContainer(headerContentViewsList, linearLayout2);
                        HomeViewContentPageConfig homeViewContentPageConfig3 = this.mHomeViewContentPageConfig;
                        if (homeViewContentPageConfig3 != null) {
                            List<ContentView> bodyContentViewsList = homeViewContentPageConfig3.getBodyContentViewsList();
                            C19383o.m32796f(bodyContentViewsList, "mHomeViewContentPageConfig.bodyContentViewsList");
                            LinearLayout linearLayout3 = this.homeBodyContainer;
                            if (linearLayout3 != null) {
                                attachContentViewsToContainer(bodyContentViewsList, linearLayout3);
                                HomeViewContentPageConfig homeViewContentPageConfig4 = this.mHomeViewContentPageConfig;
                                if (homeViewContentPageConfig4 != null) {
                                    List<ContentView> footerContentViewsList = homeViewContentPageConfig4.getFooterContentViewsList();
                                    C19383o.m32796f(footerContentViewsList, "mHomeViewContentPageConfig.footerContentViewsList");
                                    LinearLayout linearLayout4 = this.homeFooterContainer;
                                    if (linearLayout4 != null) {
                                        attachContentViewsToContainer(footerContentViewsList, linearLayout4);
                                    } else {
                                        C19383o.m32805o("homeFooterContainer");
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("mHomeViewContentPageConfig");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("homeBodyContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mHomeViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("homeHeaderContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mHomeViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("homeTopBannerContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mHomeViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.payment_bottom_sheet_id);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.payment_bottom_sheet_id)");
        this.homeBottomSheetLayout = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.top_banner_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.top_banner_container)");
        this.homeTopBannerContainer = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.header_container)");
        this.homeHeaderContainer = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.body_container)");
        this.homeBodyContainer = (LinearLayout) findViewById4;
        View findViewById5 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.footer_container)");
        this.homeFooterContainer = (LinearLayout) findViewById5;
        LinearLayout linearLayout = this.homeBodyContainer;
        if (linearLayout != null) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
            linearLayout.setLayoutTransition(layoutTransition);
            return;
        }
        C19383o.m32805o("homeBodyContainer");
        throw null;
    }

    private final int getScreenHeight() {
        return ((Number) this.screenHeight$delegate.getValue()).intValue();
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mHomeViewContentPageConfig = new HomeViewContentPageConfig(context, this, DebugConfigManager.getInstance().getHomeContentPage(), DebugConfigManager.getInstance().getHomeContentPageListener());
        }
    }

    @SuppressLint({"DefaultLocale", "FragmentLiveDataObserve"})
    private final void initPYPLHomeViewModelObservers() {
        getEvents().listen(PayPalEventTypes.START_ACTIVITY_AND_HIDE_PAY_SHEET, new C17247k(this, 2));
        getEvents().listen(PayPalEventTypes.START_FRAGMENT, new HomeFragment$initPYPLHomeViewModelObservers$2(this));
        C11668n nVar = new C11668n(this, 3);
        C11669o oVar = new C11669o(this, 3);
        MainPaysheetViewModel mainPaysheetViewModel2 = this.viewModel;
        if (mainPaysheetViewModel2 != null) {
            C2895z<Boolean> fetchingUserDataCompletedFlag = mainPaysheetViewModel2.getFetchingUserDataCompletedFlag();
            if (fetchingUserDataCompletedFlag != null) {
                fetchingUserDataCompletedFlag.observe(getViewLifecycleOwner(), nVar);
            }
            getShippingCallbackHandler().getHomeScreenBlockingFlag().observe(getViewLifecycleOwner(), new ShippingCallbackBlockingBehaviourObserver());
            MainPaysheetViewModel mainPaysheetViewModel3 = this.viewModel;
            if (mainPaysheetViewModel3 != null) {
                C2895z<Boolean> logoutCompletedFlag = mainPaysheetViewModel3.getLogoutCompletedFlag();
                if (logoutCompletedFlag != null) {
                    logoutCompletedFlag.observe(getViewLifecycleOwner(), oVar);
                    return;
                }
                return;
            }
            C19383o.m32805o("viewModel");
            throw null;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: initPYPLHomeViewModelObservers$lambda-10  reason: not valid java name */
    public static final void m35411initPYPLHomeViewModelObservers$lambda10(HomeFragment homeFragment, Boolean bool) {
        C19383o.m32797g(homeFragment, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            RelativeLayout relativeLayout = homeFragment.homeBottomSheetLayout;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            } else {
                C19383o.m32805o("homeBottomSheetLayout");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initPYPLHomeViewModelObservers$lambda-8  reason: not valid java name */
    public static final void m35412initPYPLHomeViewModelObservers$lambda8(HomeFragment homeFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(homeFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        ActivityInfo activityInfo = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof ActivityInfo) {
            activityInfo = (ActivityInfo) data;
        }
        if (activityInfo != null) {
            ContentRouter contentRouter = ContentRouter.INSTANCE;
            Context context = homeFragment.getContext();
            if (context != null) {
                contentRouter.startActivityAndHidePaySheet((AppCompatActivity) context, activityInfo.getIntent());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initPYPLHomeViewModelObservers$lambda-9  reason: not valid java name */
    public static final void m35413initPYPLHomeViewModelObservers$lambda9(HomeFragment homeFragment, Boolean bool) {
        HomeFragment homeFragment2 = homeFragment;
        C19383o.m32797g(homeFragment2, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue()) {
            LinearLayout linearLayout = homeFragment2.homeFooterContainer;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                LinearLayout linearLayout2 = homeFragment2.homeHeaderContainer;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                    PEnums.TransitionName transitionName = PEnums.TransitionName.GRAPH_QL_PAYLOAD;
                    PEnums.Outcome outcome = PEnums.Outcome.SUCCEEDED;
                    PEnums.EventCode eventCode = PEnums.EventCode.E130;
                    PEnums.StateName stateName = PEnums.StateName.REVIEW;
                    PLog.decision$default(transitionName, outcome, eventCode, stateName, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
                    BottomSheetBehavior<?> bottomSheetBehavior = homeFragment2.homeSheetBottomBehavior;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setState(3);
                    }
                    PLog.impression$default(PEnums.TransitionName.REVIEW_YOUR_INFORMATION_SCREEN_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, stateName, "review_your_information_screen", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
                    return;
                }
                C19383o.m32805o("homeHeaderContainer");
                throw null;
            }
            C19383o.m32805o("homeFooterContainer");
            throw null;
        }
    }

    public static final HomeFragment newInstance() {
        return Companion.newInstance();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m35414onCreate$lambda2(HomeFragment homeFragment, AddCardViewModel.AddCardAlertUiModel addCardAlertUiModel) {
        C19383o.m32797g(homeFragment, "this$0");
        if (addCardAlertUiModel instanceof AddCardViewModel.AddCardAlertUiModel.Error) {
            C19383o.m32796f(addCardAlertUiModel, "alertView");
            homeFragment.showAddCardErrorAlert(addCardAlertUiModel);
        } else if (addCardAlertUiModel instanceof AddCardViewModel.AddCardAlertUiModel.Success) {
            C19383o.m32796f(addCardAlertUiModel, "alertView");
            homeFragment.showAddCardSuccessAlert(addCardAlertUiModel);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        AnyExtensionsKt.getExhaustive(C19394m.f43287a);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3  reason: not valid java name */
    public static final void m35415onCreate$lambda3(HomeFragment homeFragment, ThreeDSTopBanner threeDSTopBanner) {
        C19383o.m32797g(homeFragment, "this$0");
        homeFragment.showThreeDSError(threeDSTopBanner.getHasExtraFI());
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        RelativeLayout relativeLayout = this.homeBottomSheetLayout;
        if (relativeLayout != null) {
            this.homeSheetBottomBehavior = companion.from(relativeLayout, getOnOutsidePaysheetClick(), this.homeBottomSheetSizeListener);
            RelativeLayout relativeLayout2 = this.homeBottomSheetLayout;
            if (relativeLayout2 != null) {
                Context requireContext = requireContext();
                Object obj = C8184a.f17966a;
                relativeLayout2.setBackgroundColor(C8184a.C8188d.m16468a(requireContext, 17170445));
                addBottomSheetCallbacks();
                return;
            }
            C19383o.m32805o("homeBottomSheetLayout");
            throw null;
        }
        C19383o.m32805o("homeBottomSheetLayout");
        throw null;
    }

    private final void showAddCardErrorAlert(AddCardViewModel.AddCardAlertUiModel addCardAlertUiModel) {
        if (addCardAlertUiModel instanceof AddCardViewModel.AddCardAlertUiModel.Error.Generic) {
            showAlertToast(new AlertToast.ErrorNoIcon(addCardAlertUiModel.getHeader(), addCardAlertUiModel.getDescription()));
        } else if (addCardAlertUiModel instanceof AddCardViewModel.AddCardAlertUiModel.Error.Validation) {
            showAlertToast(new AlertToast.ErrorNoIcon((String) null, addCardAlertUiModel.getDescription()));
        } else {
            showAlertToast(new AlertToast.Error(addCardAlertUiModel.getHeader(), addCardAlertUiModel.getDescription()));
        }
    }

    private final void showAddCardSuccessAlert(AddCardViewModel.AddCardAlertUiModel addCardAlertUiModel) {
        showAlertToast(new AlertToast.Success((String) null, addCardAlertUiModel.getDescription()));
    }

    private final void showThreeDSError(boolean z) {
        String str;
        Resources resources;
        Resources resources2;
        if (z) {
            Context context = getContext();
            if (!(context == null || (resources2 = context.getResources()) == null)) {
                str = resources2.getString(C17165R.string.three_ds_transaction_error_with_fi);
                showAlertToast(new AlertToast.Error((String) null, str));
            }
        } else {
            Context context2 = getContext();
            if (!(context2 == null || (resources = context2.getResources()) == null)) {
                str = resources.getString(C17165R.string.three_ds_transaction_error_no_fi);
                showAlertToast(new AlertToast.Error((String) null, str));
            }
        }
        str = null;
        showAlertToast(new AlertToast.Error((String) null, str));
    }

    /* access modifiers changed from: private */
    public final void updateBannerVisibilityOnHeightChange(int i) {
        LinearLayout linearLayout = this.homeTopBannerContainer;
        if (linearLayout != null) {
            if (NumberExtensionsKt.getPx(16) + ((float) (linearLayout.getHeight() + i)) >= ((float) getScreenHeight())) {
                AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                LinearLayout linearLayout2 = this.homeTopBannerContainer;
                if (linearLayout2 != null) {
                    AnimationUtils.fadeOut$default(animationUtils, linearLayout2, 100, 0, (C19846a) null, 12, (Object) null);
                } else {
                    C19383o.m32805o("homeTopBannerContainer");
                    throw null;
                }
            } else {
                AnimationUtils animationUtils2 = AnimationUtils.INSTANCE;
                LinearLayout linearLayout3 = this.homeTopBannerContainer;
                if (linearLayout3 != null) {
                    AnimationUtils.fadeIn$default(animationUtils2, linearLayout3, 100, 0, (C19846a) null, 12, (Object) null);
                } else {
                    C19383o.m32805o("homeTopBannerContainer");
                    throw null;
                }
            }
        } else {
            C19383o.m32805o("homeTopBannerContainer");
            throw null;
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

    public final C2870k0.C2872b getFactory() {
        C2870k0.C2872b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("factory");
        throw null;
    }

    public final ShippingCallbackHandler getShippingCallbackHandler() {
        ShippingCallbackHandler shippingCallbackHandler2 = this.shippingCallbackHandler;
        if (shippingCallbackHandler2 != null) {
            return shippingCallbackHandler2;
        }
        C19383o.m32805o("shippingCallbackHandler");
        throw null;
    }

    public String getViewId() {
        return TAG;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle == null) {
            Class<HomeFragment> cls = HomeFragment.class;
            PLog.decision$default(PEnums.TransitionName.NATIVE_XO_ENTRY, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.REVIEW, "HomeFragment", (String) null, DebugConfigManager.getInstance().getReferrerPackage() == null ? "no referrer info available" : String.valueOf(DebugConfigManager.getInstance().getReferrerPackage()), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
            this.baViewModel = (BillingAgreementsViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(BillingAgreementsViewModel.class);
            this.viewModel = (MainPaysheetViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(MainPaysheetViewModel.class);
            this.cryptoViewModel = (CryptoViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(CryptoViewModel.class);
            Lifecycle lifecycle = getLifecycle();
            MainPaysheetViewModel mainPaysheetViewModel2 = this.viewModel;
            if (mainPaysheetViewModel2 != null) {
                lifecycle.mo10733a(mainPaysheetViewModel2);
                Lifecycle lifecycle2 = getLifecycle();
                CryptoViewModel cryptoViewModel2 = this.cryptoViewModel;
                if (cryptoViewModel2 != null) {
                    lifecycle2.mo10733a(cryptoViewModel2);
                    init();
                    attachContainerViews();
                    setUpBottomSheetBehaviour();
                    initPYPLHomeViewModelObservers();
                    Context context = getContext();
                    if (context != null) {
                        Cache.INSTANCE.clearAddShippingData(context);
                        return;
                    }
                    return;
                }
                C19383o.m32805o("cryptoViewModel");
                throw null;
            }
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    public void onAttach(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.onAttach(context);
        SdkComponentKt.inject(this);
        this.addCardViewModel = (AddCardViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(AddCardViewModel.class);
        this.addressAutoCompleteViewModel = (AddressAutoCompleteViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(AddressAutoCompleteViewModel.class);
        this.mainPaysheetViewModel = (MainPaysheetViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(MainPaysheetViewModel.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AddCardViewModel addCardViewModel2 = this.addCardViewModel;
        if (addCardViewModel2 != null) {
            addCardViewModel2.getAddCardAlertUiModel().observe(this, new C9580d(this, 7));
            MainPaysheetViewModel mainPaysheetViewModel2 = this.mainPaysheetViewModel;
            if (mainPaysheetViewModel2 != null) {
                mainPaysheetViewModel2.getThreeDSErrorBanner().observe(this, new C11709h(this, 6));
            } else {
                C19383o.m32805o("mainPaysheetViewModel");
                throw null;
            }
        } else {
            C19383o.m32805o("addCardViewModel");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_home_fragment, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onDetach() {
        super.onDetach();
        BottomSheetBehavior<?> bottomSheetBehavior = this.homeSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.removeBottomSheetCallback(this.homeBottomSheetCallback);
        }
    }

    public final void setFactory(C2870k0.C2872b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.factory = bVar;
    }

    public final void setShippingCallbackHandler(ShippingCallbackHandler shippingCallbackHandler2) {
        C19383o.m32797g(shippingCallbackHandler2, "<set-?>");
        this.shippingCallbackHandler = shippingCallbackHandler2;
    }
}
