package com.paypal.checkout.merchanttoken;

import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.model.CheckoutEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20015x;
import okhttp3.C20016y;

public final class LsatTokenRequestFactory {
    private final CheckoutEnvironment checkoutEnvironment;
    private final String requestUrl;

    public LsatTokenRequestFactory(DebugConfigManager debugConfigManager) {
        C19383o.m32797g(debugConfigManager, "debugConfigManager");
        CheckoutEnvironment checkoutEnvironment2 = debugConfigManager.getCheckoutEnvironment();
        C19383o.m32796f(checkoutEnvironment2, "debugConfigManager.checkoutEnvironment");
        this.checkoutEnvironment = checkoutEnvironment2;
        this.requestUrl = C0326j.m864i(checkoutEnvironment2.getRestUrl(), "/v1/oauth2/token");
    }

    public final C20011u create(String str) {
        C19383o.m32797g(str, "clientId");
        C20016y.f44360a.getClass();
        C20015x b = C20016y.C20017a.m34281b("grant_type=client_credentials", (C20002r) null);
        C20011u.C20012a aVar = new C20011u.C20012a();
        aVar.mo73003f(this.requestUrl);
        C20011u.C20012a addBasicRestHeaders$default = BaseApiKt.addBasicRestHeaders$default(aVar, str, (String) null, 2, (Object) null);
        addBasicRestHeaders$default.mo73001d("POST", b);
        return addBasicRestHeaders$default.mo72999b();
    }
}
