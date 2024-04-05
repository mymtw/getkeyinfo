package com.paypal.checkout.fundingeligibility;

import android.support.p013v4.media.C0072d;
import com.paypal.checkout.config.PaymentButtonIntent;
import com.paypal.checkout.createorder.CurrencyCode;
import com.paypal.checkout.createorder.UserAction;
import com.paypal.checkout.createorder.UserActionKt;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.extensions.JSONObjectExtensionsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;
import okhttp3.C20011u;
import org.json.JSONObject;

public final class FundingEligibilityRequestFactory {
    private final String clientId;
    private final Boolean commit;
    private final CurrencyCode currency;
    private final String tag = "FundingEligibilityRequestFactory";

    public FundingEligibilityRequestFactory(DebugConfigManager debugConfigManager) {
        C19383o.m32797g(debugConfigManager, "debugConfigManager");
        String clientId2 = debugConfigManager.getClientId();
        C19383o.m32796f(clientId2, "debugConfigManager.clientId");
        this.clientId = clientId2;
        UserAction userAction = debugConfigManager.getUserAction();
        this.commit = userAction == null ? null : Boolean.valueOf(UserActionKt.getAsCommit(userAction));
        this.currency = debugConfigManager.getCurrencyCode();
    }

    private final String generateFundingEligibilityQuery(PaymentButtonIntent paymentButtonIntent) {
        StringBuilder h = C0072d.m201h("$clientId: String");
        if (this.commit != null) {
            h.append("\n$commit: Boolean");
        }
        if (this.currency != null) {
            h.append("\n$currency: SupportedCountryCurrencies");
        }
        if (paymentButtonIntent != null) {
            h.append("\n$intent: FundingEligibilityIntent");
        }
        String sb = h.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …}\n            .toString()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("clientId: $clientId");
        if (this.commit != null) {
            sb2.append("\ncommit: $commit");
        }
        if (this.currency != null) {
            sb2.append("\ncurrency: $currency");
        }
        if (paymentButtonIntent != null) {
            sb2.append("\nintent: $intent");
        }
        String sb3 = sb2.toString();
        C19383o.m32796f(sb3, "StringBuilder()\n        …}\n            .toString()");
        String Q0 = C19453g.m33013Q0("\n            query GetFundingEligibility(\n                " + sb + "\n            ) {\n                fundingEligibility(\n                    " + sb3 + "\n                ) {\n                    paypal {\n                        eligible\n                        reasons\n                    }\n                    credit {\n                        eligible\n                        reasons\n                    }\n                    paylater {\n                        eligible\n                        reasons\n                    }\n                }\n            }\n        ");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clientId", this.clientId);
        JSONObjectExtensionsKt.putOrOmit(jSONObject, "commit", this.commit);
        CurrencyCode currencyCode = this.currency;
        JSONObjectExtensionsKt.putOrOmit(jSONObject, "currency", currencyCode == null ? null : currencyCode.name());
        JSONObjectExtensionsKt.putOrOmit(jSONObject, "intent", paymentButtonIntent);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("query", Q0);
        jSONObject2.put("variables", jSONObject);
        String jSONObject3 = jSONObject2.toString();
        C19383o.m32796f(jSONObject3, "JSONObject().apply {\n   …les)\n        }.toString()");
        logRequest(jSONObject3);
        return jSONObject3;
    }

    private final void logRequest(String str) {
        String str2 = this.tag;
        C19383o.m32796f(str2, "tag");
        PLog.m28728dR(str2, "request: " + str);
    }

    public final C20011u create(PaymentButtonIntent paymentButtonIntent) {
        C20011u.C20012a aVar = new C20011u.C20012a();
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeaders(aVar);
        BaseApiKt.addPostBody(aVar, generateFundingEligibilityQuery(paymentButtonIntent));
        return aVar.mo72999b();
    }
}
