package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeViewModel */
public final class CaptchaChallengeViewModel extends WebViewModel {
    private final CaptchaChallengeData captchaChallengeData;

    public CaptchaChallengeViewModel(CaptchaChallengeData captchaChallengeData2) {
        C19383o.m32797g(captchaChallengeData2, "captchaChallengeData");
        this.captchaChallengeData = captchaChallengeData2;
    }

    public final String getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(String str) {
        C19383o.m32797g(str, "key");
        return getUriChallengeParamMap$auth_sdk_thirdPartyRelease().get(str);
    }

    public final Map<String, String> getUriChallengeParamMap$auth_sdk_thirdPartyRelease() {
        return this.captchaChallengeData.getCaptchaChallengeParams();
    }

    public final String getUrl$auth_sdk_thirdPartyRelease() {
        CaptchaChallengeUtils.Companion companion = CaptchaChallengeUtils.Companion;
        return companion.buildUrlWithQueryString$auth_sdk_thirdPartyRelease(getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.CHALLENGE_URI), companion.toQueryString$auth_sdk_thirdPartyRelease(this.captchaChallengeData.getCaptchaChallengeParams()));
    }
}
