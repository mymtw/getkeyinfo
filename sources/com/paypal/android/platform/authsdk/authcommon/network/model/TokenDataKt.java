package com.paypal.android.platform.authsdk.authcommon.network.model;

import com.paypal.android.platform.authsdk.authcommon.model.Token;
import com.paypal.android.platform.authsdk.authcommon.model.UserAccessToken;
import kotlin.jvm.internal.C19383o;

public final class TokenDataKt {
    public static final Token toToken(TokenData tokenData) {
        C19383o.m32797g(tokenData, "<this>");
        return new Token(tokenData.getTokenType(), tokenData.getTokenValue(), tokenData.getExpires(), tokenData.getExpirationInSeconds());
    }

    public static final UserAccessToken toUserAccessToken(UserAccessTokenData userAccessTokenData) {
        C19383o.m32797g(userAccessTokenData, "<this>");
        return new UserAccessToken(userAccessTokenData.getTokenType(), userAccessTokenData.getTokenValue(), userAccessTokenData.getExpires(), userAccessTokenData.getExpirationInSeconds(), userAccessTokenData.getAuthenticationTier(), userAccessTokenData.getAuthenticationType());
    }
}
