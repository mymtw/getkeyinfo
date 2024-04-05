package com.paypal.android.platform.authsdk.splitlogin.domain;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
public final class AuthOptionChallengeData {
    private final String authOption;
    private final ChallengeData challengeData;
    private final String challengeType;
    private final String nonce;

    public AuthOptionChallengeData() {
        this((String) null, (String) null, (String) null, (ChallengeData) null, 15, (DefaultConstructorMarker) null);
    }

    public AuthOptionChallengeData(String str, String str2, String str3, ChallengeData challengeData2) {
        this.authOption = str;
        this.challengeType = str2;
        this.nonce = str3;
        this.challengeData = challengeData2;
    }

    public static /* synthetic */ AuthOptionChallengeData copy$default(AuthOptionChallengeData authOptionChallengeData, String str, String str2, String str3, ChallengeData challengeData2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authOptionChallengeData.authOption;
        }
        if ((i & 2) != 0) {
            str2 = authOptionChallengeData.challengeType;
        }
        if ((i & 4) != 0) {
            str3 = authOptionChallengeData.nonce;
        }
        if ((i & 8) != 0) {
            challengeData2 = authOptionChallengeData.challengeData;
        }
        return authOptionChallengeData.copy(str, str2, str3, challengeData2);
    }

    public final String component1() {
        return this.authOption;
    }

    public final String component2() {
        return this.challengeType;
    }

    public final String component3() {
        return this.nonce;
    }

    public final ChallengeData component4() {
        return this.challengeData;
    }

    public final AuthOptionChallengeData copy(String str, String str2, String str3, ChallengeData challengeData2) {
        return new AuthOptionChallengeData(str, str2, str3, challengeData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthOptionChallengeData)) {
            return false;
        }
        AuthOptionChallengeData authOptionChallengeData = (AuthOptionChallengeData) obj;
        return C19383o.m32792b(this.authOption, authOptionChallengeData.authOption) && C19383o.m32792b(this.challengeType, authOptionChallengeData.challengeType) && C19383o.m32792b(this.nonce, authOptionChallengeData.nonce) && C19383o.m32792b(this.challengeData, authOptionChallengeData.challengeData);
    }

    public final String getAuthOption() {
        return this.authOption;
    }

    public final ChallengeData getChallengeData() {
        return this.challengeData;
    }

    public final String getChallengeType() {
        return this.challengeType;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public int hashCode() {
        String str = this.authOption;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.challengeType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ChallengeData challengeData2 = this.challengeData;
        if (challengeData2 != null) {
            i = challengeData2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.authOption;
        String str2 = this.challengeType;
        String str3 = this.nonce;
        ChallengeData challengeData2 = this.challengeData;
        StringBuilder f = C0388a.m1050f("AuthOptionChallengeData(authOption=", str, ", challengeType=", str2, ", nonce=");
        f.append(str3);
        f.append(", challengeData=");
        f.append(challengeData2);
        f.append(")");
        return f.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthOptionChallengeData(String str, String str2, String str3, ChallengeData challengeData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : challengeData2);
    }
}
