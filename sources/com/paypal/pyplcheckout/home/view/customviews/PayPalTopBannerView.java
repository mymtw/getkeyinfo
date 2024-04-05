package com.paypal.pyplcheckout.home.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.C2399d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2843a0;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.config.flags.C6346d;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addressbook.view.fragments.C17187e;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17199b;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.interfaces.PayPalCompoundHeaderViewListener;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

@SuppressLint({"ViewConstructor"})
public final class PayPalTopBannerView extends LinearLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int OPT_OUT_DURATION = -666167296;
    private static final int OPT_OUT_DURATION_WEEKS = 6;
    public static final String TAG = "PayPalTopBannerView";
    public Map<Integer, View> _$_findViewCache;
    /* access modifiers changed from: private */
    public LinearLayout bannerImage;
    private View bottomSwitchPadding;
    private LinearLayout compoundTopBannerParentContainer;
    private final boolean isAnchoredToBottomSheet;
    private PayPalCompoundHeaderViewListener mPayPalCompoundTopBannerViewListener;
    private C2843a0<Boolean> startupParamsSetObserver;
    private TextView switchView;
    private final C19285c viewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalTopBannerView> cls = PayPalTopBannerView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalCompoundHeaderViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalCompoundHeaderViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalTopBannerView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalCompoundHeaderViewListener);
    }

    /* access modifiers changed from: private */
    public final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35371initViewModelObservers$lambda0(PayPalTopBannerView payPalTopBannerView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        AnimationUtils.fadeOut$default(AnimationUtils.INSTANCE, payPalTopBannerView.bannerImage, 0, 0, new PayPalTopBannerView$initViewModelObservers$1$1(payPalTopBannerView), 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-1  reason: not valid java name */
    public static final void m35372initViewModelObservers$lambda1(PayPalTopBannerView payPalTopBannerView, Boolean bool) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue() && payPalTopBannerView.getViewModel().getContingencyEventsModel().getValue() == null) {
            AnimationUtils.shrink$default(AnimationUtils.INSTANCE, payPalTopBannerView.bannerImage, 0, 0, (Interpolator) null, false, new C17230xf6e6fc20(payPalTopBannerView), 30, (Object) null);
            payPalTopBannerView.releaseAnchors();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-2  reason: not valid java name */
    public static final void m35373initViewModelObservers$lambda2(PayPalTopBannerView payPalTopBannerView, Boolean bool) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            payPalTopBannerView.compoundTopBannerParentContainer.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-3  reason: not valid java name */
    public static final void m35374initViewModelObservers$lambda3(PayPalTopBannerView payPalTopBannerView, Boolean bool) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        C19383o.m32796f(bool, "firebaseConnected");
        if (!bool.booleanValue() || !payPalTopBannerView.shouldShowOptOutLink()) {
            payPalTopBannerView.switchView.setAlpha(0.0f);
            return;
        }
        payPalTopBannerView.setOnClickListener();
        AnimationUtils.fadeIn$default(AnimationUtils.INSTANCE, payPalTopBannerView.switchView, 0, 0, (C19846a) null, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-4  reason: not valid java name */
    public static final void m35375initViewModelObservers$lambda4(PayPalTopBannerView payPalTopBannerView, Boolean bool) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        if (!bool.booleanValue() || DebugConfigManager.getInstance().isOnboardingComplete()) {
            payPalTopBannerView.bannerImage.setVisibility(8);
            payPalTopBannerView.releaseAnchors();
        }
    }

    private final void releaseAnchors() {
        post(new C2399d(this, 9));
    }

    /* access modifiers changed from: private */
    /* renamed from: releaseAnchors$lambda-5  reason: not valid java name */
    public static final void m35376releaseAnchors$lambda5(PayPalTopBannerView payPalTopBannerView) {
        C19383o.m32797g(payPalTopBannerView, "this$0");
        LinearLayout linearLayout = (LinearLayout) payPalTopBannerView.getParent();
        ViewGroup.LayoutParams layoutParams = linearLayout == null ? null : linearLayout.getLayoutParams();
        if (layoutParams != null) {
            CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
            layoutParams2.setAnchorId(-1);
            layoutParams2.gravity = 48;
            if (linearLayout != null) {
                linearLayout.setLayoutParams(layoutParams2);
            }
            payPalTopBannerView.bottomSwitchPadding.setVisibility(8);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    private final void setOnClickListener() {
        this.switchView.setOnClickListener(this);
    }

    private final boolean shouldShowOptOutLink() {
        return getViewModel().isVenice();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public ComponentActivity getComponentActivity(Context context) {
        return ICustomViewsViewModel.DefaultImpls.getComponentActivity(this, context);
    }

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return this.isAnchoredToBottomSheet;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        Events.Companion.getInstance().listen(PayPalEventTypes.START_FINAL_LOADING_ANIMATION, new C17199b(this, 1));
        C6469n nVar = new C6469n(this, 11);
        C6346d dVar = new C6346d(this, 6);
        C9904g gVar = new C9904g(this, 8);
        this.startupParamsSetObserver = new C17187e(this, 4);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, nVar);
        getViewModel().getLogoutCompletedFlag().observe(componentActivity, dVar);
        getViewModel().getFirebaseConnected().observe(componentActivity, gVar);
        C2895z<Boolean> startupParamsSet = getViewModel().getStartupParamsSet();
        C2843a0<Boolean> a0Var = this.startupParamsSetObserver;
        if (a0Var != null) {
            startupParamsSet.observe(componentActivity, a0Var);
        } else {
            C19383o.m32805o("startupParamsSetObserver");
            throw null;
        }
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        PLog.click$default(PEnums.TransitionName.ESCAPE_PATH_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E232, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        PYPLCheckoutUtils.fallbackIndefinite$default(PYPLCheckoutUtils.Companion.getInstance(), TAG, PEnums.FallbackReason.USER_ESCAPE_PATH, PEnums.FallbackCategory.USER_CHOICE, "User chose escape path", PEnums.TransitionName.USER_ESCAPE_PATH, ErrorReason.NONE, (Exception) null, true, 64, (Object) null);
    }

    public void removeListeners() {
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalTopBannerView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalCompoundHeaderViewListener payPalCompoundHeaderViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.isAnchoredToBottomSheet = true;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(getContext(), C17165R.C17169layout.top_banner_container, this);
            this.mPayPalCompoundTopBannerViewListener = payPalCompoundHeaderViewListener;
            View findViewById = findViewById(C17165R.C17167id.paypal_compound_top_banner);
            C19383o.m32796f(findViewById, "findViewById(R.id.paypal_compound_top_banner)");
            this.compoundTopBannerParentContainer = (LinearLayout) findViewById;
            View findViewById2 = findViewById(C17165R.C17167id.switch_checkout_text);
            C19383o.m32796f(findViewById2, "findViewById(R.id.switch_checkout_text)");
            this.switchView = (TextView) findViewById2;
            View findViewById3 = findViewById(C17165R.C17167id.onboarding_wrapper);
            C19383o.m32796f(findViewById3, "findViewById(R.id.onboarding_wrapper)");
            this.bannerImage = (LinearLayout) findViewById3;
            View findViewById4 = findViewById(C17165R.C17167id.switch_bottom_padding);
            C19383o.m32796f(findViewById4, "findViewById(R.id.switch_bottom_padding)");
            this.bottomSwitchPadding = findViewById4;
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
