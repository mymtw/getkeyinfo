package com.paypal.android.platform.authsdk.otplogin.domain;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class OtpLoginResultData {
    private final String riskVisitorId;
    private final UserAccessToken thirdPartyAccessToken;
    private final Token thirdPartyRefreshToken;

    public OtpLoginResultData(UserAccessToken userAccessToken, Token token, String str) {
        this.thirdPartyAccessToken = userAccessToken;
        this.thirdPartyRefreshToken = token;
        this.riskVisitorId = str;
    }

    public static /* synthetic */ OtpLoginResultData copy$default(OtpLoginResultData otpLoginResultData, UserAccessToken userAccessToken, Token token, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userAccessToken = otpLoginResultData.thirdPartyAccessToken;
        }
        if ((i & 2) != 0) {
            token = otpLoginResultData.thirdPartyRefreshToken;
        }
        if ((i & 4) != 0) {
            str = otpLoginResultData.riskVisitorId;
        }
        return otpLoginResultData.copy(userAccessToken, token, str);
    }

    public final UserAccessToken component1() {
        return this.thirdPartyAccessToken;
    }

    public final Token component2() {
        return this.thirdPartyRefreshToken;
    }

    public final String component3() {
        return this.riskVisitorId;
    }

    public final OtpLoginResultData copy(UserAccessToken userAccessToken, Token token, String str) {
        return new OtpLoginResultData(userAccessToken, token, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtpLoginResultData)) {
            return false;
        }
        OtpLoginResultData otpLoginResultData = (OtpLoginResultData) obj;
        return C19383o.m32792b(this.thirdPartyAccessToken, otpLoginResultData.thirdPartyAccessToken) && C19383o.m32792b(this.thirdPartyRefreshToken, otpLoginResultData.thirdPartyRefreshToken) && C19383o.m32792b(this.riskVisitorId, otpLoginResultData.riskVisitorId);
    }

    public final String getRiskVisitorId() {
        return this.riskVisitorId;
    }

    public final UserAccessToken getThirdPartyAccessToken() {
        return this.thirdPartyAccessToken;
    }

    public final Token getThirdPartyRefreshToken() {
        return this.thirdPartyRefreshToken;
    }

    public int hashCode() {
        UserAccessToken userAccessToken = this.thirdPartyAccessToken;
        int i = 0;
        int hashCode = (userAccessToken == null ? 0 : userAccessToken.hashCode()) * 31;
        Token token = this.thirdPartyRefreshToken;
        int hashCode2 = (hashCode + (token == null ? 0 : token.hashCode())) * 31;
        String str = this.riskVisitorId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        UserAccessToken userAccessToken = this.thirdPartyAccessToken;
        Token token = this.thirdPartyRefreshToken;
        String str = this.riskVisitorId;
        StringBuilder sb = new StringBuilder();
        sb.append("OtpLoginResultData(thirdPartyAccessToken=");
        sb.append(userAccessToken);
        sb.append(", thirdPartyRefreshToken=");
        sb.append(token);
        sb.append(", riskVisitorId=");
        return C0023f.m110k(sb, str, ")");
    }
}
