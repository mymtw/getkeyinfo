package com.paypal.pyplcheckout.crypto.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.conversionrateprotection.view.customviews.PayPalRateProtectionInfoView;
import com.paypal.pyplcheckout.crypto.view.fragments.PYPLCryptoConsentFragment;
import com.paypal.pyplcheckout.crypto.view.interfaces.PayPalCryptoConsentListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.fundingOptions.viewModel.FundingOptionsViewModel;
import com.paypal.pyplcheckout.home.view.customviews.ActionButtonShape;
import com.paypal.pyplcheckout.home.view.customviews.PayPalActionButton;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.userprofile.viewModel.UserViewModel;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.PayPalConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalCryptoConsentInfoView extends RelativeLayout implements ContentView, View.OnClickListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String TAG = "PayPalCryptoConsentInfoView";
    public Map<Integer, View> _$_findViewCache;
    private final PayPalActionButton cryptoActionButton;
    private final TextView cryptoFullCryptoTermsAndConditionsLinkTv;
    private final Fragment fragment;
    private final C19285c fundingOptionsViewModel$delegate;
    private final C19285c mainPaysheetViewModel$delegate;
    private PayPalCryptoConsentListener payPalCryptoConsentListener;
    private final C19285c userViewModel$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<PayPalCryptoConsentInfoView> cls = PayPalCryptoConsentInfoView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCryptoConsentInfoView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, (PayPalCryptoConsentListener) null, 30, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCryptoConsentInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, (PayPalCryptoConsentListener) null, 28, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCryptoConsentInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, (PayPalCryptoConsentListener) null, 24, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PayPalCryptoConsentInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        this(context, attributeSet, i, fragment2, (PayPalCryptoConsentListener) null, 16, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayPalCryptoConsentInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalCryptoConsentListener payPalCryptoConsentListener2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2, (i2 & 16) != 0 ? null : payPalCryptoConsentListener2);
    }

    private final FundingOptionsViewModel getFundingOptionsViewModel() {
        return (FundingOptionsViewModel) this.fundingOptionsViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final UserViewModel getUserViewModel() {
        return (UserViewModel) this.userViewModel$delegate.getValue();
    }

    private final void setOnClickListener() {
        this.cryptoFullCryptoTermsAndConditionsLinkTv.setOnClickListener(this);
        this.cryptoActionButton.setOnClickListener(this);
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

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return PayPalRateProtectionInfoView.TAG;
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
        if (view.getId() == C17165R.C17167id.crypto_full_terms_and_conditions_link_tv) {
            PLog.click$default(PEnums.TransitionName.CRYPTO_TERMS_SERVICE_CLICKED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            Context context = getContext();
            String str = null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                PYPLCheckoutUtils instance = PYPLCheckoutUtils.Companion.getInstance();
                User user = getUserViewModel().getUser();
                String userLocale = user == null ? null : user.getUserLocale();
                User user2 = getUserViewModel().getUser();
                if (user2 != null) {
                    str = user2.getCountry();
                }
                Uri parse = Uri.parse(PayPalConstants.getCryptoPolicyUrl(userLocale, str));
                C19383o.m32796f(parse, "parse(\n                 …      )\n                )");
                instance.openChromeCustomTabs(parse, activity);
                PayPalCryptoConsentListener payPalCryptoConsentListener2 = this.payPalCryptoConsentListener;
                if (payPalCryptoConsentListener2 != null) {
                    payPalCryptoConsentListener2.onPayPalCryptoTermsAndConditionsClick();
                }
            } else {
                return;
            }
        }
        if (view.getId() == C17165R.C17167id.crypto_consent_got_it_action_button) {
            PLog.click$default(PEnums.TransitionName.CRYPTO_CONSENT_ACCEPTED, PEnums.Outcome.CLICKED, PEnums.EventCode.E101, PEnums.StateName.PAY_WITH_CRYPTO, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
            getFundingOptionsViewModel().setCryptoConsentAccepted(true);
            Events.Companion.getInstance().fire(PayPalEventTypes.USER_ACCEPTED_CRYPTO_CURRENCY_CONSENT, new Success(Boolean.TRUE));
            getMainPaysheetViewModel().finishFragment(PYPLCryptoConsentFragment.TAG, this.fragment);
            PayPalCryptoConsentListener payPalCryptoConsentListener3 = this.payPalCryptoConsentListener;
            if (payPalCryptoConsentListener3 != null) {
                payPalCryptoConsentListener3.onPayPalCryptoActionButtonClickListener();
            }
        }
    }

    public void removeListeners() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PayPalCryptoConsentInfoView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, PayPalCryptoConsentListener payPalCryptoConsentListener2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.userViewModel$delegate = new C2868j0(C19386q.m32807a(UserViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$13 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
                if (z) {
                    this.fundingOptionsViewModel$delegate = new C2868j0(C19386q.m32807a(FundingOptionsViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$13);
                    View.inflate(context2, C17165R.C17169layout.paypal_crypto_consent_info_view_layout, this);
                    View findViewById = findViewById(C17165R.C17167id.crypto_full_terms_and_conditions_link_tv);
                    C19383o.m32796f(findViewById, "findViewById(R.id.crypto…s_and_conditions_link_tv)");
                    this.cryptoFullCryptoTermsAndConditionsLinkTv = (TextView) findViewById;
                    View findViewById2 = findViewById(C17165R.C17167id.crypto_consent_got_it_action_button);
                    C19383o.m32796f(findViewById2, "findViewById(R.id.crypto…ent_got_it_action_button)");
                    PayPalActionButton payPalActionButton = (PayPalActionButton) findViewById2;
                    this.cryptoActionButton = payPalActionButton;
                    payPalActionButton.updateButtonText(getResources().getString(C17165R.string.paypal_checkout_crypto_got_it_button));
                    payPalActionButton.setShape(ActionButtonShape.MATERIAL_DESIGN);
                    this.payPalCryptoConsentListener = payPalCryptoConsentListener2;
                    setOnClickListener();
                    getMainPaysheetViewModel().isBackBtnBlocked().setValue(Boolean.TRUE);
                    return;
                }
                PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
                throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
