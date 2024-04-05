package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C2783s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import androidx.room.C3225d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.datatransport.runtime.scheduling.persistence.C6591i;
import com.google.logging.type.LogSeverity;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonColor;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.interfaces.VmLogoutListener;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.userprofile.view.fragments.PYPLUserProfileFragment;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalLogoutViewListener;
import com.paypal.pyplcheckout.utils.DialogMaker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ViewConstructor"})
public final class PayPalLogoutView extends RelativeLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalLogoutView";
    public Map<Integer, View> _$_findViewCache;
    private final Fragment fragment;
    private ProgressBar logoutProgressSpinner;
    private PayPalLogoutViewListener mPayPalLogoutViewListener;
    private final PayPalActionButton userProfileLogoutButton;
    private final C19285c viewModel$delegate;
    private VmLogoutListener vmLogoutListener;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalLogoutView> cls = PayPalLogoutView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalLogoutViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalLogoutViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalLogoutViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalLogoutView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalLogoutViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalLogoutView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalLogoutViewListener payPalLogoutViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalLogoutViewListener);
    }

    private final MainPaysheetViewModel getViewModel() {
        return (MainPaysheetViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleLogoutClicked() {
        Fragment fragment2 = this.fragment;
        FragmentActivity activity = fragment2 == null ? null : fragment2.getActivity();
        if (activity != null) {
            PLog.click$default(PEnums.TransitionName.LOGOUT_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.USER_PROFILE, (String) null, "user_profile_screen", "logout_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, LogSeverity.WARNING_VALUE, (Object) null);
            new DialogMaker.Builder().setTitle(C17165R.string.paypal_checkout_logout_headline).setPositiveButton(C17165R.string.paypal_checkout_logout, new C6591i(this)).setNegativeButton(C17165R.string.paypal_checkout_cancel, new C3225d(5)).build().show(activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleLogoutClicked$lambda-1  reason: not valid java name */
    public static final void m35449handleLogoutClicked$lambda1(PayPalLogoutView payPalLogoutView, DialogMaker dialogMaker) {
        C19383o.m32797g(payPalLogoutView, "this$0");
        PLog.decision$default(PEnums.TransitionName.CLICKED_LOGOUT_DIALOG, PEnums.Outcome.APPROVED, PEnums.EventCode.E156, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
        MainPaysheetViewModel viewModel = payPalLogoutView.getViewModel();
        VmLogoutListener vmLogoutListener2 = payPalLogoutView.vmLogoutListener;
        if (vmLogoutListener2 != null) {
            viewModel.userProfileLogout(vmLogoutListener2);
        } else {
            C19383o.m32805o("vmLogoutListener");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleLogoutClicked$lambda-2  reason: not valid java name */
    public static final void m35450handleLogoutClicked$lambda2(DialogMaker dialogMaker) {
        PLog.decision$default(PEnums.TransitionName.CLICKED_LOGOUT_DIALOG, PEnums.Outcome.CANCELLED, PEnums.EventCode.E156, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        dialogMaker.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35451initViewModelObservers$lambda0(PayPalLogoutView payPalLogoutView) {
        C19383o.m32797g(payPalLogoutView, "this$0");
        payPalLogoutView.getViewModel().finishFragment(PYPLUserProfileFragment.TAG, payPalLogoutView.fragment);
    }

    private final void setOnClickListener() {
        this.userProfileLogoutButton.setOnClickListener(this);
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

    public final Fragment getFragment() {
        return this.fragment;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
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
        this.vmLogoutListener = new C2783s(this, 4);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.userProfileLogoutButton) {
            handleLogoutClicked();
            PayPalLogoutViewListener payPalLogoutViewListener = this.mPayPalLogoutViewListener;
            if (payPalLogoutViewListener != null) {
                payPalLogoutViewListener.onPayPalLogoutClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalLogoutView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalLogoutViewListener payPalLogoutViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.viewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.paypal_logout_view_layout, this);
            View findViewById = findViewById(C17165R.C17167id.userProfileLogoutButton);
            C19383o.m32796f(findViewById, "findViewById(R.id.userProfileLogoutButton)");
            PayPalActionButton payPalActionButton = (PayPalActionButton) findViewById;
            this.userProfileLogoutButton = payPalActionButton;
            View findViewById2 = findViewById(C17165R.C17167id.logout_progress_spinner);
            C19383o.m32796f(findViewById2, "findViewById(R.id.logout_progress_spinner)");
            this.logoutProgressSpinner = (ProgressBar) findViewById2;
            payPalActionButton.setShape(ActionButtonShape.MATERIAL_DESIGN);
            payPalActionButton.setColor(ActionButtonColor.GRAY);
            payPalActionButton.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_logout));
            this.mPayPalLogoutViewListener = payPalLogoutViewListener;
            setOnClickListener();
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
