package com.paypal.android.platform.authsdk.stepup.p535ui;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.user.review.C11709h;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewFragment;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.WebViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.authcommon.utils.UriInspector;
import com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager;
import com.paypal.android.platform.authsdk.stepup.analytics.AnalyticsManager;
import com.paypal.android.platform.authsdk.stepup.analytics.IStepUpTracker;
import com.paypal.android.platform.authsdk.stepup.analytics.StepUpAnalyticsViewModel;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeParam;
import com.paypal.android.platform.authsdk.stepup.p535ui.StepUpEvent;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p628nj.C18263b;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment */
public final class StepUpChallengeFragment extends WebViewFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private StepUpAnalyticsViewModel analyticsViewModel;
    private final C19285c challengeResultLiveData$delegate = C19350d.m32677b(new StepUpChallengeFragment$challengeResultLiveData$2(this));
    private final C19285c urlSecurityManager$delegate = C19350d.m32677b(new StepUpChallengeFragment$urlSecurityManager$2(this));
    private final C19285c viewModel$delegate = C18263b.m30812G(this, C19386q.m32807a(StepUpChallengeViewModel.class), new StepUpChallengeFragment$special$$inlined$viewModels$default$2(new StepUpChallengeFragment$special$$inlined$viewModels$default$1(this)), new StepUpChallengeFragment$viewModel$2(this));

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StepUpChallengeFragment newInstance(Bundle bundle) {
            C19383o.m32797g(bundle, "bundle");
            StepUpChallengeFragment stepUpChallengeFragment = new StepUpChallengeFragment();
            stepUpChallengeFragment.setArguments(bundle);
            return stepUpChallengeFragment;
        }
    }

    private final void addObserver() {
        getViewModel().getResultEvent().observe(this, new C11709h(this, 2));
    }

    /* access modifiers changed from: private */
    /* renamed from: addObserver$lambda-3  reason: not valid java name */
    public static final void m35144addObserver$lambda3(StepUpChallengeFragment stepUpChallengeFragment, Result result) {
        C19383o.m32797g(stepUpChallengeFragment, "this$0");
        if (result instanceof Result.Success) {
            stepUpChallengeFragment.handleStepUpSuccessEvent();
        } else if (result instanceof Result.Failure) {
            Result.Failure failure = (Result.Failure) result;
            ResultError resultError = failure.getResultError();
            if (resultError instanceof ResultError.Unsupported) {
                stepUpChallengeFragment.handleStepUpUnsupportedEvent(failure.getResultError().getReason());
            } else if (resultError instanceof ResultError.Failed) {
                stepUpChallengeFragment.handleStepUpFailureEvent(failure.getResultError().getReason());
            } else if (resultError instanceof ResultError.Cancelled) {
                stepUpChallengeFragment.handleStepUpCancelledEvent(failure.getResultError().getReason(), ((ResultError.Cancelled) failure.getResultError()).getEndFlow());
            }
        } else if (result instanceof Result.UnHandled) {
            stepUpChallengeFragment.handleStepUpUnHandledEvent(((Result.UnHandled) result).getReason());
        }
    }

    /* access modifiers changed from: private */
    public final StepUpChallengeParam getChallengeData(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder(StepUpChallengeFragmentKt.KEY_STEP_UP_CHALLENGE_DATA);
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (StepUpChallengeParam) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeParam");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    private final C2895z<Result> getChallengeResultLiveData() {
        return (C2895z) this.challengeResultLiveData$delegate.getValue();
    }

    private final IStepUpTracker getEventTracker(Bundle bundle) {
        IBinder binder = bundle == null ? null : bundle.getBinder("tracker_object");
        if (binder != null) {
            Object data = ((ObjectWrapperForBinder) binder).getData();
            if (data != null) {
                return (IStepUpTracker) data;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.stepup.analytics.IStepUpTracker");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder");
    }

    private final UrlSecurityManager getUrlSecurityManager() {
        return (UrlSecurityManager) this.urlSecurityManager$delegate.getValue();
    }

    private final StepUpChallengeViewModel getViewModel() {
        return (StepUpChallengeViewModel) this.viewModel$delegate.getValue();
    }

    private final void handleStepUpCancelledEvent(String str, boolean z) {
        if (z) {
            getViewModel().getEvent().postValue(new StepUpEvent.Close());
        } else {
            getViewModel().getEvent().postValue(new StepUpEvent.BackPress());
        }
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Cancelled(str, z)));
    }

    private final void handleStepUpFailureEvent(String str) {
        getViewModel().getEvent().postValue(new StepUpEvent.Failed(str));
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Failed(str)));
    }

    private final void handleStepUpSuccessEvent() {
        getViewModel().getEvent().postValue(new StepUpEvent.Success());
        getChallengeResultLiveData().postValue(new Result.Success());
    }

    private final void handleStepUpUnHandledEvent(Error error) {
        getViewModel().getEvent().postValue(new StepUpEvent.UnHandled(error == null ? null : error.getMessage()));
        getChallengeResultLiveData().postValue(new Result.UnHandled(error, (Object) null, 2, (DefaultConstructorMarker) null));
    }

    private final void handleStepUpUnsupportedEvent(String str) {
        getViewModel().getEvent().postValue(new StepUpEvent.Unsupported(str));
        getChallengeResultLiveData().postValue(new Result.Failure(new ResultError.Unsupported(str)));
    }

    public Map<String, String> getHeaderMap() {
        HashMap hashMap = new HashMap();
        String hEADER_PAYPAL_SECURE_APP_DATA$auth_sdk_thirdPartyRelease = StepUpChallengeUtils.Companion.getHEADER_PAYPAL_SECURE_APP_DATA$auth_sdk_thirdPartyRelease();
        JSONObject jSONObject = new JSONObject();
        Map<String, String> uriChallengeParamMap$auth_sdk_thirdPartyRelease = getViewModel().getUriChallengeParamMap$auth_sdk_thirdPartyRelease();
        ArrayList arrayList = new ArrayList(uriChallengeParamMap$auth_sdk_thirdPartyRelease.size());
        for (Map.Entry next : uriChallengeParamMap$auth_sdk_thirdPartyRelease.entrySet()) {
            arrayList.add(jSONObject.put((String) next.getKey(), next.getValue()));
        }
        C19394m mVar = C19394m.f43287a;
        hashMap.put(hEADER_PAYPAL_SECURE_APP_DATA$auth_sdk_thirdPartyRelease, jSONObject.toString());
        return hashMap;
    }

    public String getUrl() {
        return getViewModel().getUrl$auth_sdk_thirdPartyRelease();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addObserver();
        this.analyticsViewModel = new StepUpAnalyticsViewModel(getViewModel().getEvent(), this, getEventTracker(getArguments()), (AnalyticsManager) null, 8, (DefaultConstructorMarker) null);
        getViewModel().getEvent().postValue(new StepUpEvent.Load());
    }

    public boolean shouldOverrideUrl(WebView webView, String str) {
        C19383o.m32797g(webView, "view");
        C19383o.m32797g(str, "url");
        if (!getUrlSecurityManager().isUrlAllowedForLoading$auth_sdk_thirdPartyRelease(str)) {
            return false;
        }
        UriInspector uriInspector = new UriInspector(Uri.parse(str));
        if (!uriInspector.containsPath$auth_sdk_thirdPartyRelease(getViewModel().getChallengeUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI))) {
            return false;
        }
        String paramValue$auth_sdk_thirdPartyRelease = uriInspector.getParamValue$auth_sdk_thirdPartyRelease(getViewModel().getChallengeUriParamValue$auth_sdk_thirdPartyRelease(UriChallengeConstantKt.RETURN_URI_PARAMS));
        if (!TextUtils.isEmpty(paramValue$auth_sdk_thirdPartyRelease)) {
            getViewModel().getResultEvent().postValue(new Result.Failure(new ResultError.Failed(paramValue$auth_sdk_thirdPartyRelease)));
            return true;
        }
        getViewModel().getResultEvent().postValue(new Result.Success());
        return true;
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
    public WebViewModel m35145getViewModel() {
        return getViewModel();
    }
}
