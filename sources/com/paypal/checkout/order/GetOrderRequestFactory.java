package com.paypal.checkout.order;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;
import p010a9.C0048b;

public final class GetOrderRequestFactory {
    private final DebugConfigManager configManager;
    private final C20011u.C20012a requestBuilder;

    public GetOrderRequestFactory(DebugConfigManager debugConfigManager, C20011u.C20012a aVar) {
        C19383o.m32797g(debugConfigManager, "configManager");
        C19383o.m32797g(aVar, "requestBuilder");
        this.configManager = debugConfigManager;
        this.requestBuilder = aVar;
    }

    private final String getUrl(String str) {
        return C0048b.m163a(this.configManager.getCheckoutEnvironment().getRestUrl(), "/v2/checkout/orders/", str);
    }

    public final C20011u create(OrderContext orderContext, String str) {
        C19383o.m32797g(orderContext, "orderContext");
        C19383o.m32797g(str, "merchantAccessToken");
        C20011u.C20012a aVar = this.requestBuilder;
        aVar.mo73003f(getUrl(orderContext.getOrderId()));
        BaseApiKt.addMerchantRestHeaders(aVar, str);
        return aVar.mo72999b();
    }
}
