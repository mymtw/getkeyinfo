package com.paypal.pyplcheckout.userprofile.view.customviews;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.purchases.C11668n;
import com.google.logging.type.LogSeverity;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.model.UserState;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.paypal.pyplcheckout.userprofile.view.interfaces.PayPalPoliciesViewListener;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

@SuppressLint({"ViewConstructor"})
public final class PayPalPoliciesView extends RelativeLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalPoliciesView";
    public Map<Integer, View> _$_findViewCache;
    private PayPalPoliciesViewListener mPayPalPoliciesViewListener;
    private TextView titleLabelTv;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalPoliciesView> cls = PayPalPoliciesView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalPoliciesViewListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalPoliciesViewListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalPoliciesViewListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesView(Context context, AttributeSet attributeSet, int i, Fragment fragment) {
        this(context, attributeSet, i, fragment, (PayPalPoliciesViewListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalPoliciesView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalPoliciesViewListener payPalPoliciesViewListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment, (i2 & 16) != 0 ? null : payPalPoliciesViewListener);
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final void handleProfilePolicyLinkVisibility(User user) {
        if (UserStateKt.isUSBuyer(user)) {
            AnimationUtils.expand$default(AnimationUtils.INSTANCE, this, 0, 0, (Interpolator) null, false, (C19846a) null, 62, (Object) null);
        } else {
            AnimationUtils.shrink$default(AnimationUtils.INSTANCE, this, 0, 0, (Interpolator) null, false, (C19846a) null, 62, (Object) null);
        }
    }

    private final void handleUserProfilePoliciesClicked() {
        Context context = getContext();
        String str = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            PLog.click$default(PEnums.TransitionName.PAYMENT_POLICIES_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.USER_PROFILE, (String) null, "user_profile_screen", "policies_and_rights_view", (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, LogSeverity.WARNING_VALUE, (Object) null);
            PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
            User user = getUserViewModel().getUser();
            String userLocale = user == null ? null : user.getUserLocale();
            User user2 = getUserViewModel().getUser();
            if (user2 != null) {
                str = user2.getCountry();
            }
            Uri parse = Uri.parse(PayPalConstants.getPolicyUrl(userLocale, str));
            C19383o.m32796f(parse, "parse(\n                P…          )\n            )");
            instance.openChromeCustomTabs(parse, activity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-0  reason: not valid java name */
    public static final void m35452initViewModelObservers$lambda0(PayPalPoliciesView payPalPoliciesView, UserState userState) {
        C19383o.m32797g(payPalPoliciesView, "this$0");
        User user = null;
        UserState.Success success = userState instanceof UserState.Success ? (UserState.Success) userState : null;
        if (success != null) {
            user = success.getUser();
        }
        payPalPoliciesView.handleProfilePolicyLinkVisibility(user);
    }

    private final void setOnClickListener() {
        this.titleLabelTv.setOnClickListener(this);
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
        getUserViewModel().getUserState().observe(getLifecycleOwner(this), new C11668n(this, 4));
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.title_label) {
            handleUserProfilePoliciesClicked();
            PayPalPoliciesViewListener payPalPoliciesViewListener = this.mPayPalPoliciesViewListener;
            if (payPalPoliciesViewListener != null) {
                payPalPoliciesViewListener.onPayPalPoliciesClick();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalPoliciesView(Context context, AttributeSet attributeSet, int i, Fragment fragment, PayPalPoliciesViewListener payPalPoliciesViewListener) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(SdkComponent.Companion.getInstance());
        if (context2 instanceof ComponentActivity) {
            this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4((ComponentActivity) context2), sdkComponentKt$activityViewModels$1);
            View.inflate(context, C17165R.C17169layout.selectable_item_view, this);
            View findViewById = findViewById(C17165R.C17167id.title_label);
            C19383o.m32796f(findViewById, "findViewById(R.id.title_label)");
            TextView textView = (TextView) findViewById;
            this.titleLabelTv = textView;
            textView.setText(context.getText(C17165R.string.paypal_checkout_policies));
            this.mPayPalPoliciesViewListener = payPalPoliciesViewListener;
            setOnClickListener();
            initViewModelObservers();
            return;
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
