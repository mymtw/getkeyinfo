package com.paypal.pyplcheckout.userprofile.view.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C2870k0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.home.view.BaseFragment;
import com.paypal.pyplcheckout.home.view.customviews.AutoCloseBottomSheetBehavior;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.userprofile.model.UserProfileViewContentPageConfig;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PYPLUserProfileFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PYPLUserProfileFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public BottomSheetBehavior<?> profileSheetBottomBehavior;
    private LinearLayout userProfileBodyContainer;
    private FrameLayout userProfileBottomSheetLayout;
    private RelativeLayout userProfileFooterContainer;
    private RelativeLayout userProfileHeaderContainer;
    private UserProfileViewContentPageConfig userProfileViewContentPageConfig;
    private UserViewModel userViewModel;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PYPLUserProfileFragment newInstance() {
            return new PYPLUserProfileFragment();
        }
    }

    static {
        Class<PYPLUserProfileFragment> cls = PYPLUserProfileFragment.class;
    }

    private final void addBottomSheetCallbacks() {
        BottomSheetBehavior<?> bottomSheetBehavior = this.profileSheetBottomBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.addBottomSheetCallback(new PYPLUserProfileFragment$addBottomSheetCallbacks$1(this));
        } else {
            C19383o.m32805o("profileSheetBottomBehavior");
            throw null;
        }
    }

    private final void attachContainerViews() {
        UserProfileViewContentPageConfig userProfileViewContentPageConfig2 = this.userProfileViewContentPageConfig;
        if (userProfileViewContentPageConfig2 != null) {
            List<ContentView> headerContentViewsList = userProfileViewContentPageConfig2.getHeaderContentViewsList();
            C19383o.m32796f(headerContentViewsList, "userProfileViewContentPa…ig.headerContentViewsList");
            RelativeLayout relativeLayout = this.userProfileHeaderContainer;
            if (relativeLayout != null) {
                attachContentViewsToContainer(headerContentViewsList, relativeLayout);
                UserProfileViewContentPageConfig userProfileViewContentPageConfig3 = this.userProfileViewContentPageConfig;
                if (userProfileViewContentPageConfig3 != null) {
                    List<ContentView> bodyContentViewsList = userProfileViewContentPageConfig3.getBodyContentViewsList();
                    C19383o.m32796f(bodyContentViewsList, "userProfileViewContentPa…nfig.bodyContentViewsList");
                    LinearLayout linearLayout = this.userProfileBodyContainer;
                    if (linearLayout != null) {
                        attachContentViewsToContainer(bodyContentViewsList, linearLayout);
                        UserProfileViewContentPageConfig userProfileViewContentPageConfig4 = this.userProfileViewContentPageConfig;
                        if (userProfileViewContentPageConfig4 != null) {
                            List<ContentView> footerContentViewsList = userProfileViewContentPageConfig4.getFooterContentViewsList();
                            C19383o.m32796f(footerContentViewsList, "userProfileViewContentPa…ig.footerContentViewsList");
                            RelativeLayout relativeLayout2 = this.userProfileFooterContainer;
                            if (relativeLayout2 != null) {
                                attachContentViewsToContainer(footerContentViewsList, relativeLayout2);
                            } else {
                                C19383o.m32805o("userProfileFooterContainer");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("userProfileViewContentPageConfig");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("userProfileBodyContainer");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("userProfileViewContentPageConfig");
                    throw null;
                }
            } else {
                C19383o.m32805o("userProfileHeaderContainer");
                throw null;
            }
        } else {
            C19383o.m32805o("userProfileViewContentPageConfig");
            throw null;
        }
    }

    private final void bindViews(View view) {
        View findViewById = view.findViewById(C17165R.C17167id.userProfileBottomSheetLayout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.u…ProfileBottomSheetLayout)");
        this.userProfileBottomSheetLayout = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(C17165R.C17167id.header_container);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.header_container)");
        this.userProfileHeaderContainer = (RelativeLayout) findViewById2;
        View findViewById3 = view.findViewById(C17165R.C17167id.body_container);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.body_container)");
        this.userProfileBodyContainer = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(C17165R.C17167id.footer_container);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.footer_container)");
        this.userProfileFooterContainer = (RelativeLayout) findViewById4;
    }

    private final void init() {
        Context context = getContext();
        if (context != null) {
            this.userProfileViewContentPageConfig = new UserProfileViewContentPageConfig(context, this, DebugConfigManager.getInstance().getUserProfileContentPageListener(), DebugConfigManager.getInstance().getUserProfileContentPage());
        }
        PEnums.TransitionName transitionName = PEnums.TransitionName.USER_PROFILE_SHOWN;
        PEnums.Outcome outcome = PEnums.Outcome.SHOWN;
        PEnums.EventCode eventCode = PEnums.EventCode.E103;
        PEnums.TransitionName transitionName2 = transitionName;
        PEnums.StateName stateName = PEnums.StateName.USER_PROFILE;
        PLog.impression$default(transitionName2, outcome, eventCode, stateName, "user_profile_screen", "user_profile_screen", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 448, (Object) null);
        PLog.transition$default(transitionName2, PEnums.Outcome.SUCCEEDED, PEnums.EventCode.E122, stateName, "review_your_information_screen", (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16352, (Object) null);
    }

    public static final PYPLUserProfileFragment newInstance() {
        return Companion.newInstance();
    }

    private final void setUpBottomSheetBehaviour() {
        AutoCloseBottomSheetBehavior.Companion companion = AutoCloseBottomSheetBehavior.Companion;
        FrameLayout frameLayout = this.userProfileBottomSheetLayout;
        if (frameLayout != null) {
            BottomSheetBehavior<?> from$default = AutoCloseBottomSheetBehavior.Companion.from$default(companion, frameLayout, getOnOutsidePaysheetClick(), (AutoCloseBottomSheetBehavior.BottomSheetSizeChangeListener) null, 4, (Object) null);
            this.profileSheetBottomBehavior = from$default;
            if (from$default != null) {
                from$default.setHideable(false);
                BottomSheetBehavior<?> bottomSheetBehavior = this.profileSheetBottomBehavior;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                } else {
                    C19383o.m32805o("profileSheetBottomBehavior");
                    throw null;
                }
            } else {
                C19383o.m32805o("profileSheetBottomBehavior");
                throw null;
            }
        } else {
            C19383o.m32805o("userProfileBottomSheetLayout");
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
        this.userViewModel = (UserViewModel) new C2870k0(requireActivity()).mo10829a(UserViewModel.class);
        init();
        attachContainerViews();
        setUpBottomSheetBehaviour();
        addBottomSheetCallbacks();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C17165R.C17169layout.pypl_user_profile_fragment, viewGroup, false);
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
