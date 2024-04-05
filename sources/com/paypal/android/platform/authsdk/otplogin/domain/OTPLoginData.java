package com.paypal.android.platform.authsdk.otplogin.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.paypal.android.platform.authsdk.authcommon.model.ClientConfig;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class OTPLoginData {
    private final AuthOptionChallengeData authOptionChallengeData;
    private String challengeId;
    private final ClientConfig clientConfig;
    private String codeChallenge;
    private String codeNonce;
    private String codeVerifier;
    private boolean isOtpSent;
    private String nonce;
    private String otp;
    private final String publicCredential;
    private final String redirectUri;
    private String riskVisitorId;
    private final String thirdPartyClientID;

    public OTPLoginData(ClientConfig clientConfig2, String str, String str2, String str3, AuthOptionChallengeData authOptionChallengeData2, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        C19383o.m32797g(clientConfig2, "clientConfig");
        this.clientConfig = clientConfig2;
        this.publicCredential = str;
        this.challengeId = str2;
        this.nonce = str3;
        this.authOptionChallengeData = authOptionChallengeData2;
        this.thirdPartyClientID = str4;
        this.otp = str5;
        this.redirectUri = str6;
        this.codeNonce = str7;
        this.codeVerifier = str8;
        this.codeChallenge = str9;
        this.isOtpSent = z;
        this.riskVisitorId = str10;
    }

    public static /* synthetic */ OTPLoginData copy$default(OTPLoginData oTPLoginData, ClientConfig clientConfig2, String str, String str2, String str3, AuthOptionChallengeData authOptionChallengeData2, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, int i, Object obj) {
        OTPLoginData oTPLoginData2 = oTPLoginData;
        int i2 = i;
        return oTPLoginData.copy((i2 & 1) != 0 ? oTPLoginData2.clientConfig : clientConfig2, (i2 & 2) != 0 ? oTPLoginData2.publicCredential : str, (i2 & 4) != 0 ? oTPLoginData2.challengeId : str2, (i2 & 8) != 0 ? oTPLoginData2.nonce : str3, (i2 & 16) != 0 ? oTPLoginData2.authOptionChallengeData : authOptionChallengeData2, (i2 & 32) != 0 ? oTPLoginData2.thirdPartyClientID : str4, (i2 & 64) != 0 ? oTPLoginData2.otp : str5, (i2 & 128) != 0 ? oTPLoginData2.redirectUri : str6, (i2 & 256) != 0 ? oTPLoginData2.codeNonce : str7, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? oTPLoginData2.codeVerifier : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? oTPLoginData2.codeChallenge : str9, (i2 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? oTPLoginData2.isOtpSent : z, (i2 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? oTPLoginData2.riskVisitorId : str10);
    }

    public final ClientConfig component1() {
        return this.clientConfig;
    }

    public final String component10() {
        return this.codeVerifier;
    }

    public final String component11() {
        return this.codeChallenge;
    }

    public final boolean component12() {
        return this.isOtpSent;
    }

    public final String component13() {
        return this.riskVisitorId;
    }

    public final String component2() {
        return this.publicCredential;
    }

    public final String component3() {
        return this.challengeId;
    }

    public final String component4() {
        return this.nonce;
    }

    public final AuthOptionChallengeData component5() {
        return this.authOptionChallengeData;
    }

    public final String component6() {
        return this.thirdPartyClientID;
    }

    public final String component7() {
        return this.otp;
    }

    public final String component8() {
        return this.redirectUri;
    }

    public final String component9() {
        return this.codeNonce;
    }

    public final OTPLoginData copy(ClientConfig clientConfig2, String str, String str2, String str3, AuthOptionChallengeData authOptionChallengeData2, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        ClientConfig clientConfig3 = clientConfig2;
        C19383o.m32797g(clientConfig3, "clientConfig");
        return new OTPLoginData(clientConfig3, str, str2, str3, authOptionChallengeData2, str4, str5, str6, str7, str8, str9, z, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTPLoginData)) {
            return false;
        }
        OTPLoginData oTPLoginData = (OTPLoginData) obj;
        return C19383o.m32792b(this.clientConfig, oTPLoginData.clientConfig) && C19383o.m32792b(this.publicCredential, oTPLoginData.publicCredential) && C19383o.m32792b(this.challengeId, oTPLoginData.challengeId) && C19383o.m32792b(this.nonce, oTPLoginData.nonce) && C19383o.m32792b(this.authOptionChallengeData, oTPLoginData.authOptionChallengeData) && C19383o.m32792b(this.thirdPartyClientID, oTPLoginData.thirdPartyClientID) && C19383o.m32792b(this.otp, oTPLoginData.otp) && C19383o.m32792b(this.redirectUri, oTPLoginData.redirectUri) && C19383o.m32792b(this.codeNonce, oTPLoginData.codeNonce) && C19383o.m32792b(this.codeVerifier, oTPLoginData.codeVerifier) && C19383o.m32792b(this.codeChallenge, oTPLoginData.codeChallenge) && this.isOtpSent == oTPLoginData.isOtpSent && C19383o.m32792b(this.riskVisitorId, oTPLoginData.riskVisitorId);
    }

    public final AuthOptionChallengeData getAuthOptionChallengeData() {
        return this.authOptionChallengeData;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final String getCodeNonce() {
        return this.codeNonce;
    }

    public final String getCodeVerifier() {
        return this.codeVerifier;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getOtp() {
        return this.otp;
    }

    public final String getPublicCredential() {
        return this.publicCredential;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final String getRiskVisitorId() {
        return this.riskVisitorId;
    }

    public final String getThirdPartyClientID() {
        return this.thirdPartyClientID;
    }

    public int hashCode() {
        int hashCode = this.clientConfig.hashCode() * 31;
        String str = this.publicCredential;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challengeId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AuthOptionChallengeData authOptionChallengeData2 = this.authOptionChallengeData;
        int hashCode5 = (hashCode4 + (authOptionChallengeData2 == null ? 0 : authOptionChallengeData2.hashCode())) * 31;
        String str4 = this.thirdPartyClientID;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.otp;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.redirectUri;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.codeNonce;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.codeVerifier;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.codeChallenge;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        boolean z = this.isOtpSent;
        if (z) {
            z = true;
        }
        int i2 = (hashCode11 + (z ? 1 : 0)) * 31;
        String str10 = this.riskVisitorId;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return i2 + i;
    }

    public final boolean isOtpSent() {
        return this.isOtpSent;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCodeChallenge(String str) {
        this.codeChallenge = str;
    }

    public final void setCodeNonce(String str) {
        this.codeNonce = str;
    }

    public final void setCodeVerifier(String str) {
        this.codeVerifier = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setOtp(String str) {
        this.otp = str;
    }

    public final void setOtpSent(boolean z) {
        this.isOtpSent = z;
    }

    public final void setRiskVisitorId(String str) {
        this.riskVisitorId = str;
    }

    public String toString() {
        ClientConfig clientConfig2 = this.clientConfig;
        String str = this.publicCredential;
        String str2 = this.challengeId;
        String str3 = this.nonce;
        AuthOptionChallengeData authOptionChallengeData2 = this.authOptionChallengeData;
        String str4 = this.thirdPartyClientID;
        String str5 = this.otp;
        String str6 = this.redirectUri;
        String str7 = this.codeNonce;
        String str8 = this.codeVerifier;
        String str9 = this.codeChallenge;
        boolean z = this.isOtpSent;
        String str10 = this.riskVisitorId;
        StringBuilder sb = new StringBuilder();
        sb.append("OTPLoginData(clientConfig=");
        sb.append(clientConfig2);
        sb.append(", publicCredential=");
        sb.append(str);
        sb.append(", challengeId=");
        C0391c.m1061h(sb, str2, ", nonce=", str3, ", authOptionChallengeData=");
        sb.append(authOptionChallengeData2);
        sb.append(", thirdPartyClientID=");
        sb.append(str4);
        sb.append(", otp=");
        C0391c.m1061h(sb, str5, ", redirectUri=", str6, ", codeNonce=");
        C0391c.m1061h(sb, str7, ", codeVerifier=", str8, ", codeChallenge=");
        sb.append(str9);
        sb.append(", isOtpSent=");
        sb.append(z);
        sb.append(", riskVisitorId=");
        return C0023f.m110k(sb, str10, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OTPLoginData(com.paypal.android.platform.authsdk.authcommon.model.ClientConfig r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r19
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r20
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r21
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r22
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r23
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r24
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r25
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r12 = r2
            goto L_0x0043
        L_0x0041:
            r12 = r26
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r27
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r14 = r2
            goto L_0x0053
        L_0x0051:
            r14 = r28
        L_0x0053:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005a
            r0 = 0
            r15 = r0
            goto L_0x005c
        L_0x005a:
            r15 = r29
        L_0x005c:
            r3 = r17
            r4 = r18
            r16 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData.<init>(com.paypal.android.platform.authsdk.authcommon.model.ClientConfig, java.lang.String, java.lang.String, java.lang.String, com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
