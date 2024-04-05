package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaUriData;
import com.paypal.android.platform.authsdk.captcha.p532ui.CaptchaChallengeHandler;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p716xo.C18832d;
import p724yo.C18897a;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$handleCaptchaChallenge$1", mo70541f = "SplitLoginViewModel.kt", mo70542l = {200}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$handleCaptchaChallenge$1 */
public final class SplitLoginViewModel$handleCaptchaChallenge$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CaptchaUriData $challengeUriData;
    public final /* synthetic */ String $requestId;
    public int label;
    public final /* synthetic */ SplitLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginViewModel$handleCaptchaChallenge$1(String str, CaptchaUriData captchaUriData, SplitLoginViewModel splitLoginViewModel, C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1> cVar) {
        super(2, cVar);
        this.$requestId = str;
        this.$challengeUriData = captchaUriData;
        this.this$0 = splitLoginViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginViewModel$handleCaptchaChallenge$1(this.$requestId, this.$challengeUriData, this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginViewModel$handleCaptchaChallenge$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Throwable cause;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Challenge prepareCaptchaChallenge$auth_sdk_thirdPartyRelease = CaptchaChallengeUtils.Companion.prepareCaptchaChallenge$auth_sdk_thirdPartyRelease(this.$requestId, this.$challengeUriData);
            CaptchaChallengeHandler captchaChallengeHandler = new CaptchaChallengeHandler(this.this$0.authHandlerProviders.getAuthCoreComponent(), new C18832d(this.this$0.authHandlerProviders.getAuthProviders().getAuthPresenter()), new C18897a(this.this$0.authHandlerProviders.getAuthProviders().getTrackingDelegate(), this.this$0.authHandlerProviders.getAuthCoreComponent().getClientConfig()));
            this.label = 1;
            obj = captchaChallengeHandler.handleChallenge(prepareCaptchaChallenge$auth_sdk_thirdPartyRelease, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChallengeResult challengeResult = (ChallengeResult) obj;
        SplitLoginViewModel splitLoginViewModel = this.this$0;
        if (challengeResult instanceof ChallengeResult.Completed) {
            splitLoginViewModel.navigateToVerifyEmail();
        } else if (challengeResult instanceof ChallengeResult.Failed) {
            ChallengeResult.Failed failed = (ChallengeResult.Failed) challengeResult;
            ChallengeError error = failed.getError();
            if (error instanceof ChallengeError.Cancelled) {
                Error reason = failed.getError().getReason();
                if (!(reason == null || (cause = reason.getCause()) == null)) {
                    if (C19457k.m33019W0(cause.getMessage(), ConstantsKt.BACK_PRESS, true)) {
                        C19697g.m33468f(C19388s.m32866i0(splitLoginViewModel), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$handleCaptchaChallenge$1$1$1$1(splitLoginViewModel, (C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1$1$1$1>) null), 3);
                    } else {
                        C19697g.m33468f(C19388s.m32866i0(splitLoginViewModel), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$handleCaptchaChallenge$1$1$1$2(splitLoginViewModel, challengeResult, (C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1$1$1$2>) null), 3);
                    }
                }
            } else {
                if (!(error instanceof ChallengeError.Unsupported)) {
                    z = error instanceof ChallengeError.Failure;
                }
                if (z) {
                    C19697g.m33468f(C19388s.m32866i0(splitLoginViewModel), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$handleCaptchaChallenge$1$1$2(splitLoginViewModel, (C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1$1$2>) null), 3);
                }
            }
        } else if (challengeResult instanceof ChallengeResult.UnHandled) {
            C19697g.m33468f(C19388s.m32866i0(splitLoginViewModel), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$handleCaptchaChallenge$1$1$3(splitLoginViewModel, (C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1$1$3>) null), 3);
        }
        return C19394m.f43287a;
    }
}
