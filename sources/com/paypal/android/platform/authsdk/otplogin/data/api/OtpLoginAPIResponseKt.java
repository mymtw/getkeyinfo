package com.paypal.android.platform.authsdk.otplogin.data.api;

import com.google.gson.C16708i;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginResultData;
import kotlin.jvm.internal.C19383o;

public final class OtpLoginAPIResponseKt {
    public static final TokenResult toGenerateTokenResult(OtpLoginAPIResponse otpLoginAPIResponse) {
        C19383o.m32797g(otpLoginAPIResponse, "<this>");
        C16708i iVar = new C16708i();
        Object e = iVar.mo59458e(TokenResult.class, iVar.mo59463j(otpLoginAPIResponse.getResult()));
        C19383o.m32796f(e, "gson.fromJson(gson.toJso… TokenResult::class.java)");
        return (TokenResult) e;
    }

    public static final String toJsonData(OtpLoginAPIResponse otpLoginAPIResponse) {
        C19383o.m32797g(otpLoginAPIResponse, "<this>");
        String j = new C16708i().mo59463j(otpLoginAPIResponse.getResult());
        C19383o.m32796f(j, "gson.toJson(this.result)");
        return j;
    }

    public static final OtpLoginResultData toOtpLoginResultData(OtpLoginAPIResponse otpLoginAPIResponse, TokenResult tokenResult) {
        C19383o.m32797g(otpLoginAPIResponse, "<this>");
        C19383o.m32797g(tokenResult, "tokenResult");
        return new OtpLoginResultData(tokenResult.getThirdPartyAccessToken(), tokenResult.getThirdPartyRefreshToken(), tokenResult.getRiskVisitorId());
    }
}
