package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResultData;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriInspector;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeFragment */
public final class CaptchaChallengeFragment extends WebViewFragment {
    private final C19285c challenge$delegate = C19350d.m32677b(new CaptchaChallengeFragment$challenge$2(this));
    private final C19285c challengeResultLiveData$delegate = C19350d.m32677b(new CaptchaChallengeFragment$challengeResultLiveData$2(this));
    private final C19285c urlSecurityManager$delegate = C19350d.m32677b(new CaptchaChallengeFragment$urlSecurityManager$2(this));
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(CaptchaChallengeViewModel.class), new CaptchaChallengeFragment$special$$inlined$activityViewModels$1(this), new CaptchaChallengeFragment$viewModel$2(this));

    /* access modifiers changed from: private */
    public final CaptchaChallenge getCaptchaChallengeData(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder(CaptchaChallengeFragmentKt.KEY_CAPTCHA_CHALLENGE_FIRST_PARTY);
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (CaptchaChallenge) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallenge");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    private final C2895z<ChallengeResult> getChallengeResultLiveData() {
        return (C2895z) this.challengeResultLiveData$delegate.getValue();
    }

    private final UrlSecurityManager getUrlSecurityManager() {
        return (UrlSecurityManager) this.urlSecurityManager$delegate.getValue();
    }

    private final CaptchaChallengeViewModel getViewModel() {
        return (CaptchaChallengeViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleCaptchaFailureEvent(String str) {
        C19857l<Object, ChallengeResult> retryCallBack = getChallenge().getRetryCallBack();
        if (retryCallBack != null) {
            retryCallBack.invoke(new ChallengeResult.Failed(getChallenge().getRequestId(), new ChallengeError.Failure(new Error(str))));
        } else if (getChallenge().getRetryCallBack() == null) {
            getChallengeResultLiveData().postValue(new ChallengeResult.Failed(getChallenge().getRequestId(), new ChallengeError.Failure(new Error(str))));
        }
    }

    private final void handleCaptchaSuccessEvent() {
        C19857l<Object, ChallengeResult> retryCallBack = getChallenge().getRetryCallBack();
        if (retryCallBack != null) {
            retryCallBack.invoke(new ChallengeResult.Completed(getChallenge().getRequestId(), new ChallengeResultData((String) null, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)));
        } else if (getChallenge().getRetryCallBack() == null) {
            getChallengeResultLiveData().postValue(new ChallengeResult.Completed(getChallenge().getRequestId(), new ChallengeResultData((String) null, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null)));
        }
    }

    public final CaptchaChallenge getChallenge() {
        return (CaptchaChallenge) this.challenge$delegate.getValue();
    }

    public Map<String, String> getHeaderMap() {
        return null;
    }

    public String getUrl() {
        return getViewModel().getUrl$auth_sdk_thirdPartyRelease();
    }

    public boolean shouldOverrideUrl(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        if (getUrlSecurityManager().isUrlAllowedForLoading$auth_sdk_thirdPartyRelease(str)) {
            UriInspector uriInspector = new UriInspector(Uri.parse(str));
            if (uriInspector.containsPath$auth_sdk_thirdPartyRelease(getViewModel().getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI))) {
                String paramValue$auth_sdk_thirdPartyRelease = uriInspector.getParamValue$auth_sdk_thirdPartyRelease(getViewModel().getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI_PARAMS));
                if (!TextUtils.isEmpty(paramValue$auth_sdk_thirdPartyRelease)) {
                    C19383o.m32794d(paramValue$auth_sdk_thirdPartyRelease);
                    handleCaptchaFailureEvent(paramValue$auth_sdk_thirdPartyRelease);
                    return true;
                }
                handleCaptchaSuccessEvent();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final C2895z<ChallengeResult> getChallengeResultLiveData(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("result_live_data");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (C2895z) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.paypal.android.platform.authsdk.authcommon.ChallengeResult>");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    /* renamed from: getViewModel  reason: collision with other method in class */
    public WebViewModel m35127getViewModel() {
        return getViewModel();
    }
}
