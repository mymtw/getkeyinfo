package com.paypal.android.platform.authsdk.otplogin.data.api;

import androidx.annotation.Keep;
import androidx.compose.animation.C0391c;
import com.paypal.android.platform.authsdk.otplogin.domain.Token;
import com.paypal.android.platform.authsdk.otplogin.domain.UserAccessToken;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

@Keep
public final class TokenResult {
    @C18417a("checkoutContinueToBrowser")
    private final Boolean checkoutContinueToBrowser;
    @C18417a("idToken")
    private final String idToken;
    @C18417a("minimalAccountCreationLimitation")
    private final Boolean minimalAccountCreationLimitation;
    @C18417a("nonce")
    private final String nonce;
    @C18417a("postAuthBindOptions")
    private final ArrayList<String> postAuthBindOptions;
    @C18417a("riskVisitorId")
    private final String riskVisitorId;
    @C18417a("thirdPartyAccessToken")
    private final UserAccessToken thirdPartyAccessToken;
    @C18417a("thirdPartyRefreshToken")
    private final Token thirdPartyRefreshToken;

    public TokenResult() {
        this((UserAccessToken) null, (Token) null, (String) null, (String) null, (String) null, (ArrayList) null, (Boolean) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
    }

    public TokenResult(UserAccessToken userAccessToken, Token token, String str, String str2, String str3, ArrayList<String> arrayList, Boolean bool, Boolean bool2) {
        C19383o.m32797g(arrayList, "postAuthBindOptions");
        this.thirdPartyAccessToken = userAccessToken;
        this.thirdPartyRefreshToken = token;
        this.idToken = str;
        this.riskVisitorId = str2;
        this.nonce = str3;
        this.postAuthBindOptions = arrayList;
        this.checkoutContinueToBrowser = bool;
        this.minimalAccountCreationLimitation = bool2;
    }

    public static /* synthetic */ TokenResult copy$default(TokenResult tokenResult, UserAccessToken userAccessToken, Token token, String str, String str2, String str3, ArrayList arrayList, Boolean bool, Boolean bool2, int i, Object obj) {
        TokenResult tokenResult2 = tokenResult;
        int i2 = i;
        return tokenResult.copy((i2 & 1) != 0 ? tokenResult2.thirdPartyAccessToken : userAccessToken, (i2 & 2) != 0 ? tokenResult2.thirdPartyRefreshToken : token, (i2 & 4) != 0 ? tokenResult2.idToken : str, (i2 & 8) != 0 ? tokenResult2.riskVisitorId : str2, (i2 & 16) != 0 ? tokenResult2.nonce : str3, (i2 & 32) != 0 ? tokenResult2.postAuthBindOptions : arrayList, (i2 & 64) != 0 ? tokenResult2.checkoutContinueToBrowser : bool, (i2 & 128) != 0 ? tokenResult2.minimalAccountCreationLimitation : bool2);
    }

    public final UserAccessToken component1() {
        return this.thirdPartyAccessToken;
    }

    public final Token component2() {
        return this.thirdPartyRefreshToken;
    }

    public final String component3() {
        return this.idToken;
    }

    public final String component4() {
        return this.riskVisitorId;
    }

    public final String component5() {
        return this.nonce;
    }

    public final ArrayList<String> component6() {
        return this.postAuthBindOptions;
    }

    public final Boolean component7() {
        return this.checkoutContinueToBrowser;
    }

    public final Boolean component8() {
        return this.minimalAccountCreationLimitation;
    }

    public final TokenResult copy(UserAccessToken userAccessToken, Token token, String str, String str2, String str3, ArrayList<String> arrayList, Boolean bool, Boolean bool2) {
        ArrayList<String> arrayList2 = arrayList;
        C19383o.m32797g(arrayList2, "postAuthBindOptions");
        return new TokenResult(userAccessToken, token, str, str2, str3, arrayList2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        return C19383o.m32792b(this.thirdPartyAccessToken, tokenResult.thirdPartyAccessToken) && C19383o.m32792b(this.thirdPartyRefreshToken, tokenResult.thirdPartyRefreshToken) && C19383o.m32792b(this.idToken, tokenResult.idToken) && C19383o.m32792b(this.riskVisitorId, tokenResult.riskVisitorId) && C19383o.m32792b(this.nonce, tokenResult.nonce) && C19383o.m32792b(this.postAuthBindOptions, tokenResult.postAuthBindOptions) && C19383o.m32792b(this.checkoutContinueToBrowser, tokenResult.checkoutContinueToBrowser) && C19383o.m32792b(this.minimalAccountCreationLimitation, tokenResult.minimalAccountCreationLimitation);
    }

    public final Boolean getCheckoutContinueToBrowser() {
        return this.checkoutContinueToBrowser;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final Boolean getMinimalAccountCreationLimitation() {
        return this.minimalAccountCreationLimitation;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final ArrayList<String> getPostAuthBindOptions() {
        return this.postAuthBindOptions;
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
        String str = this.idToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.riskVisitorId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode5 = (this.postAuthBindOptions.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Boolean bool = this.checkoutContinueToBrowser;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.minimalAccountCreationLimitation;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        UserAccessToken userAccessToken = this.thirdPartyAccessToken;
        Token token = this.thirdPartyRefreshToken;
        String str = this.idToken;
        String str2 = this.riskVisitorId;
        String str3 = this.nonce;
        ArrayList<String> arrayList = this.postAuthBindOptions;
        Boolean bool = this.checkoutContinueToBrowser;
        Boolean bool2 = this.minimalAccountCreationLimitation;
        StringBuilder sb = new StringBuilder();
        sb.append("TokenResult(thirdPartyAccessToken=");
        sb.append(userAccessToken);
        sb.append(", thirdPartyRefreshToken=");
        sb.append(token);
        sb.append(", idToken=");
        C0391c.m1061h(sb, str, ", riskVisitorId=", str2, ", nonce=");
        sb.append(str3);
        sb.append(", postAuthBindOptions=");
        sb.append(arrayList);
        sb.append(", checkoutContinueToBrowser=");
        sb.append(bool);
        sb.append(", minimalAccountCreationLimitation=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TokenResult(com.paypal.android.platform.authsdk.otplogin.domain.UserAccessToken r10, com.paypal.android.platform.authsdk.otplogin.domain.Token r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.ArrayList r15, java.lang.Boolean r16, java.lang.Boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0031
        L_0x0030:
            r7 = r15
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r16
        L_0x0039:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = r17
        L_0x0040:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.data.api.TokenResult.<init>(com.paypal.android.platform.authsdk.otplogin.domain.UserAccessToken, com.paypal.android.platform.authsdk.otplogin.domain.Token, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
