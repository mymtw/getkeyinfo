package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.queries.UpdateCurrencyConversionQuery;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class UpdateCurrencyConversionApi extends BaseApi {
    private final String accessToken;

    public UpdateCurrencyConversionApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        Repository repository = SdkComponent.Companion.getInstance().getRepository();
        String paymentToken = repository.getPaymentToken();
        UpdateCurrencyConversionQuery updateCurrencyConversionQuery = UpdateCurrencyConversionQuery.INSTANCE;
        String currencyConversionType = repository.getSelectedCurrencyConversionType().toString();
        C19383o.m32796f(currencyConversionType, "repository.getSelectedCu…nversionType().toString()");
        String str = updateCurrencyConversionQuery.get(paymentToken, currencyConversionType);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject = new JSONObject(str).toString();
        C19383o.m32796f(jSONObject, "JSONObject(updateCurrenc…nversionQuery).toString()");
        BaseApiKt.addPostBody(aVar, jSONObject);
        return aVar.mo72999b();
    }
}
