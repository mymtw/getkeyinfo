package com.paypal.pyplcheckout.services.api;

import android.text.TextUtils;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.queries.EligibilityQuery;
import com.paypal.pyplcheckout.utils.VersionUtils;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONArray;
import org.json.JSONObject;

public final class EligibilityApi extends BaseApi {
    private final String accessToken;

    public EligibilityApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        String checkoutToken = instance.getCheckoutToken();
        String buttonSessionId = instance.getButtonSessionId();
        String stickinessId = instance.getStickinessId();
        String facilitatorClientId = instance.getFacilitatorClientId();
        String domain = instance.getDomain();
        String buyerLanguage = instance.getBuyerLanguage();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, checkoutToken);
        jSONObject.put("buyerAccessToken", this.accessToken);
        jSONObject.put("fundingSource", instance.getFundingSource());
        jSONObject.put("buttonSessionID", buttonSessionId);
        jSONObject.put("stickinessID", stickinessId);
        jSONObject.put("facilitatorClientID", facilitatorClientId);
        jSONObject.put("domain", domain);
        jSONObject.put("buyerLanguage", buyerLanguage);
        String hostVersionName = instance.getHostVersionName();
        C19383o.m32796f(hostVersionName, "debugConfigManager.hostVersionName");
        if (hostVersionName.length() == 0) {
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E562, "Error getting Host Version Name", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_ELIGIBILITY_RESPONSE, PEnums.StateName.STARTUP, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        }
        jSONObject.put("nativeAppVersion", instance.getHostVersionName());
        jSONObject.put("os", "Android");
        jSONObject.put("nativeSdkVersion", VersionUtils.INSTANCE.getSdkVersion());
        jSONObject.put("enableFunding", new JSONArray(instance.getEnableFundingOptions()));
        jSONObject.put("isBillingAgreementSupported", true);
        jSONObject.put("isCryptoPaymentsSupported", true);
        if (TextUtils.isEmpty(buttonSessionId)) {
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E589, "Missing buttonSessionId", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_ELIGIBILITY_PARAMS_ERROR, PEnums.StateName.STARTUP, jSONObject.toString(), (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1792, (Object) null);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("query", EligibilityQuery.INSTANCE.get());
        jSONObject2.put("variables", jSONObject);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject2.toString();
        C19383o.m32796f(jSONObject3, "eligibilityData.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }
}
