package com.paypal.checkout.createorder.p536ba;

import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

/* renamed from: com.paypal.checkout.createorder.ba.TokenData */
public final class TokenData {
    private final String token;

    public TokenData(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        this.token = str;
    }

    public static /* synthetic */ TokenData copy$default(TokenData tokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenData.token;
        }
        return tokenData.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final TokenData copy(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        return new TokenData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenData) && C19383o.m32792b(this.token, ((TokenData) obj).token);
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return C0048b.m163a("TokenData(token=", this.token, ")");
    }
}
