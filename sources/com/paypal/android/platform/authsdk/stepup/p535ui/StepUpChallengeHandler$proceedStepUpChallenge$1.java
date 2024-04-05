package com.paypal.android.platform.authsdk.stepup.p535ui;

import com.paypal.android.platform.authsdk.authcommon.Challenge;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler", mo70541f = "StepUpChallengeHandler.kt", mo70542l = {49}, mo70543m = "proceedStepUpChallenge")
/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpChallengeHandler$proceedStepUpChallenge$1 */
public final class StepUpChallengeHandler$proceedStepUpChallenge$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StepUpChallengeHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StepUpChallengeHandler$proceedStepUpChallenge$1(StepUpChallengeHandler stepUpChallengeHandler, C19340c<? super StepUpChallengeHandler$proceedStepUpChallenge$1> cVar) {
        super(cVar);
        this.this$0 = stepUpChallengeHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.proceedStepUpChallenge((Challenge) null, this);
    }
}
