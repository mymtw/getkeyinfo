package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.content.Context;
import android.util.Patterns;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeHandler;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.ChallengeType;
import com.paypal.android.platform.authsdk.authcommon.CleanUp;
import com.paypal.android.platform.authsdk.authcommon.analytics.ITracker;
import com.paypal.android.platform.authsdk.authcommon.network.utils.ApiUtilsKt;
import com.paypal.android.platform.authsdk.authcommon.p531ui.HostNavigationController;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaUriData;
import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.splitlogin.data.api.SplitLoginApiService;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRepository;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeData;
import com.paypal.platform.authsdk.AuthProviders;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19729m;
import p716xo.C18829b;
import p732zo.C18973a;
import p768rq.C20153b;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler */
public final class SplitLoginHandler implements ChallengeHandler, C18829b {
    private final String TAG = "SplitLoginHandler";
    /* access modifiers changed from: private */
    public final AuthCoreComponent authCoreComponent;
    /* access modifiers changed from: private */
    public final AuthProviders authProviders;
    private final Context context;
    /* access modifiers changed from: private */
    public final ITracker iTracker;
    private final C19525d0 scope;
    private final C18973a tokenState;

    public SplitLoginHandler(Context context2, AuthCoreComponent authCoreComponent2, AuthProviders authProviders2, ITracker iTracker2) {
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(authCoreComponent2, ConstantsKt.AUTH_CORE_COMPONENT);
        C19383o.m32797g(authProviders2, "authProviders");
        C19383o.m32797g(iTracker2, "iTracker");
        this.context = context2;
        this.authCoreComponent = authCoreComponent2;
        this.authProviders = authProviders2;
        this.iTracker = iTracker2;
        authCoreComponent2.getChallengeRegistry().registerChallengeHandler(ChallengeType.SplitLogin, this);
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.scope = C19697g.m33463a(l.plus(C19729m.f43681a));
        this.tokenState = new C18973a(context2);
    }

