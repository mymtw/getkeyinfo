package com.paypal.android.platform.authsdk.captcha.domain;

import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@Keep
public final class CaptchaChallengeData {
    private final Challenge.CaptchaChallenge challenge;
    private final Map<String, String> challengeQueryMap;

    public CaptchaChallengeData(Challenge.CaptchaChallenge captchaChallenge, Map<String, String> map) {
        C19383o.m32797g(captchaChallenge, "challenge");
        C19383o.m32797g(map, "challengeQueryMap");
        this.challenge = captchaChallenge;
        this.challengeQueryMap = map;
    }

    public static /* synthetic */ CaptchaChallengeData copy$default(CaptchaChallengeData captchaChallengeData, Challenge.CaptchaChallenge captchaChallenge, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            captchaChallenge = captchaChallengeData.challenge;
        }
        if ((i & 2) != 0) {
            map = captchaChallengeData.challengeQueryMap;
        }
        return captchaChallengeData.copy(captchaChallenge, map);
    }

    public final Challenge.CaptchaChallenge component1() {
        return this.challenge;
    }

    public final Map<String, String> component2() {
        return this.challengeQueryMap;
    }

    public final CaptchaChallengeData copy(Challenge.CaptchaChallenge captchaChallenge, Map<String, String> map) {
        C19383o.m32797g(captchaChallenge, "challenge");
        C19383o.m32797g(map, "challengeQueryMap");
        return new CaptchaChallengeData(captchaChallenge, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptchaChallengeData)) {
            return false;
        }
        CaptchaChallengeData captchaChallengeData = (CaptchaChallengeData) obj;
        return C19383o.m32792b(this.challenge, captchaChallengeData.challenge) && C19383o.m32792b(this.challengeQueryMap, captchaChallengeData.challengeQueryMap);
    }

    public final Challenge.CaptchaChallenge getChallenge() {
        return this.challenge;
    }

    public final Map<String, String> getChallengeQueryMap() {
        return this.challengeQueryMap;
    }

    public int hashCode() {
        return this.challengeQueryMap.hashCode() + (this.challenge.hashCode() * 31);
    }

    public String toString() {
        Challenge.CaptchaChallenge captchaChallenge = this.challenge;
        Map<String, String> map = this.challengeQueryMap;
        return "CaptchaChallengeData(challenge=" + captchaChallenge + ", challengeQueryMap=" + map + ")";
    }
}
