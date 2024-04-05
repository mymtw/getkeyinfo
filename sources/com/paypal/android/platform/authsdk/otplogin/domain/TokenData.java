package com.paypal.android.platform.authsdk.otplogin.domain;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

@Keep
public final class TokenData {
    private final String adaptiveToken;
    private final String authenticationUsername;
    private final boolean checkoutContinueToBrowser;
    private final Token firstPartyClientAccessToken;
    private final Token firstPartySessionToken;
    private final UserAccessToken firstPartyUserAccessToken;
    private final String idToken;
    private final boolean minimalAccountCreationLimitation;
    private final String objectType;
    private final List<String> postAuthBindOptions;
    private final List<String> postLoginInterstitial;
    private final String riskVisitorId;

    public TokenData(Token token, UserAccessToken userAccessToken, Token token2, String str, List<String> list, String str2, String str3, boolean z, List<String> list2, String str4, boolean z2, String str5) {
        C19383o.m32797g(userAccessToken, "firstPartyUserAccessToken");
        C19383o.m32797g(token2, "firstPartySessionToken");
        C19383o.m32797g(str, "idToken");
        C19383o.m32797g(list, "postAuthBindOptions");
        C19383o.m32797g(str2, "riskVisitorId");
        C19383o.m32797g(str3, "adaptiveToken");
        C19383o.m32797g(list2, "postLoginInterstitial");
        C19383o.m32797g(str4, "authenticationUsername");
        C19383o.m32797g(str5, "objectType");
        this.firstPartyClientAccessToken = token;
        this.firstPartyUserAccessToken = userAccessToken;
        this.firstPartySessionToken = token2;
        this.idToken = str;
        this.postAuthBindOptions = list;
        this.riskVisitorId = str2;
        this.adaptiveToken = str3;
        this.checkoutContinueToBrowser = z;
        this.postLoginInterstitial = list2;
        this.authenticationUsername = str4;
        this.minimalAccountCreationLimitation = z2;
        this.objectType = str5;
    }

    public static /* synthetic */ TokenData copy$default(TokenData tokenData, Token token, UserAccessToken userAccessToken, Token token2, String str, List list, String str2, String str3, boolean z, List list2, String str4, boolean z2, String str5, int i, Object obj) {
        TokenData tokenData2 = tokenData;
        int i2 = i;
        return tokenData.copy((i2 & 1) != 0 ? tokenData2.firstPartyClientAccessToken : token, (i2 & 2) != 0 ? tokenData2.firstPartyUserAccessToken : userAccessToken, (i2 & 4) != 0 ? tokenData2.firstPartySessionToken : token2, (i2 & 8) != 0 ? tokenData2.idToken : str, (i2 & 16) != 0 ? tokenData2.postAuthBindOptions : list, (i2 & 32) != 0 ? tokenData2.riskVisitorId : str2, (i2 & 64) != 0 ? tokenData2.adaptiveToken : str3, (i2 & 128) != 0 ? tokenData2.checkoutContinueToBrowser : z, (i2 & 256) != 0 ? tokenData2.postLoginInterstitial : list2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? tokenData2.authenticationUsername : str4, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? tokenData2.minimalAccountCreationLimitation : z2, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? tokenData2.objectType : str5);
    }

    public final Token component1() {
        return this.firstPartyClientAccessToken;
    }

    public final String component10() {
        return this.authenticationUsername;
    }

    public final boolean component11() {
        return this.minimalAccountCreationLimitation;
    }

    public final String component12() {
        return this.objectType;
    }

    public final UserAccessToken component2() {
        return this.firstPartyUserAccessToken;
    }

    public final Token component3() {
        return this.firstPartySessionToken;
    }

    public final String component4() {
        return this.idToken;
    }

    public final List<String> component5() {
        return this.postAuthBindOptions;
    }

    public final String component6() {
        return this.riskVisitorId;
    }

    public final String component7() {
        return this.adaptiveToken;
    }

    public final boolean component8() {
        return this.checkoutContinueToBrowser;
    }

    public final List<String> component9() {
        return this.postLoginInterstitial;
    }

