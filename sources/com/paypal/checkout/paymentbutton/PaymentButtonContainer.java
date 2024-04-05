package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.createorder.CreateOrder;
import com.paypal.checkout.error.OnError;
import com.paypal.checkout.fundingeligibility.FundingEligibilityResponse;
import com.paypal.checkout.paymentbutton.PaymentButtonEligibilityStatus;
import com.paypal.checkout.shipping.OnShippingChange;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PaymentButtonContainer extends LinearLayout implements ContentView, ICustomViewsViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXCEPTION_CHECKOUT_SDK_NOT_SUPPORTED_FOR_THE_CURRENT_API = "Checkout SDK is only available for API 23+";
    private static final String EXCEPTION_ELIGIBILITY_IS_NOT_DETERMINED = "[PaymentButton] was unable to determine its eligibility status after 30 seconds.";
    public static final String TAG = "PaymentButtonContainer";
    public Map<Integer, View> _$_findViewCache;
    private FundingEligibilityResponse fundingEligibilityResponse;
    private boolean isEligibilityTriggered;
    private PayPalButtonColor payLaterButtonColor;
    private boolean payLaterButtonEnabled;
    private PaymentButtonShape payLaterButtonShape;
    private PaymentButtonSize payLaterButtonSize;
    private final C19285c paymentButtons$delegate;
    private PayPalButtonColor paypalButtonColor;
    private boolean paypalButtonEnabled;
    private PayPalButtonLabel paypalButtonLabel;
    private PaymentButtonShape paypalButtonShape;
    private PaymentButtonSize paypalButtonSize;
    private PayPalCreditButtonColor paypalCreditButtonColor;
    private boolean paypalCreditButtonEnabled;
    private PaymentButtonShape paypalCreditButtonShape;
    private PaymentButtonSize paypalCreditButtonSize;
    private PaymentButtonContainerViewState viewState;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentButtonFundingType.values().length];
            iArr[PaymentButtonFundingType.PAYPAL.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentFundingType.values().length];
            iArr2[PaymentFundingType.PAYPAL.ordinal()] = 1;
            iArr2[PaymentFundingType.PAY_LATER.ordinal()] = 2;
            iArr2[PaymentFundingType.PAYPAL_CREDIT.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Class<PaymentButtonContainer> cls = PaymentButtonContainer.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context) {
        this(context, (AttributeSet) null, 0, (PayPalButtonUi) null, (PayPalCreditButtonUi) null, (PayLaterButtonUi) null, (PaymentButtonContainerViewState) null, 126, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (PayPalButtonUi) null, (PayPalCreditButtonUi) null, (PayLaterButtonUi) null, (PaymentButtonContainerViewState) null, 124, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (PayPalButtonUi) null, (PayPalCreditButtonUi) null, (PayLaterButtonUi) null, (PaymentButtonContainerViewState) null, 120, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet, int i, PayPalButtonUi payPalButtonUi) {
        this(context, attributeSet, i, payPalButtonUi, (PayPalCreditButtonUi) null, (PayLaterButtonUi) null, (PaymentButtonContainerViewState) null, 112, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet, int i, PayPalButtonUi payPalButtonUi, PayPalCreditButtonUi payPalCreditButtonUi) {
        this(context, attributeSet, i, payPalButtonUi, payPalCreditButtonUi, (PayLaterButtonUi) null, (PaymentButtonContainerViewState) null, 96, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet, int i, PayPalButtonUi payPalButtonUi, PayPalCreditButtonUi payPalCreditButtonUi, PayLaterButtonUi payLaterButtonUi) {
        this(context, attributeSet, i, payPalButtonUi, payPalCreditButtonUi, payLaterButtonUi, (PaymentButtonContainerViewState) null, 64, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentButtonContainer(android.content.Context r8, android.util.AttributeSet r9, int r10, com.paypal.checkout.paymentbutton.PayPalButtonUi r11, com.paypal.checkout.paymentbutton.PayPalCreditButtonUi r12, com.paypal.checkout.paymentbutton.PayLaterButtonUi r13, com.paypal.checkout.paymentbutton.PaymentButtonContainerViewState r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = 0
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.paymentbutton.PaymentButtonContainer.<init>(android.content.Context, android.util.AttributeSet, int, com.paypal.checkout.paymentbutton.PayPalButtonUi, com.paypal.checkout.paymentbutton.PayPalCreditButtonUi, com.paypal.checkout.paymentbutton.PayLaterButtonUi, com.paypal.checkout.paymentbutton.PaymentButtonContainerViewState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void configurePaymentButton() {
        for (PaymentButton paymentButton : getPaymentButtons()) {
            paymentButton.setOnEligibilityStatusChanged(new PaymentButtonContainer$configurePaymentButton$1$1(paymentButton, this));
        }
    }

    private final List<PaymentButton<?>> getPaymentButtons() {
        return (List) this.paymentButtons$delegate.getValue();
    }

    private final void handleEligibilityStatus(FundingEligibilityResponse fundingEligibilityResponse2, PaymentButtonEligibilityStatus paymentButtonEligibilityStatus) {
        FundingEligibilityState mapToFundingEligibilityState = fundingEligibilityResponse2 == null ? null : PaymentButtonContainerConfigKt.mapToFundingEligibilityState(fundingEligibilityResponse2);
        PaymentButtonContainerViewState paymentButtonContainerViewState = this.viewState;
        if (paymentButtonContainerViewState != null) {
            paymentButtonContainerViewState.onFinish(mapToFundingEligibilityState, (Exception) null);
        }
        if (C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Eligible.INSTANCE)) {
            PLog.decision$default(PEnums.TransitionName.NXO_SPB_CONTAINER_ELIGIBILITY_RESPONSE, PEnums.Outcome.ELIGIBLE, PEnums.EventCode.E645, PEnums.StateName.NATIVE_SPB_CONTAINER, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        } else if (C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Ineligible.INSTANCE)) {
            PLog.decision$default(PEnums.TransitionName.NXO_SPB_CONTAINER_ELIGIBILITY_RESPONSE, PEnums.Outcome.INELIGIBLE, PEnums.EventCode.E646, PEnums.StateName.NATIVE_SPB_CONTAINER, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        } else {
            String str = TAG;
            PLog.m28728dR(str, "handleEligibilityStatus(): " + paymentButtonEligibilityStatus);
        }
    }

    private final void handleErrorStatus(Exception exc) {
        updatePaymentsButtonVisibility();
        PaymentButtonContainerViewState paymentButtonContainerViewState = this.viewState;
        if (paymentButtonContainerViewState == null) {
            Exception exc2 = exc;
        } else {
            paymentButtonContainerViewState.onFinish((FundingEligibilityState) null, exc);
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E648, C0326j.m864i("Error with retrieving native SPB funding eligibility ", exc.getMessage()), (String) null, (Throwable) null, PEnums.TransitionName.NXO_SPB_CONTAINER_ELIGIBILITY_RESPONSE, PEnums.StateName.NATIVE_SPB_CONTAINER, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1944, (Object) null);
    }

    private final void handleLoadingStatus() {
        updatePaymentsButtonVisibility();
        PaymentButtonContainerViewState paymentButtonContainerViewState = this.viewState;
        if (paymentButtonContainerViewState != null) {
            paymentButtonContainerViewState.onLoading();
        }
        PLog.impression$default(PEnums.TransitionName.NXO_SPB_CONTAINER_LOADING, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E644, PEnums.StateName.NATIVE_SPB_CONTAINER, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
    }

    private final boolean isPaymentButtonEnabled(PaymentButton<?> paymentButton) {
        PaymentButtonFundingType fundingType$pyplcheckout_externalThreedsRelease = paymentButton == null ? null : paymentButton.getFundingType$pyplcheckout_externalThreedsRelease();
        return (fundingType$pyplcheckout_externalThreedsRelease == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fundingType$pyplcheckout_externalThreedsRelease.ordinal()]) == 1 && this.paypalButtonEnabled && C19383o.m32792b(((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton)).getEligibilityStatus(), PaymentButtonEligibilityStatus.Eligible.INSTANCE);
    }

    public static /* synthetic */ void setup$default(PaymentButtonContainer paymentButtonContainer, CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError, int i, Object obj) {
        paymentButtonContainer.setup(createOrder, (i & 2) != 0 ? null : onApprove, (i & 4) != 0 ? null : onShippingChange, (i & 8) != 0 ? null : onCancel, (i & 16) != 0 ? null : onError);
    }

    private final void updateButtonVisibility(PaymentButton<?> paymentButton) {
        if (paymentButton != null) {
            paymentButton.setVisibility(isPaymentButtonEnabled(paymentButton) ? 0 : 8);
        }
    }

    private final void updateColors(PaymentFundingType paymentFundingType) {
        int i = WhenMappings.$EnumSwitchMapping$1[paymentFundingType.ordinal()];
        if (i == 1) {
            ((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton)).setColor(this.paypalButtonColor);
        } else if (i == 2) {
            ((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton)).setColor(this.payLaterButtonColor);
        } else if (i == 3) {
            ((PayPalCreditButton) _$_findCachedViewById(C17165R.C17167id.payPalCreditButton)).setColor(this.paypalCreditButtonColor);
        }
    }

    private final void updateLabels(PaymentFundingType paymentFundingType) {
        int i = WhenMappings.$EnumSwitchMapping$1[paymentFundingType.ordinal()];
        if (i == 1) {
            ((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton)).setLabel(this.paypalButtonLabel);
        } else if (i != 2) {
            PLog.i$default(TAG, "PayPal Credit: Update label is disabled", 0, 4, (Object) null);
        } else {
            ((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton)).setLabel(PayPalButtonLabel.PAY_LATER);
        }
    }

    private final void updatePayLaterButtonUiFrom(TypedArray typedArray) {
        setPayLaterButtonUi(new PayLaterButtonUi(PayPalButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_pay_later_button_color, PayPalButtonColor.GOLD.getValue())), new PaymentButtonAttributes(PaymentButtonShape.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_pay_later_button_shape, PaymentButtonShape.RECTANGLE.getValue())), PaymentButtonSize.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_pay_later_button_size, PaymentButtonSize.MEDIUM.getValue())), typedArray.getBoolean(C17165R.styleable.PaymentButtonContainer_pay_later_button_enabled, true))));
    }

    private final void updatePayPalButtonUiFrom(TypedArray typedArray) {
        setPayPalButtonUi(new PayPalButtonUi(PayPalButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_button_color, PayPalButtonColor.GOLD.getValue())), PayPalButtonLabel.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_button_label, PayPalButtonLabel.PAYPAL.getValue())), new PaymentButtonAttributes(PaymentButtonShape.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_button_shape, PaymentButtonShape.RECTANGLE.getValue())), PaymentButtonSize.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_button_size, PaymentButtonSize.MEDIUM.getValue())), typedArray.getBoolean(C17165R.styleable.PaymentButtonContainer_paypal_button_enabled, true))));
    }

    private final void updatePayPalCreditButtonUiFrom(TypedArray typedArray) {
        setPayPalCreditButtonUi(new PayPalCreditButtonUi(PayPalCreditButtonColor.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_credit_button_color, PayPalCreditButtonColor.DARK_BLUE.getValue())), new PaymentButtonAttributes(PaymentButtonShape.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_credit_button_shape, PaymentButtonShape.RECTANGLE.getValue())), PaymentButtonSize.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButtonContainer_paypal_credit_button_size, PaymentButtonSize.MEDIUM.getValue())), typedArray.getBoolean(C17165R.styleable.PaymentButtonContainer_paypal_credit_button_enabled, true))));
    }

    /* access modifiers changed from: private */
    public final void updatePaymentButtonContainer(PaymentButton<?> paymentButton) {
        PaymentButtonEligibilityStatus eligibilityStatus = paymentButton.getEligibilityStatus();
        if (C19383o.m32792b(eligibilityStatus, PaymentButtonEligibilityStatus.Loading.INSTANCE)) {
            String str = TAG;
            PLog.m28728dR(str, "PaymentButtonEligibilityStatus: " + paymentButton + ".eligibilityStatus");
            return;
        }
        if (C19383o.m32792b(eligibilityStatus, PaymentButtonEligibilityStatus.Ineligible.INSTANCE) ? true : C19383o.m32792b(eligibilityStatus, PaymentButtonEligibilityStatus.Eligible.INSTANCE)) {
            updateButtonVisibility(paymentButton);
            FundingEligibilityResponse fundingEligibilityResponse2 = DebugConfigManager.getInstance().getFundingEligibilityResponse();
            this.fundingEligibilityResponse = fundingEligibilityResponse2;
            if (!this.isEligibilityTriggered) {
                this.isEligibilityTriggered = true;
                handleEligibilityStatus(fundingEligibilityResponse2, paymentButton.getEligibilityStatus());
            }
        } else if (C19383o.m32792b(eligibilityStatus, PaymentButtonEligibilityStatus.Error.INSTANCE)) {
            handleErrorStatus(new IllegalStateException(EXCEPTION_ELIGIBILITY_IS_NOT_DETERMINED));
        }
    }

    private final void updatePaymentsButtonVisibility() {
        for (PaymentButton updateButtonVisibility : getPaymentButtons()) {
            updateButtonVisibility(updateButtonVisibility);
        }
    }

    private final void updateShapes(PaymentFundingType paymentFundingType) {
        int i = WhenMappings.$EnumSwitchMapping$1[paymentFundingType.ordinal()];
        if (i == 1) {
            ((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton)).setShape(this.paypalButtonShape);
        } else if (i == 2) {
            ((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton)).setShape(this.payLaterButtonShape);
        } else if (i == 3) {
            ((PayPalCreditButton) _$_findCachedViewById(C17165R.C17167id.payPalCreditButton)).setShape(this.paypalCreditButtonShape);
        }
    }

    private final void updateSizes(PaymentFundingType paymentFundingType) {
        int i = WhenMappings.$EnumSwitchMapping$1[paymentFundingType.ordinal()];
        if (i == 1) {
            ((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton)).setSize(this.paypalButtonSize);
        } else if (i == 2) {
            ((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton)).setSize(this.payLaterButtonSize);
        } else if (i == 3) {
            ((PayPalCreditButton) _$_findCachedViewById(C17165R.C17167id.payPalCreditButton)).setSize(this.paypalCreditButtonSize);
        }
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

    public final PayPalButtonColor getPayLaterButtonColor() {
        return this.payLaterButtonColor;
    }

    public final boolean getPayLaterButtonEnabled() {
        return this.payLaterButtonEnabled;
    }

    public final PaymentButtonShape getPayLaterButtonShape() {
        return this.payLaterButtonShape;
    }

    public final PaymentButtonSize getPayLaterButtonSize() {
        return this.payLaterButtonSize;
    }

    public final PayPalButtonColor getPaypalButtonColor() {
        return this.paypalButtonColor;
    }

    public final boolean getPaypalButtonEnabled() {
        return this.paypalButtonEnabled;
    }

    public final PayPalButtonLabel getPaypalButtonLabel() {
        return this.paypalButtonLabel;
    }

    public final PaymentButtonShape getPaypalButtonShape() {
        return this.paypalButtonShape;
    }

    public final PaymentButtonSize getPaypalButtonSize() {
        return this.paypalButtonSize;
    }

    public final PayPalCreditButtonColor getPaypalCreditButtonColor() {
        return this.paypalCreditButtonColor;
    }

    public final boolean getPaypalCreditButtonEnabled() {
        return this.paypalCreditButtonEnabled;
    }

    public final PaymentButtonShape getPaypalCreditButtonShape() {
        return this.paypalCreditButtonShape;
    }

    public final PaymentButtonSize getPaypalCreditButtonSize() {
        return this.paypalCreditButtonSize;
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public final PaymentButtonContainerViewState getViewState() {
        return this.viewState;
    }

    public void initViewModelObservers() {
    }

    public EventType listenToEvent() {
        return null;
    }

    public void removeListeners() {
    }

    public final void setPayLaterButtonColor(PayPalButtonColor payPalButtonColor) {
        C19383o.m32797g(payPalButtonColor, "value");
        this.payLaterButtonColor = payPalButtonColor;
        updateColors(PaymentFundingType.PAY_LATER);
    }

    public final void setPayLaterButtonEnabled(boolean z) {
        this.payLaterButtonEnabled = z;
        updateButtonVisibility((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton));
    }

    public final void setPayLaterButtonShape(PaymentButtonShape paymentButtonShape) {
        C19383o.m32797g(paymentButtonShape, "value");
        this.payLaterButtonShape = paymentButtonShape;
        updateShapes(PaymentFundingType.PAY_LATER);
    }

    public final void setPayLaterButtonSize(PaymentButtonSize paymentButtonSize) {
        C19383o.m32797g(paymentButtonSize, "value");
        this.payLaterButtonSize = paymentButtonSize;
        updateSizes(PaymentFundingType.PAY_LATER);
    }

    public final void setPayLaterButtonUi(PayLaterButtonUi payLaterButtonUi) {
        C19383o.m32797g(payLaterButtonUi, "payLaterButtonUi");
        ((PayLaterButton) _$_findCachedViewById(C17165R.C17167id.payLaterButton)).setLabel(PayPalButtonLabel.PAY_LATER);
        setPayLaterButtonColor(payLaterButtonUi.getColor());
        setPayLaterButtonShape(payLaterButtonUi.getAttributes().getShape());
        setPayLaterButtonSize(payLaterButtonUi.getAttributes().getSize());
        setPayLaterButtonEnabled(payLaterButtonUi.getAttributes().isEnabled());
    }

    public final void setPayPalButtonUi(PayPalButtonUi payPalButtonUi) {
        C19383o.m32797g(payPalButtonUi, "paypalButtonUi");
        setPaypalButtonLabel(payPalButtonUi.getLabel());
        setPaypalButtonColor(payPalButtonUi.getColor());
        setPaypalButtonShape(payPalButtonUi.getAttributes().getShape());
        setPaypalButtonSize(payPalButtonUi.getAttributes().getSize());
        setPaypalButtonEnabled(payPalButtonUi.getAttributes().isEnabled());
    }

    public final void setPayPalCreditButtonUi(PayPalCreditButtonUi payPalCreditButtonUi) {
        C19383o.m32797g(payPalCreditButtonUi, "paypalCreditButtonUi");
        setPaypalCreditButtonColor(payPalCreditButtonUi.getColor());
        setPaypalCreditButtonShape(payPalCreditButtonUi.getAttributes().getShape());
        setPaypalCreditButtonSize(payPalCreditButtonUi.getAttributes().getSize());
        setPaypalCreditButtonEnabled(payPalCreditButtonUi.getAttributes().isEnabled());
    }

    public final void setPaypalButtonColor(PayPalButtonColor payPalButtonColor) {
        C19383o.m32797g(payPalButtonColor, "value");
        this.paypalButtonColor = payPalButtonColor;
        updateColors(PaymentFundingType.PAYPAL);
    }

    public final void setPaypalButtonEnabled(boolean z) {
        this.paypalButtonEnabled = z;
        updateButtonVisibility((PayPalButton) _$_findCachedViewById(C17165R.C17167id.payPalButton));
    }

    public final void setPaypalButtonLabel(PayPalButtonLabel payPalButtonLabel) {
        C19383o.m32797g(payPalButtonLabel, "value");
        this.paypalButtonLabel = payPalButtonLabel;
        updateLabels(PaymentFundingType.PAYPAL);
    }

    public final void setPaypalButtonShape(PaymentButtonShape paymentButtonShape) {
        C19383o.m32797g(paymentButtonShape, "value");
        this.paypalButtonShape = paymentButtonShape;
        updateShapes(PaymentFundingType.PAYPAL);
    }

    public final void setPaypalButtonSize(PaymentButtonSize paymentButtonSize) {
        C19383o.m32797g(paymentButtonSize, "value");
        this.paypalButtonSize = paymentButtonSize;
        updateSizes(PaymentFundingType.PAYPAL);
    }

    public final void setPaypalCreditButtonColor(PayPalCreditButtonColor payPalCreditButtonColor) {
        C19383o.m32797g(payPalCreditButtonColor, "value");
        this.paypalCreditButtonColor = payPalCreditButtonColor;
        updateColors(PaymentFundingType.PAYPAL_CREDIT);
    }

    public final void setPaypalCreditButtonEnabled(boolean z) {
        this.paypalCreditButtonEnabled = z;
        updateButtonVisibility((PayPalCreditButton) _$_findCachedViewById(C17165R.C17167id.payPalCreditButton));
    }

    public final void setPaypalCreditButtonShape(PaymentButtonShape paymentButtonShape) {
        C19383o.m32797g(paymentButtonShape, "value");
        this.paypalCreditButtonShape = paymentButtonShape;
        updateShapes(PaymentFundingType.PAYPAL_CREDIT);
    }

    public final void setPaypalCreditButtonSize(PaymentButtonSize paymentButtonSize) {
        C19383o.m32797g(paymentButtonSize, "value");
        this.paypalCreditButtonSize = paymentButtonSize;
        updateSizes(PaymentFundingType.PAYPAL_CREDIT);
    }

    public final void setViewState(PaymentButtonContainerViewState paymentButtonContainerViewState) {
        this.viewState = paymentButtonContainerViewState;
    }

    public final void setup(CreateOrder createOrder) {
        C19383o.m32797g(createOrder, "createOrder");
        setup$default(this, createOrder, (OnApprove) null, (OnShippingChange) null, (OnCancel) null, (OnError) null, 30, (Object) null);
    }

    public final void setup(CreateOrder createOrder, OnApprove onApprove) {
        C19383o.m32797g(createOrder, "createOrder");
        setup$default(this, createOrder, onApprove, (OnShippingChange) null, (OnCancel) null, (OnError) null, 28, (Object) null);
    }

    public final void setup(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange) {
        C19383o.m32797g(createOrder, "createOrder");
        setup$default(this, createOrder, onApprove, onShippingChange, (OnCancel) null, (OnError) null, 24, (Object) null);
    }

    public final void setup(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel) {
        C19383o.m32797g(createOrder, "createOrder");
        setup$default(this, createOrder, onApprove, onShippingChange, onCancel, (OnError) null, 16, (Object) null);
    }

    public final void setup(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError) {
        C19383o.m32797g(createOrder, "createOrder");
        for (PaymentButton upVar : getPaymentButtons()) {
            upVar.setup(createOrder, onApprove, onShippingChange, onCancel, onError);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentButtonContainer(Context context, AttributeSet attributeSet, int i, PayPalButtonUi payPalButtonUi, PayPalCreditButtonUi payPalCreditButtonUi, PayLaterButtonUi payLaterButtonUi, PaymentButtonContainerViewState paymentButtonContainerViewState) {
        super(context, attributeSet, i);
        Context context2 = context;
        PayPalButtonUi payPalButtonUi2 = payPalButtonUi;
        PayPalCreditButtonUi payPalCreditButtonUi2 = payPalCreditButtonUi;
        PayLaterButtonUi payLaterButtonUi2 = payLaterButtonUi;
        PaymentButtonContainerViewState paymentButtonContainerViewState2 = paymentButtonContainerViewState;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.paypalButtonLabel = PayPalButtonLabel.PAYPAL;
        PayPalButtonColor payPalButtonColor = PayPalButtonColor.GOLD;
        this.paypalButtonColor = payPalButtonColor;
        this.payLaterButtonColor = payPalButtonColor;
        this.paypalCreditButtonColor = PayPalCreditButtonColor.DARK_BLUE;
        PaymentButtonSize paymentButtonSize = PaymentButtonSize.MEDIUM;
        this.paypalButtonSize = paymentButtonSize;
        this.payLaterButtonSize = paymentButtonSize;
        this.paypalCreditButtonSize = paymentButtonSize;
        PaymentButtonShape paymentButtonShape = PaymentButtonShape.RECTANGLE;
        this.paypalButtonShape = paymentButtonShape;
        this.payLaterButtonShape = paymentButtonShape;
        this.paypalCreditButtonShape = paymentButtonShape;
        this.paypalButtonEnabled = true;
        this.payLaterButtonEnabled = true;
        this.paypalCreditButtonEnabled = true;
        this.paymentButtons$delegate = C19350d.m32677b(new PaymentButtonContainer$paymentButtons$2(this));
        View.inflate(context2, C17165R.C17169layout.paypal_payments_button_container_view, this);
        SdkComponent.Companion.getInstance().getRepository().setStartupMechanism(PEnums.StartupMechanism.NSPB.toString());
        PLog.impression$default(PEnums.TransitionName.NXO_SPB_CONTAINER_CREATE, PEnums.Outcome.SHOWN, PEnums.EventCode.E643, PEnums.StateName.NATIVE_SPB_CONTAINER, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        handleLoadingStatus();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C17165R.styleable.PaymentButtonContainer);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…e.PaymentButtonContainer)");
        updatePayPalButtonUiFrom(obtainStyledAttributes);
        updatePayLaterButtonUiFrom(obtainStyledAttributes);
        updatePayPalCreditButtonUiFrom(obtainStyledAttributes);
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
        if (payPalButtonUi2 != null) {
            setPayPalButtonUi(payPalButtonUi2);
        }
        if (payLaterButtonUi2 != null) {
            setPayLaterButtonUi(payLaterButtonUi2);
        }
        if (payPalCreditButtonUi2 != null) {
            setPayPalCreditButtonUi(payPalCreditButtonUi2);
        }
        if (paymentButtonContainerViewState2 != null) {
            setViewState(paymentButtonContainerViewState2);
        }
        initViewModelObservers();
        configurePaymentButton();
    }
}
