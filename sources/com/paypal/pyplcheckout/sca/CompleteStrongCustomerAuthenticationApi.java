package com.paypal.pyplcheckout.sca;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.api.BaseApi;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class CompleteStrongCustomerAuthenticationApi extends BaseApi {
    private final String accessToken;
    private final String query = "mutation COMPLETE_STRONG_CUSTOMER_AUTHENTICATION($token: String!) {\n  completeStrongCustomerAuthentication(token: $token) {\n    paymentContingencies {\n      strongCustomerAuthenticationRequired {\n        contextId\n      }\n    }\n  }\n}";

    public CompleteStrongCustomerAuthenticationApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", this.query);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, SdkComponent.Companion.getInstance().getRepository().getPaymentToken());
        C19394m mVar = C19394m.f43287a;
        jSONObject.put("variables", jSONObject2);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject.toString();
        C19383o.m32796f(jSONObject3, "data.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }
}
