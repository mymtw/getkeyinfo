package com.paypal.android.platform.authsdk.captcha.p532ui.firstParty;

import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2895z;
import com.appboy.Constants;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResultData;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import okhttp3.C20018z;
import p753kq.C19857l;
import p768rq.C20153b;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler */
public final class CaptchaChallengeHandler implements ChallengeHandler {
    private final String TAG = "CaptchaChallengeHandler";
    private final AuthCoreComponent authCoreComponent;
    private final C19525d0 scope;

    public CaptchaChallengeHandler(AuthCoreComponent authCoreComponent2) {
        C19383o.m32797g(authCoreComponent2, ConstantsKt.AUTH_CORE_COMPONENT);
        this.authCoreComponent = authCoreComponent2;
        authCoreComponent2.getChallengeRegistry().registerChallengeHandler(ChallengeType.Captcha, this);
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.scope = C19697g.m33463a(l.plus(C19729m.f43681a));
    }

    private final Map<String, String> buildQueryParamMap(AuthCoreComponent authCoreComponent2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String guid = authCoreComponent2.getClientConfig().getGuid();
        linkedHashMap.put(Constants.APPBOY_PUSH_PRIORITY_KEY, "auth-" + guid);
        linkedHashMap.put("source", authCoreComponent2.getClientConfig().getAppInfo().getName());
        CaptchaChallengeUtils.Companion companion = CaptchaChallengeUtils.Companion;
        linkedHashMap.put("country.x", companion.getCountryCode$auth_sdk_thirdPartyRelease(authCoreComponent2));
        linkedHashMap.put("locale.x", companion.getLocale$auth_sdk_thirdPartyRelease(authCoreComponent2));
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object observeChallengeResult(androidx.lifecycle.C2895z<com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result> r5, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$1 r0 = (com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$1 r0 = new com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$1
            androidx.lifecycle.z r5 = (androidx.lifecycle.C2895z) r5
            java.lang.Object r5 = r0.L$0
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler r5 = (com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0061
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            r0.L$0 = r4     // Catch:{ Exception -> 0x0064 }
            r0.L$1 = r5     // Catch:{ Exception -> 0x0064 }
            r0.label = r3     // Catch:{ Exception -> 0x0064 }
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l     // Catch:{ Exception -> 0x0064 }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ Exception -> 0x0064 }
            r6.<init>(r3, r0)     // Catch:{ Exception -> 0x0064 }
            r6.mo72548n()     // Catch:{ Exception -> 0x0064 }
            kotlinx.coroutines.d0 r0 = r4.getScope()     // Catch:{ Exception -> 0x0064 }
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$result$1$1 r2 = new com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$observeChallengeResult$result$1$1     // Catch:{ Exception -> 0x0064 }
            r3 = 0
            r2.<init>(r5, r6, r3)     // Catch:{ Exception -> 0x0064 }
            r5 = 3
            kotlinx.coroutines.C19697g.m33468f(r0, r3, r3, r2, r5)     // Catch:{ Exception -> 0x0064 }
            java.lang.Object r6 = r6.mo72547l()     // Catch:{ Exception -> 0x0064 }
            if (r6 != r1) goto L_0x0061
            return r1
        L_0x0061:
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result r6 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result) r6     // Catch:{ Exception -> 0x0064 }
            return r6
        L_0x0064:
            r5 = move-exception
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$Failure r6 = new com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$Failure
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Failed r0 = new com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Failed
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler.observeChallengeResult(androidx.lifecycle.z, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object proceedCaptchaChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge r5, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler$proceedCaptchaChallenge$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$proceedCaptchaChallenge$1 r0 = (com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler$proceedCaptchaChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$proceedCaptchaChallenge$1 r0 = new com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler$proceedCaptchaChallenge$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r5 = r0.L$1
            com.paypal.android.platform.authsdk.authcommon.Challenge r5 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r5
            java.lang.Object r0 = r0.L$0
            com.paypal.android.platform.authsdk.captcha.ui.firstParty.CaptchaChallengeHandler r0 = (com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            androidx.lifecycle.z r6 = new androidx.lifecycle.z
            r6.<init>()
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.observeChallengeResult(r6, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r4
        L_0x004d:
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result r6 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result) r6
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r5 = r0.toChallengeResult(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.captcha.p532ui.firstParty.CaptchaChallengeHandler.proceedCaptchaChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    private final ChallengeResult toChallengeResult(Challenge challenge, Result result) {
        ChallengeResult.Failed failed;
        if (result instanceof Result.Success) {
            return new ChallengeResult.Completed(challenge.getRequestId(), new ChallengeResultData("", (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null));
        }
        if (result instanceof Result.Failure) {
            Result.Failure failure = (Result.Failure) result;
            ResultError resultError = failure.getResultError();
            if (resultError instanceof ResultError.Failed) {
                failed = new ChallengeResult.Failed(challenge.getRequestId(), new ChallengeError.Failure(new Error(failure.getResultError().getReason())));
            } else if (resultError instanceof ResultError.Unsupported) {
                failed = new ChallengeResult.Failed(challenge.getRequestId(), new ChallengeError.Unsupported(new Error(failure.getResultError().getReason())));
            } else if (resultError instanceof ResultError.Cancelled) {
                failed = !((ResultError.Cancelled) failure.getResultError()).getEndFlow() ? new ChallengeResult.Failed(challenge.getRequestId(), new ChallengeError.Cancelled(new Error(failure.getResultError().getReason(), new Throwable(ConstantsKt.BACK_PRESS)))) : new ChallengeResult.Failed(challenge.getRequestId(), new ChallengeError.Cancelled(new Error(failure.getResultError().getReason(), new Throwable(ConstantsKt.CLOSE))));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return failed;
        } else if (result instanceof Result.UnHandled) {
            Result.UnHandled unHandled = (Result.UnHandled) result;
            return new ChallengeResult.UnHandled(challenge, (String) null, (ChallengeType) null, (String) null, (C20018z) null, unHandled.getData(), unHandled.getReason(), (C19857l) null, 158, (DefaultConstructorMarker) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final C19525d0 getScope() {
        return this.scope;
    }

    public Object handleChallenge(Challenge challenge, C19340c<? super ChallengeResult> cVar) {
        return proceedCaptchaChallenge(challenge, cVar);
    }

    public void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(challenge, "challenge");
        C19383o.m32797g(hostNavigationController, "hostNavigationController");
        C19383o.m32797g(zVar, "challengeResultLiveData");
        if (challenge.getRetryCallBack() == null) {
            zVar.postValue(new ChallengeResult.Failed(challenge.getRequestId(), new ChallengeError.Cancelled(new Error("Retry operation missing to verify credential again after captcha"))));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(CaptchaChallengeFragmentKt.KEY_CAPTCHA_CHALLENGE_FIRST_PARTY, new ObjectWrapperForBinder(challenge));
        bundle.putBinder("result_live_data", new ObjectWrapperForBinder(zVar));
        hostNavigationController.navigate(C19386q.m32807a(CaptchaChallengeFragment.class), bundle);
    }
}
