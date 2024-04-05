package com.paypal.pyplcheckout.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.viewholders.C9403q;
import com.facebook.login.LoginFragment;
import com.google.android.gms.common.api.Api;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.checkout.approve.Approval;
import com.paypal.checkout.approve.ApprovalData;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.checkout.paymentbutton.PaymentButtonFundingType;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.auth.NativeSSOListener;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.data.repositories.MerchantConfigRepository;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.exception.CheckoutCancelReason;
import com.paypal.pyplcheckout.extensions.PackageManagerExtensionsKt;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.home.view.BaseActivity;
import com.paypal.pyplcheckout.home.view.customviews.ErrorDialogView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import com.paypal.pyplcheckout.interfaces.PayPalCheckoutCompleteListener;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.Address;
import com.paypal.pyplcheckout.pojo.ApplicationIdentifier;
import com.paypal.pyplcheckout.pojo.ApprovePayment;
import com.paypal.pyplcheckout.pojo.ApprovePaymentData;
import com.paypal.pyplcheckout.pojo.ApprovePaymentResponse;
import com.paypal.pyplcheckout.pojo.Buyer;
import com.paypal.pyplcheckout.pojo.Cart;
import com.paypal.pyplcheckout.pojo.ShippingMethodType;
import com.paypal.pyplcheckout.pojo.VaultData;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseProperties;
import com.paypal.pyplcheckout.pojo.firebase.IndefiniteFallbackRequest;
import com.paypal.pyplcheckout.providerIntegration.ExtendedCheckoutConfig;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Timer;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import p003a2.C0015b;
import p010a9.C0048b;
import p156k.C7168e;
import p260v0.C8184a;
import p595ji.C17995g;
import p753kq.C19846a;
import p753kq.C19857l;

