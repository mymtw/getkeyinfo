package com.paypal.android.platform.authsdk.otplogin.data.api;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p650pn.C18417a;

@Keep
public final class GenerateChallengeAPIRequest {
    @C18417a("ads_challenge_id")
    private final String ads_challenge_id;
    @C18417a("app_info")
    private final String app_info;
    @C18417a("challenge_id")
    private final String challenge_id;
    @C18417a("device_info")
    private final String device_info;
    @C18417a("nonce")
    private final String nonce;
    @C18417a("public_credential")
    private final String public_credential;
    @C18417a("risk_data")
    private final String risk_data;

    public GenerateChallengeAPIRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.nonce = str;
        this.challenge_id = str2;
        this.public_credential = str3;
        this.ads_challenge_id = str4;
        this.app_info = str5;
        this.device_info = str6;
        this.risk_data = str7;
    }

    public static /* synthetic */ GenerateChallengeAPIRequest copy$default(GenerateChallengeAPIRequest generateChallengeAPIRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateChallengeAPIRequest.nonce;
        }
        if ((i & 2) != 0) {
            str2 = generateChallengeAPIRequest.challenge_id;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = generateChallengeAPIRequest.public_credential;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = generateChallengeAPIRequest.ads_challenge_id;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = generateChallengeAPIRequest.app_info;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = generateChallengeAPIRequest.device_info;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = generateChallengeAPIRequest.risk_data;
        }
        return generateChallengeAPIRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.nonce;
    }

    public final String component2() {
        return this.challenge_id;
    }

    public final String component3() {
        return this.public_credential;
    }

    public final String component4() {
        return this.ads_challenge_id;
    }

    public final String component5() {
        return this.app_info;
    }

    public final String component6() {
        return this.device_info;
    }

    public final String component7() {
        return this.risk_data;
    }

    public final GenerateChallengeAPIRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new GenerateChallengeAPIRequest(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerateChallengeAPIRequest)) {
            return false;
        }
        GenerateChallengeAPIRequest generateChallengeAPIRequest = (GenerateChallengeAPIRequest) obj;
        return C19383o.m32792b(this.nonce, generateChallengeAPIRequest.nonce) && C19383o.m32792b(this.challenge_id, generateChallengeAPIRequest.challenge_id) && C19383o.m32792b(this.public_credential, generateChallengeAPIRequest.public_credential) && C19383o.m32792b(this.ads_challenge_id, generateChallengeAPIRequest.ads_challenge_id) && C19383o.m32792b(this.app_info, generateChallengeAPIRequest.app_info) && C19383o.m32792b(this.device_info, generateChallengeAPIRequest.device_info) && C19383o.m32792b(this.risk_data, generateChallengeAPIRequest.risk_data);
    }

    public final String getAds_challenge_id() {
        return this.ads_challenge_id;
    }

    public final String getApp_info() {
        return this.app_info;
    }

    public final String getChallenge_id() {
        return this.challenge_id;
    }

    public final String getDevice_info() {
        return this.device_info;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPublic_credential() {
        return this.public_credential;
    }

    public final String getRisk_data() {
        return this.risk_data;
    }

    public int hashCode() {
        String str = this.nonce;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challenge_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.public_credential;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ads_challenge_id;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.app_info;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.device_info;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.risk_data;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.nonce;
        String str2 = this.challenge_id;
        String str3 = this.public_credential;
        String str4 = this.ads_challenge_id;
        String str5 = this.app_info;
        String str6 = this.device_info;
        String str7 = this.risk_data;
        StringBuilder f = C0388a.m1050f("GenerateChallengeAPIRequest(nonce=", str, ", challenge_id=", str2, ", public_credential=");
        C0391c.m1061h(f, str3, ", ads_challenge_id=", str4, ", app_info=");
        C0391c.m1061h(f, str5, ", device_info=", str6, ", risk_data=");
        return C0023f.m110k(f, str7, ")");
    }
}
