package com.paypal.android.platform.authsdk.stepup.p535ui;

import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeParam;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeViewModel */
public final class StepUpChallengeViewModel extends WebViewModel {
    private final StepUpChallengeParam challengeData;
    private final C2895z<StepUpEvent> event = new C2895z<>();

    public StepUpChallengeViewModel(StepUpChallengeParam stepUpChallengeParam) {
        C19383o.m32797g(stepUpChallengeParam, "challengeData");
        this.challengeData = stepUpChallengeParam;
    }

    public final String getChallengeUriParamValue$auth_sdk_thirdPartyRelease(String str) {
        C19383o.m32797g(str, "key");
        return getUriChallengeParamMap$auth_sdk_thirdPartyRelease().get(str);
    }

    public final C2895z<StepUpEvent> getEvent() {
        return this.event;
    }

    public final Map<String, String> getUriChallengeParamMap$auth_sdk_thirdPartyRelease() {
        return this.challengeData.getChallenge().getChallengeParamMap();
    }

    public final String getUrl$auth_sdk_thirdPartyRelease() {
        StepUpChallengeUtils.Companion companion = StepUpChallengeUtils.Companion;
        return companion.buildUrlWithQueryString$auth_sdk_thirdPartyRelease(getChallengeUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.CHALLENGE_URI), companion.toQueryString$auth_sdk_thirdPartyRelease(this.challengeData.getChallengeQueryMap()));
    }
}
