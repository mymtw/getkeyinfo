package com.paypal.android.platform.authsdk.stepup.domain;

import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@Keep
public final class StepUpChallengeParam {
    private final Challenge.StepUpChallenge challenge;
    private final Map<String, String> challengeQueryMap;

    public StepUpChallengeParam(Challenge.StepUpChallenge stepUpChallenge, Map<String, String> map) {
        C19383o.m32797g(stepUpChallenge, "challenge");
        C19383o.m32797g(map, "challengeQueryMap");
        this.challenge = stepUpChallenge;
        this.challengeQueryMap = map;
    }

    public static /* synthetic */ StepUpChallengeParam copy$default(StepUpChallengeParam stepUpChallengeParam, Challenge.StepUpChallenge stepUpChallenge, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            stepUpChallenge = stepUpChallengeParam.challenge;
        }
        if ((i & 2) != 0) {
            map = stepUpChallengeParam.challengeQueryMap;
        }
        return stepUpChallengeParam.copy(stepUpChallenge, map);
    }

    public final Challenge.StepUpChallenge component1() {
        return this.challenge;
    }

    public final Map<String, String> component2() {
        return this.challengeQueryMap;
    }

    public final StepUpChallengeParam copy(Challenge.StepUpChallenge stepUpChallenge, Map<String, String> map) {
        C19383o.m32797g(stepUpChallenge, "challenge");
        C19383o.m32797g(map, "challengeQueryMap");
        return new StepUpChallengeParam(stepUpChallenge, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepUpChallengeParam)) {
            return false;
        }
        StepUpChallengeParam stepUpChallengeParam = (StepUpChallengeParam) obj;
        return C19383o.m32792b(this.challenge, stepUpChallengeParam.challenge) && C19383o.m32792b(this.challengeQueryMap, stepUpChallengeParam.challengeQueryMap);
    }

    public final Challenge.StepUpChallenge getChallenge() {
        return this.challenge;
    }

    public final Map<String, String> getChallengeQueryMap() {
        return this.challengeQueryMap;
    }

    public int hashCode() {
        return this.challengeQueryMap.hashCode() + (this.challenge.hashCode() * 31);
    }

    public String toString() {
        Challenge.StepUpChallenge stepUpChallenge = this.challenge;
        Map<String, String> map = this.challengeQueryMap;
        return "StepUpChallengeParam(challenge=" + stepUpChallenge + ", challengeQueryMap=" + map + ")";
    }
}
