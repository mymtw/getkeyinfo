package com.paypal.pyplcheckout.addressbook.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2870k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.model.ShippingAddressViewContentPageConfig;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.FragmentInfo;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLNewShippingAddressFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLNewShippingAddressFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ShippingAddressViewContentPageConfig mNewAddressBookViewContentPageConfig;
    private MainPaysheetViewModel mViewModel;
    private RelativeLayout newShippingAddressBodyContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> newShippingAddressBottomSheetBehavior;
    private FrameLayout newShippingAddressBottomSheetLayout;
    private RelativeLayout newShippingAddressFooterContainer;
    private RelativeLayout newShippingAddressHeaderContainer;
    private EventListener startFragmentListener = new C17185c(this, 0);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLNewShippingAddressFragment newInstance() {
            return new PYPLNewShippingAddressFragment();
        }
    }

    static {
        Class<PYPLNewShippingAddressFragment> cls = PYPLNewShippingAddressFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLNewShippingAddressFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("newShippingAddressBottomSheetBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        ShippingAddressViewContentPageConfig shippingAddressViewContentPageConfig = this.mNewAddressBookViewContentPageConfig;
        if (shippingAddressViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = shippingAddressViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mNewAddressBookViewConte…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.newShippingAddressHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                ShippingAddressViewContentPageConfig shippingAddressViewContentPageConfig2 = this.mNewAddressBookViewContentPageConfig;
                if (shippingAddressViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = shippingAddressViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mNewAddressBookViewConte…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.newShippingAddressBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        ShippingAddressViewContentPageConfig shippingAddressViewContentPageConfig3 = this.mNewAddressBookViewContentPageConfig;
                        if (shippingAddressViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = shippingAddressViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mNewAddressBookViewConte…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.newShippingAddressFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("newShippingAddressFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mNewAddressBookViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("newShippingAddressBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mNewAddressBookViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mNewAddressBookViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragment_bottom_sheet_layout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.f…ment_bottom_sheet_layout)");
        this.newShippingAddressBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.newShippingAddressHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.newShippingAddressBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.newShippingAddressFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mNewAddressBookViewContentPageConfig = new ShippingAddressViewContentPageConfig(context, this, DebugConfigManager.getInstance().getNewShippingAddressViewListenerImpl(), DebugConfigManager.getInstance().getNewShippingAddressContentPage());
        }
        PLog.impression$default(PEnums.TransitionName.SHIPPING_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void initPYPLReviewFragmentObservers() {
        getEvents().listen(PayPalEventTypes.START_FRAGMENT, this.startFragmentListener);
    }

    public static final PYPLNewShippingAddressFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.newShippingAddressBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.newShippingAddressBottomSheetBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.newShippingAddressBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("newShippingAddressBottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressBottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("newShippingAddressBottomSheetLayout");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: startFragmentListener$lambda-1  reason: not valid java name */
    public static final void m35190startFragmentListener$lambda1(PYPLNewShippingAddressFragment pYPLNewShippingAddressFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLNewShippingAddressFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FragmentInfo fragmentInfo = data instanceof FragmentInfo ? (FragmentInfo) data : null;
        if ((fragmentInfo == null || !ContentRouter.INSTANCE.doesFragmentNotExistOrNull(fragmentInfo.getFragmentId(), fragmentInfo.getFragment())) && pYPLNewShippingAddressFragment.getContext() != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = pYPLNewShippingAddressFragment.newShippingAddressBottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(true);
                BottomSheetBehavior<?> bottomSheetBehavior2 = pYPLNewShippingAddressFragment.newShippingAddressBottomSheetBehavior;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setState(5);
                    ShippingAddressViewContentPageConfig shippingAddressViewContentPageConfig = pYPLNewShippingAddressFragment.mNewAddressBookViewContentPageConfig;
                    if (shippingAddressViewContentPageConfig != null) {
                        shippingAddressViewContentPageConfig.removeContentViewListeners();
                        MainPaysheetViewModel mainPaysheetViewModel = pYPLNewShippingAddressFragment.mViewModel;
                        if (mainPaysheetViewModel != null) {
                            mainPaysheetViewModel.startFragment(pYPLNewShippingAddressFragment.getContext(), fragmentInfo == null ? null : fragmentInfo.getFragmentId());
                            ShippingAddressViewContentPageConfig shippingAddressViewContentPageConfig2 = pYPLNewShippingAddressFragment.mNewAddressBookViewContentPageConfig;
                            if (shippingAddressViewContentPageConfig2 != null) {
                                shippingAddressViewContentPageConfig2.clearHomeScreenViews();
                            } else {
                                C19383o.m32805o("mNewAddressBookViewContentPageConfig");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mViewModel");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("mNewAddressBookViewContentPageConfig");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("newShippingAddressBottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("newShippingAddressBottomSheetBehavior");
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

    public String getViewId() {
        return TAG;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mViewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
        Context context = getContext();
        if (context != null) {
            showKeyboard(context);
        }
        initPYPLReviewFragmentObservers();
        PLog.impression$default(PEnums.TransitionName.NATIVE_ADD_SHIPPING_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E625, PEnums.StateName.ADD_SHIPPING, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_new_shipping_address_fragment_layout, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public void onDestroyView() {
        getEvents().removeListener(PayPalEventTypes.START_FRAGMENT, this.startFragmentListener);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onResume() {
        super.onResume();
        DebugConfigManager instance = DebugConfigManager.getInstance();
        if (instance.getDidCustomTabOpen() && instance.getDidPYPLActivityPause()) {
            if (instance.checkIsFallback() || SdkComponent.Companion.getInstance().getRepository().isCctOpenedForAddingResources()) {
                if (instance.isSmartPaymentCheckout()) {
                    PYPLCheckoutUtils.Companion.getInstance().returnToProvider("", ReturnToProviderOperationType.Cancel.INSTANCE, " cancelling from SmartPaymentCheckout");
                } else {
                    PYPLCheckoutUtils.Companion.getInstance().returnToProvider(SdkComponent.Companion.getInstance().getRepository().getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, "InitiateCheckoutActivity onResume");
                }
                instance.setDidPYPLActivityPause(false);
                instance.setDidCustomTabOpen(false);
            }
        }
    }
}
