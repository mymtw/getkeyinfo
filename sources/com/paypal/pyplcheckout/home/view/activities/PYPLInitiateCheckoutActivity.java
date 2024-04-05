package com.paypal.pyplcheckout.home.view.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.paypal.checkout.order.OrderContext;
import com.paypal.checkout.paymentbutton.C17143a;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.flavornavigation.ContentRouter;
import com.paypal.pyplcheckout.home.view.BaseActivity;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p539ab.AbManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.utils.CheckoutCrashLogger;
import com.paypal.pyplcheckout.utils.CrashLogger;
import com.paypal.pyplcheckout.utils.CrashLoggerKey;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075d.C6614a;

public final class PYPLInitiateCheckoutActivity extends BaseActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int REQ_CODE_HOME_ACTIVITY = 1000;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public AbManager abManager;
    private final PYPLCheckoutUtils checkoutUtils = PYPLCheckoutUtils.Companion.getInstance();
    public DebugConfigManager debugConfigManager;
    public Events events;
    private boolean isRecreated;
    private final EventListener logoutListener = new C17227b();
    private final EventListener parseOriginFinishedListener = new C17143a(this, 1);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean isIntentRedirectUri(Intent intent) {
        if (intent == null) {
            return false;
        }
        return C19383o.m32792b("android.intent.action.VIEW", intent.getAction()) && (intent.getData() != null);
    }

    private final void launchCheckout() {
        if (getDebugConfigManager().isSmartPaymentCheckout()) {
            SdkComponent.Companion.getInstance().getRepository().setUpFirebase();
            logCachedButtonSessionId();
        }
        PEnums.TransitionName transitionName = PEnums.TransitionName.INITIATE_CHECKOUT_FIND_TRIGGERED_APP;
        PEnums.Outcome outcome = PEnums.Outcome.ATTEMPTED;
        PLog.transition$default(transitionName, outcome, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        PYPLCheckoutUtils.Companion companion = PYPLCheckoutUtils.Companion;
        companion.getInstance().findTriggeredApp(this);
        PLog.transition$default(PEnums.TransitionName.HOME_ACTIVITY_LAUNCHED, outcome, (PEnums.EventCode) null, PEnums.StateName.STARTUP, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16368, (Object) null);
        SdkComponent.Companion.getInstance().getAmplitudeManager().uploadFailedEvents();
        companion.getInstance().clearRepositories();
        startHomeActivity();
    }

    private final void listenToEvents() {
        Events.Companion.getInstance().listen(PayPalEventTypes.USER_LOGOUT, this.logoutListener);
    }

    private final void logCachedButtonSessionId() {
        Context applicationContext = getApplicationContext();
        C19383o.m32796f(applicationContext, "applicationContext");
        String buttonSessionId = Cache.getButtonSessionId(applicationContext);
        if (buttonSessionId == null) {
            buttonSessionId = "null";
        }
        addBreadcrumb("Got cached button_session_id: " + buttonSessionId);
        CheckoutCrashLogger instance = CrashLogger.getInstance();
        if (instance != null) {
            instance.setKey(CrashLoggerKey.CACHED_BUTTON_SESSION_ID.getKey(), buttonSessionId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: logoutListener$lambda-1  reason: not valid java name */
    public static final void m35262logoutListener$lambda1(EventType eventType, ResultData resultData) {
        PYPLCheckoutUtils.Companion.getInstance().clearRepositories();
    }

    /* access modifiers changed from: private */
    /* renamed from: parseOriginFinishedListener$lambda-0  reason: not valid java name */
    public static final void m35263parseOriginFinishedListener$lambda0(PYPLInitiateCheckoutActivity pYPLInitiateCheckoutActivity, EventType eventType, ResultData resultData) {
        C19383o.m32797g(pYPLInitiateCheckoutActivity, "this$0");
        if (pYPLInitiateCheckoutActivity.getDebugConfigManager().checkIsFallback()) {
            pYPLInitiateCheckoutActivity.returnFromCancelled();
            return;
        }
        PLog.transition$default(PEnums.TransitionName.RELAUNCH_PAYSHEET, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        pYPLInitiateCheckoutActivity.startHomeActivity();
    }

    private final void restartAfterActivityRecreation() {
        restoreSession();
        PYPLCheckoutUtils.Companion.getInstance().clearRepositories();
        if (getDebugConfigManager().isSmartPaymentCheckout()) {
            ContentRouter.INSTANCE.reset();
            SdkComponent.Companion.getInstance().getRepository().setUpFirebase();
            getEvents().listen(PayPalEventTypes.FINISHED_ORIGIN_URI_PARSING, this.parseOriginFinishedListener);
            return;
        }
        if (!getDebugConfigManager().checkIsFallback()) {
            PLog.transition$default(PEnums.TransitionName.RELAUNCH_PAYSHEET, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
            startHomeActivity();
        }
    }

    private final void restoreCreateOrderContext() {
        String checkoutToken = getDebugConfigManager().getCheckoutToken();
        if (Cache.getIsOrderCreated(this) && checkoutToken != null) {
            String orderCaptureUrl = Cache.getOrderCaptureUrl(this);
            String orderAuthorizeUrl = Cache.getOrderAuthorizeUrl(this);
            String orderPatchUrl = Cache.getOrderPatchUrl(this);
            getDebugConfigManager().setOrderCaptureUrl(orderCaptureUrl);
            getDebugConfigManager().setOrderAuthorizeUrl(orderAuthorizeUrl);
            OrderContext.Companion.create(checkoutToken, orderCaptureUrl, orderAuthorizeUrl, orderPatchUrl);
            PLog.transition$default(PEnums.TransitionName.CREATE_ORDER_RESTORED, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        }
        Cache.clearCreateOrderContext(this);
    }

    private final void restoreSession() {
        DebugConfigManager debugConfigManager2 = getDebugConfigManager();
        Context providerContext = getDebugConfigManager().getProviderContext();
        if (providerContext == null) {
            providerContext = this;
        }
        String buttonSessionId = Cache.getButtonSessionId(providerContext);
        if (buttonSessionId != null) {
            debugConfigManager2.setButtonSessionId(buttonSessionId);
        }
        String sPBToken = Cache.getSPBToken(providerContext);
        if (sPBToken != null) {
            debugConfigManager2.setCheckoutToken(sPBToken);
        }
        String fundingSource = Cache.getFundingSource(providerContext);
        if (fundingSource != null) {
            debugConfigManager2.setFundingSource(fundingSource);
        }
        debugConfigManager2.setFirebaseSessionId(Cache.getFbSessionUid(providerContext));
        debugConfigManager2.setDBInstanceId(Cache.getFirebaseInstanceID(providerContext));
        debugConfigManager2.setDomain(Cache.getDomain(providerContext));
        debugConfigManager2.setSmartPaymentCheckout(Cache.getIsSmartPayment(providerContext));
        debugConfigManager2.setCheckoutBaseActivity(this);
        debugConfigManager2.setDidCustomTabOpen(Cache.getDidCustomTabOpen(providerContext));
        debugConfigManager2.setIsFallback(Cache.getIsFallback(providerContext));
        restoreCreateOrderContext();
        PLog.transition$default(PEnums.TransitionName.SESSION_RESTORED, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
    }

    private final void returnFromApproval(String str) {
        getDebugConfigManager().setDidPYPLActivityPause(false);
        getDebugConfigManager().setDidCustomTabOpen(false);
        getDebugConfigManager().setCCTReturn(true);
        try {
            Uri parse = Uri.parse(str);
            PLog.transition$default(PEnums.TransitionName.RETURN_FROM_CCT, PEnums.Outcome.APPROVED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
            try {
                this.checkoutUtils.returnToProvider(parse.toString(), ReturnToProviderOperationType.Payment.INSTANCE, "PYPLInitiateCheckoutActivity.onNewIntent()");
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E558, "exception in parsing URI in onNewIntent in InitiateCheckoutActivity", exc.getMessage(), exc, PEnums.TransitionName.NATIVE_XO_FLOW_COMPLETION, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        }
    }

    private final void returnFromCancelled() {
        DebugConfigManager debugConfigManager2 = getDebugConfigManager();
        PLog.transition$default(PEnums.TransitionName.RETURN_FROM_CCT, PEnums.Outcome.CANCELLED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 16380, (Object) null);
        debugConfigManager2.setCCTReturn(true);
        debugConfigManager2.setDidCustomTabOpen(false);
        debugConfigManager2.setDidPYPLActivityPause(false);
        PYPLCheckoutUtils.Companion.getInstance().returnToProvider(debugConfigManager2.isSmartPaymentCheckout() ? "" : SdkComponent.Companion.getInstance().getRepository().getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, debugConfigManager2.getClass().getSimpleName());
    }

    private final void startHomeActivity() {
        Context providerContext = getDebugConfigManager().getProviderContext();
        if (providerContext == null) {
            getDebugConfigManager().setProviderContext(getApplicationContext());
            PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E559, "Provider context Null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_TRIGGERED, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
            providerContext = this;
        }
        Intent intent = new Intent(providerContext, PYPLHomeActivity.class);
        intent.putExtra(PYPLHomeActivity.IS_ACTIVITY_RECREATED, this.isRecreated);
        startActivityForResult(intent, 1000);
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

    public final AbManager getAbManager() {
        AbManager abManager2 = this.abManager;
        if (abManager2 != null) {
            return abManager2;
        }
        C19383o.m32805o("abManager");
        throw null;
    }

    public final DebugConfigManager getDebugConfigManager() {
        DebugConfigManager debugConfigManager2 = this.debugConfigManager;
        if (debugConfigManager2 != null) {
            return debugConfigManager2;
        }
        C19383o.m32805o("debugConfigManager");
        throw null;
    }

    public final Events getEvents() {
        Events events2 = this.events;
        if (events2 != null) {
            return events2;
        }
        C19383o.m32805o("events");
        throw null;
    }

    public void handleAppBackgroundTransition() {
        getWindow().getDecorView().setBackground(C6614a.m12981a(this, C17165R.C17166drawable.ic_blue_bg));
    }

    public void handleAppForegroundTransition() {
    }

    public void killMe(String str) {
        if (!isFinishing()) {
            finishAffinity();
        }
        super.killMe(str);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == 0) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SdkComponentKt.inject(this);
        boolean z = false;
        getDebugConfigManager().setCCTReturn(false);
        if (bundle != null) {
            z = true;
        }
        this.isRecreated = z;
        listenToEvents();
        getAbManager().initRemoteCache(Cache.getOrCreateUUID(this));
        if (isIntentRedirectUri(getIntent())) {
            PLog.transition$default(PEnums.TransitionName.ACTIVITY_RECREATION_DETECTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E103, PEnums.StateName.UTILS, "returnFromApproval", (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, getIntent().getDataString(), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
            restoreSession();
            returnFromApproval(getIntent().getDataString());
        } else if (this.isRecreated) {
            PLog.transition$default(PEnums.TransitionName.ACTIVITY_RECREATION_DETECTED, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E103, PEnums.StateName.UTILS, "restartAfterActivityRecreation", (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, getIntent().getDataString(), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
            restartAfterActivityRecreation();
        } else {
            launchCheckout();
        }
    }

    public void onDestroy() {
        getDebugConfigManager().resetChecks();
        PYPLCheckoutUtils.Companion.getInstance().clearAllInstances();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        C19383o.m32797g(intent, "intent");
        super.onNewIntent(intent);
        PYPLCheckoutUtils.Companion.getInstance().findTriggeredApp(this);
        PEnums.TransitionName transitionName = PEnums.TransitionName.ON_NEW_INTENT;
        PEnums.Outcome outcome = PEnums.Outcome.ATTEMPTED;
        PEnums.StateName stateName = PEnums.StateName.NONE;
        String action = intent.getAction();
        Uri data = intent.getData();
        PLog.transition$default(transitionName, outcome, (PEnums.EventCode) null, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, "PYPLInitiateCheckoutActivity", (String) null, (String) null, action + " " + data, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 14336, (Object) null);
        if (isIntentRedirectUri(intent)) {
            returnFromApproval(intent.getDataString());
        }
    }

    public void onPause() {
        super.onPause();
        getDebugConfigManager().setDidPYPLActivityPause(true);
    }

    public void onResume() {
        super.onResume();
        if (this.isRecreated && getDebugConfigManager().getDidCustomTabOpen() && getDebugConfigManager().checkIsFallback() && !getDebugConfigManager().isSmartPaymentCheckout()) {
            returnFromCancelled();
        }
        getDebugConfigManager().setDidCustomTabOpen(false);
        getDebugConfigManager().setIsFallback(false);
    }

    public final void setAbManager(AbManager abManager2) {
        C19383o.m32797g(abManager2, "<set-?>");
        this.abManager = abManager2;
    }

    public final void setDebugConfigManager(DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(debugConfigManager2, "<set-?>");
        this.debugConfigManager = debugConfigManager2;
    }

    public final void setEvents(Events events2) {
        C19383o.m32797g(events2, "<set-?>");
        this.events = events2;
    }
}
