package com.paypal.pyplcheckout.services.api;

import android.text.TextUtils;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.callbacks.BaseCallback;
import com.paypal.pyplcheckout.services.mutations.GetLsatUpgradeMutation;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class LsatUpgradeApi extends BaseApi {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static String TAG = "LsatUpgradeApi";
    private final String accessToken;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LsatUpgradeApi(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }

    public C20011u createService() {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        String lsatToken = instance.getLsatToken();
        String checkoutToken = instance.getCheckoutToken();
        String str = GetLsatUpgradeMutation.INSTANCE.get();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, checkoutToken);
        jSONObject.put("buyerAccessToken", this.accessToken);
        jSONObject.put("merchantLSAT", lsatToken);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("query", str);
        jSONObject2.put("variables", jSONObject);
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject2.toString();
        C19383o.m32796f(jSONObject3, "body.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }

    public void enqueueRequest(BaseCallback baseCallback) {
        BaseCallback baseCallback2 = baseCallback;
        C19383o.m32797g(baseCallback2, "callback");
        if (TextUtils.isEmpty(DebugConfigManager.getInstance().getLsatToken())) {
            PLog.decision$default(PEnums.TransitionName.NATIVE_XO_POST_LSAT_UPGRADE_REQUEST, PEnums.Outcome.CANCELLED, PEnums.EventCode.E111, PEnums.StateName.REVIEW, (String) null, (String) null, "LSAT upgrade not called because merchant LSAT is empty", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
            String str = TAG;
            C19383o.m32796f(str, "TAG");
            PLog.d$default(str, "LSAT upgrade not called because merchant LSAT is empty", 0, 4, (Object) null);
            baseCallback2.onApiError(new IllegalStateException("LSAT upgrade not called because merchant LSAT is empty"));
            return;
        }
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_LSAT_UPGRADE_REQUEST, PEnums.Outcome.ATTEMPTED, PEnums.EventCode.E111, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2032, (Object) null);
        super.enqueueRequest(baseCallback);
    }
}
