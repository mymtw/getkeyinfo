package com.paypal.android.platform.authsdk.captcha.p532ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.C2895z;
import com.etsy.android.feedback.C6456a;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriInspector;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import com.paypal.android.platform.authsdk.captcha.analytics.CaptchaAnalyticsManager;
import com.paypal.android.platform.authsdk.captcha.analytics.CaptchaAnalyticsViewModel;
import com.paypal.android.platform.authsdk.captcha.analytics.ICaptchaTracker;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaChallengeData;
import com.paypal.android.platform.authsdk.captcha.p532ui.CaptchaEvent;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeFragment */
public final class CaptchaChallengeFragment extends WebViewFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private CaptchaAnalyticsViewModel analyticsViewModel;
    private final C19285c challengeResultLiveData$delegate = C19350d.m32677b(new CaptchaChallengeFragment$challengeResultLiveData$2(this));
    private boolean completionState;
    private final C19285c urlSecurityManager$delegate = C19350d.m32677b(new CaptchaChallengeFragment$urlSecurityManager$2(this));
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(CaptchaChallengeViewModel.class), new CaptchaChallengeFragment$special$$inlined$viewModels$default$2(new CaptchaChallengeFragment$special$$inlined$viewModels$default$1(this)), new CaptchaChallengeFragment$viewModel$2(this));

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaChallengeFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CaptchaChallengeFragment newInstance(Bundle bundle) {
            C19383o.m32797g(bundle, "bundle");
            CaptchaChallengeFragment captchaChallengeFragment = new CaptchaChallengeFragment();
            captchaChallengeFragment.setArguments(bundle);
            return captchaChallengeFragment;
        }
    }

    private final void addObserver() {
        getViewModel().getResultEvent().observe(this, new C6456a(this, 6));
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver$lambda-0  reason: not valid java name */
    public static final void m35125addObserver$lambda0(CaptchaChallengeFragment captchaChallengeFragment, Result result) {
        C19383o.m32797g(captchaChallengeFragment, "this$0");
        if (result instanceof Result.Success) {
            captchaChallengeFragment.handleCaptchaSuccessEvent();
        } else if (result instanceof Result.Failure) {
            Result.Failure failure = (Result.Failure) result;
            ResultError resultError = failure.getResultError();
            if (resultError instanceof ResultError.Unsupported) {
                captchaChallengeFragment.handleCaptchaUnsupportedEvent(failure.getResultError().getReason());
            } else if (resultError instanceof ResultError.Failed) {
                captchaChallengeFragment.handleCaptchaFailureEvent(failure.getResultError().getReason());
            } else if (resultError instanceof ResultError.Cancelled) {
                captchaChallengeFragment.handleCaptchaCancelledEvent(failure.getResultError().getReason(), ((ResultError.Cancelled) failure.getResultError()).getEndFlow());
            }
        } else if (result instanceof Result.UnHandled) {
            captchaChallengeFragment.handleCaptchaUnHandledEvent(((Result.UnHandled) result).getReason());
        }
    }

    /* access modifiers changed from: private */
    public final CaptchaChallengeData getCaptchaChallengeData(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("captcha_challenge_data");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (CaptchaChallengeData) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.captcha.domain.CaptchaChallengeData");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    private final C2895z<Result> getChallengeResultLiveData() {
        return (C2895z) this.challengeResultLiveData$delegate.getValue();
    }

    private final ICaptchaTracker getEventTracker(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("tracker_object");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (ICaptchaTracker) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.captcha.analytics.ICaptchaTracker");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    private final UrlSecurityManager getUrlSecurityManager() {
        return (UrlSecurityManager) this.urlSecurityManager$delegate.getValue();
    }

    private final CaptchaChallengeViewModel getViewModel() {
        return (CaptchaChallengeViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleCaptchaCancelledEvent(String str, boolean z) {
        if (z) {
            getViewModel().getEvent().postValue(new CaptchaEvent.Close());
        } else {
            getViewModel().getEvent().postValue(new CaptchaEvent.BackPress());
        }
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Cancelled(str, z)));
    }

    private final void handleCaptchaFailureEvent(String str) {
        getViewModel().getEvent().postValue(new CaptchaEvent.Failed(str));
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Failed(str)));
    }

    private final void handleCaptchaSuccessEvent() {
        getViewModel().getEvent().postValue(new CaptchaEvent.Success());
        getChallengeResultLiveData().postValue(new Result.Success());
    }

    private final void handleCaptchaUnHandledEvent(Error error) {
        getViewModel().getEvent().postValue(new CaptchaEvent.UnHandled(error == null ? null : error.getMessage()));
        getChallengeResultLiveData().postValue(new Result.UnHandled(error, (Object) null, 2, (DefaultConstructorMarker) null));
    }

    private final void handleCaptchaUnsupportedEvent(String str) {
        getViewModel().getEvent().postValue(new CaptchaEvent.Unsupported(str));
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Unsupported(str)));
    }

    public final boolean getCompletionState() {
        return this.completionState;
    }

    public Map<String, String> getHeaderMap() {
        return null;
    }

    public String getUrl() {
        return getViewModel().getUrl$auth_sdk_thirdPartyRelease();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addObserver();
        this.analyticsViewModel = new CaptchaAnalyticsViewModel(getViewModel().getEvent(), this, getEventTracker(getArguments()), (CaptchaAnalyticsManager) null, 8, (DefaultConstructorMarker) null);
        getViewModel().getEvent().postValue(new CaptchaEvent.Load());
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.completionState) {
            handleCaptchaCancelledEvent(ConstantsKt.BACK_PRESS, false);
        }
    }

    public final void setCompletionState(boolean z) {
        this.completionState = z;
    }

    public boolean shouldOverrideUrl(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        boolean z = false;
        if (getUrlSecurityManager().isUrlAllowedForLoading$auth_sdk_thirdPartyRelease(str)) {
            UriInspector uriInspector = new UriInspector(Uri.parse(str));
            if (uriInspector.containsPath$auth_sdk_thirdPartyRelease(getViewModel().getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI))) {
                String paramValue$auth_sdk_thirdPartyRelease = uriInspector.getParamValue$auth_sdk_thirdPartyRelease(getViewModel().getCaptchaUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI_PARAMS));
                z = true;
                if (!TextUtils.isEmpty(paramValue$auth_sdk_thirdPartyRelease)) {
                    this.completionState = true;
                    getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Failed(paramValue$auth_sdk_thirdPartyRelease)));
                } else {
                    this.completionState = true;
                    getViewModel().getResultEvent().postValue(new Result.Success());
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final C2895z<Result> getChallengeResultLiveData(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("result_live_data");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (C2895z) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.paypal.android.platform.authsdk.authcommon.ui.webview.Result>");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    /* renamed from: getViewModel  reason: collision with other method in class */
    public WebViewModel m35126getViewModel() {
        return getViewModel();
    }
}
