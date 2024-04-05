package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallenge */
public final class CaptchaChallenge extends Challenge {
    private final CaptchaChallengeData captchaChallengeData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaChallenge(String str, C19857l<Object, ? extends ChallengeResult> lVar, CaptchaChallengeData captchaChallengeData2) {
        super(str, ChallengeType.Captcha, lVar);
        C19383o.m32797g(str, "requestId");
        C19383o.m32797g(captchaChallengeData2, "captchaChallengeData");
        this.captchaChallengeData = captchaChallengeData2;
    }

    public final CaptchaChallengeData getCaptchaChallengeData() {
        return this.captchaChallengeData;
    }
}