public final class PYPLCheckoutUtils {
    private static final String CHROME_APP_PACKAGE_NAME = "com.android.chrome";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EMPTY_STRING = "";
    private static final String GOOGLE_SEARCH_APP_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
    private static final String OPTYPE_PAYMENT = "payment";
    public static final String PAYMENT_MODE_TYPE = "PAYMENT_MODE_TYPE";
    public static final String SHIPPING_OPTION = "SHIPPING_OPTION";
    public static final String TAG;
    /* access modifiers changed from: private */
    public static final PYPLCheckoutUtils instance = new PYPLCheckoutUtils();
    private String accessToken;
    private String browserType = ApplicationIdentifier.NOT_DEFINED_DUE_TO_EMPTY_PROCESSES.name();
    private FirebaseMessageData finalResponseObject = new FirebaseMessageData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    private final C16708i gson = new C16708i();
    private boolean isFallback;
    private ShippingMethodType selectedShippingMethodType;
    private final Set<String> usedRandomStrings = new HashSet();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final PYPLCheckoutUtils getInstance() {
            return PYPLCheckoutUtils.instance;
        }
    }

    public enum FallbackScenario {
        ADD_CARD,
        ADD_SHIPPING,
        PAYPAL_CREDIT,
        GLOBAL_PAY_LATER
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FallbackScenario.values().length];
            iArr[FallbackScenario.ADD_CARD.ordinal()] = 1;
            iArr[FallbackScenario.ADD_SHIPPING.ordinal()] = 2;
            iArr[FallbackScenario.PAYPAL_CREDIT.ordinal()] = 3;
            iArr[FallbackScenario.GLOBAL_PAY_LATER.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String c = C19386q.m32807a(PYPLCheckoutUtils.class).mo71919c();
        C19383o.m32794d(c);
        TAG = c;
    }

    /* access modifiers changed from: private */
    public final void approveAndReturn(HashMap<String, String> hashMap, String str) {
        ApprovePaymentData data;
        ApprovePayment approvePayment;
        Cart cart;
        PayPalCheckoutCompleteListener paypalCheckoutCompleteListener = getConfig().getPaypalCheckoutCompleteListener();
        if (paypalCheckoutCompleteListener != null) {
            paypalCheckoutCompleteListener.onCheckoutComplete(hashMap);
        }
        if (!this.isFallback) {
            ApprovePaymentResponse approvePaymentResponse = getConfig().getApprovePaymentResponse();
            String str2 = null;
            if (!(approvePaymentResponse == null || (data = approvePaymentResponse.getData()) == null || (approvePayment = data.getApprovePayment()) == null || (cart = approvePayment.getCart()) == null)) {
                str2 = cart.getBillingToken();
            }
            storeBATokenFromResponse(str2);
            OnApprove onApprove = getConfig().getOnApprove();
            if (!(onApprove == null || approvePaymentResponse == null)) {
                ApprovalData from = ApprovalData.Companion.from(approvePaymentResponse);
                Approval approval = new Approval(SdkComponent.Companion.getInstance().getMerchantActions().getApproval().getOrderActions());
                approval.setInternalApprovalData$pyplcheckout_externalThreedsRelease(from);
                onApprove.onApprove(approval);
            }
        } else if (getRepo().isVaultFlow()) {
            approveAndReturnVaultFlow(hashMap);
        } else {
            approveAndReturnFallbackFlow(hashMap);
        }
        terminateActivity(str, "3rd party checkout approved");
    }

    private final void approveAndReturnFallbackFlow(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        String str = hashMap2.get(UrlConstantsKt.URL_PARAM_PAYER_ID);
        String str2 = hashMap2.get(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        String str3 = hashMap2.get(UrlConstantsKt.URL_PARAM_PAYMENT_ID);
        String baTokenFromWebFallback = getBaTokenFromWebFallback(hashMap);
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || C19457k.m33020X0(str2)) {
                z = true;
            }
            if (!z) {
                Approval approval = SdkComponent.Companion.getInstance().getMerchantActions().getApproval();
                storeBATokenFromResponse(baTokenFromWebFallback);
                approval.setInternalApprovalData$pyplcheckout_externalThreedsRelease(new ApprovalData(str, str2, str3, (Buyer) null, (Cart) null, (Address) null, (VaultData) null, baTokenFromWebFallback, 120, (DefaultConstructorMarker) null));
                OnApprove onApprove = getConfig().getOnApprove();
                if (onApprove != null) {
                    onApprove.onApprove(approval);
                    return;
                }
                return;
            }
        }
        String i = C0015b.m90i("PayerId or OrderId are null - PayerId: ", str, ", orderId: ", str2);
        getConfig().invokeOnErrorCallback(new IllegalArgumentException(i), ErrorReason.APPROVE_ORDER_ERROR);
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E578, i, (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_NULL_PAYER_ID, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
    }

    private final void approveAndReturnVaultFlow(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        String str = hashMap2.get(UrlConstantsKt.URL_PARAM_PAYMENT_ID);
        String str2 = hashMap2.get(UrlConstantsKt.URL_PARAM_VAULT_CHECKOUT_APPROVAL_SESSION_ID);
        String str3 = hashMap2.get(UrlConstantsKt.URL_PARAM_APPROVAL_TOKEN_ID);
        boolean z = false;
        if (!(str2 == null || C19457k.m33020X0(str2))) {
            if (str3 == null || C19457k.m33020X0(str3)) {
                z = true;
            }
            if (!z) {
                VaultData vaultData = new VaultData(str2, str3);
                Approval approval = SdkComponent.Companion.getInstance().getMerchantActions().getApproval();
                approval.setInternalApprovalData$pyplcheckout_externalThreedsRelease(new ApprovalData(str2, str3, str, (Buyer) null, (Cart) null, (Address) null, vaultData, (String) null, 184, (DefaultConstructorMarker) null));
                OnApprove onApprove = getConfig().getOnApprove();
                if (onApprove != null) {
                    onApprove.onApprove(approval);
                    return;
                }
                return;
            }
        }
        String i = C0015b.m90i("ApprovalSessionID or ApprovalTokenID are null - PayerId: ", str2, ", orderId: ", str3);
        getConfig().invokeOnErrorCallback(new IllegalArgumentException(i), ErrorReason.APPROVE_ORDER_ERROR);
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E578, i, (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_NULL_PAYER_ID, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
    }

    private final void completeAndReturnProviderIntegration(String str, ReturnToProviderOperationType returnToProviderOperationType) {
        PayPalCheckoutCompleteListener paypalCheckoutCompleteListener = getConfig().getPaypalCheckoutCompleteListener();
        if (paypalCheckoutCompleteListener != null) {
            paypalCheckoutCompleteListener.onCheckoutComplete(new HashMap());
        }
        if (returnToProviderOperationType instanceof ReturnToProviderOperationType.Payment) {
            Approval approval = SdkComponent.Companion.getInstance().getMerchantActions().getApproval();
            OnApprove onApprove = getConfig().getOnApprove();
            if (onApprove != null) {
                onApprove.onApprove(approval);
            }
        } else if (returnToProviderOperationType instanceof ReturnToProviderOperationType.Cancel) {
            OnCancel onCancel = getConfig().getOnCancel();
            if (onCancel != null) {
                onCancel.onCancel();
            }
        } else if (returnToProviderOperationType instanceof ReturnToProviderOperationType.Failure) {
            ReturnToProviderOperationType.Failure failure = (ReturnToProviderOperationType.Failure) returnToProviderOperationType;
            if (failure.getInvokeOnErrorCallback()) {
                getConfig().invokeOnErrorCallback(failure.getException(), failure.getErrorReason());
            }
        }
        Context providerContext = DebugConfigManager.getInstance().getProviderContext();
        if (providerContext != null) {
            Intent launchIntentForPackage = providerContext.getPackageManager().getLaunchIntentForPackage("com.android.chrome");
            Intent launchIntentForPackage2 = providerContext.getPackageManager().getLaunchIntentForPackage(GOOGLE_SEARCH_APP_PACKAGE_NAME);
            if (BaseActivity.Companion.wasInBackground() && getConfig().isSmartPaymentCheckout()) {
                getRepo().setStage(PEnums.Stage.SWITCHING_TO_MERCHANT);
                if (launchIntentForPackage2 != null && C19383o.m32792b(this.browserType, ApplicationIdentifier.GOOGLE_SEARCH_APP.name())) {
                    providerContext.startActivity(launchIntentForPackage2);
                } else if (launchIntentForPackage != null) {
                    providerContext.startActivity(launchIntentForPackage);
                }
            }
        }
        terminateActivity("finishing provider integration: " + str, "1st party checkout complete");
    }

    private final void completeWithCheckoutJS(String str, String str2) {
        PLog.d$default(TAG, C0326j.m864i("completing web integration with: ", str), 0, 4, (Object) null);
        WebView merchantWebView = getConfig().getMerchantWebView();
        merchantWebView.post(new C17995g(str2, this, str, merchantWebView, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: completeWithCheckoutJS$lambda-18  reason: not valid java name */
    public static final void m35465completeWithCheckoutJS$lambda18(String str, PYPLCheckoutUtils pYPLCheckoutUtils, String str2, WebView webView) {
        PYPLCheckoutUtils pYPLCheckoutUtils2 = pYPLCheckoutUtils;
        C19383o.m32797g(pYPLCheckoutUtils2, "this$0");
        if (C19457k.m33019W0("payment", str, true)) {
            PLog.transition$default(PEnums.TransitionName.SHOW_FINAL_CHECKOUT_ANIMATION, PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "showing final checkout animation after checkout on approve via complete with checkout JS", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion companion = Events.Companion;
            companion.getInstance().fire(PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE, (ResultData) null);
            companion.getInstance().listen(PayPalEventTypes.FINISHED_FINAL_ANIMATION, new C17289i(str2, webView, pYPLCheckoutUtils2));
            return;
        }
        pYPLCheckoutUtils2.cancelCheckoutAndExit(CheckoutCancelReason.USER_CANCELLED, "hybrid return to merchant cancel; non-empty url");
    }

    /* access modifiers changed from: private */
    /* renamed from: completeWithCheckoutJS$lambda-18$lambda-17  reason: not valid java name */
    public static final void m35466completeWithCheckoutJS$lambda18$lambda17(String str, WebView webView, PYPLCheckoutUtils pYPLCheckoutUtils, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLCheckoutUtils, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        webView.loadUrl("javascript:(function() {window.popupBridge.end('" + str + "');})()");
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put(UrlConstantsKt.URL_PARAM_RETURN_URI, str);
        pYPLCheckoutUtils.approveAndReturn(hashMap, "hybrid return to merchant payment; non-empty url");
    }

    public static /* synthetic */ void fallBack$default(PYPLCheckoutUtils pYPLCheckoutUtils, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, ErrorReason errorReason, Exception exc, int i, Object obj) {
        pYPLCheckoutUtils.fallBack(str, fallbackReason, fallbackCategory, str2, (i & 16) != 0 ? null : transitionName, errorReason, (i & 64) != 0 ? null : exc);
    }

    private final void fallBackToNative(String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2) {
        PLog.fallback$default(PEnums.TransitionName.FALLBACK_TO_NATIVE, PEnums.StateName.UTILS, str, fallbackReason, fallbackCategory, PEnums.FallbackDestination.MERCHANT_APP, str2, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        getRepo().setStage(PEnums.Stage.NATIVE_FALLBACK);
        showErrorDialogOnUiThread(getConfig().getCheckoutBaseActivity(), PEnums.EventCode.E501, str2);
    }

    private final void fallBackToWeb(String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, boolean z) {
        RealTimeDB instance2;
        if (getConfig().getCheckoutToken() != null) {
            if (z && (instance2 = RealTimeDB.Companion.getInstance()) != null) {
                instance2.sendRequest(getIndefiniteFallbackRequest());
            }
            PLog.fallback$default(transitionName == null ? PEnums.TransitionName.FALLBACK_TO_WEB : transitionName, PEnums.StateName.UTILS, str, fallbackReason, fallbackCategory, PEnums.FallbackDestination.WEB, str2, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
            getConfig().setIsFallback(true);
            getRepo().setStage(PEnums.Stage.WEB_FALLBACK);
            if (!getConfig().getDidCustomTabOpen()) {
                Uri checkoutLiteUrl$default = getCheckoutLiteUrl$default(this, (FallbackScenario) null, 1, (Object) null);
                BaseActivity checkoutBaseActivity = getConfig().getCheckoutBaseActivity();
                C19383o.m32796f(checkoutBaseActivity, "config.checkoutBaseActivity");
                openChromeCustomTabs(checkoutLiteUrl$default, checkoutBaseActivity);
                return;
            }
            return;
        }
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E404;
        PLog.error$default(errorType, eventCode, "Checkout token not found", (String) null, (Throwable) null, PEnums.TransitionName.FALLBACK_TO_WEB, PEnums.StateName.UTILS, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        showErrorDialogOnUiThread(getConfig().getCheckoutBaseActivity(), eventCode, "Checkout token not found");
    }

    public static /* synthetic */ void fallBackToWeb$default(PYPLCheckoutUtils pYPLCheckoutUtils, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            transitionName = null;
        }
        PEnums.TransitionName transitionName2 = transitionName;
        if ((i & 32) != 0) {
            z = false;
        }
        pYPLCheckoutUtils.fallBackToWeb(str, fallbackReason, fallbackCategory, str2, transitionName2, z);
    }

    public static /* synthetic */ void fallbackIndefinite$default(PYPLCheckoutUtils pYPLCheckoutUtils, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, ErrorReason errorReason, Exception exc, boolean z, int i, Object obj) {
        int i2 = i;
        pYPLCheckoutUtils.fallbackIndefinite(str, fallbackReason, fallbackCategory, str2, (i2 & 16) != 0 ? null : transitionName, errorReason, (i2 & 64) != 0 ? null : exc, (i2 & 128) != 0 ? false : z);
    }

    /* access modifiers changed from: private */
    /* renamed from: findTriggeredApp$lambda-23  reason: not valid java name */
    public static final int m35467findTriggeredApp$lambda23(ActivityManager.RunningServiceInfo runningServiceInfo, ActivityManager.RunningServiceInfo runningServiceInfo2) {
        int i = (runningServiceInfo.lastActivityTime > runningServiceInfo2.lastActivityTime ? 1 : (runningServiceInfo.lastActivityTime == runningServiceInfo2.lastActivityTime ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: findTriggeredApp$lambda-24  reason: not valid java name */
    public static final int m35468findTriggeredApp$lambda24(ActivityManager.RunningServiceInfo runningServiceInfo, ActivityManager.RunningServiceInfo runningServiceInfo2) {
        int i = (runningServiceInfo.lastActivityTime > runningServiceInfo2.lastActivityTime ? 1 : (runningServiceInfo.lastActivityTime == runningServiceInfo2.lastActivityTime ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    private final String getBaTokenFromWebFallback(HashMap<String, String> hashMap) {
        String str = hashMap.get(UrlConstantsKt.URL_PARAM_BA_TOKEN);
        if (str != null) {
            return str;
        }
        String str2 = hashMap.get(UrlConstantsKt.URL_PARAM_RETURN_URI);
        if (str2 == null) {
            return null;
        }
        return Uri.parse(str2).getQueryParameter(UrlConstantsKt.URL_PARAM_BA_TOKEN);
    }

    private final int getBuildVersion() {
        return SdkComponent.Companion.getInstance().getBuildVersionProvider().getVersion();
    }

    public static /* synthetic */ Uri getCheckoutLiteUrl$default(PYPLCheckoutUtils pYPLCheckoutUtils, FallbackScenario fallbackScenario, int i, Object obj) {
        if ((i & 1) != 0) {
            fallbackScenario = null;
        }
        return pYPLCheckoutUtils.getCheckoutLiteUrl(fallbackScenario);
    }

    private final DebugConfigManager getConfig() {
        DebugConfigManager instance2 = DebugConfigManager.getInstance();
        C19383o.m32796f(instance2, "getInstance()");
        return instance2;
    }

    private final GetPropsRequest getFinishRequest(ReturnToProviderOperationType returnToProviderOperationType) {
        String generateSecureRandomString = generateSecureRandomString();
        String generateSecureRandomString2 = generateSecureRandomString();
        String str = ((returnToProviderOperationType instanceof ReturnToProviderOperationType.Cancel) || (returnToProviderOperationType instanceof ReturnToProviderOperationType.Failure)) ? "onCancel" : "onApprove";
        String sdkVersion = VersionUtils.INSTANCE.getSdkVersion();
        String firebaseSessionId = getConfig().getFirebaseSessionId();
        FirebaseMessageData firebaseMessageData = this.finalResponseObject;
        firebaseMessageData.setButtonSessionId(getConfig().getButtonSessionId());
        String j = this.gson.mo59463j(new FirebaseProperties((String) null, (String) null, sdkVersion, LoginFragment.EXTRA_REQUEST, firebaseSessionId, generateSecureRandomString, generateSecureRandomString2, str, (String) null, firebaseMessageData, 259, (DefaultConstructorMarker) null));
        C19383o.m32796f(j, "gson.toJson(firebaseProps)");
        return new GetPropsRequest(j, generateSecureRandomString, generateSecureRandomString);
    }

    public static /* synthetic */ void getHermesUrl$annotations() {
    }

    public static final PYPLCheckoutUtils getInstance() {
        return Companion.getInstance();
    }

    private final MerchantConfigRepository getMerchantConfigRepository() {
        return SdkComponent.Companion.getInstance().getMerchantConfigRepository();
    }

    private final Repository getRepo() {
        return SdkComponent.Companion.getInstance().getRepository();
    }

    public static /* synthetic */ void isFallback$annotations() {
    }

    private final void returnToMerchant(String str, ReturnToProviderOperationType returnToProviderOperationType) {
        ShippingMethodType.Type shippingMethodType;
        String str2 = str;
        ReturnToProviderOperationType returnToProviderOperationType2 = returnToProviderOperationType;
        String obj = returnToProviderOperationType2 == null ? null : returnToProviderOperationType.toString();
        if (str2 == null || (returnToProviderOperationType2 instanceof ReturnToProviderOperationType.Failure)) {
            cancelCheckoutAndExit(CheckoutCancelReason.CHECKOUT_ERROR, str2 == null ? "return to merchant called with null url" : returnToProviderOperationType2 instanceof ReturnToProviderOperationType.Failure ? "return to merchant called due to failure" : "return to merchant called with unknown reason");
            return;
        }
        if (!(str.length() == 0)) {
            Uri parse = Uri.parse(returnToProviderOperationType2 == null ? null : StringExtensionsKt.cleanseReturnUrl(str2, returnToProviderOperationType.toString()));
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (parse.getQueryParameter(UrlConstantsKt.URL_PARAM_OP_TYPE) != null) {
                obj = parse.getQueryParameter(UrlConstantsKt.URL_PARAM_OP_TYPE);
            }
            if (getConfig().checkCheckoutJSSession()) {
                completeWithCheckoutJS(str2, obj);
            } else if (returnToProviderOperationType2 instanceof ReturnToProviderOperationType.Payment) {
                HashMap hashMap = new HashMap();
                hashMap.put(UrlConstantsKt.URL_PARAM_RETURN_URI, str2);
                String str3 = "";
                if (getConfig().getOrderCaptureUrl() != null) {
                    String orderCaptureUrl = getConfig().getOrderCaptureUrl();
                    if (orderCaptureUrl == null) {
                        orderCaptureUrl = str3;
                    }
                    hashMap.put(UrlConstantsKt.URL_PARAM_CAPTURE_URL, orderCaptureUrl);
                }
                if (getConfig().getOrderAuthorizeUrl() != null) {
                    String orderAuthorizeUrl = getConfig().getOrderAuthorizeUrl();
                    if (orderAuthorizeUrl == null) {
                        orderAuthorizeUrl = str3;
                    }
                    hashMap.put(UrlConstantsKt.URL_PARAM_AUTHORIZE_URL, orderAuthorizeUrl);
                }
                for (String next : queryParameterNames) {
                    C19383o.m32796f(next, "returnParamName");
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        queryParameter = str3;
                    }
                    hashMap.put(next, queryParameter);
                }
                hashMap.put(PAYMENT_MODE_TYPE, String.valueOf(getRepo().getPayMode()));
                if (getConfig().isCCTReturn()) {
                    approveAndReturn(hashMap, "native return to merchant payment; cct");
                    return;
                }
                String str4 = SHIPPING_OPTION;
                ShippingMethodType shippingMethodType2 = this.selectedShippingMethodType;
                if (shippingMethodType2 == null) {
                    str3 = ShippingMethodType.Type.SHIPPING.toString();
                } else {
                    String name = (shippingMethodType2 == null || (shippingMethodType = shippingMethodType2.getShippingMethodType()) == null) ? null : shippingMethodType.name();
                    if (name != null) {
                        str3 = name;
                    }
                }
                hashMap.put(str4, str3);
                PLog.transition$default(PEnums.TransitionName.SHOW_FINAL_CHECKOUT_ANIMATION, PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "showing final checkout animation after checkout on approve via return to merchant with operation type payment", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
                Events.Companion companion = Events.Companion;
                companion.getInstance().listen(PayPalEventTypes.FINISHED_FINAL_ANIMATION, new C17288h(this, hashMap));
                companion.getInstance().fire(PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE, (ResultData) null);
            } else {
                cancelCheckoutAndExit(CheckoutCancelReason.USER_CANCELLED, "native return to merchant cancel");
            }
        } else if (!getConfig().checkCheckoutJSSession()) {
            CheckoutCancelReason access$getCancelReason = PYPLCheckoutUtilsKt.getCancelReason(returnToProviderOperationType);
            cancelCheckoutAndExit(access$getCancelReason, "native return to merchant; reason: " + returnToProviderOperationType2 + "; emptyReturnUrl? true");
        } else if (returnToProviderOperationType2 instanceof ReturnToProviderOperationType.Payment) {
            PLog.transition$default(PEnums.TransitionName.SHOW_FINAL_CHECKOUT_ANIMATION, PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "showing final checkout animation after checkout on approve via return to merchant with empty url", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion companion2 = Events.Companion;
            companion2.getInstance().fire(PayPalEventTypes.FINISHED_CHECKOUT_ON_APPROVE, (ResultData) null);
            companion2.getInstance().listen(PayPalEventTypes.FINISHED_FINAL_ANIMATION, new PYPLCheckoutUtils$returnToMerchant$1(this));
        } else {
            cancelCheckoutAndExit(CheckoutCancelReason.USER_CANCELLED, "hybrid return to merchant cancel; empty url");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: returnToMerchant$lambda-14  reason: not valid java name */
    public static final void m35469returnToMerchant$lambda14(PYPLCheckoutUtils pYPLCheckoutUtils, HashMap hashMap, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLCheckoutUtils, "this$0");
        C19383o.m32797g(hashMap, "$returnParams");
        C19383o.m32797g(eventType, "$noName_0");
        pYPLCheckoutUtils.approveAndReturn(hashMap, "native return to merchant payment; native");
    }

    /* access modifiers changed from: private */
    /* renamed from: returnToProviderWithResponse$lambda-6  reason: not valid java name */
    public static final void m35470returnToProviderWithResponse$lambda6(PYPLCheckoutUtils pYPLCheckoutUtils, String str, ReturnToProviderOperationType returnToProviderOperationType, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLCheckoutUtils, "this$0");
        C19383o.m32797g(str, "$from");
        C19383o.m32797g(returnToProviderOperationType, "$opType");
        C19383o.m32797g(eventType, "$noName_0");
        pYPLCheckoutUtils.completeAndReturnProviderIntegration(str, returnToProviderOperationType);
    }

    public static /* synthetic */ void showDebugErrorDialog$default(PYPLCheckoutUtils pYPLCheckoutUtils, Activity activity, PEnums.EventCode eventCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        pYPLCheckoutUtils.showDebugErrorDialog(activity, eventCode, str);
    }

    @IgnoreGeneratedTestReport
    private final void showErrorDialog(Context context, PEnums.EventCode eventCode, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ErrorDialogView errorDialogView = new ErrorDialogView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        String string = context.getString(C17165R.string.paypal_checkout_headline_not_right);
        C19383o.m32796f(string, "context.getString(R.stri…ckout_headline_not_right)");
        errorDialogView.setTitle(string);
        String string2 = context.getString(C17165R.string.paypal_checkout_firebase_elmo_problem);
        C19383o.m32796f(string2, "context.getString(R.stri…ut_firebase_elmo_problem)");
        if (PYPLCheckoutUtilsKt.isDebug()) {
            string2 = C0326j.m864i("Error: ", str);
        }
        errorDialogView.setMessage(string2);
        if (eventCode != null) {
            errorDialogView.setErrorCode(eventCode.toPublicString());
        }
        errorDialogView.setButtonAction(new C9403q(4, eventCode, this));
        builder.setView(errorDialogView);
        builder.setCancelable(false);
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: showErrorDialog$lambda-21  reason: not valid java name */
    public static final void m35471showErrorDialog$lambda21(PEnums.EventCode eventCode, PYPLCheckoutUtils pYPLCheckoutUtils, View view) {
        C19383o.m32797g(pYPLCheckoutUtils, "this$0");
        PEnums.TransitionName transitionName = PEnums.TransitionName.ERROR_DIALOG_FALLBACK_CLICKED;
        PEnums.Outcome outcome = PEnums.Outcome.SUCCESS;
        if (eventCode == null) {
            eventCode = PEnums.EventCode.E598;
        }
        PLog.click$default(transitionName, outcome, eventCode, PEnums.StateName.UTILS, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 496, (Object) null);
        pYPLCheckoutUtils.terminateActivity("PYPLCheckoutUtils", "Hit OK on error dialog");
    }

    public static /* synthetic */ void showErrorDialogOnUiThread$default(PYPLCheckoutUtils pYPLCheckoutUtils, Activity activity, PEnums.EventCode eventCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        pYPLCheckoutUtils.showErrorDialogOnUiThread(activity, eventCode, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: showErrorDialogOnUiThread$lambda-20  reason: not valid java name */
    public static final void m35472showErrorDialogOnUiThread$lambda20(PYPLCheckoutUtils pYPLCheckoutUtils, Activity activity, PEnums.EventCode eventCode, String str) {
        C19383o.m32797g(pYPLCheckoutUtils, "this$0");
        C19383o.m32797g(eventCode, "$errorCode");
        C19383o.m32796f(activity, "_activity");
        pYPLCheckoutUtils.showErrorDialog(activity, eventCode, str);
    }

    private final void storeBATokenFromResponse(String str) {
        SdkComponent.Companion.getInstance().getBillingAgreementsRepository().setBillingAgreementToken(str);
    }

    public static /* synthetic */ void terminateActivity$default(PYPLCheckoutUtils pYPLCheckoutUtils, PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = i;
        pYPLCheckoutUtils.terminateActivity(transitionName, outcome, (i2 & 4) != 0 ? null : eventCode, (i2 & 8) != 0 ? null : stateName, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : fallbackReason, (i2 & 64) != 0 ? null : fallbackCategory, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : str3, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? null : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? null : str5);
    }

    public final void cancelCheckoutAndExit(CheckoutCancelReason checkoutCancelReason, String str) {
        C19394m mVar;
        String str2;
        CheckoutCancelReason checkoutCancelReason2 = checkoutCancelReason;
        C19383o.m32797g(checkoutCancelReason2, "cancelReason");
        C19383o.m32797g(str, "reason");
        if (checkoutCancelReason2 == CheckoutCancelReason.CHECKOUT_ERROR) {
            getConfig().invokeOnErrorCallback(new IllegalArgumentException("Return URL is null"), ErrorReason.APPROVE_ORDER_ERROR);
            PLog pLog = PLog.INSTANCE;
            PLog.fallback$default(PEnums.TransitionName.RETURN_TO_PROVIDER, PEnums.StateName.SHUTDOWN, "user checkout", PEnums.FallbackReason.EMPTY_RETURN_URL, PEnums.FallbackCategory.CHECKOUT_ERRORS, (PEnums.FallbackDestination) null, str, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 416, (Object) null);
        }
        OnCancel onCancel = getConfig().getOnCancel();
        C19394m mVar2 = null;
        if (onCancel == null) {
            mVar = null;
        } else {
            if (checkoutCancelReason2 == CheckoutCancelReason.USER_CANCELLED) {
                onCancel.onCancel();
                PLog.transition$default(PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION, PEnums.Outcome.CANCELLED, (PEnums.EventCode) null, PEnums.StateName.SHUTDOWN, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15348, (Object) null);
            }
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            PayPalCheckoutCompleteListener paypalCheckoutCompleteListener = getConfig().getPaypalCheckoutCompleteListener();
            str2 = str;
            if (paypalCheckoutCompleteListener != null) {
                paypalCheckoutCompleteListener.onCheckoutCancelled(checkoutCancelReason2, str2);
                mVar2 = C19394m.f43287a;
            }
            if (mVar2 == null) {
                PLog pLog2 = PLog.INSTANCE;
                PLog.fallback$default(PEnums.TransitionName.RETURN_TO_PROVIDER, PEnums.StateName.SHUTDOWN, "user checkout", PEnums.FallbackReason.EMPTY_RETURN_URL, PEnums.FallbackCategory.CHECKOUT_ERRORS, (PEnums.FallbackDestination) null, str, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 416, (Object) null);
            }
        } else {
            str2 = str;
        }
        terminateActivity(str2, checkoutCancelReason.name());
    }

    public final void cancelCheckoutFlow(String str, String str2) {
        PEnums.TransitionName transitionName = PEnums.TransitionName.NATIVE_XO_EXIT;
        PEnums.Outcome outcome = PEnums.Outcome.MERCHANT_CANCELED;
        PEnums.EventCode eventCode = PEnums.EventCode.E617;
        PEnums.StateName stateName = PEnums.StateName.UTILS;
        boolean isPropsSet = getConfig().isPropsSet();
        terminateActivity$default(this, transitionName, outcome, eventCode, stateName, str, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "info: " + str2 + ", propsSet: " + isPropsSet + " ", 992, (Object) null);
    }

    public final void clearAllInstances() {
        Events.Companion companion = Events.Companion;
        companion.getInstance().fire(ExtendedPayPalEventTypes.KILL_APP_CANCEL_TB_TIMER, (ResultData) null);
        SdkComponent.Companion.getInstance().getAmplitudeManager().getLogger().clearSession();
        RealTimeDB instance2 = RealTimeDB.Companion.getInstance();
        if (instance2 != null) {
            instance2.signOutCurrentSession();
        }
        companion.getInstance().clearAllListeners();
        ExtendedCheckoutConfig.getInstance().clearInstance();
        this.isFallback = false;
        getRepo().resetPayMode();
    }

    public final void clearRepositories() {
        SdkComponent instance2 = SdkComponent.Companion.getInstance();
        instance2.getRepository().reset();
        instance2.getBillingAgreementsRepository().clear();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData createFinalResponseObject(java.lang.String r24, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            java.lang.String r2 = "url"
            r3 = r24
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            java.lang.String r2 = "opType"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r2 = r0.finalResponseObject     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            com.paypal.pyplcheckout.model.DebugConfigManager r4 = r23.getConfig()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r4 = r4.getCheckoutToken()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r2.setOrderId(r4)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r2 = r24.length()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r4 = 1
            r5 = 0
            if (r2 <= 0) goto L_0x0027
            r2 = r4
            goto L_0x0028
        L_0x0027:
            r2 = r5
        L_0x0028:
            if (r2 == 0) goto L_0x016c
            android.net.Uri r2 = android.net.Uri.parse(r24)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r2 = r2.getQuery()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r3.<init>()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r3.append(r2)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r2 = "&opType="
            r3.append(r2)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r3.append(r1)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r1 = r3.toString()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            kotlin.text.Regex r2 = new kotlin.text.Regex     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r3 = "&"
            r2.<init>((java.lang.String) r3)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.util.List r1 = r2.split(r1, r5)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            if (r1 == 0) goto L_0x0166
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r3 = r1.length     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r6 = r5
        L_0x005f:
            if (r6 >= r3) goto L_0x016c
            r7 = r1[r6]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r6 = r6 + 1
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r9 = "="
            r8.<init>((java.lang.String) r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.util.List r7 = r8.split(r7, r5)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r7 == 0) goto L_0x0160
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r8 = r7.length     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9 = 2
            if (r8 >= r9) goto L_0x00ec
            com.paypal.pyplcheckout.common.instrumentation.PEnums$ErrorType r10 = com.paypal.pyplcheckout.common.instrumentation.PEnums.ErrorType.INFO     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r11 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E560     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r8 = r7.length     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 != 0) goto L_0x0087
            r8 = r4
            goto L_0x0088
        L_0x0087:
            r8 = r5
        L_0x0088:
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = kotlin.collections.C19318k.m32612d1(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r8 = r8.length()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 <= 0) goto L_0x0099
            r8 = r4
            goto L_0x009a
        L_0x0099:
            r8 = r5
        L_0x009a:
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r7 = kotlin.collections.C19318k.m32612d1(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.<init>()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r9 = "The value of "
            r8.append(r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = " key's is missing"
            r8.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = r8.toString()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x00d4
        L_0x00b7:
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r8 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9.<init>()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r12 = "Key & value are missing "
            r9.append(r12)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = " "
            r9.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9.append(r8)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = r9.toString()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
        L_0x00d4:
            r12 = r7
            r13 = 0
            r14 = 0
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r15 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.RETURN_TO_PROVIDER     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 2008(0x7d8, float:2.814E-42)
            r22 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.error$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x00ec:
            java.lang.Object r8 = kotlin.collections.C19318k.m32612d1(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            int r9 = r8.hashCode()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            switch(r9) {
                case -86519359: goto L_0x0130;
                case 110541305: goto L_0x011e;
                case 877744912: goto L_0x010c;
                case 2015542777: goto L_0x00fa;
                default: goto L_0x00f9;
            }     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
        L_0x00f9:
            goto L_0x0142
        L_0x00fa:
            java.lang.String r9 = "ba_token"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 != 0) goto L_0x0103
            goto L_0x0142
        L_0x0103:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r8 = r0.finalResponseObject     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r7 = r7[r4]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.setBillingToken(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x010c:
            java.lang.String r9 = "PayerID"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 != 0) goto L_0x0115
            goto L_0x0142
        L_0x0115:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r8 = r0.finalResponseObject     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r7 = r7[r4]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.setPayerId(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x011e:
            java.lang.String r9 = "token"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 != 0) goto L_0x0127
            goto L_0x0142
        L_0x0127:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r8 = r0.finalResponseObject     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r7 = r7[r4]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.setToken(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x0130:
            java.lang.String r9 = "paymentId"
            boolean r8 = r8.equals(r9)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            if (r8 != 0) goto L_0x0139
            goto L_0x0142
        L_0x0139:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r8 = r0.finalResponseObject     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r7 = r7[r4]     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r8.setPaymentId(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x0142:
            java.lang.String r8 = TAG     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.Object r7 = kotlin.collections.C19318k.m32612d1(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9.<init>()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = " -> parameter is not required for the final response object"
            r9.append(r7)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            java.lang.String r7 = r9.toString()     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r9 = 4
            r10 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.i$default(r8, r7, r5, r9, r10)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            goto L_0x005f
        L_0x0160:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            throw r1     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
        L_0x0166:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
            throw r1     // Catch:{ JSONException -> 0x0180, NullPointerException -> 0x016f }
        L_0x016c:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r1 = r0.finalResponseObject
            return r1
        L_0x016f:
            r2 = 0
            r3 = 0
            r4 = 0
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r5 = r0.finalResponseObject     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = "Failed to parse finishPayment"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E597     // Catch:{ all -> 0x0191 }
            r8 = 7
            r9 = 0
            com.paypal.pyplcheckout.utils.ErrorUtils.sendOnErrorMessageToFireBase$default(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0191 }
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r1 = r0.finalResponseObject
            return r1
        L_0x0180:
            r2 = 0
            r3 = 0
            r4 = 0
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r5 = r0.finalResponseObject     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = "Failed to parse finishPayment"
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E592     // Catch:{ all -> 0x0191 }
            r8 = 7
            r9 = 0
            com.paypal.pyplcheckout.utils.ErrorUtils.sendOnErrorMessageToFireBase$default(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0191 }
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r1 = r0.finalResponseObject
            return r1
        L_0x0191:
            com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData r1 = r0.finalResponseObject
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.createFinalResponseObject(java.lang.String, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType):com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData");
    }

    @IgnoreGeneratedTestReport
    public final boolean evaluateDebug() {
        try {
            String packageName = getConfig().getProviderContext().getPackageName();
            Object obj = Class.forName(packageName + ".BuildConfig").getField("DEBUG").get((Object) null);
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e) {
            PLog.e$default(TAG, "class not found when evaluating isDebug", e, 0, 8, (Object) null);
            return false;
        } catch (NoSuchFieldException e2) {
            PLog.e$default(TAG, "no such file when evaluating isDebug", e2, 0, 8, (Object) null);
            return false;
        } catch (IllegalAccessException e3) {
            PLog.e$default(TAG, "illegal access when evaluating isDebug", e3, 0, 8, (Object) null);
            return false;
        } catch (Exception e4) {
            PLog.e$default(TAG, "exception when evaluating isDebug", e4, 0, 8, (Object) null);
            return false;
        }
    }

    public final void fallBack(String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, ErrorReason errorReason, Exception exc) {
        C19383o.m32797g(str, ResponseConstants.FROM);
        C19383o.m32797g(fallbackReason, "reason");
        C19383o.m32797g(fallbackCategory, "fallbackCategory");
        ErrorReason errorReason2 = errorReason;
        C19383o.m32797g(errorReason2, "errorReason");
        fallbackIndefinite(str, fallbackReason, fallbackCategory, str2, transitionName, errorReason2, exc, false);
    }

    public final void fallbackIndefinite(String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, PEnums.TransitionName transitionName, ErrorReason errorReason, Exception exc, boolean z) {
        C19383o.m32797g(str, ResponseConstants.FROM);
        C19383o.m32797g(fallbackReason, "reason");
        C19383o.m32797g(fallbackCategory, "fallbackCategory");
        C19383o.m32797g(errorReason, "errorReason");
        this.isFallback = true;
        if (str2 != null) {
            String str3 = TAG;
            String format = String.format("fallback reason %s: %s", Arrays.copyOf(new Object[]{fallbackReason, str2}, 2));
            C19383o.m32796f(format, "format(format, *args)");
            PLog.m28728dR(str3, format);
        } else {
            String str4 = TAG;
            String format2 = String.format("fallback reason %s", Arrays.copyOf(new Object[]{fallbackReason}, 1));
            C19383o.m32796f(format2, "format(format, *args)");
            PLog.m28728dR(str4, format2);
        }
        if (getConfig().shouldFallBackToWeb()) {
            fallBackToWeb(str, fallbackReason, fallbackCategory, str2, transitionName, z);
        } else {
            fallBackToNative(str, fallbackReason, fallbackCategory, str2);
        }
    }

    public final String findTriggeredApp(Context context) {
        boolean z;
        long j;
        boolean z2;
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        if (getBuildVersion() >= 26) {
            this.browserType = ApplicationIdentifier.NOT_DEFINED_DUE_TO_VERSION_COMPATIBILITY.name();
            return ApplicationIdentifier.CHROME_APP.name();
        }
        Object systemService = context2.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (runningServices.isEmpty()) {
                PEnums.TransitionName transitionName = PEnums.TransitionName.SOURCE_APP_IDENTIFIED;
                PEnums.Outcome outcome = PEnums.Outcome.SOURCE_APP_IDENTIFIED;
                PEnums.EventCode eventCode = PEnums.EventCode.E221;
                PEnums.StateName stateName = PEnums.StateName.STARTUP;
                ApplicationIdentifier applicationIdentifier = ApplicationIdentifier.NOT_DEFINED_DUE_TO_EMPTY_PROCESSES;
                PLog.transition$default(transitionName, outcome, eventCode, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, applicationIdentifier.name(), "NativeCheckoutSDK", (String) null, "Running service info is empty.", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14960, (Object) null);
                this.browserType = applicationIdentifier.name();
                return ApplicationIdentifier.CHROME_APP.name();
            }
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            PriorityQueue priorityQueue = new PriorityQueue(10, new C17286f());
            HashSet hashSet3 = new HashSet();
            PriorityQueue priorityQueue2 = new PriorityQueue(10, new C17287g());
            Iterator<T> it = runningServices.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo) it.next();
                String str = runningServiceInfo.process;
                C19383o.m32796f(str, "processName");
                if (C19459m.m33036e1(str, "chrome", true) || C19459m.m33036e1(str, "googlequicksearchbox", true)) {
                    if (hashSet.add(runningServiceInfo.activeSince + str + runningServiceInfo.lastActivityTime)) {
                        hashSet2.add(runningServiceInfo);
                        priorityQueue.add(runningServiceInfo);
                    }
                }
                if (hashSet3.add(runningServiceInfo.activeSince + str + runningServiceInfo.lastActivityTime)) {
                    priorityQueue2.add(runningServiceInfo);
                }
            }
            ArrayList arrayList = new ArrayList();
            long j2 = -1;
            long j3 = -1;
            while (!priorityQueue.isEmpty()) {
                ActivityManager.RunningServiceInfo runningServiceInfo2 = (ActivityManager.RunningServiceInfo) priorityQueue.poll();
                if (runningServiceInfo2 == null) {
                    j = j2;
                    z2 = z;
                } else {
                    j = j2;
                    arrayList.add(runningServiceInfo2.activeSince + ": " + runningServiceInfo2.process + " :" + runningServiceInfo2.lastActivityTime);
                    String str2 = runningServiceInfo2.process;
                    C19383o.m32796f(str2, "processInfo.process");
                    z2 = true;
                    if (!C19459m.m33036e1(str2, "googlequicksearchbox:search", true)) {
                        String str3 = runningServiceInfo2.process;
                        C19383o.m32796f(str3, "processInfo.process");
                        if (!C19459m.m33036e1(str3, "googlequicksearchbox:interactor", true)) {
                            String str4 = runningServiceInfo2.process;
                            C19383o.m32796f(str4, "processInfo.process");
                            if (C19459m.m33036e1(str4, "chrome:privileged", true)) {
                                j2 = runningServiceInfo2.lastActivityTime;
                                z = true;
                            }
                        }
                    }
                    j3 = Math.max(j3, runningServiceInfo2.lastActivityTime);
                }
                z = z2;
                j2 = j;
            }
            long j4 = j2;
            ArrayList arrayList2 = new ArrayList();
            while (!priorityQueue2.isEmpty()) {
                ActivityManager.RunningServiceInfo runningServiceInfo3 = (ActivityManager.RunningServiceInfo) priorityQueue2.poll();
                if (runningServiceInfo3 != null) {
                    arrayList2.add(runningServiceInfo3.activeSince + ": " + runningServiceInfo3.process + " :" + runningServiceInfo3.lastActivityTime);
                }
            }
            if (j3 > j4) {
                PEnums.TransitionName transitionName2 = PEnums.TransitionName.SOURCE_APP_IDENTIFIED;
                PEnums.Outcome outcome2 = PEnums.Outcome.SOURCE_APP_IDENTIFIED;
                PEnums.EventCode eventCode2 = PEnums.EventCode.E221;
                PEnums.StateName stateName2 = PEnums.StateName.STARTUP;
                ApplicationIdentifier applicationIdentifier2 = ApplicationIdentifier.GOOGLE_SEARCH_APP;
                PLog.transition$default(transitionName2, outcome2, eventCode2, stateName2, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, applicationIdentifier2.name(), "NativeCheckoutSDK", (String) null, "NativeCheckoutSDK was triggered by Google Search app.", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14960, (Object) null);
                this.browserType = applicationIdentifier2.name();
                return applicationIdentifier2.name();
            }
            PEnums.TransitionName transitionName3 = PEnums.TransitionName.SOURCE_APP_IDENTIFIED;
            PEnums.Outcome outcome3 = PEnums.Outcome.SOURCE_APP_IDENTIFIED;
            PEnums.EventCode eventCode3 = PEnums.EventCode.E221;
            PEnums.StateName stateName3 = PEnums.StateName.STARTUP;
            ApplicationIdentifier applicationIdentifier3 = ApplicationIdentifier.CHROME_APP;
            PLog.transition$default(transitionName3, outcome3, eventCode3, stateName3, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, applicationIdentifier3.name(), "NativeCheckoutSDK", (String) null, "NativeCheckoutSDK was triggered by Chrome app.", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14960, (Object) null);
            this.browserType = applicationIdentifier3.name();
            return applicationIdentifier3.name();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    public final String generateSecureRandomString() {
        return C0069a.m174e("randomUUID().toString()");
    }

    public final String getBrowserType() {
        return this.browserType;
    }

    public final Uri getCheckoutLiteUrl(FallbackScenario fallbackScenario) {
        String str;
        if (getRepo().isVaultFlow()) {
            str = C0015b.m90i("https://", getConfig().getCheckoutEnvironment().getHost(), "/agreements/approve?approval_session_id=", getConfig().getCheckoutToken());
        } else {
            str = getConfig().getMerchantCartUrl();
            if (str == null) {
                str = C0048b.m163a("https://", getConfig().getCheckoutEnvironment().getHost(), "/checkoutnow");
            }
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String query = parse.getQuery();
        List<String> pathSegments = parse.getPathSegments();
        C19383o.m32796f(pathSegments, "rootUri.pathSegments");
        String Z0 = C19327t.m32644Z0(pathSegments, "/", (String) null, (String) null, (C19857l) null, 62);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(scheme).authority(host).appendPath(Z0);
        StringBuilder sb = new StringBuilder();
        if (query != null) {
            sb.append(query);
            sb.append("&");
        }
        sb.append("redirect_uri=");
        sb.append(getMerchantConfigRepository().getMerchantReturnURLScheme());
        sb.append("://paypalxo");
        sb.append("&native_xo=1");
        if (getConfig().getMerchantCartUrl() == null) {
            if (getConfig().getCheckoutToken() != null) {
                sb.append("&token=");
                sb.append(getConfig().getCheckoutToken());
            }
            if (getConfig().getMerchantURLQueryParams() != null) {
                HashMap<String, String> merchantURLQueryParams = getConfig().getMerchantURLQueryParams();
                C19383o.m32796f(merchantURLQueryParams, "config.merchantURLQueryParams");
                for (Map.Entry next : merchantURLQueryParams.entrySet()) {
                    String str2 = (String) next.getKey();
                    String str3 = (String) next.getValue();
                    String builder2 = builder.toString();
                    C19383o.m32796f(builder2, "builder.toString()");
                    C19383o.m32796f(str2, "key");
                    if (!C19459m.m33036e1(builder2, str2, false)) {
                        C0391c.m1061h(sb, "&", str2, "=", str3);
                    }
                }
            }
        }
        int i = fallbackScenario == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fallbackScenario.ordinal()];
        boolean z = true;
        if (i == 1) {
            sb.append("&addCard=1");
        } else if (i == 2) {
            sb.append("&addShipping=1");
        } else if (i == 3) {
            sb.append("&credit=1");
        } else if (i == 4) {
            sb.append("&payLater=1");
        }
        sb.append("&buttonSessionID=" + getConfig().getButtonSessionId());
        sb.append("&euat=1#");
        String str4 = this.accessToken;
        if (!(str4 == null || str4.length() == 0)) {
            z = false;
        }
        if (z) {
            PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E621, "AccessToken is null when trying to fall back to web", (String) null, (Throwable) null, PEnums.TransitionName.FALLBACK_TO_WEB, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        }
        String str5 = this.accessToken;
        if (str5 != null) {
            sb.append(str5);
        }
        builder.encodedQuery(sb.toString());
        Uri build = builder.build();
        PLog.d$default(TAG, C0073e.m206f("checkoutLite url: ", build), 0, 4, (Object) null);
        C19383o.m32796f(build, "checkoutLiteURL");
        return build;
    }

    public final Uri getHermesUrl() {
        String merchantCartUrl = getConfig().getMerchantCartUrl();
        if (merchantCartUrl == null) {
            merchantCartUrl = C0048b.m163a("https://", getConfig().getCheckoutEnvironment().getHost(), "/checkoutnow");
        }
        Uri parse = Uri.parse(merchantCartUrl);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String query = parse.getQuery();
        String lastPathSegment = parse.getLastPathSegment();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(scheme).authority(host).appendPath(lastPathSegment);
        StringBuilder sb = new StringBuilder();
        if (query != null) {
            sb.append(query);
            sb.append("&");
        }
        sb.append("redirect_uri=");
        sb.append(getMerchantConfigRepository().getMerchantReturnURLScheme());
        sb.append("://paypalxo");
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "queryBuilder.toString()");
        if (!C19459m.m33036e1(sb2, "native_xo", false)) {
            sb.append("&native_xo=1");
        }
        if (getConfig().getMerchantCartUrl() == null) {
            if (getConfig().getCheckoutToken() != null) {
                sb.append("&token=");
                sb.append(getConfig().getCheckoutToken());
            }
            if (getConfig().getMerchantURLQueryParams() != null) {
                HashMap<String, String> merchantURLQueryParams = getConfig().getMerchantURLQueryParams();
                C19383o.m32796f(merchantURLQueryParams, "config.merchantURLQueryParams");
                for (Map.Entry next : merchantURLQueryParams.entrySet()) {
                    String str = (String) next.getKey();
                    String str2 = (String) next.getValue();
                    String builder2 = builder.toString();
                    C19383o.m32796f(builder2, "builder.toString()");
                    C19383o.m32796f(str, "key");
                    if (!C19459m.m33036e1(builder2, str, false)) {
                        C0391c.m1061h(sb, "&", str, "=", str2);
                    }
                }
            }
        }
        if (getConfig().checkIsFallback() || !getConfig().isSmartPaymentCheckout()) {
            sb.append("&euat=1#");
            String str3 = this.accessToken;
            if (str3 == null || str3.length() == 0) {
                PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E621, "AccessToken is null when trying to fall back to web", (String) null, (Throwable) null, PEnums.TransitionName.FALLBACK_TO_WEB, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            }
            String str4 = this.accessToken;
            if (str4 != null) {
                sb.append(str4);
            }
        }
        builder.encodedQuery(sb.toString());
        PLog.d$default(TAG, C0073e.m206f("hermes url: ", builder.build()), 0, 4, (Object) null);
        Uri build = builder.build();
        C19383o.m32796f(build, "builder.build()");
        return build;
    }

    public final GetPropsRequest getIndefiniteFallbackRequest() {
        String generateSecureRandomString = generateSecureRandomString();
        String j = new C16708i().mo59463j(new FirebaseProperties((String) null, (String) null, VersionUtils.INSTANCE.getSdkVersion(), LoginFragment.EXTRA_REQUEST, DebugConfigManager.getInstance().getFirebaseSessionId(), generateSecureRandomString, generateSecureRandomString(), "onFallback", (String) null, new IndefiniteFallbackRequest((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "native_opt_out", Long.valueOf(Calendar.getInstance().getTimeInMillis() + ((long) PayPalTopBannerView.OPT_OUT_DURATION)), 255, (DefaultConstructorMarker) null), 259, (DefaultConstructorMarker) null));
        C19383o.m32796f(j, "Gson().toJson(firebaseProps)");
        return new GetPropsRequest(j, generateSecureRandomString, generateSecureRandomString);
    }

    public final int getLeavingCheckoutMessage() {
        return getConfig().isSmartPaymentCheckout() ? C17165R.string.paypal_checkout_leaving_checkout : C17165R.string.paypal_checkout_leaving_checkout_3p;
    }

    @SuppressLint({"NewApi"})
    public final String getLocale(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (getBuildVersion() >= 24) {
            String country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            return country == null ? "" : country;
        }
        String country2 = context.getResources().getConfiguration().locale.getCountry();
        C19383o.m32796f(country2, "{\n            context.re….locale.country\n        }");
        return country2;
    }

    public final Point getLocationOfViewOnScreen(View view) {
        C19383o.m32797g(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public final String getRandomAlphaNumeric() {
        String generateSecureRandomString = generateSecureRandomString();
        while (this.usedRandomStrings.contains(generateSecureRandomString)) {
            generateSecureRandomString = generateSecureRandomString();
        }
        this.usedRandomStrings.add(generateSecureRandomString);
        return generateSecureRandomString;
    }

    public final ShippingMethodType getSelectedShippingMethodType() {
        return this.selectedShippingMethodType;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = new com.google.gson.C16708i().mo59463j(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String hashMapToJSON(java.util.Map<java.lang.String, ?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            if (r3 != 0) goto L_0x0005
            goto L_0x0012
        L_0x0005:
            com.google.gson.i r1 = new com.google.gson.i
            r1.<init>()
            java.lang.String r3 = r1.mo59463j(r3)
            if (r3 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r0 = r3
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.hashMapToJSON(java.util.Map):java.lang.String");
    }

    public final boolean isFallback() {
        return this.isFallback;
    }

    public final boolean isZeroString(String str) {
        if (str == null) {
            return true;
        }
        try {
            return Integer.parseInt(new Regex("[^0-9]").replace((CharSequence) str, "")) == 0;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    public final void openChromeCustomTab(Activity activity, NativeSSOListener nativeSSOListener, FallbackScenario fallbackScenario) {
        C19383o.m32797g(activity, "originatingActivity");
        C19383o.m32797g(nativeSSOListener, "nativeSSOListener");
        C19383o.m32797g(fallbackScenario, "fallbackScenario");
        this.isFallback = true;
        getRepo().setCctOpenedForAddingResources(true);
        String uri = getCheckoutLiteUrl(fallbackScenario).toString();
        C19383o.m32796f(uri, "getCheckoutLiteUrl(fallbackScenario).toString()");
        PLog.fallback$default(PEnums.TransitionName.FALLBACK_TO_WEB, PEnums.StateName.REVIEW, fallbackScenario.name(), PEnums.FallbackReason.UNSUPPORTED_FLOW, PEnums.FallbackCategory.FEATURE_NOT_SUPPORTED, PEnums.FallbackDestination.WEB, uri, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 384, (Object) null);
        PLog.d$default(TAG, C0326j.m864i("cct url: ", uri), 0, 4, (Object) null);
        if (getConfig().isSmartPaymentCheckout()) {
            getConfig().getNativeCheckoutWebSSO().performWebNativeSSO(uri, nativeSSOListener);
            return;
        }
        Uri parse = Uri.parse(uri);
        C19383o.m32796f(parse, "parse(url)");
        openChromeCustomTabs(parse, activity);
    }

    public final void openChromeCustomTabs(Uri uri, Activity activity) {
        Uri uri2 = uri;
        Activity activity2 = activity;
        C19383o.m32797g(uri2, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C19383o.m32797g(activity2, "activity");
        PackageManager packageManager = activity.getPackageManager();
        PLog.transition$default(PEnums.TransitionName.LOAD_CCT_VIEW, PEnums.Outcome.LOADING, PEnums.EventCode.E305, PEnums.StateName.REVIEW, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, C0073e.m206f("user action to open ", uri2), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15344, (Object) null);
        C7168e.C7169a customTabsIntentBuilder = getConfig().getCustomTabsIntentBuilder();
        int parseColor = Color.parseColor("#0070ba");
        customTabsIntentBuilder.f15939b.f15925a = Integer.valueOf(parseColor | -16777216);
        C7168e a = customTabsIntentBuilder.mo19458a();
        C19383o.m32796f(packageManager, "packageManager");
        if (PackageManagerExtensionsKt.isPackageInstalled(packageManager, "com.android.chrome") && PackageManagerExtensionsKt.isPackageEnabled(packageManager)) {
            a.f15936a.setPackage("com.android.chrome");
        } else if (PackageManagerExtensionsKt.isPackageInstalled(packageManager, BrowserPackages.SAMSUNG_BROWSER)) {
            a.f15936a.setPackage(BrowserPackages.SAMSUNG_BROWSER);
        }
        a.f15936a.setData(uri2);
        Intent intent = a.f15936a;
        Bundle bundle = a.f15937b;
        Object obj = C8184a.f17966a;
        C8184a.C8185a.m16461b(activity2, intent, bundle);
        getConfig().setDidCustomTabOpen(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if ((r31.length() == 0) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void returnToProvider(java.lang.String r31, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType r32, java.lang.String r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            r15 = r33
            java.lang.String r2 = "opType"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.lang.String r2 = "from"
            kotlin.jvm.internal.C19383o.m32797g(r15, r2)
            com.paypal.pyplcheckout.common.instrumentation.PLog r2 = com.paypal.pyplcheckout.common.instrumentation.PLog.INSTANCE
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r2 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.RETURN_TO_PROVIDER
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.ATTEMPTED
            com.paypal.pyplcheckout.model.DebugConfigManager r4 = r30.getConfig()
            boolean r4 = r4.isSmartPaymentCheckout()
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = "is SmartPaymentCheckout"
            goto L_0x0025
        L_0x0023:
            java.lang.String r4 = "is not SmartPaymentCheckout"
        L_0x0025:
            r12 = r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 15228(0x3b7c, float:2.1339E-41)
            r18 = 0
            r9 = r33
            r15 = r16
            r16 = r17
            r17 = r18
            com.paypal.pyplcheckout.common.instrumentation.PLog.transition$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.paypal.pyplcheckout.model.DebugConfigManager r2 = r30.getConfig()
            boolean r2 = r2.isSmartPaymentCheckout()
            if (r2 == 0) goto L_0x00f8
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.utils.ReturnToProviderOperationType.Failure
            if (r2 == 0) goto L_0x006d
            r3 = 0
            r4 = 1
            if (r31 == 0) goto L_0x005d
            int r5 = r31.length()
            if (r5 != 0) goto L_0x005a
            r5 = r4
            goto L_0x005b
        L_0x005a:
            r5 = r3
        L_0x005b:
            if (r5 == 0) goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            if (r3 == 0) goto L_0x0061
            goto L_0x006d
        L_0x0061:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "ReturnToProviderOperationType of type Failure cannot be used in conjunction with a return URL. If required, the provided must be informed of a failure through the onError callback."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006d:
            if (r31 != 0) goto L_0x0072
            java.lang.String r3 = ""
            goto L_0x0074
        L_0x0072:
            r3 = r31
        L_0x0074:
            r0.createFinalResponseObject(r3, r1)
            com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB$Companion r3 = com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB.Companion
            com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB r3 = r3.getInstance()
            if (r3 != 0) goto L_0x0080
            goto L_0x0087
        L_0x0080:
            com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest r4 = r0.getFinishRequest(r1)
            r3.sendRequest(r4)
        L_0x0087:
            boolean r3 = r1 instanceof com.paypal.pyplcheckout.utils.ReturnToProviderOperationType.Payment
            if (r3 == 0) goto L_0x00ad
            com.paypal.pyplcheckout.services.Repository r2 = r30.getRepo()
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Stage r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Stage.APPROVING_WEB_CHECKOUT
            r2.setStage(r3)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCESS
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E215
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2032(0x7f0, float:2.847E-42)
            r16 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00aa:
            r2 = r33
            goto L_0x00f4
        L_0x00ad:
            if (r2 == 0) goto L_0x00da
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r17 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r18 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.FAILURE
            r2 = r1
            com.paypal.pyplcheckout.utils.ReturnToProviderOperationType$Failure r2 = (com.paypal.pyplcheckout.utils.ReturnToProviderOperationType.Failure) r2
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r19 = r2.getErrorCode()
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r20 = r2.getStateName()
            r21 = 0
            r22 = 0
            java.lang.Exception r2 = r2.getException()
            java.lang.String r23 = r2.getLocalizedMessage()
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1968(0x7b0, float:2.758E-42)
            r29 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x00aa
        L_0x00da:
            boolean r2 = r1 instanceof com.paypal.pyplcheckout.utils.ReturnToProviderOperationType.Cancel
            if (r2 == 0) goto L_0x00aa
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r3 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.CANCELLED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E215
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.REVIEW
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 2032(0x7f0, float:2.847E-42)
            r15 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00aa
        L_0x00f4:
            r0.completeAndReturnProviderIntegration(r2, r1)
            goto L_0x00fb
        L_0x00f8:
            r30.returnToMerchant(r31, r32)
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.utils.PYPLCheckoutUtils.returnToProvider(java.lang.String, com.paypal.pyplcheckout.utils.ReturnToProviderOperationType, java.lang.String):void");
    }

    public final void returnToProviderWithResponse(ApprovePaymentResponse approvePaymentResponse, ReturnToProviderOperationType returnToProviderOperationType, String str) {
        ApprovePaymentResponse approvePaymentResponse2 = approvePaymentResponse;
        ReturnToProviderOperationType returnToProviderOperationType2 = returnToProviderOperationType;
        C19383o.m32797g(returnToProviderOperationType2, UrlConstantsKt.URL_PARAM_OP_TYPE);
        C19383o.m32797g(str, ResponseConstants.FROM);
        if (approvePaymentResponse2 != null) {
            if (getConfig().isSmartPaymentCheckout()) {
                PLog.decision$default(PEnums.TransitionName.RETURN_TO_PROVIDER, PEnums.Outcome.SUCCESS, PEnums.EventCode.E215, PEnums.StateName.REVIEW, (String) null, str, "Finished Checkout", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1936, (Object) null);
                approvePaymentResponse2.createFinalResponseObject(this.finalResponseObject, returnToProviderOperationType2);
                RealTimeDB instance2 = RealTimeDB.Companion.getInstance();
                if (instance2 != null) {
                    instance2.sendRequest(getFinishRequest(returnToProviderOperationType2));
                }
            }
            PLog.transition$default(PEnums.TransitionName.LISTENED_FINISH_FINAL_CHECKOUT_ANIMATION, PEnums.Outcome.SUCCEEDED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "listening to finish checkout animation returning to merchant via return to provider", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().listen(PayPalEventTypes.FINISHED_FINAL_ANIMATION, new C17285e(this, str, returnToProviderOperationType2));
            return;
        }
        PLog.decision$default(PEnums.TransitionName.RETURN_TO_PROVIDER, PEnums.Outcome.FAILED, PEnums.EventCode.E215, PEnums.StateName.REVIEW, (String) null, str, "Finished Checkout", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1936, (Object) null);
        completeAndReturnProviderIntegration(str, returnToProviderOperationType2);
    }

    @IgnoreGeneratedTestReport
    public final void setAccessToken(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public final void setBrowserType(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.browserType = str;
    }

    public final void setFallback(boolean z) {
        this.isFallback = z;
    }

    public final void setSelectedShippingMethodType(ShippingMethodType shippingMethodType) {
        this.selectedShippingMethodType = shippingMethodType;
    }

    public final void showDebugErrorDialog(Activity activity, PEnums.EventCode eventCode, String str) {
        C19383o.m32797g(eventCode, "errorCode");
        C19383o.m32797g(str, "errorMessage");
        if (activity == null) {
            activity = getConfig().getCheckoutBaseActivity();
        }
        boolean z = false;
        if (activity != null && !activity.isFinishing()) {
            z = true;
        }
        if (z) {
            showErrorDialogOnUiThread(activity, eventCode, str);
        }
    }

    @IgnoreGeneratedTestReport
    public final void showErrorDialogOnUiThread(Activity activity, PEnums.EventCode eventCode, String str) {
        C19383o.m32797g(eventCode, "errorCode");
        if (activity == null) {
            activity = getConfig().getCheckoutBaseActivity();
        }
        if (activity != null && !activity.isFinishing()) {
            if (!C19383o.m32792b(Looper.myLooper(), Looper.getMainLooper())) {
                activity.runOnUiThread(new C17284d(this, activity, eventCode, str));
            } else {
                showErrorDialog(activity, eventCode, str);
            }
        }
    }

    @IgnoreGeneratedTestReport
    public final void showErrorDialogOnUiThread(PEnums.EventCode eventCode, String str) {
        C19383o.m32797g(eventCode, "errorCode");
        showErrorDialogOnUiThread$default(this, (Activity) null, eventCode, str, 1, (Object) null);
    }

    public final void terminateActivity(String str, String str2) {
        PEnums.TransitionName transitionName = PEnums.TransitionName.NATIVE_XO_EXIT;
        PEnums.Outcome outcome = PEnums.Outcome.SUCCEEDED;
        PEnums.EventCode eventCode = PEnums.EventCode.E104;
        PEnums.StateName stateName = PEnums.StateName.UTILS;
        boolean isPropsSet = getConfig().isPropsSet();
        terminateActivity$default(this, transitionName, outcome, eventCode, stateName, str, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "info: " + str2 + ", propsSet: " + isPropsSet + " ", 992, (Object) null);
    }

    public final Timer waitFor(C19846a<C19394m> aVar, long j) {
        C19383o.m32797g(aVar, "failFunction");
        Timer timer = new Timer();
        timer.schedule(new PYPLCheckoutUtils$waitFor$timeOutTask$1(aVar), j);
        return timer;
    }

    private final void terminateActivity(PEnums.TransitionName transitionName, PEnums.Outcome outcome, PEnums.EventCode eventCode, PEnums.StateName stateName, String str, PEnums.FallbackReason fallbackReason, PEnums.FallbackCategory fallbackCategory, String str2, String str3, String str4, String str5) {
        PLog.transition$default(transitionName, outcome, eventCode, stateName, str, fallbackReason, fallbackCategory, str2, str3, str4, str5, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
        getRepo().setStage(PEnums.Stage.SHUTDOWN);
        getConfig().setPaymentButtonFundingType((PaymentButtonFundingType) null);
        Context providerContext = getConfig().getProviderContext();
        if (providerContext != null) {
            Cache.clearFinishCheckoutAndOnApproveFiredFlag(providerContext);
        }
        Events.Companion.getInstance().fire(ExtendedPayPalEventTypes.SDK_SHUT_DOWN, new Success(str5));
        getRepo().reset();
        if (getConfig().getCheckoutBaseActivity() != null) {
            getConfig().getCheckoutBaseActivity().killMe(str);
        }
        SdkComponent.Companion.getInstance().getInstrumentationSession().resetOrderSessionId();
    }
}
