package com.paypal.android.platform.authsdk.stepup.domain;

import android.support.p013v4.media.C0073e;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@Keep
public final class StepUpChallengeData {
    private final String accessToken;
    private final String challengeUri;
    private final String flowContext;
    private final String flowId;
    private final String objectType;
    private final String returnUri;
    private final String returnUriParam;
    private final String stepupContext;

    public StepUpChallengeData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C19383o.m32797g(str, UriChallengeConstantKt.CHALLENGE_URI);
        C19383o.m32797g(str2, UriChallengeConstantKt.RETURN_URI);
        C19383o.m32797g(str3, UriChallengeConstantKt.RETURN_URI_PARAMS);
        C19383o.m32797g(str4, UriChallengeConstantKt.STEP_UP_CONTEXT);
        C19383o.m32797g(str5, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(str6, UriChallengeConstantKt.FLOW_ID);
        C19383o.m32797g(str7, UriChallengeConstantKt.FLOW_CONTEXT);
        C19383o.m32797g(str8, "objectType");
        this.challengeUri = str;
        this.returnUri = str2;
        this.returnUriParam = str3;
        this.stepupContext = str4;
        this.accessToken = str5;
        this.flowId = str6;
        this.flowContext = str7;
        this.objectType = str8;
    }

    public static /* synthetic */ StepUpChallengeData copy$default(StepUpChallengeData stepUpChallengeData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        StepUpChallengeData stepUpChallengeData2 = stepUpChallengeData;
        int i2 = i;
        return stepUpChallengeData.copy((i2 & 1) != 0 ? stepUpChallengeData2.challengeUri : str, (i2 & 2) != 0 ? stepUpChallengeData2.returnUri : str2, (i2 & 4) != 0 ? stepUpChallengeData2.returnUriParam : str3, (i2 & 8) != 0 ? stepUpChallengeData2.stepupContext : str4, (i2 & 16) != 0 ? stepUpChallengeData2.accessToken : str5, (i2 & 32) != 0 ? stepUpChallengeData2.flowId : str6, (i2 & 64) != 0 ? stepUpChallengeData2.flowContext : str7, (i2 & 128) != 0 ? stepUpChallengeData2.objectType : str8);
    }

    public final String component1() {
        return this.challengeUri;
    }

    public final String component2() {
        return this.returnUri;
    }

    public final String component3() {
        return this.returnUriParam;
    }

    public final String component4() {
        return this.stepupContext;
    }

    public final String component5() {
        return this.accessToken;
    }

    public final String component6() {
        return this.flowId;
    }

    public final String component7() {
        return this.flowContext;
    }

    public final String component8() {
        return this.objectType;
    }

    public final StepUpChallengeData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C19383o.m32797g(str, UriChallengeConstantKt.CHALLENGE_URI);
        C19383o.m32797g(str2, UriChallengeConstantKt.RETURN_URI);
        C19383o.m32797g(str3, UriChallengeConstantKt.RETURN_URI_PARAMS);
        C19383o.m32797g(str4, UriChallengeConstantKt.STEP_UP_CONTEXT);
        C19383o.m32797g(str5, UriChallengeConstantKt.ACCESS_TOKEN);
        String str9 = str6;
        C19383o.m32797g(str9, UriChallengeConstantKt.FLOW_ID);
        String str10 = str7;
        C19383o.m32797g(str10, UriChallengeConstantKt.FLOW_CONTEXT);
        String str11 = str8;
        C19383o.m32797g(str11, "objectType");
        return new StepUpChallengeData(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepUpChallengeData)) {
            return false;
        }
        StepUpChallengeData stepUpChallengeData = (StepUpChallengeData) obj;
        return C19383o.m32792b(this.challengeUri, stepUpChallengeData.challengeUri) && C19383o.m32792b(this.returnUri, stepUpChallengeData.returnUri) && C19383o.m32792b(this.returnUriParam, stepUpChallengeData.returnUriParam) && C19383o.m32792b(this.stepupContext, stepUpChallengeData.stepupContext) && C19383o.m32792b(this.accessToken, stepUpChallengeData.accessToken) && C19383o.m32792b(this.flowId, stepUpChallengeData.flowId) && C19383o.m32792b(this.flowContext, stepUpChallengeData.flowContext) && C19383o.m32792b(this.objectType, stepUpChallengeData.objectType);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getChallengeUri() {
        return this.challengeUri;
    }

    public final String getFlowContext() {
        return this.flowContext;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getReturnUri() {
        return this.returnUri;
    }

    public final String getReturnUriParam() {
        return this.returnUriParam;
    }

    public final String getStepupContext() {
        return this.stepupContext;
    }

    public int hashCode() {
        return this.objectType.hashCode() + C0023f.m105e(this.flowContext, C0023f.m105e(this.flowId, C0023f.m105e(this.accessToken, C0023f.m105e(this.stepupContext, C0023f.m105e(this.returnUriParam, C0023f.m105e(this.returnUri, this.challengeUri.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        String str = this.challengeUri;
        String str2 = this.returnUri;
        String str3 = this.returnUriParam;
        String str4 = this.stepupContext;
        String str5 = this.accessToken;
        String str6 = this.flowId;
        String str7 = this.flowContext;
        String str8 = this.objectType;
        StringBuilder f = C0388a.m1050f("StepUpChallengeData(challengeUri=", str, ", returnUri=", str2, ", returnUriParam=");
        C0391c.m1061h(f, str3, ", stepupContext=", str4, ", accessToken=");
        C0391c.m1061h(f, str5, ", flowId=", str6, ", flowContext=");
        return C0073e.m210j(f, str7, ", objectType=", str8, ")");
    }
}
