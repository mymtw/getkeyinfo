package com.paypal.checkout.order.patch;

import com.google.gson.C16796j;
import com.paypal.checkout.order.OrderContext;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;

public final class PatchOrderRequestFactory {
    private final C16796j gsonBuilder;

    public PatchOrderRequestFactory(C16796j jVar) {
        C19383o.m32797g(jVar, "gsonBuilder");
        this.gsonBuilder = jVar;
    }

    private final String getPatchRequest(PatchOrderRequest patchOrderRequest) {
        C16796j jVar = this.gsonBuilder;
        jVar.f37120i = false;
        String j = jVar.mo59627a().mo59463j(PatchRequestBody.Companion.fromPatchOrderRequest(patchOrderRequest));
        C19383o.m32796f(j, "gsonBuilder.disableHtmlE…chOrderRequest)\n        )");
        return j;
    }

    public final C20011u createRequest(String str, PatchOrderRequest patchOrderRequest) {
        C19383o.m32797g(str, "upgradedLsatToken");
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        String patchUrl = OrderContext.Companion.get().getPatchUrl();
        if (patchUrl != null) {
            C20011u.C20012a aVar = new C20011u.C20012a();
            BaseApiKt.addRestHeaders(aVar, str);
            BaseApiKt.patch(aVar, getPatchRequest(patchOrderRequest));
            aVar.mo73003f(patchUrl);
            return aVar.mo72999b();
        }
        throw new IllegalArgumentException("Patch URL is null");
    }
}
