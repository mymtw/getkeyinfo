package com.paypal.checkout.order.billingagreements;

import com.paypal.pyplcheckout.billingagreements.repo.BillingAgreementsDaoImpl;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import p003a2.C0015b;

public final class ExecuteBillingAgreementRequestFactory {
    private final DebugConfigManager configManager;
    private final C20011u.C20012a requestBuilder;

    public ExecuteBillingAgreementRequestFactory(DebugConfigManager debugConfigManager, C20011u.C20012a aVar) {
        C19383o.m32797g(debugConfigManager, "configManager");
        C19383o.m32797g(aVar, "requestBuilder");
        this.configManager = debugConfigManager;
        this.requestBuilder = aVar;
    }

    private final String getUrl(String str) {
        return C0015b.m90i(this.configManager.getCheckoutEnvironment().getRestUrl(), "/v1/billing-agreements/", str, "/agreements");
    }

    public final C20011u create(String str, String str2) {
        C19383o.m32797g(str, BillingAgreementsDaoImpl.BILLING_AGREEMENT_TOKEN);
        C19383o.m32797g(str2, "merchantAccessToken");
        C20011u.C20012a aVar = this.requestBuilder;
        BaseApiKt.addMerchantRestHeaders(aVar, str2);
        aVar.mo73003f(getUrl(str));
        BaseApiKt.addPostBody(aVar, "");
        return aVar.mo72999b();
    }
}