    public final TokenData copy(Token token, UserAccessToken userAccessToken, Token token2, String str, List<String> list, String str2, String str3, boolean z, List<String> list2, String str4, boolean z2, String str5) {
        UserAccessToken userAccessToken2 = userAccessToken;
        C19383o.m32797g(userAccessToken2, "firstPartyUserAccessToken");
        Token token3 = token2;
        C19383o.m32797g(token3, "firstPartySessionToken");
        String str6 = str;
        C19383o.m32797g(str6, "idToken");
        List<String> list3 = list;
        C19383o.m32797g(list3, "postAuthBindOptions");
        String str7 = str2;
        C19383o.m32797g(str7, "riskVisitorId");
        String str8 = str3;
        C19383o.m32797g(str8, "adaptiveToken");
        List<String> list4 = list2;
        C19383o.m32797g(list4, "postLoginInterstitial");
        String str9 = str4;
        C19383o.m32797g(str9, "authenticationUsername");
        String str10 = str5;
        C19383o.m32797g(str10, "objectType");
        return new TokenData(token, userAccessToken2, token3, str6, list3, str7, str8, z, list4, str9, z2, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return C19383o.m32792b(this.firstPartyClientAccessToken, tokenData.firstPartyClientAccessToken) && C19383o.m32792b(this.firstPartyUserAccessToken, tokenData.firstPartyUserAccessToken) && C19383o.m32792b(this.firstPartySessionToken, tokenData.firstPartySessionToken) && C19383o.m32792b(this.idToken, tokenData.idToken) && C19383o.m32792b(this.postAuthBindOptions, tokenData.postAuthBindOptions) && C19383o.m32792b(this.riskVisitorId, tokenData.riskVisitorId) && C19383o.m32792b(this.adaptiveToken, tokenData.adaptiveToken) && this.checkoutContinueToBrowser == tokenData.checkoutContinueToBrowser && C19383o.m32792b(this.postLoginInterstitial, tokenData.postLoginInterstitial) && C19383o.m32792b(this.authenticationUsername, tokenData.authenticationUsername) && this.minimalAccountCreationLimitation == tokenData.minimalAccountCreationLimitation && C19383o.m32792b(this.objectType, tokenData.objectType);
    }

    public final String getAdaptiveToken() {
        return this.adaptiveToken;
    }

    public final String getAuthenticationUsername() {
        return this.authenticationUsername;
    }

    public final boolean getCheckoutContinueToBrowser() {
        return this.checkoutContinueToBrowser;
    }

    public final Token getFirstPartyClientAccessToken() {
        return this.firstPartyClientAccessToken;
    }

    public final Token getFirstPartySessionToken() {
        return this.firstPartySessionToken;
    }

    public final UserAccessToken getFirstPartyUserAccessToken() {
        return this.firstPartyUserAccessToken;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final boolean getMinimalAccountCreationLimitation() {
        return this.minimalAccountCreationLimitation;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final List<String> getPostAuthBindOptions() {
        return this.postAuthBindOptions;
    }

    public final List<String> getPostLoginInterstitial() {
        return this.postLoginInterstitial;
    }

    public final String getRiskVisitorId() {
        return this.riskVisitorId;
    }

    public int hashCode() {
        Token token = this.firstPartyClientAccessToken;
        int hashCode = token == null ? 0 : token.hashCode();
        int e = C0023f.m105e(this.adaptiveToken, C0023f.m105e(this.riskVisitorId, C13983i.m21488g(this.postAuthBindOptions, C0023f.m105e(this.idToken, (this.firstPartySessionToken.hashCode() + ((this.firstPartyUserAccessToken.hashCode() + (hashCode * 31)) * 31)) * 31, 31), 31), 31), 31);
        boolean z = this.checkoutContinueToBrowser;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int e2 = C0023f.m105e(this.authenticationUsername, C13983i.m21488g(this.postLoginInterstitial, (e + (z ? 1 : 0)) * 31, 31), 31);
        boolean z3 = this.minimalAccountCreationLimitation;
        if (!z3) {
            z2 = z3;
        }
        return this.objectType.hashCode() + ((e2 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        Token token = this.firstPartyClientAccessToken;
        UserAccessToken userAccessToken = this.firstPartyUserAccessToken;
        Token token2 = this.firstPartySessionToken;
        String str = this.idToken;
        List<String> list = this.postAuthBindOptions;
        String str2 = this.riskVisitorId;
        String str3 = this.adaptiveToken;
        boolean z = this.checkoutContinueToBrowser;
        List<String> list2 = this.postLoginInterstitial;
        String str4 = this.authenticationUsername;
        boolean z2 = this.minimalAccountCreationLimitation;
        String str5 = this.objectType;
        return "TokenData(firstPartyClientAccessToken=" + token + ", firstPartyUserAccessToken=" + userAccessToken + ", firstPartySessionToken=" + token2 + ", idToken=" + str + ", postAuthBindOptions=" + list + ", riskVisitorId=" + str2 + ", adaptiveToken=" + str3 + ", checkoutContinueToBrowser=" + z + ", postLoginInterstitial=" + list2 + ", authenticationUsername=" + str4 + ", minimalAccountCreationLimitation=" + z2 + ", objectType=" + str5 + ")";
    }
}
