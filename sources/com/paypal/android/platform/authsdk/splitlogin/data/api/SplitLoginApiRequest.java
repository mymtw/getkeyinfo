package com.paypal.android.platform.authsdk.splitlogin.data.api;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

@Keep
public final class SplitLoginApiRequest {
    @C18417a("adsChallengeId")
    private final String adsChallengeId;
    @C18417a("appInfo")
    private final String appInfo;
    @C18417a("deviceInfo")
    private final String deviceInfo;
    @C18417a("publicCredential")
    private final String publicCredential;
    @C18417a("redirectUri")
    private final String redirectUri;
    @C18417a("riskData")
    private final String riskData;
    @C18417a("tenantName")
    private final String tenantName;
    @C18417a("thirdPartyClientId")
    private final String thirdPartyClientId;
    @C18417a("visitorId")
    private final String visitorId;

    public SplitLoginApiRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.visitorId = str;
        this.thirdPartyClientId = str2;
        this.publicCredential = str3;
        this.tenantName = str4;
        this.redirectUri = str5;
        this.adsChallengeId = str6;
        this.appInfo = str7;
        this.deviceInfo = str8;
        this.riskData = str9;
    }

    public static /* synthetic */ SplitLoginApiRequest copy$default(SplitLoginApiRequest splitLoginApiRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        SplitLoginApiRequest splitLoginApiRequest2 = splitLoginApiRequest;
        int i2 = i;
        return splitLoginApiRequest.copy((i2 & 1) != 0 ? splitLoginApiRequest2.visitorId : str, (i2 & 2) != 0 ? splitLoginApiRequest2.thirdPartyClientId : str2, (i2 & 4) != 0 ? splitLoginApiRequest2.publicCredential : str3, (i2 & 8) != 0 ? splitLoginApiRequest2.tenantName : str4, (i2 & 16) != 0 ? splitLoginApiRequest2.redirectUri : str5, (i2 & 32) != 0 ? splitLoginApiRequest2.adsChallengeId : str6, (i2 & 64) != 0 ? splitLoginApiRequest2.appInfo : str7, (i2 & 128) != 0 ? splitLoginApiRequest2.deviceInfo : str8, (i2 & 256) != 0 ? splitLoginApiRequest2.riskData : str9);
    }

    public final String component1() {
        return this.visitorId;
    }

    public final String component2() {
        return this.thirdPartyClientId;
    }

    public final String component3() {
        return this.publicCredential;
    }

    public final String component4() {
        return this.tenantName;
    }

    public final String component5() {
        return this.redirectUri;
    }

    public final String component6() {
        return this.adsChallengeId;
    }

    public final String component7() {
        return this.appInfo;
    }

    public final String component8() {
        return this.deviceInfo;
    }

    public final String component9() {
        return this.riskData;
    }

    public final SplitLoginApiRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new SplitLoginApiRequest(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitLoginApiRequest)) {
            return false;
        }
        SplitLoginApiRequest splitLoginApiRequest = (SplitLoginApiRequest) obj;
        return C19383o.m32792b(this.visitorId, splitLoginApiRequest.visitorId) && C19383o.m32792b(this.thirdPartyClientId, splitLoginApiRequest.thirdPartyClientId) && C19383o.m32792b(this.publicCredential, splitLoginApiRequest.publicCredential) && C19383o.m32792b(this.tenantName, splitLoginApiRequest.tenantName) && C19383o.m32792b(this.redirectUri, splitLoginApiRequest.redirectUri) && C19383o.m32792b(this.adsChallengeId, splitLoginApiRequest.adsChallengeId) && C19383o.m32792b(this.appInfo, splitLoginApiRequest.appInfo) && C19383o.m32792b(this.deviceInfo, splitLoginApiRequest.deviceInfo) && C19383o.m32792b(this.riskData, splitLoginApiRequest.riskData);
    }

    public final String getAdsChallengeId() {
        return this.adsChallengeId;
    }

    public final String getAppInfo() {
        return this.appInfo;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getPublicCredential() {
        return this.publicCredential;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final String getRiskData() {
        return this.riskData;
    }

    public final String getTenantName() {
        return this.tenantName;
    }

    public final String getThirdPartyClientId() {
        return this.thirdPartyClientId;
    }

    public final String getVisitorId() {
        return this.visitorId;
    }

    public int hashCode() {
        String str = this.visitorId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thirdPartyClientId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicCredential;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tenantName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redirectUri;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.adsChallengeId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.appInfo;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceInfo;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.riskData;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        String str = this.visitorId;
        String str2 = this.thirdPartyClientId;
        String str3 = this.publicCredential;
        String str4 = this.tenantName;
        String str5 = this.redirectUri;
        String str6 = this.adsChallengeId;
        String str7 = this.appInfo;
        String str8 = this.deviceInfo;
        String str9 = this.riskData;
        StringBuilder f = C0388a.m1050f("SplitLoginApiRequest(visitorId=", str, ", thirdPartyClientId=", str2, ", publicCredential=");
        C0391c.m1061h(f, str3, ", tenantName=", str4, ", redirectUri=");
        C0391c.m1061h(f, str5, ", adsChallengeId=", str6, ", appInfo=");
        C0391c.m1061h(f, str7, ", deviceInfo=", str8, ", riskData=");
        return C0023f.m110k(f, str9, ")");
    }
}
