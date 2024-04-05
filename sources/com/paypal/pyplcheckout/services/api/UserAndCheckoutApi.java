package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.queries.CheckoutQuery;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class UserAndCheckoutApi extends BaseApi {
    private final String accessToken;

    public UserAndCheckoutApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        Repository repository = SdkComponent.Companion.getInstance().getRepository();
        String paymentToken = repository.getPaymentToken();
        String dcvv = repository.getDcvv();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, paymentToken);
        jSONObject2.put("returnAllPlans", true);
        jSONObject2.put("userCountry", UserStateKt.US_COUNTRY);
        jSONObject2.put("country", (Object) null);
        if (dcvv != null) {
            jSONObject2.put("dcvv", dcvv);
            jSONObject2.put("productName", "VENMO_US_PPMERCHANT_SINGLEUSETOKEN");
        }
        jSONObject.put("variables", jSONObject2);
        jSONObject.put("query", CheckoutQuery.INSTANCE.get(DebugConfigManager.getInstance().isShippingCallbackEnabled()));
        PLog.w$default("planning", "data: " + jSONObject, 0, 4, (Object) null);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject.toString();
        C19383o.m32796f(jSONObject3, "data.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }
}
