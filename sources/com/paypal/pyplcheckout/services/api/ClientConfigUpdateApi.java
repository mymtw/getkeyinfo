package com.paypal.pyplcheckout.services.api;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class ClientConfigUpdateApi extends BaseApi {
    private final String query;
    private final C20011u.C20012a requestBuilder;

    public ClientConfigUpdateApi() {
        this((C20011u.C20012a) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClientConfigUpdateApi(C20011u.C20012a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C20011u.C20012a() : aVar);
    }

    private final String getSessionId() {
        String buttonSessionId = DebugConfigManager.getInstance().getButtonSessionId();
        return buttonSessionId == null || buttonSessionId.length() == 0 ? SdkComponent.Companion.getInstance().getInstrumentationSession().getOrderSessionId() : DebugConfigManager.getInstance().getButtonSessionId();
    }

    public C20011u createService() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("query", this.query);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, DebugConfigManager.getInstance().getCheckoutToken());
        jSONObject2.put("userExperienceFlow", "NATIVE");
        jSONObject2.put("buttonSessionID", getSessionId());
        C19394m mVar = C19394m.f43287a;
        jSONObject.put("variables", jSONObject2);
        C20011u.C20012a aVar = this.requestBuilder;
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithPayToken(aVar);
        String jSONObject3 = jSONObject.toString();
        C19383o.m32796f(jSONObject3, "data.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        BaseApiKt.allowRetry(aVar, 4, NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
        return aVar.mo72999b();
    }

    public ClientConfigUpdateApi(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "requestBuilder");
        this.requestBuilder = aVar;
        this.query = "mutation UPDATE_CLIENT_CONFIG(\n    $token: String!,\n    $userExperienceFlow: UserExperienceFlowType,\n    $buttonSessionID: String) {\n        updateClientConfig(\n            token: $token, \n            userExperienceFlow: $userExperienceFlow,\n            buttonSessionID: $buttonSessionID\n        ) \n    }";
    }
}
