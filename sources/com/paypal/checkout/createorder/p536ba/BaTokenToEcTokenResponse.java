package com.paypal.checkout.createorder.p536ba;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.checkout.createorder.ba.BaTokenToEcTokenResponse */
public final class BaTokenToEcTokenResponse {
    private final TokenData data;

    public BaTokenToEcTokenResponse(TokenData tokenData) {
        C19383o.m32797g(tokenData, "data");
        this.data = tokenData;
    }

    public static /* synthetic */ BaTokenToEcTokenResponse copy$default(BaTokenToEcTokenResponse baTokenToEcTokenResponse, TokenData tokenData, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenData = baTokenToEcTokenResponse.data;
        }
        return baTokenToEcTokenResponse.copy(tokenData);
    }

    public final TokenData component1() {
        return this.data;
    }

    public final BaTokenToEcTokenResponse copy(TokenData tokenData) {
        C19383o.m32797g(tokenData, "data");
        return new BaTokenToEcTokenResponse(tokenData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaTokenToEcTokenResponse) && C19383o.m32792b(this.data, ((BaTokenToEcTokenResponse) obj).data);
    }

    public final TokenData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        TokenData tokenData = this.data;
        return "BaTokenToEcTokenResponse(data=" + tokenData + ")";
    }
}
