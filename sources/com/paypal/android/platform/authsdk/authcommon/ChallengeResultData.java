package com.paypal.android.platform.authsdk.authcommon;

import android.support.p013v4.media.C0073e;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
public final class ChallengeResultData {
    private final String clientAccessToken;
    private final String idToken;
    private final String riskVisitorId;
    private final String userAccessToken;

    public ChallengeResultData(String str, String str2, String str3, String str4) {
        this.userAccessToken = str;
        this.clientAccessToken = str2;
        this.idToken = str3;
        this.riskVisitorId = str4;
    }

    public static /* synthetic */ ChallengeResultData copy$default(ChallengeResultData challengeResultData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeResultData.userAccessToken;
        }
        if ((i & 2) != 0) {
            str2 = challengeResultData.clientAccessToken;
        }
        if ((i & 4) != 0) {
            str3 = challengeResultData.idToken;
        }
        if ((i & 8) != 0) {
            str4 = challengeResultData.riskVisitorId;
        }
        return challengeResultData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userAccessToken;
    }

    public final String component2() {
        return this.clientAccessToken;
    }

    public final String component3() {
        return this.idToken;
    }

    public final String component4() {
        return this.riskVisitorId;
    }

    public final ChallengeResultData copy(String str, String str2, String str3, String str4) {
        return new ChallengeResultData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResultData)) {
            return false;
        }
        ChallengeResultData challengeResultData = (ChallengeResultData) obj;
        return C19383o.m32792b(this.userAccessToken, challengeResultData.userAccessToken) && C19383o.m32792b(this.clientAccessToken, challengeResultData.clientAccessToken) && C19383o.m32792b(this.idToken, challengeResultData.idToken) && C19383o.m32792b(this.riskVisitorId, challengeResultData.riskVisitorId);
    }

    public final String getClientAccessToken() {
        return this.clientAccessToken;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public final String getRiskVisitorId() {
        return this.riskVisitorId;
    }

    public final String getUserAccessToken() {
        return this.userAccessToken;
    }

    public int hashCode() {
        String str = this.userAccessToken;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientAccessToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idToken;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.riskVisitorId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.userAccessToken;
        String str2 = this.clientAccessToken;
        return C0073e.m210j(C0388a.m1050f("ChallengeResultData(userAccessToken=", str, ", clientAccessToken=", str2, ", idToken="), this.idToken, ", riskVisitorId=", this.riskVisitorId, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeResultData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
