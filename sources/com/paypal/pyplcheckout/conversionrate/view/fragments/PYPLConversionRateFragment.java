package com.paypal.pyplcheckout.conversionrate.view.fragments;

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
import com.paypal.pyplcheckout.conversionrate.model.ConversionRateViewContentPageConfig;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLConversionRateFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLConversionRateFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FrameLayout conversionBottomSheetLayout;
    private RelativeLayout conversionRateBodyContainer;
    private RelativeLayout conversionRateFooterContainer;
    private RelativeLayout conversionRateHeaderContainer;
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> conversionSheetBottomBehavior;
    private ConversionRateViewContentPageConfig mConversionRateViewContentPageConfig;
    private MainPaysheetViewModel mViewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLConversionRateFragment newInstance() {
            return new PYPLConversionRateFragment();
        }
    }

    static {
        Class<PYPLConversionRateFragment> cls = PYPLConversionRateFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.conversionSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLConversionRateFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("conversionSheetBottomBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        ConversionRateViewContentPageConfig conversionRateViewContentPageConfig = this.mConversionRateViewContentPageConfig;
        if (conversionRateViewContentPageConfig != null) {
            List<ContentView> headerContentViewsList = conversionRateViewContentPageConfig.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "mConversionRateViewConte…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.conversionRateHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                ConversionRateViewContentPageConfig conversionRateViewContentPageConfig2 = this.mConversionRateViewContentPageConfig;
                if (conversionRateViewContentPageConfig2 != null) {
                    List<ContentView> bodyContentViewsList = conversionRateViewContentPageConfig2.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "mConversionRateViewConte…nfig.bodyContentViewsList");
                    RelativeLayout relativeLayout2 = this.conversionRateBodyContainer;
                    if (relativeLayout2 != null) {
                        attachContentViewsToContainer(bodyContentViewsList, relativeLayout2);
                        ConversionRateViewContentPageConfig conversionRateViewContentPageConfig3 = this.mConversionRateViewContentPageConfig;
                        if (conversionRateViewContentPageConfig3 != null) {
                            List<ContentView> footerContentViewsList = conversionRateViewContentPageConfig3.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "mConversionRateViewConte…ig.footerContentViewsList");
                            RelativeLayout relativeLayout3 = this.conversionRateFooterContainer;
                            if (relativeLayout3 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout3);
                            } else {
                                C19383o.m32805o("conversionRateFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("mConversionRateViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("conversionRateBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("mConversionRateViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("conversionRateHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("mConversionRateViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.fragmentBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.fragmentBottomSheetLayout)");
        this.conversionBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.conversionRateHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.conversionRateBodyContainer = (RelativeLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.conversionRateFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        PEnums.TransitionName transitionName = PEnums.TransitionName.CURRENCY_CONVERSION_VIEW_SHOWN;
        PEnums.Outcome outcome = PEnums.Outcome.SHOWN;
        PEnums.EventCode eventCode = PEnums.EventCode.E103;
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.StateName stateName = PEnums.StateName.CURRENCY_CONVERSION;
        PLog.impression$default(transitionName2, outcome, eventCode, stateName, (String) null, "review_your_information_screen", "currency_conversion_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.transition$default(transitionName2, PEnums.Outcome.SUCCEEDED, PEnums.EventCode.E122, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
        Context context = getContext();
        if (context != null) {
            this.mConversionRateViewContentPageConfig = new ConversionRateViewContentPageConfig(context, this, DebugConfigManager.getInstance().getCurrencyConversionContentPageListener(), DebugConfigManager.getInstance().getCurrencyConversionContentPage());
        }
    }

    public static final PYPLConversionRateFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.conversionBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.conversionSheetBottomBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.conversionSheetBottomBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("conversionSheetBottomBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("conversionSheetBottomBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("conversionBottomSheetLayout");
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
}
