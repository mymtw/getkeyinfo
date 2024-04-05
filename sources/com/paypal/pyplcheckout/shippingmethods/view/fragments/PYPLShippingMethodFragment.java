package com.paypal.pyplcheckout.shippingmethods.view.fragments;

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
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.shippingmethods.model.ShippingMethodsViewContentPageConfig;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLShippingMethodFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLShippingMethodFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ShippingMethodsViewContentPageConfig mShippingMethodsViewContentPageConfig;
    private MainPaysheetViewModel mViewModel;
    private RelativeLayout shippingMethodsBodyContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> shippingMethodsBottomSheetBehavior;
    private FrameLayout shippingMethodsBottomSheetLayout;
    private RelativeLayout shippingMethodsFooterContainer;
    private RelativeLayout shippingMethodsHeaderContainer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLShippingMethodFragment newInstance() {
            return new PYPLShippingMethodFragment();
        }
    }

    static {
        Class<PYPLShippingMethodFragment> cls = PYPLShippingMethodFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.shippingMethodsBottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLShippingMethodFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("shippingMethodsBottomSheetBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        ShippingMethodsViewContentPageConfig shippingMethodsViewContentPageConfig = this.mShippingMethodsViewContentPageConfig;
        if (shippingMethodsViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = shippingMethodsViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mShippingMethodsViewCont…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.shippingMethodsHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                ShippingMethodsViewContentPageConfig shippingMethodsViewContentPageConfig2 = this.mShippingMethodsViewContentPageConfig;
                if (shippingMethodsViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = shippingMethodsViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mShippingMethodsViewCont…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.shippingMethodsBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        ShippingMethodsViewContentPageConfig shippingMethodsViewContentPageConfig3 = this.mShippingMethodsViewContentPageConfig;
                        if (shippingMethodsViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = shippingMethodsViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mShippingMethodsViewCont…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.shippingMethodsFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("shippingMethodsFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mShippingMethodsViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("shippingMethodsBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mShippingMethodsViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("shippingMethodsHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mShippingMethodsViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragmentBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.fragmentBottomSheetLayout)");
        this.shippingMethodsBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.shippingMethodsHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.shippingMethodsBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.shippingMethodsFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.mShippingMethodsViewContentPageConfig = new ShippingMethodsViewContentPageConfig(context, this, DebugConfigManager.getInstance().getShippingMethodContentPageListener(), DebugConfigManager.getInstance().getShippingMethodContentPage());
        }
        PEnums.TransitionName transitionName = PEnums.TransitionName.SHIPPING_OPTION_RENDER;
        PEnums.Outcome outcome = PEnums.Outcome.SHOWN;
        PEnums.EventCode eventCode = PEnums.EventCode.E103;
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.StateName stateName = PEnums.StateName.SHIPPING_OPTION;
        PLog.impression$default(transitionName2, outcome, eventCode, stateName, (String) null, "review_your_information_screen", "shipping_method_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.transition$default(transitionName2, PEnums.Outcome.SUCCEEDED, PEnums.EventCode.E122, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, "review_your_information_screen", "shipping_method_view", (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15872, (Object) null);
    }

    public static final PYPLShippingMethodFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.shippingMethodsBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.shippingMethodsBottomSheetBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.shippingMethodsBottomSheetBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("shippingMethodsBottomSheetBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("shippingMethodsBottomSheetBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("shippingMethodsBottomSheetLayout");
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

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mViewModel = (MainPaysheetViewModel) new C2870k0(requireActivity()).mo10829a(MainPaysheetViewModel.class);
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_fragment_layout, viewGroup, false);
        C19383o.m32796f(inflate, "view");
        bindViews(inflate);
        return inflate;
    }

    public /* synthetic */ void onDestroyView() {
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