    /* access modifiers changed from: private */
    public final void callVerifyCredential(SplitLoginRepository splitLoginRepository, String str, C2895z<ChallengeResult> zVar, Challenge challenge) {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new SplitLoginHandler$callVerifyCredential$1(this, str, zVar, challenge, splitLoginRepository, (C19340c<? super SplitLoginHandler$callVerifyCredential$1>) null), 3);
    }

    private final SplitLoginRepositoryImpl generateSplitLoginRepository(AuthCoreComponent authCoreComponent2, SplitLoginRequest splitLoginRequest) {
        return new SplitLoginRepositoryImpl((SplitLoginApiService) ApiUtilsKt.getAuthApi(authCoreComponent2, SplitLoginApiService.class), splitLoginRequest, (CoroutineDispatcher) null, 4, (DefaultConstructorMarker) null);
    }

    private final CleanUp getCleanupHandler(C2895z<ChallengeResult> zVar, String str) {
        return new SplitLoginHandler$getCleanupHandler$1(zVar, str);
    }

    /* access modifiers changed from: private */
    public final boolean isValidEmail(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    /* access modifiers changed from: private */
    public final void onHandleCaptcha(CaptchaUriData captchaUriData, SplitLoginRepository splitLoginRepository, String str, C2895z<ChallengeResult> zVar, Challenge challenge) {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new SplitLoginHandler$onHandleCaptcha$1(challenge, captchaUriData, this, splitLoginRepository, str, zVar, (C19340c<? super SplitLoginHandler$onHandleCaptcha$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void onHandleStepUp(StepUpChallengeData stepUpChallengeData, SplitLoginRepository splitLoginRepository, String str, C2895z<ChallengeResult> zVar, Challenge challenge) {
        C19697g.m33468f(this.scope, (CoroutineContext) null, (CoroutineStart) null, new SplitLoginHandler$onHandleStepUp$1(challenge, stepUpChallengeData, this, splitLoginRepository, str, zVar, (C19340c<? super SplitLoginHandler$onHandleStepUp$1>) null), 3);
    }

    private final Error toError(Throwable th) {
        return new Error(th);
    }

    public AuthCoreComponent getAuthCoreComponent() {
        return this.authCoreComponent;
    }

    public AuthProviders getAuthProviders() {
        return this.authProviders;
    }

    public final Context getContext() {
        return this.context;
    }

    public final C19525d0 getScope() {
        return this.scope;
    }

    public final C18973a getTokenState() {
        return this.tokenState;
    }

    public ITracker getTracker() {
        return this.iTracker;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e A[Catch:{ Exception -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge r19, kotlin.coroutines.C19340c<? super com.paypal.android.platform.authsdk.authcommon.ChallengeResult> r20) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r0 = r20
            boolean r1 = r0 instanceof com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler$handleChallenge$1
            if (r1 == 0) goto L_0x0019
            r1 = r0
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$1 r1 = (com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler$handleChallenge$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0019
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001e
        L_0x0019:
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$1 r1 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$1
            r1.<init>(r7, r0)
        L_0x001e:
            r0 = r1
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r10 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 != r10) goto L_0x0043
            java.lang.Object r2 = r0.L$3
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment r2 = (com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginFragment) r2
            java.lang.Object r3 = r0.L$2
            androidx.lifecycle.z r3 = (androidx.lifecycle.C2895z) r3
            java.lang.Object r3 = r0.L$1
            com.paypal.android.platform.authsdk.authcommon.Challenge r3 = (com.paypal.android.platform.authsdk.authcommon.Challenge) r3
            java.lang.Object r0 = r0.L$0
            r4 = r0
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler r4 = (com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0114
        L_0x0040:
            r0 = move-exception
            goto L_0x0128
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            java.lang.String r1 = r7.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleChallenge "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
            com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent r1 = r7.authCoreComponent
            com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest r2 = new com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest
            com.paypal.android.platform.authsdk.authcommon.model.ClientConfig r12 = r1.getClientConfig()
            r13 = 0
            com.paypal.android.platform.authsdk.authcommon.AuthCoreComponent r3 = r7.authCoreComponent
            com.paypal.android.platform.authsdk.authcommon.model.ClientConfig r3 = r3.getClientConfig()
            java.lang.String r14 = r3.getClientId()
            zo.a r3 = r18.getTokenState()
            java.lang.String r4 = "riskVisitorId"
            r6 = 0
            java.lang.String r15 = r3.decryptString(r4, r6)
            r16 = 2
            r17 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl r11 = r7.generateSplitLoginRepository(r1, r2)
            androidx.lifecycle.z r12 = new androidx.lifecycle.z
            r12.<init>()
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$Companion r1 = com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginFragment.Companion
            java.lang.String r2 = r19.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.CleanUp r13 = r7.getCleanupHandler(r12, r2)
            r2 = r18
            r3 = r19
            r4 = r12
            r5 = r11
            r14 = r6
            r6 = r13
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment r1 = r1.getFragment(r2, r3, r4, r5, r6)
            android.os.Bundle r2 = r1.getArguments()
            if (r2 != 0) goto L_0x00b0
            goto L_0x00bf
        L_0x00b0:
            com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder r3 = new com.paypal.android.platform.authsdk.authcommon.ObjectWrapperForBinder
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$splitLoginFragment$1$1 r4 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$splitLoginFragment$1$1
            r4.<init>(r7)
            r3.<init>(r4)
            java.lang.String r4 = "tracker_object"
            r2.putBinder(r4, r3)
        L_0x00bf:
            r2 = r8
            com.paypal.android.platform.authsdk.authcommon.Challenge$SplitLogin r2 = (com.paypal.android.platform.authsdk.authcommon.Challenge.SplitLogin) r2
            java.lang.String r3 = r2.getPublicCredential()
            r4 = 0
            if (r3 == 0) goto L_0x00d2
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r3 = r4
            goto L_0x00d3
        L_0x00d2:
            r3 = r10
        L_0x00d3:
            if (r3 != 0) goto L_0x00dd
            java.lang.String r2 = r2.getPublicCredential()
            r7.callVerifyCredential(r11, r2, r12, r8)
            goto L_0x00e6
        L_0x00dd:
            com.paypal.platform.authsdk.AuthProviders r2 = r7.authProviders
            com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter r2 = r2.getAuthPresenter()
            r2.onViewPresentRequested(r1, r4)
        L_0x00e6:
            r0.L$0 = r7     // Catch:{ Exception -> 0x012a }
            r0.L$1 = r8     // Catch:{ Exception -> 0x012a }
            r0.L$2 = r12     // Catch:{ Exception -> 0x012a }
            r0.L$3 = r1     // Catch:{ Exception -> 0x012a }
            r0.label = r10     // Catch:{ Exception -> 0x012a }
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l     // Catch:{ Exception -> 0x012a }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ Exception -> 0x012a }
            r2.<init>(r10, r0)     // Catch:{ Exception -> 0x012a }
            r2.mo72548n()     // Catch:{ Exception -> 0x012a }
            kotlinx.coroutines.d0 r0 = r18.getScope()     // Catch:{ Exception -> 0x012a }
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1 r3 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$handleChallenge$result$1$1     // Catch:{ Exception -> 0x012a }
            r3.<init>(r12, r2, r7, r14)     // Catch:{ Exception -> 0x012a }
            r4 = 3
            kotlinx.coroutines.C19697g.m33468f(r0, r14, r14, r3, r4)     // Catch:{ Exception -> 0x012a }
            java.lang.Object r0 = r2.mo72547l()     // Catch:{ Exception -> 0x012a }
            if (r0 != r9) goto L_0x0110
            return r9
        L_0x0110:
            r2 = r1
            r4 = r7
            r3 = r8
            r1 = r0
        L_0x0114:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult r1 = (com.paypal.android.platform.authsdk.authcommon.ChallengeResult) r1     // Catch:{ Exception -> 0x0040 }
            com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils$Companion r0 = com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils.Companion     // Catch:{ Exception -> 0x0040 }
            boolean r0 = r0.isFragmentAlive(r2)     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x0127
            com.paypal.platform.authsdk.AuthProviders r0 = r4.authProviders     // Catch:{ Exception -> 0x0040 }
            com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter r0 = r0.getAuthPresenter()     // Catch:{ Exception -> 0x0040 }
            r0.onViewDismissRequested(r2, r10)     // Catch:{ Exception -> 0x0040 }
        L_0x0127:
            return r1
        L_0x0128:
            r1 = r2
            goto L_0x012d
        L_0x012a:
            r0 = move-exception
            r4 = r7
            r3 = r8
        L_0x012d:
            com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils$Companion r2 = com.paypal.android.platform.authsdk.authcommon.utils.FragmentUtils.Companion
            boolean r2 = r2.isFragmentAlive(r1)
            if (r2 == 0) goto L_0x013e
            com.paypal.platform.authsdk.AuthProviders r2 = r4.authProviders
            com.paypal.android.platform.authsdk.authcommon.ui.AuthPresenter r2 = r2.getAuthPresenter()
            r2.onViewDismissRequested(r1, r10)
        L_0x013e:
            com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed r1 = new com.paypal.android.platform.authsdk.authcommon.ChallengeResult$Failed
            java.lang.String r2 = r3.getRequestId()
            com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure r3 = new com.paypal.android.platform.authsdk.authcommon.ChallengeError$Failure
            java.lang.Error r0 = r4.toError(r0)
            r3.<init>(r0)
            r1.<init>(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginHandler.handleChallenge(com.paypal.android.platform.authsdk.authcommon.Challenge, kotlin.coroutines.c):java.lang.Object");
    }

    public void handleChallenge(Challenge challenge, HostNavigationController hostNavigationController, C2895z<ChallengeResult> zVar) {
        C19383o.m32797g(challenge, "challenge");
        C19383o.m32797g(hostNavigationController, "hostNavigationController");
        C19383o.m32797g(zVar, "challengeResultLiveData");
    }
}
