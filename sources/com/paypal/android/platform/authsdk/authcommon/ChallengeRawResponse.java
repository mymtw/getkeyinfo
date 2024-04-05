package com.paypal.android.platform.authsdk.authcommon;

import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20018z;

@Keep
public final class ChallengeRawResponse {
    private final Object additionalData;
    private final String challengeType;
    private final Error error;
    private final String jsonResultStr;
    private final String requestId;
    private final C20018z response;

    public ChallengeRawResponse(String str, String str2, String str3, C20018z zVar, Error error2, Object obj) {
        C19383o.m32797g(str, "requestId");
        this.requestId = str;
        this.jsonResultStr = str2;
        this.challengeType = str3;
        this.response = zVar;
        this.error = error2;
        this.additionalData = obj;
    }

    public static /* synthetic */ ChallengeRawResponse copy$default(ChallengeRawResponse challengeRawResponse, String str, String str2, String str3, C20018z zVar, Error error2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = challengeRawResponse.requestId;
        }
        if ((i & 2) != 0) {
            str2 = challengeRawResponse.jsonResultStr;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = challengeRawResponse.challengeType;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            zVar = challengeRawResponse.response;
        }
        C20018z zVar2 = zVar;
        if ((i & 16) != 0) {
            error2 = challengeRawResponse.error;
        }
        Error error3 = error2;
        if ((i & 32) != 0) {
            obj = challengeRawResponse.additionalData;
        }
        return challengeRawResponse.copy(str, str4, str5, zVar2, error3, obj);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.jsonResultStr;
    }

    public final String component3() {
        return this.challengeType;
    }

    public final C20018z component4() {
        return this.response;
    }

    public final Error component5() {
        return this.error;
    }

    public final Object component6() {
        return this.additionalData;
    }

    public final ChallengeRawResponse copy(String str, String str2, String str3, C20018z zVar, Error error2, Object obj) {
        C19383o.m32797g(str, "requestId");
        return new ChallengeRawResponse(str, str2, str3, zVar, error2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRawResponse)) {
            return false;
        }
        ChallengeRawResponse challengeRawResponse = (ChallengeRawResponse) obj;
        return C19383o.m32792b(this.requestId, challengeRawResponse.requestId) && C19383o.m32792b(this.jsonResultStr, challengeRawResponse.jsonResultStr) && C19383o.m32792b(this.challengeType, challengeRawResponse.challengeType) && C19383o.m32792b(this.response, challengeRawResponse.response) && C19383o.m32792b(this.error, challengeRawResponse.error) && C19383o.m32792b(this.additionalData, challengeRawResponse.additionalData);
    }

    public final Object getAdditionalData() {
        return this.additionalData;
    }

    public final String getChallengeType() {
        return this.challengeType;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getJsonResultStr() {
        return this.jsonResultStr;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final C20018z getResponse() {
        return this.response;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.jsonResultStr;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.challengeType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C20018z zVar = this.response;
        int hashCode4 = (hashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        Error error2 = this.error;
        int hashCode5 = (hashCode4 + (error2 == null ? 0 : error2.hashCode())) * 31;
        Object obj = this.additionalData;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.requestId;
        String str2 = this.jsonResultStr;
        String str3 = this.challengeType;
        C20018z zVar = this.response;
        Error error2 = this.error;
        Object obj = this.additionalData;
        StringBuilder f = C0388a.m1050f("ChallengeRawResponse(requestId=", str, ", jsonResultStr=", str2, ", challengeType=");
        f.append(str3);
        f.append(", response=");
        f.append(zVar);
        f.append(", error=");
        f.append(error2);
        f.append(", additionalData=");
        f.append(obj);
        f.append(")");
        return f.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeRawResponse(java.lang.String r7, java.lang.String r8, java.lang.String r9, okhttp3.C20018z r10, java.lang.Error r11, java.lang.Object r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r8
        L_0x0008:
            r2 = r13 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r9
        L_0x000f:
            r3 = r13 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r10
        L_0x0016:
            r4 = r13 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r11
        L_0x001d:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.ChallengeRawResponse.<init>(java.lang.String, java.lang.String, java.lang.String, okhttp3.z, java.lang.Error, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
