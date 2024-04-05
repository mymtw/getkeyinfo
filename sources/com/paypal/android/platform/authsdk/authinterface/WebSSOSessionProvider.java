package com.paypal.android.platform.authsdk.authinterface;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

@Keep
public final class WebSSOSessionProvider {
    private String authCode;
    private String redirectUrl;

    public WebSSOSessionProvider(String str, String str2) {
        C19383o.m32797g(str, "redirectUrl");
        C19383o.m32797g(str2, "authCode");
        this.redirectUrl = str;
        this.authCode = str2;
    }

    public static /* synthetic */ WebSSOSessionProvider copy$default(WebSSOSessionProvider webSSOSessionProvider, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webSSOSessionProvider.redirectUrl;
        }
        if ((i & 2) != 0) {
            str2 = webSSOSessionProvider.authCode;
        }
        return webSSOSessionProvider.copy(str, str2);
    }

    public final String component1() {
        return this.redirectUrl;
    }

    public final String component2() {
        return this.authCode;
    }

    public final WebSSOSessionProvider copy(String str, String str2) {
        C19383o.m32797g(str, "redirectUrl");
        C19383o.m32797g(str2, "authCode");
        return new WebSSOSessionProvider(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSSOSessionProvider)) {
            return false;
        }
        WebSSOSessionProvider webSSOSessionProvider = (WebSSOSessionProvider) obj;
        return C19383o.m32792b(this.redirectUrl, webSSOSessionProvider.redirectUrl) && C19383o.m32792b(this.authCode, webSSOSessionProvider.authCode);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        return this.authCode.hashCode() + (this.redirectUrl.hashCode() * 31);
    }

    public final void setAuthCode(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.authCode = str;
    }

    public final void setRedirectUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.redirectUrl = str;
    }

    public String toString() {
        return C0048b.m164c("WebSSOSessionProvider(redirectUrl=", this.redirectUrl, ", authCode=", this.authCode, ")");
    }
}
