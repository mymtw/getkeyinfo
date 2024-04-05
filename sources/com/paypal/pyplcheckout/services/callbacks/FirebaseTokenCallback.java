package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.pyplcheckout.common.firebase.firebasemodels.GetPropsRequest;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.FirebaseAuth;
import com.paypal.pyplcheckout.pojo.FirebaseObject;
import com.paypal.pyplcheckout.pojo.FirebaseResponse;
import com.paypal.pyplcheckout.pojo.FirebaseTokenResponse;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseMessageData;
import com.paypal.pyplcheckout.pojo.firebase.FirebaseProperties;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.ErrorUtils;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.VersionUtils;
import java.io.StringReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class FirebaseTokenCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "FirebaseTokenCallback";
    private static final DebugConfigManager config = DebugConfigManager.getInstance();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FirebaseTokenCallback get() {
            return new FirebaseTokenCallback();
        }
    }

    public FirebaseTokenCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        SdkComponentKt.inject((BaseCallback) this);
    }

    private final void firebaseTokenFailProtocol(String str) {
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E515;
        PLog.error$default(errorType, eventCode, str, (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_FB_PROCESS_STARTED, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        ErrorUtils.sendOnErrorMessageToFireBase$default((RealTimeDB) null, (String) null, (String) null, (FirebaseMessageData) null, str, eventCode, 15, (Object) null);
    }

    private final void firebaseTokenReceived(String str) {
        RealTimeDB instance = RealTimeDB.Companion.getInstance(str);
        PEnums.TransitionName transitionName = PEnums.TransitionName.NATIVE_XO_FB_TOKEN_RECEIVED;
        PLog.decision$default(transitionName, PEnums.Outcome.SUCCESS, PEnums.EventCode.E219, PEnums.StateName.STARTUP, (String) null, transitionName.toString(), C0326j.m864i("token: ", str), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        getEvents().listen(ExtendedPayPalEventTypes.SPB_REQUESTED_CLOSE, new C17269a(this, instance));
    }

    /* access modifiers changed from: private */
    /* renamed from: firebaseTokenReceived$lambda-2  reason: not valid java name */
    public static final void m35429firebaseTokenReceived$lambda2(FirebaseTokenCallback firebaseTokenCallback, RealTimeDB realTimeDB, EventType eventType, ResultData resultData) {
        FirebaseTokenCallback firebaseTokenCallback2 = firebaseTokenCallback;
        RealTimeDB realTimeDB2 = realTimeDB;
        ResultData resultData2 = resultData;
        C19383o.m32797g(firebaseTokenCallback2, "this$0");
        C19383o.m32797g(realTimeDB2, "$realTimeDB");
        C19383o.m32797g(eventType, "$noName_0");
        try {
            String str = null;
            Success success = resultData2 instanceof Success ? (Success) resultData2 : null;
            Object data = success == null ? null : success.getData();
            JSONObject jSONObject = data instanceof JSONObject ? (JSONObject) data : null;
            if (jSONObject != null) {
                str = jSONObject.getString("request_uid");
            }
            if (str != null) {
                GetPropsRequest generateCloseResponse = firebaseTokenCallback2.generateCloseResponse(str);
                if (generateCloseResponse != null) {
                    realTimeDB2.sendResponse(generateCloseResponse);
                }
            }
            PYPLCheckoutUtils.Companion.getInstance().terminateActivity("FirebaseTokenCallback-SPB Close", "SPB sent message to close ourself. Error on merchant page after app switch");
        } catch (JSONException e) {
            ErrorUtils.sendOnErrorMessageToFireBase$default((RealTimeDB) null, (String) null, (String) null, (FirebaseMessageData) null, "error parsing FB SPB Close props", PEnums.EventCode.E594, 15, (Object) null);
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E514, "error parsing FB SPB Close props", (String) null, e, PEnums.TransitionName.NATIVE_XO_FB_PROPS_PROCESSED, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (Object) null);
        } catch (NullPointerException e2) {
            ErrorUtils.sendOnErrorMessageToFireBase$default((RealTimeDB) null, (String) null, (String) null, (FirebaseMessageData) null, "error parsing FB SPB Close props", PEnums.EventCode.E595, 15, (Object) null);
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E514, "error parsing FB SPB Close props", (String) null, e2, PEnums.TransitionName.NATIVE_XO_FB_PROPS_PROCESSED, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1928, (Object) null);
        }
    }

    private final GetPropsRequest generateCloseResponse(String str) {
        String randomAlphaNumeric = PYPLCheckoutUtils.Companion.getInstance().getRandomAlphaNumeric();
        String sdkVersion = VersionUtils.INSTANCE.getSdkVersion();
        DebugConfigManager debugConfigManager = config;
        String j = new C16708i().mo59463j(new FirebaseProperties((String) null, (String) null, sdkVersion, ResponseConstants.RESPONSE, debugConfigManager.getFirebaseSessionId(), randomAlphaNumeric, str, ConstantsKt.CLOSE, "success", new FirebaseMessageData(debugConfigManager.getCheckoutToken(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, debugConfigManager.getButtonSessionId(), 126, (DefaultConstructorMarker) null), 3, (DefaultConstructorMarker) null));
        C19383o.m32796f(j, "Gson().toJson(firebaseProps)");
        return new GetPropsRequest(j, randomAlphaNumeric, str);
    }

    public static final FirebaseTokenCallback get() {
        return Companion.get();
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        firebaseTokenFailProtocol(C0326j.m864i("api failed to get token: ", exc.getMessage()));
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        try {
            FirebaseObject data = ((FirebaseTokenResponse) new C16708i().mo59457d(new StringReader(str), FirebaseTokenResponse.class)).getData();
            String str2 = null;
            if (data != null) {
                FirebaseResponse firebase = data.getFirebase();
                if (firebase != null) {
                    FirebaseAuth auth = firebase.getAuth();
                    if (auth != null) {
                        str2 = auth.getSessionToken();
                    }
                }
            }
            if (str2 == null) {
                firebaseTokenFailProtocol("firebase token api success but null token");
            } else {
                firebaseTokenReceived(str2);
            }
        } catch (Exception e) {
            firebaseTokenFailProtocol(C0326j.m864i("failed to parse firebase token response ", e.getMessage()));
        }
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.m28739vR(str2, "FirebaseToken correlation id: " + str);
        return super.onSaveCorrelationId(str, internalCorrelationIds);
    }
}
