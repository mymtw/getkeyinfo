package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2895z;
import com.paypal.android.platform.authsdk.authcommon.Challenge;
import com.paypal.android.platform.authsdk.authcommon.ChallengeError;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRepository;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeData;
import com.paypal.android.platform.authsdk.stepup.p535ui.StepUpChallengeHandler;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import p716xo.C18832d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$onHandleStepUp$1", mo70541f = "SplitLoginHandler.kt", mo70542l = {370}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginHandler$onHandleStepUp$1 */
public final class SplitLoginHandler$onHandleStepUp$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Challenge $challenge;
    public final /* synthetic */ StepUpChallengeData $challengeUriData;
    public final /* synthetic */ String $email;
    public final /* synthetic */ C2895z<ChallengeResult> $liveData;
    public final /* synthetic */ SplitLoginRepository $repository;
    public Object L$0;
    public int label;
    public final /* synthetic */ SplitLoginHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginHandler$onHandleStepUp$1(Challenge challenge, StepUpChallengeData stepUpChallengeData, SplitLoginHandler splitLoginHandler, SplitLoginRepository splitLoginRepository, String str, C2895z<ChallengeResult> zVar, C19340c<? super SplitLoginHandler$onHandleStepUp$1> cVar) {
        super(2, cVar);
        this.$challenge = challenge;
        this.$challengeUriData = stepUpChallengeData;
        this.this$0 = splitLoginHandler;
        this.$repository = splitLoginRepository;
        this.$email = str;
        this.$liveData = zVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginHandler$onHandleStepUp$1(this.$challenge, this.$challengeUriData, this.this$0, this.$repository, this.$email, this.$liveData, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginHandler$onHandleStepUp$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Challenge challenge;
        Throwable cause;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Challenge prepareStepUpChallenge$auth_sdk_thirdPartyRelease = StepUpChallengeUtils.Companion.prepareStepUpChallenge$auth_sdk_thirdPartyRelease(this.$challenge.getRequestId(), this.$challengeUriData);
            StepUpChallengeHandler stepUpChallengeHandler = new StepUpChallengeHandler(this.this$0.authCoreComponent, new C18832d(this.this$0.authProviders.getAuthPresenter()), this.this$0.iTracker);
            this.L$0 = prepareStepUpChallenge$auth_sdk_thirdPartyRelease;
            this.label = 1;
            Object handleChallenge = stepUpChallengeHandler.handleChallenge(prepareStepUpChallenge$auth_sdk_thirdPartyRelease, this);
            if (handleChallenge == coroutineSingletons) {
                return coroutineSingletons;
            }
            challenge = prepareStepUpChallenge$auth_sdk_thirdPartyRelease;
            obj = handleChallenge;
        } else if (i == 1) {
            challenge = (Challenge) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChallengeResult challengeResult = (ChallengeResult) obj;
        SplitLoginHandler splitLoginHandler = this.this$0;
        SplitLoginRepository splitLoginRepository = this.$repository;
        String str = this.$email;
        C2895z<ChallengeResult> zVar = this.$liveData;
        if (challengeResult instanceof ChallengeResult.Completed) {
            splitLoginHandler.callVerifyCredential(splitLoginRepository, str, zVar, challenge);
        } else if (challengeResult instanceof ChallengeResult.Failed) {
            ChallengeResult.Failed failed = (ChallengeResult.Failed) challengeResult;
            ChallengeError error = failed.getError();
            if (error instanceof ChallengeError.Cancelled) {
                Error reason = failed.getError().getReason();
                if (!(reason == null || (cause = reason.getCause()) == null || C19457k.m33019W0(cause.getMessage(), ConstantsKt.BACK_PRESS, true))) {
                    zVar.postValue(challengeResult);
                }
            } else if (!(error instanceof ChallengeError.Unsupported)) {
                boolean z = error instanceof ChallengeError.Failure;
            }
        } else {
            boolean z2 = challengeResult instanceof ChallengeResult.UnHandled;
        }
        return C19394m.f43287a;
    }
}
