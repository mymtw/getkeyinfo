package com.paypal.pyplcheckout.services.apiunused;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.api.BaseApi;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import com.paypal.pyplcheckout.services.mutations.SetCurrencyConversionTypeMutation;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class SetCurrencyConversionTypeApi extends BaseApi {
    private final String accessToken;

    public SetCurrencyConversionTypeApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", SetCurrencyConversionTypeMutation.INSTANCE.get());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, SdkComponent.Companion.getInstance().getRepository().getPaymentToken());
        C19394m mVar = C19394m.f43287a;
        jSONObject.put("variables", jSONObject2);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject.toString();
        C19383o.m32796f(jSONObject3, "setCurrencyTypeData.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }
}
