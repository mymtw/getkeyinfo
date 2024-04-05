package com.paypal.checkout.createorder;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.checkout.order.Order;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20011u;

public final class CreateOrderRequestFactory {
    private final C16708i gson;
    private final C20011u.C20012a requestBuilder;

    public CreateOrderRequestFactory(C20011u.C20012a aVar, C16708i iVar) {
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(iVar, "gson");
        this.requestBuilder = aVar;
        this.gson = iVar;
    }

    public final C20011u create$pyplcheckout_externalThreedsRelease(Order order, String str) {
        C19383o.m32797g(order, ResponseConstants.ORDER);
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C20011u.C20012a aVar = this.requestBuilder;
        BaseApiKt.setOrdersUrl(aVar);
        BaseApiKt.addRestHeaders(aVar, str);
        String j = this.gson.mo59463j(order);
        C19383o.m32796f(j, "gson.toJson(order)");
        BaseApiKt.addPostBody(aVar, j);
        return aVar.mo72999b();
    }
}
