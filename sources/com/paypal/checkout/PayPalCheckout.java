package com.paypal.checkout;

import android.app.Application;
import android.content.Intent;
import androidx.appcompat.widget.C0326j;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.config.CheckoutConfig;
import com.paypal.checkout.createorder.CreateOrder;
import com.paypal.checkout.createorder.CreateOrderActions;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.error.OnError;
import com.paypal.checkout.internal.build.BuildValidationStatus;
import com.paypal.checkout.shipping.OnShippingChange;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.home.view.activities.PYPLInitiateCheckoutActivity;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PayPalCheckout {
    public static final PayPalCheckout INSTANCE = new PayPalCheckout();
    private static volatile Application application;
    private static boolean isConfigSet;

    private PayPalCheckout() {
    }

    private final SdkComponent getSdkComponent() {
        return SdkComponent.Companion.getInstance();
    }

    private final void handleLaunchOrder(CreateOrder createOrder, String str) {
        CreateOrderActions createOrderActions = SdkComponent.Companion.getInstance().getCreateOrderActions();
        createOrderActions.setInternalOnOrderCreated$pyplcheckout_externalThreedsRelease(new PayPalCheckout$handleLaunchOrder$1(str));
        createOrder.create(createOrderActions);
    }

    /* access modifiers changed from: private */
    public final void onOrderApiFailed(PYPLException pYPLException) {
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E565, "order api failed", pYPLException.getMessage(), pYPLException, PEnums.TransitionName.NATIVE_XO_ORDER_RESPONSE, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        DebugConfigManager.getInstance().invokeOnErrorCallback(pYPLException, ErrorReason.CREATE_ORDER_ERROR);
    }

    public static final void registerCallbacks(OnApprove onApprove, OnCancel onCancel, OnError onError) {
        registerCallbacks$default(onApprove, (OnShippingChange) null, onCancel, onError, 2, (Object) null);
    }

    public static final void registerCallbacks(OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError) {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        instance.setOnApprove(onApprove);
        instance.setOnShippingChange(onShippingChange);
        instance.setOnCancel(onCancel);
        instance.setOnError(onError);
    }

    public static /* synthetic */ void registerCallbacks$default(OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError, int i, Object obj) {
        if ((i & 2) != 0) {
            onShippingChange = null;
        }
        registerCallbacks(onApprove, onShippingChange, onCancel, onError);
    }

    private final void resetFieldsOnPaysheetLaunch(DebugConfigManager debugConfigManager) {
        debugConfigManager.setFundingSource(PEnums.FundingSource.PAYPAL.toString());
        debugConfigManager.setCorrelationIds(new InternalCorrelationIds((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null));
        debugConfigManager.resetLsatToken();
    }

    public static final void setConfig(CheckoutConfig checkoutConfig) {
        C19383o.m32797g(checkoutConfig, "checkoutConfig");
        checkoutConfig.verifyConfig$pyplcheckout_externalThreedsRelease();
        application = checkoutConfig.getApplication();
        isConfigSet = true;
        DebugConfigManager.getInstance().setConfig(checkoutConfig);
        SdkComponent.Companion companion = SdkComponent.Companion;
        Application application2 = application;
        if (application2 != null) {
            companion.create(application2);
            PayPalCheckout payPalCheckout = INSTANCE;
            payPalCheckout.getSdkComponent().getInstrumentationSession().resetSdkSessionId();
            payPalCheckout.getSdkComponent().getInstrumentationSession().resetOrderSessionId();
            String smartPaymentButtonSessionId = payPalCheckout.getSdkComponent().getRepository().getSmartPaymentButtonSessionId();
            if (smartPaymentButtonSessionId == null) {
                smartPaymentButtonSessionId = "null_sdk_session_id";
            }
            payPalCheckout.getSdkComponent().getAmplitudeManager().getLogger().initialize(smartPaymentButtonSessionId);
            payPalCheckout.validateBuild();
            payPalCheckout.getSdkComponent().getMerchantConfigRepository().setMerchantConfig(checkoutConfig);
            return;
        }
        C19383o.m32805o("application");
        throw null;
    }

    public static final void start(CreateOrder createOrder) {
        C19383o.m32797g(createOrder, "createOrder");
        start$default(createOrder, (OnApprove) null, (OnShippingChange) null, (OnCancel) null, (OnError) null, 30, (Object) null);
    }

    public static final void start(CreateOrder createOrder, OnApprove onApprove) {
        C19383o.m32797g(createOrder, "createOrder");
        start$default(createOrder, onApprove, (OnShippingChange) null, (OnCancel) null, (OnError) null, 28, (Object) null);
    }

    public static final void start(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange) {
        C19383o.m32797g(createOrder, "createOrder");
        start$default(createOrder, onApprove, onShippingChange, (OnCancel) null, (OnError) null, 24, (Object) null);
    }

    public static final void start(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel) {
        C19383o.m32797g(createOrder, "createOrder");
        start$default(createOrder, onApprove, onShippingChange, onCancel, (OnError) null, 16, (Object) null);
    }

    public static final void start(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError) {
        C19383o.m32797g(createOrder, "createOrder");
        if (isConfigSet) {
            DebugConfigManager instance = DebugConfigManager.getInstance();
            PayPalCheckout payPalCheckout = INSTANCE;
            C19383o.m32796f(instance, "");
            payPalCheckout.resetFieldsOnPaysheetLaunch(instance);
            instance.setOnApprove(onApprove);
            instance.setOnShippingChange(onShippingChange);
            instance.setOnCancel(onCancel);
            instance.setOnError(onError);
            payPalCheckout.handleLaunchOrder(createOrder, "start()");
            return;
        }
        throw new IllegalStateException("CheckoutConfig needs to be set before start() is called!");
    }

    public static /* synthetic */ void start$default(CreateOrder createOrder, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError, int i, Object obj) {
        if ((i & 2) != 0) {
            onApprove = null;
        }
        if ((i & 4) != 0) {
            onShippingChange = null;
        }
        if ((i & 8) != 0) {
            onCancel = null;
        }
        if ((i & 16) != 0) {
            onError = null;
        }
        start(createOrder, onApprove, onShippingChange, onCancel, onError);
    }

    public static final void startCheckout(CreateOrder createOrder) {
        C19383o.m32797g(createOrder, "createOrder");
        if (isConfigSet) {
            DebugConfigManager instance = DebugConfigManager.getInstance();
            PayPalCheckout payPalCheckout = INSTANCE;
            C19383o.m32796f(instance, "");
            payPalCheckout.resetFieldsOnPaysheetLaunch(instance);
            payPalCheckout.handleLaunchOrder(createOrder, "startCheckout()");
            return;
        }
        throw new IllegalStateException("CheckoutConfig needs to be set before start() is called!");
    }

    /* access modifiers changed from: private */
    public final void startInitiateCheckoutActivity(String str) {
        PLog.transition$default(PEnums.TransitionName.NATIVE_XO_TRIGGERED, PEnums.Outcome.STARTED, (PEnums.EventCode) null, PEnums.StateName.STARTUP, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, "PayPalCheckout", "PYPLInitiateCheckoutActivity", (String) null, C0326j.m864i("Function PayPalCheckout function used: ", str), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14964, (Object) null);
        Application application2 = application;
        if (application2 != null) {
            Intent intent = new Intent(application2, PYPLInitiateCheckoutActivity.class);
            intent.setFlags(268435456);
            Application application3 = application;
            if (application3 != null) {
                application3.startActivity(intent);
            } else {
                C19383o.m32805o("application");
                throw null;
            }
        } else {
            C19383o.m32805o("application");
            throw null;
        }
    }

    private final void validateBuild() {
        BuildValidationStatus validationStatus = getSdkComponent().getBuildValidator().getValidationStatus();
        if (validationStatus instanceof BuildValidationStatus.Invalid.Expired) {
            throw new SnapshotExpiredException((BuildValidationStatus.Invalid.Expired) validationStatus);
        }
    }

    public final boolean isConfigSet() {
        return isConfigSet;
    }
}
