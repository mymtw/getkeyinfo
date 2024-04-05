package com.paypal.checkout.createorder.p536ba;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20016y;
import p010a9.C0048b;

/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenRequestFactory */
public final class BaTokenToEcTokenRequestFactory {
    private final DebugConfigManager debugConfigManager;
    private final C20011u.C20012a requestBuilder;

    public BaTokenToEcTokenRequestFactory(DebugConfigManager debugConfigManager2, C20011u.C20012a aVar) {
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(aVar, "requestBuilder");
        this.debugConfigManager = debugConfigManager2;
        this.requestBuilder = aVar;
    }

    public final C20011u create$pyplcheckout_externalThreedsRelease(String str) {
        C19383o.m32797g(str, "baToken");
        C20011u.C20012a aVar = this.requestBuilder;
        aVar.mo73003f(C0048b.m164c("https://", this.debugConfigManager.getCheckoutEnvironment().getHost(), "/smart/api/payment/", str, "/ectoken"));
        C20016y.f44360a.getClass();
        aVar.mo73001d("POST", C20016y.C20017a.m34281b("", (C20002r) null));
        return BaseApiKt.addRequestedByHeader(aVar).mo72999b();
    }
}
