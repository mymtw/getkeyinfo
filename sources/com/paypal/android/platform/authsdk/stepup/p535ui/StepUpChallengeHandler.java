package com.paypal.android.platform.authsdk.stepup.p535ui;

import android.os.Bundle;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder;
import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.p531ui.NavigationController;
import com.paypal.android.platform.authsdk.authcommon.p531ui.PartnerHostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result;
import com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeParam;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p768rq.C20153b;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler */
public final class StepUpChallengeHandler implements ChallengeHandler {
    private final String TAG = "StepUpChallengeHandler";
    private final AuthCoreComponent authCoreComponent;
    private final NavigationController navigationController;
    private final C19525d0 scope;
    /* access modifiers changed from: private */
    public final ITracker tracker;

    public StepUpChallengeHandler(AuthCoreComponent authCoreComponent2, NavigationController navigationController2, ITracker iTracker) {
        C19383o.m32797g(authCoreComponent2, ConstantsKt.AUTH_CORE_COMPONENT);
        this.authCoreComponent = authCoreComponent2;
        this.navigationController = navigationController2;
        this.tracker = iTracker;
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.scope = C19697g.m33463a(l.plus(C19729m.f43681a));
    }

    private final Map<String, String> buildQueryParamMap(AuthCoreComponent authCoreComponent2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StepUpChallengeUtils.Companion companion = StepUpChallengeUtils.Companion;
        linkedHashMap.put("country.x", companion.getCountryCode$auth_sdk_thirdPartyRelease(authCoreComponent2));
        linkedHashMap.put("locale.x", companion.getLocale$auth_sdk_thirdPartyRelease(authCoreComponent2));
        return linkedHashMap;
    }

    private final void dismissFragment(Result result, StepUpChallengeFragment stepUpChallengeFragment, PartnerHostNavigationController partnerHostNavigationController) {
        if (result instanceof Result.Failure) {
            Result.Failure failure = (Result.Failure) result;
            if (failure.getResultError() instanceof ResultError.Cancelled) {
                partnerHostNavigationController.dismiss(stepUpChallengeFragment, ((ResultError.Cancelled) failure.getResultError()).getEndFlow());
                return;
            }
        }
        partnerHostNavigationController.dismiss(stepUpChallengeFragment, false);
    }

