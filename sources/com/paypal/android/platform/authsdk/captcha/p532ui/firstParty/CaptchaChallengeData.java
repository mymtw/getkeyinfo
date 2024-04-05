package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

@Keep
/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeData */
public final class CaptchaChallengeData {
    private final Map<String, String> captchaChallengeParams;
    private final String url;

    public CaptchaChallengeData(String str, Map<String, String> map) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "captchaChallengeParams");
        this.url = str;
        this.captchaChallengeParams = map;
    }

    public static /* synthetic */ CaptchaChallengeData copy$default(CaptchaChallengeData captchaChallengeData, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captchaChallengeData.url;
        }
        if ((i & 2) != 0) {
            map = captchaChallengeData.captchaChallengeParams;
        }
        return captchaChallengeData.copy(str, map);
    }

    public final String component1() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.captchaChallengeParams;
    }

    public final CaptchaChallengeData copy(String str, Map<String, String> map) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(map, "captchaChallengeParams");
        return new CaptchaChallengeData(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptchaChallengeData)) {
            return false;
        }
        CaptchaChallengeData captchaChallengeData = (CaptchaChallengeData) obj;
        return C19383o.m32792b(this.url, captchaChallengeData.url) && C19383o.m32792b(this.captchaChallengeParams, captchaChallengeData.captchaChallengeParams);
    }

    public final Map<String, String> getCaptchaChallengeParams() {
        return this.captchaChallengeParams;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.captchaChallengeParams.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        String str = this.url;
        Map<String, String> map = this.captchaChallengeParams;
        return "CaptchaChallengeData(url=" + str + ", captchaChallengeParams=" + map + ")";
    }
}
