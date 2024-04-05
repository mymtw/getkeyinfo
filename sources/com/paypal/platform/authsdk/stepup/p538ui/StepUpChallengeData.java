package com.paypal.platform.authsdk.stepup.p538ui;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@Keep
/* renamed from: com.paypal.platform.authsdk.stepup.ui.StepUpChallengeData */
public final class StepUpChallengeData {
    private final Map<String, String> stepUpParams;
    private final String url;

    public StepUpChallengeData(String str, Map<String, String> map) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "stepUpParams");
        this.url = str;
        this.stepUpParams = map;
    }

    public static /* synthetic */ StepUpChallengeData copy$default(StepUpChallengeData stepUpChallengeData, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepUpChallengeData.url;
        }
        if ((i & 2) != 0) {
            map = stepUpChallengeData.stepUpParams;
        }
        return stepUpChallengeData.copy(str, map);
    }

    public final String component1() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.stepUpParams;
    }

    public final StepUpChallengeData copy(String str, Map<String, String> map) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "stepUpParams");
        return new StepUpChallengeData(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepUpChallengeData)) {
            return false;
        }
        StepUpChallengeData stepUpChallengeData = (StepUpChallengeData) obj;
        return C19383o.m32792b(this.url, stepUpChallengeData.url) && C19383o.m32792b(this.stepUpParams, stepUpChallengeData.stepUpParams);
    }

    public final Map<String, String> getStepUpParams() {
        return this.stepUpParams;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.stepUpParams.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        String str = this.url;
        Map<String, String> map = this.stepUpParams;
        return "StepUpChallengeData(url=" + str + ", stepUpParams=" + map + ")";
    }
}
