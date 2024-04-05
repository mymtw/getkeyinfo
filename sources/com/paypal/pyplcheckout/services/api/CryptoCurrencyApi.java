package com.paypal.pyplcheckout.services.api;

import com.appsflyer.AppsFlyerProperties;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.queries.CheckoutQuery;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CryptoCurrencyApi extends BaseApi {
    private final String accessToken;
    private String currencyValue = "0.00";
    private JSONArray symbols;

    public CryptoCurrencyApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        String paymentToken = SdkComponent.Companion.getInstance().getRepository().getPaymentToken();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, paymentToken);
        JSONArray jSONArray = this.symbols;
        if (jSONArray != null) {
            jSONObject2.put("symbols", jSONArray);
            jSONObject2.put(AppsFlyerProperties.CURRENCY_CODE, "USD");
            jSONObject2.put("currencyValue", this.currencyValue);
            C19394m mVar = C19394m.f43287a;
            jSONObject.put("variables", jSONObject2);
            jSONObject.put("query", CheckoutQuery.INSTANCE.getCryptocurrencyQuotes());
            C20011u.C20012a aVar = new C20011u.C20012a();
            BaseApiKt.setGraphQlUrl(aVar);
            BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
            String jSONObject3 = jSONObject.toString();
            C19383o.m32796f(jSONObject3, "data.toString()");
            BaseApiKt.addPostBody(aVar, jSONObject3);
            return aVar.mo72999b();
        }
        C19383o.m32805o("symbols");
        throw null;
    }

    public final void setCurrencyValue(String str) {
        C19383o.m32797g(str, "currencyValue");
        this.currencyValue = str;
    }

    public final void setSymbols(JSONArray jSONArray) {
        C19383o.m32797g(jSONArray, "symbols");
        this.symbols = jSONArray;
    }
}
