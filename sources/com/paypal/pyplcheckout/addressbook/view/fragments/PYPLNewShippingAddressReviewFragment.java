package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2880m0;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.AddressReviewState;
import com.paypal.pyplcheckout.addressbook.model.ShippingAddressReviewViewContentPageConfig;
import com.paypal.pyplcheckout.addressbook.view.customviews.PayPalNewShippingAddressReviewView;
import com.paypal.pyplcheckout.addressbook.viewmodel.AddressReviewViewModel;
import com.paypal.pyplcheckout.addshipping.AddressAutoCompleteViewModel;
import com.paypal.pyplcheckout.addshipping.ShippingUtils;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.view.customviews.alertview.AlertToast;
import com.paypal.pyplcheckout.home.view.fragments.HomeFragment;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.NewShippingAddressRequest;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLNewShippingAddressReviewFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLNewShippingAddressReviewFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final EventListener addNewAddressRequestListener = new C17190h(this, 0);
    private AddressAutoCompleteViewModel addressAutoCompleteViewModel;
    private final C2843a0<AddressReviewState> addressReviewStateObserver = new C17187e(this, 0);
    private AddressReviewViewModel addressReviewViewModel;
    public C2870k0.C2872b factory;
    private ShippingAddressReviewViewContentPageConfig newAddressReviewViewContentPageConfig;
    private RelativeLayout newShippingAddressReviewBodyContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> newShippingAddressReviewBottomSheetBehavior;
    private FrameLayout newShippingAddressReviewBottomSheetLayout;
    private RelativeLayout newShippingAddressReviewFooterContainer;
    private RelativeLayout newShippingAddressReviewHeaderContainer;
    private final EventListener shippingAddressEventListener = new C17189g(this, 0);
    private EventListener startFragmentListener = new C17188f(this, 0);
    private MainPaysheetViewModel viewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLNewShippingAddressReviewFragment newInstance() {
            return new PYPLNewShippingAddressReviewFragment();
        }
    }

    static {
        Class<PYPLNewShippingAddressReviewFragment> cls = PYPLNewShippingAddressReviewFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressReviewBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLNewShippingAddressReviewFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addNewAddressRequestListener$lambda-7  reason: not valid java name */
    public static final void m35192addNewAddressRequestListener$lambda7(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLNewShippingAddressReviewFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        NewShippingAddressRequest newShippingAddressRequest = data instanceof NewShippingAddressRequest ? (NewShippingAddressRequest) data : null;
        MainPaysheetViewModel mainPaysheetViewModel = pYPLNewShippingAddressReviewFragment.viewModel;
        if (mainPaysheetViewModel != null) {
            mainPaysheetViewModel.addNewAddress(newShippingAddressRequest);
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addressReviewStateObserver$lambda-0  reason: not valid java name */
    public static final void m35193addressReviewStateObserver$lambda0(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment, AddressReviewState addressReviewState) {
        C19383o.m32797g(pYPLNewShippingAddressReviewFragment, "this$0");
        C19383o.m32796f(addressReviewState, "addressReviewState");
        pYPLNewShippingAddressReviewFragment.onAddressReviewState(addressReviewState);
    }

    private final void attachContainerViews() {
        ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig = this.newAddressReviewViewContentPageConfig;
        if (shippingAddressReviewViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = shippingAddressReviewViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "newAddressReviewViewCont…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.newShippingAddressReviewHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig2 = this.newAddressReviewViewContentPageConfig;
                if (shippingAddressReviewViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = shippingAddressReviewViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "newAddressReviewViewCont…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.newShippingAddressReviewBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig3 = this.newAddressReviewViewContentPageConfig;
                        if (shippingAddressReviewViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = shippingAddressReviewViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "newAddressReviewViewCont…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.newShippingAddressReviewFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("newShippingAddressReviewFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("newAddressReviewViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("newShippingAddressReviewBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("newAddressReviewViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressReviewHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("newAddressReviewViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragmentBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.fragmentBottomSheetLayout)");
        this.newShippingAddressReviewBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.newShippingAddressReviewHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.newShippingAddressReviewBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.newShippingAddressReviewFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void handleAddShippingSuccess() {
        MainPaysheetViewModel mainPaysheetViewModel = this.viewModel;
        if (mainPaysheetViewModel != null) {
            mainPaysheetViewModel.updateSelectedAddress(0);
            ShippingUtils.INSTANCE.runOnUiThread(new PYPLNewShippingAddressReviewFragment$handleAddShippingSuccess$1(this));
            return;
        }
        C19383o.m32805o("viewModel");
        throw null;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.newAddressReviewViewContentPageConfig = new ShippingAddressReviewViewContentPageConfig(context, this, DebugConfigManager.getInstance().getNewShippingAddressReviewViewListenerImpl(), DebugConfigManager.getInstance().getNewShippingAddressReviewContentPage());
        }
        PLog.impression$default(PEnums.TransitionName.SHIPPING_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void initPYPLReviewFragmentObservers() {
        getEvents().listen(PayPalEventTypes.START_FRAGMENT, this.startFragmentListener);
        getEvents().listen(PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT, this.shippingAddressEventListener);
        getEvents().listen(PayPalEventTypes.NEW_SHIPPING_ADDRESS_REQUESTED, this.addNewAddressRequestListener);
    }

    private final void initViewModelObservers() {
        AddressReviewViewModel addressReviewViewModel2 = this.addressReviewViewModel;
        if (addressReviewViewModel2 != null) {
            addressReviewViewModel2.getAddressReviewState().observe(getViewLifecycleOwner(), this.addressReviewStateObserver);
        } else {
            C19383o.m32805o("addressReviewViewModel");
            throw null;
        }
    }

    private final void navigateToHomeFragment() {
        View view = getView();
        if (view != null) {
            hideKeyboard(view);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressReviewBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(true);
            BottomSheetBehavior<?> bottomSheetBehavior2 = this.newShippingAddressReviewBottomSheetBehavior;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
                removeListenersAndClearViews();
                Cache cache = Cache.INSTANCE;
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                cache.clearAddShippingData(requireContext);
                MainPaysheetViewModel mainPaysheetViewModel = this.viewModel;
                if (mainPaysheetViewModel != null) {
                    mainPaysheetViewModel.startFragment(getContext(), HomeFragment.TAG);
                } else {
                    C19383o.m32805o("viewModel");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
            throw null;
        }
    }

    public static final PYPLNewShippingAddressReviewFragment newInstance() {
        return Companion.newInstance();
    }

    private final void onAddressReviewState(AddressReviewState addressReviewState) {
        if (!(addressReviewState instanceof AddressReviewState.Loading)) {
            if (addressReviewState instanceof AddressReviewState.ShowAddressSuccess) {
                hideKeyboard();
                BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressReviewBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setHideable(true);
                    BottomSheetBehavior<?> bottomSheetBehavior2 = this.newShippingAddressReviewBottomSheetBehavior;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.setState(5);
                        removeListenersAndClearViews();
                        MainPaysheetViewModel mainPaysheetViewModel = this.viewModel;
                        if (mainPaysheetViewModel != null) {
                            mainPaysheetViewModel.updateSelectedAddress(0);
                            navigateToHomeFragment();
                            return;
                        }
                        C19383o.m32805o("viewModel");
                        throw null;
                    }
                    C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                    throw null;
                }
                C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                throw null;
            } else if (addressReviewState instanceof AddressReviewState.ShowError) {
                showAlertToast(new AlertToast.ErrorNoIcon((String) null, getString(((AddressReviewState.ShowError) addressReviewState).getErrorMessage())));
            } else if (addressReviewState instanceof AddressReviewState.ShowAddressSuggestion) {
                hideKeyboard();
                ContentRouter contentRouter = ContentRouter.INSTANCE;
                Context requireContext = requireContext();
                C19383o.m32796f(requireContext, "requireContext()");
                contentRouter.gotoFragment(requireContext, PYPLAddressRecommendationFragment.TAG);
            }
        }
    }

    private final void removeListenersAndClearViews() {
        ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig = this.newAddressReviewViewContentPageConfig;
        if (shippingAddressReviewViewContentPageConfig != null) {
            shippingAddressReviewViewContentPageConfig.removeContentViewListeners();
            ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig2 = this.newAddressReviewViewContentPageConfig;
            if (shippingAddressReviewViewContentPageConfig2 != null) {
                shippingAddressReviewViewContentPageConfig2.clearHomeScreenViews();
            } else {
                C19383o.m32805o("newAddressReviewViewContentPageConfig");
                throw null;
            }
        } else {
            C19383o.m32805o("newAddressReviewViewContentPageConfig");
            throw null;
        }
    }

    private final void setTitle() {
        Context context = getContext();
        if (context != null) {
            Cache cache = Cache.INSTANCE;
            String string = requireContext().getString(C17165R.string.paypal_checkout_add_shipping_address);
            C19383o.m32796f(string, "requireContext().getStri…out_add_shipping_address)");
            cache.cacheSearchScreenTitle(context, string);
        }
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.newShippingAddressReviewBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.newShippingAddressReviewBottomSheetBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressReviewBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("newShippingAddressReviewBottomSheetLayout");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: shippingAddressEventListener$lambda-5  reason: not valid java name */
    public static final void m35194shippingAddressEventListener$lambda5(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLNewShippingAddressReviewFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            MainPaysheetViewModel mainPaysheetViewModel = pYPLNewShippingAddressReviewFragment.viewModel;
            if (mainPaysheetViewModel != null) {
                mainPaysheetViewModel.updateShippingAddressList(list);
                pYPLNewShippingAddressReviewFragment.handleAddShippingSuccess();
                pYPLNewShippingAddressReviewFragment.navigateToHomeFragment();
            } else {
                C19383o.m32805o("viewModel");
                throw null;
            }
        }
        if ((resultData instanceof Error ? (Error) resultData : null) != null) {
            ShippingUtils.INSTANCE.runOnUiThread(new C17182xe2d572a1(pYPLNewShippingAddressReviewFragment));
            pYPLNewShippingAddressReviewFragment.navigateToHomeFragment();
        }
        Cache cache = Cache.INSTANCE;
        Context requireContext = pYPLNewShippingAddressReviewFragment.requireContext();
        C19383o.m32796f(requireContext, "requireContext()");
        cache.clearAddShippingData(requireContext);
        MainPaysheetViewModel mainPaysheetViewModel2 = pYPLNewShippingAddressReviewFragment.viewModel;
        if (mainPaysheetViewModel2 != null) {
            mainPaysheetViewModel2.startFragment(pYPLNewShippingAddressReviewFragment.getContext(), HomeFragment.TAG);
        } else {
            C19383o.m32805o("viewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startFragmentListener$lambda-2  reason: not valid java name */
    public static final void m35195startFragmentListener$lambda2(PYPLNewShippingAddressReviewFragment pYPLNewShippingAddressReviewFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLNewShippingAddressReviewFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FragmentInfo fragmentInfo = data instanceof FragmentInfo ? (FragmentInfo) data : null;
        if ((fragmentInfo == null || !ContentRouter.INSTANCE.doesFragmentNotExistOrNull(fragmentInfo.getFragmentId(), fragmentInfo.getFragment())) && pYPLNewShippingAddressReviewFragment.getContext() != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = pYPLNewShippingAddressReviewFragment.newShippingAddressReviewBottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(true);
                BottomSheetBehavior<?> bottomSheetBehavior2 = pYPLNewShippingAddressReviewFragment.newShippingAddressReviewBottomSheetBehavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(5);
                    ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig = pYPLNewShippingAddressReviewFragment.newAddressReviewViewContentPageConfig;
                    if (shippingAddressReviewViewContentPageConfig != null) {
                        shippingAddressReviewViewContentPageConfig.removeContentViewListeners();
                        MainPaysheetViewModel mainPaysheetViewModel = pYPLNewShippingAddressReviewFragment.viewModel;
                        if (mainPaysheetViewModel != null) {
                            mainPaysheetViewModel.startFragment(pYPLNewShippingAddressReviewFragment.getContext(), fragmentInfo == null ? null : fragmentInfo.getFragmentId());
                            ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig2 = pYPLNewShippingAddressReviewFragment.newAddressReviewViewContentPageConfig;
                            if (shippingAddressReviewViewContentPageConfig2 != null) {
                                shippingAddressReviewViewContentPageConfig2.clearHomeScreenViews();
                            } else {
                                C19383o.m32805o("newAddressReviewViewContentPageConfig");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("viewModel");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("newAddressReviewViewContentPageConfig");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressReviewBottomSheetBehavior");
                throw null;
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

    public final C2870k0.C2872b getFactory() {
        C2870k0.C2872b bVar = this.factory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("factory");
        throw null;
    }

    public String getViewId() {
        return TAG;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        PLog.impression$default(PEnums.TransitionName.NATIVE_ADD_SHIPPING_NEW_SHIPPING_ADDRESS_RENDER, PEnums.Outcome.SHOWN, PEnums.EventCode.E625, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        this.viewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        this.addressAutoCompleteViewModel = (AddressAutoCompleteViewModel) new C2870k0(requireActivity()).mo10829a(AddressAutoCompleteViewModel.class);
        this.addressReviewViewModel = (AddressReviewViewModel) new C2870k0((C2880m0) requireActivity(), getFactory()).mo10829a(AddressReviewViewModel.class);
        init();
        initViewModelObservers();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
        setTitle();
    }

    public void onAttach(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        super.onAttach(context);
        SdkComponentKt.inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_new_shipping_address_review_fragment_layout, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        initPYPLReviewFragmentObservers();
        FragmentActivity activity = getActivity();
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        return inflate;
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            hideKeyboard(view);
        }
        getEvents().removeListener(PayPalEventTypes.NEW_SHIPPING_ADDRESS_REQUESTED, this.addNewAddressRequestListener);
        getEvents().removeListener(PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT, this.shippingAddressEventListener);
        getEvents().removeListener(PayPalEventTypes.START_FRAGMENT, this.startFragmentListener);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onResume() {
        super.onResume();
        DebugConfigManager instance = DebugConfigManager.getInstance();
        if (instance.getDidCustomTabOpen() && instance.getDidPYPLActivityPause() && (instance.checkIsFallback() || SdkComponent.Companion.getInstance().getRepository().isCctOpenedForAddingResources())) {
            if (instance.isSmartPaymentCheckout()) {
                PYPLCheckoutUtils.Companion.getInstance().returnToProvider("", ReturnToProviderOperationType.Cancel.INSTANCE, " cancelling from SmartPaymentCheckout");
            } else {
                PYPLCheckoutUtils.Companion.getInstance().returnToProvider(SdkComponent.Companion.getInstance().getRepository().getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, "InitiateCheckoutActivity onResume");
            }
            instance.setDidPYPLActivityPause(false);
            instance.setDidCustomTabOpen(false);
        }
        ShippingAddressReviewViewContentPageConfig shippingAddressReviewViewContentPageConfig = this.newAddressReviewViewContentPageConfig;
        if (shippingAddressReviewViewContentPageConfig != null) {
            List<ContentView> bodyContentViewsList = shippingAddressReviewViewContentPageConfig.getBodyContentViewsList();
            C19383o.m32796f(bodyContentViewsList, "newAddressReviewViewCont…nfig.bodyContentViewsList");
            for (ContentView contentView : bodyContentViewsList) {
                PayPalNewShippingAddressReviewView payPalNewShippingAddressReviewView = contentView instanceof PayPalNewShippingAddressReviewView ? (PayPalNewShippingAddressReviewView) contentView : null;
                if (payPalNewShippingAddressReviewView != null) {
                    payPalNewShippingAddressReviewView.populateView();
                }
            }
            return;
        }
        C19383o.m32805o("newAddressReviewViewContentPageConfig");
        throw null;
    }

    public void onStop() {
        super.onStop();
        hideKeyboard();
    }

    public final void setFactory(C2870k0.C2872b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.factory = bVar;
    }
}
