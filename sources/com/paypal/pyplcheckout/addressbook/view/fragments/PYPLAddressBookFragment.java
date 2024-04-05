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
import com.paypal.pyplcheckout.addressbook.model.AddressBookViewContentPageConfig;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
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

public final class PYPLAddressBookFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLAddressBookFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RelativeLayout addressBookBodyContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> addressBookBottomSheetBehavior;
    private FrameLayout addressBookBottomSheetLayout;
    private RelativeLayout addressBookFooterContainer;
    private RelativeLayout addressBookHeaderContainer;
    private final PYPLAddressBookFragment$bottomSheetCallback$1 bottomSheetCallback = new PYPLAddressBookFragment$bottomSheetCallback$1(this);
    private AddressBookViewContentPageConfig mAddressBookViewContentPageConfig;
    private MainPaysheetViewModel mViewModel;
    private EventListener startFragmentListener;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLAddressBookFragment newInstance() {
            return new PYPLAddressBookFragment();
        }
    }

    static {
        Class<PYPLAddressBookFragment> cls = PYPLAddressBookFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.addressBookBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
    }

    private final void attachContainerViews() {
        AddressBookViewContentPageConfig addressBookViewContentPageConfig = this.mAddressBookViewContentPageConfig;
        if (addressBookViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = addressBookViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mAddressBookViewContentP…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.addressBookHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                AddressBookViewContentPageConfig addressBookViewContentPageConfig2 = this.mAddressBookViewContentPageConfig;
                if (addressBookViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = addressBookViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mAddressBookViewContentP…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.addressBookBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        AddressBookViewContentPageConfig addressBookViewContentPageConfig3 = this.mAddressBookViewContentPageConfig;
                        if (addressBookViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = addressBookViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mAddressBookViewContentP…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.addressBookFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("addressBookFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mAddressBookViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("addressBookBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mAddressBookViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("addressBookHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mAddressBookViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragmentBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.fragmentBottomSheetLayout)");
        this.addressBookBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.addressBookHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.addressBookBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.addressBookFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mAddressBookViewContentPageConfig = new AddressBookViewContentPageConfig(context, this, DebugConfigManager.getInstance().getAddressBookContentPageListener(), DebugConfigManager.getInstance().getAddressBookContentPage());
        }
        PLog.impression$default(PEnums.TransitionName.SHIPPING_VIEW_SHOWN, PEnums.Outcome.SHOWN, PEnums.EventCode.E103, PEnums.StateName.SHIPPING, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
    }

    private final void initPYPLAddressBookFragmentObservers() {
        this.startFragmentListener = new C17183a(this, 0);
        Events events = getEvents();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.START_FRAGMENT;
        EventListener eventListener = this.startFragmentListener;
        if (eventListener != null) {
            events.listen(payPalEventTypes, eventListener);
        } else {
            C19383o.m32805o("startFragmentListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initPYPLAddressBookFragmentObservers$lambda-2  reason: not valid java name */
    public static final void m35184initPYPLAddressBookFragmentObservers$lambda2(PYPLAddressBookFragment pYPLAddressBookFragment, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLAddressBookFragment, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        FragmentInfo fragmentInfo = data instanceof FragmentInfo ? (FragmentInfo) data : null;
        if ((fragmentInfo == null || !ContentRouter.INSTANCE.doesFragmentNotExistOrNull(fragmentInfo.getFragmentId(), fragmentInfo.getFragment())) && pYPLAddressBookFragment.getContext() != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = pYPLAddressBookFragment.addressBookBottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(true);
            }
            BottomSheetBehavior<?> bottomSheetBehavior2 = pYPLAddressBookFragment.addressBookBottomSheetBehavior;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
            }
            AddressBookViewContentPageConfig addressBookViewContentPageConfig = pYPLAddressBookFragment.mAddressBookViewContentPageConfig;
            if (addressBookViewContentPageConfig != null) {
                addressBookViewContentPageConfig.removeContentViewListeners();
                MainPaysheetViewModel mainPaysheetViewModel = pYPLAddressBookFragment.mViewModel;
                if (mainPaysheetViewModel != null) {
                    mainPaysheetViewModel.startFragment(pYPLAddressBookFragment.getContext(), fragmentInfo == null ? null : fragmentInfo.getFragmentId());
                    AddressBookViewContentPageConfig addressBookViewContentPageConfig2 = pYPLAddressBookFragment.mAddressBookViewContentPageConfig;
                    if (addressBookViewContentPageConfig2 != null) {
                        addressBookViewContentPageConfig2.clearHomeScreenViews();
                    } else {
                        C19383o.m32805o("mAddressBookViewContentPageConfig");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mViewModel");
                    throw null;
                }
            } else {
                C19383o.m32805o("mAddressBookViewContentPageConfig");
                throw null;
            }
        }
    }

    public static final PYPLAddressBookFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.addressBookBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.addressBookBottomSheetBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
            }
            BottomSheetBehavior<?> bottomSheetBehavior = this.addressBookBottomSheetBehavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setState(3);
                return;
            }
            return;
        }
        C19383o.m32805o("addressBookBottomSheetLayout");
        throw null;
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
        initPYPLAddressBookFragmentObservers();
        View view = getView();
        if (view != null) {
            hideKeyboard(view);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_fragment_layout, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public void onDestroyView() {
        Events events = getEvents();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.START_FRAGMENT;
        EventListener eventListener = this.startFragmentListener;
        if (eventListener != null) {
            events.removeListener(payPalEventTypes, eventListener);
            super.onDestroyView();
            _$_clearFindViewByIdCache();
            return;
        }
        C19383o.m32805o("startFragmentListener");
        throw null;
    }

    public void onDetach() {
        super.onDetach();
        BottomSheetBehavior<?> bottomSheetBehavior = this.addressBookBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.removeBottomSheetCallback(this.bottomSheetCallback);
        }
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