    private final StepUpChallengeFragment getStepUpChallengeFragment(Challenge challenge, C2895z<Result> zVar) {
        Bundle bundle = new Bundle();
        bundle.putBinder(StepUpChallengeFragmentKt.KEY_STEP_UP_CHALLENGE_DATA, new ObjectWrapperForBinder(new StepUpChallengeParam((Challenge.StepUpChallenge) challenge, buildQueryParamMap(this.authCoreComponent))));
        bundle.putBinder("result_live_data", new ObjectWrapperForBinder(zVar));
        bundle.putBinder("tracker_object", new ObjectWrapperForBinder(new StepUpChallengeHandler$getStepUpChallengeFragment$bundle$1$1(this)));
        return StepUpChallengeFragment.Companion.newInstance(bundle);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object observeChallengeResult(androidx.lifecycle.C2895z<com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result> r5, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler$observeChallengeResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$observeChallengeResult$1 r0 = (com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler$observeChallengeResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$observeChallengeResult$1 r0 = new com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$observeChallengeResult$1
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
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler r5 = (com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler) r5
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
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$observeChallengeResult$result$1$1 r2 = new com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$observeChallengeResult$result$1$1     // Catch:{ Exception -> 0x0064 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler.observeChallengeResult(androidx.lifecycle.z, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object proceedStepUpChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge r6, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler$proceedStepUpChallenge$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$proceedStepUpChallenge$1 r0 = (com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler$proceedStepUpChallenge$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$proceedStepUpChallenge$1 r0 = new com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$proceedStepUpChallenge$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.L$2
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment r6 = (com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeFragment) r6
            java.lang.Object r1 = r0.L$1
            com.paypal.android.platform.authsdk.authcommon.Challenge r1 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r1
            java.lang.Object r0 = r0.L$0
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler r0 = (com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0066
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.android.platform.authsdk.authcommon.ui.NavigationController r7 = r5.navigationController
            boolean r7 = r7 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.PartnerHostNavigationController
            if (r7 == 0) goto L_0x0074
            androidx.lifecycle.z r7 = new androidx.lifecycle.z
            r7.<init>()
            com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeFragment r2 = r5.getStepUpChallengeFragment(r6, r7)
            com.paypal.android.platform.authsdk.authcommon.ui.NavigationController r4 = r5.navigationController
            com.paypal.android.platform.authsdk.authcommon.ui.PartnerHostNavigationController r4 = (com.paypal.android.platform.authsdk.authcommon.p531ui.PartnerHostNavigationController) r4
            r4.navigate(r2, r3)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = r5.observeChallengeResult(r7, r0)
            if (r7 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r5
            r1 = r6
            r6 = r2
        L_0x0066:
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result r7 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result) r7
            com.paypal.android.platform.authsdk.authcommon.ui.NavigationController r2 = r0.navigationController
            com.paypal.android.platform.authsdk.authcommon.ui.PartnerHostNavigationController r2 = (com.paypal.android.platform.authsdk.authcommon.p531ui.PartnerHostNavigationController) r2
            r0.dismissFragment(r7, r6, r2)
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r6 = r0.toChallengeResult(r1, r7)
            return r6
        L_0x0074:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r7 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r6 = r6.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported
            java.lang.Error r1 = new java.lang.Error
            r1.<init>()
            r0.<init>(r1)
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler.proceedStepUpChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.paypal.android.platform.authsdk.authcommon.ChallengeResult toChallengeResult(com.paypal.android.platform.authsdk.authcommon.Challenge r13, com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result.Success
            if (r0 == 0) goto L_0x002a
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed r14 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Completed
            java.lang.String r0 = r13.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeResultData r8 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResultData
            com.paypal.android.platform.authsdk.authcommon.Challenge$StepUpChallenge r13 = (com.paypal.android.platform.authsdk.authcommon.Challenge.StepUpChallenge) r13
            java.util.Map r13 = r13.getChallengeParamMap()
            java.lang.String r1 = "accessToken"
            java.lang.Object r13 = r13.get(r1)
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.<init>(r0, r8)
            goto L_0x00ed
        L_0x002a:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result.Failure
            if (r0 == 0) goto L_0x00d2
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$Failure r14 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result.Failure) r14
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r0 = r14.getResultError()
            boolean r1 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError.Failed
            if (r1 == 0) goto L_0x0055
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r13 = r13.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure
            java.lang.Error r2 = new java.lang.Error
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r14 = r14.getResultError()
            java.lang.String r14 = r14.getReason()
            r2.<init>(r14)
            r1.<init>(r2)
            r0.<init>(r13, r1)
            goto L_0x00ec
        L_0x0055:
            boolean r1 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError.Unsupported
            if (r1 == 0) goto L_0x0076
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r13 = r13.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Unsupported
            java.lang.Error r2 = new java.lang.Error
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r14 = r14.getResultError()
            java.lang.String r14 = r14.getReason()
            r2.<init>(r14)
            r1.<init>(r2)
            r0.<init>(r13, r1)
            goto L_0x00ec
        L_0x0076:
            boolean r0 = r0 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError.Cancelled
            if (r0 == 0) goto L_0x00cc
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r0 = r14.getResultError()
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Cancelled r0 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.ResultError.Cancelled) r0
            boolean r0 = r0.getEndFlow()
            if (r0 != 0) goto L_0x00a9
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r13 = r13.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Cancelled r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Cancelled
            java.lang.Error r2 = new java.lang.Error
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r14 = r14.getResultError()
            java.lang.String r14 = r14.getReason()
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r4 = "backpress"
            r3.<init>(r4)
            r2.<init>(r14, r3)
            r1.<init>(r2)
            r0.<init>(r13, r1)
            goto L_0x00ec
        L_0x00a9:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r13 = r13.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Cancelled r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Cancelled
            java.lang.Error r2 = new java.lang.Error
            com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError r14 = r14.getResultError()
            java.lang.String r14 = r14.getReason()
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r4 = "close"
            r3.<init>(r4)
            r2.<init>(r14, r3)
            r1.<init>(r2)
            r0.<init>(r13, r1)
            goto L_0x00ec
        L_0x00cc:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x00d2:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result.UnHandled
            if (r0 == 0) goto L_0x00ee
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled r0 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$UnHandled
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$UnHandled r14 = (com.paypal.android.platform.authsdk.authcommon.p531ui.webview.Result.UnHandled) r14
            java.lang.Error r8 = r14.getReason()
            r9 = 0
            r10 = 190(0xbe, float:2.66E-43)
            r11 = 0
            r1 = r0
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00ec:
            r14 = r0
        L_0x00ed:
            return r14
        L_0x00ee:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler.toChallengeResult(com.paypal.android.platform.authsdk.authcommon.Challenge, com.paypal.android.platform.authsdk.authcommon.ui.webview.Result):com.paypal.android.platform.authsdk.authcommon.ChallengeResult");
    }

    public final C19525d0 getScope() {
        return this.scope;
    }

    public Object handleChallenge(Challenge challenge, C19340c<? super ChallengeResult> cVar) {
        return proceedStepUpChallenge(challenge, cVar);
    }

    public void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(challenge, "challenge");
        C19383o.m32797g(hostNavigationController, "hostNavigationController");
        C19383o.m32797g(zVar, "challengeResultLiveData");
    }
}
